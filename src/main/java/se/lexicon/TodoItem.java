package se.lexicon;

import java.time.LocalDate;

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
    public TodoItem(String title, String description, String deadline){
        this.itemID = nextItemID++;
        setTitle(title);
        setDescription(description);
        setDeadline(deadline);
        this.done = false;
        // this.creator = creator;
    }

    //Setters and Getters

    public int getItemID(){
        return itemID;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        // Not very elegant. Make helper function?
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Data missing!");
        }
        this.title = title;
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
        if (deadline == null || deadline.trim().isEmpty()) {
            throw new IllegalArgumentException("Data missing!");
        }
        this.deadline = LocalDate.parse(deadline);
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

    public String getSummary(){
        return "Item ID: " + itemID + "\n" +
                "Title: " + title + ", Deadline: " + deadline + "\n" +
                "Done: " + done + ", Overdue: " + isOverdue() + "\n" +
                "Owner: " + creator + "\n" +
                "Description: " + description;

    }


}
