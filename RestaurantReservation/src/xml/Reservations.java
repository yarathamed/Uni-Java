/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import xml.Orders;

/**
 *
 * @author LENOVO
 */
@XmlRootElement(name = "reservations")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservations {
    @XmlElement(name="orders")
    private Orders orders =null;
    
    public Orders getOrders(){
        return orders;
    }
    public void setOrders(Orders orders){
        this.orders=orders;
    }
//    public void loadreservations() throws JAXBException {
//        JAXBContext jaxbcontext = JAXBContext.newInstance(Reservations.class);
//        Unmarshaller u=jaxbcontext.createUnmarshaller();
//        reservation = (Reservations) u.unmarshal(new File("reservations.xml"));
//        List<Table> list = reservation.getTables().getTables();
//}
}
