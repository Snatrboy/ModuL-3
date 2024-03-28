public class App {
    public static void main(String[] args) throws Exception {
        Tabung tabung = new Tabung("Tabung");
        Kubus kubus = new Kubus("Kubus");
        BangunRuang balok = new BangunRuang("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}