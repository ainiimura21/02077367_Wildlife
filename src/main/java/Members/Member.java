//Import packages and libraries
package Members;
import javax.lang.model.element.Name;
import java.awt.*;

//All members have Name and GPS tag id
public class Member{
    protected String name;
    protected int gpsID;

    public Member(String name, int gpsID) {
        this.name = new String(name);
        this.gpsID = gpsID;
    }
    public String getName() {
        return name;
    }
    public int getGpsID() {
        return gpsID;
    }
    public void plotMember(Graphics g){}
    


}
