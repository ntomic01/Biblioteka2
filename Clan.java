import java.util.Date;

public abstract class Clan {

    private float godisnjaClanarina;
    private String clanskiBroj;
    private Date datumUclanjenja;
    private String adresa;
    private double popust;
    private TipUplateClanarine tipUplateClanarine;

    public Clan(float godisnjaClanarina, String clanskiBroj, Date datumUclanjenja, String adresa, double popust, TipUplateClanarine tipUplateClanarine) {
        this.godisnjaClanarina = godisnjaClanarina;
        this.clanskiBroj = clanskiBroj;
        this.datumUclanjenja = datumUclanjenja;
        this.adresa = adresa;
        this.popust = popust;
        this.tipUplateClanarine = tipUplateClanarine;
    }

    public float getGodisnjaClanarina() {
        return godisnjaClanarina;
    }

    public void setGodisnjaClanarina(float godisnjaClanarina) {
        this.godisnjaClanarina = godisnjaClanarina;
    }

    public String getClanskiBroj() {
        return clanskiBroj;
    }

    public void setClanskiBroj(String clanskiBroj) {
        this.clanskiBroj = clanskiBroj;
    }

    public Date getDatumUclanjenja() {
        return datumUclanjenja;
    }

    public void setDatumUclanjenja(Date datumUclanjenja) {
        this.datumUclanjenja = datumUclanjenja;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public TipUplateClanarine getTipUplateClanarine() {
        return tipUplateClanarine;
    }

    public void setTipUplateClanarine(TipUplateClanarine tipUplateClanarine) {
        this.tipUplateClanarine = tipUplateClanarine;
    }

    @Override
    public String toString() {
        return "Clan{" +
                "godisnjaClanarina=" + godisnjaClanarina +
                ", clanskiBroj='" + clanskiBroj + '\'' +
                ", datumUclanjenja=" + datumUclanjenja +
                ", adresa='" + adresa + '\'' +
                ", popust=" + popust +
                ", tipUplateClanarine=" + tipUplateClanarine +
                '}';
    }

    public abstract void obracunajClanarinu(double popust, int godisnjaClanarina);





}
