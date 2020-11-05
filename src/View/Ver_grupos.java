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
        btn_salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbx_grado = new javax.swing.JComboBox<>();

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

        btn_salir.setText("Salir");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 125, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_salir)
                .addGap(32, 32, 32))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(cbx_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_grado;
    private javax.swing.JComboBox<String> cbx_grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_alumno;
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


   











}