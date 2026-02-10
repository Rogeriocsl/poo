
import java.util.Scanner;

public class Lista01 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("QuestÃ£o: ");
    int q = sc.nextInt();

    switch (q) {
      case 1 -> questao1();
      case 2 -> questao2();
      case 3 -> questao3();
      case 4 -> questao4();
      case 5 -> questao5();
      case 6 -> questao6();
      case 7 -> questao7();
      case 8 -> questao8();
      case 9 -> questao9();
      case 10 -> questao10();
      case 11 -> questao11();
      case 12 -> questao12();
      case 13 -> questao13();
      case 14 -> questao14();
      case 15 -> questao15();
      case 16 -> questao16();
      default -> System.out.println("QuestÃ£o invÃ¡lida");
    }
  }

  // QuestÃµes
  // Desenvolva cada questÃ£o dentro dos mÃ©todos a seguir
  static void questao1() {
    int idade = 16;
    if (idade >= 18) {
      System.out.println("Maior de Idade!");
    } else {
      System.out.println("Menor de Idade!");
    }
  }

  static void questao2() {
    int numero = 3;
    if (numero / 2 == 0) {
      System.out.println("É Par");
    } else {
      System.out.println("É Impar");
    }
  }

  static void questao3() {
    int n1 = 3;
    int n2 = 7;
    if(n1 > n2){
      System.out.println(n1 + " É o maior");
    }else if (n2 > n1){
      System.out.println(n2 + " É o maior");
    }else{
      System.out.println("Os numeros sao Igual");
    }
  }

  static void questao4() {
    int temp = 33;
    if(temp < 20){
      System.out.println("Frio");
    }else{
      System.out.println("Quente");
    }
  }

  static void questao5() {
    double nota1 = 6.5;
    if(nota1 >= 6.8){
      System.out.println("Aprovado");
    }else{
      System.out.println("Reprovado");
    }
  }

  static void questao6() {
    int consumoEnergia = 102;
    double total;
    if(consumoEnergia <= 100){
      total = consumoEnergia * 0.50;
      System.out.printf("Total R$ %.2f", total);
    }else if (consumoEnergia > 100) {
        total = consumoEnergia * 0.70;
        System.out.printf("Total R$ %.2f", total);
    }
  }

  static void questao7() {
    for (int i = 10; i >= 0; i--){
      System.out.println(i);
    }
  }

  static void questao8() {
    int c = 1;
    int soma = 0;
    while(c < 101){
      if(c % 2 == 0){
        soma += c;
      }
      c ++;
    }
    System.out.println(soma);
  }

  static void questao9() {
    int num = 10;
      for (int i = 1; i <= 10; i++) {
          System.out.println(i + " X " + num + " = " + i * num);
      }
  }

  static void questao10() {
    int pri = 8;
    int contD = 0;
    for (int i = 1; i <= pri; i++) {
        if(pri % i == 0){
          contD ++;
        }
    }
    if(contD !=2){
      System.out.println("Não é primo");
    }else{
      System.out.println("é primo");
    }
  }

  static void questao11() {
    char letra = 'x';
    switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          System.out.println("é vogal");
          break;
          default:
            System.out.println("é Consoante");


    }
  }

  static void questao12() {
    String palavra = "tesAtea";
    int c = 0;
    for (int i = 0; i < palavra.length(); i++) {
        char letra = palavra.charAt(i);
        if (letra == 'a' || letra == 'A'){
          c ++;
        }
    }
    System.out.println(c);

  }

  static void questao13() {
    int[] array = {1, 2, 44, 5};
    int num = 2;
    for (int i = 0; i< array.length; i++) {
        if(array[i] == num){
          System.out.println("Tem no array");
        }
        
    }
  }

  static void questao14() {
    double[] notas = {7.5, 8.0, 6.5, 9.0, 8.5};
    double soma = 0;
    double media = 0;

    for (int i = 0; i < notas.length; i++) {
        soma += notas[i];
        
    }
    media = soma / notas.length;
    System.out.println("Media " + media);
  }

  static void questao15() {
    String[] frutas = {"banana", "morango", "melancia", "goiaba", "acerola"};
      for (int i = 0; i < frutas.length; i++) {
        System.out.println(frutas[i]);
        
    }


  }

static void questao16() {
    String[] frutas = {"banana", "morango", "melancia", "goiaba", "acerola"};

    for (int i = 0; i < frutas.length; i++) {
        char letra = frutas[i].charAt(0);

        if (letra == 'm' || letra == 'M') {
            System.out.println(frutas[i]);
        }
    }
}

}