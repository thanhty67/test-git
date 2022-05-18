/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalv2.menu;

import animalv2.tool.Utils;
import java.util.ArrayList;

/**
 *
 * @author ThanhTy
 */
public class Menu {
    private ArrayList<String> menu = new ArrayList();
    private String menuTittle;

    public Menu() {
    }

    public Menu(String menuTittle) {
        this.menuTittle = menuTittle;
    }

    public void addNewOption(String newOption) {
        menu.add(newOption);
    }

    public void showMenu() {
        if (menu.isEmpty()) {
            System.out.println("No item to show!");
            return;
        }
        System.out.println(menuTittle);
        for (String x : menu) {
            System.out.println(x);
        }
    }

    public int getChoice(){
        int maxOption = menu.size();
        String inputMsg = "Choice 1..." + maxOption + ": ";
        String errorMsg = "You must choice the option in 1..." + maxOption + "! ";
        return Utils.getAnInteger(inputMsg, errorMsg);
    }
    
    public int getChoice1(){
        int maxOption = menu.size();
        String inputMsg = "Choice 1..." + maxOption + ": ";
        String errorMsg = "You must choice the option in 1..." + maxOption + "! ";
        return Utils.getAnInteger(inputMsg, errorMsg, 1, maxOption);
    }
    
}
