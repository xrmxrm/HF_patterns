import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 2L;

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(600,200);
		this.setVisible(true);
	}

	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "Now is the time for all good men to come to the aid of their country.";
		graphics.drawString(msg, 50, 100);
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}
}
