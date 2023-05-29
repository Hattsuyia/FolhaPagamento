public class FolhaPagamento {

    double calcularSalario (int HorasNormaisTrabalhadas, int HorasExtrasTrabalhadas,
                            ContratoTrabalho contratoTrabalho){
        double salarioNormal = HorasNormaisTrabalhadas * contratoTrabalho.valorHoraNormal;
        double salarioExtra = HorasExtrasTrabalhadas* contratoTrabalho.valorHoraExtra;

        double valorTotal = salarioNormal+salarioExtra;

        if (contratoTrabalho.temAdicionalFilhos()){
            return valorTotal *=1.10;
        }

        return valorTotal;
    }
}
