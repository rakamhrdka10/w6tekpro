package aggregation;
import java.util.*;


class Mahasiswa{
    private String nama;
    private String nim;
    private ArrayList<sepatu> shoes;
    
   public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        this.shoes = shoes;
    }
    
    public List<sepatu> getsepatu(){
        return shoes;
    }
    public void setSepatu( ArrayList<sepatu> shoes){
        this.shoes = shoes;
    }
    public String getnim(){
        return nim;
    }
    public String getnama(){
        return nama;
    }
}

class sepatu{
    private String merk;
    private int size;

    
    public sepatu(String merk,int size){
        this.merk = merk;
        this.size = size;
    }
    
    @Override
    public String toString(){
        return "merk sepatu: " + merk + ",  ukuran : " + size;
    }
}
public class Aggregation {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Raka Mahardika","211524056");
        
        sepatu s1 = new sepatu("converse",42);
        sepatu s2 = new sepatu("vans",42);
        
         ArrayList<sepatu> shoe = new ArrayList<sepatu>();
         
         shoe.add(s1);
         shoe.add(s2);
         
         m1.setSepatu(shoe);
         
         System.out.println(m1.getsepatu());
    }
}
