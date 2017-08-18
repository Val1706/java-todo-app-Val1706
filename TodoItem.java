/**
 * Class representing a single todo item.
 * 
 */

public class TodoItem {

    private String name;
    Boolean is_completed = false;

    public TodoItem(String name){
        this.name = name;

        }
    public void get_completed(TodoItem this){
        this.is_completed = true;
    }

    public String getName(){
        return this.name;
    }

    
}
