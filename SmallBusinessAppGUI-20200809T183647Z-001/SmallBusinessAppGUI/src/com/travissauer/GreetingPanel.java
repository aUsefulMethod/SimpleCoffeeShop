package com.travissauer;

import javax.swing.*;

public class GreetingPanel extends JPanel {

    private JLabel greeting;

    public GreetingPanel(){

        greeting = new JLabel("Welcome to Aladeen's Coffee House");

        add(greeting);

    }

}
