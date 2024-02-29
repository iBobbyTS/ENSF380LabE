package edu.ucalgary.oop;
import java.util.List;
import java.util.Dictionary;
import java.util.*;


class ToDoList implements IToDoList {
    private List<Task> taskList;
    private Dictionary<String, Task> taskDict;
    private Stack<List<Task>> history;

    public ToDoList() {
        this.history = new Stack<List<Task>>();
        this.taskList = new List<Task>(); 
            
    }
    

    private Task getTaskById(String id){
        return taskDict.get(id);
    }

    public void addTask(Task task){
        taskList.add(task);
        taskDict.put(task.getId(), task);
    }

    public List<Task> listTasks(){
        return taskList;
    }

    public void completeTask(String id){
        getTaskById(id).setIsCompleted(true);
    }

    public void deleteTask(String taskId) {
        taskList.remove(getTaskById(taskId));
        taskDict.remove(taskId);
    }

    public void editTask(String taskId, String title, boolean completed) {
        getTaskById(taskId).setTitle(title);
        getTaskById(taskId).setIsCompleted(completed);
    }

}
