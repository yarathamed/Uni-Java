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
public class SWIMMING extends Activity {
     int swimcalories;      //for each entry's calculation
     double swimheartincrease;
    static double swimc;             //for total calories of SWIMMING activity
    static double swimh=0;
    
    public SWIMMING(/*double initialcaloriesburnt, double oldheartrate,*/ String name,int time/*, double swimcalories, double swimrate*/) {
        super(/*initialcaloriesburnt, oldheartrate,*/ name,time);
       // this.swimcalories=swimcalories;
        //this.swimrate=swimrate;
    }
    
    @Override
    public int getCalories() {
        
        totalcalories+=time*4;
        return totalcalories;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHeartrate() {
        
        totalheartrate+=totalheartrate*time*0.002;
         return Math.round(totalheartrate*1000.0)/1000.0;
         //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public void display() {
        System.out.println("calories burnt: "+result1+" calories");
        System.out.println("heart rate increase: "+result2+" beat/minute");//To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void display() {
        System.out.println("Calories: "+getCalories() +" Total heart rate: "+getHeartrate()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int simplecalories() {
        swimcalories=time*4;
        return swimcalories;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double simpleheartrate() {
        swimheartincrease=totalheartrate*time*0.002;
        return Math.round(swimheartincrease*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Calories() {
        swimc+=time*4;
        return swimc;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Heartrate() {
        swimh+=totalheartrate*0.002*time;
        return Math.round(swimh*1000.0)/1000.0;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
