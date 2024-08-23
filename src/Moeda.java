public class Moeda {
    private double valorReal;
    private double cotacaoDolar;
    private double quantidadeDolar;

    public Moeda(double valorReal, double
                 cotacaoDolar){
        this.valorReal = valorReal;
        this.cotacaoDolar = cotacaoDolar;
    }

    public void calcularConversao(){
        this.quantidadeDolar = valorReal / cotacaoDolar;
    }

    public double getQuantidadeDolar() {
        return quantidadeDolar;
    }
}
