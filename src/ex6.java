public class ex6 {
    public static void main(String[] args) {


        //pour disque
        Disque d=new Disque(2,3,"pointD");

        double  c=d.getCentre();
        double  r=d.getRayon();
        String  s=d.getNom();
        System.out.println(c+"   "+ r+"   "+s);

        double a= d.getAire();
        double p= d.getPerimeter();
        System.out.println("l'aire de disque est : " +a+" primetre de disque est: "+p);
        //pour rectangle
        Rectangle rec=new Rectangle(4,4,"pointR");

        double  ln=rec.getlongueur();
        double  lr=rec.getlargeur();
        String  n=rec.getNom();
        System.out.println(ln+"   "+ lr+"   "+n);
        double ar= rec.getAire();
        double pr= rec.getPerimeter();
        System.out.println("l'aire du rectangle est : " +ar+" primetre du rectangle est: "+pr);





    }
}


abstract class Figure {


    private String nom;
    public Figure () {

    }
    public Figure (String nom) {
        this.nom=nom;

    }
    public void setNom(String nom) {
        this.nom=nom;

    }

    public String  getNom () {
        return this.nom;
    }


    public abstract double getPerimeter();
    public abstract double   getAire();
    public String toString(){
        return "le nom est : "+nom;

    }
}


class Disque extends Figure  {


    private double centre;
    private double rayon;

    public Disque() {

    }
    public Disque(double centre,double  rayon) {
        this.centre=centre ;
        this.rayon=rayon ;


    }
    public Disque(double centre,double  rayon, String nom) {
        this.centre=centre ;
        this.rayon=rayon ;
        this.setNom(nom);


    }
    public void setCentre(double centre) {
        this.centre=centre;



    }
    public void setRayon(double rayon) {
        this.rayon=rayon;

    }

    public double getCentre () {
        return this.centre;
    }
    public double getRayon () {
        return this.rayon;
    }
    @Override
    public double getPerimeter() {
        return 2*3.14*rayon;
    }

    @Override
    public double getAire() {
        return 3.14*rayon*rayon;
    }
    public String toString(){
        return "le nom est : "+getNom()+" rayon est : "+rayon+" centre est : "+centre;

    }

}


class Rectangle extends Figure  {


    public double  longueur;
    public double  largeur;

    public Rectangle() {

    }
    public Rectangle(double longueur,double   largeur) {
        this.longueur=longueur ;
        this. largeur= largeur ;


    }
    public Rectangle(double longueur,double   largeur, String nom) {
        this.longueur=longueur ;
        this.largeur= largeur ;
        this.setNom(nom);


    }
    public void setlongueur(double  longueur) {
        this.longueur= longueur;



    }
    public void setlargeur(double rayon) {
        this.largeur=rayon;

    }

    public double getlongueur () {
        return this.longueur;
    }
    public double getlargeur () {
        return this.largeur;
    }
    public double getPerimeter() {
        return (longueur+largeur)*2;
    };
    public double   getAire() {
        return  (longueur*largeur);
    }


}

