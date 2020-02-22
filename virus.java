import java.awt.*;
import java.util.*;
public class Virus {

	public static void main(String[] args) {
		Frame f;
		int r, g, b;
		Random ran = new Random();
		while(true) {
			f = new Frame();
			f.setSize(400, 300);
			f.setLocation(ran.nextInt(1200), ran.nextInt(400));
			r = ran.nextInt(255);
			g = ran.nextInt(255);
			b = ran.nextInt(255);
			f.setBackground(new Color(r, g, b));
			f.setVisible(true);
			try { Thread.sleep(200); } catch(InterruptedException e) { }
		}
	}
}
