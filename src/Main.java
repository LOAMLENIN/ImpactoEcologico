import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        EdificioEcologico edificio = new EdificioEcologico(5);
        AutoEcologico auto = new AutoEcologico("Toyota");
        BicicletaEcologica bicicleta = new BicicletaEcologica(18);

        // Crear ArrayList<ImpactoEcologico>
        ArrayList<ImpactoEcologico> impactosEcologicos = new ArrayList<>();
        impactosEcologicos.add(edificio);
        impactosEcologicos.add(auto);
        impactosEcologicos.add(bicicleta);

        // Iterar a través del ArrayList e invocar el método obtenerImpactoEcologico de cada objeto
        for (ImpactoEcologico impactoEcologico : impactosEcologicos) {
            System.out.println("Identificación del objeto: " + impactoEcologico.getClass().getSimpleName());
            System.out.println("Impacto ecológico: " + impactoEcologico.obtenerImpactoEcologico());
            System.out.println("------------------------------");
        }
    }
}