package Stack;

public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan (10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println();
        tumpukan.pop();
        tumpukan.baca();
        System.out.println();
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println();
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println();
        tumpukan.pop();
        tumpukan.baca();
        System.out.println();
        long nilai2 = tumpukan.pop();
        System.out.println("nilai top = " +nilai2);
        System.out.println("Annisa Nadia Nur Afifah");
    }
}
