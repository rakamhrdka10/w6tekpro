
package association;
import java.util.List;

public class Mahasiswa {
    private String nama;
    List<Sepatu> shoes;
    
    public String getName(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public List<Sepatu> getSepatu() {
        return shoes;
    }
    public void setSepatu(List<Sepatu> shoes) {
        this.shoes = shoes;
    }
}
