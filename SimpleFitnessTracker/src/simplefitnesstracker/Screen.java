/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefitnesstracker;
import java.awt.*;
//import java.awt.FlowLayout;
//import javax.swing.JFrame;
//import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.*;

import static simplefitnesstracker.Activity.myactivities;
/**
 *
 * @author LENOVO
 */
public class Screen extends JFrame   {
    public static void main(String arg[]){    
    JFrame frame=new JFrame("Fitness Tracker");
    
    //COMBOBOX SETTINGS
    String[] messages={"SWIMMING","RUNNING","KICK_BOXING","STRENGTH_TRAINING"};
    JComboBox combo1 = new JComboBox(messages);
    //JScrollPane activitiesListScrollPane = new JScrollPane(combo1);
    combo1.setSelectedIndex(0);
    combo1.setBounds(100,100,200,40);
    frame.add(combo1);
    
    //LABELS SETTINGS
    Font f = new Font("TimesRoman",Font.BOLD,30);
    JLabel label1,label2,label3,label4;
    label1= new JLabel("Type:");
    label2= new JLabel("Time:");
    label3= new JLabel("Add activity:");
    label4=new JLabel("minutes.");
    label1.setBounds(50,100,100,40);
    label2.setBounds(350,100,100,40);
    label3.setBounds(50,50,1000,40);
    label4.setBounds(500,100,100,40);
    //label1.setForeground(Color.blue);
    //label2.setForeground(Color.blue);
    label3.setForeground(Color.blue);
    label3.setFont(f);
    frame.add(label1);
    frame.add(label2);
    frame.add(label3);
    frame.add(label4);
    
    JLabel label_value =new JLabel();
    label_value.setBounds(10,250,600,50);
    frame.add(label_value);
    JLabel successmessage =new JLabel();
    successmessage.setBounds(10, 190, 600, 50);
    frame.add(successmessage);
    //TEXTFIELD SETTINGS
    JTextField textfield1= new JTextField("",20);
    textfield1.setBounds(400,100,100,40);
   // JTextField textfield2= new JTextField("",20);
    frame.add(textfield1);
    //frame.add(textfield2);
    //frame.pack();
    
    //BUTTON 1 (confirming) SETTINGS
    JButton b1= new JButton("Confirm");
    b1.setBounds(550,350,100,40);
    frame.add(b1);
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           String name=combo1.getSelectedItem().toString();
        String s=textfield1.getText();               //return
        try{
        int time= Integer.parseInt(s);
        if(time<0){
        JOptionPane.showMessageDialog(null, "Error! Please enter a positive value in Time field.");
        return;
        }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error! Please enter a digit in Time field.");
            }
         
        if(name.equals("SWIMMING"))
        {
            SWIMMING swim=new SWIMMING(name,Integer.parseInt(s));
            swim.Heartrate();
            successmessage.setText("Calories burnt: "+swim.simplecalories()+ "      Heart rate increase: "+swim.simpleheartrate());
            String line = "<HTML>";
            label_value.setText(line+"Results:"+"<br/>"+"total calories burnt: "+swim.getCalories()+" calories."+"<br/>"+"total heart rate:~"+swim.getHeartrate()+" beat/minute."+line);
            JOptionPane.showMessageDialog(null, "Activity Recorded Successfully.");
            myactivities.add(swim);
            swim.Calories();
            
      
        }
        else if(name.equals("RUNNING"))
        {
            RUNNING run = new RUNNING(name,Integer.parseInt(s));
            run.Heartrate();
            successmessage.setText("Calories burnt: "+run.simplecalories()+ "      Heart rate increase: "+run.simpleheartrate());
            String line = "<HTML>";
            label_value.setText(line+"Results:"+"<br/>"+"total calories burnt: "+run.getCalories()+" calories."+"<br/>"+"total heart rate:~"+run.getHeartrate()+" beat/minute."+line);
            JOptionPane.showMessageDialog(null, "Activity Recorded Successfully.");
            myactivities.add(run);
            run.Calories();
            
        }
        else if(name.equals("KICK_BOXING")){
            KICK_BOXING kick=new KICK_BOXING(name,Integer.parseInt(s));
            kick.Heartrate();
            successmessage.setText("Calories burnt: "+kick.simplecalories()+ "      Heart rate increase: "+kick.simpleheartrate());
            String line = "<HTML>";
            label_value.setText(line+"Results:"+"<br/>"+"total calories burnt: "+kick.getCalories()+" calories."+"<br/>"+"total heart rate:~"+kick.getHeartrate()+" beat/minute."+line);
            JOptionPane.showMessageDialog(null, "Activity Recorded Successfully.");
            myactivities.add(kick);
            kick.Calories();
            
        }
        else if(name.equals("STRENGTH_TRAINING")){
            STRENGTH_TRAINING strength=new STRENGTH_TRAINING(name,Integer.parseInt(s));
            strength.Heartrate();
            successmessage.setText("Calories burnt: "+strength.simplecalories()+ "      Heart rate increase: "+strength.simpleheartrate());
            String line = "<HTML>";
            label_value.setText(line+"Results:"+"<br/>"+"total calories burnt: "+strength.getCalories()+" calories."+"<br/>"+"total heart rate:~"+strength.getHeartrate()+" beat/minute."+line);
            JOptionPane.showMessageDialog(null, "Activity Recorded Successfully.");
            myactivities.add(strength);
            strength.Calories();
            
        }
        
       // label_value.setText(s);                       //return
       /// String success="Activity Recorded Successfully";
       /// successmessage.setText(success);
    }                                          
        
    });
    //text s=new text("Activity Recorded Successfully");
    //b1.addActionListener(s);
    
    //BUTTON 2(ranking) SETTINGS
    JButton b2= new JButton("Click here to get your activities rank!");
    b2.setForeground(Color.red);
    b2.setBounds(10, 350, 300, 40);
    frame.add(b2);
    b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
        frame2 g=new frame2();
        g.setVisible(true);
        g.setSize(400,400); //To change body of generated methods, choose Tools | Templates.
        }
        
    });
    
    //label_value (total) settings
    
    
    //successmessage (each entry's calculations)
    
    
    //FRAME SETTINGS
    frame.setSize(700,500);
    frame.setLayout(null);
    frame.setVisible(true);
    
   // frame.getContentPane().setlayout(new FlowLayout());
  
    
    
    }
    /*static class Action implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JFrame frame2=new JFrame("Sucess!");
            JLabel success=new JLabel("Activity Recorded Successfully");
            success.setForeground(Color.red);
            frame2.setSize(500, 200);
            frame2.add(success);
            frame2.setVisible(true);
        }
    }*/
}

   
    

