package feature.home.presentation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import feature.home.domain.movie;

public class homepage extends JFrame {

    public homepage() {
        setTitle("Web Quản Lý Phim");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        List<movie> movies = new ArrayList<>();
        movies.add(new movie(1, "Mưa Đỏ", "Action", 124, 5.0,
                "Bộ phim kể về cuộc chiến đấu bảo vệ Thành cổ Quảng Trị...",
                "https://cdn2.tuoitre.vn/thumb_w/480/471584752817336320/2025/8/24/mua-do-6-1756027005405772261674.jpg"));

        DefaultListModel<movie> model = new DefaultListModel<>();
        for (movie m : movies) {
            model.addElement(m);
        }

        JList<movie> movieJList = new JList<>(model);
        movieJList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        movieJList.setVisibleRowCount(1);
        movieJList.setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
            JPanel panel = new JPanel(new BorderLayout());
            JLabel titleLabel = new JLabel(value.getTitle());
            JLabel ratingLabel = new JLabel("⭐" + value.getRating());

            panel.add(titleLabel, BorderLayout.CENTER);
            panel.add(ratingLabel, BorderLayout.EAST);
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            return panel;
        });

        JScrollPane scrollPane = new JScrollPane(movieJList);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new homepage());
    }
}
