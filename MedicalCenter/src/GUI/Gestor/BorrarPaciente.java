package GUI.Gestor;

import clases.Conexion;
import clases.Gestor;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
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
public class BorrarPaciente extends javax.swing.JPanel {

	/**
	 * Creates new form BorrarPaciente
	 */
	private Gestor gestor;
	private TableRowSorter trsActivo;
	private TableRowSorter trsInactivo;

	public BorrarPaciente(Gestor gestor) {
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

        panelPacienteActivo = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaActivos = new javax.swing.JTable();
        textActivos = new javax.swing.JTextField();
        desplegableActivos = new javax.swing.JComboBox();
        labelActivos = new javax.swing.JLabel();
        mostrarActivos = new javax.swing.JButton();
        buttonBorrar = new javax.swing.JButton();
        fieldBorrar = new javax.swing.JTextField();
        DNIOK = new javax.swing.JLabel();
        panelPacienteInactivo = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaInactivos = new javax.swing.JTable();
        textInactivos = new javax.swing.JTextField();
        desplegableInactivos = new javax.swing.JComboBox();
        labelInactivos = new javax.swing.JLabel();
        mostrarInactivos = new javax.swing.JButton();
        buttonReinsertar = new javax.swing.JButton();
        fieldReinsertar = new javax.swing.JTextField();
        DNI2OK = new javax.swing.JLabel();

        panelPacienteActivo.setMaximumSize(new java.awt.Dimension(650, 650));

        tablaActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellidos", "Seguro"
            }
        ));
        tablaActivos.setColumnSelectionAllowed(true);
        jScrollPane4.setViewportView(tablaActivos);

        textActivos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textActivosKeyTyped(evt);
            }
        });

        desplegableActivos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI", "Nombre", "Apellidos", "Seguro" }));

        labelActivos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelActivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelActivos.setText("Pacientes activos");
        labelActivos.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mostrarActivos.setText("Mostrar datos");
        mostrarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActivosActionPerformed(evt);
            }
        });

        buttonBorrar.setText("Borrar");
        buttonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarActionPerformed(evt);
            }
        });

        fieldBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldBorrarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelPacienteActivoLayout = new javax.swing.GroupLayout(panelPacienteActivo);
        panelPacienteActivo.setLayout(panelPacienteActivoLayout);
        panelPacienteActivoLayout.setHorizontalGroup(
            panelPacienteActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacienteActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPacienteActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPacienteActivoLayout.createSequentialGroup()
                        .addComponent(labelActivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacienteActivoLayout.createSequentialGroup()
                        .addGroup(panelPacienteActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPacienteActivoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelPacienteActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4)
                                    .addGroup(panelPacienteActivoLayout.createSequentialGroup()
                                        .addComponent(desplegableActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(283, 283, 283)
                                        .addComponent(textActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelPacienteActivoLayout.createSequentialGroup()
                                .addComponent(mostrarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DNIOK)
                                .addGap(18, 18, 18)
                                .addComponent(fieldBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        panelPacienteActivoLayout.setVerticalGroup(
            panelPacienteActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacienteActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPacienteActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desplegableActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(panelPacienteActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIOK))
                .addContainerGap())
        );

        panelPacienteInactivo.setMaximumSize(new java.awt.Dimension(650, 650));

        tablaInactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellidos", "Seguro"
            }
        ));
        tablaInactivos.setColumnSelectionAllowed(true);
        jScrollPane5.setViewportView(tablaInactivos);

        textInactivos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textInactivosKeyTyped(evt);
            }
        });

        desplegableInactivos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI", "Nombre", "Apellidos", "Seguro" }));

        labelInactivos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelInactivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInactivos.setText("Pacientes inactivos");
        labelInactivos.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mostrarInactivos.setText("Mostrar datos");
        mostrarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarInactivosActionPerformed(evt);
            }
        });

        buttonReinsertar.setText("Reinsertar");
        buttonReinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReinsertarActionPerformed(evt);
            }
        });

        fieldReinsertar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldReinsertarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelPacienteInactivoLayout = new javax.swing.GroupLayout(panelPacienteInactivo);
        panelPacienteInactivo.setLayout(panelPacienteInactivoLayout);
        panelPacienteInactivoLayout.setHorizontalGroup(
            panelPacienteInactivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacienteInactivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPacienteInactivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addComponent(labelInactivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPacienteInactivoLayout.createSequentialGroup()
                        .addComponent(buttonReinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldReinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DNI2OK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacienteInactivoLayout.createSequentialGroup()
                        .addComponent(desplegableInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPacienteInactivoLayout.setVerticalGroup(
            panelPacienteInactivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacienteInactivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPacienteInactivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desplegableInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(panelPacienteInactivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldReinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNI2OK))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPacienteActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPacienteInactivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPacienteActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPacienteInactivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textActivosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textActivosKeyTyped
		textActivos.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				String cadena = (textActivos.getText());
				textActivos.setText(cadena);
				repaint();
				filtroActivo();
			}
		});
		trsActivo = new TableRowSorter(tablaActivos.getModel());
		tablaActivos.setRowSorter(trsActivo);
    }//GEN-LAST:event_textActivosKeyTyped

    private void mostrarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActivosActionPerformed
		try {
			ResultSet rs = gestor.mostrarPacientes();
			tablaActivos.setModel(buildTableModel(rs));

		} catch (SQLException ex) {
			Logger.getLogger(mostrarPacientes.class
					.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_mostrarActivosActionPerformed

    private void buttonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarActionPerformed
		/*
		 String dni = fieldBorrar.getText();
		 if (gestor.comprobarDNI(dni)) {
		 if (gestor.estaBD(dni)) {
		confirmar = JOptionPane.showOptionDialog(this,"Se va ha borrar el paciente, ¿desea confirmar la operacion?","Confirmar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,  options,  options[0]);
		 if (confirmar == 0){
		borrarPaciente(dni);
		}
		 } else {
		 gestor.borrarPaciente(dni);
		 }
		 } else {
			
		 }
		 */
    }//GEN-LAST:event_buttonBorrarActionPerformed

    private void textInactivosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textInactivosKeyTyped
		textInactivos.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				String cadena = (textInactivos.getText());
				textInactivos.setText(cadena);
				repaint();
				filtroInactivo();
			}
		});
		trsInactivo = new TableRowSorter(tablaInactivos.getModel());
		tablaInactivos.setRowSorter(trsInactivo);
    }//GEN-LAST:event_textInactivosKeyTyped

    private void mostrarInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarInactivosActionPerformed
		try {
			ResultSet rs = gestor.mostrarPacientes();
			//ResultSet rs = gestor.mostrarPacientesBorrados();
			tablaInactivos.setModel(buildTableModel(rs));
		} catch (SQLException ex) {
			Logger.getLogger(mostrarPacientes.class
					.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_mostrarInactivosActionPerformed

    private void buttonReinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReinsertarActionPerformed
		int confirmar;
		/*
		 String dni = fieldBorrar.getText();
		 if (gestor.comprobarDNI(dni)) {
		 if (gestor.estaBDBorrado(dni)) {
		 confirmar = JOptionPane.showOptionDialog(this,"Se va ha reinsertar el paciente, ¿desea confirmar la operacion?","Confirmar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,  options,  options[0]);
		 if (confirmar == 0){
		 reinsertarPaciente(dni);
		 }	
		 } else {
		 }
		 } else {
			
		 }
		 */
    }//GEN-LAST:event_buttonReinsertarActionPerformed

	/**
	 * Indica si es correcto el DNI a borrar
	 *
	 * @param evt
	 */
    private void fieldBorrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBorrarKeyReleased
		/*
		 if (gestor.estaBD(fieldBorrar.getText())){
		 DNIOK.setForeground(Color.black);
		 DNIOK.setText("OK!!");
		 } else {
		 DNIOK.setForeground(Color.red);
		 DNIOK.setText("No existe!!");
		 }
				
		 */
    }//GEN-LAST:event_fieldBorrarKeyReleased

    private void fieldReinsertarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldReinsertarKeyReleased
		/*
		 if (gestor.estaBD(fieldReinsertar.getText())){
		 DNI2OK.setForeground(Color.black);
		 DNI2OK.setText("OK!!");
		 } else {
		 DNI2OK.setForeground(Color.red);
		 DNI2OK.setText("No existe!!");
		 }
				
		 */
    }//GEN-LAST:event_fieldReinsertarKeyReleased

	public void filtroActivo() {
		int columnaABuscar = 0;
		if (desplegableActivos.getSelectedItem().equals("DNI")) {
			columnaABuscar = 0;
		}
		if (desplegableActivos.getSelectedItem().equals("Nombre")) {
			columnaABuscar = 1;
		}
		if (desplegableActivos.getSelectedItem().equals("Apellidos")) {
			columnaABuscar = 2;
		}
		if (desplegableActivos.getSelectedItem().equals("Seguro")) {
			columnaABuscar = 3;
		}
		trsActivo.setRowFilter(RowFilter.regexFilter(textActivos.getText(), columnaABuscar));
	}

	public void filtroInactivo() {
		int columnaABuscar = 0;
		if (desplegableInactivos.getSelectedItem().equals("DNI")) {
			columnaABuscar = 0;
		}
		if (desplegableInactivos.getSelectedItem().equals("Nombre")) {
			columnaABuscar = 1;
		}
		if (desplegableInactivos.getSelectedItem().equals("Apellidos")) {
			columnaABuscar = 2;
		}
		if (desplegableInactivos.getSelectedItem().equals("Seguro")) {
			columnaABuscar = 3;
		}
		trsInactivo.setRowFilter(RowFilter.regexFilter(textInactivos.getText(), columnaABuscar));
	}

	public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
		java.sql.ResultSetMetaData metaData = rs.getMetaData();

		// names of columns
		Vector<String> columnNames = new Vector<String>();
		int columnCount = metaData.getColumnCount();
		for (int column = 1; column <= columnCount; column++) {
			columnNames.add(metaData.getColumnName(column));
		}

		// data of the table
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		while (rs.next()) {
			Vector<Object> vector = new Vector<Object>();
			for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
				vector.add(rs.getObject(columnIndex));
			}
			data.add(vector);
		}

		return new DefaultTableModel(data, columnNames);

	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DNI2OK;
    private javax.swing.JLabel DNIOK;
    private javax.swing.JButton buttonBorrar;
    private javax.swing.JButton buttonReinsertar;
    private javax.swing.JComboBox desplegableActivos;
    private javax.swing.JComboBox desplegableInactivos;
    private javax.swing.JTextField fieldBorrar;
    private javax.swing.JTextField fieldReinsertar;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelActivos;
    private javax.swing.JLabel labelInactivos;
    private javax.swing.JButton mostrarActivos;
    private javax.swing.JButton mostrarInactivos;
    private javax.swing.JPanel panelPacienteActivo;
    private javax.swing.JPanel panelPacienteInactivo;
    private javax.swing.JTable tablaActivos;
    private javax.swing.JTable tablaInactivos;
    private javax.swing.JTextField textActivos;
    private javax.swing.JTextField textInactivos;
    // End of variables declaration//GEN-END:variables
}
