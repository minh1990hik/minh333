/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;

/**
 *
 * @author dminh
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class Main1 {
    private JFrame frame;
    private JFormattedTextField dateTextField;
    private JButton submitButton;

    public Main1() {
        frame = new JFrame("Ngày");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một JPanel để chứa các thành phần
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Tạo một nhãn để hiển thị văn bản "Ngày:"
        JLabel dateLabel = new JLabel("Ngày:");
        panel.add(dateLabel);

        try {
            // Tạo một JFormattedTextField với định dạng ngày tháng "yyyy-MM-dd"
            MaskFormatter dateFormatter = new MaskFormatter("####-##-##");
            dateTextField = new JFormattedTextField(dateFormatter);
            dateTextField.setPreferredSize(new Dimension(100, 20));
            panel.add(dateTextField);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Tạo một nút Submit
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateString = dateTextField.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date date = dateFormat.parse(dateString);
                    System.out.println(date);  // Hoặc xử lý đối tượng Date theo mong muốn
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel.add(submitButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main1 main = new Main1();
    }
}