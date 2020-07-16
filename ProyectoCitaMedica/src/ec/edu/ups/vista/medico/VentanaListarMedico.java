/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.medico;

/**
 *
 * @author rober
 */
import ec.edu.ups.controladores.ControladorMedico;
import ec.edu.ups.modelo.Medico;
import java.util.Set;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;

public class VentanaListarMedico extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarMedico
     */
    private ControladorMedico controladorMedico;
    public static DefaultTableModel modelo;
    private Locale localizacion;
    private static ResourceBundle mensajes;

    public VentanaListarMedico(ControladorMedico controladorMedico) {
        initComponents();
        this.controladorMedico = controladorMedico;
        modelo = new DefaultTableModel();
        Object[] columnas = {"CODIGO", "CEDULA", "NOMBRE", "ESPECIALIDAD", "LABORATORIO", "DIRECCION", "TELEFONO"};
        modelo.setColumnIdentifiers(columnas);
        tabla.setModel(modelo);
        llenarTabla();
    }
    public static void cambiarIdioma(Locale localizacion){
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        Object[] columnas = {mensajes.getString("codigo"),mensajes.getString("cedula"), mensajes.getString("nombre"),mensajes.getString("especialidad"),mensajes.getString("laboratorio"), mensajes.getString("direccion"),mensajes.getString("telefono")};
        modelo.setColumnIdentifiers(columnas);
    }

    public void llenarTabla() {
        Set<Medico> Lista = controladorMedico.getLista();
        for (Medico medico : Lista) {
            Object[] datos = {medico.getCodigo(),
                medico.getCedula(),
                medico.getNombre(),
                medico.getEspecialidad(),
                medico.getLaboratoio(),
                medico.getDireccion(),
                medico.getTelefono()};
            modelo.addRow(datos);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CÉDULA", "NOMBRE", "ESPECIALIDAD", "LABORATORIO", "DIRECCIÓN", "TELÉFONO"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
