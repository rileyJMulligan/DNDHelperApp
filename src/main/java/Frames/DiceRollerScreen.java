/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Frames;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author straf
 */
public class DiceRollerScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form DiceRollerScreen
     */
    public DiceRollerScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        d4Button = new javax.swing.JToggleButton();
        sliderSelection = new javax.swing.JSlider();
        d6Button = new javax.swing.JToggleButton();
        d8Button = new javax.swing.JToggleButton();
        d12Button = new javax.swing.JToggleButton();
        d20Button = new javax.swing.JToggleButton();
        rollButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("(amount of rolls)");

        d4Button.setText("D4");
        d4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ButtonActionPerformed(evt);
            }
        });

        sliderSelection.setMajorTickSpacing(1);
        sliderSelection.setMaximum(10);
        sliderSelection.setMinimum(1);
        sliderSelection.setPaintLabels(true);
        sliderSelection.setPaintTicks(true);
        sliderSelection.setSnapToTicks(true);
        sliderSelection.setToolTipText("");
        sliderSelection.setValue(1);

        d6Button.setText("D6");
        d6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6ButtonActionPerformed(evt);
            }
        });

        d8Button.setText("D8");
        d8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8ButtonActionPerformed(evt);
            }
        });

        d12Button.setText("D12");
        d12Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d12ButtonActionPerformed(evt);
            }
        });

        d20Button.setText("D20");
        d20Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d20ButtonActionPerformed(evt);
            }
        });

        rollButton.setText("Roll!");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("(select one dice value)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(sliderSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d4Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d6Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d8Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d12Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d20Button))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(rollButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d4Button)
                            .addComponent(d6Button)
                            .addComponent(d8Button)
                            .addComponent(d12Button)
                            .addComponent(d20Button))))
                .addGap(18, 18, 18)
                .addComponent(rollButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d4ButtonActionPerformed

    private void d6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d6ButtonActionPerformed

    private void d8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d8ButtonActionPerformed

    private void d12ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d12ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d12ButtonActionPerformed

    private void d20ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d20ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d20ButtonActionPerformed

    /**

    Performs the action when the rollButton is clicked.

    Gets the number of dice to roll from the slider,

    the maximum value of the dice from the selected button,

    rolls the dice and calculates the sum, and displays

    the results in a dialog box.

    @param evt The ActionEvent object generated by clicking the rollButton.
    */
    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed
        // Get the number of dice to roll from the slider
    int numDice = sliderSelection.getValue();

    // Get the maximum value of the dice from the selected button
    int maxValue = 0;
    if (d4Button.isSelected()) {
        maxValue = 4;
    } else if (d6Button.isSelected()) {
        maxValue = 6;
    } else if (d8Button.isSelected()) {
        maxValue = 8;
    } else if (d12Button.isSelected()) {
        maxValue = 12;
    } else if (d20Button.isSelected()) {
        maxValue = 20;
    }

    // Roll the dice and calculate the sum
    StringBuilder sb = new StringBuilder();
    Random rand = new Random();
    int sum = 0;
    for (int i = 0; i < numDice; i++) {
        int result = rand.nextInt(maxValue) + 1;
        sb.append(result).append(" ");
        sum += result;
    }

    // Show the results in a dialog box
    String message = sb.toString().trim() + "\n\n" + "Sum: " + sum;
    JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_rollButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton d12Button;
    private javax.swing.JToggleButton d20Button;
    private javax.swing.JToggleButton d4Button;
    private javax.swing.JToggleButton d6Button;
    private javax.swing.JToggleButton d8Button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton rollButton;
    private javax.swing.JSlider sliderSelection;
    // End of variables declaration//GEN-END:variables
}
