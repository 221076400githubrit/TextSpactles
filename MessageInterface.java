
package za.tut.ac.bi;

import java.util.Map;
import za.tut.ac.entity.Message;


public interface MessageInterface {
    
    int messageLength(Message msg);
    int numberOfWhiteSpaces(Message msg);
    int numberOfCommas(Message msg);
    int numberOfFullStops(Message msg);
    int numberOfWords(Message msg);
    Map<String, Integer> wordOccurence(Message msg);
   
}
