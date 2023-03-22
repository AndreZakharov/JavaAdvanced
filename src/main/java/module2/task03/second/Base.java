package module2.task03.second;

import module2.task03.second.sweets.Candy;
import module2.task03.second.sweets.Jellybean;
import module2.task03.second.sweets.Sweets;

/**
 * created 22/03/23
 * @author Andre
 */
public class Base {

    public static void main(String[] args) {
        Candy candy1 = new Candy("Bear",0.5,399.90,"Max");
        Candy candy2 = new Candy("martin",0.3,199.90,"Min");
        Jellybean jellybean = new Jellybean("Hubba bubba",0.05,45.50,"Сherry");
        Candy candy3 = new Candy();
        Sweets[] boxOfSweets = {candy1, candy2, jellybean, candy3};
        double totalWeight = 0.;
        double totalPrice = 0.;
        for (Sweets sweets: boxOfSweets
             ) {
            totalWeight += sweets.getWeight();
            totalPrice += sweets.getPrice();
            System.out.println(sweets.toString());
        }
        System.out.println("Total weight = " + totalWeight);
        System.out.println("Total price = " + totalPrice);

    }
}
