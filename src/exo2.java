public class exo2 {

        public static void main(String[] args) {

            PointNom p=new PointNom();

            p.setX(3);
            p.setY(4);
            p.deplace(2, 1);
            p.affCoord();

            p.setPointNom(2, 20, 'k');
            p.setNom('F');
//		p.setX(3);
//		p.setY(4);
            p.setCoord();

        }

    }
    class Point {
        public  Point() {

        }
        public void  Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        private int x, y;
        public void  setX(int a ) {
            this.x=a;
        }
        public void   setY(int a ) {
            this.y=a;
        }
        public int  getX( ) {
            return this.x;
        }
        public int  getY( ) {
            return this.y;
        }

    }
    class PointNom extends Point {

        private char nom;
        public  PointNom() {

        }
        public  PointNom(int a,int b,char name) {
            this.setX(a);
            this.setX(b);
            this.nom=name;

        }

        public void  setPointNom(int a,int b,char name ) {
            this.setX(a);
            this.setX(b);
            this.nom=name;
        }
        public void  setNom(char name ) {

            this.nom=name;

        }

        public void setCoord() {
            System.out.println("Coordonnees : " + getX()+ " " + getY()+" "+nom);
        }
    }

