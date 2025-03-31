package org.oslomet.data1700springregister.POJO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//@Setter //lombok to avoid boilerplate code
public class Item {
    public int itemNumber; //incrementing
    public String nameOfItem;
    public String description;
    public String timeStamp; //well have some fun with this one
    public String userCreated;

    public Item(int itemNumber, String nameOfItem, String description, String timeStamp) {
        this.itemNumber = itemNumber;
        this.nameOfItem = nameOfItem;
        this.description = description;
        this.timeStamp = timeStamp;
    }

    public Item() { //DB needs this
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public String getDescription() {
        return description;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }
}
