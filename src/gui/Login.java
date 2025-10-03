package gui;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLogin, btnExit;

    public Login() {
        setTitle("Đăng nhập hệ thống bán vé rạp phim");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        // Tiêu đề
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBackground(Color.GREEN);
        JLabel titleLabel = new JLabel("Đăng Nhập Hệ Thống", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        titlePanel.add(titleLabel, BorderLayout.CENTER);
        
        // ===== Panel ảnh =====
        
        JPanel imgPanel = new JPanel(new BorderLayout());
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/icon_pass.png"));
        Image image = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel lblImage = new JLabel(new ImageIcon(image));
        lblImage.setHorizontalAlignment(JLabel.CENTER);
        imgPanel.add(lblImage);

        // ===== Panel chính (username + password) =====
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(8, 8, 8, 8);
        gc.anchor = GridBagConstraints.WEST;

        // Username
        gc.gridx = 0; gc.gridy = 0;
        JLabel acc = new JLabel("Tên đăng nhập:");
        acc.setFont(new Font("Times New Roman", Font.BOLD, 16)); // in đậm, cỡ chữ 16
        panel.add(acc , gc);
        gc.gridx = 1;
        txtUser = new JTextField();
        txtUser.setPreferredSize(new Dimension(200, 30));
        panel.add(txtUser, gc);

        // Password
        gc.gridx = 0; gc.gridy = 1;
        JLabel pass = new JLabel("Mật Khẩu:");
        pass.setFont(new Font("Times New Roman", Font.BOLD, 16)); // in đậm, cỡ chữ 16
        panel.add(pass , gc);
        gc.gridx = 1;
        txtPass = new JPasswordField();
        txtPass.setPreferredSize(new Dimension(200, 30));
        panel.add(txtPass, gc);
        
     // Checkbox hiện mật khẩu
        gc.gridx = 1; gc.gridy = 2;
        JCheckBox chkShowPass = new JCheckBox("Hiển thị mật khẩu");
        panel.add(chkShowPass, gc);
        
     // Sự kiện tick checkbox
        chkShowPass.addActionListener(e -> checkMk(chkShowPass));

        // ===== Buttons =====
     // Panel chứa nút
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10)); 
        // FlowLayout.CENTER → căn giữa
        // 20 → khoảng cách ngang giữa 2 nút
        // 10 → khoảng cách trên/dưới

        btnLogin = new JButton("Đăng nhập");
        btnExit = new JButton("Thoát");

        // Set kích thước cho từng nút (nếu muốn đồng đều)
        btnLogin.setPreferredSize(new Dimension(120, 35));
        btnExit.setPreferredSize(new Dimension(120, 35));

        // Thêm nút vào panel
        btnPanel.add(btnLogin);
        btnPanel.add(btnExit);


        // Add vào frame
        add(titlePanel, BorderLayout.NORTH);
        add(imgPanel, BorderLayout.WEST);
        add(panel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        // ===== Sự kiện =====
        btnLogin.addActionListener(e -> onLogin());
        btnExit.addActionListener(e -> System.exit(0));
        txtPass.addActionListener(e -> onLogin());
    }

    private void checkMk(JCheckBox chkShowPass) {
    	if (chkShowPass.isSelected()) {
            txtPass.setEchoChar((char) 0); // hiện mật khẩu
        } else {
            txtPass.setEchoChar('•'); // ẩn mật khẩu
        }

	}

	private void onLogin() {
        String user = txtUser.getText().trim();
        String pass = new String(txtPass.getPassword()).trim();
        

        if (user.equals("admin") && pass.equals("123456")) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
            UIManager.OpenHomeUI(this);
            
        } else {
            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu!", 
                                          "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
     
    }


}
