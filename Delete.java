import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Delete extends javax.swing.JFrame {
public Delete() {
        initComponents();
 }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        s2 = new javax.swing.JComboBox<>();
        s3 = new javax.swing.JComboBox<>();
        s5 = new javax.swing.JComboBox<>();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        S1 = new com.toedter.calendar.JDateChooser();
        s4 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setText("Departure Date");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 300, 138, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setText("Source");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 350, 61, 22);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setText("Destination");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 410, 104, 22);

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel4.setText("Return Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 470, 109, 22);

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel5.setText("Class");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 530, 47, 22);

        s2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "New Delhi", "Ahmedabad", "Mumbai", "Banglore", "Goa", "Chennai", "Kolkata", "Pune", "Amritsar", "Udaipur" }));
        getContentPane().add(s2);
        s2.setBounds(700, 350, 140, 35);

        s3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "New Delhi", "Ahmedabad", "Mumbai", "Banglore", "Goa", "Chennai", "Kolkata", "Pune", "Amritsar", "Udaipur" }));
        getContentPane().add(s3);
        s3.setBounds(700, 410, 140, 30);

        s5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "Economic Class", "1st Class", "Business Class" }));
        getContentPane().add(s5);
        s5.setBounds(700, 530, 140, 29);

        delete.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(580, 590, 109, 37);

        jButton1.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1200, 590, 91, 37);

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 80)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 36, 121));
        jLabel6.setText("ARCY TRAVELLERS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 60, 800, 90);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 30, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\rpsin\\Desktop\\Flight\\logo1 edit.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 220, 225);
        getContentPane().add(S1);
        S1.setBounds(700, 290, 140, 30);
        getContentPane().add(s4);
        s4.setBounds(700, 470, 140, 30);

        jLabel10.setBackground(new java.awt.Color(196, 223, 251));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1740, 220);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\rpsin\\Desktop\\Flight\\aeroplane-HD.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-70, 10, 1940, 1410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       String dd=S1.getDate().toString();
       String source =(String) s2.getSelectedItem();
       String dest =(String) s3.getSelectedItem();
       String rt =s4.getDate().toString();
       String clas=(String) s5.getSelectedItem();
       try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = null;
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","singhal23");
        PreparedStatement pst = con.prepareStatement("delete from Flight_Table  WHERE departure_date = ? ");
        pst.setString(1,dd);
        int f = pst.executeUpdate();
        if (f>0){System.out.println("Success");
        JOptionPane.showMessageDialog(this, "Deleted");
        this.dispose();
        }
        else {System.out.println("Fail");}
        }
        catch(ClassNotFoundException | SQLException e){System.out.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           Admin2 obj = new  Admin2();
                obj.setExtendedState(MAXIMIZED_BOTH);
                obj.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
        public void run() {
         Delete obj = new Delete();
                obj.setExtendedState(MAXIMIZED_BOTH);
                obj.setVisible(true);
              
        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser S1;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> s2;
    private javax.swing.JComboBox<String> s3;
    private com.toedter.calendar.JDateChooser s4;
    private javax.swing.JComboBox<String> s5;
    // End of variables declaration//GEN-END:variables
}
