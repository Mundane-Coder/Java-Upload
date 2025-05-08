package com.nie.LostAndFound.ControllerClasses;

import com.nie.LostAndFound.EntityClasses.FoundItem;
import com.nie.LostAndFound.ServiceClasses.FoundItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/found")
public class FoundItemController {

    @Autowired
    private FoundItemService foundItemService;

    @PostMapping("/report")
    public ResponseEntity<FoundItem> reportFoundItem(@RequestBody FoundItem foundItem) {
        return ResponseEntity.ok(foundItemService.reportFoundItem(foundItem));
    }

    @GetMapping("/")
    public ResponseEntity<List<FoundItem>> getAllFoundItems() {
        return ResponseEntity.ok(foundItemService.getAllFoundItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<FoundItem>> getFoundItemById(@PathVariable int id) {
        return ResponseEntity.ok(foundItemService.getFoundItemById(id));
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<FoundItem>> getFoundItemsByStatus(@PathVariable FoundItem.FoundItemStatus status) {
        return ResponseEntity.ok(foundItemService.getFoundItemsByStatus(status));
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countFoundItems() {
        return ResponseEntity.ok(foundItemService.countFoundItems());
    }
}
