public class HorasTrabalhadasFuncionarios {
   public int []horaEntrada;
   public int []horaSaida;


    public HorasTrabalhadasFuncionarios(int[] horaEntrada, int[] horaSaida) {
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }
    //retornam os valores   
    public int[] getHoraEntrada(){
        return horaEntrada;
    }    
    public int [] getHoraSaida(){
        return horaSaida;
    }

    public double numeroHorasTrabalhadasPorDia(){
        double total = 0; //numero de horas trabalhadas inicia contando em 0
        for(int i = 0; i < horaEntrada.length; i++){ //cada repeticao ele pega a hora de entrada
        total = total + (horaSaida[i] - horaEntrada[i]);
        }
        return total/horaEntrada.length;
    }
    public double numeroHorasTrabalhadasPorSemana(){
        double total = 0;
        for(int i = 0; i < horaEntrada.length; i++){
        total = total + (horaSaida[i] - horaEntrada[i]);
        }
        return total/horaEntrada.length*5;
    }


}
