public class bruiloftCatering {
    private static int aantalGasten;
    private static boolean medewerkersNodig;
    private static int aantalMedewerkers;
    private static boolean opLocatie;

    public static double bruiloftOrder(boolean opLocatie, int aantalGasten, boolean medewerkersNodig, int aantalMedewerkers){
         double voorrijKosten = 15.00;
         double prijsExcl = 0;

         if(opLocatie){
             if(medewerkersNodig){
                 if (aantalMedewerkers >= 10){
                     prijsExcl = prijsExcl + (aantalMedewerkers * 10.50);
                 } else if (aantalMedewerkers >= 5){
                     prijsExcl = prijsExcl + (aantalMedewerkers * 12.50);
                 }
             }
         }

         if (aantalGasten >= 500){
             prijsExcl = prijsExcl + (aantalGasten * 7.50) - voorrijKosten;
         } else if (aantalGasten >= 200) {
             prijsExcl = prijsExcl + (aantalGasten * 10.95) - voorrijKosten;
         } else if (aantalGasten >= 100) {
             prijsExcl = prijsExcl + (aantalGasten * 17.95);
         }

         return prijsExcl;
    }
}
