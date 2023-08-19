package classeC;

public class ControleBonificacoes {

    private  double totalBonificacoes = 0;

    public void registra(Funcionario funcionario) {
        this.totalBonificacoes += funcionario.getBonificacao();
        //this.totalDeBonificacoes = this.totalDeBonificacoes + funcionario.getBonificacao();
    }

    public double getTotalBonificacoes() {
        return this.totalBonificacoes;
    }
}