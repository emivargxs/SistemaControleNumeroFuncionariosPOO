public class Funcionarios {
    public static void main(String[] args) {
       
        System.out.println("PÁGINA DO FUNCIONÁRIO");
        int[] entrada = {8,6,7,9,10};
        int []saida  = {15,12,15,20,17};
        HorasTrabalhadasFuncionarios horasf1 = new HorasTrabalhadasFuncionarios(entrada, saida);
        SalarioFuncionarios f1 = new SalarioFuncionarios("001", "Emile", "02/02/2024", 20);
       
       System.out.println("Nome:" + f1.getIdFuncionario());
       System.out.println("Nome:" + f1.getNomeFuncionario()); 
       System.out.println("Numero de Horas trabalhas por dia:" + horasf1.numeroHorasTrabalhadasPorDia());
       System.out.println("Numero de Horas trabalhas por semana:" + horasf1.numeroHorasTrabalhadasPorSemana());
    }
   
    
}
