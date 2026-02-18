import java.util.Scanner;

public class ListaRevisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- BOOTCAMP JAVA: FASE 1 ---");
        System.out.println("Escolha o exercício (1 a 6): ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> exercicio1();
            case 2 -> exercicio2();
            case 3 -> exercicio3();
            case 4 -> exercicio4();
            case 5 -> exercicio5();
            case 6 -> exercicio6();
            default -> System.out.println("Opção inválida!");
        }
        sc.close();
    }

    // --- FASE 1: VARIÁVEIS E OPERADORES MATEMÁTICOS ---

    // 1. Calculadora de Área de Retângulo
    static void exercicio1() {
        // Crie um Scanner dentro do método
        // Peça a LARGURA e a ALTURA (double)
        // Calcule a área (largura * altura)
        // Imprima o resultado
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double altura = sc.nextDouble();
        double area = largura * altura;
        System.out.println("Area do trangulo " + area);
    }

    // 2. Conversor de Dólar
    static void exercicio2() {
        // Defina uma cotação fixa (ex: double cotacao = 5.50;)
        // Peça um valor em Reais ao usuário
        // Calcule quantos Dólares isso vale (reais / cotacao)
        // Imprima formatado com printf "%.2f"
        double cotacao = 6.80;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos reais voce tem.");
        double reais = scanner.nextDouble();
        double convertido = reais / cotacao;
        System.out.printf("Você vai ter  $%.2f  dolares", convertido);
    }

    // --- FASE 2: ESTRUTURAS DE DECISÃO (IF / ELSE) ---

    // 3. Classificação de Temperatura
    static void exercicio3() {
        // Peça a temperatura atual
        // Se temp < 15: "Muito Frio"
        // Se temp entre 15 e 25: "Agradável"
        // Se temp > 25: "Calor"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura atual.");
        int temperatura = scanner.nextInt();
        if(temperatura < 15){
            System.out.println("Muito Frio");
        }else if (temperatura >= 15 && temperatura <=25){
            System.out.println("Agradável");
        }else{
            System.out.println("Calor");
        }

    }

    // 4. Verificador de Login Simples
    static void exercicio4() {
        // Defina uma senha fixa (ex: String senhaCorreta = "1234";)
        // Peça ao usuário para digitar a senha
        // Use .equals() para comparar
        // Imprima "Acesso Permitido" ou "Acesso Negado"

        Scanner scanner = new Scanner(System.in);

        String senha = "4321";
        while (true) {
            System.out.println("Digite a senha: ");

            String senhaU = scanner.nextLine();

            if(senhaU.equals(senha)){
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Acesso Negado!");
            }
            
        }
    }

    // 5. Dia da Semana (Switch Case)
    static void exercicio5() {
        // Peça um número de 1 a 7
        // Imprima o dia correspondente (1=Domingo, 2=Segunda...)
        // Se for outro número, imprima "Dia Inválido"
    }

    // 6. Aprovação Escolar Complexa
    static void exercicio6() {
        // Peça a nota do aluno (0 a 10) e a frequência (%) (0 a 100)
        // Regra: Para passar, precisa de nota >= 7 E frequência >= 75
        // Se nota >= 7 mas frequência < 75: "Reprovado por Falta"
        // Se nota < 7 e frequência >= 75: "Reprovado por Nota"
        // Caso contrário: "Aprovado"
    }
}