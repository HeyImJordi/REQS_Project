public class Bediening extends Personeel{

    public Bediening (String naam, int leeftijd){
        super(naam, leeftijd);
    }

    public boolean magDrankServeren(){
        return (getLeeftijd() <= 16);
    }

    public boolean checkId(int leeftijd, boolean legitimatieBewijs){
        return ((leeftijd > 18) && (legitimatieBewijs));
    }
}
