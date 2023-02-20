/*
* File: MainConsole.java
* Author: Laczkó Henrietta
* Copyright: 2023, Laczkó Henrietta
* Group: Szoft I-I-N
* Date: 2023-02-20
* Github: https://github.com/LHENI/Dolgozat-f0354.git
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        this.about();
        System.out.println("Feladat 301");
        System.out.println("-----------");
        String aStr = input("A-oldal:");
        String bStr = input("B-oldal:");
        double sideA = Double.parseDouble(aStr);
        double sideB = Double.parseDouble(bStr);
        Area cone = new Area();
        System.out.println("Terület");
        System.out.println(cone.calcArea(sideA, sideB));
    }
    public String input(String m){
        Scanner scanner = new Scanner(System.in);
        System.out.print(m + " ");
        String text = scanner.nextLine();
        return text;
    }
    public void about(){
        System.out.println("---------------------------------------");
        System.out.println("Laczkó Henrietta");
        System.out.println("Szoft I-I N");
        System.out.println("2023-02-20");
        System.out.println("---------------------------------------");
    }
}
