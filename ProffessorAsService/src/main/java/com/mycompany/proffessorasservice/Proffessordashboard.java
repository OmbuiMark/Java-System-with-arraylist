package com.mycompany.proffessorasservice;

import javax.swing.*;

public class Proffessordashboard extends JFrame {
    private JLabel welcomeLabel;

    public Proffessordashboard() {
        initComponents();
    }

    private void initComponents() {
        welcomeLabel = new JLabel();
        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // set font size to 18
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); // center align
        welcomeLabel.setText("Welcome, Professor!"); // set welcome message
        getContentPane().add(welcomeLabel, java.awt.BorderLayout.CENTER); // add label to center of frame
        pack(); // pack the components in the frame
        setLocationRelativeTo(null); // center the frame on screen
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proffessordashboard().setVisible(true);
            }
        });
    }
}
