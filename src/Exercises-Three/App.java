public class App {
    public static void main(String[] args) {
        Delfin delfin = new Delfin("Pupi");
        Pulpo pulpo = new Pulpo("Tutina", 8);

        delfin.nadar();
        delfin.comunicarse();

        pulpo.comunicarse();
        pulpo.nadar();
    }
}
