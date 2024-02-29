package edu.ucalgary.oop;
import java.util.List;
import java.util.*;


class ToDoList implements IToDoList {
    private List<Task> taskList;
    private Stack<List<Task>> history;
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
