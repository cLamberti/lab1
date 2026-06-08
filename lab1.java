import java.util.ArrayList;

 abstract class Animal {
    public void makeSound() {
    System.out.println("El animal hace sonido");
    }
    }
    class Perro extends Animal {
    @Override
    public void makeSound() {
    System.out.println("Wuf wuf");
    }
    }
    class Gato extends Animal {
    @Override
    public void makeSound() {
    System.out.println("Miau");
    }
    }
    class Vaca extends Animal {
      @Override
      public void makeSound() {
      System.out.println("Muuu");
      }
      }
    public class lab1 {
    public static void main(String[] args) {

    ArrayList<Animal> Animals = new ArrayList<>();
    Animals.add(new Vaca());
    Animals.add(new Perro());
    Animals.add(new Gato());
   
    for (Animal animal : Animals) {
      animal.makeSound();
  }
    }
    }