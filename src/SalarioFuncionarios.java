public class SalarioFuncionarios {
    private String id_Funcionario;
    private String nomeFuncionario;
    private String dataContratacao;
    private double salarioHora;

    public SalarioFuncionarios(String id_Funcionario, String nomeFuncionario, String dataContratacao, double salarioHora) {   
        this.id_Funcionario = id_Funcionario;
        this.nomeFuncionario = nomeFuncionario;
        this.dataContratacao = dataContratacao;
        this.salarioHora = salarioHora;
    }

    //Acessos
    public String getIdFuncionario(){
        return id_Funcionario;
    }
    public String getNomeFuncionario(){
        return nomeFuncionario;
    }
    public String getDataContratacao(){
        return dataContratacao;
    }
    public double getSalarioHora(){
        return salarioHora;
    }
    
    public double salarioBrutoSemanal(double horasTrabalhadas){
        return horasTrabalhadas * salarioHora;
    }
}
