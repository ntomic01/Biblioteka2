import java.util.Date;

public class KolektivniClan extends Clan implements Blabla  {

    private String naziv;
    private TipUplateClanarine tipUplateClanarine;

    public KolektivniClan(float godisnjaClanarina, String clanskiBroj, Date datumUclanjenja, String adresa, String naziv, double popust, TipUplateClanarine tipUplateClanarine) {
        super(godisnjaClanarina, clanskiBroj, datumUclanjenja, adresa, popust,tipUplateClanarine);
        this.naziv = naziv;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


    @Override
    public void obracunajClanarinu(double popust, int godisnjaClanarina) {
        // ako je godisnja clanarina za Firme preko 150000 dinara, dobija se popust od 30 posto!
        if(getGodisnjaClanarina()>=150000){
            popust = godisnjaClanarina * 0.3;
            System.out.println("Posto je clanarina veca od 150000, popust na clanarinu je " + popust);
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

