package ru.billing.client;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.FoodItem;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		GenericItem a = new GenericItem();
		GenericItem b = new GenericItem();
		GenericItem c = new GenericItem();
		a.setID(000);
		a.setName("Lipstick");
        a.setPrice(13.99F);
        a.setAnalog("Lip gloss");
		b.setID(001);
		b.setName("Black mascara");
        b.setPrice(15.99F);
        b.setAnalog("Brown mascara");
		c.setID(013);
		c.setName("Eye shadow palette");
        c.setPrice(44.99F);
        c.setAnalog("Eyebrow palette");
        System.out.println(a.equals(b));

        FoodItem f1 = new FoodItem();
        FoodItem f2 = new FoodItem();
        f1.setID(89); 
        f1.setName("Rice");
        f1.setExpires(2); 
        f2.setID(91);
        f2.setName("Pasta");
        f2.setExpires(3);
        System.out.println(f1.equals(f2));

        TechnicalItem t1 = new TechnicalItem();
        TechnicalItem t2 = new TechnicalItem();
        t1.getID(125);
        t1.getName("Laptop");
        t1.getWarrantyTime(2);
        t1.printAll();
        t2.getID(150);
        t2.getName("Telephone");
        t2.getWarrantyTime(1);
        t2.printAll();
        System.out.println(t1.equals(t2));

        String line = new String("Конфеты ’Маска’;45;120");
        String[] item_fId = line.split(", ");
        FoodItem f3 = new FoodItem(item_fId[0], Float.parseFloat(item_fId[1]), Short.parseShort(item_fId[2]));

        ItemCatalog item = new ItemCatalog();
        item.addItem(a);
        item.addItem(b);
        item.addItem(c);
        item.addItem(t1);
        item.addItem(t2);
        item.addItem(f1);
        item.addItem(f2);
        item.addItem(f3);

        long begin = new Date().getTime();

        for (int i = 0; i < 100000; i++)
        item.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin)); 
        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            item.findItembyIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));
    }
}