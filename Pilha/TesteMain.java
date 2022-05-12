public class TesteMain {
    public static void main(String[] args) throws Exception {
        Pilha<Integer> p = new Pilha<Integer>(10);
        p.guardeUmItem(5);
        p.guardeUmItem(7);
        p.guardeUmItem(221);
        p.guardeUmItem(69);
        p.removaUmItem();

        System.out.println(p);
    }
}
