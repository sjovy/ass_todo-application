package se.lexicon;

public class Person {

    // Fields:

    final private int personalID;
    private static int nextID = 10001;

    private String firstName;
    private String lastName;
    private String email;

    // Getters and Setters:

    public int getPersonalID() {return personalID; }

    public String getSummary(){
        return "ID: " + personalID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email;
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

    // Constructor

    public Person(String firstName, String lastName, String email){
        this.personalID = nextID++;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }
}
