package se.lexicon;

import java.util.Objects;

public class Person {

    //Fields:

    final private int personalID;
    private static int nextID = 10001;

    private String firstName;
    private String lastName;
    private String email;

    //Getters and Setters:

    public int getPersonalID() {return personalID; }

    /*public String getSummary(){
        return "ID: " + personalID + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Email: " + email;
    }*/

     // Replace getSummary() with toString() method that don’t print out credentials.
    @Override
    public String toString() {
        return "Person {" + " personalID= " + personalID + ", firstName= " + firstName +
                ", lastName= " + lastName + ", email= " + email + "}";
    }



    public static String stringTest(String testString){
        // Generic helper function. Also used for string inputs in other classes
        // Although it is not a very elegant solution, aborting execution and
        // error message is not very visible.
        if (testString == null || testString.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
        return testString;
    }

    public void setFirstName(String firstName){
        this.firstName = stringTest(firstName);
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = stringTest(lastName);
    }

    public String getLastName(){
        return lastName;
    }

    public void setEmail(String email){
        this.email = stringTest(email);
    }
    public String getEmail(){
        return email;
    }

    // Add a reference to AppUser called credentials.
    // also create getter and setter for that field.
    private AppUser credentials;

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    // Override equals and hashcode from Object. Exclude credentials from both.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personalID == person.personalID &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalID, firstName, lastName, email);
    }


    //Constructor
    public Person(String firstName, String lastName, String email){
        this.personalID = nextID++;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }
}