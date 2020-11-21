/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefitnesstracker;

import java.util.ArrayList;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
// * @author LENOVO
 */
public abstract class Activity {
    static int totalcalories=0;
    static double totalheartrate=80;
    int calories;
    double heartrate;
    public int time;
    public String name;
    //static DecimalFormat df2=new DecimalFormat("##.###");
    static ArrayList <Activity> myactivities =new ArrayList <Activity> ();
    
    public Activity(String name,int time){
        //this.initialcaloriesburnt= initialcaloriesburnt;
       // this.oldheartrate= oldheartrate;
       this.name=name;
       this.time=time;
       
    }
    
     
    public abstract int getCalories();
    public abstract double getHeartrate();
    public abstract int simplecalories();
    public abstract double simpleheartrate();
    public abstract double Calories();
    public abstract double Heartrate();
   // public abstract void add();
    public abstract void display();
    
    
}
