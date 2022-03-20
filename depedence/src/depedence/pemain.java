
package depedence;

public class pemain {
    private String name;
    private String asal;
    private int nopung;
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAsal(){
        return this.asal;
    }

    public void setAsal(String asal){
        this.asal = asal;
    }
    
    public int getNopung(){
        return this.nopung;
    }
    
    public void setNo(int nopung){
        this.nopung=nopung;
    }
    void printPemain(){

        System.out.println("Nama pemain    : " + this.name);
        System.out.println("Nomor punggung : " + this.nopung);
        System.out.println("Asal ssb       : " + this.asal);
        System.out.println("\n");

    }
}