
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
        float millas, metros, m = 1852;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de millas");
        millas = sc.nextFloat();
        metros = millas*m;
        System.out.println(millas+" millas = "+metros+" metros");
    }
    
}
