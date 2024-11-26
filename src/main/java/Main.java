import Members.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Wildlife Reserve Cuddle Warning System");
        ArrayList<Member> memberList1 = new ArrayList<Member>();

        Keeper keeper = new Keeper("Geoff", 020777777, 80);
        Lion lion = new Lion("Simba", 020777777, 80);
        Drone drone = new Drone("Monitor 1", 020777777, 80);
        memberList1.add((Member) keeper);
        memberList1.add((Member) lion);
        memberList1.add((Member) drone);

        Drawing drawing = new Drawing(memberList1);

        frame.setSize(600, 600);

        frame.setVisible(true);
        frame.add(drawing);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}
