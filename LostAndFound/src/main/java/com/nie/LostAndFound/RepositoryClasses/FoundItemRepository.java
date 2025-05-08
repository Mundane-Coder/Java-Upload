package com.nie.LostAndFound.RepositoryClasses;

import com.nie.LostAndFound.EntityClasses.FoundItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoundItemRepository extends JpaRepository<FoundItem, Integer> {
    List<FoundItem> findByStatus(FoundItem.FoundItemStatus status);
}
