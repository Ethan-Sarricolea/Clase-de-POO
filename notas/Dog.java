/**
 * 
 * clases
 * 
 */

package notas;

public class Dog{
    private String name;
    private int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    Dog(String name){
        this.name = name;
    }
    
    void ladrar(){
        System.out.println("wuf");
    }

    public static void main(String[] args){
        Dog max = new Dog("Max", 0);
        max.ladrar();
    }
}
