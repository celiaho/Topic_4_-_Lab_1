/* *****************************************
 *  File : Topic 4 Lab 1 - TestAnimal.java
 *  Author : Celia Ho
 *  Last Modified: Tue 19 Mar 2024
 *  Description : Using Animal and Dog classes, add a Cat and Snake class. 
 *    All Animals have a makeNoise() method: dogs bark, cats meow, and snakes hiss
 *    All animals eat: dogs eat anything, cats eat fish, snakes eat rodents
 *    Demonstrate polymorphism and inheritance in your  TestAnimal class.
 * ******************************************/

public class TestAnimal {

  // MAIN SECTION
  public static void main(String[] args) {
    
    Animal dog = new Dog("Barksy", "Maltypoo"); // Create a dog 
    System.out.println(dog);                        // Print animal
    System.out.println(dog.makeNoise());            // Demonstrate its noise
    System.out.println(dog.eat("anything\n"));    // Demonstrate its food

    // Create a cat
    Animal cat = new Cat("Meowy", "Siamese");
    System.out.println(cat);
    System.out.println(cat.makeNoise());
    System.out.println(cat.eat("fish\n"));

    // Create a snake
    Animal snake = new Snake("Rattley", "Timber Rattlesnake");
    System.out.println(snake);
    System.out.println(snake.makeNoise());
    System.out.println(snake.eat("rodents\n"));
  }


  @Override
  public String toString() {
    return "TestAnimal []";
  }

}