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
@XmlRootElement(name="tables")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tables {
        
   
    private List<Table> table;

    public List<Table> getTables() {
        return table;
    }

    public void setUsers(List<Table> table) {
        this.table=table;
    }
   
}
