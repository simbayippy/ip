package seedu.duke.ui;

import java.util.List;

import seedu.duke.tasks.Task;

/**
 * UI class. handles all responses to the user
 */
public class Ui {
    /**
     * returns the list of available commands
     *
     * @return list
     */
    public static String help() {
        return "Commands are:\n\n"
                + "list - displays current list\n"
                + "todo - adds a task to do\n"
                + "deadline - adds a task with deadline\n"
                + "event - adds a upcoming event\n"
                + "delete - removes specified index\n"
                + "checkdate - tasks on specified date\n"
                + "find - task with specified keyword\n"
                + "bye - exit program";
    }

    /**
     * prints exit message
     */
    public String printExit() {
        return "Bye. Hope to see you again soon!";
    }

    /**
     * prints Tasks of specfic date
     * @param taskList task list to print
     */
    public String printTasksOnDateOrKeyword(List<Task> taskList) {
        StringBuilder showFindDetailsString = new StringBuilder("Here are the matching tasks in your list:\n");

        if (taskList.isEmpty()) {
            System.out.println("You have no tasks.\n");
        } else {
            showFindDetailsString.append(taskList.size() + " tasks: \n");
            for (int i = 0; i < taskList.size(); i++) {
                Task task = taskList.get(i);
                showFindDetailsString.append((i + 1) + ". " + task + "\n");
            }
        }
        return showFindDetailsString.toString();
    }

    /**
     * Prints details when adding task to TaskList
     *
     * @param task Task to add
     * @param taskList TaskList to operate on
     */
    public String printAddingTask(Task task, List<Task> taskList) {
        String message = String.format("Got it. I've added this task:\n  "
                + task
                + "\nNow you have %s tasks in the list\n", taskList.size());
        return message;
    }

    /**
     * Prints all Tasks in a given TaskList
     *
     * @param taskList TaskList to operate on
     */
    public String printAllTasks(List<Task> taskList) {
        StringBuilder showAllTasks = new StringBuilder("Here are your tasks:\n");

        if (taskList.isEmpty()) {
            System.out.println("You have no tasks.\n");
        } else {
            for (int i = 0; i < taskList.size(); i++) {
                Task task = taskList.get(i);
                showAllTasks.append((i + 1) + ". " + task + "\n");
            }
        }
        return showAllTasks.toString();
    }

    /**
     * prints details when deleting a task
     *
     * @param task Task to delete
     */
    public String printDeleteTask(Task task) {
        return "Noted. I've removed this task:" + "\n  " + task + "\n";
    }

    /**
     * prints while marking a task
     *
     * @param task task to mark
     * @param beforeMarking if task was marked before any operation
     */
    public String printMarkTask(Task task, boolean beforeMarking) {
        if (beforeMarking) {
            return "Error! Task already marked!\n";
        } else {
            return "Nice! I've marked this task as done:\n  " + task + "\n";
        }
    }

    /**
     * prints while unmarking of a task
     * @param task Task to unmark
     * @param beforeMarking if task was already unmark before any operation
     */
    public String printUnMarkTask(Task task, boolean beforeMarking) {
        if (beforeMarking) {
            return "I've unmarked this task:\n  " + task + "\n";
        } else {
            return "Error! Task already unmarked\n";
        }
    }
}
