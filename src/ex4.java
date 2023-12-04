public class ex4 {
    public static void main(String[] args) {
        //affichge maison

        batiment b=new batiment("casa _db soltane rue hfari 25");
        //ou bien par setb
        b.setb("casa _db soltane rue hfari 25");
        String  y=b.getb();
        System.out.println(y);
        //affichge maison
        maison m=new maison("casa _db soltane rue hfari 25",32);
        String  k=m.toString();
        //affichge Immeuble
        Immeuble I=new Immeuble("casa _db soltane rue hfari 25",67);
        String  i=I.toString();

    }

}
class batiment {
    private String adress;

    public  batiment() {

    }
    public  batiment(String adress) {
        this.adress=adress;
    }
    public void setb(String adress) {
        this.adress=adress;
    }
    public String getb() {
        return this.adress;
    }

    public String toString() {

        return "adress batimat: "+adress;


    }




}
class Immeuble extends batiment {
    private int nbImmeuble;

    public Immeuble() {

    }
    public  Immeuble(String adress ,int nbI) {
        this.setb(adress);
        this.nbImmeuble=nbI;
    }
    public void setnbI(int nbI) {
        this.nbImmeuble=nbI;
    }
    public int  getnbch() {
        return this.nbImmeuble;
    }

    public String toString() {

        return	"adress batimat: "+getb()+" nbr des chembers sont "+getnbch()+" et le nbr des immeuble sont "+nbImmeuble;

    }

}
class maison extends batiment {
    private int nbChambres;

    public maison() {

    }
    public  maison(String adress ,int nbch) {
        this.setb(adress);
        this.nbChambres=nbch;
    }
    public void setnbch(int nbch) {
        this.nbChambres=nbch;
    }
    public int  getnbch() {
        return this.nbChambres;
    }

    public String toString() {

        return "adress batimat: "+getb()+" nbr des chembers sont "+nbChambres;



    }

}




