package se.lexicon;


public class App 
{
    public static void main( String[] args )
    {
        Person P1 = new Person("Thomas", "Sjovy", "thomas@gmail.com");
        System.out.println(P1.getPersonalID());
        Person P2 = new Person("Oskar", "Quist", "oskar@gmail.com");
        System.out.println(P2.getSummary());
    }
}
