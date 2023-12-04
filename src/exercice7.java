public class exercice7 {
    public static void main(String[] args) {

        System.out.println("_______________________________________Patron____________________________________________");
//						//pour Ptron
        Patron P=new Patron("elabbassi ","Mohammed",20039.4);
//
        String np=P.getNom();
        String  pp=P.getPrenom();
        double sp=P.getsalaire();
        System.out.println(np+"   "+ pp+"   "+sp);
//
        double Gp= P.gains();
        System.out.println("salaire de patron est "+Gp);
        String Sp=P.toString();
        System.out.println(Sp);
        System.out.println();
        System.out.println("_________________________________TravailleurCommission__________________________________________________");
//					//pour Travailleur Commission
        TravailleurCommission TC=new TravailleurCommission("elabbassi ","elmosstapha",20039.4,400);
//
        String ntc=TC.getNom();
        String  ptc=TC.getPrenom();
        double stc=TC.getsalaire();
        TC.setquantite(23);

        int q=(int)TC.getquantite();

        System.out.println(" nom "+ntc+" prenom   "+ ptc+" salaire :"+stc+" quentite: "+q);
//
        double Gtc= P.gains();
        System.out.println("salaire de Travailleur Commission est "+Gtc);
        String Stc=TC.toString();
        System.out.println(Stc);
        System.out.println();

        System.out.println("____________________________________  TravailleurHoraire_______________________________________________");


        TravailleurHoraire TH=new TravailleurHoraire("elabbassi ","elmosstapha",400);
//
        String nth=TH.getNom();
        String  pth=TH.getPrenom();
        double stH=TH.getsalaire();
        int rbsh=(int) TH.getretribution();



        System.out.println(" nom "+ntc+" prenom   "+ ptc+" salaire :"+stc+" retribution : "+rbsh );

        TH.setsalaire(2500);
        TH.setheures(300);
        double Gth= TH.gains();
        System.out.println("salaire de Travailleur Commission est "+Gth);
        String Sth=TH.toString();
        System.out.println(Sth);
    }
}
//class employe

abstract class  Employe {


    private String nom;
    private String prenom;


    public  Employe() {

    }
    public  Employe(String nom,String prenom) {
        this.nom=nom;
        this.prenom=prenom;

    }
    public void setNom(String nom) {
        this.nom=nom;

    }
    public void setPrenom(String prenom) {

        this.prenom=prenom;
    }

    public String  getNom () {
        return this.nom;
    }
    public String  getPrenom () {
        return this.prenom;
    }


    public abstract double gains();

    public String toString(){
        return "le nom est : "+nom+"le prenom est : "+prenom;

    }
}

// class patron

class Patron extends  Employe  {


    private double salaire;


    public Patron() {

    }
    public Patron(String nom ,String prenom,double salaire ) {
        super(nom,prenom);
        this.salaire= salaire;




    }

    public void setsalaire(double salaire) {
        this.salaire=salaire;

    }


    public double getsalaire() {
        return this.salaire;
    }

    @Override
    public double gains() {
        return salaire;
    }

    public String toString(){
        return "le nom  de patron est  : "+getNom()+" le prenom de patron est  : "+getPrenom()+" --> salaireP : "+salaire+"DH";

    }

}
//Travailleur Commission

class  TravailleurCommission extends Employe  {


    private double  salaire;
    private double  commission;
    private  int  quantite;

    public  TravailleurCommission () {

    }
    public  TravailleurCommission (String nom, String prenom,double salaire, double commission) {
        super(nom,prenom);
        this.salaire=salaire ;
        this.commission= commission;

    }
    public void setsalaire(double salaire) {
        this.salaire=salaire;

    }

    public double getsalaire() {
        return this.salaire;
    }
    public void setcommission(double commission) {
        this.commission=commission;

    }

    public double getcommission() {
        return this.commission;
    }

    public void setquantite(int quantite) {
        this.quantite=quantite;

    }

    public double getquantite() {
        return this.quantite;
    }


    public double gains() {
        return salaire;
    }


    public String toString(){
        return "le nom de  travailleurC  : "+getNom()+" le prenom de  travailleurC est  : "+getPrenom()+" --> salaireC : "+salaire+"DH"+"--> commission "+commission;

    }


}

class  TravailleurHoraire extends Employe  {


    private int  retribution;
    private int   heures;

    private  double  salaire;

    public TravailleurHoraire() {

    }
    public  TravailleurHoraire(String nom, String prenom,int retribution ) {
        super(nom,prenom);
        this.retribution=retribution;

    }
    public void setsalaire(double salaire) {
        this.salaire=salaire;

    }

    public double getsalaire() {
        return this.salaire;
    }
    public void setretribution(int retribution) {
        this.retribution=retribution;

    }

    public double getretribution() {
        return this.retribution;
    }

    public void setheures(int  heures) {
        this.heures= heures;

    }

    public double getheures() {
        return this.heures;
    }


    public String toString(){
        return "le nom de  travailleurH  : "+getNom()+" le prenom de  travailleurH est  : "+getPrenom()+" --> salaireH : "+salaire+"DH"+" le nbr des heures :"+heures+"H";

    }
    @Override
    public double gains() {

        return salaire;
    }


}



