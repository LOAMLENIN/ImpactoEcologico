public class Auto {
    private String modelo;

    public Auto(String modelo) {
        this.modelo = modelo;
    }

    public void conducir() {
        System.out.println("Conduciendo un auto modelo " + modelo);
    }

    public String getModelo() {
        String modelo = "modelo";
        return modelo;
    }
}
