package com.nie.LostAndFound.ServiceClasses;

import com.nie.LostAndFound.EntityClasses.FoundItem;
import com.nie.LostAndFound.EntityClasses.LostItem;
import com.nie.LostAndFound.EntityClasses.Match;
import com.nie.LostAndFound.RepositoryClasses.FoundItemRepository;
import com.nie.LostAndFound.RepositoryClasses.LostItemRepository;
import com.nie.LostAndFound.RepositoryClasses.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private LostItemRepository lostItemRepository;

    @Autowired
    private FoundItemRepository foundItemRepository;

    public void autoMatchItems() {
        List<LostItem> lostItems = lostItemRepository.findByStatus(LostItem.LostItemStatus.Open);
        List<FoundItem> foundItems = foundItemRepository.findByStatus(FoundItem.FoundItemStatus.Open);

        for (LostItem lost : lostItems) {
            for (FoundItem found : foundItems) {
                if (isMatch(lost, found)) {
                    Match match = new Match();
                    match.setLostItem(lost);
                    match.setFoundItem(found);
                    matchRepository.save(match);

                    lost.setStatus(LostItem.LostItemStatus.Matched);
                    found.setStatus(FoundItem.FoundItemStatus.Matched);
                    lostItemRepository.save(lost);
                    foundItemRepository.save(found);
                }
            }
        }
    }

    private boolean isMatch(LostItem lost, FoundItem found) {
        boolean categoryMatch = lost.getCategory().equalsIgnoreCase(found.getCategory());
        boolean locationClose = haversine(lost.getLatitude(), lost.getLongitude(),
                found.getLatitude(), found.getLongitude()) < 1.0;
        return categoryMatch && locationClose;
    }

    // Haversine formula to check if within 1 km radius
    private double haversine(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Earth radius in km
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        return R * 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    }

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }
}
