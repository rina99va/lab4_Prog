package ru.billing.stocklist;

public class GenericItem {
	private int ID;
	private String name;
    private float price;
    private String analog;
    private int currentID;
    private Category category = Category.GENERAL;

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getAnalog() {
        return analog;
    }
    public void setAnalog(String analog) {
        this.analog = analog;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public int getCurrentID() {
        return currentID;
    }
    public void setCurrentID(int currentID) {
        this.currentID = currentID;
    }

    public GenericItem (String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.ID = currentID++;
    }
    public GenericItem (String name, float price, GenericItem analog) {
        this.ID = currentID++;
    }
    public GenericItem (){
        this.ID = currentID++;
    }
	void printAll() {
		System.out.printf("ID: %d , Name: %-20s , price: %5.2f , Category: %-20s \n", getID(), getName(), getPrice(), getCategory());
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenericItem g = (GenericItem) o;
        return price == g.price &&
               ID == g.ID &&
               analog.equals(g.analog) &&
               name.equals(g.name);
    }
    public String toString() {
        return "Item №: " +
                "ID = " + ID +
                ", name = " + name + '\'' +
                ", price = " + price +
                ", category = " + category;
    }
}