package Atividade;

import java.util.Scanner;

public class questão5 {

    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);

        double A, B;

        A = enterScanner.nextDouble();
        B = enterScanner.nextDouble();
        double MEDIA;
        MEDIA = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA =%.5f", MEDIA);


    }


}