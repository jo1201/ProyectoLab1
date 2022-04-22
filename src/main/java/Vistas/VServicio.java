/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import Controladores.CServicio;
import Generales.Mensajes;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import Generales.Validacion;
import javax.swing.JComboBox;

/**
 *
 * @author Khaal
 */
public class VServicio extends javax.swing.JPanel {
    private CServicio cserv;
    private Mensajes msj;
    
    public VServicio() {
        initComponents();
        sinRegistro();
    }
    
    public void sinRegistro(){
        getTxtBuscar().setEditable(true);
        txtCodigo.setEditable(false);
        getTxtNombre().setEditable(false);
        txtCosto.setEditable(false);
        getTxtTipo().setEditable(false);
        btnConsular.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(true);
        getTxtBuscar().setText("");
        txtCodigo.setText("");
        getTxtNombre().setText("");
        txtCosto.setText("");
        getTxtTipo().setSelectedIndex(0);
    }
    
    public void registroEnc(){
        getTxtBuscar().setEditable(false);
        txtCodigo.setEditable(false);
        getTxtNombre().setEditable(true);
        txtCosto.setEditable(true);
        getTxtTipo().setEditable(false);
        btnConsular.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnCancelar.setEnabled(true);
        getTxtBuscar().setText("");
    }
    
    public void registronoEnc(){
        getTxtBuscar().setEditable(false);
        txtCodigo.setEditable(false);
        getTxtNombre().setEditable(true);
        txtCosto.setEditable(true);
        getTxtTipo().setEditable(true);
        btnConsular.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(true);
        txtBuscar.setText("");
    }
    
    public void agregarListener(ActionListener accion) {
        btnConsular.addActionListener(accion);
        btnAgregar.addActionListener(accion);
        btnModificar.addActionListener(accion);
        btnEliminar.addActionListener(accion);
        btnCancelar.addActionListener(accion);
        btnSalir.addActionListener(accion);
    }


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
        txtTipo = new javax.swing.JComboBox<>();
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
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("Codigo:");
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

        jLabel3.setText("Codigo:");
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

        jLabel5.setText("Tipo:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 140, 27, 16);

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médico", "Donación" }));
        jPanel2.add(txtTipo);
        txtTipo.setBounds(100, 132, 270, 30);

        jLabel6.setText("Costo:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 180, 34, 16);

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

    private void btnConsularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConsularKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsularKeyPressed

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

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        Validacion.validarAlfanumerico(evt);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Validacion.validarLetra(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        Validacion.validarDecimal(evt, txtCosto);
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
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public JTextField getTxtCosto() {
        return txtCosto;
    }

    public void setTxtCosto(JTextField txtCosto) {
        this.txtCosto = txtCosto;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JComboBox getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JComboBox txtTipo) {
        this.txtTipo = txtTipo;
    }







}





