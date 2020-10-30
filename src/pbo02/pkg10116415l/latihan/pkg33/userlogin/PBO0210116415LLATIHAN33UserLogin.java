/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10116415l.latihan.pkg33.userlogin;

import java.util.Scanner;

/**
 *
 * @author Frda
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * User Login
 */
public class PBO0210116415LLATIHAN33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         user login = new user();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Username: ");
        String user = scanner.next();
        System.out.println("Masukan Password: ");
        String password = scanner.next();
        System.out.println("");
        
        login.pengecekanLogin(user, password);
        // TODO code application logic here
    }
    
}
