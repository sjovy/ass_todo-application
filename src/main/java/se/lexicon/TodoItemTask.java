package se.lexicon;

import java.util.Objects;

public class TodoItemTask {

    //Fields

    final private int taskID;
    private static int nextTaskID = 1;

    private TodoItem todoItem;
    private boolean assigned;
    private Person assignee;

    // Constructor
    public TodoItemTask(TodoItem todoItem, Person assignee){
        this.taskID = nextTaskID++;
        setTodoItem(todoItem);
        this.assigned = false;
        setAssignee(assignee);
    }

    // Methods

    public int getTaskID() {
        return taskID;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        if (assignee == null) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
        this.assignee = assignee;
        setAssigned(true);
    }
    // Replace getSummary() with toString() method that don’t print out Person object.
    @Override
    public String toString() {
        return "TodoItemTask {" + " taskID= " + taskID + ", todoItem= " + todoItem +
                ", assigned= " + assigned + ", assignee= " + assignee + "}";
    }
    /*public String getSummary(){
        return "Task ID: " + taskID + ", Todo: " + todoItem.getTitle() + "\n" +
                "Assigned: " + assigned + ", Assigned to :" + assignee.getFirstName() + " " + assignee.getLastName();
    }*/
}