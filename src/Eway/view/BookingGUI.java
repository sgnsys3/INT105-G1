/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eway.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.UIManager.*;

/**
 *
 * @author hp
 */
public class BookingGUI extends JFrame implements ActionListener {

    private JFrame frame;

    public void actionPerformed(ActionEvent e) {
		// remove the previous JFrame
		this.frame.setVisible(false);
		this.frame.dispose();
    }
    
    public void panelBooking() {

        setTitle("Bus Stop");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(255,255,255));
        setBounds(100, 100, 400, 450);
        getContentPane().setLayout(null);
        
        this.frame = new JFrame();
        this.frame.setVisible(true);

        JPanel booking = new JPanel();
        booking.setOpaque(true);
        booking.setBounds(0, 0, 400, 500);
        booking.setBackground(new java.awt.Color(0,102,153));
        getContentPane().add(booking);
        booking.setLayout(null);

        //text Bus Stop
        JLabel busStop = new JLabel();
        busStop.setText("Bus Stop");
        busStop.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 30));
        busStop.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(busStop);
        busStop.setBounds(150, 43, 150, 30);
        booking.add(busStop);

        //text Pressident Builing
        JLabel pressident = new JLabel();
        pressident.setText("Pressident Building");
        pressident.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 28));
        pressident.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pressident);
        pressident.setBounds(85, 86, 230, 35);
        booking.add(pressident);

        //text Choose Booking Time
        JLabel chooseTime = new JLabel();
        chooseTime.setText("Choose Booking Time");
        chooseTime.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 26));
        chooseTime.setForeground(new java.awt.Color(255,204,0));
        getContentPane().add(chooseTime);
        chooseTime.setBounds(85, 129, 230, 35);
        booking.add(chooseTime);

        //button 23.00
        JButton time23 = new JButton();
        time23.setText("23.00");
        time23.setFont(new java.awt.Font("4815_KwangMD_Catthai", 0, 24));
        time23.setForeground(new java.awt.Color(0, 102, 153));
        time23.setBackground(new java.awt.Color(255,204,0));
        getContentPane().add(time23);
        time23.setBounds(120, 180, 150, 29);
        time23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BookingTime23().setVisible(true);
            }
        });
        booking.add(time23);

        //button 24.00
        JButton time24 = new JButton();
        time24.setText("24.00");
        time24.setFont(new java.awt.Font("4815_KwangMD_Catthai", 0, 24));
        time24.setForeground(new java.awt.Color(0, 102, 153));
        time24.setBackground(new java.awt.Color(255,204,0));
        getContentPane().add(time24);
        time24.setBounds(120, 230, 150, 29);
        time24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BookingTime24().setVisible(true);
            }
        });
        booking.add(time24);

        //button 01.00
        JButton time01 = new JButton();
        time01.setText("01.00");
        time01.setFont(new java.awt.Font("4815_KwangMD_Catthai", 0, 24));
        time01.setForeground(new java.awt.Color(0, 102, 153));
        time01.setBackground(new java.awt.Color(255,204,0));
        getContentPane().add(time01);
        time01.setBounds(120, 280, 150, 29);
        time01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BookingTime01().setVisible(true);
            }
        });
        booking.add(time01);

        //button etc
        JButton timeEtc = new JButton();
        timeEtc.setText("+");
        timeEtc.setFont(new java.awt.Font("4815_KwangMD_Catthai", 0, 24));
        timeEtc.setForeground(new java.awt.Color(0, 102, 153));
        timeEtc.setBackground(new java.awt.Color(255,204,0));
        getContentPane().add(timeEtc);
        timeEtc.setBounds(120, 330, 150, 29);
        timeEtc.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookingTimeEtc().setVisible(true);
            }
        });
        booking.add(timeEtc);

    }


    public static void main(String[] args) {
        BookingGUI bus = new BookingGUI();
        bus.panelBooking();
        bus.setVisible(true);
    }
}
