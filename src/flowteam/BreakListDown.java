/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flowteam;

import java.util.ArrayList;

/**
 *
 * @author Athinodwros
 */
public class BreakListDown {
    public String[] NoOfPeople ;
    public String[][] Table ;
    public static int i = 0;
    
    
    public static void main(String[] args) {
        
         ArrayList<Person> listPeople = new ArrayList<Person>();
        ArrayList<String> fromList = new ArrayList<String>();
        fromList = FileHandlerStat.load("people.txt");
        if(fromList == null){
            System.out.println("Something went wrong... load returned null");   
        }
        else{
            for(String peopleString : fromList){
                
                i++;
                
            }
        }
     String NoOfPeople[] = new String[i]; 
     String Table1[][] = new String[i][7]; 
     int li=0;
        for (String perString : fromList) {
            
            Person lol = new Person(perString);
            Table1[li][0]= String.valueOf(li+1);
            Table1[li][1]= lol.getName();
            Table1[li][2]= String.valueOf(lol.getAdmin());
            Table1[li][3]= String.valueOf(lol.getAnalyzer());
            Table1[li][4]= String.valueOf(lol.getCreator());
            Table1[li][5]= String.valueOf(lol.getFinisher());
            Table1[li][6]= "null";
            li++;
            
            
                    }
        for (int j = 0; j < 7; j++) {
            System.out.print(Table1[j][0]);
            System.out.print(Table1[j][1]);
            System.out.print(Table1[j][2]);
            System.out.print(Table1[j][3]);
            System.out.print(Table1[j][4]);
            System.out.print(Table1[j][5]);
            System.out.println(Table1[j][6]);
            
            
        }
       
            }
//            public ArrayList<String> Names(){
//             ArrayList<String> fromList = new ArrayList<String>();
//                String[] Name = new String[];
//                for (String perString : fromList) {
//                    Name[] = 
//                }
            
            }
                       
            
            
            
            
        
            

     
     
        
        
    
   
    
    

