/* *****************************************
 *  File : Topic 4 Lab 1 - Cat.java
 *  Programmer : Celia Ho
 *  Last Modified: Tue 19 Mar 2024
 *  Description : Using Animal and Dog classes, add a Cat and Snake class. 

All Animals have a makeNoise() method: dogs bark, cats meow, and snakes hiss

All animals eat: dogs eat anything, cats eat fish, snakes eat rodents

Demonstrate polymorphism and inheritance in your  TestAnimal class.
 * ******************************************/


// FILE IMPORT SECTION


// FUNCTION DECLARATION/PROTOTYPES SECTION


public class Cat extends Animal {

  private String breed;
  
  public Cat () {
      // super();
      System.out.println("In Cat() constructor");
  }
  
  public Cat (String name, String breed) {
      super (name);
      System.out.println("In Cat(String, String) constructor");
      setBreed(breed);
  }
  
  @Override
  public String eat() { // override Animal eat
      return ("The cat eats fish.");
  }
  
  @Override
  public String eat(String s) { // override Animal eat(S) and overload
      return ("The cat eats " + s);
  }

  @Override
  public String makeNoise() {
      return ("The cat meows");
  }

  @Override
  public String toString() {
      // if name is private return "Cat{" + "name=" + super.getName() + " breed=" + breed + '}';
      return "Cat{" + "name=" + name + " breed=" + breed + '}';
  
  }

  public String getBreed() {
      return breed;
  }

  public void setBreed(String breed) {
      this.breed = breed;
  }
  
}
