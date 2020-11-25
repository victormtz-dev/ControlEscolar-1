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
public class Ver_calificaciones2 extends javax.swing.JInternalFrame {

    Grado grado = new Grado();
    Grupo grupo = new Grupo();
    Mes mes = new Mes();
    Periodo periodo = new Periodo();
    Calificacion_consulta cali = new Calificacion_consulta();
    String  curpvieja_="";
    
    /**
     * Creates new form Alta_alumno
     */
    public Ver_calificaciones2() {
        initComponents();
        
         // btn_buscar.setEnabled(false);
//        btn_eliminar.setEnabled(false);


//Se mandan a traer los datos de las clases mes y trimestre, para rellenar los combobox con los datos de la base de datos
       DefaultComboBoxModel CB_m = new DefaultComboBoxModel(mes.mostrarMes());
//       cbx_mes.setModel(CB_m);
        
        DefaultComboBoxModel CB_t = new DefaultComboBoxModel(periodo.mostrarPeriodo());
     //   cbx_trimestre.setModel(CB_t);
        
//        mostrarDatosConTableModel();
//        validar();

        
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
        jLabel4 = new javax.swing.JLabel();
        txt_curp = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btn_salir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_alumno = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_cal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ver Calificaciones 2°");
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("CURP:");
        Panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 40, 20));

        txt_curp.setEditable(false);
        txt_curp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_curp.setBorder(null);
        txt_curp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_curpActionPerformed(evt);
            }
        });
        txt_curp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_curpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_curpKeyTyped(evt);
            }
        });
        Panel1.add(txt_curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 190, 20));

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });
        Panel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Buscar por apellido:");
        Panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        Panel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 10));

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
        Panel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 130, 40));

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
        Panel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 130, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        Panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        btn_buscar.setBackground(new java.awt.Color(8, 59, 102));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(204, 204, 204));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btn_buscar.setText("Consultar");
        btn_buscar.setToolTipText("");
        btn_buscar.setBorder(null);
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarMouseExited(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        Panel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 130, 40));

        table_alumno.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        table_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CURP", "Apellido Paterno", "Apellido Materno", "Nombre", "Grado", "Grupo"
            }
        ));
        table_alumno.setGridColor(new java.awt.Color(0, 0, 0));
        table_alumno.setSelectionBackground(new java.awt.Color(255, 255, 102));
        table_alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_alumnoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_alumno);

        Panel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 470, 160));

        table_cal.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        table_cal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trimestre", "Mes", "CURP", "E. socioemocional", "Artes", "C. del medio", "Lengua materna", "Matematicas", "Ed. Fisica", "F.C.E.", "Vida saludable", "Ingles"
            }
        ));
        table_cal.setGridColor(new java.awt.Color(0, 0, 0));
        table_cal.setSelectionBackground(new java.awt.Color(255, 255, 102));
        table_cal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_calMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_cal);

        Panel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 880, 128));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Calificaciones:");
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

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

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        //validar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarMouseExited

    private void btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarMouseEntered

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited

    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered

    }//GEN-LAST:event_btn_salirMouseEntered

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        // TODO add your handling code here:
        String y;
        y = txt_buscar.getText();

        buscar(y);
    }//GEN-LAST:event_txt_buscarKeyPressed

    private void txt_curpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_curpKeyTyped
        // TODO add your handling code here:
        // valida que solo entren 18 caracteres
        if(txt_curp.getText().length() >= 18){
            evt.consume();
        }
     
    }//GEN-LAST:event_txt_curpKeyTyped

    private void txt_curpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_curpKeyReleased
        // TODO add your handling code here:

//        validar();
    }//GEN-LAST:event_txt_curpKeyReleased

    private void btn_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseEntered

    }//GEN-LAST:event_btn_buscarMouseEntered

    private void btn_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseExited

    }//GEN-LAST:event_btn_buscarMouseExited

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       String curp_;
       
       
       
       try{
       
           curp_ = txt_curp.getText();
           
           MostrarTablaCal(curp_);
           
       }catch (Exception ex) {
	   JOptionPane.showMessageDialog(null,
	   "Error en el Ingreso de Datos, Revise", "Error",
	    JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_curpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_curpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_curpActionPerformed

    private void table_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_alumnoMouseClicked
        // TODO add your handling code here:
         int fila = table_alumno.getSelectedRow();
        
        txt_curp.setText(table_alumno.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_table_alumnoMouseClicked

    private void table_calMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_calMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_calMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_cancelar;
    public javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable table_alumno;
    private javax.swing.JTable table_cal;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_curp;
    // End of variables declaration//GEN-END:variables


public void buscar(String x) {

        

                DefaultTableModel modelo = new DefaultTableModel();
                table_alumno.setModel(modelo);

                modelo.addColumn("CURP");
                modelo.addColumn("A. Paterno");
                modelo.addColumn("A. Materno");
                modelo.addColumn("Nombre");
                modelo.addColumn("Grado");
                modelo.addColumn("Grupo");
           
             
 
                 //Ordenar las columnas
                TableRowSorter<TableModel> ordena = new TableRowSorter<TableModel>(modelo);
                table_alumno.setRowSorter(ordena);

		     //manda los valores a la clase para que haga las instruciones sql
                cali.BuscarC2(modelo, x);

               
	}


public void MostrarTablaCal(String x) {

        

                DefaultTableModel modelo = new DefaultTableModel();
                table_cal.setModel(modelo);

                modelo.addColumn("Trimestre");
                modelo.addColumn("Mes");
                modelo.addColumn("CURP");
                modelo.addColumn("E. sociemocional");
                modelo.addColumn("Artes");
                modelo.addColumn("C. del medio");
                modelo.addColumn("Lengua materna");
                modelo.addColumn("Matematicas");
                modelo.addColumn("Edu. fisica");
                modelo.addColumn("F.C.E.");
                modelo.addColumn("Vida saludable");
                modelo.addColumn("Ingles");
             
 
                 //Ordenar las columnas
                TableRowSorter<TableModel> ordena = new TableRowSorter<TableModel>(modelo);
                table_cal.setRowSorter(ordena);

		     //manda los valores a la clase para que haga las instruciones sql
                cali.consultaCalificacion2ConTableModel(modelo, x);
                
                
                
                

            
	}
public void limpiar(){

    
    
    

}


}
