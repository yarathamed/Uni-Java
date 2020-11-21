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

/**
 *
 * @author LENOVO
 */
@XmlRootElement(name="table")
@XmlAccessorType(XmlAccessType.FIELD)
public class Table {
    @XmlElement(name="number")
    private int number;
    @XmlElement(name="number_of_seats")
    private int number_of_seats;
    @XmlElement(name="smoking")
    private boolean smoking;
     @XmlElement(name="reserved")
   private boolean reserved;

    public Table() {
    }

    public Table(int number, int number_of_seats, boolean smoking, boolean reserved) {
        this.number = number;
        this.number_of_seats = number_of_seats;
        this.smoking = smoking;
        this.reserved = reserved;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public boolean isReserved() {
        return reserved;
    }
     
   
}

