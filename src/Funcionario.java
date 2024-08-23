public class Funcionario {
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private float valorPorHora;

    public Funcionario(String nome, String
            sobrenome, int horasTrabalhadas, float
            valorPorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public  String nomeCompleto(){
        return nome + "" + sobrenome;
    }

    public float calcularSalario(){
        return  horasTrabalhadas * valorPorHora;
    }

    public void incrementarHoras(int horas){
        this.horasTrabalhadas += horas;
    }
}
