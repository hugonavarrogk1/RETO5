/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.vo.Lider;
import model.vo.Proyecto;

/**
 *
 * @author hugon
 */
public class aplicativo extends javax.swing.JFrame {

    /**
     * Creates new form aplicativo
     */
    public aplicativo() {
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_req1 = new javax.swing.JTable();
        btn_req1 = new javax.swing.JButton();
        btn_req2 = new javax.swing.JButton();
        btn_req3 = new javax.swing.JButton();
        btn_req4 = new javax.swing.JButton();
        btn_req5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusLost(evt);
            }
        });

        tabla_req1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_req1);

        btn_req1.setText("Requerimiento 1");
        btn_req1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_req1ActionPerformed(evt);
            }
        });

        btn_req2.setText("Requerimiento 2");
        btn_req2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_req2ActionPerformed(evt);
            }
        });

        btn_req3.setText("Requerimiento 3");
        btn_req3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_req3ActionPerformed(evt);
            }
        });

        btn_req4.setText("Requerimiento 4");
        btn_req4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_req4ActionPerformed(evt);
            }
        });

        btn_req5.setText("Requerimiento 5");
        btn_req5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_req5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_req1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(btn_req2)
                        .addGap(65, 65, 65)
                        .addComponent(btn_req3)
                        .addGap(57, 57, 57)
                        .addComponent(btn_req4)
                        .addGap(59, 59, 59)
                        .addComponent(btn_req5)
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_req1)
                    .addComponent(btn_req2)
                    .addComponent(btn_req3)
                    .addComponent(btn_req4)
                    .addComponent(btn_req5))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bases de Datos", jPanel2);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setText("EMPRESA DE CONSTRUCCION S.A");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setText("UTP MISION TIC 2022");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1FocusLost

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:
        /*
        
        */
        /*
        
        */
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void btn_req1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_req1ActionPerformed
        // TODO add your handling code here:
        String[] columnas = {"Fecha_Inicio", "Numero_Habitaciones", "Numero_Banos"};
        Controlador controlador = new Controlador();
        ArrayList<Proyecto> listaRequerimiento1;

        try{
            listaRequerimiento1 = controlador.Solucionar_requerimiento_1();
            Object[][] datos = new Object[listaRequerimiento1.size()][3];
            for(int i = 0; i < listaRequerimiento1.size(); i++){
                datos[i][0] = listaRequerimiento1.get(i).getFecha_inicio();
                datos[i][1] = listaRequerimiento1.get(i).getNum_habitaciones();
                datos[i][2] = listaRequerimiento1.get(i).getNum_banios();
            }
            DefaultTableModel tablaModelo = new DefaultTableModel(datos,columnas);
            tabla_req1.setModel(tablaModelo);
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_req1ActionPerformed

    private void btn_req2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_req2ActionPerformed
        // TODO add your handling code here:
        String[] columnas = {"Fecha_Inicio", "Numero_Habitaciones", "Numero_Banos","Nombre_Lider","Apellido_Lider","Estrato_Proyecto"};
        Controlador controlador = new Controlador();
        ArrayList<Proyecto> listaRequerimiento2;

        try{
            listaRequerimiento2 = controlador.Solucionar_requerimiento_2();
            Object[][] datos = new Object[listaRequerimiento2.size()][6];
            for(int i = 0; i < listaRequerimiento2.size(); i++){
                datos[i][0] = listaRequerimiento2.get(i).getFecha_inicio();
                datos[i][1] = listaRequerimiento2.get(i).getNum_habitaciones();
                datos[i][2] = listaRequerimiento2.get(i).getNum_banios();
                datos[i][3] = listaRequerimiento2.get(i).getNombre();
                datos[i][4] = listaRequerimiento2.get(i).getApellido();
                datos[i][5] = listaRequerimiento2.get(i).getEstrato_proyecto();
            }
            DefaultTableModel tablaModelo = new DefaultTableModel(datos,columnas);
            tabla_req1.setModel(tablaModelo);
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_req2ActionPerformed

    private void btn_req3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_req3ActionPerformed
        // TODO add your handling code here:
        String[] columnas = {"Total_Habitaciones", "Constructora"};
        Controlador controlador = new Controlador();
        ArrayList<Proyecto> listaRequerimiento3;

        try{
            listaRequerimiento3 = controlador.Solucionar_requerimiento_3();
            Object[][] datos = new Object[listaRequerimiento3.size()][2];
            for(int i = 0; i < listaRequerimiento3.size(); i++){
                datos[i][0] = listaRequerimiento3.get(i).getNum_habitaciones();
                datos[i][1] = listaRequerimiento3.get(i).getNombre_constructora();
            }
            DefaultTableModel tablaModelo = new DefaultTableModel(datos,columnas);
            tabla_req1.setModel(tablaModelo);
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_req3ActionPerformed

    private void btn_req4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_req4ActionPerformed
        // TODO add your handling code here:
        String[] columnas = {"Nombre_Lider", "Apellido_Lider"};
        Controlador controlador = new Controlador();
        ArrayList<Lider> listaRequerimiento4;

        try{
            listaRequerimiento4 = controlador.Solucionar_requerimiento_4();
            Object[][] datos = new Object[listaRequerimiento4.size()][2];
            for(int i = 0; i < listaRequerimiento4.size(); i++){
                datos[i][0] = listaRequerimiento4.get(i).getNombre();
                datos[i][1] = listaRequerimiento4.get(i).getApellido();
            }
            DefaultTableModel tablaModelo = new DefaultTableModel(datos,columnas);
            tabla_req1.setModel(tablaModelo);
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_req4ActionPerformed

    private void btn_req5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_req5ActionPerformed
        // TODO add your handling code here:
        String[] columnas = {"Total_Habitaciones", "Constructora"};
        Controlador controlador = new Controlador();
        ArrayList<Proyecto> listaRequerimiento5;

        try{
            listaRequerimiento5 = controlador.Solucionar_requerimiento_5();
            Object[][] datos = new Object[listaRequerimiento5.size()][2];
            for(int i = 0; i < listaRequerimiento5.size(); i++){
                datos[i][0] = listaRequerimiento5.get(i).getNum_habitaciones();
                datos[i][1] = listaRequerimiento5.get(i).getNombre_constructora();
            }
            DefaultTableModel tablaModelo = new DefaultTableModel(datos,columnas);
            tabla_req1.setModel(tablaModelo);
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_req5ActionPerformed

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
            java.util.logging.Logger.getLogger(aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplicativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_req1;
    private javax.swing.JButton btn_req2;
    private javax.swing.JButton btn_req3;
    private javax.swing.JButton btn_req4;
    private javax.swing.JButton btn_req5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_req1;
    // End of variables declaration//GEN-END:variables

}