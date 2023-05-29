public class Program {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Ayala";
        funcionario.quantidadeDeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 10;
        contratoTrabalho.valorHoraExtra = 15;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioDevido = folhaPagamento.calcularSalario(200, 20,
                contratoTrabalho);

        System.out.printf("Salario devido: R$ %.2f%n", salarioDevido);
    }
}
