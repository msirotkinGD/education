package Interfases;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList furniture = new MyList();
        FurnitureType table = new FurnitureType("Table", 1);
        FurnitureType chair = new FurnitureType("Chair", 2);
        FurnitureType shelf = new FurnitureType("Shelf", 3);

        System.out.println("Adding furniture to the collection...");
        System.out.println("Size before adding any furniture to the collection: " + furniture.size());
        furniture.add(table);
        furniture.add(chair);
        furniture.add(shelf);
        furniture.add(table);
        furniture.add(chair);
        furniture.add(shelf);
        furniture.add(table);
        furniture.add(chair);
        furniture.add(shelf);
        furniture.add(table);
        furniture.add(chair);
        furniture.add(shelf);
        System.out.println("Size after adding any furniture to the collection: " + furniture.size());
        System.out.println();
        System.out.println("Removing one of the furniture from the collection...");
        System.out.println("Size before removing certain furniture from the collection: " + furniture.size());
        furniture.remove(table);
        System.out.println("Size after removing certain furniture from the collection: " + furniture.size());
        System.out.println();
        System.out.println("Converting the collection to an array...");
        System.out.println((furniture.toArray()));


        System.out.println("First Iterator invocation");
        for (Object o : furniture) {
            System.out.println(o);
        }
        System.out.println();

        System.out.println("Second Iterator invocation");
        Iterator iter = furniture.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        if (furniture.contains(chair)) {
            System.out.println("The Furniture collection contains \"Chair\"");
        } else {
            System.out.println("The Furniture collection doesn't contain \"Chair\"");
        }
        if (furniture.contains(table)) {
            System.out.println("The Furniture collection contains \"Table\"");
        } else {
            System.out.println("The Furniture collection doesn't contain \"Table\"");
        }

    }
}
