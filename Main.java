package PeopleKill;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Emanuele", "Conte", 24);
        Person person2 = new Person("Mario", "Rossi", 34);

        int person1Age = person1.getAge();
        int person2Age = person2.getAge();

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1Age);
        System.out.println(person2Age);

        System.out.println(person1.isAlive());
        System.out.println(person2.isAlive());

        person1.kill();
        System.out.println(person1.isAlive());
    }
}
