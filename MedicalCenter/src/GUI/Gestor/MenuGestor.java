package GUI.Gestor;


import clases.Conexion;
import clases.Gestor;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class MenuGestor extends javax.swing.JPanel {

	/**
	 * Creates new form MenuGestor
	 */
	private TableRowSorter trsFiltro;
    private Gestor gestor;
	private Connection reg;
	private AñadirPaciente añadirPaciente;
	private BorrarPaciente borrarPaciente;
	private GestionarPacientes gestionarPacientes;
	private MenuDeMedico menuDeMedico;
	private mostrarSalas mostrarSalas;
	private mostrarPacientes mostrarPacientes;
	
	public MenuGestor(Gestor gestor) {
		initComponents();
        this.gestor = gestor;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarDatos = new javax.swing.JPanel();
        menuOpciones = new javax.swing.JPanel();
        buttonAñadirPaciente = new javax.swing.JButton();
        buttonGestionarPacientes = new javax.swing.JButton();
        buttonGestionarMedico = new javax.swing.JButton();
        buttonMostrarSalas = new javax.swing.JButton();
        buttonBorrarPaciente = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        mostrarDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        mostrarDatos.setForeground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout mostrarDatosLayout = new javax.swing.GroupLayout(mostrarDatos);
        mostrarDatos.setLayout(mostrarDatosLayout);
        mostrarDatosLayout.setHorizontalGroup(
            mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mostrarDatosLayout.setVerticalGroup(
            mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        menuOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        buttonAñadirPaciente.setText("Añadir nuevo paciente");
        buttonAñadirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAñadirPacienteActionPerformed(evt);
            }
        });

        buttonGestionarPacientes.setText("Gestionar pacientes");
        buttonGestionarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGestionarPacientesActionPerformed(evt);
            }
        });

        buttonGestionarMedico.setText("Gestionar medicos");
        buttonGestionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGestionarMedicoActionPerformed(evt);
            }
        });

        buttonMostrarSalas.setText("Mostrar agenda");
        buttonMostrarSalas.setMaximumSize(new java.awt.Dimension(100, 25));
        buttonMostrarSalas.setMinimumSize(new java.awt.Dimension(100, 25));
        buttonMostrarSalas.setPreferredSize(new java.awt.Dimension(100, 25));
        buttonMostrarSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarSalasActionPerformed(evt);
            }
        });

        buttonBorrarPaciente.setText("Borrar / Reinsertar paciente");
        buttonBorrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuOpcionesLayout = new javax.swing.GroupLayout(menuOpciones);
        menuOpciones.setLayout(menuOpcionesLayout);
        menuOpcionesLayout.setHorizontalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAñadirPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                .addComponent(buttonMostrarSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonGestionarPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonGestionarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuOpcionesLayout.setVerticalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGestionarPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGestionarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMostrarSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAñadirPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorAdded

    private void buttonBorrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarPacienteActionPerformed
        borrarPaciente = new BorrarPaciente(gestor);
        borrarPaciente.setSize(mostrarDatos.getWidth(), mostrarDatos.getHeight());
        borrarPaciente.setLocation(0, 0);

        mostrarDatos.removeAll();
        mostrarDatos.add(borrarPaciente, BorderLayout.CENTER);
        mostrarDatos.revalidate();
        mostrarDatos.repaint();
    }//GEN-LAST:event_buttonBorrarPacienteActionPerformed

    private void buttonAñadirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAñadirPacienteActionPerformed
		añadirPaciente = new AñadirPaciente(gestor);
        añadirPaciente.setSize(mostrarDatos.getWidth(), mostrarDatos.getHeight());
        añadirPaciente.setLocation(0, 0);

        mostrarDatos.removeAll();
        mostrarDatos.add(añadirPaciente, BorderLayout.CENTER);
        mostrarDatos.revalidate();
        mostrarDatos.repaint();
    }//GEN-LAST:event_buttonAñadirPacienteActionPerformed

    private void buttonGestionarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGestionarPacientesActionPerformed
		gestionarPacientes = new  GestionarPacientes(gestor);
        gestionarPacientes.setSize(mostrarDatos.getWidth(), mostrarDatos.getHeight());
        gestionarPacientes.setLocation(0, 0);

		mostrarDatos.removeAll();
        mostrarDatos.add(gestionarPacientes, BorderLayout.WEST);
        mostrarDatos.revalidate();
        mostrarDatos.repaint();
    }//GEN-LAST:event_buttonGestionarPacientesActionPerformed

    private void buttonMostrarSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarSalasActionPerformed
      	mostrarSalas = new mostrarSalas(gestor);
		mostrarSalas.setSize(mostrarDatos.getWidth(), mostrarDatos.getHeight());
        mostrarSalas.setLocation(0, 0);
		
		mostrarDatos.removeAll();
		mostrarDatos.add(mostrarSalas, BorderLayout.CENTER);
		mostrarDatos.revalidate();
		mostrarDatos.repaint();
    }//GEN-LAST:event_buttonMostrarSalasActionPerformed

    private void buttonGestionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGestionarMedicoActionPerformed
		menuDeMedico = new  MenuDeMedico(gestor);
        menuDeMedico.setSize(mostrarDatos.getWidth(), mostrarDatos.getHeight());
        menuDeMedico.setLocation(0, 0);

		mostrarDatos.removeAll();
        mostrarDatos.add(menuDeMedico, BorderLayout.WEST);
        mostrarDatos.revalidate();
        mostrarDatos.repaint();
    }//GEN-LAST:event_buttonGestionarMedicoActionPerformed
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAñadirPaciente;
    private javax.swing.JButton buttonBorrarPaciente;
    private javax.swing.JButton buttonGestionarMedico;
    private javax.swing.JButton buttonGestionarPacientes;
    private javax.swing.JButton buttonMostrarSalas;
    private javax.swing.JPanel menuOpciones;
    private javax.swing.JPanel mostrarDatos;
    // End of variables declaration//GEN-END:variables
}