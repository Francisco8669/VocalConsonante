
package vocalconsonante;

import java.util.Scanner;


public class VocalConsonante {
    public static void main(String[] args) {
        //char ch = args[0].charAt(0);
        char car;
        String aux;
        Scanner sc = new Scanner(System.in);
        do  {
            aux = sc.next().toLowerCase();
            car = aux.charAt(0);
            if (car != 'q') {
                if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'){
                    System.out.println("Es vocal");
                } 
                else {
                    if(car == '1' || car == '2' || car == '3' || car == '4' || car == '5' || car == '6' || car == '7' || car == '8' || car == '9' || car == '0' ){
                        System.out.println("No es vocal, ni consonante");
                    }
                    else{
                        System.out.println("Es consonante");
                    }
                }
            }
        } while  (car != 'q');
    }
}