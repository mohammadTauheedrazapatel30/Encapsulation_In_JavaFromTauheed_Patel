/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2.encapsulation;

/**
 *
 * @author Mohammad Tauheed
 */
//Encapsulation is a process of combining data and functions into a single unit called "class"
public class Encaptest {
   
    private int id;
    private String name;
    private String address;
    private String branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Encaptest() {
    }
    
    // Constructors are the methods which have the same name as the name of the class and
      //required for specific task.
    public Encaptest(int id, String name, String address, String branch) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.branch = branch;
    }
    
    
}
