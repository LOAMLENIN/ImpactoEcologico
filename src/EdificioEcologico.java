public class EdificioEcologico extends Edificio implements ImpactoEcologico {
    public EdificioEcologico(int numeroDePisos) {
        super(numeroDePisos);
    }

    @Override
    public int obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de un edificio
        return getNumeroDePisos() * 10;
    }

    // Nuevo método para obtener el número de pisos
    public int getNumeroDePisos() {
        return super.getNumeroDePisos();
    }
}
