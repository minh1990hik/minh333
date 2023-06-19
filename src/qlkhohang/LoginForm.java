/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;

/**
 *
 * @author dminh
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(200, 25));

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200, 25));

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Invalid username or password.");
                }
            }
        });
        
        JButton register= new JButton("dang ki");
        register.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = usernameField.getText();
        String pass= new String(passwordField.getPassword());
        // Xử lý đăng kí tài khoản ở đây
        if(user.isEmpty()|| pass.isEmpty())
        JOptionPane.showMessageDialog(LoginForm.this, "dang nhap lai");
        else JOptionPane.showMessageDialog(LoginForm.this, "dang nhap thanh cong");
        if(user.isEmpty()==false&& pass.isEmpty()==false ){
                 try {
                     Connection c = ketnoi.lienket();
                     Statement a = c.createStatement();
                     a.executeUpdate("INSERT INTO quanlibanhang.nguoidung(tendangnhap,matkhau)"+"VALUES"+"("+"'"+user+"'"+","+"'"+pass+"'"+")");
                     ketnoi.dongketnoi(c);
                 }
                 catch(SQLException d){
                     d.printStackTrace();
                 }
        }
    }
});
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);
        panel.add(register);
        getContentPane().add(panel);
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginForm form = new LoginForm();
                form.setVisible(true);
            }
        });
    }
}
    