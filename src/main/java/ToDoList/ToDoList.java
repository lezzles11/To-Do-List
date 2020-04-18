/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoList;

import java.util.ArrayList;

/**
 *
 * @author lesleycheung
 */
public class ToDoList {
    private ArrayList<ToDo> list; 

    public ToDoList(ArrayList<ToDo> list) {
        this.list = list;
    }
    public ToDoList() {
        this.list = new ArrayList<>();
    } 

    public ArrayList<ToDo> getList() {
        return list;
    }

    public void setList(ArrayList<ToDo> list) {
        this.list = list;
    }
    public void add(ToDo item) {
        this.list.add(item);
    } 
    public void remove(ToDo item) {
        for (int i = 0; i < list.size(); i++) {
            if (item.equals(list.get(i))) {
                this.list.remove(i);
            } 
        } 
    }
    public void markDone(int num) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).changeToDone();
        }
    }
    public void remove(int num) {
        int actualNum = num; 
        this.list.remove(actualNum);
        
    } 
    public int size() {
        return this.list.size();
    } 
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            int actualNum = i + 1; 
            System.out.println("Item " + actualNum + " :" + list.get(i).getItem()); 
            System.out.println("Status: " + list.get(i).getDone());
        }
    } 
} 
