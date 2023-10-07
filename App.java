/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._buketugurlu_veriyapilari_vize;

/**
 *
 * @author huawei
 */
import java.util.Scanner;
public class App {
    static void balonPozisyonuBul(int m, int n) {
        //Dairesel bağlı listeyi oluşturdum.
        Node head = new Node(1);
        Node new_node = head;
        for (int i = 2; i <= n; i++) {
            new_node.next = new Node(i);
            new_node = new_node.next;
        }
        //Bağlantıyı dairesel hale getirdim.
        new_node.next = head; 

        // son balonu bulmak için 
        while (new_node.next != new_node) {
            //M-1 adet balon atlayarak M. balonu patlatma
            for (int i = 0; i < m - 1; i++) {
                new_node = new_node.next;
            }
            // M. balonu patlatma
            new_node.next = new_node.next.next; 
        }
        // Son kalan balonun pozisyonunu yazdırma
        System.out.println("Son kalan balonun pozisyonu: " + new_node.data);
    }

    public static void main(String[] args) {
        //Kullanıcıdan integer bir değer alabilmek için Scanner sınıfını kullandım.
        Scanner new_scanner = new Scanner(System.in);
        System.out.print("N degerini giriniz: ");
        int n = new_scanner.nextInt();
        System.out.print("M degerini giriniz: ");
        int m = new_scanner.nextInt();
        balonPozisyonuBul(m, n);
        new_scanner.close();
    }
}
