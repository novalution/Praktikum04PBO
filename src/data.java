/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Date;  
import java.util.GregorianCalendar;
public class data {
    Scanner input = new Scanner(System.in);
    ArrayList<String> nim = new ArrayList<>();
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<Date> tgl = new ArrayList<>();
    ArrayList<Integer> gdr = new ArrayList<>();
    
    void menu(){
        System.out.println("------------------");
        System.out.println("    Olah Data");
        System.out.println("------------------");
        System.out.println("Menu: ");
        System.out.println("A.Tambah data");
        System.out.println("B.Hapus data");
        System.out.println("C.Cari data");
        System.out.println("D.Tampilkan data");
        System.out.println("E.Keluar");
        System.out.print("Masukan pilihan anda : ");
    }
    
    void tambah(){
        System.out.println("-------------------");
        System.out.println("    Tambah Data");
        System.out.println("-------------------");
        System.out.print("Masukan NIM mahasiswa yang ingin ditambahkan : ");
        String nomor = input.nextLine();
        System.out.print("Masukan Nama mahasiswa yang ingin ditambahkan : ");
        String namas = input.nextLine();
        System.out.print("Masukan Tahun Lahir mahasiswa yang ingin ditambahkan : ");
        int tahun = input.nextInt();
        System.out.print("Masukan Bulan Lahir mahasiswa yang ingin ditambahkan : ");
        int bulan = input.nextInt();
        System.out.print("Masukan Hari Lahir mahasiswa yang ingin ditambahkan : ");
        int hari = input.nextInt();
        Date tanggal = new GregorianCalendar(tahun, bulan - 1, hari).getTime();
        System.out.print("Masukan gender mahasiswa yang ingin ditambahkan (0: Laki-laki, 1: Perempuan) : ");
        int gender = input.nextInt();
        nim .add(nomor);
        nama.add(namas);
        tgl.add(tanggal);
        gdr.add(gender);
        System.out.println("Data telah ditambahkan");
    }
    
    void hapus(){
        System.out.println("------------------");
        System.out.println("    Hapus Data");
        System.out.println("------------------");
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nomor = input.next();
        int idx;
        idx = Collections.binarySearch(nim, nomor);
        nim.remove(idx);
        nama.remove(idx);
        tgl.remove(idx);
        gdr.remove(idx);
        
    }
    
    void cari(){
        System.out.println("-----------------");
        System.out.println("    Cari Data");
        System.out.println("-----------------");
        System.out.println("1. Cari data berdasarkan jenis kelamin");
        System.out.println("2. Cari data berdasarkan NIM");
        System.out.print("Pilihan anda : ");
        int pilih = input.nextInt();
        if(pilih == 1){
            System.out.println("-------------------------");
            System.out.println("Berdasarkan Jenis Kelamin");
            System.out.println("-------------------------");
            System.out.print("Pilih gender (0 / 1) : ");
            int kelamin = input.nextInt(); 
            
            for ( int i = 0; i < nama.size(); i++) {
                SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
                if (gdr.get(i) == 0){
                    System.out.println("NIM : " + nim.get(i));
                    System.out.println("Nama : " + nama.get(i));
                    System.out.println("Tanggal Lahir : " + format.format(tgl.get(i)));
                    System.out.println("Gender : " + gdr.get(i));
                    System.out.println("-----------------------");
                } else if (gdr.get(i) == 1){
                    System.out.println("NIM : " + nim.get(i));
                    System.out.println("Nama : " + nama.get(i));
                    System.out.println("Tanggal Lahir : " + format.format(tgl.get(i)));
                    System.out.println("Gender : " + gdr.get(i));
                }
            }
        }
        else if(pilih == 2){
            System.out.println("------------------");
            System.out.println("Berdasarkan NIM");
            System.out.println("------------------");
            System.out.print("Masukkan NIM : ");
            String nomor = input.next();
            int idx = Collections.binarySearch(nim, nomor);

            String cariNama = nama.get(idx);
            String cariNIM = nim.get(idx);
            Date tglLahir  = tgl.get(idx);
            int cariGender = gdr.get(idx);
            SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
            System.out.println("NIM : " + cariNIM);
            System.out.println("Nama : " + cariNama);
            System.out.println("Tanggal Lahir : " + format.format(tglLahir));
            System.out.println("Gender : " + cariGender);
        }
    }

    
    void tampilkan(){
        System.out.println("------------------");
        System.out.println("Tampilkan Data");
        System.out.println("------------------");
        for ( int i = 0; i < nama.size(); i++) {
            SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
            System.out.println("NIM : " + nim.get(i));
            System.out.println("Nama : " + nama.get(i));
            System.out.println("Tanggal Lahir : " + format.format(tgl.get(i)));
            System.out.println("Gender : " + gdr.get(i));
            System.out.println("-----------------------");
        }   System.out.println("Jumlah mahasiswa : " + nama.size());
    }
}
