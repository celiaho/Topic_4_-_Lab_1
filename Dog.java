/* File: Topic 4 Lab 1 - Dog.java
 * Programmer: Celia Ho
 * Last Modified: Tue 19 Mar 2024
 * Description: Using Animal and Dog classes, add a Cat and Snake class. 

All Animals have a makeNoise() method: dogs bark, cats meow, and snakes hiss

All animals eat: dogs eat anything, cats eat fish, snakes eat rodents

Demonstrate polymorphism and inheritance in your  TestAnimal class.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package chapter11;


public class Dog extends Animal {
    private String breed;

    public Dog () {
        // super();
        System.out.println("In Dog() constructor");
    }

    public Dog (String name, String breed) {
        super (name);
        System.out.println("In Dog(String, String) constructor");
        setBreed(breed);
    }
    
    @Override
    public String eat() { // override Animal eat
        return ("The dog eats smelly things.");
    }
    
    @Override
    public String eat(String s) { // override Animal eat(S) and overload
        return ("The dog eats " + s);
    }
    
    @Override
    public String makeNoise() {
      return ("The dog barks");
    }

    @Override
    public String toString() {
       // if name is private return "Dog{" + "name=" + super.getName() + " breed=" + breed + '}';
        return "Dog{" + "name=" + name + " breed=" + breed + '}';
    
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
