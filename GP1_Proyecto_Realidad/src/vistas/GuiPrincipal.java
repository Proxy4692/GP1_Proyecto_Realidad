package vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPrincipal extends JFrame{
    private JButton btnAgregarPaciente;
    private JTextField txtNombre, txtEdad, txtAltura, txtPesoActual, txtPesoBuscado;
    public GuiPrincipal(){
        setTitle("Gestion de Dietas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        btnAgregarPaciente = new JButton("Agregar Paciente");
        txtNombre = new JTextField("Nombre");
        txtEdad = new JTextField("Edad");
        txtAltura = new JTextField("Altura");
        txtPesoActual = new JTextField("Peso Actual");
        txtPesoBuscado = new JTextField("Peso Buscado");
        
        btnAgregarPaciente.setBounds(30, 30, 200, 40);
        txtNombre.setBounds(30, 80, 200, 30);
        txtEdad.setBounds(30, 120, 200, 30);
        txtAltura.setBounds(30, 160, 200, 30);
        txtPesoActual.setBounds(30, 200, 200, 30);
        txtPesoBuscado.setBounds(30, 240, 200, 30);
        
        btnAgregarPaciente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // agregar pacientes desde GUI
            }
        });
        add(btnAgregarPaciente);
        add(txtNombre);
        add(txtEdad);
        add(txtAltura);
        add(txtPesoActual);
        add(txtPesoBuscado);
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new GuiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
