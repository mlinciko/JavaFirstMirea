package ru.mirea.task3.opt2;

public class Hand {
    private String type;
    private float sizeOfRingFinger;
    public Hand(){
        this.type = "right";
        this.sizeOfRingFinger = 16;
    }
    public Hand(String type, float sizeOfRingFinger){
        this.type = type;
        this.sizeOfRingFinger = sizeOfRingFinger;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSizeOfRingFinger(int sizeOfRingFinger){
        this.sizeOfRingFinger = sizeOfRingFinger;
    }
    public String getType(){
        return this.type;
    }
    public float getSizeOfRingFinger(){
        return this.sizeOfRingFinger;
    }
    public String toString(){
        return "Hand "+ this.type + ": Size of a ring finger "+ this.sizeOfRingFinger;
    }
}
