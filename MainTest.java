import java.util.Date;

public class MainTest {

    public static void main(String[] args) {

        IndividualniClan individualniClan1 = new IndividualniClan(95000,"4",  new Date(), "Radnicka 12-Jevremovac", "Nikola", "Tomic", 5, TipUplateClanarine.elektronski);
        KolektivniClan kolektivniClan1 = new KolektivniClan(45000, "2", new Date(), "Omladinskih brigada 154", "Firma1", 45,TipUplateClanarine.uplataNaBankomatu);
     //   System.out.println(individualniClan1.toString());
     //   System.out.println(kolektivniClan1.toString());
     //   individualniClan1.obracunajClanarinu(8,95000);
     //   System.out.println(individualniClan1.toString());
      //    individualniClan1.trenutniTipUplate();
     //     System.out.println(individualniClan1.toString());
      //    individualniClan1.promeniRezimUplate();
     //     System.out.println(individualniClan1.toString());

          
          System.out.println(kolektivniClan1.toString());
          kolektivniClan1.promeniRezimUplate();
          System.out.println(kolektivniClan1.toString());






    }

}
