import java.util.ArrayList;
/**
 * Created by netbook on 7/7/2015.
 */
public class Division {
    private String nameDivision;
    private League league;
    ArrayList<Club> daftarClub = new ArrayList<Club>();

    //Constructor

    public Division(String nameDivision, League league) {
        this.nameDivision = nameDivision;
        this.league = league;
    }

    //Setter Getter

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setDaftarClub(Club club) {
        this.daftarClub.add(club);
    }

    public ArrayList<Club> getDaftarClub() {
        return daftarClub;
    }
    //2
    public void getDaftarClubLeague (String League){
        for (Club obj:daftarClub)
            System.out.println(obj);
    }

    //3
    public void getDaftarClubDivision(String Division)
    {
        for (Club obj:daftarClub)
            System.out.println(obj);
    }

    //toString

    @Override
    public String toString() {
        return "Division{" +
                "nameDivision='" + nameDivision + '\'' +
                '}';
    }
}
