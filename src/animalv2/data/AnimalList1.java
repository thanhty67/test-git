/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalv2.data;

import animalv2.menu.Menu;
import animalv2.tool.Utils;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ThanhTy
 */
public class AnimalList1 {

    private ArrayList<Animal> animal = new ArrayList();

//    public void addNewAnimal() {
//        int choice;
//        Menu subMenu = new Menu("Choice type to add new annimal!");
//        subMenu.addNewOption("1. No-legged animal");
//        subMenu.addNewOption("2. Four-legged animal");
//        subMenu.addNewOption("3. Exit");
//        do {
//            subMenu.showMenu();
//            choice = subMenu.getChoice1();
//
//            switch (choice) {
//                case 1:
//                    String id, name, color,moving, character;
//                    int pos;
//                    double weight;
//                    System.out.println("Add No-legged animal");
//                    do {
//                        id = Utils.getString("Input ID: ", "Input fail");
//                        pos = findById(id);
//                        if (pos != -1) {
//                            System.out.println("Dupplicate ID!");
//                        }
//                    } while (pos != -1);
//                    name = Utils.getString("Input name: ", "Input fail");
//                    color = Utils.getString("Input color: ", "Input fail");
//                    moving = Utils.getString("Input how to move: ", "Input fail");
//                    character = Utils.getString("Input Character: ", "Input fail");
//                    weight = Utils.getADouble("Input weight: ", "Input fail");
//                    animal.add(new NoLegged(id, name, color, moving, weight, character));
//                    System.out.println("----ADDED----");
//                    System.out.println(" ");
//                    break;
//                case 2:
//                    String eatting;
//                    System.out.println("Add Four-legged animal");
//                    do {
//                        id = Utils.getString("Input ID: ", "Input fail");
//                        pos = findById(id);
//                        if (pos != -1) {
//                            System.out.println("Dupplicate ID!");
//                        }
//                    } while (pos != -1);
//                    name = Utils.getString("Input name: ", "Input fail");
//                    color = Utils.getString("Input color: ", "Input fail");
//                    moving = Utils.getString("Input how to move: ", "Input fail");
//                    character = Utils.getString("Input character: ", "Input fail");
//                    eatting = Utils.getString("Input eatting: ", "Input fail");
//                    weight = Utils.getAnInteger("Input weight: ", "Input fail");
//                    animal.add(new FourLegged(id, name, color, moving, weight, character, eatting));
//                    System.out.println("----ADDED----");
//                    System.out.println(" ");
//                    break;
//                case 3:
//                    System.out.println("Bye!");
//                    break;
//            }
//        } while (choice != 3);
//    }

    public void addNoLeg(){
        String id, name, color,moving, character;
                    int pos;
                    double weight;
                    System.out.println("Add No-legged animal");
                    do {
                        id = Utils.getString("Input ID: ", "Input fail");
                        pos = findById(id);
                        if (pos != -1) {
                            System.out.println("Dupplicate ID!");
                        }
                    } while (pos != -1);
                    name = Utils.getString("Input name: ", "Input fail");
                    color = Utils.getString("Input color: ", "Input fail");
                    moving = Utils.getString("Input how to move: ", "Input fail");
                    character = Utils.getString("Input Character: ", "Input fail");
                    weight = Utils.getADouble("Input weight: ", "Input fail");
                    animal.add(new NoLegged(id, name, color, moving, weight, character));
                    System.out.println("----ADDED----");
                    System.out.println(" ");
    }
    
    public void addFourLeg(){
        String id, name, color,moving, character;
        String eatting;
        int pos;
        double weight;
                    System.out.println("Add Four-legged animal");
                    do {
                        id = Utils.getString("Input ID: ", "Input fail");
                        pos = findById(id);
                        if (pos != -1) {
                            System.out.println("Dupplicate ID!");
                        }
                    } while (pos != -1);
                    name = Utils.getString("Input name: ", "Input fail");
                    color = Utils.getString("Input color: ", "Input fail");
                    moving = Utils.getString("Input how to move: ", "Input fail");
                    character = Utils.getString("Input character: ", "Input fail");
                    eatting = Utils.getString("Input eatting: ", "Input fail");
                    weight = Utils.getAnInteger("Input weight: ", "Input fail");
                    animal.add(new FourLegged(id, name, color, moving, weight, character, eatting));
                    System.out.println("----ADDED----");
                    System.out.println(" ");
    }
    
    public int findById(String id) {
        if (animal.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < animal.size(); i++) {
            if (animal.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
    
    public void showAnimalByType(){
        Menu subMenu = new Menu("----Show animal by type----");
        subMenu.addNewOption("1. Show Four-legs animal");
        subMenu.addNewOption("2. Show 0-legs animal");
        subMenu.addNewOption("3. Exit!");
        int choice;
        do {  
           
           subMenu.showMenu();
           choice = subMenu.getChoice1();
           switch(choice){
               case 1:
                   //Animal a = new FourLegged()
                   showFourLeg();
                   break;
               case 2:
                   showNoLeg();
                   break;
               case 3:
                   System.out.println("Bye!");
                   break;
           }
        } while (choice != 3);
    }

            
    public void showFourLeg() {
        Collections.sort(animal);
        System.out.println("----Group of 4-legged animals----");
        for (Animal x : animal) {
            if (x instanceof FourLegged) {
                x.showAnimal();
            }
        }
    }

    public void showNoLeg() {
        Collections.sort(animal);
        System.out.println("----Group of 0-legged animals----");
        for (Animal x : animal) {
            if (x instanceof NoLegged) {
                x.showAnimal();
            }
        }
    }

    public void showAll() {
        Collections.sort(animal);
        System.out.println("----Animal list----");
        for (Animal x : animal) {
            x.showAnimal();
        }
    }

    public void updateAnimal() {
        String id, name, color,moving, character, eatting;
        double weight;
        Animal pos;
        
        id = Utils.getString("Input ID you want to update: ", "ID does not empty!");
        pos = findAnimalById(id);
        if (pos == null) {
            System.out.println("Animal does not exist");
        } else {
            if (pos instanceof FourLegged) {
                name = Utils.getString("Input name: ", "Input fail");
                color = Utils.getString("Input color: ", "Input fail");
                moving = Utils.getString("Input how to move: ", "Input fail");
                eatting = Utils.getString("Input eatting: ", "Input fail");
                character = Utils.getString("Input Character: ", "Input fail");
                weight = Utils.getADouble("Input weight: ", "Input fail");
                pos.setName(name);
                pos.setColor(color);
                pos.setMoving(moving);
                ((FourLegged) pos).setEatting(eatting);
                pos.setCharacter(character);
                pos.setWeight(weight);
                System.out.println("----After update----");
                pos.showAnimal();
            }
            else if (pos instanceof NoLegged) {
                name = Utils.getString("Input name: ", "Input fail");
                color = Utils.getString("Input color: ", "Input fail");
                moving = Utils.getString("Input how to move: ", "Input fail");
                character = Utils.getString("Input Character: ", "Input fail");
                weight = Utils.getADouble("Input weight: ", "Input fail");
                pos.setName(name);
                pos.setColor(color);
                pos.setMoving(moving);
                pos.setCharacter(character);
                pos.setWeight(weight);
                System.out.println("----After update----");
                pos.showAnimal();
            }
        }
    }
 
    public void deleteById(){
        int pos;
        String id;
        id = Utils.getString("Input ID you want to update: ", "ID does not empty!");
        pos = findById(id);
        if (pos == -1) {
            System.out.println("Animal does not exist");
        }
        else{
            animal.remove(pos);
            System.out.println("----Removed----");
        }
    }
    
    public void searchAnimalByName(){
        String name;
        Animal pos;
        name = Utils.getString("Input name you want to search", "Name does not empty");
        pos = findAnimalByName(name);
        if(pos == null)
            System.out.println("Animal does not exist");
        else{
            System.out.println("Here is animal you want to search");
            pos.showAnimal();
        }
    }
    
    public Animal findAnimalByName(String name){
        if(animal.isEmpty())
            return null;
        for (int i = 0; i < animal.size(); i++) {
            if(animal.get(i).getName().equalsIgnoreCase(name))
                return animal.get(i);
        }
        return null;
    }
    
    public Animal findAnimalById(String id) {
        if (animal.isEmpty()) {
            return null;
        }
        for (int i = 0; i < animal.size(); i++) {
            if (animal.get(i).getId().equalsIgnoreCase(id)) {
                return animal.get(i);
            }
        }
        return null;
    }
}
