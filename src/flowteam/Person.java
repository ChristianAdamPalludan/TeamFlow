/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flowteam;

/**
 *
 * @author Adam
 */


public class Person {
    private String name;
    private int admin;
    private int finisher;
    private int analyzer;
    private int creator;

    public Person(String name, int admin, int finisher, int analyzer, int creator) {
        this.name = name;
        this.admin = admin;
        this.finisher = finisher;
        this.analyzer = analyzer;
        this.creator = creator;
    }

    public String getNiceGuiString(){
        return name + ": \nAdmin: " + admin + "\nFinisher: " + finisher + 
                "\nAnalyzer: " + analyzer + "\nCreator:" + creator; 
    }
    
    
     public String toString(){
    return name + "," + admin + "," + finisher + "," + analyzer + "," + creator;
}
    
     public Person(String specialPeopleString){
         String[] splitted = specialPeopleString.split(",");
         name = splitted[0];
         admin = Integer.parseInt(splitted[1]);
         finisher = Integer.parseInt(splitted[2]);
         analyzer = Integer.parseInt(splitted[3]);
         creator = Integer.parseInt(splitted[4]);
     }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getFinisher() {
        return finisher;
    }

    public void setFinisher(int finisher) {
        this.finisher = finisher;
    }

    public int getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(int analyzer) {
        this.analyzer = analyzer;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }
    
    
   
}
