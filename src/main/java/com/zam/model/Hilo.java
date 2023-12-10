/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.model;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

public class Hilo extends Thread {
    
    private boolean conexion = true;
    private JTextArea textArea;
    private int puerto;
    
    public Hilo(JTextArea textArea, int puerto) {
        this.textArea = textArea;
        this.puerto = puerto;
    }

    public boolean isConexion() {
        return conexion;
    }

    public void setConexion(boolean conexion) {
        this.conexion = conexion;
    } 
    
    @Override
    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(this.puerto);
            while(this.isConexion()) {
                Socket socket = serverSocket.accept();
                DataInputStream flujo_entrada = new DataInputStream(socket.getInputStream());
                String mensaje_texto = flujo_entrada.readUTF();
                textArea.append("\n"+mensaje_texto);    
                socket.close();
                System.out.println("corriendo el servidor....");
            }
            System.out.println("Se desactivo");
        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
    
    public void cambiarConexion() {
        this.conexion = false;
    }
}
