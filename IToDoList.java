package edu.ucalgary.oop;
import java.util.List;

public interface IToDoList{

    
    void addTask(Task task);
    
    
    void completeTask(String taskId);

    
    void deleteTask(String taskId);

   
    void editTask(String taskId, String title, boolean completed);

    

    List<Task> listTasks();
}


