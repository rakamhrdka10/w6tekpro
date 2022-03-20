package association;

import java.util.ArrayList;
import java.util.List;

public class Association {
    public static void main(String[] args) throws Exception {
            Mahasiswa m = new Mahasiswa();
            m.setNama("Raka mahardika");

            Sepatu s = new Sepatu();
            s.setMerk("Converse");
            Sepatu s2 = new Sepatu();
            s2.setMerk("Adidas");

            List<Sepatu> baru = new ArrayList<Sepatu>();
            baru.add(s);
            baru.add(s2);

            m.setSepatu(baru);

            System.out.println(m.getSepatu()+" merupakan merk sepatu yang sering dipakai oleh "+m.getName());
 
    }
}
