package ru.netology.sqr.HomeWork6;

public class SQRService {

    public int calcSQR (int x, int y) {
        int amount =0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                //System.out.println(amount);
                amount++;
            }
        }
        return amount;
    }
}
