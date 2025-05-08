package com.nie.LostAndFound.EntityClasses;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Lost_Items")
public class LostItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String itemName;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String category;

    private Date lostDate;

    private String lostLocation;

    @Column(precision = 9, scale = 6)
    private double latitude;

    @Column(precision = 9, scale = 6)
    private double longitude;

    private String imageUrl;

    @Column(columnDefinition = "TEXT")
    private String proofQuestions;

    @Enumerated(EnumType.STRING)
    private LostItemStatus status;

    public enum LostItemStatus {
        Open, Matched, Resolved
    }

    // No-arg constructor
    public LostItem() {
    }

    // All-args constructor
    public LostItem(int itemId, User user, String itemName, String description,
                    String category, Date lostDate, String lostLocation,
                    double latitude, double longitude, String imageUrl,
                    String proofQuestions, LostItemStatus status) {
        this.itemId = itemId;
        this.user = user;
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.lostDate = lostDate;
        this.lostLocation = lostLocation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageUrl = imageUrl;
        this.proofQuestions = proofQuestions;
        this.status = status;
    }

    // Getters and Setters

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getLostDate() {
        return lostDate;
    }

    public void setLostDate(Date lostDate) {
        this.lostDate = lostDate;
    }

    public String getLostLocation() {
        return lostLocation;
    }

    public void setLostLocation(String lostLocation) {
        this.lostLocation = lostLocation;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProofQuestions() {
        return proofQuestions;
    }

    public void setProofQuestions(String proofQuestions) {
        this.proofQuestions = proofQuestions;
    }

    public LostItemStatus getStatus() {
        return status;
    }

    public void setStatus(LostItemStatus status) {
        this.status = status;
    }
}

