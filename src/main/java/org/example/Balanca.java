package org.example;

public class Balanca {
    public static String Equilibrou(int[] pesos){
        int ladoA = 0;
        int ladoB = 0;

        for (int peso: pesos){
            if (peso < 0){
                throw new IllegalArgumentException();
            }
            if((ladoA + peso) - ladoB <= 5){
                ladoA += peso;
            } else if ((ladoB + peso) - ladoA <= 5) {
                ladoB += peso;
            } else {
                return("N");
            }
        }
        return "S";


    }
}
