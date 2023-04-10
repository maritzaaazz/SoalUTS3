public class Main3 {
    public static void main(String[] args) {
        Penduduk ksatria = new Ksatria("Semar", 10000);
        System.out.println(ksatria.toString());

        Penduduk pedagang = new Pedagang("Gareng", 20000);
        System.out.println(pedagang.toString());

        Penduduk petani = new Petani("Petruk", 30000);
        System.out.println(petani.toString());

        Penduduk pandaibesi = new PandaiBesi("Bagong", 40000);
        System.out.println(pandaibesi.toString());
    }
}



