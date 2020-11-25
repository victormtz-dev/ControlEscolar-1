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
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
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
public class enviar_calificaciones1 extends javax.swing.JInternalFrame {
    
    Grado grado = new Grado();
    Grupo grupo = new Grupo();
    Mes mes = new Mes();
    Periodo periodo = new Periodo();
    Calificacion_consulta cali = new Calificacion_consulta();
    String  curpvieja_="";
    String arch;
    String nom;
    
    /**
     * Creates new form Alta_alumno
     */
    public enviar_calificaciones1() {
        initComponents();
        
         btn_enviar.setEnabled(false);
//        btn_eliminar.setEnabled(false);


//Se mandan a traer los datos de las clases mes y trimestre, para rellenar los combobox con los datos de la base de datos
       DefaultComboBoxModel CB_m = new DefaultComboBoxModel(mes.mostrarMes());
//       cbx_mes.setModel(CB_m);
        
        DefaultComboBoxModel CB_t = new DefaultComboBoxModel(periodo.mostrarPeriodo());
     //   cbx_trimestre.setModel(CB_t);
        
//        mostrarDatosConTableModel();
//        validar();

        
    }
    
  public void validar(){
              if ( txt_asunto.getText().isEmpty() || txa_msj.getText().isEmpty()
                      ) {
            btn_enviar.setEnabled(false);
        } else {
            btn_enviar.setEnabled(true);
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
        txt_buscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_enviar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_alumno = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_desti = new javax.swing.JTextField();
        txt_asunto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_msj = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txt_archivo = new javax.swing.JTextField();
        btn_limpiar1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Enviar calificaciones");
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

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });
        Panel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Buscar por apellido:");
        Panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

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
        Panel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 130, 40));

        btn_enviar.setBackground(new java.awt.Color(8, 59, 102));
        btn_enviar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_enviar.setForeground(new java.awt.Color(204, 204, 204));
        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelar.png"))); // NOI18N
        btn_enviar.setText("Enviar");
        btn_enviar.setToolTipText("");
        btn_enviar.setBorder(null);
        btn_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_enviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_enviarMouseExited(evt);
            }
        });
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });
        Panel1.add(btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 130, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        Panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

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
        jScrollPane3.setViewportView(table_alumno);

        Panel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 620, 140));

        jLabel3.setText("Destinatario:");
        Panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, 20));

        txt_desti.setEditable(false);
        Panel1.add(txt_desti, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 380, -1));

        txt_asunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_asuntoKeyReleased(evt);
            }
        });
        Panel1.add(txt_asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 380, -1));

        jLabel1.setText("Asunto:");
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel2.setText("Mensaje:");
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        txa_msj.setColumns(20);
        txa_msj.setRows(5);
        txa_msj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txa_msjKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txa_msj);

        Panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 380, 110));

        jButton1.setText("Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        txt_archivo.setEditable(false);
        Panel1.add(txt_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 380, -1));

        btn_limpiar1.setBackground(new java.awt.Color(8, 59, 102));
        btn_limpiar1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_limpiar1.setForeground(new java.awt.Color(204, 204, 204));
        btn_limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelar.png"))); // NOI18N
        btn_limpiar1.setText("Cancelar");
        btn_limpiar1.setToolTipText("");
        btn_limpiar1.setBorder(null);
        btn_limpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_limpiar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_limpiar1MouseExited(evt);
            }
        });
        btn_limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar1ActionPerformed(evt);
            }
        });
        Panel1.add(btn_limpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 120, 30));

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

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        // TODO add your handling code here:
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente = "victormma18@gmail.com";
            String passwordRemitente = "thevicmtz131298";
            String correoReceptor = txt_desti.getText();
            String asunto = txt_asunto.getText();
            String mensaje = txa_msj.getText();

            BodyPart texto = new MimeBodyPart();
            texto.setContent(mensaje, "text/html");

            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(txt_archivo.getText())));
            adjunto.setFileName(nom);

            MimeMultipart miltiParte = new MimeMultipart();
            miltiParte.addBodyPart(texto);
            miltiParte.addBodyPart(adjunto);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setContent(miltiParte);

            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();

            JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");
            limpiar();

        } catch (AddressException ex) {
            Logger.getLogger(enviar_calificaciones1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Correo Electronico NO Enviado");
        } catch (MessagingException ex) {
            Logger.getLogger(enviar_calificaciones1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Correo Electronico NO Enviado");
        }
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_enviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enviarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_enviarMouseExited

    private void btn_enviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enviarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_enviarMouseEntered

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

    private void table_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_alumnoMouseClicked
        // TODO add your handling code here:
         int fila = table_alumno.getSelectedRow();
        
        txt_desti.setText(table_alumno.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_table_alumnoMouseClicked

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            arch = dlg.getSelectedFile().getPath();
            nom = dlg.getSelectedFile().getName();
            txt_archivo.setVisible(true);
            txt_archivo.setText(arch);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_limpiar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiar1MouseEntered

    private void btn_limpiar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiar1MouseExited

    private void btn_limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar1ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btn_limpiar1ActionPerformed

    private void txt_asuntoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_asuntoKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_asuntoKeyReleased

    private void txa_msjKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txa_msjKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txa_msjKeyReleased
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    public javax.swing.JButton btn_enviar;
    public javax.swing.JButton btn_limpiar1;
    public javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_alumno;
    private javax.swing.JTextArea txa_msj;
    private javax.swing.JTextField txt_archivo;
    private javax.swing.JTextField txt_asunto;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_desti;
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
                TableRowSorter<TableModel> ordena = new TableRowSorter<TableModel>(modelo);
                table_alumno.setRowSorter(ordena);

		     //manda los valores a la clase para que haga las instruciones sql
                cali.Correo1(modelo, x);
                
                
                

            
	}

public void limpiar(){
    txt_archivo.setText("");
    txt_asunto.setText("");
    txt_desti.setText("");
    txa_msj.setText("");
}



}


