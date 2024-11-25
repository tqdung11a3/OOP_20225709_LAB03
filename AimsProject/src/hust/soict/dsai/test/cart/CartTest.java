package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        dvd1.setId(1);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        dvd2.setId(2);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        dvd3.setId(3);
        cart.addDigitalVideoDisc(dvd3);

        cart.print();

        System.out.println("Search by Price Range:");
        cart.searchByPriceRange(18.00f, 20.00f);
        cart.searchByPriceRange(25.00f, 30.00f);
        
        System.out.println("Search by Title:");
        cart.searchByTitle("Aladdin");
    }
}
