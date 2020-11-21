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
public class RUNNING extends Activity{
    private int runcalories;
    private double runheartincrease;
    static double runc;
    static double runh=0;

    public RUNNING(String name , int time) {
        super(name,time);
    }

    @Override
    public int getCalories() {
        totalcalories+=time*5;
        return totalcalories; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHeartrate() {
       totalheartrate+=totalheartrate*time*0.003;
       return Math.round(totalheartrate*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Calories: "+getCalories()+"Total heart rate: "+getHeartrate()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int simplecalories() {
        runcalories=time*5; 
        return runcalories;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double simpleheartrate() {
        runheartincrease=totalheartrate*0.003*time;
        return Math.round(runheartincrease*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Calories() {
        runc+=time*5;
        return runc;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Heartrate() {
        runh+=totalheartrate*0.003*time;
        return  Math.round(runh*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }
    
}
