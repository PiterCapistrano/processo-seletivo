package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) throws Exception {
    //! Caso 1:
    //double salarioRandom = new Random().nextDouble(1800.0, 2200.0);
    //analisarCandidato(1900.0);
    //analisarCandidato(2200.0);
    //analisarCandidato(2000.0);
    //System.out.printf("O salário do último canditato é igual: %.2f",  salarioRandom);
    //analisarCandidato(salarioRandom);
    
    //! Caso 2:
    selecaoCandidatos();
  }
  static void selecaoCandidatos(){
    String [] candidatos = {"Piter", "Felipe", "Marcia", "julia", "Paulo", "Augusto", "Monica", "Fabricio", "Daniela", "Jorge"};
    List<String> candidatosSelecionados = new ArrayList<>();

    //int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
      while (candidatosSelecionados.size() < 5 && candidatoAtual < candidatos.length) {
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();

        System.out.print("O candidato "+ candidato); 
        System.out.printf(", Solicitou este valor de salário: %.2f", salarioPretendido);
        System.out.println(" ");
        if (salarioBase >= salarioPretendido) {
          System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
          System.out.println(" ");
          candidatosSelecionados.add(candidato); // Caso selecionado o candidato é adicionado a lista
        } else{
          System.out.println("o candidato " + candidato + " Foi recusado para a vaga");
          System.out.println(" ");
        }
        candidatoAtual++;
      }
      System.out.println("Candidatos selecionados = " + candidatosSelecionados.size());
      imprimirSelecionados(candidatosSelecionados.toArray(new String[0]));
      for(String candidato: candidatosSelecionados){
        ligando(candidato);
      }
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
  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
  }
  //! Caso 3:
  static void imprimirSelecionados(String[] candidatos){
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for(int indice = 0; indice < candidatos.length; indice++){
      System.out.println("O candidato de nº: " + (indice+1) + " é " + candidatos[indice]);
    }

    System.out.println("forma abreviada de interação for each:");

    for(String candidato: candidatos){
      System.out.println("O candidato selecionado foi " + candidato);
      System.out.println(" ");
    }
  }
  //! Caso 4:
  static boolean tocando(){
    boolean atendeu = new Random().nextInt(3) == 1;

    return !atendeu;
  }
  static void ligando(String candidato){
    int tentativasRealizadas =1;
    boolean continuarTentando = true;
    boolean atendeu = false;
      do{
        atendeu = tocando();
        continuarTentando = !atendeu;
        if (continuarTentando) 
        tentativasRealizadas++;
      else
        System.out.println("CONTATO REALIZADO COM SUCESSO!");
      } while(continuarTentando && tentativasRealizadas <3);
      if (atendeu){
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativasRealizadas + " TENTATIVAS" );
        System.out.println(" ");
      }else{
        System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
        System.out.println(" ");
      }
  }
  
}
