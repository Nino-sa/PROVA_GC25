public class Livro {

    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;

    }

    public String status() {
        if (emprestado) {
            return "Indisponível";

        }
        return "Disponível";

    }
}
