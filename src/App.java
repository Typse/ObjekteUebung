import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Auto auto1 = new Auto("marke", "modell", 1972);
        Auto auto2 = new Auto("marke", "modell", 1992);
        Auto auto3 = new Auto("marke", "modell", 2012);

        Berechnungen rechner = new Berechnungen();

        System.out.println(rechner.rechneAlter(auto1));
        System.out.println(rechner.rechneAlter(auto2));
        System.out.println(rechner.rechneAlter(auto3));
    }
}

class Auto {

    private String marke;
    private String modell;
    private int baujahr;

    public Auto(String marke, String modell, int baujahr) {

        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;

    }

    public String getMarke() {
        return this.marke;
    }

    public String getModell() {
        return this.modell;
    }

    public int getBaujahr() {
        return this.baujahr;
    }

    
}

class Berechnungen {
    public int rechneAlter(Auto a) {
        int datum = LocalDate.now().getYear();
        return datum - a.getBaujahr();
    }
}