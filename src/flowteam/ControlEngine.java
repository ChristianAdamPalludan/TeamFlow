/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowteam;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class ControlEngine {

    private ArrayList<Person> enginePersonList;
    
    public ControlEngine() {
        
        enginePersonList = new ArrayList<Person>();
        ArrayList<String> stringPersonList = FileHandlerStat.load("people.txt");
            for(String stringPerson : stringPersonList){
                Person tempPerson = new Person(stringPerson);
                enginePersonList.add(tempPerson);
            }
    }

    private void loadPeopleFromFile(){
        
    }
    public ArrayList<Person> giveMeAllPeopleList() {
        return enginePersonList;

    }

}
