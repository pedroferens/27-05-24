
public class Main {
  public static void main(String[] args) {
    System.out.println("potência:");
    System.out.println();
    System.out.println("É a força com que um aparelho elétrico trabalha no movimento dos eletrons");
    System.out.println();
    System.out.println("Uma tv de 200 watts fica ligada aproximadamente 5 horas diaramente o consumo eletrico mensalmente é de:");
    System.out.println();
    int potencia = 200;
    System.out.println(potencia);
    System.out.println();
    System.out.println("O tempo de uso diario da tv é de:");
    int tempo = 5;
    System.out.println(tempo);
    System.out.println();
    int mes = 30;
    
    int consumo = potencia * tempo * mes / 1000;
    System.out.println("o consumo da tv é de:");
    System.out.println(consumo);

  }


}