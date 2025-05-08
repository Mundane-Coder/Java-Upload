package com.nie.LostAndFound.ControllerClasses;

import com.nie.LostAndFound.EntityClasses.Match;
import com.nie.LostAndFound.ServiceClasses.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping("/auto")
    public ResponseEntity<String> triggerAutoMatch() {
        matchService.autoMatchItems();
        return ResponseEntity.ok("Auto-matching triggered.");
    }

    @GetMapping("/")
    public ResponseEntity<List<Match>> getAllMatches() {
        return ResponseEntity.ok(matchService.getAllMatches());
    }
}

