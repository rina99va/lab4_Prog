package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {
    private short warrantyTime;
    public short getWarrantyTime() {
        return warrantyTime;
    }
    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    void printAll() {
		System.out.printf("ID: %d , Name: %-20s , price: %5.2f , Category: %-20s , warrantyTime: %d \n", getID(), getName(), getPrice(), getCategory(), getWarrantyTime());
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        TechnicalItem t = (TechnicalItem) o;
        return getPrice() == t.getPrice() &&
               getID() == t.getID() &&
               getAnalog().equals(t.getAnalog()) &&
               getName().equals(t.getName());
    }
}