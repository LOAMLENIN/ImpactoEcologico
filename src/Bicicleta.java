public class Bicicleta {
    private int numeroDeMarchas;

    public Bicicleta(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public void pedalear() {
        System.out.println("Pedaleando en una bicicleta de " + numeroDeMarchas + " marchas");
    }

    public int getNumeroDeMarchas() {
        int var = 1;
        return var;
    }
}
