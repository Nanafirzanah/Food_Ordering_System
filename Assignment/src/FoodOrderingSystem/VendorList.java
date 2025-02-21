
package FoodOrderingSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class VendorList extends javax.swing.JFrame implements MyInterface{

    private String customerId;
    /**
     * Creates new form VendorList
     */
    public VendorList() {
        initComponents();
        addRowSelectionListener();
    }
    
    public VendorList(String CustomerID){
        initComponents();
        addRowSelectionListener();
        this.customerId = CustomerID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AppsNameLbl1 = new javax.swing.JLabel();
        AppsNameLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        SeeMenuBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        CartBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        AppsNameLbl1.setFont(new java.awt.Font("STCaiyun", 1, 48)); // NOI18N
        AppsNameLbl1.setText("JOM");

        AppsNameLbl.setFont(new java.awt.Font("STCaiyun", 1, 48)); // NOI18N
        AppsNameLbl.setText("MAKAN");

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vendor ID", "Vendor Name", "Food Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DataTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(DataTable);
        if (DataTable.getColumnModel().getColumnCount() > 0) {
            DataTable.getColumnModel().getColumn(0).setResizable(false);
            DataTable.getColumnModel().getColumn(1).setResizable(false);
            DataTable.getColumnModel().getColumn(2).setResizable(false);
        }

        SeeMenuBtn.setText("See Menu");
        SeeMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeMenuBtnActionPerformed(evt);
            }
        });

        CloseBtn.setText("Close");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });

        CartBtn.setIcon(new javax.swing.ImageIcon("E:\\APU YEAR 2 SEM 1\\OOP JAVA\\ASSIGNMENT\\cart.png")); // NOI18N
        CartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppsNameLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(AppsNameLbl1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CartBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SeeMenuBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(111, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(AppsNameLbl1)
                        .addGap(69, 69, 69)
                        .addComponent(AppsNameLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SeeMenuBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(CloseBtn)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);
        DefaultTableModel model = (DefaultTableModel) DataTable.getModel();
        model.setRowCount(0);
        refreshData();
    }//GEN-LAST:event_formWindowActivated

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        CustomerDashboard CD = new CustomerDashboard(this.customerId);
        CD.setVisible(true);
        CD.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_CloseBtnActionPerformed

    private void SeeMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeMenuBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) DataTable.getModel();
        int selectedRow = DataTable.getSelectedRow();
        if (selectedRow != -1) {
            String vendorId = (String) model.getValueAt(selectedRow, 0);
            String vendorName = (String) model.getValueAt(selectedRow, 1);
            JOptionPane.showMessageDialog(this,
                    "Selected Vendor Details:\n" +
                            "Vendor ID: " + vendorId + "\n" +
                            "Vendor Name: " + vendorName,
                    "Vendor Selected",
                    JOptionPane.INFORMATION_MESSAGE);
            //NEED TO INCLUDE IN PARAMETER CUSTOMER ID
             MenuDashboard Menu = new MenuDashboard(vendorId, this.customerId);
             Menu.setVisible(true);
             this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Please select a row first.",
                    "No Row Selected",
                    JOptionPane.WARNING_MESSAGE);
        }
//        DefaultTableModel model = (DefaultTableModel) DataTable.getModel();
//        int selectedRow = DataTable.getSelectedRow();
//        if(selectedRow != -1){
//            Boolean isSelected = (Boolean) model.getValueAt(selectedRow, 3);
//            if(isSelected != null && isSelected) {
//                String selectedId = (String) model.getValueAt(selectedRow, 0);
//                JOptionPane.showMessageDialog(this,
//                        "Selected Vendor ID: " + selectedId,
//                        "Selected Vendor",
//                        JOptionPane.INFORMATION_MESSAGE);
//                MenuDashboard Menu = new MenuDashboard(selectedId);
//                Menu.setVisible(true);
//            }else{
//                JOptionPane.showMessageDialog(this, "Please select the checkbox in the row.", "No Selection", JOptionPane.WARNING_MESSAGE);
//            }
//        }else{
//            JOptionPane.showMessageDialog(this,
//                    "Please select a row first.",
//                    "No Row Selected",
//                    JOptionPane.WARNING_MESSAGE);
//        }

// SECOND ONE
//        DefaultTableModel model = (DefaultTableModel) DataTable.getModel();
//        int selectedRow = -1;
//
//        for (int i = 0; i < model.getRowCount(); i++) {
//            Boolean isSelected = (Boolean) model.getValueAt(i, 3);
//            if (isSelected != null && isSelected) {
//                selectedRow = i;
//                break;
//            }
//        }
//
//        if (selectedRow != -1) {
//            String selectedId = (String) model.getValueAt(selectedRow, 0);
//            JOptionPane.showMessageDialog(this,
//                    "Selected Vendor ID: " + selectedId,
//                    "Selected Vendor",
//                    JOptionPane.INFORMATION_MESSAGE);
//        } else {
//            JOptionPane.showMessageDialog(this, "Please select a vendor.", "No Selection", JOptionPane.WARNING_MESSAGE);
//        }

    }//GEN-LAST:event_SeeMenuBtnActionPerformed

    private void CartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartBtnActionPerformed
        
        if(readCartTxt()){
           Cart C = new Cart(this.customerId);
           C.setVisible(true);
           this.setVisible(false); 
        }else{
            JOptionPane.showMessageDialog(this, "No order in the cart, please order first.", "System", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("No order in the cart.");
        }       
    }//GEN-LAST:event_CartBtnActionPerformed

    private boolean readCartTxt(){
        try{
            String read;

            FileReader fr = new FileReader("Cart.txt");
            BufferedReader br = new BufferedReader(fr);

            String tempCustId = "";

            while((read = br.readLine()) != null){
                String[] data = read.split(";");

                tempCustId = data[2];
            }

            if(tempCustId.equals(this.customerId)){
                return true;
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Something is disrupting the system. Please contact admin.", "System", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;        
    }
    
    private void addRowSelectionListener(){
        DataTable.getSelectionModel().addListSelectionListener((ListSelectionEvent e)->{
            if(!e.getValueIsAdjusting()){
                int selectedRow = DataTable.getSelectedRow();
                if(selectedRow != -1) {
                    String vendorId = (String) DataTable.getValueAt(selectedRow,0);
                    String vendorName = (String) DataTable.getValueAt(selectedRow, 1);
                    System.out.println("Selected Vendor ID: " + vendorId);
                    System.out.println("Selected Vendor Name: " + vendorName);
                }
            }
        });
    }
    
    @Override
    public void refreshData(){       
        try{
            String read;
            String fileName = "vendor.txt";
            FileReader fr = new FileReader(fileName);
            
            // Prevent Glitch from file use BufferedReader
            BufferedReader br = new BufferedReader(fr);
            
               
            // To start use the JTable use DefaultTableModel
            DefaultTableModel model = (DefaultTableModel) DataTable.getModel();
            
            while((read = br.readLine()) != null ){                
                    String id = read.split(";")[0];
                    String vendorName = read.split(";")[1];
                    String vendorCategory = read.split(";")[2];
                    
                    // ADD DATA FROM FILE INTO TABLE
                    model.addRow(new Object[]{
                        id,vendorName,vendorCategory
                    });
                }
            br.close();
            
            
//            model.addTableModelListener(e -> {
//                if(e.getType() == javax.swing.event.TableModelEvent.UPDATE){
//                    int column = e.getColumn();
//                    if (column == 3){
//                        int selectedRow = e.getFirstRow();
//                        for(int i = 0; i < model.getRowCount(); i++){
//                            if(i != selectedRow){
//                                model.setValueAt(false, i, 3);
//                            }
//                        }
//                    }
//                }
//            });
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e, "System", JOptionPane.WARNING_MESSAGE);
        }
    }
    /**
     *
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
            java.util.logging.Logger.getLogger(VendorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendorList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppsNameLbl;
    private javax.swing.JLabel AppsNameLbl1;
    private javax.swing.JButton CartBtn;
    private javax.swing.JButton CloseBtn;
    private javax.swing.JTable DataTable;
    private javax.swing.JButton SeeMenuBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
