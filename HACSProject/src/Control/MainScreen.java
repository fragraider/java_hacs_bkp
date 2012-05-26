    /** 
     * @brief GUI interface to the database. 
     * 
     * This is a GUI class. Most of it is autogenerated by netbeans. It has a ComboBox of existing RFID's that feeds the selected RFID into a TextBox. When TextBox has an RFID which exists in the database the user can get and update the configuration belonging to that RFID. This class does nothing other than feeding into and taking out of the database. 
     * 
     * auth@ Eirikur Emilsson  
     */
package Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Notandi
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     *@brief Variables
     * 
     * firstRun is just to keep track of whether or not the combobox is being opened for the first time. 
     */
    private int firstRun = 1;
    //private int selc;
    
    

    public MainScreen() {


        initComponents();
        //refreshRFIDList();
//Búa til clear á þetta og method til að geta kallað þennan lista fram aftur og aftur. 

refreshRFIDList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        createUserButton = new javax.swing.JButton();
        RFIDField = new javax.swing.JTextField();
        delUserButton = new javax.swing.JButton();
        getConfigButton = new javax.swing.JButton();
        updateConfigButton = new javax.swing.JButton();
        ItemTextField1 = new javax.swing.JTextField();
        ItemTextField2 = new javax.swing.JTextField();
        ItemTextField3 = new javax.swing.JTextField();
        ItemTextField5 = new javax.swing.JTextField();
        ItemTextField4 = new javax.swing.JTextField();
        ItemTextField6 = new javax.swing.JTextField();
        ItemTextField8 = new javax.swing.JTextField();
        ItemTextField7 = new javax.swing.JTextField();
        ItemTextField9 = new javax.swing.JTextField();
        PINTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RFIDList = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        validRFIDCheckBox = new javax.swing.JCheckBox();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createUserButton.setText("Create User");
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
            }
        });

        RFIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RFIDField.setText("RFID");
        RFIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFIDFieldActionPerformed(evt);
            }
        });

        delUserButton.setText("Delete User");
        delUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delUserButtonActionPerformed(evt);
            }
        });

        getConfigButton.setText("Get Config");
        getConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getConfigButtonActionPerformed(evt);
            }
        });

        updateConfigButton.setText("Update Config");
        updateConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateConfigButtonActionPerformed(evt);
            }
        });

        ItemTextField1.setText("0");
        ItemTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTextField1ActionPerformed(evt);
            }
        });

        ItemTextField2.setText("0");
        ItemTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTextField2ActionPerformed(evt);
            }
        });

        ItemTextField3.setText("0");

        ItemTextField5.setText("0");
        ItemTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTextField5ActionPerformed(evt);
            }
        });

        ItemTextField4.setText("0");
        ItemTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTextField4ActionPerformed(evt);
            }
        });

        ItemTextField6.setText("0");

        ItemTextField8.setText("0");
        ItemTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTextField8ActionPerformed(evt);
            }
        });

        ItemTextField7.setText("0");
        ItemTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTextField7ActionPerformed(evt);
            }
        });

        ItemTextField9.setText("0");

        PINTextField.setText("0000");

        jLabel2.setText("Item1");

        jLabel3.setText("Item2");

        jLabel4.setText("Item3");

        jLabel5.setText("Item4");

        jLabel6.setText("Item5");

        jLabel7.setText("Item6");

        jLabel8.setText("Item7");

        jLabel9.setText("Item8");

        jLabel10.setText("Item9");

        jLabel11.setText("PIN#");

        RFIDList.setToolTipText("Select RFID");
        RFIDList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFIDListActionPerformed(evt);
            }
        });

        jLabel12.setText("Select or write an RFID ");

        validRFIDCheckBox.setLabel("Valid RIFD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RFIDList, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ItemTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ItemTextField2)
                                        .addComponent(ItemTextField3)
                                        .addComponent(ItemTextField5)
                                        .addComponent(ItemTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ItemTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ItemTextField8)
                                        .addComponent(ItemTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ItemTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(validRFIDCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PINTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RFIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(getConfigButton))
                            .addComponent(createUserButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delUserButton)
                            .addComponent(updateConfigButton))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RFIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(RFIDList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PINTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validRFIDCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUserButton)
                    .addComponent(delUserButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getConfigButton)
                    .addComponent(updateConfigButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      /**
     *@brief Create User button creates an RFID in database. 
     * 
     * This button creates a line for the user in the database. The user/RFID is created with a 1234 pin number and empty configuration otherwise. If an RIFD already exists it is not updated and the configuration is unchanged. 
     */    
    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserButtonActionPerformed
        String RFID1 = RFIDField.getText();
        try {
            Database.QueryExchange newUserObj = new Database.QueryExchange();
            newUserObj.newUser(RFID1);
            newUserObj.newConfig(RFID1, 1234, 0, 0, 0, 0, 0, 0, 0, 0, 0);   //Bullshit configuration to initialize values. 
        } catch (SQLException ex) {
            Logger.getLogger(RFID1);   //RFID1 as payload makes no sense. TODO. 
        }
        
        refreshRFIDList();  //Update Combolist. 
    }//GEN-LAST:event_createUserButtonActionPerformed
    /**
     *@brief Updates the configuration for a user/RFID. 
     * 
     * Once a configuration for a given RFID is changed it can be saved with this button. It is very dangerous in the sense that it is very easy to overwrite a configuration with either an empty configuration or a configuration for a different RFID and there is no prompt to save the user. 
     */
    private void updateConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateConfigButtonActionPerformed
        String RFID1 = RFIDField.getText();
        try {
            Database.QueryExchange userUpdateObj = new Database.QueryExchange();
            userUpdateObj.newConfig(RFID1, Integer.parseInt(PINTextField.getText()), Integer.parseInt(ItemTextField1.getText()), Integer.parseInt(ItemTextField2.getText()), Integer.parseInt(ItemTextField3.getText()), Integer.parseInt(ItemTextField4.getText()), Integer.parseInt(ItemTextField5.getText()), Integer.parseInt(ItemTextField6.getText()), Integer.parseInt(ItemTextField7.getText()), Integer.parseInt(ItemTextField8.getText()), Integer.parseInt(ItemTextField9.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(RFID1);   //RFID1 as payload makes no sense. TODO. 
        }
    }//GEN-LAST:event_updateConfigButtonActionPerformed
    /**
     *@brief Item field for configuration for a single item in the configuration. 
      */
    private void ItemTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemTextField1ActionPerformed
    /**
     *@brief Item field for configuration for a single item in the configuration. 
      */
    private void ItemTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemTextField4ActionPerformed
    /**
     *@brief Item field for configuration for a single item in the configuration. 
      */
    private void ItemTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemTextField7ActionPerformed
    /**
     *@brief field for the RFID. 
     * 
     * This field is for the RFID which the user wants to work with. The user should be able to write into it or get it from the combobox. All the buttons in the RFID: Delete and Create User + get and update configuration, all refer to the content in this field. 
      */
    private void RFIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFIDFieldActionPerformed
    }//GEN-LAST:event_RFIDFieldActionPerformed
    /**
     *@brief Deletes the RFID in the RFIDTextField. 
     * 
     * This button takes the RFID in the RFIDTextField and deletes its entry in the database. The GUI survives any wrong or illegal entry from the RFIDTextField that we have tested. The method then calls for a refresh of the combobox to reflect the changes in the database.
      */
    private void delUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delUserButtonActionPerformed
        String RFID1 = RFIDField.getText();
        try {
            Database.QueryExchange delUserObj = new Database.QueryExchange();
            
            //pull index number of RFID1 
            
            //RFIDList.removeItemAt(1);
            delUserObj.delUser(RFID1);
            refreshRFIDList();
        } catch (SQLException ex) {
            Logger.getLogger(RFID1);   //RFID1 as payload makes no sense. TODO. 
        }
        
        
        //RFIDList.removeAllItems();  //Delete everything in the RFID comboBox
        /*
                try {
            Database.QueryExchange delUserObj = new Database.QueryExchange();
            delUserObj.delUser(RFID1);
        } catch (SQLException ex) {
            Logger.getLogger(RFID1);   //RFID1 as payload makes no sense. TODO. 
        }
              */  
                
                
               
               // refreshRFIDList();
        
        

    }//GEN-LAST:event_delUserButtonActionPerformed
    /**
     *@brief Fetches the configuration for a given RFID. 
     * 
     * This method takes the RFID in the RFIDTextField and gets the configuration for it and populates into the relevant fields. Nothing seen so far crashes the GUI when running this method. 
      */
    private void getConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getConfigButtonActionPerformed
        String RFID1 = RFIDField.getText();
        try {
            Database.QueryExchange userConfigObj = new Database.QueryExchange();
            ResultSet aResultset = userConfigObj.getConfig(RFID1);
            aResultset.next();
            PINTextField.setText(aResultset.getObject(2).toString());
            ItemTextField1.setText(aResultset.getObject(3).toString());
            ItemTextField2.setText(aResultset.getObject(4).toString());
            ItemTextField3.setText(aResultset.getObject(5).toString());
            ItemTextField4.setText(aResultset.getObject(6).toString());
            ItemTextField5.setText(aResultset.getObject(7).toString());
            ItemTextField6.setText(aResultset.getObject(8).toString());
            ItemTextField7.setText(aResultset.getObject(9).toString());
            ItemTextField8.setText(aResultset.getObject(10).toString());
            ItemTextField9.setText(aResultset.getObject(11).toString());
        } catch (SQLException ex) {
            Logger.getLogger(RFID1);   //RFID1 as payload makes no sense. TODO. 
        }
    }//GEN-LAST:event_getConfigButtonActionPerformed
    /**
     *@brief Item field for configuration for a single item in the configuration. 
      */
    private void ItemTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemTextField2ActionPerformed
    /**
     *@brief Item field for configuration for a single item in the configuration. 
      */
    private void ItemTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemTextField8ActionPerformed
    /**
     *@brief Item field for configuration for a single item in the configuration. 
      */
    private void ItemTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemTextField5ActionPerformed
        /**
     *@brief builds the RFID combobox. 
     * 
     * Gets the entries for the RFID's in database and populates the combobox with them. The main text should be "Select or write RFID" if the method is being run for the first time. 
     */
    private void RFIDListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFIDListActionPerformed

        //First time run should show "Select or write RFID" and then at each time 
        //this ActionPerformed is called it should show the RFID number. 
        if (RFIDList.getSelectedItem() != null ) {
            RFIDField.setText(RFIDList.getSelectedItem().toString());
        }
        if (firstRun == 1) {
            RFIDField.setText("Select or write RFID");
            firstRun = 0;
        }
        //RFIDList.removeAll();
        //refreshRFIDList();
    }//GEN-LAST:event_RFIDListActionPerformed
        /**
     *@brief refreshes the combobox. 
     * 
     * This method is called when the combobox needs to be updated. The combobox has all the RFID's that are in the database but the list is compiled at runtime of the Mainscreen class. Changes to the list are not automatically updated and so must be refreshed with a method like this. Changes that are updated with this method are when a user is created or deleted. 
      */
    private void refreshRFIDList() {
        RFIDList.removeAllItems();  //Delete everything in the RFID comboBox
        //RFIDList.repaint();
        String RFID1 = null;  //Todo
        
        try {
            Database.QueryExchange test1 = new Database.QueryExchange();
            ResultSet resultSet = test1.getAllRFIDs();

            while (resultSet.next()) {
                RFIDList.addItem(resultSet.getObject(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RFID1);   //RFID1 as payload makes no sense. TODO. 
        }

    }

    /**
     * @brief Starts the class. 
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ItemTextField1;
    private javax.swing.JTextField ItemTextField2;
    private javax.swing.JTextField ItemTextField3;
    private javax.swing.JTextField ItemTextField4;
    private javax.swing.JTextField ItemTextField5;
    private javax.swing.JTextField ItemTextField6;
    private javax.swing.JTextField ItemTextField7;
    private javax.swing.JTextField ItemTextField8;
    private javax.swing.JTextField ItemTextField9;
    private javax.swing.JTextField PINTextField;
    private javax.swing.JTextField RFIDField;
    private javax.swing.JComboBox RFIDList;
    private javax.swing.JButton createUserButton;
    private javax.swing.JButton delUserButton;
    private javax.swing.JButton getConfigButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton updateConfigButton;
    private javax.swing.JCheckBox validRFIDCheckBox;
    // End of variables declaration//GEN-END:variables
}
