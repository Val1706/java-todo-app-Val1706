/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<TodoItem> todoitems;

    public TodoList(){
        this.todoitems = new ArrayList<TodoItem>();
    }

    public ArrayList<TodoItem> addToList(TodoItem task){
        this.todoitems.add(task);
        return this.todoitems;
    }

    public ArrayList<TodoItem> getItems(){
        return this.todoitems;
    }

    public ArrayList<TodoItem> deleteItem(){

        ArrayList <TodoItem> uncompletedItems = new ArrayList<TodoItem>();

        for (TodoItem item : this.todoitems) {
            if(!item.is_completed){
                uncompletedItems.add(item);
            }
        }
        this.todoitems = uncompletedItems;
        return this.todoitems;
    }

    public void showTasks(){
        String line;
        for (TodoItem item : this.todoitems) {
            if(item.is_completed){
                line = "[x]" + item.getName();
            }
            else {
                line = "[ ]" + item.getName();
            }
            System.out.println(line);
        }
    }
}
