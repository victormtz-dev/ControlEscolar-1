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
public class BME_alumno extends javax.swing.JInternalFrame {

    Grado grado = new Grado();
    Grupo grupo = new Grupo();
    Alumno_consulta ac = new Alumno_consulta();
    String sexo_;
    
    /**
     * Creates new form Alta_alumno
     */
    public BME_alumno() {
        initComponents();
       
        btn_modificar.setEnabled(false);
        
        
       // DefaultComboBoxModel CB_gd = new DefaultComboBoxModel(grado.mostrarGrado());
       // cbx_grado.setModel(CB_gd);
        
        DefaultComboBoxModel CB_gp = new DefaultComboBoxModel(grupo.mostrarGrupo());
        cbx_grupo.setModel(CB_gp);
        
//        mostrarDatosConTableModel();
        validar();

        
    }
    public void validar(){
        
        if(txt_ap.getText().isEmpty()){
            lb_v_ap.setText("*");
         
        } else { 
            lb_v_ap.setText("");
        }
        
        if(txt_am.getText().isEmpty()){
            lb_v_am.setText("*");
        } else {
            lb_v_am.setText("");
        }
        
        
        if(txt_nombre.getText().isEmpty()){
            lb_v_nombre.setText("*");
        } else {
            lb_v_nombre.setText("");
        }
        
        
      
        
        
        
        if(txt_curp.getText().isEmpty()){
            lb_v_curp.setText("*");
        } else {
            lb_v_curp.setText("");
        }
        
        
       if(rb_f.getLabel().isEmpty() || rb_m.getLabel().isEmpty() ){
            lb_v_sexo.setText("*");
        } else {
            lb_v_sexo.setText("");
        }
        
        if(txt_edad.getText().isEmpty()){
        lbl_v_edad.setText("*");
        txt_grado.setText("");
        }
        else{
        lbl_v_edad.setText("");
        }
         
        if(txt_ap.getText().isEmpty() || txt_am.getText().isEmpty() || txt_edad.getText().isEmpty() ||
                txt_nombre.getText().isEmpty() || txt_curp.getText().isEmpty() ){
                btn_modificar.setEnabled(false);
        }else {
                btn_modificar.setEnabled(true);
        }
    }
    
    
    public void validadcaracteres (java.awt.event.KeyEvent evento){
    
        if(evento.getKeyChar() >= 33 && evento.getKeyChar() <= 64 
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
        txt_ap = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_am = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_curp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbx_grupo = new javax.swing.JComboBox<>();
        btn_modificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_grado = new javax.swing.JTextField();
        rb_m = new javax.swing.JRadioButton();
        rb_f = new javax.swing.JRadioButton();
        lb_v_ap = new javax.swing.JLabel();
        lb_v_am = new javax.swing.JLabel();
        lb_v_nombre = new javax.swing.JLabel();
        lb_v_curp = new javax.swing.JLabel();
        lb_v_sexo = new javax.swing.JLabel();
        lbl_v_edad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_alumno = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Alumnos");
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

        txt_ap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apKeyTyped(evt);
            }
        });

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_am.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_amKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_amKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setText("Apellido Paterno:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setText("Apellido Materno:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setText("Nombre (s):");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("CURP:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setText("Sexo:");

        txt_curp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_curpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_curpKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel9.setText("Grupo:");

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel10.setText("Edad:");

        txt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadActionPerformed(evt);
            }
        });
        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_edadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel11.setText("Grado:");

        txt_grado.setEditable(false);
        txt_grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gradoActionPerformed(evt);
            }
        });

        rb_m.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_m);
        rb_m.setText("M");
        rb_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_mMouseClicked(evt);
            }
        });

        rb_f.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_f);
        rb_f.setText("F");
        rb_f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_fMouseClicked(evt);
            }
        });

        lb_v_ap.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_ap.setText("jLabel8");

        lb_v_am.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_am.setText("jLabel8");

        lb_v_nombre.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_nombre.setText("jLabel12");

        lb_v_curp.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_curp.setText("jLabel13");

        lb_v_sexo.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_sexo.setText("jLabel14");

        lbl_v_edad.setForeground(new java.awt.Color(204, 0, 0));
        lbl_v_edad.setText("jLabel15");

        table_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CURP", "Apellido Paterno", "Apellido Materno", "Nombre", "Sexo", "Edad", "Grado", "Grupo"
            }
        ));
        jScrollPane1.setViewportView(table_alumno);

        btn_eliminar.setText("Eliminar");

        btn_salir.setText("Salir");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Buscar por apellido:");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54)
                                .addComponent(txt_ap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_v_ap))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10))
                                .addGap(85, 85, 85)
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel1Layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(btn_eliminar))
                                    .addGroup(Panel1Layout.createSequentialGroup()
                                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_edad)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_v_nombre)
                                            .addComponent(lbl_v_edad, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(txt_am, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_v_am)))
                        .addGap(49, 49, 49)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btn_modificar)))
                .addGap(35, 35, 35)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(rb_m)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rb_f)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_v_curp)
                            .addComponent(lb_v_sexo)))
                    .addComponent(txt_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 122, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(btn_limpiar)
                        .addGap(147, 147, 147)))
                .addComponent(btn_salir)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_v_ap)
                        .addComponent(jLabel4)
                        .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_v_curp))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)))
                .addGap(28, 28, 28)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_v_am)
                                .addComponent(jLabel5)
                                .addComponent(rb_m)
                                .addComponent(rb_f)
                                .addComponent(lb_v_sexo))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)))
                        .addGap(27, 27, 27)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_v_nombre)
                        .addComponent(jLabel11)
                        .addComponent(txt_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_v_edad)
                    .addComponent(jLabel9)
                    .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_salir)
                    .addComponent(btn_limpiar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Ver Alumnos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
       // Grado grado = (Grado) cbx_grado.getSelectedItem();
        Grupo grupo = (Grupo) cbx_grupo.getSelectedItem();
        
        int id=0, grado_=0, grupo_, edad_=0;
        String nombre_,ap_,am_,curp_, correo_, tutor_ , eliminar_ = "NO";
        
        try{
            //se obtienen los valores de la caja de texto y combo box
            ap_ = txt_ap.getText().toUpperCase();
            am_ = txt_am.getText().toUpperCase();
            nombre_ = txt_nombre.getText().toUpperCase();
            curp_ = txt_curp.getText().toUpperCase();
            //sexo_ = txt_sexo.getText().toUpperCase();
//            correo_ = txt_correo.getText().toLowerCase();
//            tutor_ = txt_tutor.getText().toUpperCase();       
            //grado_ = grado.getId();
            grupo_ = grupo.getId();
            edad_ = Integer.parseInt(txt_edad.getText());
        
            
            if(edad_ == 6){
             
             grado_ = 1;
            }
            
            if(edad_ == 7){
             
             grado_ = 2;
            }
            
            if(edad_ == 8){
               
              grado_ = 3;  
            }
            
            if(edad_ == 9){
              
              grado_ = 4; 
            }
            
            if(edad_ == 10){
              
              grado_ = 5;  
            }
            
            if(edad_ == 11){
              
              grado_ = 6;  
            }
            
            
            if(ac.existeAlumno(txt_curp.getText()) == 0){ //Revisa si el alumno existe o no
                //Se mandan los datos al metodo
                //ac.registrarAlumno(1, id, ap_, am_, nombre_, sexo_, curp_, tutor_, correo_, grado_, grupo_, eliminar_, edad_);
            }else{
                JOptionPane.showMessageDialog(null, "ESTE ALUMNO YA EXISTE","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            }
            
            
            
            
            
            
        }catch (Exception ex) {
	   JOptionPane.showMessageDialog(null,
	   "Error en el Ingreso de Datos, Revise si no hay campos sin rellenar", "Error",
	    JOptionPane.ERROR_MESSAGE);
        } finally{
        
//           mostrarDatosConTableModel();
	   limpiar();
           validar();
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_apKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apKeyTyped
      
        validadcaracteres(evt);
        
       
    }//GEN-LAST:event_txt_apKeyTyped

    private void txt_amKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amKeyTyped
       
        
        validadcaracteres(evt);
        
       
    }//GEN-LAST:event_txt_amKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        
        
        validadcaracteres(evt);
        
       
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_amKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_amKeyReleased

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_curpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_curpKeyReleased
        // TODO add your handling code here:
        
       validar();
    }//GEN-LAST:event_txt_curpKeyReleased

    private void txt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadActionPerformed
     
    }//GEN-LAST:event_txt_edadActionPerformed

    private void txt_edadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyReleased
        // TODO add your handling code here:
        validar();
        
         int edad_ = Integer.parseInt(txt_edad.getText());
        
        
        if(edad_ == 1){
        txt_grado.setText("");
        }
         
        if(edad_ == 6){
             txt_grado.setText("PRIMERO");
             
            }
            
            if(edad_ == 7){
             txt_grado.setText("SEGUNDO");  
             
            }
            
            if(edad_ == 8){
               txt_grado.setText("TERCERO");
               
            }
            
            if(edad_ == 9){
              txt_grado.setText("CUARTO");
               
            }
            
            if(edad_ == 10){
              txt_grado.setText("QUINTO");
              
            }
            
            if(edad_ == 11){
              txt_grado.setText("SEXTO");
             
            }
            
            if(edad_ >= 2 && edad_ < 6  || edad_ > 11){
            JOptionPane.showMessageDialog(null, "EDAD NO ACEPTADA","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            txt_edad.setText("");
            txt_grado.setText("");
        }
    }//GEN-LAST:event_txt_edadKeyReleased

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
       
       
        
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "NO SE PUEDE PROCESAR LA ENTRADA, ESCRIBA CARACTERES NUMERICOS","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        } 
        
 
    }//GEN-LAST:event_txt_edadKeyTyped

    private void txt_gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gradoActionPerformed

    private void txt_edadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_edadKeyPressed

    private void txt_curpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_curpKeyTyped
        // TODO add your handling code here:
       // validadcaracteres(evt);
    }//GEN-LAST:event_txt_curpKeyTyped

    private void rb_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_mMouseClicked
        // TODO add your handling code here:
        sexo_ = rb_m.getLabel();
    }//GEN-LAST:event_rb_mMouseClicked

    private void rb_fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fMouseClicked
        // TODO add your handling code here:
        sexo_ = rb_f.getLabel();
    }//GEN-LAST:event_rb_fMouseClicked

    private void txt_apKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_apKeyReleased

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        // TODO add your handling code here:
       String y;
       y = txt_buscar.getText();
       
       buscar(y);
    }//GEN-LAST:event_txt_buscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_v_am;
    private javax.swing.JLabel lb_v_ap;
    private javax.swing.JLabel lb_v_curp;
    private javax.swing.JLabel lb_v_nombre;
    private javax.swing.JLabel lb_v_sexo;
    private javax.swing.JLabel lbl_v_edad;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JTable table_alumno;
    private javax.swing.JTextField txt_am;
    private javax.swing.JTextField txt_ap;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_curp;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_grado;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

//public void mostrarDatosConTableModel() {
//	
//        
//                DefaultTableModel modelo = new DefaultTableModel();
//                table_alumno.setModel(modelo);
//
//               
//
//                modelo.addColumn("CURP");
//                modelo.addColumn("A. Paterno");
//                modelo.addColumn("A. Materno");
//                modelo.addColumn("Nombre");
//                modelo.addColumn("Sexo");
//                modelo.addColumn("Edad");
//                modelo.addColumn("Grado");
//                modelo.addColumn("Grupo");
// 
//              
//
//                 //Ordenar las columnas
//                TableRowSorter<TableModel> ordena =new TableRowSorter<TableModel>(modelo);
//                table_alumno.setRowSorter(ordena);
//                               
//               
//		/* enviamos el objeto TableModel, como mandamos el objeto podemos
//		  manipularlo desde el metodo */
//		
//                
//                ac.consultaAlumnosConTableModel(modelo);
//
//            
//	}

public void buscar(String x) {

        

                DefaultTableModel modelo = new DefaultTableModel();
                table_alumno.setModel(modelo);

                modelo.addColumn("CURP");
                modelo.addColumn("A. Paterno");
                modelo.addColumn("A. Materno");
                modelo.addColumn("Nombre");
                modelo.addColumn("Sexo");
                modelo.addColumn("Edad");
                modelo.addColumn("Grado");
                modelo.addColumn("Grupo");
           
             
 
                 //Ordenar las columnas
                TableRowSorter<TableModel> ordena =new TableRowSorter<TableModel>(modelo);
                table_alumno.setRowSorter(ordena);

		     
                ac.BuscarAlumno(modelo, x);
                

            
	}
public void limpiar(){
                txt_ap.setText("");
		txt_am.setText("");
                txt_nombre.setText("");
                //txt_correo.setText("");
                //txt_tutor.setText("");
                txt_curp.setText("");
		//txt_sexo.setText("");
                txt_edad.setText("");
                txt_grado.setText("");
               

}

   











}