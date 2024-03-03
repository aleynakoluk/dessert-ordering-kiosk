
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddNewCustomer extends javax.swing.JFrame {

    ArrayList<Dessert>desserts;
    
    public AddNewCustomer() {
        initComponents();
        desserts=new ArrayList<Dessert>();
       // populateArrayList();
    }
    
   /* public void populateArrayList(){
        try{
            FileInputStream file= new FileInputStream("Desserts.dat");
            ObjectInputStream inputFile= new ObjectInputStream(file);
            
            boolean endOfFile=false;
            while (!endOfFile){
                try{
                    desserts.add((Dessert) inputFile.readObject());
                } catch (EOFException e){
                    endOfFile=true;
                }catch (Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFile.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblOrder = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblCustomerSurname = new javax.swing.JLabel();
        lblCustomerChoiceDessert = new javax.swing.JLabel();
        fldCustomerName = new javax.swing.JTextField();
        fldCustomerSurname = new javax.swing.JTextField();
        jCbCustomerChoice = new javax.swing.JComboBox<>();
        lblStaffId = new javax.swing.JLabel();
        fldStaffId = new javax.swing.JTextField();
        btbOrderSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        lblOrder.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        lblOrder.setForeground(new java.awt.Color(204, 255, 204));
        lblOrder.setText("Assign Order To Customer");

        lblCustomerName.setFont(new java.awt.Font("Mistral", 0, 18)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(255, 204, 51));
        lblCustomerName.setText("Cusromer Name:");

        lblCustomerSurname.setFont(new java.awt.Font("Mistral", 0, 18)); // NOI18N
        lblCustomerSurname.setForeground(new java.awt.Color(255, 204, 51));
        lblCustomerSurname.setText("Customer Surname: ");

        lblCustomerChoiceDessert.setFont(new java.awt.Font("Mistral", 0, 18)); // NOI18N
        lblCustomerChoiceDessert.setForeground(new java.awt.Color(255, 204, 51));
        lblCustomerChoiceDessert.setText("Customer's Choice of Dessert: ");

        fldCustomerName.setBackground(new java.awt.Color(204, 255, 204));
        fldCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        fldCustomerSurname.setBackground(new java.awt.Color(204, 255, 204));
        fldCustomerSurname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jCbCustomerChoice.setBackground(new java.awt.Color(204, 255, 204));
        jCbCustomerChoice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCbCustomerChoice.setForeground(new java.awt.Color(0, 51, 51));
        jCbCustomerChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your dessert", "Fruitcake", "Chocolate cake", "Strawberry cake", "Macarons", "Cupcakes", " " }));

        lblStaffId.setFont(new java.awt.Font("Mistral", 0, 18)); // NOI18N
        lblStaffId.setForeground(new java.awt.Color(255, 204, 102));
        lblStaffId.setText("Staff Id: ");

        fldStaffId.setBackground(new java.awt.Color(204, 255, 204));
        fldStaffId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btbOrderSave.setBackground(new java.awt.Color(204, 204, 255));
        btbOrderSave.setFont(new java.awt.Font("Mistral", 3, 18)); // NOI18N
        btbOrderSave.setForeground(new java.awt.Color(204, 0, 204));
        btbOrderSave.setText("Save");
        btbOrderSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbOrderSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerSurname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCustomerName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldCustomerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblOrder)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerChoiceDessert)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(lblStaffId)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCbCustomerChoice, 0, 178, Short.MAX_VALUE)
                            .addComponent(fldStaffId))))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btbOrderSave, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblOrder)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerSurname)
                    .addComponent(fldCustomerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerChoiceDessert)
                    .addComponent(jCbCustomerChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStaffId)
                    .addComponent(fldStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btbOrderSave)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbOrderSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbOrderSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btbOrderSaveActionPerformed
 private void fldCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void fldCustomerSurnameActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       if(this.fldCustomerName.getText().isEmpty() || this.fldCustomerSurname.getText().isEmpty() ||
               this.fldStaffId.getText().isEmpty()){
       
                  JOptionPane.showMessageDialog(null,"Please enter all the details! ");     
       }
       else{
       
       }
    
    }                                        
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
            java.util.logging.Logger.getLogger(AddNewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbOrderSave;
    private javax.swing.JTextField fldCustomerName;
    private javax.swing.JTextField fldCustomerSurname;
    private javax.swing.JTextField fldStaffId;
    private javax.swing.JComboBox<String> jCbCustomerChoice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCustomerChoiceDessert;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerSurname;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblStaffId;
    // End of variables declaration//GEN-END:variables
}
