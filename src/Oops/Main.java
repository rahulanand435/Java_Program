package Oops;

public class Main {
    public static void main(String[] args) {
        Human Rahul = new Human(23,"Rahul Anand",10000,false);
        Human sandip = new Human(23,"Sandip",10000,false);
        System.out.println(Rahul.getSalary());
        System.out.println(Human.population);
    }
}
