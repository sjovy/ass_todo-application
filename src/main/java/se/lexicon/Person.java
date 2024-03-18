package se.lexicon;

public class Person {

    //Fields:

    private int personalID;
    private static int nextID = 10001;

    private String firstName;
    private String lastName;
    private String email;

    //Getters and Setters:

    public int getPersonalID(){
        return personalID;
    }

    public String getSummary(){
        return "ID: " + personalID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email;
    }

    private String stringTest(String testString){
        // todo helper for strings, still not working?
        if (testString != null){
            return testString;
        }
        return "data missing";
    }

    public void setFirstName(String firstName){
        this.firstName = stringTest(firstName);
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.firstName = stringTest(lastName);
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

    //Constructor
    public Person(String firstName, String lastName, String email){
        this.personalID = nextID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }




}
