public class ex08_6 {
    public static void main(String[] args) {
        System.out.println("________________________________rectangle____________________________________________");
        Dsq d=new Dsq(2,3,"pointD");

        double  c=d.getCentre();
        double  r=d.getRayon();
        String  s=fgr.nom;
        System.out.println(c+"   "+ r+"   "+s);

        double a= d.getAire();
        double p= d.getPerimeter();
        String aff=d.toString();
        System.out.println(aff);
        System.out.println("l'aire de disque est : " +a+" primetre de disque est: "+p);
        System.out.println();
        System.out.println("________________________________rectangle____________________________________________");
        //pour rectangle
        rec rec=new rec(4,4,"pointR");

        double  ln=rec.getlongueur();
        double  lr=rec.getlargeur();
        String  n=rec.nom;
        System.out.println(ln+"   "+ lr+"   "+n);
        double ar= rec.getAire();
        double pr= rec.getPerimeter();
        aff=rec.toString();
        System.out.println(aff);

        System.out.println("l'aire du rectangle est : " +ar+" primetre du rectangle est: "+pr);



    }
}
interface fgr {


    public static final String nom = "pointA";
    public  double getPerimeter();
    public  double   getAire();

}
class Dsq implements fgr  {


    private double centre;
    private double rayon;

    public Dsq() {

    }
    public Dsq(double centre,double  rayon) {
        this.centre=centre ;
        this.rayon=rayon ;


    }
    public Dsq(double centre,double  rayon, String nom) {
        this.centre=centre ;
        this.rayon=rayon ;

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

        return  3.14*rayon*rayon;
    }
    public String toString(){
        return "le nom est : "+nom+" rayon est : "+rayon+" centre est : "+centre;

    }

}


class rec implements fgr  {


    public double  longueur;
    public double  largeur;

    public rec() {

    }
    public rec(double longueur,double   largeur) {
        this.longueur=longueur ;
        this. largeur= largeur ;


    }
    public rec(double longueur,double   largeur, String nom) {
        this.longueur=longueur ;
        this.largeur= largeur ;


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
        return (longueur*largeur)*2;
    };
    public double   getAire() {
        return  (longueur*largeur)/2;
    }
    public String toString(){
        return "le nom est : "+fgr.nom+" rayon est : "+longueur+" centre est : "+largeur;

    }



}

