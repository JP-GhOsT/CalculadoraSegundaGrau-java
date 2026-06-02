package pacoteCalculadora;

public class Simula_Excecao {

    public static void main(String[] args) {

        System.out.println("=== Exemplo sem exceção ===");

        try {
            Equacao_Segundo_Grau eq1 =
                new Equacao_Segundo_Grau(1, -5, 6);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== Exemplo com exceção ===");

        try {
            Equacao_Segundo_Grau eq2 =
                new Equacao_Segundo_Grau(1, 2, 5);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
