package com.nie.LostAndFound.RepositoryClasses;

import com.nie.LostAndFound.EntityClasses.LostItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LostItemRepository extends JpaRepository<LostItem, Integer> {
    List<LostItem> findByStatus(LostItem.LostItemStatus status);
}

