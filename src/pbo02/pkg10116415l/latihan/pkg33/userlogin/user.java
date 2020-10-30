/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10116415l.latihan.pkg33.userlogin;

/**
 *
 * @author Frda
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * User Login
 */
class user {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String userName,String password){
        if (userName.equals(username)){
            statusAkun = true;           
        }
        else if ( password.equals(password)){
             statusAkun = false;  
        } 
        else{
            statusAkun = false;
        }
         return statusAkun;
       

}
    private void hasilLogin(boolean statusAkun, String userName){
        if(statusAkun){
            System.out.println("*****Hallo " + userName.toUpperCase() 
                                + "*****");
            System.out.println("Selamat Datang di Applikasi ini");
        }
        else {
            System.out.println("Oooppss,Username atau Password Anda salah");
        }
        }
    

    public void pengecekanLogin(String userName, String password){
        System.out.println(cekAkun(userName, password));
        hasilLogin(statusAkun, userName);
    }
}
    