/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import clases.Conexion;

/**
 *
 * @author bm0275
 */
public class Login extends javax.swing.JPanel {

	/**
	 * Creates new form Login
	 */
	public Login() {
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

        iniciarSesion = new javax.swing.JPanel();
        passwordFieldPassword = new javax.swing.JPasswordField();
        labelUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        bottonConectar = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        textFieldUser = new javax.swing.JTextField();

        iniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelUser.setText("Usuario");

        labelPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPassword.setText("Contraseña");

        bottonConectar.setText("Conectar");
        bottonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonConectarActionPerformed(evt);
            }
        });
        bottonConectar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bottonConectarKeyPressed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("Iniciar Sesion");

        textFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iniciarSesionLayout = new javax.swing.GroupLayout(iniciarSesion);
        iniciarSesion.setLayout(iniciarSesionLayout);
        iniciarSesionLayout.setHorizontalGroup(
            iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciarSesionLayout.createSequentialGroup()
                        .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(iniciarSesionLayout.createSequentialGroup()
                        .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(iniciarSesionLayout.createSequentialGroup()
                .addGroup(iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iniciarSesionLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iniciarSesionLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(bottonConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        iniciarSesionLayout.setVerticalGroup(
            iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(textFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(bottonConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUserActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_textFieldUserActionPerformed
/*   
    private void bottonConectarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bottonConectarKeyPressed
     
				 //if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
				 // Conecta con la base de datos y muestra el menu
				 // segun el usuario que haya entrado
				 try {
				 con = new Conexion(textFieldUser.getText(), passwordFieldPassword.getPassword());

				 if (con.esValida() && con.getUser().equals("root")) {
				 panelPrincipal.setSize(panelPrincipal.getWidth() + iniciarSesion.getWidth(), panelPrincipal.getHeight());
				 MenuGestor menuGestor = new MenuGestor(con);
				 menuGestor.setSize(panelPrincipal.getWidth(), panelPrincipal.getHeight());
				 menuGestor.setLocation(0, 0);

				 panelPrincipal.removeAll();
				 iniciarSesion.setVisible(false);
				 panelPrincipal.add(menuGestor, BorderLayout.WEST);
				 panelPrincipal.revalidate();
				 panelPrincipal.repaint();
				 labelUsuario.setText(con.getUser());
				 bottonDesconectar.setEnabled(true);
				 }

				 if (con.esValida() && !(con.getUser().equals("root"))) {
				 panelPrincipal.setSize(panelPrincipal.getWidth() + iniciarSesion.getWidth(), panelPrincipal.getHeight());
				 MenuMedico menuMedico = new MenuMedico(con);
				 menuMedico.setSize(panelPrincipal.getWidth(), panelPrincipal.getHeight());
				 menuMedico.setLocation(0, 0);

				 panelPrincipal.removeAll();
				 iniciarSesion.setVisible(false);
				 panelPrincipal.add(menuMedico, BorderLayout.WEST);
				 panelPrincipal.revalidate();
				 panelPrincipal.repaint();
				 labelUsuario.setText(con.getUser());
				 bottonDesconectar.setEnabled(true);
				 }

				 } catch (SQLException ex) {
				 Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
				 }
				 //}
    }//GEN-LAST:event_bottonConectarKeyPressed

    private void bottonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonConectarActionPerformed
        try {
            con = new Conexion(textFieldUser.getText(), passwordFieldPassword.getPassword());

            if (con.esValida() && con.getUser().equals("root")) {
                crearMenuGestor();
            }
            if (con.esValida() && con.existeMedico(con.getUser())) {
                crearMenuMedico();
            }

        } catch (SQLException ex) {
            Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bottonConectarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottonConectar;
    private javax.swing.JPanel iniciarSesion;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPasswordField passwordFieldPassword;
    private javax.swing.JTextField textFieldUser;
    // End of variables declaration//GEN-END:variables
*/
	}