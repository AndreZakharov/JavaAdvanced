package module2.task03.first;

import java.util.Arrays;
import java.util.Random;

/**
 * created 21/03/23
 * @author Andre
 */
public class MaxMinInMassive {
    public static void main(String[] args) {
        int[] massiv = new int[20];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            if (i<10){
                massiv[i] = random.nextInt(10);
            }else massiv[i] = random.nextInt(10) * -1;
        }
        Arrays.sort(massiv);

        int maxNegative = massiv[0];
        int minPositive;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > 0 ){
                minPositive = massiv[i];
                massiv[0] = minPositive;
                massiv[i] = maxNegative;
                break;
            }
        }
        //print result
        for (int integer:massiv
        ) {
            System.out.println(integer);
        }

    }
}
