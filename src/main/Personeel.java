public class Personeel {
    private int leeftijd;
    private String naam;

    public Personeel (String naam, int leeftijd){
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public int getLeeftijd(){
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd){
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String magKoken(){
        if (leeftijd <= 16) {
            return "Mag geen keuken werkzaamheden uitvoeren";
        } else if (leeftijd <= 20){
            return "mag keuken werkzaamheden uitvoeren op koken na.";
        } else {
            return "Mag alle werkzaamheden uitvoeren in de keuken.";
        }
    }
}
