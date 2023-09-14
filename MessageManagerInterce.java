/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.tut.ac.bi;

import java.util.HashMap;
import java.util.Map;
import za.tut.ac.entity.Message;

/**
 *
 * @author 001
 */
public class MessageManagerInterce implements MessageInterface{

    @Override
    public int messageLength(Message msg) {
        return msg.getMessage().getBytes().length*8;
    }

    @Override
    public int numberOfWhiteSpaces(Message msg) {
        return msg.getMessage().split("\\s").length-1;
    }

    @Override
    public int numberOfCommas(Message msg) {
        return msg.getMessage().split(",").length-1;
    }

    @Override
    public int numberOfFullStops(Message msg) {
        return msg.getMessage().split(".").length+1;
    }

    @Override
    public int numberOfWords(Message msg) {
        return msg.getMessage().split("\\w").length-1;
    }

    @Override
    public Map<String, Integer> wordOccurence(Message msg) {
        
        Map<String, Integer> words = new HashMap<>();
        
        String[] spl = msg.getMessage().split(" ");
        
        for (String wordKey : spl) {
            
            if (words.containsKey(wordKey)) {
                
                int wordsOccure = words.get(wordKey);
                wordsOccure++;
     
                words.put(wordKey, wordsOccure);
                
            } else {
                
                words.put(wordKey, 1);
            }
            
        }
        return words;
    }
    
}
