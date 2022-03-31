/**
 *
 * @author GROUP 3 | RODRIGUEZ, QUEZON, SALVADOR, POTENTE
 */

package checkoutapplet;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class FormFrame extends javax.swing.JFrame {

    /**
     * Creates new form FormFrame
     */
    public FormFrame() {
        initComponents();
        jProgressBar1.setVisible(false);
        FormFrame.design d = new FormFrame.design();
        d.Img();     
        jLabel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        streetAddress = new javax.swing.JTextField();
        City = new javax.swing.JTextField();
        Province = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        Country = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        prodImg = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setText("Contact info");

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Email.setText("Email address");
        Email.setToolTipText("Email address");
        Email.setName(""); // NOI18N
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setText("Shipping info");

        fullName.setBackground(new java.awt.Color(255, 255, 255));
        fullName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fullName.setText("Full name");
        fullName.setToolTipText("Full name");
        fullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fullNameFocusLost(evt);
            }
        });
        fullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameActionPerformed(evt);
            }
        });

        streetAddress.setBackground(new java.awt.Color(255, 255, 255));
        streetAddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        streetAddress.setText("Street address");
        streetAddress.setToolTipText("Street address");
        streetAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                streetAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetAddressFocusLost(evt);
            }
        });
        streetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetAddressActionPerformed(evt);
            }
        });

        City.setBackground(new java.awt.Color(255, 255, 255));
        City.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        City.setText("City");
        City.setToolTipText("City");
        City.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CityFocusLost(evt);
            }
        });
        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });

        Province.setBackground(new java.awt.Color(255, 255, 255));
        Province.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Province.setText("Province");
        Province.setToolTipText("Province");
        Province.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProvinceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProvinceFocusLost(evt);
            }
        });
        Province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinceActionPerformed(evt);
            }
        });

        phoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        phoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        phoneNumber.setText("Phone number");
        phoneNumber.setToolTipText("Phone number");
        phoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberFocusLost(evt);
            }
        });
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });
        phoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberKeyTyped(evt);
            }
        });

        Country.setBackground(new java.awt.Color(255, 255, 255));
        Country.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Country.setForeground(new java.awt.Color(0, 0, 0));
        Country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Philippines", "United States", "Singapore", "Japan" }));
        Country.setToolTipText("Country");

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Place Your Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("*Please fill up the required information");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setText("Order Summary");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a product", "Design 1 | @heavheavenly", "Design 2 | Ash Eiji", "Design 3 | Marin Kitagawa", "Design 4 | No Face", "Design 5 | Yuno Grinberryall" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        prodImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Country, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Province, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fullName)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(Email)
                                .addComponent(streetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodImg, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(streetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(prodImg, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
        // TODO add your handling code here:
        if(Email.getText().equals("Email address"))
        {
            Email.setText("");

        }
    }//GEN-LAST:event_EmailFocusGained

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        // TODO add your handling code here:
        if(Email.getText().equals(""))
        {
            Email.setText("Email address");

        }
    }//GEN-LAST:event_EmailFocusLost

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void fullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullNameFocusGained
        // TODO add your handling code here:
        if(fullName.getText().equals("Full name"))
        {
            fullName.setText("");

        }
    }//GEN-LAST:event_fullNameFocusGained

    private void fullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullNameFocusLost
        // TODO add your handling code here:
        if(fullName.getText().equals(""))
        {
            fullName.setText("Full name");

        }
    }//GEN-LAST:event_fullNameFocusLost

    private void fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameActionPerformed

    private void streetAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetAddressFocusGained
        // TODO add your handling code here:
        if(streetAddress.getText().equals("Street address"))
        {
            streetAddress.setText("");

        }
    }//GEN-LAST:event_streetAddressFocusGained

    private void streetAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetAddressFocusLost
        // TODO add your handling code here:
        if(streetAddress.getText().equals(""))
        {
            streetAddress.setText("Street address");

        }
    }//GEN-LAST:event_streetAddressFocusLost

    private void streetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetAddressActionPerformed

    private void CityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityFocusGained
        // TODO add your handling code here:
        if(City.getText().equals("City"))
        {
            City.setText("");

        }
    }//GEN-LAST:event_CityFocusGained

    private void CityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityFocusLost
        // TODO add your handling code here:
        if(City.getText().equals(""))
        {
            City.setText("City");

        }
    }//GEN-LAST:event_CityFocusLost

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityActionPerformed

    private void ProvinceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProvinceFocusGained
        // TODO add your handling code here:
        if(Province.getText().equals("Province"))
        {
            Province.setText("");

        }
    }//GEN-LAST:event_ProvinceFocusGained

    private void ProvinceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProvinceFocusLost
        // TODO add your handling code here:
        if(Province.getText().equals(""))
        {
            Province.setText("Province");

        }
    }//GEN-LAST:event_ProvinceFocusLost

    private void ProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProvinceActionPerformed

    private void phoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusGained
        // TODO add your handling code here:
        if(phoneNumber.getText().equals("Phone number"))
        {
            phoneNumber.setText("");
        }
    }//GEN-LAST:event_phoneNumberFocusGained

    private void phoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusLost
        // TODO add your handling code here:
        if(phoneNumber.getText().equals(""))
        {
            phoneNumber.setText("Phone number");

        }
    }//GEN-LAST:event_phoneNumberFocusLost

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void phoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((phoneNumber.getText() + evt.getKeyChar()).length() > 11) {
            evt.consume();
        }
        if (!Character.isDigit(c)){
            evt.consume();
        }

    }//GEN-LAST:event_phoneNumberKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Email.getText().equals("") || Email.getText().equals("Email address")){
            jLabel1.setVisible(true);
        }

        else if(fullName.getText().equals("") || fullName.getText().equals("Full name")){
            jLabel1.setVisible(true);

        }

        else if(streetAddress.getText().equals("") || streetAddress.getText().equals("Street address")){
            jLabel1.setVisible(true);

        }

        else if(City.getText().equals("") || City.getText().equals("City")){
            jLabel1.setVisible(true);

        }

        else if(Province.getText().equals("") || Province.getText().equals("Province")){
            jLabel1.setVisible(true);

        }

        else if(phoneNumber.getText().equals("") || phoneNumber.getText().equals("Phone number")){
            jLabel1.setVisible(true);

        }

        else{
            jLabel1.setVisible(false);

            // SQL CONNECTION
            String url = "jdbc:mysql://bz3kxvkh0sjy7drwh6dv-mysql.services.clever-cloud.com/bz3kxvkh0sjy7drwh6dv?useSSL=false";
            String user = "u7uugjvoxvqycbwf";
            String password = "6XrPC2b2VbBFYueObAyJ";

            // SEND TO SQL
            //jProgressBar1.setVisible(true);

            try{
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement MyStmt = conn.createStatement();

                String insEmail = Email.getText();
                String insfullName = fullName.getText();
                String insStreet = streetAddress.getText();
                String insCity = City.getText();
                String insProvince = Province.getText();
                String insphoneNumber = phoneNumber.getText();
                String insCountry = Country.getSelectedItem().toString();
                String insProd = jComboBox1.getSelectedItem().toString();

                String sql  = "INSERT INTO bz3kxvkh0sjy7drwh6dv.CratonyuDB (Email, FullName, StreetAddress, City, Province, PhoneNumber, Country, Product)"
                + " VALUES ('"+insEmail+"', '"+insfullName+"' , '"+insStreet+"' , '"+insCity+"' , '"+insProvince+"' ,"
                + "'"+insphoneNumber+"' , '"+insCountry+"', '"+insProd+"')";

                MyStmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Purchase Complete, Thank you for buying!");
                jProgressBar1.setVisible(false);
                System.exit(0);

            }
            catch(Exception exc){
                JOptionPane.showMessageDialog(null, "Purchase submission failed, please try again.");
                jProgressBar1.setVisible(false);
                exc.printStackTrace();

            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    class design{
            public void Img(){
                prodImg.setText("Select a product");
                prodImg.setIcon(null);
                jButton1.setEnabled(false);
            }
        }
        
        class design1 extends design{
            public void Img(){
                prodImg.setText("");
                ImageIcon ico = new ImageIcon(getClass().getResource("/checkoutapplet/heavheavenly.png"));
                Image image = ico.getImage();
                Image newimg = image.getScaledInstance(270, 270, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newImageIcon = new ImageIcon(newimg);
                prodImg.setIcon(newImageIcon);
                jButton1.setEnabled(true);
            }
        }
        
        class design2 extends design{
            public void Img(){
                prodImg.setText("");
                ImageIcon ico = new ImageIcon(getClass().getResource("/checkoutapplet/AshEiji.png"));
                Image image = ico.getImage();
                Image newimg = image.getScaledInstance(270, 270, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newImageIcon = new ImageIcon(newimg);
                prodImg.setIcon(newImageIcon);
                jButton1.setEnabled(true);
            }
        }
        
        class design3 extends design{
            public void Img(){
                prodImg.setText("");
                ImageIcon ico = new ImageIcon(getClass().getResource("/checkoutapplet/Marin Kitagawa.jpg"));
                Image image = ico.getImage();
                Image newimg = image.getScaledInstance(270, 270, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newImageIcon = new ImageIcon(newimg);
                prodImg.setIcon(newImageIcon);
                jButton1.setEnabled(true);
            }
        }
        
        class design4 extends design{
            public void Img(){
                prodImg.setText("");
                ImageIcon ico = new ImageIcon(getClass().getResource("/checkoutapplet/No Face.jpg"));
                Image image = ico.getImage();
                Image newimg = image.getScaledInstance(270, 270, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newImageIcon = new ImageIcon(newimg);
                prodImg.setIcon(newImageIcon);
                jButton1.setEnabled(true);
            }
        }
        
        class design5 extends design{
            public void Img(){
                prodImg.setText("");
                ImageIcon ico = new ImageIcon(getClass().getResource("/checkoutapplet/Yuno Grinberryall.png"));
                Image image = ico.getImage();
                Image newimg = image.getScaledInstance(270, 270, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newImageIcon = new ImageIcon(newimg);
                prodImg.setIcon(newImageIcon);
                jButton1.setEnabled(true);
            }
        }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedIndex() == 0){
            design d = new design();
            d.Img();

        }
        if (jComboBox1.getSelectedIndex() == 1){
            design1 d = new design1();
            d.Img();

        }
        if (jComboBox1.getSelectedIndex() == 2){
            design2 d = new design2();
            d.Img();

        }
        if (jComboBox1.getSelectedIndex() == 3){
            design3 d = new design3();
            d.Img();

        }
        if (jComboBox1.getSelectedIndex() == 4){
            design4 d = new design4();
            d.Img();

        }
        if (jComboBox1.getSelectedIndex() == 5){
            design5 d = new design5();
            d.Img();

        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField City;
    private javax.swing.JComboBox<String> Country;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Province;
    private javax.swing.JTextField fullName;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel prodImg;
    private javax.swing.JTextField streetAddress;
    // End of variables declaration//GEN-END:variables
}
