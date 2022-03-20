
package composition;

public class Spek {
   
    private String nos;
    private String warna;
    private String knalpot;
    
    Spek(String nos, String warna, String knalpot){
        this.nos = nos;
        this.warna = warna;
        this.knalpot = knalpot;
        
    }
    
    Spek(){
        this.nos = " ";
        this.warna = " ";
        this.knalpot = " ";
        
    }
    
    public String toString(){
        return String.format("nos : %s\nKnalpot : %s\nwarna : %s", this.nos, this.knalpot, this.warna);
    }
}

