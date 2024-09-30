import java.util.Date;

public class Animal {
    private String name;
    private int id;
    private int age;
    private Date birthDay;
    private static int animalCount;

    public Animal(String name, int age, Date birthDay){
        this.name = name;
        this.age = age;
        Animal.animalCount+=1;
        this.id = Animal.animalCount;
        this.birthDay = birthDay;

    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        Animal perro = new Animal("Max", 5,null);
        perro.setName("Miky");
        System.out.println("El nombre del animal es: " + perro.getName());
        System.out.println("Su id: "+perro.id);
    }
}
