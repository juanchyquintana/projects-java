public class Pulpo extends CriaturasMarinas implements Comunicacion {
    int cantTentaculos;

    public Pulpo(String nombre, int cantTentaculos) {
        super(nombre);
        this.cantTentaculos = cantTentaculos;
    }

    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando con sus " + cantTentaculos + " tentaculos");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " saluda con sus " + cantTentaculos + " tentaculos");
    }

}
