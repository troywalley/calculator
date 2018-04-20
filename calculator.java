/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;
import java.lang.Double;
/**
 *
 * @author walle
 */
public class calculator extends JFrame {
private double displaynumber;
private Boolean nextline;
private Boolean newequation;
private String operator;
private Container container;
private GridBagLayout layout;
private double num1;
private double num2;
public JTextField tf1=new JTextField(30);
private JFrame myframe=new JFrame();

    public calculator(){
        super("Calculator");
        GridBagConstraints gbc = new GridBagConstraints();
        layout=new GridBagLayout();
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.red);
        jp.setBackground(Color.blue);
        jp.setSize(400, 499);
        jp.setVisible(true);
        jp2.setVisible(true);
//        gbc.anchor = GridBagConstraints.NORTH;
        setVisible(true);
        setSize(500,500);
        jp.setPreferredSize(new Dimension(400,300));
        jp2.setPreferredSize(new Dimension(100,50));
        jp.setLayout(layout);
        jp2.setLayout(layout);
        gbc.gridx = 1;
        nextline=false;
        
        gbc.gridy = 1;
        gbc.gridwidth=4;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.fill=GridBagConstraints.VERTICAL;
          add(jp);
        add(jp2,BorderLayout.PAGE_START);
//        gbc.gridwidth= 9;
//        gbc.gridheight= 9;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.fill = GridBagConstraints.VERTICAL;
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        JLabel field=new JLabel("This is a sentence.",30);
        JButton lb1=new JButton("1");
        JButton cb1=new JButton("2");
        JButton rb1=new JButton("3");
        JButton fb1=new JButton("+");
        JButton lb2=new JButton("4");
        JButton cb2=new JButton("5");
        JButton rb2=new JButton("6");
        JButton fb2=new JButton("-");
        JButton lb3=new JButton("7");
        JButton cb3=new JButton("8");
        JButton rb3=new JButton("9");
        JButton fb3=new JButton("*");
        JButton lb4=new JButton(".");
        JButton cb4=new JButton("0");
        JButton rb4=new JButton("=");
        JButton fb4=new JButton("/");
        gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        
        JTextField tf2=new JTextField("This is not editable");
        gbc.fill=GridBagConstraints.BOTH;
//        gbc.fill=GridBagConstraints.VERTICAL;
        gbc.gridwidth=4;
        gbc.weightx = 1.0;
        gbc.weighty=1.0;
//        jp.add(tf1,gbc);
        Font font1 = new Font("SansSerif", Font.BOLD, 24);
        tf1.setHorizontalAlignment(JTextField.RIGHT);
        tf1.setEditable(true);
        tf1.setFont(font1);
        tf1.setText("0");
        gbc.gridwidth=1;
        newequation=false;
        lb1.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             cb1.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             rb1.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             
             lb2.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             
             cb2.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             
             rb2.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             lb3.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             cb3.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             rb3.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             lb4.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             cb4.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            addToTextBox(e);
        }
        });
             fb1.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            changeOperator(e);
        }
        });
                         fb2.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            changeOperator(e);
        }
        });
                     fb3.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            changeOperator(e);
        }
        });
                     fb4.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            changeOperator(e);
        }
        });
             
             rb4.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
                num2=Double.parseDouble(tf1.getText());
                selectionButtonPressed();
        }
        });
//        gbc.fill=GridBagConstraints.NONE;
        gbc.gridx=1;
        gbc.gridy=2;
        jp.add(lb1, gbc);
        gbc.gridx=2;
        jp.add(cb1, gbc);
        gbc.gridx=3;
        jp.add(rb1, gbc);
        gbc.gridx=4;
        jp.add(fb1, gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        jp.add(lb2, gbc);
        gbc.gridx=2;
        jp.add(cb2, gbc);
        gbc.gridx=3;
        jp.add(rb2, gbc);
        gbc.gridx=4;
        jp.add(fb2, gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        jp.add(lb3, gbc);
        gbc.gridx=2;
        jp.add(cb3, gbc);
        gbc.gridx=3;
        jp.add(rb3, gbc);
        gbc.gridx=4;
        jp.add(fb3, gbc);
        gbc.gridx=1;
        gbc.gridy=5;
        jp.add(lb4, gbc);
        gbc.gridx=2;
        jp.add(cb4, gbc);
        gbc.gridx=3;
        jp.add(rb4, gbc);
        gbc.gridx=4;
        jp.add(fb4, gbc);
        jp2.add(tf1, gbc);
        Font font=new Font("Courier",Font.PLAIN,30);
        revalidate();
        repaint();
    }
    public void addToTextBox(ActionEvent a){
        if(newequation==true && operator==""){
          nextline=false;  
          tf1.setText("0");
          newequation=false;
        };
        if(nextline==true){
            num1= Double.parseDouble(tf1.getText());
            tf1.setText("0");
            nextline=false;
        }
        String b;
        Double d = Double.parseDouble(tf1.getText());
        
        if(d == 0){
            tf1.setText("");
            tf1.setText(a.getActionCommand());
        }else{
            
            tf1.setText(tf1.getText() + a.getActionCommand());
        };
        
    
    };
    public void changeOperator(ActionEvent a){
        operator= a.getActionCommand();
        nextline=true;
    };
    public void selectionButtonPressed(){
        switch(operator){
            case "+":
                displaynumber = num1 + num2;
                break;
            case "-":
                displaynumber = num1 - num2;
                break;
            case "*":
                displaynumber = num1 * num2;
                break;
            case "/":
                displaynumber = num1 / num2;
                break;
        }
        if ((displaynumber == Math.floor(displaynumber)) && !Double.isInfinite(displaynumber)) {
            int value=(int) displaynumber;
            tf1.setText(Integer.toString(value));
}else{
          tf1.setText(Double.toString(displaynumber));  
        };
        
        System.out.println(displaynumber);
        newequation=true;
        operator="";
                
    }
  
    
}
