/*
 Document   : admin
    Created on : july 11, 2021, 4:00:00 PM
    Author     : hd
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalv2.data;

import animalv2.menu.Menu;
import animalv2.tool.Utils;

/**
 *
 * @author hd
 */
public class Using {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Animal V2.");
        int choice;
        Menu menu = new Menu("----The Zoo Mangement----");
        menu.addNewOption("1. Add new animal");
        menu.addNewOption("2. Show animal list by Type");
        menu.addNewOption("3. Show All");
        menu.addNewOption("4. Update");
        menu.addNewOption("5. Delete animal");
        menu.addNewOption("6. Search animal by name");
        menu.addNewOption("Others: Quit");
        AnimalList list = new AnimalList();
        do {           
            menu.showMenu();
            choice = menu.getChoice();
            switch(choice) {
                case 1:
                    
                    list.addNewAnimal();
                    break;
                case 2:
                    System.out.println("----Show animal by type----");
                    list.showAnimalByType();
                    break;    
                case 3:
                    list.showAll();
                    break;
                   
                case 4:
                    System.out.println("----Update animal by ID----");
                    list.updateAnimal();
                    break;    
                case 5:
                    System.out.println("----Delete Animal by ID----");
                    list.deleteById();
                    break;
                case 6:
                    System.out.println("----Search animal by name----");
                    list.searchAnimalByName();
                    break;
                    
                default:
                    System.out.println("Bye!!");
                    break;
                            
            }
        } while (choice >= 1 || choice <= 7);
    }

}
