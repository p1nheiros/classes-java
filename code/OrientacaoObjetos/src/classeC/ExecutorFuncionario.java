package classeC;

public class ExecutorFuncionario {
    public static void main(String[] args) {
        /*Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1000);
        System.out.println(funcionario.getBonificacao());

        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        System.out.println(gerente.getBonificacao());*/

        /*Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        System.out.println(funcionario.getBonificacao());*/

        ControleBonificacoes cdb = new ControleBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000);
        cdb.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000);
        cdb.registra(funcionario2);

        System.out.println(cdb.getTotalBonificacoes());
    }
}