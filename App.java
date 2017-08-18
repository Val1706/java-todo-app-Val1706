/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

        TodoList ToDoList = new TodoList();

        String showMenu = "1. Show all items\n"
                + "2. Add new item\n"
                + "3. Mark item\n"
                + "4. Archive\n"
                + "0. Exit\n";


        while (true) {

            System.out.println(showMenu);
            System.out.println("Please type an option: ");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine().toUpperCase();

            if(answer.equals("1")) {
                showAllItems(ToDoList);

            } else if(answer.equals("2")) {
                System.out.println("Please provide new item: ");

                String name = scan.nextLine().toUpperCase();
                TodoItem ToDoItem = new TodoItem(name);
                addNewItem(ToDoItem, ToDoList);

            } else if(answer.equals("3")){
                showAllItems(ToDoList);
                System.out.println("Please type item you want to mark: ");
                String name = scan.nextLine().toUpperCase();
                markItem(name, ToDoList);

            } else if(answer.equals("4")){
                archive(ToDoList);

            } else if(answer.equals("0")){
                System.exit(0);
            }


            }
        }



    public static void showAllItems(TodoList ToDoList) {
        ToDoList.showTasks();
    }

    public static void addNewItem(TodoItem name, TodoList ToDoList) {
        ToDoList.addToList(name);
    }

    public static void markItem(String name, TodoList ToDoList) {
        for (TodoItem item : ToDoList.getItems()) {
            if (item.getName().equals(name)) {
                item.is_completed = true;
            }
        }
    }

    public static void archive(TodoList ToDoList) {
        ToDoList.deleteItem();
    }
}
