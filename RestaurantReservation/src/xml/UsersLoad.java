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
@XmlRootElement(name="users")
@XmlAccessorType(XmlAccessType.FIELD)

public class UsersLoad {
     @XmlElement(name = "user")
    private List<UserLoad> user;

    public List<UserLoad> getUser() {
        return user;
    }

    public void setUser(List<UserLoad> user) {
        this.user = user;
    }

  //  public List<User> getWaiters() {
    //    return user.getRole();
    //}

    
}
