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
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author victormanuel
 */
public class Listas extends javax.swing.JInternalFrame {

    //Se instancia la clase conexion
    Grado grado = new Grado();
    Grupo grupo = new Grupo();
    Alumno_consulta ac = new Alumno_consulta();

    //varibale para seleccionar el sexo
    String sexo_;
    int contadorAlumnos=0;
    Conexion con = new Conexion();
    /**
     * Creates new form Alta_alumno
     */
    public Listas() {
        initComponents();
        
      
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
        btn_registrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_registrar1 = new javax.swing.JButton();
        btn_registrar2 = new javax.swing.JButton();
        btn_registrar3 = new javax.swing.JButton();
        btn_registrar4 = new javax.swing.JButton();
        btn_registrar5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listas");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(955, 468));
        setPreferredSize(new java.awt.Dimension(955, 468));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 468));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setMinimumSize(new java.awt.Dimension(0, 0));
        Panel1.setPreferredSize(new java.awt.Dimension(955, 468));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrar.setBackground(new java.awt.Color(8, 59, 102));
        btn_registrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(204, 204, 204));
        btn_registrar.setText("Imprimir Listas 6°");
        btn_registrar.setToolTipText("");
        btn_registrar.setActionCommand("Imprimir Listas 1°");
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
        Panel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 150, 38));

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
        Panel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 150, 38));

        btn_registrar1.setBackground(new java.awt.Color(8, 59, 102));
        btn_registrar1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_registrar1.setForeground(new java.awt.Color(204, 204, 204));
        btn_registrar1.setText("Imprimir Listas 1°");
        btn_registrar1.setToolTipText("");
        btn_registrar1.setBorder(null);
        btn_registrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrar1MouseExited(evt);
            }
        });
        btn_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar1ActionPerformed(evt);
            }
        });
        Panel1.add(btn_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 38));

        btn_registrar2.setBackground(new java.awt.Color(8, 59, 102));
        btn_registrar2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_registrar2.setForeground(new java.awt.Color(204, 204, 204));
        btn_registrar2.setText("Imprimir Listas 2°");
        btn_registrar2.setToolTipText("");
        btn_registrar2.setBorder(null);
        btn_registrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrar2MouseExited(evt);
            }
        });
        btn_registrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar2ActionPerformed(evt);
            }
        });
        Panel1.add(btn_registrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 150, 38));

        btn_registrar3.setBackground(new java.awt.Color(8, 59, 102));
        btn_registrar3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_registrar3.setForeground(new java.awt.Color(204, 204, 204));
        btn_registrar3.setText("Imprimir Listas 3°");
        btn_registrar3.setToolTipText("");
        btn_registrar3.setBorder(null);
        btn_registrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrar3MouseExited(evt);
            }
        });
        btn_registrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar3ActionPerformed(evt);
            }
        });
        Panel1.add(btn_registrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 150, 38));

        btn_registrar4.setBackground(new java.awt.Color(8, 59, 102));
        btn_registrar4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_registrar4.setForeground(new java.awt.Color(204, 204, 204));
        btn_registrar4.setText("Imprimir Listas 4°");
        btn_registrar4.setToolTipText("");
        btn_registrar4.setBorder(null);
        btn_registrar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrar4MouseExited(evt);
            }
        });
        btn_registrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar4ActionPerformed(evt);
            }
        });
        Panel1.add(btn_registrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 150, 38));

        btn_registrar5.setBackground(new java.awt.Color(8, 59, 102));
        btn_registrar5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_registrar5.setForeground(new java.awt.Color(204, 204, 204));
        btn_registrar5.setText("Imprimir Listas 5°");
        btn_registrar5.setToolTipText("");
        btn_registrar5.setBorder(null);
        btn_registrar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrar5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrar5MouseExited(evt);
            }
        });
        btn_registrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar5ActionPerformed(evt);
            }
        });
        Panel1.add(btn_registrar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 150, 38));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseEntered

    }//GEN-LAST:event_btn_registrarMouseEntered

    private void btn_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseExited

    }//GEN-LAST:event_btn_registrarMouseExited

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
try {
            // TODO add your handling code here:
            //conexion con la base de datos
            Conexion con = new Conexion();
            Connection conn = (Connection) con.getConnection();
            
      
            
           //System.out.println(curp_);
           //se busca la ruta en donde se encuentra el reporte para enviarle los datos
            JasperReport reporte = null;
            String path = "src\\Listas\\Listas_6.jasper";
            
            //Se manda datos para que el reporte pueda traer las listas de ese grado
            Map parametro = new HashMap();
           
            parametro.put("grado_entrada", "");
            parametro.put("periodo_entrada", "");
            parametro.put("mes_entrada", "");
            
            
           // reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
           reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Listas/Listas_6.jasper"));
            //el reporte recibe los parametros
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro,conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            //se abre la ventana mostrando nuestro pdf
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
            view.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_registrarActionPerformed

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

    private void btn_registrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar1MouseEntered

    private void btn_registrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar1MouseExited

    private void btn_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //conexion con la base de datos
            Conexion con = new Conexion();
            Connection conn = (Connection) con.getConnection();
            
      
            
           //System.out.println(curp_);
           //se busca la ruta en donde se encuentra el reporte para enviarle los datos
            JasperReport reporte = null;
            String path = "src\\Listas\\Listas.jasper";
            
            //Se manda datos para que el reporte pueda traer las listas de ese grado
            Map parametro = new HashMap();
           
            parametro.put("grado_entrada", "");
            parametro.put("periodo_entrada", "");
            parametro.put("mes_entrada", "");
            
            
           // reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
           reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Listas/Listas.jasper"));
            //el reporte recibe los parametros
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro,conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            //se abre la ventana mostrando nuestro pdf
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
            view.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_registrar1ActionPerformed

    private void btn_registrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar2MouseEntered

    private void btn_registrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar2MouseExited

    private void btn_registrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //conexion con la base de datos
            Conexion con = new Conexion();
            Connection conn = (Connection) con.getConnection();
            
      
            
           //System.out.println(curp_);
           //se busca la ruta en donde se encuentra el reporte para enviarle los datos
            JasperReport reporte = null;
            String path = "src\\Listas\\Listas_2.jasper";
            
            //Se manda datos para que el reporte pueda traer las listas de ese grado
            Map parametro = new HashMap();
           
            parametro.put("grado_entrada", "");
            parametro.put("periodo_entrada", "");
            parametro.put("mes_entrada", "");
            
            
            //reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Listas/Listas_2.jasper"));
            //el reporte recibe los parametros
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro,conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            //se abre la ventana mostrando nuestro pdf
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
            view.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_registrar2ActionPerformed

    private void btn_registrar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar3MouseEntered

    private void btn_registrar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar3MouseExited

    private void btn_registrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //conexion con la base de datos
            Conexion con = new Conexion();
            Connection conn = (Connection) con.getConnection();
            
      
            
           //System.out.println(curp_);
           //se busca la ruta en donde se encuentra el reporte para enviarle los datos
            JasperReport reporte = null;
            String path = "src\\Listas\\Listas_3.jasper";
            
            //Se manda datos para que el reporte pueda traer las listas de ese grado
            Map parametro = new HashMap();
           
            parametro.put("grado_entrada", "");
            parametro.put("periodo_entrada", "");
            parametro.put("mes_entrada", "");
            
            
            //reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Listas/Listas_3.jasper"));
            //el reporte recibe los parametros
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro,conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            //se abre la ventana mostrando nuestro pdf
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
            view.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_registrar3ActionPerformed

    private void btn_registrar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar4MouseEntered

    private void btn_registrar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar4MouseExited

    private void btn_registrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar4ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //conexion con la base de datos
            Conexion con = new Conexion();
            Connection conn = (Connection) con.getConnection();
            
      
            
           //System.out.println(curp_);
           //se busca la ruta en donde se encuentra el reporte para enviarle los datos
            JasperReport reporte = null;
            String path = "src\\Listas\\Listas_4.jasper";
            
            //Se manda datos para que el reporte pueda traer las listas de ese grado
            Map parametro = new HashMap();
           
            parametro.put("grado_entrada", "");
            parametro.put("periodo_entrada", "");
            parametro.put("mes_entrada", "");
            
            
            //reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Listas/Listas_4.jasper"));
            //el reporte recibe los parametros
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro,conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            //se abre la ventana mostrando nuestro pdf
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
            view.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_registrar4ActionPerformed

    private void btn_registrar5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar5MouseEntered

    private void btn_registrar5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar5MouseExited

    private void btn_registrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar5ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //conexion con la base de datos
            Conexion con = new Conexion();
            Connection conn = (Connection) con.getConnection();
            
      
            
           //System.out.println(curp_);
           //se busca la ruta en donde se encuentra el reporte para enviarle los datos
            JasperReport reporte = null;
            String path = "src\\Listas\\Listas_5.jasper";
            
            //Se manda datos para que el reporte pueda traer las listas de ese grado
            Map parametro = new HashMap();
           
            parametro.put("grado_entrada", "");
            parametro.put("periodo_entrada", "");
            parametro.put("mes_entrada", "");
            
            
           // reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
           reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Listas/Listas_5.jasper"));
            //el reporte recibe los parametros
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro,conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            //se abre la ventana mostrando nuestro pdf
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
            view.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_registrar5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    public javax.swing.JButton btn_registrar;
    public javax.swing.JButton btn_registrar1;
    public javax.swing.JButton btn_registrar2;
    public javax.swing.JButton btn_registrar3;
    public javax.swing.JButton btn_registrar4;
    public javax.swing.JButton btn_registrar5;
    public javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

  
    
}