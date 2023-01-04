import java.io.*;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("vasya", 5, 4);

        try {
            FileInputStream fi = new FileInputStream("D:\\IntellijProjects\\AnimalSerialization\\src\\AnimalSerialized.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Animal b = (Animal)oi.readObject();
            oi.close();
            System.out.println(b);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
