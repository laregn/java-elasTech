package aulinha;
public class Colaborador {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Colaborador(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;

        this.salarioMensal = (salarioMensal > 0.0) ? salarioMensal : 0.0;
    }
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = (salarioMensal > 0.0) ? salarioMensal : 0.0;
    }

    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }
    public void darAumento() {
        salarioMensal *= 1.1;
    }
}