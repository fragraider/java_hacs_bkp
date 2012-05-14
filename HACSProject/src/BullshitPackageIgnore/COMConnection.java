/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package COMConnect;

import gnu.io.CommPort;

/**
 *
 * @author Notandi
 */
public class COMConnection {
    
    CommPort comPort = null;
    
        try
        {
            //the method below returns an object of type CommPort
            commPort = selectedPortIdentifier.open("TigerControlPanel", TIMEOUT);
            //the CommPort object can be casted to a SerialPort object
            serialPort = (SerialPort)commPort;

            //for controlling GUI elements
            setConnected(true);
            

    
    
}
