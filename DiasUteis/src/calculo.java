import java.time.DayOfWeek;
import java.time.LocalDate;

public class calculo {
    public static void main(String[] args) throws Exception {

        LocalDate data = LocalDate.of(2025, 6, 10);

        int diasUteis = 0;

        while (diasUteis < 7) {
            data = data.plusDays(1);
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            if (!fimDeSemana && !feriado) {
                diasUteis++;

            }

        }

        System.out.println(data);
    }
}
