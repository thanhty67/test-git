/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalv2.data;

/**
 *
 * @author ThanhTy
 */
public abstract class Animal implements Comparable<Animal>{
    protected String id;
    protected String name;
    protected String color;
    protected String moving;
    protected double weight;
    protected String character;

    public Animal() {
    }

    public Animal(String id, String name, String color, String moving, double weight, String character) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.moving = moving;
        this.weight = weight;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMoving() {
        return moving;
    }

    public void setMoving(String moving) {
        this.moving = moving;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
    
    @Override
    public int compareTo(Animal t){
        return this.id.compareToIgnoreCase(t.id);
    }
    
    public abstract void showAnimal();
}
