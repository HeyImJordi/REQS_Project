public class Order {
    private int aantalMensen;

    public Order(int aantalMensen){
        this.aantalMensen = aantalMensen;
    }

    public double cateringPrijs(){
        if (aantalMensen >= 50){
            return aantalMensen * 12.95;
        } else if (aantalMensen >= 25){
            return aantalMensen * 17.95;
        } else if (aantalMensen > 10){
            return aantalMensen * 24.95;
        } else {
            return aantalMensen * 27.95;
        }
    }
}
