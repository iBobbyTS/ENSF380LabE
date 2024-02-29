package edu.ucalgary.oop;

import java.util.Objects;

public class Task {

    private String id;

    private boolean isCompleted;

    private String title;

    public Task(String newid, String newtitle, boolean newisCompleted){
        this.id = newid;
        this.title = newtitle;
        this.isCompleted = newisCompleted;
    }

    public Task Copy(Task RS) {
        Task copied_task = new Task(RS.id,RS.title,RS.isCompleted);
        return copied_task;
    }

    public void setId(String newid){
        this.id = newid;
    }

    public String getId(){
        return this.id;
    }

    public void settitile(String newtitle){
        this.id = newtitle;
    }

    public String getTitle(){
        return this.title;
    }

    public void setIscompleted(boolean newisCompleted){
        this.isCompleted = newisCompleted;
    }

    public boolean getIscompleted(){
        return this.isCompleted;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return Objects.equals(id, task.id) &&
               Objects.equals(title, task.title) &&
               isCompleted == task.isCompleted; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isCompleted);
    }

}