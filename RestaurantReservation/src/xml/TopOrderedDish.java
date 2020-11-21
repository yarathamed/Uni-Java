/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

/**
 *
 * @author Sony
 */
public class TopOrderedDish {
 
    private String dishName;
    private int count;

    public TopOrderedDish() {
    }

    public TopOrderedDish(String dishName, int count) {
        this.dishName = dishName;
        this.count = count;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    
    
}
