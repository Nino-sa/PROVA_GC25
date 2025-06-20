public class Final {
    public static void main(String[] args) throws Exception {

        int notificacoes = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;

            } else {

                notificacoes++;
            }
        }

        System.out.println(notificacoes);
    }
}
