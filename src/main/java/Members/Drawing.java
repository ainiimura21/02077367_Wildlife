package Members;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Drawing extends JPanel {

    ArrayList<Member> memberList;

    public Drawing(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public void paint(Graphics g) {
        for (Member member : memberList) {
            member.plotMember(g);
        }
    }
}
