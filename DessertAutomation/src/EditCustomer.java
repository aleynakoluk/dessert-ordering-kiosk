
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EditCustomer extends javax.swing.JFrame {

 ArrayList<Dessert> desserts;
ArrayList<Customer> customers;
DecimalFormat formatter;

public EditCustomer() {
    initComponents();

    desserts = new ArrayList<Dessert>();
    customers = new ArrayList<Customer>();
    formatter = new DecimalFormat("#,###.00");
    //populateArrayList();
    
    String [] dessertsArray = new String[desserts.size()];
    for (int i=0; i<desserts.size(); i++){
        dessertsArray[i] = desserts.get(i).getDessertName() + ", (Dessert Of Cost: " + 
                formatter.format(desserts.get(i).getDessertCost()) + ")";
    }
    cbCustomerDessert.setModel(new javax.swing.DefaultComboBoxModel<>(dessertsArray));
    
    String [] customersArray = new String[customers.size()];
    for (int i=0; i<customers.size(); i++){
        customersArray[i] = customers.get(i).getName() + " " +
                customers.get(i).getSurname();
    }
    cbCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(customersArray));
    cbCustomer.setSelectedIndex(0);
    
} 

  /* public void populateArrayList(){
        try {
            FileInputStream fileDessert = new FileInputStream("Desserts.dat");
            ObjectInputStream inputFileDessert = new ObjectInputStream(fileDessert);
            
            boolean endOfFile = false;
            while (!endOfFile){
                try {
                    desserts.add((Dessert) inputFileDessert.readObject());
                } catch (EOFException e){
                    endOfFile = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFileDessert.close();            
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try {
            FileInputStream fileCustomer = new FileInputStream("Customers.dat");
            ObjectInputStream inputFileCustomer = new ObjectInputStream(fileCustomer);
            
            boolean endOfFile = false;
            while (!endOfFile){
                try {
                    customers.add((Customer) inputFileCustomer.readObject());
                } catch (EOFException e){
                    endOfFile = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFileCustomer.close();            
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
    */
    public void saveCustomersToFile(){
        try {
            FileOutputStream fileCustomer = new FileOutputStream("Customers.dat");
            ObjectOutputStream outputFileCustomer = new ObjectOutputStream(fileCustomer);
            
            for (int i = 0; i<customers.size(); i++){
                outputFileCustomer.writeObject(customers.get(i));
            }
            outputFileCustomer.close();
            JOptionPane.showMessageDialog(null, "Action completed successfully!");
            this.dispose();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEditCustomer = new javax.swing.JLabel();
        lblChooseCustomer = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblDessert = new javax.swing.JLabel();
        lblStaffId = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        fldSurname = new javax.swing.JTextField();
        fldStaffId = new javax.swing.JTextField();
        cbCustomer = new javax.swing.JComboBox<>();
        cbCustomerDessert = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        lblEditCustomer.setFont(new java.awt.Font("Mistral", 3, 24)); // NOI18N
        lblEditCustomer.setForeground(new java.awt.Color(255, 255, 204));
        lblEditCustomer.setText("Edit Customer");

        lblChooseCustomer.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        lblChooseCustomer.setForeground(new java.awt.Color(204, 255, 204));
        lblChooseCustomer.setText("Choose Customer:");

        lblName.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 255, 204));
        lblName.setText("Name:");

        lblSurname.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(204, 255, 204));
        lblSurname.setText("Surname:");

        lblDessert.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        lblDessert.setForeground(new java.awt.Color(204, 255, 204));
        lblDessert.setText("Dessert:");

        lblStaffId.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        lblStaffId.setForeground(new java.awt.Color(204, 255, 204));
        lblStaffId.setText("Staff Id:");

        fldName.setBackground(new java.awt.Color(255, 204, 204));

        fldSurname.setBackground(new java.awt.Color(255, 204, 204));

        fldStaffId.setBackground(new java.awt.Color(255, 204, 204));

        cbCustomer.setBackground(new java.awt.Color(255, 204, 204));
        cbCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCustomerActionPerformed(evt);
            }
        });

        cbCustomerDessert.setBackground(new java.awt.Color(255, 204, 204));
        cbCustomerDessert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbCustomerDessert.setForeground(new java.awt.Color(0, 102, 102));
        cbCustomerDessert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your dessert", "Fruitcake", "Chocolate cake", "Strawberry cake", "Macarons", "Cupcakes" }));
        cbCustomerDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCustomerDessertActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(102, 0, 102));
        btnSave.setFont(new java.awt.Font("Mistral", 3, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 204));
        btnSave.setText("Save");

        btnDelete.setBackground(new java.awt.Color(102, 0, 102));
        btnDelete.setFont(new java.awt.Font("Mistral", 3, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 204));
        btnDelete.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblChooseCustomer)
                            .addComponent(lblDessert)
                            .addComponent(lblStaffId)
                            .addComponent(lblSurname)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(9, 9, 9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fldStaffId)
                            .addComponent(fldSurname)
                            .addComponent(fldName)
                            .addComponent(cbCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCustomerDessert, 0, 147, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblEditCustomer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblEditCustomer)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChooseCustomer))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(fldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDessert)
                    .addComponent(cbCustomerDessert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStaffId)
                    .addComponent(fldStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCustomerDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCustomerDessertActionPerformed
                                                 
    }//GEN-LAST:event_cbCustomerDessertActionPerformed

    private void cbCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCustomerActionPerformed
                   int selectedIndexEmp = cbCustomer.getSelectedIndex();
        fldName.setText(customers.get(selectedIndexEmp).getName());
        fldSurname.setText(customers.get(selectedIndexEmp).getSurname());
        fldStaffId.setText(customers.get(selectedIndexEmp).getStaffId()+"");
        
       Dessert dessert = customers.get(selectedIndexEmp).getDessert();
       int empDessertIndex = 0;
         for (int i = 0; i < desserts.size(); i++) {
        if (desserts.get(i).equals(dessert)) {
        empDessertIndex = i;
        break;
    }                
}
cbCustomerDessert.setSelectedIndex(empDessertIndex);
    }//GEN-LAST:event_cbCustomerActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (this.fldName.getText().isEmpty() || 
                this.fldSurname.getText().isEmpty() ||
                this.fldStaffId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all the details");
        } else {
            int selectedIndexEmp = cbCustomer.getSelectedIndex();
            customers.get(selectedIndexEmp).setName(fldName.getText().trim());
            customers.get(selectedIndexEmp).setSurname(fldSurname.getText().trim());
            customers.get(selectedIndexEmp).setStaffId(Integer.parseInt(fldStaffId.getText().trim()));
            
            Dessert dessert = desserts.get(cbCustomerDessert.getSelectedIndex());
            customers.get(selectedIndexEmp).setDessert(dessert);
            
            saveCustomersToFile();
        }
    }                                        

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int selectedIndexEmp = cbCustomer.getSelectedIndex();
        customers.remove(selectedIndexEmp);
        saveCustomersToFile();
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
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbCustomer;
    private javax.swing.JComboBox<String> cbCustomerDessert;
    private javax.swing.JTextField fldName;
    private javax.swing.JTextField fldStaffId;
    private javax.swing.JTextField fldSurname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChooseCustomer;
    private javax.swing.JLabel lblDessert;
    private javax.swing.JLabel lblEditCustomer;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStaffId;
    private javax.swing.JLabel lblSurname;
    // End of variables declaration//GEN-END:variables
}

