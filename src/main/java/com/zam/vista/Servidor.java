/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.vista;

import com.zam.model.Hilo;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Servidor extends javax.swing.JFrame {

    Hilo hilo;
    public Servidor() {
        initComponents();
        txtArea.setEditable(false);
        cmbPuerto.addItem("----");
        cmbPuerto.addItem("9999");
        cmbPuerto.addItem("5690");
        cmbPuerto.addItem("3992");
        cmbPuerto.addItem("7921");
        btnDesactivar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnActivar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbPuerto = new javax.swing.JComboBox<>();
        btnDesactivar = new javax.swing.JButton();
        txtMensaje = new javax.swing.JTextField();
        btnCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SERVIDOR");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnActivar.setText("Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un puerto:");

        btnDesactivar.setText("Desactivar");
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Listar Puertos TCP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Listar Puertos UDP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnActivar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDesactivar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(31, 31, 31)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnCliente)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActivar)
                            .addComponent(btnDesactivar)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(btnCliente)
                        .addGap(43, 43, 43)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        if (cmbPuerto.getSelectedItem().equals("----")) {
            JOptionPane.showMessageDialog(null, "Digite un puerto antes de activar el servidor");
        } else {
            String puerto = String.valueOf(cmbPuerto.getSelectedItem());
            int port = Integer.parseInt(puerto);
            hilo = new Hilo(txtArea, port);
            hilo.start();
            txtMensaje.setText("El servidor se ha activado en el puerto "+port);
            btnActivar.setEnabled(false);
            btnDesactivar.setEnabled(true);
        }
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        String puerto = String.valueOf(cmbPuerto.getSelectedItem());
        int port = Integer.parseInt(puerto);
        hilo.cambiarConexion();
        btnActivar.setEnabled(true);
        btnDesactivar.setEnabled(false);
        txtMensaje.setText("El servidor se ha desactivado del puero "+port);
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        String puerto = String.valueOf(cmbPuerto.getSelectedItem());
        int port = Integer.parseInt(puerto);
        Cliente cliente = new Cliente(port);
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String ip = "localhost"; // Cambia esto por la IP o nombre de host deseado
        int timeout = 2000; // Tiempo de espera en milisegundos

        System.out.println("Listado de estados de puertos TCP:");

        for (int puerto = 1; puerto <= 65535; puerto++) {
            try {
                try (Socket socket = new Socket()) {
                    socket.connect(new InetSocketAddress(ip, puerto), timeout);
                }
                System.out.println("Puerto " + puerto + " está abierto");
            } catch (IOException e) {
                // Si ocurre una excepción, el puerto no está abierto
                // Puedes comentar o quitar este println si deseas
                System.out.println("Puerto " + puerto + " está cerrado o no alcanzable");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ip = "localhost"; // Cambia esto por la IP o nombre de host deseado

        System.out.println("Listado de estados de puertos UDP:");

        for (int puerto = 1; puerto <= 65535; puerto++) {
            try {
                DatagramSocket socket = new DatagramSocket();
                socket.setSoTimeout(100); // Tiempo de espera en milisegundos
                socket.connect(InetAddress.getByName(ip), puerto);

                byte[] sendData = new byte[1];
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length);
                socket.send(sendPacket);

                socket.receive(sendPacket);

                // Si no se lanza una excepción, el puerto está abierto
                System.out.println("Puerto UDP " + puerto + " está abierto");
                socket.close();
            } catch (IOException e) {
                // Si ocurre una excepción, el puerto no está abierto
                // Puedes comentar o quitar este println si deseas
                System.out.println("Puerto UDP " + puerto + " está cerrado o no alcanzable");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JComboBox<String> cmbPuerto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
}
