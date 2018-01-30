package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Įveskite nuvažiuotus km ir kuro sąnaudas");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float ks = sc.nextFloat();
        System.out.println("Vidurkis :" + ks*100/km);
    }
}
