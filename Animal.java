/**
 * File: Topic 4 Lab 1 - Animal.java
 * Programmer: Celia Ho
 * Last Modified: Tue 19 Mar 2024
 * Description: Using Animal and Dog classes, add a Cat and Snake class. 

All Animals have a makeNoise() method: dogs bark, cats meow, and snakes hiss

All animals eat: dogs eat anything, cats eat fish, snakes eat rodents

Demonstrate polymorphism and inheritance in your  TestAnimal class.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package chapter11;
/*
public > default > private
public > default > protected > private
*/
/**
 *
 * @author lizmiller
 */

public class Animal extends Object {
    protected String name; // available to all subclasses
    
    public Animal() { // overloaded constructor #1
        System.out.println("In Animal() constructor");
    }
    public Animal(String name) { // overloaded constructor #2
        System.out.println("In Animal(String) constructor");
        setName(name);
    }
    public String eat() { // overloaded eat method
        return ("The animal eats");
    }
    public String eat(String s) { // overrloaded eat method
        return ("The animal eats " + s);
    }

    public String makeNoise() {
        return ("The animal makes noise");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';  //*** WORK ON THIS */
    }
    
}
