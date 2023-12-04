public class ex5 {
    public static void main(String[] args) {
        //afchage avec Moto
        vehicule v=new vehicule(32);
        String s=v.toString();
        System.out.println(s);

        //afchage avec Moto
        System.out.println("_________________________________________________________________________");
        Moto m=new Moto(2);
        String M=m.toString();
        System.out.println(M);
        //afchage avec Avion
        System.out.println("_________________________________________________________________________");
        Avion a=new Avion(34,3);
        String av=a.toString();
        System.out.println(av);
        System.out.println("_________________________________________________________________________");
        //afchage avec  Triporteur
        Triporteur T=new Triporteur(12);
        String t=T.toString();
        System.out.println(t);

    }

}
class vehicule {
    private int nbPassager;

    public vehicule() {

    }
    public vehicule(int n) {
        this.nbPassager=n;
    }
    public void setnbp(int n) {
        this.nbPassager=n;
    }
    public int getnbp() {
        return this.nbPassager;
    }

    public String toString() {

        return "le nbr des passgers est "+nbPassager;

    }
}
class Avion extends vehicule {

    private int nbMoteur;

    public Avion(int nbP) {
        super(nbP);

    }
    public Avion(int nbP,int nbM) {
        this(nbP);//meme super(nbP);
        this.nbMoteur=nbP;

    }
    public String toString() {

        return "le nbr des passgers est "+getnbp()+" et le nbr des moteur est "+nbMoteur;

    }
}
class Moto extends vehicule {
    private int nbRoues=2;


    //Le programme tel qu'il est décrit ne compilera pas car la classe Moto étendant la classe Véhicule nécessite un constructeur explicite.

//Lorsqu'une classe enfant étend une classe parente, si la classe parente possède un constructeur paramétré, la classe enfant doit soit :
//
//Appeler explicitement le constructeur de la classe parente via le mot-clé super() dans son propre constructeur.
//Définir un constructeur par défaut dans la classe parente si aucun constructeur n'est déjà déclaré.



    public Moto(int nbrP ,int nbrR ) {
        super(nbrP);
        this.nbRoues=nbrR;

    }
    public Moto(int nbrP ) {
        super(nbrP);
    }
}
class Triporteur extends Moto {

    public Triporteur(int nbrP) {
        super(nbrP,3);
    }

    public String toString() {

        return "le nbr des passgers est "+getnbp()+" et le nbr des roues  est 3";

    }
}




