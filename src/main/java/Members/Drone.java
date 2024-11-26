package Members;

import java.awt.*;

public class Drone extends Member{
    private int radFreq;
    // Constructor to initialize name, radio frequency and GPS
    public Drone(String name, int radFreq, int gpsID) {
        super(name, gpsID);
        this.radFreq = radFreq;
    }
    public int getRadFreq() {
        return radFreq;
    }
    public void setRadFreq(int radFreq) {
        this.radFreq = radFreq;
    }
    @Override
    public void plotMember(Graphics g){
        int lengthD = 3;
        g.setColor(Color.BLUE);
        // Draw the circle centered at the specified point
        g.fillRect(point.x, point.y, lengthD, lengthD);
    }
    public Point convertID(){
        Point point = new Point(getCoords(int GPSid);
        return point;
    }


}
