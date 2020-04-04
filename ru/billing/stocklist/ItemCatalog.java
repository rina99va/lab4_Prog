package ru.billing.stocklist;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

//import sun.net.www.content.text.Generic;

public class ItemCatalog extends GenericItem {
    private HashMap<Integer, GenericItem> catalog = new Hashmap<Integer, GenericItem> ();
    private ArrayList<GenericItem> ALCatalog = new Arraylist<GenericItem>();
    public void addItem(GenericItem item) {
        catalog.put(item.getID(), item);
        ALCatalog.add(item);
    }
    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }
    public GenericItem findItemByID(int id) {
        if(!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }
    public GenericItem findItembyIDAL (int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id) return i;
        }
        return null;
    }
}
