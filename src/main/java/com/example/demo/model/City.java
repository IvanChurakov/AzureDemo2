package com.example.demo.model;

import jakarta.persistence.*;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "city")
public class City implements Comparable<City> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_id")
    private UUID cityId;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "created_at")
    private Date createdAt;

    public City() {

    }
    public City(String displayName) {
        this.cityId = UUID.randomUUID();
        this.displayName = displayName;
    }

    public UUID getCityId() {
        return cityId;
    }

    public void setCityId(UUID cityId) {
        this.cityId = cityId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public int compareTo(City otherCity) {
        return displayName.compareTo(otherCity.displayName);
    }
}
