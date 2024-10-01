import java.util.List;

public class TaskReporter {

    // Générer un rapport des tâches terminées
    public void printCompletedTasks(TaskManager taskManager) {
        System.out.println("Taches terminees :");
        for (Task task : taskManager.getTasks()) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    // Générer un rapport des tâches non terminées
    public void printPendingTasks(TaskManager taskManager) {
        System.out.println("Taches non terminees :");
        for (Task task : taskManager.getTasks()) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

}
