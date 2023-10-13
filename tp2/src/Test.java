public class Test {
    public static void main(String[] args) {
        Livre L=new Livre(774,"La rose","Michel",15000);
        Livre L1=new Livre();
        L.toString();
        L1.toString();
        System.out.println(L1.getAuteur());
        L. setAuteur("albert");
        System.out.println(L.getAuteur());
        System.out.println("le nombre des livres est "+Livre.count);
    }
}
