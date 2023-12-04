public class exo1 {

    public static void main(String[] args) {
        pointA p=new pointA();

        p.setX(3);
        p.setY(32);

        int x=p.getX();
        int y=p.getY();
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        p.affichcorr();

        ///si on n'utilse pas get ,les coordoones n'afficgent pas car x et y private il ne fonctionne  juste dans class A



    }

}


 class Point {
    public Point() {

    }

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
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
    private int x, y;
}

class pointA extends Point{
    public pointA(){

    }



    public void affichcorr() {
        System.out.println("coordonner:"+getX()+" "+getY());

    }
}



