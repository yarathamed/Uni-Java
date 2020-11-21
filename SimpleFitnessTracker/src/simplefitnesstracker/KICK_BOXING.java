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
public class KICK_BOXING extends Activity {
    private int kickcalories;
    private double kickheartincrease;
    static double kickc;
    static double kickh=0;

    public KICK_BOXING(String name, int time) {
        super(name,time);
    }

    @Override
    public int getCalories() {
        totalcalories+=time*3;
        return totalcalories; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHeartrate() {
        totalheartrate+=totalheartrate*time*0.005;
       return Math.round(totalheartrate*1000.0)/1000.0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Calories: "+getCalories()+"Total heart rate: "+getHeartrate()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int simplecalories() {
        kickcalories=time*3;
        return kickcalories;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double simpleheartrate() {
        kickheartincrease=totalheartrate*0.005*time;
        return Math.round(kickheartincrease*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Calories() {
        kickc+=time*3;
        return kickc;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Heartrate() {
        kickh+=totalheartrate*0.005*time;
        return Math.round(kickh*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }
    
}
