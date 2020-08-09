package com.travissauer;

import javax.swing.*;
import java.awt.*;

public class BagelPanel extends JPanel {

    public final double REGULAR_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;

    private JRadioButton regularBagel;
    private JRadioButton wheatBagel;

    private ButtonGroup bg;

    public BagelPanel(){

        setLayout(new GridLayout(2,1));

        regularBagel = new JRadioButton("Regular", true);
        wheatBagel = new JRadioButton("Wheat");

        bg = new ButtonGroup();
        bg.add(regularBagel);
        bg.add(wheatBagel);

        setBorder(BorderFactory.createTitledBorder("Bagel"));

        add(regularBagel);
        add(wheatBagel);

    }

    public double getBagelCost(){

        double bagelCost = 0.0;

        if (regularBagel.isSelected()){

            bagelCost = REGULAR_BAGEL;

        }else{

            bagelCost = WHEAT_BAGEL;

        }

        return bagelCost;

    }

}
