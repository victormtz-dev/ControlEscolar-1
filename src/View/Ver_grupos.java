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
public class Ver_grupos extends javax.swing.JInternalFrame {

    Grado grado = new Grado();
    Grupo grupo = new Grupo();
    Alumno_consulta ac = new Alumno_consulta();
    String sexo_;
    Conexion con = new Conexion();
    
    /**
     * Creates new form Alta_alumno
     */
    public Ver_grupos() {
        initComponents();
       

        
        
       DefaultComboBoxModel CB_gd = new DefaultComboBoxModel(grado.mostrarGrado());
        cbx_grado.setModel(CB_gd);
        
        DefaultComboBoxModel CB_gp = new DefaultComboBoxModel(grupo.mostrarGrupo());
        cbx_grupo.setModel(CB_gp);
        
//        mostrarDatosConTableModel();
       

        
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
        jLabel9 = new javax.swing.JLabel();
        cbx_grupo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_alumno = new javax.swing.JTable();
        cbx_grado = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        btn_salir1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Grupos");
        setMinimumSize(new java.awt.Dimension(955, 468));
        setPreferredSize(new java.awt.Dimension(955, 468));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 468));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setMinimumSize(new java.awt.Dimension(0, 0));
        Panel1.setPreferredSize(new java.awt.Dimension(955, 468));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel9.setText("Grupo:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel11.setText("Grado:");

        table_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CURP", "Apellido Paterno", "Apellido Materno", "Nombre", "Sexo", "Edad", "Grado", "Grupo"
            }
        ));
        jScrollPane1.setViewportView(table_alumno);

        btn_buscar.setBackground(new java.awt.Color(8, 59, 102));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(204, 204, 204));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
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

        btn_salir1.setBackground(new java.awt.Color(8, 59, 102));
        btn_salir1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_salir1.setForeground(new java.awt.Color(204, 204, 204));
        btn_salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        btn_salir1.setText("Salir");
        btn_salir1.setToolTipText("");
        btn_salir1.setBorder(null);
        btn_salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salir1MouseExited(evt);
            }
        });
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Total de alumno:");

        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)
                                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(402, 402, 402)
                        .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

        getAccessibleContext().setAccessibleName("Ver Alumnos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarMouseEntered

    private void btn_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarMouseExited

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
      Grado grado = (Grado) cbx_grado.getSelectedItem();
        Grupo grupo = (Grupo) cbx_grupo.getSelectedItem();
        
        int id=0, grado_=0, grupo_, edad_=0;
    
        
        try{
            //se obtienen los valores de la caja de texto y combo box
     
            grado_ = grado.getId();
            grupo_ = grupo.getId();

 
                //Se mandan los datos al metodo
               buscarxGrupo(grado_,grupo_);

        }catch (Exception ex) {
	   JOptionPane.showMessageDialog(null,
	   "Error en el Ingreso de Datos", "Error",
	    JOptionPane.ERROR_MESSAGE);
        } finally{
            cantidadAlumnos();
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_salir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir1MouseEntered

    }//GEN-LAST:event_btn_salir1MouseEntered

    private void btn_salir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir1MouseExited

    }//GEN-LAST:event_btn_salir1MouseExited

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_salir1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_grado;
    private javax.swing.JComboBox<String> cbx_grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table_alumno;
    private javax.swing.JTextField txt_total;
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

public void buscarxGrupo(int x, int y) {

        

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

                
                /* enviamos el objeto TableModel, como mandamos el objeto podemos
		  manipularlo desde el metodo */
		     
                ac.BuscarAlumnoxGG(modelo, x, y);
                

            
	}


   
public void cantidadAlumnos(){
       int total=0;
       String mostrartotal="", ls_accion="";
    
     Grado grado = (Grado) cbx_grado.getSelectedItem();
        Grupo grupo = (Grupo) cbx_grupo.getSelectedItem();
        
        int id=0, grado_=0, grupo_, edad_=0;

            grado_ = grado.getId();
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
              txt_total.setText(mostrartotal);

        
      }catch (Exception ex) {
	   JOptionPane.showMessageDialog(null,
	   "Error al consultar la cantidad de alumnos en el grupo.", "Error",
	    JOptionPane.ERROR_MESSAGE);
  }

}











}
