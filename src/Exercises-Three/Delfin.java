public class Delfin extends CriaturasMarinas implements Comunicacion {
    
    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando en velocidad con su cola y saltando sobre el agua");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite sonidos y chasquitos para comunicarse");
    }

}
