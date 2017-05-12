/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Controlador.Programa;
import UML.Albaran;
import UML.Parte;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Al
 */
public class VentanaParte extends javax.swing.JFrame {

    /**
     * Creates new form ventanaParte
     */
    public VentanaParte() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelFondo = new javax.swing.JPanel();
        panelCabecera = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelCuerpo = new javax.swing.JPanel();
        labelFecha = new javax.swing.JLabel();
        labelKmI = new javax.swing.JLabel();
        labelKmF = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelGasoil = new javax.swing.JLabel();
        labelPejae = new javax.swing.JLabel();
        labelDietas = new javax.swing.JLabel();
        labelOtros = new javax.swing.JLabel();
        labelIncidencias = new javax.swing.JLabel();
        labelHExtra = new javax.swing.JLabel();
        labelTrabajador = new javax.swing.JLabel();
        labelVehiculo = new javax.swing.JLabel();
        tfTrabajador = new javax.swing.JTextField();
        tfVehiculo = new javax.swing.JTextField();
        tfHEXTRA = new javax.swing.JTextField();
        tfIncidencias = new javax.swing.JTextField();
        tfOtros = new javax.swing.JTextField();
        tfDietas = new javax.swing.JTextField();
        tfPeaje = new javax.swing.JTextField();
        tfGasoil = new javax.swing.JTextField();
        tfFin = new javax.swing.JTextField();
        tfInicio = new javax.swing.JTextField();
        rbAbierto = new javax.swing.JRadioButton();
        rbCerrado = new javax.swing.JRadioButton();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        año = new javax.swing.JComboBox<>();
        Albaran = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAlbaranes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btLimpia = new javax.swing.JButton();
        panelPie = new javax.swing.JPanel();
        btAceptar = new javax.swing.JButton();
        btCerrarParte = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Parte");
        labelTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelCabeceraLayout = new javax.swing.GroupLayout(panelCabecera);
        panelCabecera.setLayout(panelCabeceraLayout);
        panelCabeceraLayout.setHorizontalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        panelCabeceraLayout.setVerticalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabeceraLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(31, 31, 31))
        );

        labelFecha.setText("FECHA:");

        labelKmI.setText("KmINICIO:");

        labelKmF.setText("KmFin:");

        labelEstado.setText("Estado:");

        labelGasoil.setText("GASOIL:");

        labelPejae.setText("PEAJE:");

        labelDietas.setText("DIETAS:");

        labelOtros.setText("OTROS:");

        labelIncidencias.setText("INCIDENCIAS:");

        labelHExtra.setText("HEXTRA:");

        labelTrabajador.setText("TRABAJADOR:");

        labelVehiculo.setText("VEHICULO:");

        tfTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTrabajadorActionPerformed(evt);
            }
        });

        rbAbierto.setText("Abierto");

        rbCerrado.setText("Cerrado");

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        Albaran.setText("Albaran");
        Albaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbaranActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaAlbaranes);

        jLabel1.setText("ALBARANES:");

        btLimpia.setText("Limpiar Ventana");
        btLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTrabajador)
                    .addComponent(labelVehiculo)
                    .addComponent(labelHExtra)
                    .addComponent(labelOtros)
                    .addComponent(labelDietas)
                    .addComponent(labelPejae)
                    .addComponent(labelGasoil)
                    .addComponent(labelKmF)
                    .addComponent(labelKmI)
                    .addComponent(labelFecha)
                    .addComponent(labelEstado)
                    .addComponent(labelIncidencias, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfTrabajador)
                        .addComponent(tfVehiculo)
                        .addComponent(tfHEXTRA)
                        .addComponent(tfIncidencias)
                        .addComponent(tfOtros)
                        .addComponent(tfDietas)
                        .addComponent(tfPeaje)
                        .addComponent(tfInicio)
                        .addComponent(tfFin)
                        .addComponent(tfGasoil)
                        .addGroup(panelCuerpoLayout.createSequentialGroup()
                            .addComponent(rbAbierto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                            .addComponent(rbCerrado)))
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Albaran)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(292, 292, 292))
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btLimpia)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKmI)
                    .addComponent(tfInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKmF)
                    .addComponent(tfFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstado)
                    .addComponent(rbAbierto)
                    .addComponent(rbCerrado))
                .addGap(5, 5, 5)
                .addComponent(tfGasoil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addComponent(labelGasoil)
                        .addGap(18, 18, 18)
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPejae)
                            .addComponent(tfPeaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDietas)
                    .addComponent(tfDietas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Albaran))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOtros)
                    .addComponent(tfOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIncidencias)
                            .addComponent(tfIncidencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHExtra)
                            .addComponent(tfHEXTRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTrabajador)
                            .addComponent(tfTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVehiculo)
                            .addComponent(tfVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addComponent(btLimpia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        panelPie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });
        panelPie.add(btAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        btCerrarParte.setText("Cerrar Parte");
        btCerrarParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarParteActionPerformed(evt);
            }
        });
        panelPie.add(btCerrarParte, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        btVolver.setText("Volver");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        panelPie.add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPie, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabajadorActionPerformed

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        // TODO add your handling code here:
        boolean error=false;
        String estado="abierto";
        String dater = null ;
        JList list = new JList();
        Date dasd = null;
         DefaultListModel modelo = new DefaultListModel();
        
        Date javaSqlDate= new Date(dia.getSelectedIndex(),
                mes.getSelectedIndex(),
                año.getSelectedIndex());
        
        
        
        
        Parte p= Programa.buscarParte(javaSqlDate);
        do
        {
            
            if( tfInicio.getText()!=null || tfFin.getText()!=null || tfGasoil.getText()!=null ||
                           tfPeaje.getText()!=null || tfDietas.getText()!=null || tfOtros.getText()!=null || tfIncidencias.getText()!=null
                    ||tfHEXTRA.getText()!=null ||
                            tfTrabajador.getText()!=null ||tfVehiculo.getText()!=null )
            {
                
                
                
                if(p!=null)
                {
                    ArrayList<Albaran> al=p.getAlbaranes();
                    for(int i = 1; i<=al.size(); i++)
                    {
                            modelo.add(i,al.get(i).getIdAlbaran());
                    }
                    listaAlbaranes.setModel(modelo);
                    
                        
                    if(p.getEstado().equalsIgnoreCase("abierto"))
                    {
                        
                        
                        rbCerrado.setEnabled(false);
                        rbCerrado.setSelected(true);
                        rbAbierto.setEnabled(false);
                        tfInicio.setEnabled(false);
                        tfFin.setEnabled(false);
                        tfGasoil.setEnabled(false);
                           tfPeaje.setEnabled(false);
                           tfOtros.setEnabled(false);
                           tfIncidencias.setEnabled(false);
                    tfHEXTRA.setEnabled(false);
                            tfTrabajador.setEnabled(false); 
                            tfVehiculo.setEnabled(false);
                            error=true;
                            Programa.cerrarParte(javaSqlDate, estado);
                            
                        JOptionPane.showMessageDialog(null,"Parte ya guardado, solo puedes cerrar");
                        tfInicio.setText(p.getKmFin()+"");
                        tfFin.setText(p.getKmFin()+"");
                        tfGasoil.setText(p.getGasoil()+"");

                        tfPeaje.setText(p.getPeaje()+""); 
                        tfDietas.setText(p.getDietas()+"");
                        tfOtros.setText(p.getOtros()+"");
                        tfIncidencias.setText(p.getIncidencias()+"");
                        tfHEXTRA.setText(p.gethExtra()+"");
                        tfTrabajador.setText(p.getT().getDni());
                        tfVehiculo.setText(p.getV().getCodigoV()+"");
                        
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null,"Parte ya guardado y cerrado");

                        
                    }
                    
                    
                }
                else
                {
                    if(rbCerrado.isSelected())
                    {
                        estado="cerrado";
                    Programa.insertarParte(javaSqlDate,Double.parseDouble(tfInicio.getText())
                            ,Double.parseDouble(tfFin.getText()),estado,
                            Double.parseDouble(tfGasoil.getText()),
                            Double.parseDouble(tfPeaje.getText()),
                            Double.parseDouble(tfDietas.getText()),
                            Double.parseDouble(tfOtros.getText()),
                            Double.parseDouble(tfIncidencias.getText()),
                            Double.parseDouble(tfHEXTRA.getText()),
                            tfTrabajador.getText(),
                            Integer.parseInt(tfVehiculo.getText()));
                    }
                    else
                    {
                        estado="abierto";
                    Programa.insertarParte(javaSqlDate,Double.parseDouble(tfInicio.getText())
                            ,Double.parseDouble(tfFin.getText()),estado,
                            Double.parseDouble(tfGasoil.getText()),
                            Double.parseDouble(tfPeaje.getText()),
                            Double.parseDouble(tfDietas.getText()),
                            Double.parseDouble(tfOtros.getText()),
                            Double.parseDouble(tfIncidencias.getText()),
                            Double.parseDouble(tfHEXTRA.getText()),
                            tfTrabajador.getText(),
                            Integer.parseInt(tfVehiculo.getText()));
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"campo vacio");
                error=true;
            }
        }
        while(error==true);
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCerrarParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarParteActionPerformed
        // TODO add your handling code here:
        java.sql.Date javaSqlDate = java.sql.Date.valueOf(dia.getSelectedItem()+"-"+mes.getSelectedItem()+"-"+
                año.getSelectedItem());
        
            
            Programa.cerrarParte(javaSqlDate, "cerrado");
        
    }//GEN-LAST:event_btCerrarParteActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Programa.abrirVentanaLogistic();
    }//GEN-LAST:event_btVolverActionPerformed

    private void AlbaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbaranActionPerformed
        // TODO add your handling code here:
        Programa.abrirVentanaAlbaran();
    }//GEN-LAST:event_AlbaranActionPerformed

    private void btLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiaActionPerformed
        // TODO add your handling code here:
        
        tfInicio.setText("");
        tfFin.setText("");
        tfGasoil.setText("");
        
        tfPeaje.setText(""); 
        tfDietas.setText("");
        tfOtros.setText("");
        tfIncidencias.setText("");
        tfHEXTRA.setText("");
        tfTrabajador.setText("");
        tfVehiculo.setText("");
        dia.setSelectedIndex(0);
        mes.setSelectedIndex(0);
        año.setSelectedIndex(0);
    }//GEN-LAST:event_btLimpiaActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Albaran;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCerrarParte;
    private javax.swing.JButton btLimpia;
    private javax.swing.JButton btVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDietas;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelGasoil;
    private javax.swing.JLabel labelHExtra;
    private javax.swing.JLabel labelIncidencias;
    private javax.swing.JLabel labelKmF;
    private javax.swing.JLabel labelKmI;
    private javax.swing.JLabel labelOtros;
    private javax.swing.JLabel labelPejae;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTrabajador;
    private javax.swing.JLabel labelVehiculo;
    private javax.swing.JList<String> listaAlbaranes;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelPie;
    private javax.swing.JRadioButton rbAbierto;
    private javax.swing.JRadioButton rbCerrado;
    private javax.swing.JTextField tfDietas;
    private javax.swing.JTextField tfFin;
    private javax.swing.JTextField tfGasoil;
    private javax.swing.JTextField tfHEXTRA;
    private javax.swing.JTextField tfIncidencias;
    private javax.swing.JTextField tfInicio;
    private javax.swing.JTextField tfOtros;
    private javax.swing.JTextField tfPeaje;
    private javax.swing.JTextField tfTrabajador;
    private javax.swing.JTextField tfVehiculo;
    // End of variables declaration//GEN-END:variables
}