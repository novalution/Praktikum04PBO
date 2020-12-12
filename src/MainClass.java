
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args){
        data d = new data();
        Scanner input = new Scanner(System.in);
        while (true){
            d.menu();
            String pilihan = input.nextLine();
            if ("E".equals(pilihan)){
                break;
            }
            switch(pilihan){
                case "A":
                    d.tambah();
                    break;
                case "B":
                    d.hapus();
                    break;
                case "C":
                    d.cari();
                    break;
                case "D":
                    d.tampilkan();
                    break;
            }
        }
    }
}
