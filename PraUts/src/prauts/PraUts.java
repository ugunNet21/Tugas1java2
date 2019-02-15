/*
//descending
2. Buat program yang dapat "menemukan tiga nilai terbesar"  ..no 2 dulu yaaa
 - (ditulis dari yang "terbesar ke terkecil")
 ** pakai array**
 - dari "8" nilai yang diinputkan.
Contoh: nilai yang dimasukkan: 
 [23, 24, 9, 5, 20, 22, 43,33]
maka outputnya:
   43
     33
    24
catatan: input nilai dipisahkan dengan spasi 
*/
package prauts;

import java.util.Scanner;

public class PraUts {
    
    
    public static void main(String[] args) {
         int angka1 =20, angka2=30, angka3=40, angka4=60, angka5=80, angka6=90, angka7=75, angka8=100;
         Scanner angka =new Scanner(System.in);
         
        System.out.println("==============================");
        System.out.println("     Nama   : Gugun Gunawan   ");
        System.out.println("     NPM    : 1842413         ");
        System.out.println("==============================");
        
        angka1=angka.nextInt();
        angka2=angka.nextInt();
        angka3=angka.nextInt();
        angka4=angka.nextInt();
        angka5=angka.nextInt();
        angka6=angka.nextInt();
        angka7=angka.nextInt();
        angka8=angka.nextInt();
        
        
        if (angka1>= angka2 && angka1>=angka3){
            System.out.println(angka1+": adalah yang terbesar");
        }
        else if (angka2 >=angka1 && angka2 >=angka3){
            System.out.println(angka2+":adalah yang terrbesar");
        }
        else {
            System.out.println(angka3 +": adalah yang terbesar");
        }
        
    }
    
        
    }
    

