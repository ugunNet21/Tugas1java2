/*
 3. //Buat sebuah superclass bernama "Employee". 
Kelas ini memiliki variabel "name, address, dan salary". 
a) //Buatlah constructor untuk menginisiasi variabel tersebut. Buat juga //method//
"getter dan setter-nya." 
b) Buat "kelas Staff" yang merupakan subclass dari Employee (tanpa ada penambahan method/variabel). 
c) Buat "kelas Manajer" yang merupakan subclass dari Employee. 
Di kelas ini ada tambahan variabel, yakni bonus. 
Buat method getter/setternya. 
Setelah itu, override method getSalary sehingga jumlah salary Manajer adalah salary + bonus
d) Buat "3 object employee", yakni "1 boss bertipe (Manajer) dan 2 staff bertipe (Staff).
 */
package superclass;

public class Employe {
    String Nama, Alamat;
    int gaji;

    private Employe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void tes(){
        System.out.println("tes");
        
    }

    public Employe(String Nama, String Alamat, int gaji) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.gaji = gaji;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    class employe {
        
    }
    public void bos (){
        
    }
    public void staf (){
        
    }
    

    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===      Gugun Gunawan     ===");
        System.out.println("=======     1842413     ======");
        System.out.println("==============================");
        
        //Employe masukan = new Employe(Nama, Alamat, 20, 30)
        
        Employe b = new Employe();
        Employe c = new Employe();
        Employe dm = new Employe();
        
        b.staf();
        c.staf();
        dm.getAlamat();
        b.getGaji();
        c.getNama();
       
        
    }
    
}
