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
public class RunEncap {
    
    public static void main(String[] args) {
        
        Encaptest encap = new Encaptest();
        
        encap.setId(0);
        encap.setName("Tauheed");
        encap.setAddress("Sadar");
        encap.setBranch("CSE");
        
        System.out.println("Id : " + encap.getId());
        System.out.println("Name : " + encap.getName());
        System.out.println("Address : " + encap.getAddress());
        System.out.println("Branch : " + encap.getBranch());
    }
            
}
