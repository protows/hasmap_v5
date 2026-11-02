//Перед вами программа, которая хранит доступные авиабилеты и цены на них. 
//Измените код таким образом, чтобы билеты хранились в упорядоченном виде — от самых дешёвых к более дорогим. 
//Для этого используйте Comparator.
//https://github.com/practicetasks/java_tasks/blob/main/collections/set/task_2/README.md
package lesson_8.hash6;
import java.util.Set;
import java.util.TreeSet;

public class V4ComparatorLinkedSet {
    public static void main(String[] args) {
        Set<Ticket> tickets = new TreeSet<>();
        fillTickets(tickets);

        System.out.println("Доступные билеты: ");
        for (Ticket ticket : tickets) {
            System.out.println("  * " + ticket);
        }
    }

    private static void fillTickets(Set<Ticket> tickets) {
        tickets.add(new Ticket("Лондон", "Париж", 376));
        tickets.add(new Ticket("Милан", "Стамбул", 298));
        tickets.add(new Ticket("Берлин", "Бостон", 1273));
        tickets.add(new Ticket("Пекин", "Рим", 846));
        tickets.add(new Ticket("Санкт-Петербург", "Афины", 284));
        tickets.add(new Ticket("Сидней", "Токио", 1738));
        tickets.add(new Ticket("Мюнхен", "Дубай", 974));
    }
}
