package Interfases;

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

        /*System.out.println("Converting collection to an array...");
        furniture.toArray();
        System.out.println(furniture);
        System.out.println();

        System.out.println("Deleting Chair from the collection...");
        furniture.remove(chair);
        System.out.println(furniture);
        System.out.println();

        System.out.println("First Iterator invocation");
        for (Object o : furniture) {
            System.out.println(o);
        }
        System.out.println();

        System.out.println("Second Iterator invocation");
        Iterator<FurnitureType> iter = new MyList().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        if (furniture.contains(table)) {
            System.out.println("The Furniture collection contains \"Table\"");
        }*/

    }
}
