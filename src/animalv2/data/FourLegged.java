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
public class FourLegged extends Animal {

    private String eatting;

    public FourLegged() {
    }

    public FourLegged(String id, String name, String color, String moving, double weight, String character, String eatting) {
        super(id, name, color, moving, weight, character);
        this.eatting = eatting;
    }

    public String getEatting() {
        return eatting;
    }

    public void setEatting(String eatting) {
        this.eatting = eatting;
    }

    @Override
    public String toString() {
        return "FourLegged{" + "eatting=" + eatting + '}';
    }

    @Override
    public void showAnimal() {
        System.out.println("ID: " + id + "Name: " + name + ", Color: " + color + ", Weight: "
                + weight + ", Character: " + character + "Eating: " + eatting + "Hunt big animals and eat meat without cooking");

    }

}
