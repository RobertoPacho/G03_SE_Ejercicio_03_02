/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.medicina;

import ec.edu.ups.controladores.ControladorMedicina;
import ec.edu.ups.modelo.Medicina;
import static ec.edu.ups.vista.medicina.VentanaCrearMedicina.txtPrecio;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author rober
 */
public class VentanaBuscarMedicina extends javax.swing.JInternalFrame {

    private ControladorMedicina controladorMedicina;
    private Locale localizacion;
    private static ResourceBundle mensajes;

    /**
     * Creates new form VentanaBuscarMedicina
     */
    public VentanaBuscarMedicina(ControladorMedicina controladorMedicina) {
        initComponents();
        this.controladorMedicina = controladorMedicina;
    }

    public static void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        lblMenuCrearP.setText(mensajes.getString("encabezado.buscar.medicina"));
        lblcodigo.setText(mensajes.getString("codigo"));
        lblnombre.setText(mensajes.getString("nombre"));
        lblmarca.setText(mensajes.getString("marca"));
        lbldescripcion.setText(mensajes.getString("descripcion"));
        lblprecio.setText(mensajes.getString("precio"));
        lblguardar.setText(mensajes.getString("buscar"));
        lblcancelar.setText(mensajes.getString("cancelar"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuCrearP = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblcodigo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio2 = new javax.swing.JTextField();
        btnguardar3 = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblguardar = new javax.swing.JLabel();
        lblcancelar = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lbldescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblMenuCrearP.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMenuCrearP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuCrearP.setText("BUSCAR MEDICINA");
        lblMenuCrearP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setToolTipText("");

        lblcodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcodigo.setText("CÓDIGO");
        lblcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblnombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombre.setText("NOMBRE");
        lblnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblprecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblprecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprecio.setText("PRECIO");
        lblprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPrecio2.setEditable(false);
        txtPrecio2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnguardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscar.png"))); // NOI18N
        btnguardar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar3ActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/cancelar.png"))); // NOI18N
        btncancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        lblguardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblguardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblguardar.setText("BUSCAR");
        lblguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblcancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblcancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcancelar.setText("CANCELAR");
        lblcancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblmarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmarca.setText("MARCA");
        lblmarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbldescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldescripcion.setText("DESCRIPCIÓN");
        lbldescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDescripcion.setEditable(false);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescripcion.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnguardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbldescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblMenuCrearP, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblMenuCrearP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar3ActionPerformed

        int codigo = Integer.parseInt(txtCodigo.getText());
        Medicina buscarMedicina = controladorMedicina.read(codigo);
        txtNombre.setText(buscarMedicina.getNombre());
        txtMarca.setText(buscarMedicina.getMarca());
        txtDescripcion.setText(buscarMedicina.getDescripcion());
        txtPrecio.setText(String.valueOf(buscarMedicina.getPrecio()));
        JOptionPane.showMessageDialog(this, "MEDICINA ENCONTRADA");
    }//GEN-LAST:event_btnguardar3ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // boton cancelar
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar3;
    public static javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel lblMenuCrearP;
    public static javax.swing.JLabel lblcancelar;
    public static javax.swing.JLabel lblcodigo;
    public static javax.swing.JLabel lbldescripcion;
    public static javax.swing.JLabel lblguardar;
    public static javax.swing.JLabel lblmarca;
    public static javax.swing.JLabel lblnombre;
    public static javax.swing.JLabel lblprecio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    public static javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtPrecio2;
    // End of variables declaration//GEN-END:variables
}
