package candidatura;

import java.util.Random;

public class ProcessoSeletivo {
  public static void main(String[] args) throws Exception {
    double salarioRandom = new Random().nextDouble(1500.0, 2500.0);
      analisarCandidato(1900.0);
      analisarCandidato(2200.0);
      analisarCandidato(2000.0);
      System.out.printf("O salário do último canditato é igual: %.2f",  salarioRandom);
      analisarCandidato(salarioRandom);
      
  }
  static void analisarCandidato(double salarioPretendido){
      double salarioBase = 2000.00;
      if (salarioBase > salarioPretendido) {
          System.out.println(" LIGAR PARA O CANDIDATO");
      } else if (salarioBase == salarioPretendido) {
          System.out.println(" LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
      } else {
      System.out.println(" AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
    }
  }
}
