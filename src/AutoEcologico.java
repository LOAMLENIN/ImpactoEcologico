public class AutoEcologico extends Auto implements ImpactoEcologico {
    public AutoEcologico(String modelo) {
        super(modelo);
    }

    @Override
    public int obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de un auto
        return getModelo().length() * 5;
    }

    // Nuevo método para obtener el modelo del auto
    public String getModelo() {
        return super.getModelo();
    }
}
