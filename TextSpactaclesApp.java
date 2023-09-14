
package textspactaclesapp;

import java.util.Map;
import java.util.Scanner;
import za.tut.ac.bi.MessageManagerInterce;
import za.tut.ac.entity.Message;


public class TextSpactaclesApp {


    public static void main(String[] args) {
        Message message;
        
        MessageManagerInterce mi = new MessageManagerInterce();
        
        int length = 0, whitespace = 0, commas = 0, fullstops = 0, words = 0;
        
        int option = Option();
        
        while (option != 7) {       
     
            message = textMessage();
            
            switch(option){
                
                case 1:
                    //Length of the message in bytes 
                    length = mi.messageLength(message);
                    
                    System.out.print("The length of the message is " + length+" byte.");
                    
                    break;
                case 2:
                    //Number of white spaces
                    whitespace = mi.numberOfWhiteSpaces(message);
                    
                    System.out.println("The number of white spaces is " + whitespace);
                    
                    break;
                case 3:
                    //Number of commas
                    commas = mi.numberOfCommas(message);
                    
                    System.out.println("The number of commas is " + commas);
                    
                    break;
                case 4:
                    //Number of fullstops
                    fullstops = mi.numberOfFullStops(message);
                    
                    System.out.println("The number of full stops is " + fullstops);
                    
                    break;
                case 5:
                    //Number of words
                    words = mi.numberOfWords(message);
                    
                    System.out.println("The number of words is " + words);
                    break;
                case 6:
                    //Number of words occurence
                    Map<String, Integer> map = mi.wordOccurence(message);
                    
                    System.out.println("==================================================");
                    for (Map.Entry entry : map.entrySet()) {
                        
                        System.out.println(entry.getKey()+ " ====> " + entry.getValue());
                        
                    }
                    
                    break;
            }
            option = Option();
        }
        System.out.println("\nGoodBye!!");
    }
    
    private static int Option() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        System.out.print("\n\nPlease enter the following option : " +"\n"+
                           "1. Length of the message in bytes." +"\n"+
                           "2. Get number of white spaces." +"\n"+
                           "3. Get number of commas." +"\n"+
                           "4. Get number of fullstops." +"\n"+
                           "5. Get number of words." +"\n"+
                           "6. Get number of occurence." +"\n"+
                           "7. Exit." +"\n"+
                           "\nYour choice : ");
        option = sc.nextInt();
        return option;
    }
    
    public static Message textMessage(){
        Message message;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Message : ");
        String msg = sc.nextLine();
        
        message = new Message(msg);
        return message;
    }
  
}
