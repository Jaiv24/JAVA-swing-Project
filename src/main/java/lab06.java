/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N01283714
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;





public class lab06  extends JFrame{
    private JLabel hd;
    private JTextArea area;
    private JButton jbtCalculate;
    private JButton jbtReset;
    private JTextField h1;
    int num,n1,n2,n3;
    String t;
    public lab06(){
        
        setTitle("MY FIRST SWING GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        
        JLabel l1 = new JLabel("NUMBER SQUARE CUBE");
        l1.setBounds(15, 15, 300, 25);
        hd =new JLabel("Enter a whole no: ");
        hd.setBounds(15,75,150,25);

        jbtCalculate = new JButton("Calculate");
        jbtReset = new JButton("Reset");
        jbtCalculate.setBounds(15, 330, 150, 25);
        jbtReset.setBounds(180, 330, 100, 25);
        area =new JTextArea();
        area.setBounds(15, 120, 350, 200);
        h1= new JTextField();
        h1.setBounds(165, 75, 200, 25);
        area.setEditable(false);
        
        p.add(l1);
        p.add(hd);
        p.add(h1);
        p.add(jbtCalculate);
        p.add(jbtReset);
        p.add(area);
        add(p);
        
        ListenerClass listener = new ListenerClass();
        jbtCalculate.addActionListener(listener);
        jbtReset.addActionListener(listener);
        String text;
        //text = area.setText(t);
    }
    public static void main(String[] args) {
        lab06 x = new lab06();
    }
    
    public void getValue(){
        
    
    try
    {
        int number=Integer.parseInt(h1.getText());
        int square,cube,i;
        
        area.append("Number\tSquare\tCube\n");
        for(i =0;i<10;i++)
        {
          square = number*number;
          cube = number*number*number;
          String display= String.format("%-6s\t%-6s\t%-4s\n",Integer.toString(number),Integer.toString(square),Integer.toString(cube));
          area.append(display);
          number++;
    
        }
    }
    catch(NullPointerException e)
    {
     JOptionPane.showMessageDialog(null,"Error You did not enter any value"); 
    }
    }
    public void resetForm(){
        h1.setText("");
        area.setText("");
        
    }
    
    public class ListenerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== jbtCalculate){
                getValue();
            }
            if(e.getSource()== jbtReset){
                resetForm();
            }
        }
    }
}

