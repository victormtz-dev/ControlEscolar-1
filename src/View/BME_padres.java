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
public class BME_padres extends javax.swing.JInternalFrame {

    Grado grado = new Grado();
    Grupo grupo = new Grupo();
    Tutor_consulta ac = new Tutor_consulta();
    String  curp_="";
    
    /**
     * Creates new form Alta_alumno
     */
    public BME_padres() {
        initComponents();
        
       btn_modificar.setEnabled(false);
     
       // DefaultComboBoxModel CB_gd = new DefaultComboBoxModel(grado.mostrarGrado());
       // cbx_grado.setModel(CB_gd);
        
      //  DefaultComboBoxModel CB_gp = new DefaultComboBoxModel(grupo.mostrarGrupo());
  
        
//        mostrarDatosConTableModel();
        validar();

        
    }
    public void validar(){
        
        if(txt_tutor.getText().isEmpty()){
            lb_v_ap.setText("*");
         
        } else { 
            lb_v_ap.setText("");
        }
        
       if (txt_correo.getText().isEmpty()) {
            lb_v_correo.setText("*");
        } else if (!txt_correo.getText().contains("@") || !txt_correo.getText().contains(".")) {
            lb_v_correo.setText("*Correo Invalido");
        } else {
            lb_v_correo.setText("");
        }
        
      
         
        if(txt_tutor.getText().isEmpty() || txt_correo.getText().isEmpty() 
                 ){
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
        txt_tutor = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_v_ap = new javax.swing.JLabel();
        lb_v_correo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_alumno = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btn_salir = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_edad1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ver Tutor");
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

        txt_tutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tutor.setBorder(null);
        txt_tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tutorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tutorKeyTyped(evt);
            }
        });
        Panel1.add(txt_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 20));

        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_correo.setBorder(null);
        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_correoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });
        Panel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 190, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setText("Tutor");
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setText("Correo");
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, 10));

        lb_v_ap.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_ap.setText("jLabel8");
        Panel1.add(lb_v_ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 10));

        lb_v_correo.setForeground(new java.awt.Color(204, 0, 0));
        lb_v_correo.setText("jLabel8");
        Panel1.add(lb_v_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, 10));

        table_alumno.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        table_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CURP", "Apellido Paterno", "Apellido Materno", "Nombre", "Tutor", "Correo"
            }
        ));
        table_alumno.setGridColor(new java.awt.Color(0, 0, 0));
        table_alumno.setSelectionBackground(new java.awt.Color(255, 255, 102));
        table_alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_alumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_alumno);

        Panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 717, 128));

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });
        Panel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 14, 353, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Buscar por apellido:");
        Panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 16, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        Panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 190, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        Panel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 280, 10));

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
        Panel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 130, 40));

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
        Panel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 130, 40));

        btn_cancelar.setBackground(new java.awt.Color(8, 59, 102));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(204, 204, 204));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setToolTipText("");
        btn_cancelar.setBorder(null);
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseExited(evt);
            }
        });
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        Panel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 130, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        Panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 2, -1, 40));

        txt_edad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_edad1.setBorder(null);
        txt_edad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edad1ActionPerformed(evt);
            }
        });
        txt_edad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edad1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_edad1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edad1KeyTyped(evt);
            }
        });
        Panel1.add(txt_edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 190, 20));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tutorKeyTyped
      
        validadcaracteres(evt);
        
       
    }//GEN-LAST:event_txt_tutorKeyTyped

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped
 
    }//GEN-LAST:event_txt_correoKeyTyped

    private void txt_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_correoKeyReleased

    private void txt_tutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tutorKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_tutorKeyReleased

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        // TODO add your handling code here:
       String y;
       y = txt_buscar.getText();
       
       buscar(y);
    }//GEN-LAST:event_txt_buscarKeyPressed

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered

    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited

    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarMouseEntered

    private void btn_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarMouseExited

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
     int id=0;
     String nombre_, eliminar_ = "NO", correo_;
        
        try {
            //se obtienen los valores de la caja de texto y combo box
            nombre_ = txt_tutor.getText().toUpperCase();
            correo_ = txt_correo.getText().toLowerCase();
            Conexion con = new Conexion();
            Statement st2 = con.getConnection().createStatement(); 

           
               ac.modificarTutor(2, id, curp_, nombre_, correo_);
           
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Error en el Ingreso de Datos, Revise si no hay campos sin rellenar", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {

            limpiar();
            //validar();
        }
       
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarMouseEntered

    private void btn_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarMouseExited

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        validar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void table_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_alumnoMouseClicked
        // TODO add your handling code here:
       int fila = table_alumno.getSelectedRow();
        curp_ = table_alumno.getValueAt(fila, 0).toString(); 
        txt_tutor.setText(table_alumno.getValueAt(fila, 4).toString());
        txt_correo.setText(table_alumno.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_table_alumnoMouseClicked

    private void txt_edad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edad1ActionPerformed

    private void txt_edad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edad1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edad1KeyPressed

    private void txt_edad1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edad1KeyReleased
        // TODO add your handling code here:
          validar();
        
         int edad_ = Integer.parseInt(txt_edad1.getText());

            if(edad_ >= 2 && edad_ < 6  || edad_ > 11){
            JOptionPane.showMessageDialog(null, "EDAD NO ACEPTADA","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            txt_edad1.setText("");
           
        }
    }//GEN-LAST:event_txt_edad1KeyReleased

    private void txt_edad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edad1KeyTyped
        // TODO add your handling code here:
         char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) { //validacion de solo numeros
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "NO SE PUEDE PROCESAR LA ENTRADA, ESCRIBA CARACTERES NUMERICOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        validadcaracterescurp(evt);
 
    }//GEN-LAST:event_txt_edad1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    public javax.swing.JButton btn_cancelar;
    public javax.swing.JButton btn_modificar;
    public javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lb_v_ap;
    private javax.swing.JLabel lb_v_correo;
    private javax.swing.JTable table_alumno;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_edad1;
    private javax.swing.JTextField txt_tutor;
    // End of variables declaration//GEN-END:variables


public void buscar(String x) {

        

                DefaultTableModel modelo = new DefaultTableModel();
                table_alumno.setModel(modelo);

                modelo.addColumn("CURP");
                modelo.addColumn("A. Paterno");
                modelo.addColumn("A. Materno");
                modelo.addColumn("Nombre");
                modelo.addColumn("Tutor");
                modelo.addColumn("Correo");

           
             
 
                 //Ordenar las columnas
                TableRowSorter<TableModel> ordena =new TableRowSorter<TableModel>(modelo);
                table_alumno.setRowSorter(ordena);

		     //manda los valores a la clase para que haga las instruciones sql
                ac.BuscarA(modelo, x);
                

            
	}
public void limpiar(){
                txt_tutor.setText("");
		txt_correo.setText("");
             
                txt_edad1.setText("");
                txt_buscar.setText("");
                btn_modificar.setEnabled(false);


}

//  public void curp(){
//    
//        if(txt_curp.getText().length() < 18){
//        JOptionPane.showMessageDialog(null, "CURP INVALIDA.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
//        
//        }
//    
//    
//    }

}
