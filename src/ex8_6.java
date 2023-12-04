public class ex8_6 {
        public static void main(String[] args) {

            System.out.println("_______________________________________Patron____________________________________________");
//			//pour Ptron
            Patron P=new Patron("elabbassi ","Mohammed",20039.4);
//
            String np=Employe.nom;
            String  pp=Employe.prenom;
            double sp=P.getsalaire();
            System.out.println(np+"   "+ pp+"   "+sp);
//
            double Gp= P.gains();
            System.out.println("salaire de patron est "+Gp);
            String Sp=P.toString();
            System.out.println(Sp);
            System.out.println();
            System.out.println("_________________________________TravailleurCommission__________________________________________________");
//		//pour Travailleur Commission
            TravailleurCommission TC=new TravailleurCommission("elabbassi ","elmosstapha",20039.4,400);
//
            String ntc=Employe.nom;
            String  ptc=Employe.prenom;
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
            String nth=Employe.nom;
            String  pth=Employe.prenom;
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

    interface  Employe {


        public static final String  nom = "ahmmed";
        public static final String prenom="mohammed";

        public  double gains();

        public String toString();
    }
    class Patron implements  Employe  {


        private double salaire;


        public Patron() {

        }
        public Patron(String n ,String pr,double salaire ) {

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
            return "le nom  de patron est  : "+nom+" le prenom de patron est  : "+prenom+" --> salaireP : "+salaire+"DH";

        }


    }



    class  TravailleurCommission implements Employe  {


        private double  salaire;
        private double  commission;
        private  int  quantite;

        public  TravailleurCommission () {

        }
        public  TravailleurCommission (String nom, String prenom,double salaire, double commission) {

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
            return "le nom de  travailleurC  : "+nom+" le prenom de  travailleurC est  : "+prenom+" --> salaireC : "+salaire+"DH"+"--> commission "+commission;

        }


    }
    class  TravailleurHoraire implements Employe  {


        private int  retribution;
        private int   heures;

        private  double  salaire;

        public TravailleurHoraire() {

        }
        public  TravailleurHoraire(String nom, String prenom,int retribution ) {

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
            return "le nom de  travailleurH  : "+nom+" le prenom de  travailleurH est  : "+prenom+" --> salaireH : "+salaire+"DH"+" le nbr des heures :"+heures+"H";

        }
        @Override
        public double gains() {

            return salaire;
        }


    }


