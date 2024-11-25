import java.util.Arrays;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full.");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added: " + disc.getTitle());
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc has been added: " + dvd.getTitle());
            } else {
                System.out.println("The cart is full. Cannot add: " + dvd.getTitle());
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED - 1) { 
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The discs have been added: " + dvd1.getTitle() + " and " + dvd2.getTitle());
        } else {
            System.out.println("The cart is full. Cannot add more.");
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.length == 0) {
            System.out.println("Cart is empty.");
            return;
        }
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed: " + disc.getTitle());
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }

    public double totalCost() {
        double sum = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost(); 
        }
        return sum;
    }
    
    public void searchById(int id) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.getId() == id) {
                System.out.println("DVD found: " + disc);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found DVD. ");
        }
    }


    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.getTitle() == title) { 
                System.out.println("DVD found: " + disc);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found DVD. ");
        }
    }
    
    public void searchByPriceRange(float minPrice, float maxPrice) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.getCost() >= minPrice && disc.getCost() <= maxPrice) {
                System.out.println("DVD found: " + disc);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found DVD. ");
        }
    }

    public void displayCart() {
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.println((i + 1) + ". Title: " + disc.getTitle() +
                    ", Category: " + disc.getCategory() +
                    ", Director: " + disc.getDirector() +
                    ", Length: " + disc.getLength() +
                    ", Cost: " + disc.getCost() + " $");
        }
        System.out.println("Total Cost: " + totalCost());
    }
    
    public void print() {
        System.out.println("****************************CART************************************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + String.format("%.2f", totalCost()) + " $");
        System.out.println("*********************************************************************");
    }

}
