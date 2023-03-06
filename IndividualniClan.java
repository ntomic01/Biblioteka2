import java.util.Date;

public class IndividualniClan extends Clan implements Blabla {

   private String ime;
   private String prezime;
   private TipUplateClanarine tipUplateClanarine;


    public IndividualniClan(float godisnjaClanarina, String clanskiBroj, Date datumUclanjenja, String adresa, String ime, String prezime, double popust, TipUplateClanarine tipUplateClanarine) {
        super(godisnjaClanarina, clanskiBroj, datumUclanjenja, adresa, popust, tipUplateClanarine);
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }


    @Override
    public void obracunajClanarinu(double popust, int godisnjaClanarina) {
        // ako je godisnja clanarina manja od 100000 dinara , tada se na nju dobija 20 posto popusta!
        if(getGodisnjaClanarina()<=100000){
            popust = godisnjaClanarina * 0.2;
            System.out.println(" Posto je clanarina manja od 100000 dinara, popust vam je " + popust);
        }

    }


    @Override
    public TipUplateClanarine trenutniTipUplate() {
        return tipUplateClanarine;
    }

    @Override
    public void promeniRezimUplate() {

        if(tipUplateClanarine == TipUplateClanarine.elektronski){
            tipUplateClanarine = TipUplateClanarine.uplataNaBankomatu;
        }
        else {
            tipUplateClanarine = TipUplateClanarine.elektronski;
        }

    }
}

