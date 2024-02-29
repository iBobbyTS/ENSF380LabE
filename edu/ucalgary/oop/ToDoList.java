package edu.ucalgary.oop;
import java.util.List;


class ToDoList implements IToDoList {
    private List<Task> taskList;
    public ToDoList() {

    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public List<Task> listTasks(){
        return taskList;
    }

    public void completeTask(String id){
        
    }

    public void deleteTask(String taskId) {

    }

    public void editTask(String taskId, String title, boolean completed) {

    }
}
