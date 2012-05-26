/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
/** @file */
import java.sql.SQLException;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;
import protocol.HacsPacket;
import protocol.Packet;
import serial.FrameEvent;
import serial.FrameEventListener;
import serial.SerialTransceiver;

/**
 * The <code>RFIDEventManagerSimple</code> class is the central controller in the
 * application. It receives requests from the serial port, processes them and
 * transmits the response.
 * The <code>RFIDEventManagerSimple</code> is implemented using the State design pattern.
 * @version 16/02/10
 * @author ibr
 */
public class RFIDEventManagerSimple implements FrameEventListener {

    private SerialTransceiver transmitter;
    private String portNumber = "COM3";//
    private String source = "34";
    private String destination = "12";
    private Packet packet;
    private String RFIDchecked = null;
    private String RFIDsent = null;

    public RFIDEventManagerSimple() {
    }

    /**
     * Get the value of source
     *
     * @return the value of source
     */
    public synchronized String getSource() {
        return source;
    }

    /**
     * Set the value of source
     *
     * @param source new value of source
     */
    public synchronized void setSource(String source) {
        this.source = source;
    }

    /**
     * Get the value of packet
     *
     * @return the value of packet
     */
    public synchronized Packet getPacket() {
        return packet;
    }

    /**
     * Get the value of destination
     *
     * @return the value of destination
     */
    public synchronized String getDestination() {
        return destination;
    }

    /**
     * Set the value of destination
     *
     * @param destination new value of destination
     */
    public synchronized void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Set the value of transmitter
     * @param transmitter new value of transmitter
     */
    public synchronized void setTransmitter(SerialTransceiver transmitter) {
        this.transmitter = transmitter;
    }

    /**
     * Open the transmitter serial port.
     * @throws TooManyListenersException
     */
    public synchronized void openPort() throws TooManyListenersException {
        if (transmitter != null) {
            transmitter.openPort(portNumber);
        }
    }

    /**
     * Close the transmitter serial port.
     */
    public synchronized void closePort() {
        if (transmitter != null) {
            transmitter.closePort();
        }
    }

    /**
     * Send the <code>RFIDResponse</code> as an <code>HacsPacket</code> using
     * the serial transmitter. 
     * @param rFIDResponse the response to send
     */
    public synchronized void sendRFIDResponse(String status, String data) {
        HacsPacket hacsPacket = new HacsPacket(source, destination, status, data);
        transmitter.transmit(hacsPacket.getBytes());
    }

    /**
     * The method called by the <code>SerialFrame</code> when a complete 
     * data packet is received.
     * @param frameEvent the frame event
     */
    public synchronized void frameReady(FrameEvent frameEvent) {
        byte[] received  = frameEvent.getData();
        System.out.print("\nReceived at Server: [");
        System.out.println(new String(received) + "]");
        packet = new HacsPacket(received);
        System.out.println("           command: [" + packet.getCommandStatus() + "]");
        System.out.println("           data:    [" + packet.getData() + "]");
        //TO DO Process request and send response
        try {
            processRequest(packet);
        } catch (SQLException ex) {
            Logger.getLogger(RFIDEventManagerSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
       

        
        
    }

    /**
     * @brief Processes the data sent by 
     * 
     * Elaborate description....kjsadflkj 
     * 
     * @param packet
     * @throws SQLException 
     * 
     */
    private void processRequest(Packet packet) throws SQLException {
        //THIS CODE IS FOR SIMPLE DEMONSTRATION ONLY.
        //IT IS DIFFICULT TO MAINTAIN AND TEST.
        //IT SHOULD BE REPLACED BY EG. COMMAND PATTERN IN THE LATER DESIGN
        String command = packet.getCommandStatus();
        if (command.equals("01")) {
            sendRFIDResponse("12", "Accept");
        }
        else if(command.equals("09")){
        this.RFIDchecked = checkRFID(packet.getData());
        this.RFIDsent = packet.getData().substring(9);   
        //9 is an arbitrary number because I dont know what the package is going to look like. 
        //Im just pulling the last 9 characters from getData. 
        
        if(RFIDsent.equals(this.RFIDchecked)){
            sendRFIDResponse("13", "Accept");    //arbitrary answer. 
        }
        //else 14 deny...sdf
        }
    }
    
    private String checkRFID(String data) throws SQLException{
        controller.SerialParser serialParser = new controller.SerialParser();
        serialParser.committRFID(data);
        return serialParser.toString();
    }
    
    
}
