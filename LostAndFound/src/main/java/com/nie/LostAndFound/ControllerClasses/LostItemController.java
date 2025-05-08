package com.nie.LostAndFound.ControllerClasses;

import com.nie.LostAndFound.EntityClasses.LostItem;
import com.nie.LostAndFound.ServiceClasses.LostItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/lost")
public class LostItemController {

    @Autowired
    private LostItemService lostItemService;

    @PostMapping("/report")
    public ResponseEntity<LostItem> reportLostItem(@RequestBody LostItem lostItem) {
        return ResponseEntity.ok(lostItemService.reportLostItem(lostItem));
    }

    @GetMapping("/")
    public ResponseEntity<List<LostItem>> getAllLostItems() {
        return ResponseEntity.ok(lostItemService.getAllLostItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<LostItem>> getLostItemById(@PathVariable int id) {
        return ResponseEntity.ok(lostItemService.getLostItemById(id));
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<LostItem>> getLostItemsByStatus(@PathVariable LostItem.LostItemStatus status) {
        return ResponseEntity.ok(lostItemService.getLostItemsByStatus(status));
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countLostItems() {
        return ResponseEntity.ok(lostItemService.countLostItems());
    }
}

