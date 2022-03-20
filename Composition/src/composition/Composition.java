
package composition;

public class Composition {

   
    public static void main(String[] args) {
    
        System.out.println("Dijual Mobil\n");
     
        Spek spek = new Spek("Turbo", "sugi", "putih");
        Mobil m = new Mobil("Mini cooper", 2022, spek);
        System.out.println(m);
    
        Spek spek1 = new Spek("Tidak ada", "Silinder", "hijau");
        Mobil m2 = new Mobil("z4", 2018, spek1);
        System.out.println(m2);
    }
    
}