package feature.authentication.presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import feature.home.presentation.homepage;
import java.awt.event.ActionEvent;


public class loginpage {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Login Page");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            ImageIcon bgIcon = new ImageIcon("src/assets/images/loginbg.jpg");
            JLabel bgImage = new JLabel(bgIcon);
            bgImage.setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(10, 0, 10, 0);

            gbc.gridy = 0;
            JLabel loginText = new JLabel("Welcome, to our app please login");
            loginText.setForeground(Color.WHITE);
            bgImage.add(loginText, gbc);

            gbc.gridy = 1;
            JTextField accountTextField = new JTextField(20);
            bgImage.add(accountTextField, gbc);

            gbc.gridy = 2;
            JTextField passwordTextField = new JTextField(20);
            bgImage.add(passwordTextField, gbc);

            gbc.gridy = 3;
            JButton loginButton = new JButton("Login");
            bgImage.add(loginButton, gbc);

            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new homepage();

                    frame.dispose();
                }
            });
            frame.setContentPane(bgImage);
            frame.setVisible(true);
        });
    }
}
