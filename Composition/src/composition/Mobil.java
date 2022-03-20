
package composition;

public class Mobil {
    private String merk;
    private int tahun;
    private Spek s;
    
    // constructor
    Mobil(String merk, int tahun, Spek s){
        this.merk = merk;
        this.tahun = tahun;
        this.s= s;
    }
    
    Mobil(){
        this.merk = " ";
        this.tahun = 0;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public String toString(){
        return String.format("Merk : %s\nTahun : %d\n%s\n", this.merk, this.tahun, this.s);
    }
}
