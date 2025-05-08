package com.nie.LostAndFound.EntityClasses;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Found_Items")
public class FoundItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foundId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String itemName;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String category;

    private Date foundDate;

    private String foundLocation;

    @Column(precision = 9, scale = 6)
    private double latitude;

    @Column(precision = 9, scale = 6)
    private double longitude;

    private String imageUrl;

    @Enumerated(EnumType.STRING)
    private FoundItemStatus status;

    public enum FoundItemStatus {
        Open, Matched, Returned
    }

    // No-arg constructor
    public FoundItem() {
    }

    // All-args constructor
    public FoundItem(int foundId, User user, String itemName, String description,
                     String category, Date foundDate, String foundLocation,
                     double latitude, double longitude, String imageUrl,
                     FoundItemStatus status) {
        this.foundId = foundId;
        this.user = user;
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.foundDate = foundDate;
        this.foundLocation = foundLocation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    // Getters and Setters

    public int getFoundId() {
        return foundId;
    }

    public void setFoundId(int foundId) {
        this.foundId = foundId;
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

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public String getFoundLocation() {
        return foundLocation;
    }

    public void setFoundLocation(String foundLocation) {
        this.foundLocation = foundLocation;
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

    public FoundItemStatus getStatus() {
        return status;
    }

    public void setStatus(FoundItemStatus status) {
        this.status = status;
    }
}
