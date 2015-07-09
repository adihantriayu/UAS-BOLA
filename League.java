import java.util.ArrayList;
/**
 * Created by netbook on 7/7/2015.
 */

public class League {
    private String nameLeague;
    ArrayList<Division> daftarDivisi = new ArrayList<Division>();

        //Constructor
    public League(String nameLeague) {
        this.nameLeague = nameLeague;
    }

    public String getNameLeague() {
        return nameLeague;
    }

    public void setNameLeague(String nameLeague) {
        this.nameLeague = nameLeague;
    }

    public ArrayList<Division> getDaftarDivisi() {
        return daftarDivisi;
    }

    public void setDaftarDivisi(Division divisi) {
        this.daftarDivisi.add(divisi);
    }

    public void getDaftarDivisi(String league) {
        for (Division obj:daftarDivisi)
            System.out.println(obj);
    }


    @Override
    public String toString() {
        return "League{" +
                "nameLeague='" + nameLeague + '\'' +
                ", daftarDivisi=" + daftarDivisi +
                '}';
    }
}


