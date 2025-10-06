package gui;

import javax.swing.SwingUtilities;

import entity.Phim;

public class Start {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Home().setVisible(true));
    }
}
