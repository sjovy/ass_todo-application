package se.lexicon;


import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {

        Person P1 = new Person(" ", "Sjovy", "thomas@gmail.com");
        System.out.println(P1.getSummary());
        Person P2 = new Person("Oskar", "Quist", "oskar@gmail.com");
        System.out.println(P2.getSummary());
        P1.setLastName("Stolle");
        System.out.println(P1.getSummary());
        System.out.println("\n" + LocalDate.now() + "\n");
        TodoItem item1 = new TodoItem("Städa", "Hela jävla huset måste städas noga.", "2024-03-20");
        System.out.println(item1.getSummary());
        item1.setDone(true);
        System.out.println(item1.getSummary());
        TodoItem item2 = new TodoItem("Tvätta", "Alla jävla kläder måste tvättas och strykas.", "2024-03-18");
        System.out.println(item2.getSummary());
        item2.setDeadline("2024-03-20");
        System.out.println(item2.getSummary());
    }
}
