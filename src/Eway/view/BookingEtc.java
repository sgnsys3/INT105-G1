/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eway.view;

import Eway.model.Booking;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.UIManager.*;

/**
 *
 * @author hp
 */
public class BookingEtc extends JFrame implements ActionListener {

    private JFrame frame;

    public void actionPerformed(ActionEvent e) {
        // remove the previous JFrame
        this.frame.setVisible(false);
        this.frame.dispose();
    }

    //เมื่อกดปุ่ม+ในหน้าเลือกเวลา จะแสดงหน้ากรอกข้อมูลขึ้นมา
    public BookingEtc() {
        panelBooking();
    }

    public void panelBooking() {

        setTitle("Booking Detail");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        setBounds(100, 100, 500, 400);
        getContentPane().setLayout(null);

        this.frame = new JFrame();
        this.frame.setVisible(true);

        JPanel booking = new JPanel();
        booking.setOpaque(true);
        booking.setBounds(0, 0, 500, 400);
        booking.setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().add(booking);
        booking.setLayout(null);

        //text - - Booking Detail - - 
        JLabel txt_booking = new JLabel();
        txt_booking.setText("  - - Booking Detail - - ");
        txt_booking.setFont(new java.awt.Font("OCR A Extended", 1, 26));
        txt_booking.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(txt_booking);
        txt_booking.setBounds(30, 33, 500, 30);
        booking.add(txt_booking);

        //time Time
        JLabel txt_time = new JLabel();
        txt_time.setText("Time");
        txt_time.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 26));
        txt_time.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_time);
        txt_time.setBounds(90, 90, 150, 30);
        booking.add(txt_time);

        //fill time
        JTextField fillTime = new JTextField();
        fillTime.setFont(new java.awt.Font("Th sarabun NEW", 1, 24));
        getContentPane().add(fillTime);
        fillTime.setBounds(250, 90, 160, 30);
        booking.add(fillTime);

        //text Pickup Place
        JLabel txt_pickUp = new JLabel();
        txt_pickUp.setText("Pickup Place");
        txt_pickUp.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 26));
        txt_pickUp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_pickUp);
        txt_pickUp.setBounds(90, 140, 150, 30);
        booking.add(txt_pickUp);

        //fill Pickup Place
        JTextField pickUp = new JTextField();
        pickUp.setFont(new java.awt.Font("Th sarabun NEW", 1, 24));
        getContentPane().add(pickUp);
        pickUp.setBounds(250, 140, 160, 30);
        booking.add(pickUp);

        //text Send Place
        JLabel txt_send = new JLabel();
        txt_send.setText("Send Place");
        txt_send.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 26));
        txt_send.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_send);
        txt_send.setBounds(90, 190, 150, 30);
        booking.add(txt_send);

        //combo box send place
        JComboBox send = new JComboBox<>(new String[]{"หอพัก myplace", "หอพัก myplace2",
            "คอนโดบ้านสวนธน", "หอพักธนบุญ", "the parque", "คอสโม เรสซิเดนซ์"});
        send.setFont(new java.awt.Font("Th sarabun NEW", 1, 22));
        getContentPane().add(send);
        send.setBounds(250, 190, 160, 30);
        booking.add(send);

        //text Phone Number
        JLabel txt_phone = new JLabel();
        txt_phone.setText("Phone Number");
        txt_phone.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 26));
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_phone);
        txt_phone.setBounds(90, 240, 150, 30);
        booking.add(txt_phone);

        //fill Phone Number
        JTextField phone = new JTextField();
        phone.setFont(new java.awt.Font("Th sarabun NEW", 1, 24));
        getContentPane().add(phone);
        phone.setBounds(250, 240, 160, 30);
        booking.add(phone);

        //button Booking
        JButton btn_booking = new JButton();
        btn_booking.setText("Booking");
        btn_booking.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 18));
        getContentPane().add(btn_booking);
        btn_booking.setBounds(140, 300, 100, 30);
        //funtion for button
        btn_booking.addActionListener(new java.awt.event.ActionListener() {
            //เก็บข้อมูลลงdb
            public void actionPerformed(ActionEvent evt) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dt = new Date();
                String date = format.format(dt);
                String time = date;
                //ดึงเวลาที่กรอกเข้ามาแล้วตัดตัวเลข เพื่อเก็บลงdb
                String showTime = fillTime.getText();
                String showHr = showTime.substring(0,2);//ตัดชั่วโมง
                String showMin = showTime.substring(3,5);//ตัดนาที
                time += " "+showHr+":"+showMin+":"+"00";//เก็บเวลาลงtimestamp
                int routeId=send.getSelectedIndex()+1;//เก็บidสถานที่ตามลำดับของช่องcombobox
                //เก็บข้อมูลลงdb Booking
                Booking b = new Booking(time, date, pickUp.getText(), routeId);
                //ปิดหน้าต่างเมื่อกดปุ่มBooking
                setVisible(false);
                //frame.setVisible(false);
            }
        });
        booking.add(btn_booking);

        //button Cancel
        JButton btn_cancel = new JButton();
        btn_cancel.setText("Cancel");
        btn_cancel.setFont(new java.awt.Font("4815_KwangMD_Catthai", 1, 18));
        getContentPane().add(btn_cancel);
        btn_cancel.setBounds(260, 300, 100, 30);
        booking.add(btn_cancel);
        //funtion for button
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //ปิดหน้าต่างเมื่อกดปุ่มCancle
                setVisible(false);
                //frame.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        BookingEtc bus = new BookingEtc();
        bus.panelBooking();
        bus.setVisible(true);
    }
}

