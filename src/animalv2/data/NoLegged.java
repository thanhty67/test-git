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
public class NoLegged extends Animal{

    public NoLegged() {
    }

    public NoLegged(String id, String name, String color, String moving, double weight, String character) {
        super(id, name, color, moving, weight, character);
    }

    @Override
    public String toString() {
        return "NoLegged{" + '}';
    }
    
    @Override
    public void showAnimal() {
        System.out.println("ID: " + id + "Name: " + name + ", Color: " + color + ", Weight: " 
                + weight +  ", Character: " + character + "Hunt smalls animals and devour them ");
        
    }
    
}
