/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import Generales.Mensajes;
import Generales.Validacion;

/**
 *
 * @author Khaal
 */
public class VResponsable extends javax.swing.JPanel {
        private Mensajes msj;
    /**
     * Creates new form VResponsable
     */
    public VResponsable() {
        
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
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnConsular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(50, 255, 181));
        setPreferredSize(new java.awt.Dimension(666, 300));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 26, 50, 30);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(70, 20, 230, 40);

        btnConsular.setText("Consultar");
        btnConsular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsularActionPerformed(evt);
            }
        });
        btnConsular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConsularKeyPressed(evt);
            }
        });
        jPanel1.add(btnConsular);
        btnConsular.setBounds(310, 20, 100, 40);

        jLabel8.setFont(new java.awt.Font("Aller Light", 0, 12)); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 430, 80);

        add(jPanel1);
        jPanel1.setBounds(30, 20, 430, 80);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(null);

        jLabel3.setText("Cedula");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 60, 50, 16);

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCodigo);
        txtCodigo.setBounds(100, 50, 270, 30);

        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 100, 50, 16);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre);
        txtNombre.setBounds(100, 90, 270, 30);

        jLabel5.setText("Apellido:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 140, 50, 16);

        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTipo);
        txtTipo.setBounds(100, 130, 270, 30);

        jLabel6.setText("Edad:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 180, 60, 16);

        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCosto);
        txtCosto.setBounds(100, 170, 270, 30);

        jLabel7.setFont(new java.awt.Font("Aller Light", 0, 12)); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 430, 250);

        add(jPanel2);
        jPanel2.setBounds(30, 120, 430, 250);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(null);

        btnAgregar.setText("Agregar");
        jPanel3.add(btnAgregar);
        btnAgregar.setBounds(30, 40, 110, 30);

        btnModificar.setText("Modificar");
        jPanel3.add(btnModificar);
        btnModificar.setBounds(30, 80, 110, 30);

        btnEliminar.setText("Eliminar");
        jPanel3.add(btnEliminar);
        btnEliminar.setBounds(30, 120, 110, 30);

        btnCancelar.setText("Cancelar");
        jPanel3.add(btnCancelar);
        btnCancelar.setBounds(30, 160, 110, 30);

        btnSalir.setText("Salir");
        jPanel3.add(btnSalir);
        btnSalir.setBounds(30, 200, 110, 30);

        jLabel1.setFont(new java.awt.Font("Aller Light", 0, 12)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Operaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 170, 250);

        add(jPanel3);
        jPanel3.setBounds(490, 120, 170, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if(evt.getKeyChar()==java.awt.event.KeyEvent.VK_ENTER){
            if(txtBuscar.getText().equalsIgnoreCase("")){
                msj.mvacio("Por favor ingrese un codigo para buscar","Codigo Vacio",txtCodigo);
            }else{
                // cserv.buscar();
            }
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnConsularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsularActionPerformed

    private void btnConsularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConsularKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsularKeyPressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        Validacion.validarAlfanumerico(evt);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        Validacion.validarAlfanumerico(evt);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Validacion.validarLetra(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        Validacion.validarLetra(evt);
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        Validacion.validarEntero(evt);
    }//GEN-LAST:event_txtCostoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsular;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
