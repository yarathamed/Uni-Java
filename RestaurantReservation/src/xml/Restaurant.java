/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sony
 */
@XmlRootElement(name="restaurant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Restaurant {
    @XmlElement(name="users")
    private UsersLoad users=null;  
    
    @XmlElement(name="tables")
    private Tables tables = null;
    
    @XmlElement(name="dishes")
    private Dishes dishes = null;
    
    @XmlElement(name="orders")
    private Orders orders = null;

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Orders getOrders() {
        return orders;
    }
    
    public UsersLoad getUsers() {
        return users;
    }

    public void setUsers(UsersLoad users) {
        this.users = users;
    }
  
    public Tables getTables() {
        return tables;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }
    
    public Dishes getDishes() {
        return dishes;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }
    
    
 
}
