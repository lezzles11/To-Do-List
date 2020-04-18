/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoList;

/**
 *
 * @author lesleycheung
 */
public class ToDo {
    private String item; 
    private boolean done; 

    public ToDo(String item) {
        this.item = item;
        this.done = false;
    }
    public void changeToDone() {
        this.done = false; 
    } 

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }


    public void setDone(boolean done) {
        this.done = done;
    }
    
    public String toString() {
        return this.item; 
    } 
    public String getDone() {
        if (this.done == true) {
            return "Done"; 
        } else {
            return "Not Done";
        }
    } 
    
    
}
