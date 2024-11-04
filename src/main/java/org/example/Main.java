package org.example;

public class Main {
    public static void main(String[] args) {
        // İki Point nesnesi oluştur
        Point p1 = new Point(3,4); // İlk nokta
        Point p2 = new Point(0, 0); // İkinci nokta

        // İki nokta arasındaki mesafeyi hesapla
        double mesafe = p1.distance(p2); // p1 ve p2 arasındaki mesafeyi hesaplar

        // Mesafeyi ekrana yazdır
        System.out.println("İki nokta arasındaki mesafe: " + mesafe);
    }

}