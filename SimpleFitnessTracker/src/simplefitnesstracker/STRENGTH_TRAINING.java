/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefitnesstracker;




/**
 *
 * @author LENOVO
 */
public class STRENGTH_TRAINING extends Activity {
    private int strengthcalories;   //for each entry calculation
    private double strengthheartincrease;
    static double strengthc;     //for calorie calculation of the activity 
    static double strengthh=0;

    public STRENGTH_TRAINING(String name, int time) {
        super(name,time);
    }

    @Override
    public int getCalories() {
        totalcalories+=time*5;
        return totalcalories; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHeartrate() {
        totalheartrate+=totalheartrate*time*0.006;
        
       return Math.round(totalheartrate*1000.0)/1000.0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Calories: "+getCalories() +"Total heart rate: "+getHeartrate()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int simplecalories() {
        strengthcalories=time*5;
        return strengthcalories;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double simpleheartrate() {
        strengthheartincrease=totalheartrate*0.006*time;
        
        return Math.round(strengthheartincrease*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Calories() {
        strengthc+=time*5;
        return strengthc;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Heartrate() {
        strengthh+=totalheartrate*0.006*time;
        return Math.round(strengthh*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
