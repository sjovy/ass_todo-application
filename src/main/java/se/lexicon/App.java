package se.lexicon;


import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {
        Person P1 = new Person("Thomas", "Sjövy", "thomas@gmail.com");
        System.out.println("\n" + P1.toString());

        Person P2 = new Person("Oskar", "Quist", "oskar@gmail.com");
        System.out.println("\n" + P2.toString());

        P2.setLastName("Stolle");
        System.out.println("\n" + P2.toString());

        System.out.println("\n" + LocalDate.now());

        TodoItem item1 = new TodoItem("Städa", "Hela huset måste städas noga.", "2024-03-14", P2);
        System.out.println("\n" + item1.toString());

        item1.setDone(true);
        System.out.println("\n" + item1.toString());

        TodoItem item2 = new TodoItem("Tvätta", "Alla kläder måste tvättas och strykas.", "2024-03-18", P2);
        System.out.println("\n" + item2.toString());

        item2.setDeadline("2024-03-20");
        System.out.println("\n" + item2.toString());

        TodoItemTask task1 = new TodoItemTask(item1, P1);
        System.out.println("\n" + task1.toString());

        task1.setAssigned(true);
        System.out.println("\n" + task1.toString());

        AppUser A1 = new AppUser("Thomas Sjövy", "1234", AppRole.ROLE_APP_USER);
        System.out.println("\n" + A1.toString());
        System.out.println("\n" + A1.hashCode());

        System.out.println(A1.equals(P1));


    }
}