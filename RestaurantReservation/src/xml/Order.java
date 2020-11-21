/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sony
 */
@XmlRootElement(name="order")
@XmlAccessorType(XmlAccessType.FIELD)

public class Order {


@XmlElement(name="customer_name")
private String customerName;
@XmlElement(name="table_number")
private int tableNumber;
@XmlElement(name="order_dish")
private List<OrderDish> dishes = null;
@XmlElement(name="order_bill")
private double orderBill;

    public double getOrderBill() {
        return orderBill;
    }

    public void setOrderBill(double orderBill) {
        this.orderBill = orderBill;
    }

    

    public String getCustomerName() {
        return customerName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<OrderDish> getDishes() {
        return dishes;
    }

    public void setDishes(List<OrderDish> dishes) {
        this.dishes = dishes;
    }

  

  


    
}
