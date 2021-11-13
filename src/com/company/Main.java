package com.company;


import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean AsalSayi(int sayi) {

        for (int i = 2; i < sayi / 2; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();

        int kucukSayi;
        int buyukSayi;

        if (sayi1 > sayi2) {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        } else {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        }
        int sayac = 0;
        double ortalama = 0;

        for (int i = kucukSayi; i < buyukSayi; i++) {

            if (AsalSayi(i) && i > 1) {
                stack.push(i);
                sayac++;
            }

        }
        System.out.print(kucukSayi + " ile " + buyukSayi + " arasındaki asal sayılar: ");
        for (Integer i : stack
        ) {
            System.out.print(i + " ");
        }
        System.out.println("\nEn büyük Asal sayı " + stack.peek());
        for (int i = 0; i < stack.size(); i++) {
            ortalama += stack.pop();
        }
        if (sayac != 0) {
            ortalama /= sayac;
            System.out.println("Asal Sayıların Ortalaması " + ortalama);
        }

    }

}

