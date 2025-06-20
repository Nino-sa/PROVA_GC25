import java.util.ArrayList;

public class tarefas2 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Revisar código");

        for (String tarefa : tarefas) {
            if (tarefa.contains("Java")) {
                System.out.println("Tarefa de programação: " + tarefa);

            }

        }

    }
}
