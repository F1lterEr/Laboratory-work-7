package com.company;
import java.util.Scanner;

class Animal{
    private String animalName;
    public String getAnimalName(){
        return animalName;
    }

    private String food;
    public String getFood(){
        return food;
    }

    private String location;
    public String getLocation(){
        return location;
    }
    private String age;
    public String getAge(){
        return age;
    }

    public Animal(String food, String location, String animalName, String age){
        this.food = food;
        this.location = location;
        this.animalName = animalName;
        this.age = age;
    }

    public void makeNoise(){
        System.out.println("издаёт звук.");
    }
    public void eat(){
        System.out.println("ест.");
    }
    public void sleep(){
        System.out.println("спит.");
    }
}
class Gorilla extends Animal{

    String sound = "Хрр-хрр-ррр";
    public Gorilla(String food,String location, String animalName, String age){
        super(food, location, animalName, age);
    }

    public void makeNoise(){
        System.out.printf("Горилла %s издаёт звук %s \n", getAnimalName(), sound);
    }
    public void eat(){
        System.out.printf("Горилла %s хочет есть %s \n", getAnimalName(), getFood());
    }
    public void sleep(){
        System.out.printf("Горилла %s после обследования врача уснул. \n", getAnimalName());
    }
    public void age(){
        System.out.printf("Горилле %s уже %s лет \n", getAnimalName(), getAge());
    }
}


class Panther extends Animal{

    String sound = "Р-р-р-р!";
    public Panther(String food,String location, String animalName, String age){
        super(food, location, animalName, age);
    }

    public void makeNoise(){
        System.out.printf("Пантера %s издаёт звук %s \n", getAnimalName(), sound);
    }
    public void eat(){
        System.out.printf("Пантера %s хочет есть %s \n", getAnimalName(), getFood());
    }
    public void sleep(){
        System.out.printf("Пантера %s после обследования врача уснул(а). \n", getAnimalName());
    }
    public void age(){
        System.out.printf("Пантере %s уже %s лет \n", getAnimalName(), getAge());
    }
}

class Hunter extends Animal{

    public Hunter(String food, String location, String animalName, String age){
        super(food, location, animalName, age);
    }
    void treatAnimal(){
        System.out.printf("Охотник приехал в %s, где убил %s и съел %s \n", getLocation(), getAnimalName(), getFood());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите желаемый вид животного (Panther, Gorilla): ");
        String animal = in.nextLine();
        System.out.print("Введите название еды: ");
        String food = in.nextLine();
        System.out.print("Введите имя животного: ");
        String name = in.nextLine();
        System.out.print("Введите возраст животного: ");
        String age = in.nextLine();
        System.out.print("Введите место, в котором находится животное: ");
        String location = in.nextLine();
        Hunter hunter = new Hunter(food, location, name, age);
        switch (animal) {
            case ("Panther"), ("panther"), ("Пантера"), ("пантера") -> {
                Panther panther = new Panther(food, location, name, age);
                panther.age();
                panther.eat();
                panther.makeNoise();
                hunter.treatAnimal();
                panther.sleep();
            }
            case ("Gorilla"), ("gorilla"), ("Горилла"), ("горилла") -> {
                Gorilla gorilla = new Gorilla(food, location, name, age);
                gorilla.eat();
                gorilla.age();
                gorilla.makeNoise();
                hunter.treatAnimal();
                gorilla.sleep();
            }
            default -> System.out.println("Введено некорректное название вида животного.");
        }
    }
}

