package seedu.duke.Ui;

import java.util.List;
import java.util.Scanner;

import seedu.duke.tasks.Task;

/**
 * UI class
 */
public class Ui {

    /**
     * gets user input into system
     *
     * @return user input
     */
    public String getUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * prints the greeting message
     */
    public String printGreet() {
        String logo = "Hello from\n" + " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | | / _ \\\n"
                + "| |_| | |_| |  |_   __/\n"
                + "|____/ \\__,_|___|\\___|\n"
                + "I'm Duke!\nWhat can I do for you?\n";

//        System.out.println("Hello from\n" + logo);
//        System.out.println("I'm Duke!\nWhat can I do for you?\n");
        return logo;
    }

    /**
     * prints exit message
     */
    public String printExit() {
//        System.out.println("Bye. Hope to see you again soon!");
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
//            System.out.println(taskList.size() + " tasks: ");
            showFindDetailsString.append(taskList.size() + " tasks: \n");
            for (int i = 0; i < taskList.size(); i++) {
                Task task = taskList.get(i);
//                System.out.println((i + 1) + ". " + task);
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
//        System.out.println(message);
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
//            System.out.println("Here are your tasks:");
            for (int i = 0; i < taskList.size(); i++) {
                Task task = taskList.get(i);
//                System.out.println((i + 1) + ". " + task);
                showAllTasks.append((i + 1) + ". " + task + "\n");
            }
//            System.out.println("");
        }
        return showAllTasks.toString();
    }

    /**
     * prints details when deleting a task
     *
     * @param task Task to delete
     */
    public String printDeleteTask(Task task) {
        System.out.println("Noted. I've removed this task:" + "\n  " + task + "\n");
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
//            System.out.println("Error! Task already marked!\n");
            return "Error! Task already marked!\n";
        } else {
//            System.out.println("Nice! I've marked this task as done:\n  " + task + "\n");
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
//            System.out.println("I've unmarked this task:\n  " + task + "\n");
            return "I've unmarked this task:\n  " + task + "\n";
        } else {
//            System.out.println("Error! Task already unmarked\n");
            return "Error! Task already unmarked\n";
        }
    }
}
