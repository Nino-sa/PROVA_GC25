import java.time.LocalDate;

public class Agendamento {
    public static void main(String[] args) throws Exception {

        LocalDate base = LocalDate.of(2025, 6, 1);

        int dias = 7;

        LocalDate novData = base.plusDays(dias * 2 - 3);
        System.out.println(novData.getDayOfMonth());

    }
}
