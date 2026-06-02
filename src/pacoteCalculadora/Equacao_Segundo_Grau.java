package pacoteCalculadora;

public class Equacao_Segundo_Grau {

    private int a;
    private int b;
    private int c;

    public Equacao_Segundo_Grau(int a, int b, int c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;

        resolverEquacao();
    }

    private void resolverEquacao() throws Exception {

        if (a == 0) {
            throw new Exception("O coeficiente 'a' não pode ser zero.");
        }

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            throw new Exception(
                "A equação possui raízes complexas (Δ = " + delta + ")."
            );
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Δ = " + delta);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
