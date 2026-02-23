import java.util.Scanner;

public class ListaRevisao2 {
    
    // Scanner GLOBAL (static) para ser usado em todos os métodos
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("--- BOOTCAMP JAVA: FASE 3 (LOOPS) ---");
        System.out.println("7 - Tabuada");
        System.out.println("8 - Soma de 1 a N");
        System.out.println("9 - Contagem Regressiva");
        System.out.println("10 - Números Pares");
        System.out.println("11 - Jogo da Adivinhação (While)");
        System.out.println("12 - Fatorial");
        System.out.print("Escolha: ");
        
        int opcao = sc.nextInt();

        switch (opcao) {
            case 7 -> exercicio7();
            case 8 -> exercicio8();
            case 9 -> exercicio9();
            case 10 -> exercicio10();
            case 11 -> exercicio11();
            case 12 -> exercicio12();
            default -> System.out.println("Opção inválida!");
        }
        sc.close();
    }

    // --- FASE 3: LOOPS (FOR / WHILE) ---

    // 7. Tabuada
    static void exercicio7() {
        System.out.println("--- TABUADA ---");
        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();
        
        // DICA: Use um for de 1 até 10.
        // Ex: 5 x 1 = 5
        
        // Seu código aqui:
    }

    // 8. Soma de 1 até N
    static void exercicio8() {
        System.out.println("--- SOMA ACUMULADA ---");
        System.out.print("Digite um número limite: ");
        int limite = sc.nextInt();
        
        // DICA: Crie uma variável 'soma = 0' antes do loop.
        // Faça um loop de 1 até 'limite' somando o i na variável soma.
        // Ex: Se limite = 5 -> 1+2+3+4+5 = 15.
        
        // Seu código aqui:
    }

    // 9. Contagem Regressiva
    static void exercicio9() {
        System.out.println("--- CONTAGEM REGRESSIVA ---");
        System.out.print("Começar de qual número? ");
        int inicio = sc.nextInt();
        
        // DICA: Use um for que começa no 'inicio' e vai DIMINUINDO (i--) até 0.
        
        // Seu código aqui:
    }

    // 10. Números Pares
    static void exercicio10() {
        System.out.println("--- APENAS PARES ---");
        System.out.print("Digite o limite: ");
        int limite = sc.nextInt();

        // DICA: Imprima todos os números pares de 0 até o limite.
        // Pode fazer o loop pular de 2 em 2 (i += 2) ou usar if(i % 2 == 0).
        
        // Seu código aqui:
    }

    // 11. Jogo da Adivinhação
    static void exercicio11() {
        System.out.println("--- ADIVINHE O NÚMERO ---");
        int numeroSecreto = 7; // Pode mudar se quiser
        int palpite = 0;

        // DICA: Use um 'while (palpite != numeroSecreto)'.
        // Enquanto o usuário errar, peça de novo. Se acertar, saia do loop e parabenize.
        
        // Seu código aqui:
    }

    // 12. Fatorial (Desafio)
    static void exercicio12() {
        System.out.println("--- FATORIAL ---");
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        // DICA: O fatorial de 5 é 5*4*3*2*1.
        // Comece com uma variável 'long total = 1'.
        // Multiplique os números dentro do loop.
        
        // Seu código aqui:
    }
}