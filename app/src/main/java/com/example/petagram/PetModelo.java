package com.example.petagram;

public class PetModelo {
    private String namePet;
    private int picturePet;

    public PetModelo() {
    }

    public PetModelo(String namePet, int picturePet) {
        this.namePet = namePet;
        this.picturePet = picturePet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public int getPicturePet() {
        return picturePet;
    }

    public void setPicturePet(int picturePet) {
        this.picturePet = picturePet;
    }
}
