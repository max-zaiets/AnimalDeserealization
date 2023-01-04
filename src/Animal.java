import java.io.Serial;
import java.io.Serializable;

public class Animal implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private int legs;

    public Animal(String name, int age, int legs) {
        this.name = name;
        this.age = age;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String toString(){
        return String.format("Animal {name: %s , age: %s , number of legs: %s}",
                this.name, this.age, this.legs) ;
    }

}
