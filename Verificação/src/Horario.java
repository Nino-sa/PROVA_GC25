import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Horario {
    public static void main(String[] args) throws Exception {

        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if (!envio.isBefore(limite)) {
            System.out.println("Entrega fora do horário");

        } else {
            System.out.println("Tarefa enviada com sucesso");
        }
    }
}
