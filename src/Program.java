public class Program {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioDevido = folhaPagamento.calcularSalario(200, 20,
                10, 15);

        System.out.printf("Salario devido: R$ %.2f%n", salarioDevido);
    }
}
