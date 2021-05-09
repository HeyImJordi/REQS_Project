public class avondShift extends Personeel{
    boolean vakantie;

    public avondShift(String naam, int leeftijd, boolean vakantie){
        super(naam, leeftijd);
        this.vakantie = vakantie;
    }

    public String werktAvonden(){
        if (getLeeftijd() <= 16 && (vakantie)){
            return "Je mag werken tot maximaal 22:00";
        } else if (getLeeftijd() <= 16 && (!vakantie)){
            return "Je mag werken tot maximaal 19:00";
        } else {
            return "Je mag tot sluit werken.";
        }
    }
}
