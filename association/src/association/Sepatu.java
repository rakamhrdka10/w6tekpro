
package association;

public class Sepatu {

    private String merk;

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public String toString(){
        return merk;
    }
}
