package se.lexicon;

public class Person {

    //Fields:


    final private int personalID;

    private static int nextID = 10001;

    private String firstName;
    private String lastName;
    private String email;

    //Getters and Setters:


    public int getPersonalID() {return personalID; }


    public String getSummary(){
        return "ID: " + personalID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email;
    }


    public void setFirstName(String firstName){
        // Not very elegant. Make helper function?
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Data missing!");
        }
        this.firstName = firstName;

    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Data missing!");
        }
        this.lastName = lastName;

    }
    public String getLastName(){
        return lastName;
    }

    public void setEmail(String email){

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Data missing!");
        }
        this.email = email;

    }
    public String getEmail(){
        return email;
    }

    //Constructor
    public Person(String firstName, String lastName, String email){
        this.personalID = nextID++;

        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);

    }




}
