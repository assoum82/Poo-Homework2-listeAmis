
/**
 * Created by fcmam5 on 10/10/15.
 */
public class Main {
    public static void main(String[] args) {

        //Autocreated object, or it can be by reading each attribute
        Personne alg = new Personne("Ahmad","Hadji","Dz",35);
        Personne fr = new Personne("Jean","Blanc","Fr",30);
        Personne eng = new Personne("John","Smith","UK",27);
        Personne alg2 = new Personne("Mohammed","Amine","Dz",22);
        Personne tun = new Personne("Youcef","Mahmoudi","Tn",30);

        System.out.println("Now the first Algerian became their friend");
        alg.ajouterAmi(alg2);
        alg.ajouterAmi(fr);
        alg.ajouterAmi(eng);
        alg.ajouterAmi(tun);

        System.out.println("The English became a friend with the second Algerian, and the French");
        eng.ajouterAmi(alg2);
        eng.ajouterAmi(fr);

        System.out.println("\nPrinting the friend list");
        alg.afficherMesAmis();
        System.out.println("\nPrinting the foreign friends list");

        System.out.println("\n\nLet's test with the Englishman");
        System.out.println("\nPrinting the friend list");
        alg.afficherMesAmis();
        System.out.println("\nPrinting the foreign friends list");


    }
}
