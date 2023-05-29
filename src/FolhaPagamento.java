public class FolhaPagamento {

    double calcularSalario (int HorasNormaisTrabalhadas, int HorasExtrasTrabalhadas,
                            double valorDaHoraNormal, double valorDaHoraExtra){
        double salarioNormal = HorasNormaisTrabalhadas * valorDaHoraNormal;
        double salarioExtra = HorasExtrasTrabalhadas*valorDaHoraExtra;
        return salarioNormal+salarioExtra;
    }
}
