/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import com.mysql.jdbc.Connection;
import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import Model.*;
import Connector.*;

/**
 *
 * @author victormanuel
 */
public class Alta_maestro extends javax.swing.JInternalFrame {

    //Se instancia la clase conexion
    Grado grado = new Grado();
    Grupo grupo = new Grupo();
    Maestro_consulta am = new Maestro_consulta();

    //varibale para seleccionar el sexo
    String sexo_;
    int contadorAlumnos=0;
    Conexion con = new Conexion();
    /**
     * Creates new form Alta_alumno
     */
    public Alta_maestro() {
        initComponents();
        
        //btn_registrar.setEnabled(false); //boton inhabilitado

        DefaultComboBoxModel CB_gp = new DefaultComboBoxModel(grupo.mostrarGrupo()); // va a la clase grupo y me trae los datos para llenar el comobobox
        cbx_grupo.setModel(CB_gp);
        
        DefaultComboBoxModel CB_grado = new DefaultComboBoxModel(grado.mostrarGrado()); // va a la clase grado y me trae los datos para llenar el combobox
        cbx_grado.setModel(CB_grado);

        validar();

    }

    public void validar() { //validacion de campos vacios

        if (txt_cedula.getText().isEmpty()) {
            lb_v_cedula.setText("*");

        } else {
            lb_v_cedula.setText("");
        }

      

        if (txt_maestro.getText().isEmpty()) {
            lb_v_tutor.setText("*");
        } else {
            lb_v_tutor.setText("");
        }

      

        if (txt_maestro.getText().isEmpty() || txt_cedula.getText().isEmpty() ) {
            btn_registrar.setEnabled(false);
        } else {
            btn_registrar.setEnabled(true);
        }
    }

    public void validadcaracteres(java.awt.event.KeyEvent evento) { //validacion de caracteres

        if (evento.getKeyChar() >= 33 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 208
                || evento.getKeyChar() >= 210 && evento.getKeyChar() <= 240
                || evento.getKeyChar() >= 242 && evento.getKeyChar() <= 255) {
            evento.consume();
            JOptionPane.showMessageDialog(null, "NO SE PERMITEN CARACTERES ESPECIALES", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }

    }
 public void validadcaracterescurp (java.awt.event.KeyEvent evento){
    //valida con los valores ascii
        if(evento.getKeyChar() >= 33 && evento.getKeyChar() <= 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 208
                || evento.getKeyChar() >= 210 && evento.getKeyChar() <= 240
                || evento.getKeyChar() >= 242 && evento.getKeyChar() <= 255
                ){
        evento.consume();
        JOptionPane.showMessageDialog(null, "NO SE PERMITEN CARACTERES ESPECIALES","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        txt_maestro = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lb_v_cedula = new javax.swing.JLabel();
        lb_v_tutor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cbx_grupo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbx_grado = new javax.swing.JComboBox<>();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Maestros");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(955, 468));
        setNormalBounds(new java.awt.Rectangle(0, 0, 107, 0));
        setPreferredSize(new java.awt.Dimension(955, 468));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 468));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setMinimumSize(new java.awt.Dimension(0, 0));
        Panel1.setPreferredSize(new java.awt.Dimension(955, 468));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_maestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_maestroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_maestroKeyTyped(evt);
            }
        });
        Panel1.add(txt_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 248, -1));

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        Panel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 173, -1));

        btn_registrar.setBackground(new java.awt.Color(8, 59, 102));
        btn_registrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(204, 204, 204));
        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar.png"))); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setToolTipText("");
        btn_registrar.setBorder(null);
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrarMouseExited(evt);
            }
        });
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        Panel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 150, 38));

        btn_limpiar.setBackground(new java.awt.Color(8, 59, 102));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(204, 204, 204));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setToolTipText("");
        btn_limpiar.setBorder(null);
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseExited(evt);
            }
        });
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        Panel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 150, 38));

        btn_salir.setBackground(new java.awt.Color(8, 59, 102));
        btn_salir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(204, 204, 204));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setToolTipText("");
        btn_salir.setBorder(null);
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salirMouseExited(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        Panel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 150, 38));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del maestro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        lb_v_cedula.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_cedula.setText("jLabel12");

        lb_v_tutor.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_tutor.setText("jLabel8");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Nombre del maestro:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel7.setText("Cedula");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_v_cedula)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                        .addComponent(lb_v_tutor)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_v_tutor)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_v_cedula)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        Panel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grado y Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel9.setText("Grupo:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel11.setText("Grado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        Panel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 400, 110));

        btn_modificar.setBackground(new java.awt.Color(8, 59, 102));
        btn_modificar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(204, 204, 204));
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setToolTipText("");
        btn_modificar.setBorder(null);
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_modificarMouseExited(evt);
            }
        });
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        Panel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 130, 40));

        btn_eliminar.setBackground(new java.awt.Color(8, 59, 102));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(204, 204, 204));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setToolTipText("");
        btn_eliminar.setBorder(null);
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseExited(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        Panel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 130, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Maestro", "Grado", "Grupo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 520, 130));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        Panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel10.setText("Buscar :");
        Panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });
        Panel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 353, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Alta de Alumnos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maestroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_maestroKeyTyped

        validadcaracteres(evt);


    }//GEN-LAST:event_txt_maestroKeyTyped

    private void txt_maestroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_maestroKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_maestroKeyReleased

    private void txt_cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_cedulaKeyReleased

    private void btn_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseEntered

    }//GEN-LAST:event_btn_registrarMouseEntered

    private void btn_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseExited

    }//GEN-LAST:event_btn_registrarMouseExited

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        Grupo grupo = (Grupo) cbx_grupo.getSelectedItem(); //selecciona el dato que este en el combobox
        Grado g = (Grado) cbx_grado.getSelectedItem();

        int id = 0, grado_ = 0, grupo_=0, cedula_ = 0;
        String nombre_, eliminar_ = "NO";
        
        try {
            //se obtienen los valores de la caja de texto y combo box
            nombre_ = txt_maestro.getText().toUpperCase();
            grupo_ = grupo.getId();
            grado_ = g.getId();
            cedula_ = Integer.parseInt(txt_cedula.getText());
            Conexion con = new Conexion();
            Statement st2 = con.getConnection().createStatement(); 

           if(grado_ == 1){
               ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '1' and id_grupo='1' and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.registrarMaestro(1, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           
           }
           
           if(grado_ == 2){
                ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '2' and id_grupo='1'and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.registrarMaestro(1, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           }
           
           if(grado_ == 3){
            ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '3' and id_grupo='1'and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.registrarMaestro(1, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           }
           
           if(grado_ == 4){
                ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '4' and id_grupo='1'and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.registrarMaestro(1, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           
           }
           
           if(grado_ == 5){
            ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '5' and id_grupo='1'and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.registrarMaestro(1, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           
           }
           
           if(grado_ == 6){
           
                ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '6' and id_grupo='1'and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.registrarMaestro(1, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           }
           
           
           
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Error en el Ingreso de Datos, Revise si no hay campos sin rellenar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {

            limpiar();
            //validar();
        }
         
        
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiarMouseEntered

    private void btn_limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiarMouseExited

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarMouseEntered

    private void btn_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarMouseExited

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
         Grupo grupo = (Grupo) cbx_grupo.getSelectedItem(); //selecciona el dato que este en el combobox
        Grado g = (Grado) cbx_grado.getSelectedItem();

        int id = 0, grado_ = 0, grupo_=0, cedula_ = 0;
        String nombre_, eliminar_ = "NO";
        
        try {
            //se obtienen los valores de la caja de texto y combo box
            nombre_ = txt_maestro.getText().toUpperCase();
            grupo_ = grupo.getId();
            grado_ = g.getId();
            cedula_ = Integer.parseInt(txt_cedula.getText());
            Conexion con = new Conexion();
            Statement st2 = con.getConnection().createStatement(); 

           if(grado_ == 1){
               ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '1' and id_grupo='1' and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.modificarMaestro(2, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           
           }
           
           if(grado_ == 2){
                ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '2' and id_grupo='1' and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.modificarMaestro(2, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           }
           
           if(grado_ == 3){
            ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '3' and id_grupo='1' and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.modificarMaestro(2, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           }
           
           if(grado_ == 4){
                ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '4' and id_grupo='1' and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.modificarMaestro(2, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           
           }
           
           if(grado_ == 5){
            ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '5' and id_grupo='1' and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.modificarMaestro(2, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           
           }
           
           if(grado_ == 6){
           
                ResultSet r2= st2.executeQuery("SELECT * FROM maestro where id_grado = '6' and id_grupo='1' and eliminar='NO';"); 
              if (r2.next()){ 
                JOptionPane.showMessageDialog(null, "YA HAY MAESTRO EN ESTE GRADO"); 
              }
              else
              {
                am.modificarMaestro(2, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              }
           }
           
            
            
            
            
            
            
           
                //am.modificarMaestro(2, id, nombre_, grado_,grupo_,eliminar_,cedula_);
           
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Error en el Ingreso de Datos, Revise si no hay campos sin rellenar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {

            limpiar();
            //validar();
        }

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarMouseEntered

    private void btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarMouseExited

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Grupo grupo = (Grupo) cbx_grupo.getSelectedItem(); //selecciona el dato que este en el combobox
        Grado g = (Grado) cbx_grado.getSelectedItem();

        int id = 0, grado_ = 0, grupo_=0, cedula_ = 0;
        String nombre_, eliminar_ = "NO";
        
        try {
            //se obtienen los valores de la caja de texto y combo box
            nombre_ = txt_maestro.getText().toUpperCase();
            grupo_ = grupo.getId();
            grado_ = g.getId();
            cedula_ = Integer.parseInt(txt_cedula.getText());
          
                am.registrarMaestro(3, id, nombre_, grado_,grupo_,eliminar_,cedula_);
              
            
                
           
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Error en el Ingreso de Datos, Revise si no hay campos sin rellenar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {

            limpiar();
            //validar();
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        // TODO add your handling code here:
        String y;
        y = txt_buscar.getText();

        buscar(y);
    }//GEN-LAST:event_txt_buscarKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int x;
        int fila = jTable1.getSelectedRow();
        txt_cedula.setText(jTable1.getValueAt(fila, 0).toString());
        txt_maestro.setText(jTable1.getValueAt(fila, 1).toString());
        x = Integer.parseInt(jTable1.getValueAt(fila, 2).toString()); 
        cbx_grupo.setSelectedIndex(1);
        cbx_grado.setSelectedIndex(x);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        // TODO add your handling code here:
        validadcaracterescurp(evt);
        // valida que solo entren 18 caracteres
         char validar = evt.getKeyChar();
         
        if(txt_cedula.getText().length() >= 8){
        evt.consume();
        }
        if (Character.isLetter(validar)) { //validacion de solo numeros
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "NO SE PUEDE PROCESAR LA ENTRADA, ESCRIBA CARACTERES NUMERICOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            
        
        }
        
        
        
    }//GEN-LAST:event_txt_cedulaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_limpiar;
    public javax.swing.JButton btn_modificar;
    public javax.swing.JButton btn_registrar;
    public javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_grado;
    private javax.swing.JComboBox<String> cbx_grupo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_v_cedula;
    private javax.swing.JLabel lb_v_tutor;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_maestro;
    // End of variables declaration//GEN-END:variables

    public void limpiar() { //limpia los campos de texto
        txt_cedula.setText("");
        txt_maestro.setText("");
        cbx_grupo.setSelectedIndex(0);
        cbx_grado.setSelectedIndex(0);
       // txt_grado.setText("");

    }
//metodo para verificar la cantidad de alumnos
    public void cantidadAlumnos(){
       int total=0;
       String mostrartotal="", ls_accion="";
    
        
        Grupo grupo = (Grupo) cbx_grupo.getSelectedItem();
        
        int id=0, grado_=0, grupo_, edad_=0;

           
            grupo_ = grupo.getId();
           
        
        //mostrarDatosConTableModel();
           
        try{
        ls_accion= "SELECT count(id_alumno)"
                    + "FROM alumno WHERE eliminar = 'NO' and id_grado = '"+grado_+"' and id_grupo = '"+grupo_+"'";
        Statement st2 = con.getConnection().createStatement(); 
        ResultSet rs2 = st2.executeQuery(ls_accion); 
        
        while (rs2.next ())
        {
            total = rs2.getInt(1);
            mostrartotal = String.valueOf(total);
        }
              contadorAlumnos = total;

        
      }catch (Exception ex) {
	   JOptionPane.showMessageDialog(null,
	   "Error al consultar la cantidad de alumnos en el grupo.", "Error",
	    JOptionPane.ERROR_MESSAGE);
  }

}
   
public void buscar(String x) {

        

                DefaultTableModel modelo = new DefaultTableModel();
                jTable1.setModel(modelo);

                modelo.addColumn("Cedula");
                modelo.addColumn("Maestro");
                modelo.addColumn("Grado");
                modelo.addColumn("Grupo");
     
           
             
 
                 //Ordenar las columnas
                TableRowSorter<TableModel> ordena = new TableRowSorter<TableModel>(modelo);
                jTable1.setRowSorter(ordena);

		     //manda los valores a la clase para que haga las instruciones sql
                am.BuscarM(modelo, x);
                
                
                

            
	}

    
}
