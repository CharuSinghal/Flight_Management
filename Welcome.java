 public class Welcome extends javax.swing.JFrame {
    public Welcome() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 48)); // NOI18N
        jLabel2.setText("Welcome to AARCY Airlines");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 20, 860, 50);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 24)); // NOI18N
        jLabel4.setText("It's time to fly.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 90, 200, 29);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 24)); // NOI18N
        jLabel5.setText(" Life is a journey, travel it well. ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 120, 390, 29);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 24)); // NOI18N
        jLabel6.setText("Fly the friendly skies of United.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 160, 400, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rpsin\\Desktop\\Flight\\logo1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(960, 20, 230, 225);

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 540, 140, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     adminlogin obj = new adminlogin();
                obj.setExtendedState(MAXIMIZED_BOTH);
                obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
  public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Welcome obj = new Welcome();
                obj.setExtendedState(MAXIMIZED_BOTH);
                obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
