
package superclass;



public class Manager extends Employe{
    int bonus;
    
    public Manager(String Nama, String Alamat, int gaji) {
        super(Nama, Alamat, gaji);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        System.out.println("");
        this.bonus = bonus;
    }

    public String getNama() {
        System.out.println("Hasil:"+getBonus());
        return Nama;
    }

    public void setNama(String Nama) {
        System.out.println("hasil"+getGaji());
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        System.out.println("");
        this.Alamat = Alamat;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        System.out.println("");
        this.gaji = gaji;
    }
    /*
    Parameter yang terdapat pada method overriding di subclass harus sama dengan parameter 
    yang terdapat pada parent class.
    Aturan hak akses, hak akses method overriding di subclass tidak boleh lebih ketat di
    bandingkan dengan hak akses method pada parent class.

    */
    
    
    

}

