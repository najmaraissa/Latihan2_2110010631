/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author Nazma
 */
public class MahasiwaBeraksi {
   public static void main(String[] args) {  
       Mahasiswa najma = new Mahasiswa("2110010631, Najmaraissa Azhar");
        
       najma.setNama ("Najmaraissa");
       najma.setNpm ("210010631");
       najma.setProdi (TI);
        
        System.out.println("Nama:" + najma.getNama());
        System.out.println("Npm:" + najma.getNpm());
        System.out.println("Prodi:" + najma.getProdi());
   }
}
