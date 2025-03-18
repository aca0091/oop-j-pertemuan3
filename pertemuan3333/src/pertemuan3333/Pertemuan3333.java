/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3333;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author ACA2301010091
 * TGL 18 MARET 2025
 */
public class Pertemuan3333 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nama="";
       String kelas="";
       String noAbsen="";
       int nilai = 0;
       
       BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
       
       try{
       System.out.print("Input nama siswa: ");
       nama = dtIN.readLine();
       
       System.out.print("Input Kelas: ");
       kelas = dtIN.readLine();
       
       System.out.print("Input Nilai: ");
       nilai = Integer.parseInt( dtIN.readLine());
       
       }catch(IOException err){
           System.out.println("Error baca keybloard");
       }
       String ket="Tidak Lulus";
       
       noAbsen = JOptionPane.showInputDialog("Input Data Absen: ");
       
       if(nilai>60){
           ket = "Lulus";
       }
      System.out.printf("Nama Siswa %s dari kelas %s dengan nilai %d dinyatakan %s",nama,kelas,nilai,ket);
    }
    
}
