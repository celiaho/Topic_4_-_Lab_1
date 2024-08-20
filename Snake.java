/* *****************************************
 *  File : Topic 4 Lab 1 - Snake.java
 *  Author : Celia Ho  
 *  Last Modified: Tue 19 Mar 2024
 *  Description : Using Animal and Dog classes, add a Cat and Snake class. 

All Animals have a makeNoise() method: dogs bark, cats meow, and snakes hiss

All animals eat: dogs eat anything, cats eat fish, snakes eat rodents

Demonstrate polymorphism and inheritance in your  TestAnimal class.
 * ******************************************/


 public class Snake extends Animal {
  private String breed;
  public Snake () {
     // super();
      System.out.println("In Snake() constructor");
  }
  public Snake (String name, String breed) {
      super (name);
      System.out.println("In Snake(String, String) constructor");
      setBreed(breed);
  }
  
  @Override
  public String eat() { // override Animal eat
      return ("The snake eats rodents.");
  }
  
  @Override
  public String eat(String s) { // override Animal eat(S) and overload
      return ("The snake eats " + s);
  }
  
  @Override
  public String makeNoise() {
    return ("The snake hisses");
  }

  @Override
  public String toString() {
     // if name is private return "Snake{" + "name=" + super.getName() + " breed=" + breed + '}';
      return "Snake{" + "name=" + name + " breed=" + breed + '}';
  
  }

  public String getBreed() {
      return breed;
  }

  public void setBreed(String breed) {
      this.breed = breed;
  }
  
}
