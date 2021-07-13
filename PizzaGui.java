package FinalProject;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;


public class PizzaGui extends JFrame {

    private JLabel myJLabelSizes;
    private JLabel myJLabelCrust;
    private JLabel myJLabelDrinks;
    private JLabel myJLabelToppings;
    private JLabel myJLabelDeliveryOpt;
    private JLabel extraTextForDeliveryOpt;
    private JLabel tipText;
    private JLabel totalPrice;

    private JComboBox sizeComboSel;
    private JComboBox typeOfCrustSel;
    private JComboBox drinkSel;
    private JComboBox deliverySel;

    private JCheckBox chkoption1;
    private JCheckBox chkoption2;
    private JCheckBox chkoption3;
    private JCheckBox chkoption4;
    private JCheckBox chkoption5;

    private JTextField tip;
    private JButton placeOrderButton;



    
    public static void main(String[] args) {
         
        new PizzaGui();
    }

    public PizzaGui(){


        comboBoxPanel();
        orderingTipPanel();
        //DisplayLogo();
        

        setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));        
        setTitle("Pizza Ordering Program");
        setSize(500,700);
        setLayout(null);
        setResizable(false);
        setVisible(true);
    }

    public void comboBoxPanel(){

        JPanel pnl = new JPanel();
        pnl.setBounds(0, 150, 500, 250 );
        pnl.setLayout(null);
        Border pnlBorder = BorderFactory.createTitledBorder(null, "Pizza and Drink Selection");
        
        pnl.setBorder(pnlBorder);
        
        //controls inside the panel box

        //labels for comboxes
        myJLabelSizes = new JLabel("Pizza Sizes");
        myJLabelSizes.setBounds(20, 45, 150, 20);
        myJLabelSizes.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(myJLabelSizes);

        myJLabelCrust = new JLabel("Crust Options");
        myJLabelCrust.setBounds(20, 110, 150, 20);
        myJLabelCrust.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(myJLabelCrust);

        myJLabelDrinks = new JLabel("Drinks Option");
        myJLabelDrinks.setBounds(20, 175, 150, 20);
        myJLabelDrinks.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(myJLabelDrinks);

        myJLabelToppings = new JLabel("Pizza Toppings $1 Each");
        myJLabelToppings.setBounds(200, 45, 200, 20);
        myJLabelToppings.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(myJLabelToppings);


        //combo boxes

        String sizes[] = {"Small (+$6)", "Medium (+$12)", "Large (+$18)"};
        sizeComboSel = new JComboBox<>(sizes);
        sizeComboSel.setBounds(20, 70, 150, 20);
        sizeComboSel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(sizeComboSel);

        String crustTypes[] = {"Hand Tossed  (+$3)", "Handmade Pan", "Brooklyn Style","Thin crust", "Gluten Free"};
        typeOfCrustSel = new JComboBox<>(crustTypes);
        typeOfCrustSel.setBounds(20, 135, 180, 20);
        typeOfCrustSel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(typeOfCrustSel);

        String drinkTypes[] = {"Water (+$3)", "Soda (+$5)", "None"};
        drinkSel = new JComboBox<>(drinkTypes);
        drinkSel.setBounds(20, 200, 150, 20);
        drinkSel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(drinkSel);

        //check Boxes

        chkoption1 = new JCheckBox();
        chkoption1.setBounds(200, 70, 125, 25);
        chkoption1.setText("Pepperoni");
        chkoption1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(chkoption1);

        chkoption2 = new JCheckBox();
        chkoption2.setBounds(200, 90, 125, 25);
        chkoption2.setText("Ham");
        chkoption2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(chkoption2);

        chkoption3 = new JCheckBox();
        chkoption3.setBounds(200, 110, 125, 25);
        chkoption3.setText("Pineapple");
        chkoption3.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(chkoption3);

        chkoption4 = new JCheckBox();
        chkoption4.setBounds(200, 130, 125, 25);
        chkoption4.setText("Baccon");
        chkoption4.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(chkoption4);
        
        chkoption5 = new JCheckBox();
        chkoption5.setBounds(200, 150, 125, 25);
        chkoption5.setText("Mushrooms");
        chkoption5.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl.add(chkoption5);


        //adds panel to the JFrame
        add(pnl);

    }

    public void orderingTipPanel(){

        JPanel pnl2 = new JPanel();
        pnl2.setBounds(0, 425, 500, 200 );
        pnl2.setLayout(null);
        Border pnlBorder = BorderFactory.createTitledBorder(null, "Ordering and Tip Options");
        pnl2.setBorder(pnlBorder);

        //label

        myJLabelDeliveryOpt = new JLabel("Delivery or Pickup Selection");
        myJLabelDeliveryOpt.setBounds(15, 35, 250, 20);
        myJLabelDeliveryOpt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
        pnl2.add(myJLabelDeliveryOpt);

        extraTextForDeliveryOpt = new JLabel("($3.00 Extra for Delivery)");
        extraTextForDeliveryOpt.setBounds(15, 50, 250, 20);
        extraTextForDeliveryOpt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
        pnl2.add(extraTextForDeliveryOpt);


        tipText = new JLabel("Tip: ");
        tipText.setBounds(20, 125, 75, 20);
        tipText.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl2.add(tipText);



        //combo Box

        String delveryOptions[] = {"Pickup", "Delivery"};
        deliverySel = new JComboBox<>(delveryOptions);
        deliverySel.setBounds(20, 70, 150, 20);
        deliverySel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
        pnl2.add(deliverySel);

        //tip text box
        tip = new JTextField("0");
        tip.setBounds(20, 150, 150, 20);
        pnl2.add(tip);
        
        //place order button
        placeOrderButton = new JButton("Place Order");
        placeOrderButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
        placeOrderButton.setBounds(250, 25, 150, 50 );
        placeOrderButton.setBackground(Color.red);
        
        //creating label to display total cost
        totalPrice = new JLabel("");

        
        placeOrderButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                double totalCost = pizzaMealCalulation();
                String totalCostConvertedToString = Double.toString(totalCost);
                totalPrice.setBounds(250, 100, 250, 100 );
                totalPrice.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
                totalPrice.setText("Your Total Cost is: $" + totalCostConvertedToString);
                pnl2.add(totalPrice);
                

            }
        });

        pnl2.add(placeOrderButton);


        add(pnl2);


    }

    public double pizzaMealCalulation(){

        double totalPriceForMeal = 0;
        String selected = "";


        //calculates pizza size price
        selected += sizeComboSel.getSelectedItem();
        if(selected.equals("Small (+$6)")){
            totalPriceForMeal += 6;
        }else if(selected.equals("Medium (+$12)")){
            totalPriceForMeal += 12;
        }else if(selected.equals("Large (+$18)")){
            totalPriceForMeal += 18;
        }

        selected = "";

        //calculates crust price
        selected += typeOfCrustSel.getSelectedItem();
        if(selected.equals("Hand Tossed  (+$3)")){
            totalPriceForMeal += 3;
        }

        selected = "";

        //calculates drink price
        selected += drinkSel.getSelectedItem();
        if(selected.equals("Soda (+$5)")){
            totalPriceForMeal += 5;
        }else if(selected.equals("Water (+$3)")){
            totalPriceForMeal += 3;
        }

        selected = "";

        //checks how many toppings selected
        if(chkoption1.isSelected()){
            totalPriceForMeal += 1;
        }
        if(chkoption2.isSelected()){
            totalPriceForMeal += 1;
        }
        if(chkoption3.isSelected()){
            totalPriceForMeal += 1;
        }
        if(chkoption4.isSelected()){
            totalPriceForMeal += 1;
        }
        if(chkoption5.isSelected()){
            totalPriceForMeal += 1;
        }

        selected = "";

        selected += deliverySel;

        //checks if delivery order or not, and adds extra if it is
        if(selected.equals("Delivery")){
            totalPriceForMeal += 3;
        }

        //tip and tips error handling
        try{

            double tmp;
            tmp = Double.parseDouble(tip.getText());
            totalPriceForMeal += tmp;
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, "Tip must be a number");
            tip.setText("0");
            tip.grabFocus();
        }
        
        return totalPriceForMeal;
    }  


    /*This was my attempt to get an image/
    logo at the top but i could figure this part out

     public void DisplayLogo(){
        
         JPanel ImagePanel = new JPanel();
         JLabel iconLabel = new JLabel();
         iconLabel.setIcon(new ImageIcon("logo.jpg"));
         ImagePanel.setBounds(0, 0, 500, 150);
         ImagePanel.add(iconLabel);
         add(ImagePanel);
    }

        */
}
