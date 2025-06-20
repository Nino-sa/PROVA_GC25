public class Estudos {
    public static void main(String[] args) throws Exception {

        int nota = 7;
        int peso = 2;

        double media = (nota * peso + 6 * 3) / 5;

        if (media >= 7.0) {
            System.out.println("Aprovado");

        } else {
            System.out.println("Revisar o conteúdo");
        }
    }
}
