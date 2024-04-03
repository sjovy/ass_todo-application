package se.lexicon;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem{
    //Fields:

    final private int itemID;
    private static int nextItemID = 1;

    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private Person creator;

    //Constructor
    public TodoItem(String title, String description, String deadline, Person creator){
        this.itemID = nextItemID++;
        setTitle(title);
        setDescription(description);
        setDeadline(deadline);
        this.done = false;
        setCreator(creator);
    }

    //Setters and Getters

    public int getItemID(){
        return itemID;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = Person.stringTest(title);
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public LocalDate getDeadline(){
        return deadline;
    }

    public void setDeadline(String deadline){
        this.deadline = LocalDate.parse(Person.stringTest(deadline));
        // this.deadline = LocalDate.parse(deadline);
    }

    public void setDone(boolean done){
        this.done = done;
    }

    public boolean isDone(){
        return done;
    }

    public Person getCreator() {
        return this.creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public boolean isOverdue(){
        LocalDate today = LocalDate.now();
        return today.isAfter(deadline) && !done;
    }

    // equals() & hashCode() all fields except Person objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return itemID == todoItem.itemID &&
                done == todoItem.done &&
                Objects.equals(title, todoItem.title) &&
                Objects.equals(description, todoItem.description) &&
                Objects.equals(deadline, todoItem.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID, title, description, deadline, done);
    }

    // Replace getSummary() with toString() method that don’t print out Person objects.
    @Override
    public String toString() {
        return "TodoItem {" + " itemID= " + itemID + ", title= " + title +
                ", description= " + description + ", deadline= " + deadline + ", done= " + done + "}";
    }

    /* public String getSummary(){
        return "Item ID: " + itemID + "\n" +
                "Title: " + title + ", Deadline: " + deadline + "\n" +
                "Done: " + done + ", Overdue: " + isOverdue() + "\n" +
                "Owner: " + creator.getFirstName() + " " + creator.getLastName() + "\n" +
                "Description: " + description;
    }*/
}