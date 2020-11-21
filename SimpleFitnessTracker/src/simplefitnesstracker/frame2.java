/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefitnesstracker;

import java.util.ArrayList;

import static simplefitnesstracker.Activity.myactivities;

/**
 *
 * @author LENOVO
 */
public class frame2 extends javax.swing.JFrame {

    ArrayList<Activity> myactivitiessort = new ArrayList<Activity>();

    /**
     * Creates new form frame2
     */
    public frame2() {
        initComponents();
        myactivitiessort.add(new SWIMMING("SWIMMING", 0));
        myactivitiessort.add(new KICK_BOXING("KICK_BOXING", 0));
        myactivitiessort.add(new RUNNING("RUNNING", 0));
        myactivitiessort.add(new STRENGTH_TRAINING("STRENGTH_TRAINING", 0));
        for (int i = 0; i < myactivities.size(); i++) {
            if (myactivities.get(i).name.equals("SWIMMING")) {
                myactivitiessort.get(0).calories += myactivities.get(i).simplecalories();
                myactivitiessort.get(0).heartrate += myactivities.get(i).simpleheartrate();
            }

            if (myactivities.get(i).name.equals("KICK_BOXING")) {
                myactivitiessort.get(1).calories += myactivities.get(i).simplecalories();
                myactivitiessort.get(1).heartrate += myactivities.get(i).simpleheartrate();
            }

            if (myactivities.get(i).name.equals("RUNNING")) {
                myactivitiessort.get(2).calories += myactivities.get(i).simplecalories();
                myactivitiessort.get(2).heartrate += myactivities.get(i).simpleheartrate();
            }

            if (myactivities.get(i).name.equals("STRENGTH_TRAINING")) {
                myactivitiessort.get(3).calories += myactivities.get(i).simplecalories();
                myactivitiessort.get(3).heartrate += myactivities.get(i).simpleheartrate();
            }

        }
        int pass;
        Activity temp;
        int i;
        for (pass = 1; pass < myactivitiessort.size(); pass++) {

            for (i = 0; i < myactivitiessort.size() - pass; i++) {
                if (myactivitiessort.get(i).calories < myactivitiessort.get(i + 1).calories) {
                    temp = myactivitiessort.get(i);
                    myactivitiessort.set(i, myactivitiessort.get(i + 1));
                    myactivitiessort.set(i + 1, temp);
                } else if (myactivitiessort.get(i).calories == myactivitiessort.get(i + 1).calories) {
                    if (myactivitiessort.get(i).heartrate < myactivitiessort.get(i + 1).heartrate) {
                        temp = myactivitiessort.get(i);
                        myactivitiessort.set(i, myactivitiessort.get(i + 1));
                        myactivitiessort.set(i + 1, temp);
                    }
                }
            }
        }
        String line = "<HTML>";
        for (i = 0; i < myactivitiessort.size(); i++) {
            Activity myactivity = myactivitiessort.get(i);
            if (myactivity.calories ==0.0)
                continue;
            line = line+(i+1)+"."+ myactivity.name + "<br/>" + " calories burnt: " + myactivity.calories + " calories." + "<br/>" + " heart rate increase: " + myactivity.Heartrate() + " beat/minute.";
            line += "<br/>";
            
        }
        line += "</HTML>";
        label_rank.setText(line);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        label_rank = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Activities Rank:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_rank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame2().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_rank;
    // End of variables declaration//GEN-END:variables
}
