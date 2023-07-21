package PeopleKill;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean alive;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.alive = true;
    }
    public String toString() {
        return name + " " + surname + " " + age;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void kill() {
        alive = false;
    }
}
