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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@XmlRootElement(name="dishes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dishes {
     @XmlElement(name = "dish")
    private List<Dish> dish;
     

    public List<Dish> getDishes() {
        return dish;
    }

    public void setUsers(List<Dish> dish) {
        this.dish = dish;
    }

 
    
}
