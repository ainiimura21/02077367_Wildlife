package Members;

import java.awt.*;

public class Lion extends Member {
    private int age;
    // Constructor to initialize name, age and GPS
    public Lion(String name, int age, int gpsID) {
        super(name, gpsID);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void plotMember(Graphics g){
        int radiusL = 3;
        g.setColor(Color.BLUE);
        // Draw the circle centered at the specified point
        g.fillOval(point.x - radiusL - radiusL, point.y -radiusL - radiusL, 2*radiusL, 2*radiusL);
    }
    public Point convertID(){
        Point point = new Point(getCoords(int GPSid);
        return point;
    }
}
