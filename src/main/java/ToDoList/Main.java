/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoList;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author lesleycheung
 */
public class Main {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Type in a to do: ");
        
        ToDo itemOne = new ToDo("Buy apple");
        // ToDoList class
        ToDoList todolist = new ToDoList();
        while (true) {
            menu();
            String option = reader.nextLine();
        // If the user puts in one
            if (option.equals("1")) {
                System.out.println("Enter Item: ");
                // Ask for the item 
                String firstItem = reader.nextLine();

                // Create a new to do 
                ToDo newItem = new ToDo(firstItem);

                // print out the to do 
                System.out.println(newItem);

                todolist.add(newItem); 
                
            } else if (option.equals("2")) {
                
                todolist.print();
            } else if (option.equals("3")) {
                
                todolist.print();
                
                System.out.println("Now, type in the item you want to delete");
                
                int nextInput = parseInt(reader.nextLine());
                
                todolist.remove(nextInput);
                todolist.print();
            } else if (option.equals("4")) {
                System.out.println("Which item would you like to mark complete?");
                todolist.print();
                int nextInput = parseInt(reader.nextLine());
                todolist.markDone(nextInput);
            } else { 
                break; 
        }
            
        }
        
        // User input 
        
        
        
        
        
        
        
    }
    public static void menu() {
        System.out.println("Type in [1] to create a to do");
        System.out.println("Type in [2] to see the list");
        System.out.println("Type in [3] to delete an item");
        System.out.println("Type in [4] to mark a item complete");
        System.out.println("Type in [5] to exit");
    } 
   
}
