package edu.ucalgary.oop;
import java.util.List;
import java.util.Dictionary;
import java.util.*;


class ToDoList implements IToDoList {
    private List<Task> taskList;
    private Dictionary<String, Task> taskDict;
    private Stack<List<Task>> history;
    public ToDoList() {

    }

    public void addTask(Task task){
        taskList.add(task);
        taskDict.put(task.getId(), task);
    }

    public List<Task> listTasks(){
        return taskList;
    }

    public void completeTask(String id){
        taskDict.get(id).setIscompleted(true);
    }

    public void deleteTask(String taskId) {
        taskList.remove(taskDict.get(taskId));
    }

    public void editTask(String taskId, String title, boolean completed) {

    }


}
