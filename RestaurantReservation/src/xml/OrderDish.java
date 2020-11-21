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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="order_dish")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderDish {
    
    @XmlElement(name="name")
    private String name;
    @XmlElement(name="price")
    private int price;
    @XmlElement(name="type")
    private String type;
    @XmlElement(name="quantity")
    private int quantity;

   public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
   
  
}
