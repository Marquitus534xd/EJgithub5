/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejgithub5;

import java.util.Scanner;

public class EJgithub5 {
public static void main(String[] args) {
        int numero3;
        Scanner llegir = new Scanner(System.in);
        System.out.println ("Digues un numero entre el 1 i el 10");     
        System.out.println ("Introdueix un numero: ");
        int numero;
        int randomNum = (int)(Math.random() * 11);  // 0 to 10
        do {
        numero = llegir.nextInt();
        System.out.println ("Has esollit el numero : "+ numero);
        }while (!(numero == randomNum));
        System.out.println ("Has encertat ole tu");
} 
}
