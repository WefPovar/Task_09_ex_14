package com.company;

import java.util.*;

public class GUIMain {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(() -> new FrameMain().setVisible(true));

    }
}
