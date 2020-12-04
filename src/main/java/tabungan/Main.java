/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;
import java.util.Scanner;

/**
 *
 * @author 
 * Aris Prabowo
 * IF10K 10119914
 */
public class Main {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.println("===Program Penarikan Uang===");
        System.out.println("Masukan Saldo Awal: ");
        int saldo = keyboard.nextInt();
        System.out.println("Jumlah Uang Yang Diambil: ");
        int jumlah = keyboard.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang: "+tabungan.ambilUang(jumlah));
    }
    
}
