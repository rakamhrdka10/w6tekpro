
package depedence;

public class Depedence {

    public static void main(String[] args) {
   
        
        // Instansiasi Objek 1
        pemain p1 = new pemain();
        p1.setName("Lionel Gian");
        p1.setAsal("Ciwaruga");
        p1.setNo(10);
        System.out.println("Seleksi pemain timnas");
        System.out.println("======================");
        p1.printPemain();
        
        // Instansiasi Objek 1
        pemain p2 = new pemain();
        p2.setName("Cristiano Atep ");
        p2.setAsal("Sukajadi");
        p2.setNo(8);
        
        p2.printPemain();
    }
   
}
    
    

