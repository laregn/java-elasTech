package aulinha;

public class TesteColaborador {
    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador("Lays", "Souza", 10000.0);
        Colaborador colaborador2 = new Colaborador("Joana", "Dark", 6000.0);

        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());

        colaborador1.darAumento();
        colaborador2.darAumento();

        System.out.println("Salário anual atualizado de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual atualizado de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());
    }
}