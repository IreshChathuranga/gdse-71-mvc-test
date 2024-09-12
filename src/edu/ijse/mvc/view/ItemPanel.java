/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.controller.CustomerController;
import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.dto.ItemDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USER
 */
public class ItemPanel extends javax.swing.JPanel {
    private final ItemController ITEM_CONTROLLER;

    /**
     * Creates new form ItemPanel
     */
    public ItemPanel() {
        ITEM_CONTROLLER= new ItemController();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tyu = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        tgh = new javax.swing.JLabel();
        txtDocument = new javax.swing.JTextField();
        thi = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        dfv = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        rty = new javax.swing.JLabel();
        txtoh = new javax.swing.JTextField();
        txtDelete = new javax.swing.JButton();
        txtUpdate = new javax.swing.JButton();
        ttSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tyu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tyu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tyu.setText("Item Code");

        txtCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tgh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tgh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tgh.setText("Description");

        txtDocument.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDocument.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        thi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        thi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        thi.setText("Pack Size");

        txtSize.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        dfv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dfv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dfv.setText("Unit Price");

        txtPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        rty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rty.setText("QOH");

        txtoh.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtDelete.setBackground(new java.awt.Color(255, 255, 0));
        txtDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDelete.setText("Delete");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        txtUpdate.setBackground(new java.awt.Color(0, 255, 51));
        txtUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUpdate.setText("Update");
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });

        ttSave.setBackground(new java.awt.Color(255, 0, 0));
        ttSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ttSave.setText("Save");
        ttSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttSaveActionPerformed(evt);
            }
        });

        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        txtTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(thi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tyu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tgh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dfv, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rty, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtoh, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(441, 441, 441)
                                .addComponent(txtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(ttSave, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tyu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tgh, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(txtDocument))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dfv, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rty, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtoh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
        deleteItem();// TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateActionPerformed
        updateItem();// TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateActionPerformed

    private void ttSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttSaveActionPerformed
        saveItem();        // TODO add your handling code here:
    }//GEN-LAST:event_ttSaveActionPerformed

    private void txtTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTableMouseClicked
        searchItem();  // TODO add your handling code here:
    }//GEN-LAST:event_txtTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dfv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rty;
    private javax.swing.JLabel tgh;
    private javax.swing.JLabel thi;
    private javax.swing.JButton ttSave;
    private javax.swing.JTextField txtCode;
    private javax.swing.JButton txtDelete;
    private javax.swing.JTextField txtDocument;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTable txtTable;
    private javax.swing.JButton txtUpdate;
    private javax.swing.JTextField txtoh;
    private javax.swing.JLabel tyu;
    // End of variables declaration//GEN-END:variables
     private void loadTable(){
    String colums[]= {"Item Code","Description","Pack Size","Unit Price","Qty On Hand"};
    DefaultTableModel dtm = new DefaultTableModel(colums,0){
          public boolean isCellEditable(int row, int column) {
                return false;
            }
    };
     try {
            ArrayList<ItemDto> itemDtos = ITEM_CONTROLLER.getAllItems();
            for (ItemDto itemDto : itemDtos) {
                Object[] rowData = {itemDto.getItemCode(), itemDto.getDescription(), itemDto.getPackSize(), itemDto.getUnitPrice(), itemDto.getQoh()};
                dtm.addRow(rowData);
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
     txtTable.setModel(dtm);
    }
    private void saveItem(){
        ItemDto itemDto = new ItemDto(
            txtCode.getText(),
            txtDocument.getText(),
            txtSize.getText(),
            Double.parseDouble(txtPrice.getText()),
            Integer.parseInt(txtoh.getText()));
            
            try {
            String resp = ITEM_CONTROLLER.saveItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearFrom();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            
    }

    private void clearFrom() {
            txtCode.setText("");
            txtDocument.setText("");
            txtSize.setText("");
            txtPrice.setText("");
            txtoh.setText("");
    }   
    private void searchItem() {
        String itemCode = (String) txtTable.getValueAt(txtTable.getSelectedRow(), 0);
        System.out.println(itemCode);

        try {

            ItemDto itemDto = ITEM_CONTROLLER.searchItem(itemCode);
            if (itemDto != null) {
                txtCode.setText(itemDto.getItemCode());
                txtDocument.setText(itemDto.getDescription());
                txtSize.setText(itemDto.getPackSize());
                txtPrice.setText(Double.toString(itemDto.getUnitPrice()));
                txtoh.setText(Integer.toString(itemDto.getQoh()));
            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
    private void deleteItem() {
        ItemDto itemDto = new ItemDto(
            txtCode.getText(),
            txtDocument.getText(),
            txtSize.getText(),
            Double.parseDouble(txtPrice.getText()),
            Integer.parseInt(txtoh.getText()));
        try {
            String itemCode = txtCode.getText();
            String resp = ITEM_CONTROLLER.deleteItem(itemCode);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearFrom();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void updateItem() {
        ItemDto itemDto = new ItemDto(
            txtCode.getText(),
            txtDocument.getText(),
            txtSize.getText(),
            Double.parseDouble(txtPrice.getText()),
            Integer.parseInt(txtoh.getText()));
        try {
            String resp = ITEM_CONTROLLER.updateItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearFrom();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
