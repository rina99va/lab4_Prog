package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;

    public Date getDate() {
        return dateOfIncome;
    }
    public void setDate(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }
    public short getExpires() {
        return expires;
    }
    public void setExpires(short expires) {
        this.expires = expires;
    }

    public FoodItem (String name, float price, FoodItem analog, Date dateOfIncome, short expires) {
        this.name = name;
        this.price = price;
        this.expires = expires;

    }
    public FoodItem (String name, float price, short expires) {
        this(name, price, null, null, expires);
    }
    public FoodItem (String name) {
        this(name, 0, null, null, (short)0);
    }
    void printAll() {
		System.out.printf("ID: %d , Name: %-20s , price: %5.2f , Category: %-20s , dateOfIncome: %-20s , expires: %d \n", getID(), getName(), getPrice(), getCategory(), getDate(), getExpires());
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        FoodItem f = (FoodItem) o;
        return getPrice() == f.getPrice() &&
               getID() == f.getID() &&
               getAnalog().equals(f.getAnalog()) &&
               getName().equals(f.getName());
    }
    public String toString() {
        return " dateOfIncome = " + dateOfIncome + ", expires = " + expires;
    }
}