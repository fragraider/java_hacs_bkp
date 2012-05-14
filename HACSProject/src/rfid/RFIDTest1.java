/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rfid;

import java.util.TooManyListenersException;

/**
 *
 * @author Notandi
 */
public class RFIDTest1 {
    public static void main(String args[]) throws TooManyListenersException{
         
        RFIDReaderSimpleSimulator simulator = new RFIDReaderSimpleSimulator();
        simulator.connect();
        controller.RFIDEventManagerSimple EventManager = new controller.RFIDEventManagerSimple();
        
    }
    
    
}
