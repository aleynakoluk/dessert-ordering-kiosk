
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddDessert extends javax.swing.JFrame {

    ArrayList<Dessert> desserts;
    
    public AddDessert() {
        initComponents();
        desserts= new ArrayList<Dessert>();
        //  populateArrayList();
    }
    
    /*public void populateArrayList(){
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
    public void saveDessertsToFile(){
        try {
            FileOutputStream file= new FileOutputStream("Desserts.dat");
            ObjectOutputStream outputFile= new ObjectOutputStream(file);
            
            for(int i=0; i<desserts.size(); i++){
                outputFile.writeObject(desserts.get(i));
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null,"Dessert has been added to the menu!");
            this.dispose();
        } catch(IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCreate = new javax.swing.JLabel();
        lblCreateDessertName = new javax.swing.JLabel();
        lblCostDessert = new javax.swing.JLabel();
        fldDessertName = new javax.swing.JTextField();
        fldDessertCost = new javax.swing.JTextField();
        btnSaveNewDessert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        lblCreate.setFont(new java.awt.Font("Mistral", 1, 21)); // NOI18N
        lblCreate.setForeground(new java.awt.Color(255, 204, 204));
        lblCreate.setText("Create a  new dessert by entering following details");

        lblCreateDessertName.setFont(new java.awt.Font("Mistral", 0, 18)); // NOI18N
        lblCreateDessertName.setForeground(new java.awt.Color(255, 204, 153));
        lblCreateDessertName.setText("Name of the dessert: ");

        lblCostDessert.setFont(new java.awt.Font("Mistral", 0, 18)); // NOI18N
        lblCostDessert.setForeground(new java.awt.Color(255, 204, 153));
        lblCostDessert.setText("Dessert cost: ");

        fldDessertName.setBackground(new java.awt.Color(255, 204, 255));
        fldDessertName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        fldDessertCost.setBackground(new java.awt.Color(255, 204, 255));
        fldDessertCost.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnSaveNewDessert.setBackground(new java.awt.Color(204, 102, 255));
        btnSaveNewDessert.setFont(new java.awt.Font("Mistral", 3, 18)); // NOI18N
        btnSaveNewDessert.setForeground(new java.awt.Color(255, 204, 204));
        btnSaveNewDessert.setText("Save");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSaveNewDessert)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCreateDessertName)
                            .addComponent(lblCostDessert))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fldDessertName)
                            .addComponent(fldDessertCost, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                    .addComponent(lblCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblCreate)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateDessertName)
                    .addComponent(fldDessertName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCostDessert)
                    .addComponent(fldDessertCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnSaveNewDessert)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void btnSaveNewDessertActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.fldDessertName.getText().isEmpty() || this.fldDessertCost.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter the requested data. Fill up! ");
        } else{
            String dessertName=this.fldDessertName.getText().trim();
            String dessertCost=this.fldDessertCost.getText().trim();
            
            Dessert dessert = new Dessert(dessertName , Double.parseDouble(dessertCost));
            desserts.add(dessert);
            saveDessertsToFile();
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
            java.util.logging.Logger.getLogger(AddDessert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDessert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDessert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDessert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</ed
        //</ed
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDessert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveNewDessert;
    private javax.swing.JTextField fldDessertCost;
    private javax.swing.JTextField fldDessertName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCostDessert;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblCreateDessertName;
    // End of variables declaration//GEN-END:variables
}
