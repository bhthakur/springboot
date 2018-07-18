package com.rishi.dto;

import com.rishi.domain.Hotel;

public class HotelDto {
    private long id;
    private String name;
    private int classification;
    private boolean isOpen;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public static HotelDto toDto(Hotel entity) {
        HotelDto dto= new HotelDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setClassification(entity.getClassification());
        dto.setOpen(entity.isOpen());
        return  dto;
    }
}
