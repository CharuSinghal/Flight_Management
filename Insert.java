import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class Insert extends javax.swing.JFrame {
    public Insert() {
    initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        d9 = new javax.swing.JLabel();
        d10 = new javax.swing.JLabel();
        d11 = new javax.swing.JLabel();
        d12 = new javax.swing.JLabel();
        d13 = new javax.swing.JLabel();
        d14 = new javax.swing.JLabel();
        D2 = new javax.swing.JComboBox<>();
        D3 = new javax.swing.JComboBox<>();
        D8 = new javax.swing.JTextField();
        D6 = new javax.swing.JComboBox<>();
        D5 = new javax.swing.JTextField();
        D7 = new javax.swing.JTextField();
        D9 = new javax.swing.JTextField();
        D13 = new javax.swing.JTextField();
        D12 = new javax.swing.JTextField();
        D14 = new javax.swing.JTextField();
        D11 = new javax.swing.JTextField();
        Done = new javax.swing.JButton();
        D10 = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        D1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        D4 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        d1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d1.setText("Departure Date");
        getContentPane().add(d1);
        d1.setBounds(40, 230, 138, 22);

        d2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d2.setText("Source");
        getContentPane().add(d2);
        d2.setBounds(40, 270, 61, 22);

        d3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d3.setText("Destination");
        getContentPane().add(d3);
        d3.setBounds(820, 260, 104, 22);

        d4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d4.setText("Return Date");
        getContentPane().add(d4);
        d4.setBounds(40, 320, 109, 22);

        d5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d5.setText("Adults Fare");
        getContentPane().add(d5);
        d5.setBounds(40, 360, 105, 22);

        d6.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d6.setText("Class");
        getContentPane().add(d6);
        d6.setBounds(40, 400, 47, 22);

        d7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d7.setText("Teens Fare");
        getContentPane().add(d7);
        d7.setBounds(820, 330, 99, 22);

        d8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d8.setText("Child  Fare");
        getContentPane().add(d8);
        d8.setBounds(40, 480, 100, 22);

        d9.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d9.setText("Infants Fare");
        getContentPane().add(d9);
        d9.setBounds(820, 400, 108, 22);

        d10.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d10.setText("Flight Name");
        getContentPane().add(d10);
        d10.setBounds(40, 440, 110, 22);

        d11.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d11.setText("Departure Time");
        getContentPane().add(d11);
        d11.setBounds(40, 530, 143, 22);

        d12.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d12.setText("Arrival Time");
        getContentPane().add(d12);
        d12.setBounds(820, 460, 116, 24);

        d13.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d13.setText("Distance");
        getContentPane().add(d13);
        d13.setBounds(40, 570, 78, 22);

        d14.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        d14.setText("Duration Time");
        getContentPane().add(d14);
        d14.setBounds(40, 620, 132, 22);

        D2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "New Delhi", "Ahmedabad", "Mumbai", "Banglore", "Goa", "Chennai", "Kolkata", "Pune", "Amritsar", "Udaipur" }));
        getContentPane().add(D2);
        D2.setBounds(320, 270, 100, 20);

        D3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "New Delhi", "Ahmedabad", "Mumbai", "Banglore", "Goa", "Chennai", "Kolkata", "Pune", "Amritsar", "Udaipur" }));
        getContentPane().add(D3);
        D3.setBounds(1228, 262, 90, 20);

        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });
        getContentPane().add(D8);
        D8.setBounds(320, 480, 65, 30);

        D6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "Economic Class", "1st Class", "Business Class" }));
        getContentPane().add(D6);
        D6.setBounds(320, 400, 97, 20);
        getContentPane().add(D5);
        D5.setBounds(320, 350, 65, 30);

        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });
        getContentPane().add(D7);
        D7.setBounds(1228, 313, 92, 30);
        getContentPane().add(D9);
        D9.setBounds(1228, 389, 92, 30);
        getContentPane().add(D13);
        D13.setBounds(320, 580, 80, 30);

        D12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D12ActionPerformed(evt);
            }
        });
        getContentPane().add(D12);
        D12.setBounds(1228, 463, 90, 30);
        getContentPane().add(D14);
        D14.setBounds(320, 620, 90, 30);
        getContentPane().add(D11);
        D11.setBounds(320, 530, 80, 30);

        Done.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        getContentPane().add(Done);
        Done.setBounds(840, 550, 95, 37);

        D10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "Indigo", "Air India", "Spice Jet", "Vistara" }));
        getContentPane().add(D10);
        D10.setBounds(320, 440, 100, 20);

        back.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(1219, 559, 91, 37);
        getContentPane().add(D1);
        D1.setBounds(320, 230, 91, 30);

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(6, 36, 121));
        jLabel1.setText("ARCY TRAVELLERS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 50, 766, 91);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flight/logo1 edit.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 223, 209);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1175, 169, 38, 0);
        getContentPane().add(D4);
        D4.setBounds(320, 310, 91, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(464, 177, 28, 19);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\rpsin\\Desktop\\Flight\\flight_takeoff-wide.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-20, 210, 1620, 1180);

        jLabel6.setBackground(new java.awt.Color(196, 223, 251));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1600, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      Admin2 obj = new  Admin2();
                obj.setExtendedState(MAXIMIZED_BOTH);
                obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        String dd=D1.getDate().toString(); 
        String source=(String) D2.getSelectedItem();
        String desti=(String) D3.getSelectedItem();
        String rd=D4.getDate().toString(); 
        String af=D8.getText();
        String clas=(String) D6.getSelectedItem();
        String tf=D7.getText();
        String cf=D5.getText();
        String inf=D9.getText();
        String fn=(String) D10.getSelectedItem();
        String dt=D13.getText();
        String at=D12.getText();
        String dist=D14.getText();
        String duration=D11.getText();
        try{
        
             
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = null;
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","singhal23");
        PreparedStatement pst = con.prepareStatement("insert into flight_table values(?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, source);
        pst.setString(2, desti);
        pst.setString(3, af);
        pst.setString(4, clas);
        pst.setString(5, tf);
        pst.setString(6, cf);
        pst.setString(7, af);
        pst.setString(8, fn);
        pst.setString(9, dt);
        pst.setString(10, at);
        pst.setString(11, dist);
        pst.setString(12, duration); 
        int f = pst.executeUpdate();
       if (f>0){
            
            this.dispose();
            System.out.println("Success");
           JOptionPane.showMessageDialog(this, "Success");
        }
        else {System.out.println("Fail");
            JOptionPane.showMessageDialog(this, "Sign In Fail");
       }
        }
        catch(Exception e){
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_DoneActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D7ActionPerformed

    private void D12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D12ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D8ActionPerformed

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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Insert obj = new  Insert();
                obj.setExtendedState(MAXIMIZED_BOTH);
                obj.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser D1;
    private javax.swing.JComboBox<String> D10;
    private javax.swing.JTextField D11;
    private javax.swing.JTextField D12;
    private javax.swing.JTextField D13;
    private javax.swing.JTextField D14;
    private javax.swing.JComboBox<String> D2;
    private javax.swing.JComboBox<String> D3;
    private com.toedter.calendar.JDateChooser D4;
    private javax.swing.JTextField D5;
    private javax.swing.JComboBox<String> D6;
    private javax.swing.JTextField D7;
    private javax.swing.JTextField D8;
    private javax.swing.JTextField D9;
    private javax.swing.JButton Done;
    private javax.swing.JButton back;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d10;
    private javax.swing.JLabel d11;
    private javax.swing.JLabel d12;
    private javax.swing.JLabel d13;
    private javax.swing.JLabel d14;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d7;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel d9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
