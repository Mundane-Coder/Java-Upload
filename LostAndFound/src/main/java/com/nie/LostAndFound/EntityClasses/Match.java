package com.nie.LostAndFound.EntityClasses;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    @ManyToOne
    @JoinColumn(name = "lost_item_id", nullable = false)
    private LostItem lostItem;

    @ManyToOne
    @JoinColumn(name = "found_item_id", nullable = false)
    private FoundItem foundItem;

    private LocalDateTime matchDate = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private MatchStatus status = MatchStatus.Pending;

    private boolean verifiedByAdmin = false;

    public enum MatchStatus {
        Pending, Verified, Closed
    }

    // No-arg constructor
    public Match() {
    }

    // All-args constructor
    public Match(int matchId, LostItem lostItem, FoundItem foundItem,
                 LocalDateTime matchDate, MatchStatus status, boolean verifiedByAdmin) {
        this.matchId = matchId;
        this.lostItem = lostItem;
        this.foundItem = foundItem;
        this.matchDate = matchDate;
        this.status = status;
        this.verifiedByAdmin = verifiedByAdmin;
    }

    // Getters and Setters

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public LostItem getLostItem() {
        return lostItem;
    }

    public void setLostItem(LostItem lostItem) {
        this.lostItem = lostItem;
    }

    public FoundItem getFoundItem() {
        return foundItem;
    }

    public void setFoundItem(FoundItem foundItem) {
        this.foundItem = foundItem;
    }

    public LocalDateTime getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDateTime matchDate) {
        this.matchDate = matchDate;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public boolean isVerifiedByAdmin() {
        return verifiedByAdmin;
    }

    public void setVerifiedByAdmin(boolean verifiedByAdmin) {
        this.verifiedByAdmin = verifiedByAdmin;
    }
}
