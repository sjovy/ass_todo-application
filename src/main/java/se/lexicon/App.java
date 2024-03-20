package se.lexicon;


import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {
        Person P1 = new Person("Thomas", "Sjövy", "thomas@gmail.com");
        System.out.println("\n" + P1.getSummary());

        Person P2 = new Person("Oskar", "Quist", "oskar@gmail.com");
        System.out.println("\n" + P2.getSummary());

        P1.setLastName("Stolle");
        System.out.println("\n" + P1.getSummary());

        System.out.println("\n" + LocalDate.now());

        TodoItem item1 = new TodoItem("Städa", "Hela huset måste städas noga.", "2024-03-14", P2);
        System.out.println("\n" + item1.getSummary());

        item1.setDone(true);
        System.out.println("\n" + item1.getSummary());

        TodoItem item2 = new TodoItem("Tvätta", "Alla kläder måste tvättas och strykas.", "2024-03-18", P2);
        System.out.println("\n" + item2.getSummary());

        item2.setDeadline("2024-03-20");
        System.out.println("\n" + item2.getSummary());

        TodoItemTask task1 = new TodoItemTask(item1, P1);
        System.out.println("\n" + task1.getSummary());

        task1.setAssigned(true);
        System.out.println("\n" + task1.getSummary());

    }
}
