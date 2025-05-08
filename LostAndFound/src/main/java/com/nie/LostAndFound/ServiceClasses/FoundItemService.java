package com.nie.LostAndFound.ServiceClasses;

import com.nie.LostAndFound.EntityClasses.FoundItem;
import com.nie.LostAndFound.RepositoryClasses.FoundItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoundItemService {

    @Autowired
    private FoundItemRepository foundItemRepository;

    public FoundItem reportFoundItem(FoundItem foundItem) {
        return foundItemRepository.save(foundItem);
    }

    public List<FoundItem> getAllFoundItems() {
        return foundItemRepository.findAll();
    }

    public Optional<FoundItem> getFoundItemById(int id) {
        return foundItemRepository.findById(id);
    }

    public List<FoundItem> getFoundItemsByStatus(FoundItem.FoundItemStatus status) {
        return foundItemRepository.findByStatus(status);
    }

    public long countFoundItems() {
        return foundItemRepository.count();
    }
}

