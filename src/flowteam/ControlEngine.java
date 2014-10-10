/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowteam;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public class ControlEngine {

    public ArrayList<Person> enginePersonList;

    public ControlEngine() {

        enginePersonList = new ArrayList<Person>();
        ArrayList<String> stringPersonList = FileHandlerStat.load("people.txt");
        for (String stringPerson : stringPersonList) {
            Person tempPerson = new Person(stringPerson);
            enginePersonList.add(tempPerson);
        }
    }

    private void loadPeopleFromFile() {
        ArrayList<String> stringPersonList =  FileHandlerStat.load("people.txt");
        for (String stringPerson : stringPersonList) {
            Person tempPerson = new Person( stringPerson );//Contructor a string and make a Person object
            enginePersonList.add(tempPerson);
        }  

    }
    public void savehim(Person a){
        enginePersonList.add(a);
    }

    public ArrayList<Person> giveMeAllPeopleList() {
        return enginePersonList;

    }
    
        public void createNewPerson(String name, int adminscore, int analyzerscore, int finaliserscore, int creatorscore){
            Person p = new Person(name, adminscore, analyzerscore, finaliserscore, creatorscore);
            enginePersonList.add(p);
        }
    
    public String getSelectedPerson_stats(String selected){
        String result = "Empty";
        for (Person tempPerson : enginePersonList) {
            if(tempPerson.getName().equals(selected)){  
                
                result = tempPerson.getNiceGuiString();
            }
        }
        
        return result;
    }

}
