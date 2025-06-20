import java.util.ArrayList;

public class ListaHorarios {
    public static void main(String[] args) throws Exception {

        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("08:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.remove(1);
        horarios.add("14:00");

        System.out.println(horarios.get(1));

    }
}
