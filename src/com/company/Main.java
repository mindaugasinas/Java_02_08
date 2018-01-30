package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite nuvaziuota atstuma");

        float Atstumas = sc.nextFloat();

        System.out.println("Iveskite sunaudota kuro kieki");

        float Kuras = sc.nextFloat();

        float Vidurkis = Kuras*100/Atstumas;

        System.out.println("100km. buvo sunaudota " + Vidurkis + " l. degalu" );


    }
}
