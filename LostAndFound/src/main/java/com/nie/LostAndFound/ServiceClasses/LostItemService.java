package com.nie.LostAndFound.ServiceClasses;

import com.nie.LostAndFound.EntityClasses.LostItem;
import com.nie.LostAndFound.RepositoryClasses.LostItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LostItemService {

    @Autowired
    private LostItemRepository lostItemRepository;

    public LostItem reportLostItem(LostItem lostItem) {
        return lostItemRepository.save(lostItem);
    }

    public List<LostItem> getAllLostItems() {
        return lostItemRepository.findAll();
    }

    public Optional<LostItem> getLostItemById(int id) {
        return lostItemRepository.findById(id);
    }

    public List<LostItem> getLostItemsByStatus(LostItem.LostItemStatus status) {
        return lostItemRepository.findByStatus(status);
    }

    public long countLostItems() {
        return lostItemRepository.count();
    }
}

