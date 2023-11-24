public class BicicletaEcologica extends Bicicleta implements ImpactoEcologico {
    public BicicletaEcologica(int numeroDeMarchas) {
        super(numeroDeMarchas);
    }

    @Override
    public int obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de una bicicleta
        return getNumeroDeMarchas() * 2;
    }

    // Nuevo método para obtener el número de marchas de la bicicleta
    public int getNumeroDeMarchas() {
        return super.getNumeroDeMarchas();
    }
}