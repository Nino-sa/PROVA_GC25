public class Principal {

    public static void main(String[] args) {

        Livro l = new Livro();

        l.titulo = "Java para Iniciantes";

        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());

    }

}
