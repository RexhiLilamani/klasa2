package org.example;

public class NumratCift {
    public static void main(String[] args) {
        int vector[] = {11, 21, 32, 41, 54, 6, 75, 8, 91, 10, 0}

        for (int i = 0; i< vector.length;i++){
            if (vector[i]% 2 == 0) {
                System.out.println("Numri eshte cift " + " " + vector[i]);
            } else if (vector [i] % 2 ==1){
                System.out.println("Numri eshte cift " + " " + vector[i]);
              else if (vector [i] == 0){
                  System.out.println("Numri eshte cift " + " " + vector[i]);
                }
            }
        }
    }
}
