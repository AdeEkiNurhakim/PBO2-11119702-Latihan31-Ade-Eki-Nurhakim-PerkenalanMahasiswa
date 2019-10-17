/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkenalanmahasiswa;

/**
 *
 * @author Ekiw
 */
public class PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PerkenalanDiri perkenalandiri  = new PerkenalanDiri();
         perkenalandiri.setnim1("10110269");
         perkenalandiri.setnama1("Rizki Adam Kurniawan");
         
         perkenalandiri.setnim2("10110270");
         perkenalandiri.setnama2("Indra Tiola");
         
         perkenalandiri.setnim3("10110271");
         perkenalandiri.setnama3("Rubi Tensil Tanafi");
         
         perkenalandiri.setnim4("10110269");
         perkenalandiri.setnama4("Muhammad Nur Awaludin");
         
         System.out.println("Hallo Everyone");
         System.out.println("My NIM is : "+perkenalandiri.getnim1());
         System.out.println("My Name is : "+perkenalandiri.getnama1());
          System.out.println("");
         System.out.println("Hallo Everyone");
         System.out.println("My NIM is : "+perkenalandiri.getnim2());
         System.out.println("My Name is : "+perkenalandiri.getnama2());
          System.out.println("");
         System.out.println("Hallo Everyone");
         System.out.println("My NIM is : "+perkenalandiri.getnim3());
         System.out.println("My Name is : "+perkenalandiri.getnama3());
          System.out.println("");
         System.out.println("Hallo Everyone");
         System.out.println("My NIM is : "+perkenalandiri.getnim4());
         System.out.println("My Name is : "+perkenalandiri.getnama4());
         System.out.println("");
         
         
    }
    
}
