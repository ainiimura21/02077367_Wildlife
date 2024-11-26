package Members;

import java.awt.*;

public class Keeper extends Member {
    private int phoneNB;
    private int radius;
    private Point coords;
    // Constructor to initialize name, Phone number and GPS
    public Keeper(String name, int phoneNB, int gpsID) {
        super(name, gpsID);
        this.phoneNB = phoneNB;
    }
    public int getPhoneNB() {
        return phoneNB;
    }
    public void setPhoneNB(int phoneNB) {
        this.phoneNB = phoneNB;
    }
    public void plotMember(Graphics g){
        int radiusK = 2;
        g.setColor(Color.BLUE);
        // Draw the circle centered at the specified point
        g.fillOval(point.x - radiusK - radiusK, point.y-radiusK - radiusK, 2*radiusK, 2*radiusK);
    }
    public Point convertID(){
        Point point = new Point(getCoords(int GPSid);
        return point;
    }


}
