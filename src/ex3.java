public class ex3 {
    public static void main(String[] args) {
        Centre centre = new Centre(3, 5, 'A');
        centre.affiche(); // Affiche les coordonnées et le nom
        centre.affNom(); // Affiche le nom seulement

        Cercle cercle = new Cercle(1, 1, 'B', 5.0);
        cercle.affiche(); // Affiche les coordonnées et le nom du cercle
        System.out.println("Aire du cercle : " + cercle.calculerAire()); // Calcule et affiche l'aire du cercle
        System.out.println("Perimetre du cercle : " + cercle.calculerPerimetre()); // Calcule et affiche le périmètre du cercle
    }
}

   class Point {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;
       public int getX() {
           return x;
       }
       public void setX(int a) {
           this.x=a;
       }
       public void setY(int a) {
           this.y=a;
       }

       public int getY() {
           return y;
       }


}

    class Centre extends p {
        private char nom;

        public Centre(int x, int y, char nom) {
            this.setX(x);
            this.setY(y);// Appel du constructeur de la classe mère (Point)
            this.nom = nom;
        }

        public void affNom() {
            System.out.println("Nom : " + nom);
        }


        public void affiche() {
            System.out.println("Coordonnees : " +getX() + " " + getY()+ " Nom : " + nom);
        }
    }

    class Cercle extends Centre {
        private double rayon;

        public Cercle(int x, int y, char nom, double rayon) {
            super(x, y, nom); // Appel du constructeur de la classe mère (Centre)
            this.rayon = rayon;
        }

        public double calculerAire() {
            return Math.PI * rayon * rayon;
        }

        public double calculerPerimetre() {
            return 2 * Math.PI * rayon;
        }
    }



