import java.util.Scanner;

public class ColetaDados {
    public static void main(String[] args) {
        
        // 1. Instanciamos o Scanner para ler o fluxo de entrada do sistema (System.in)
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- SISTEMA DE SELEÇÃO INTERESTELAR ---");
        System.out.println("Por favor, insira os dados do candidato.");

        // 2. Lendo uma String (Texto)
        System.out.print("Nome completo do aspirante: ");
        String nome = leitor.nextLine();

        // 3. Lendo um int (Número Inteiro)
        System.out.print("Idade terrestre: ");
        int idade = leitor.nextInt();

        // 4. Lendo um double (Número Decimal)
        // Nota: Dependendo da localidade do sistema, usa-se vírgula ou ponto.
        System.out.print("Altura (em metros): ");
        double altura = leitor.nextDouble();

        // 5. Lendo um boolean (Verdadeiro ou Falso)
        System.out.print("Possui experiência com pilotagem de drones? (true/false): ");
        boolean temExperiencia = leitor.nextBoolean();

        // Exibindo o relatório formatado
        System.out.println("\n--- PROCESSANDO DADOS DA FICHA ---");
        System.out.printf("Candidato: %s\n", nome);
        System.out.printf("Idade: %d anos | Altura: %.2f m\n", idade, altura);
        System.out.println("Qualificação para pilotagem? " + (temExperiencia ? "Sim" : "Não"));

        if (idade >= 18 && idade <= 45) {
            System.out.println("Status: Apto para os testes físicos.");
        } else {
            System.out.println("Status: Idade fora dos parâmetros da missão.");
        }

        // 6. Importante: Fechar o recurso após o uso
        leitor.close();

        System.out.println("----------------------------------------");
    }
}