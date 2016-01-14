import java.awt.*;

public class Shape1Square implements Shape {
	// Attributes
	private int startX;
	private int startY;
	private int side;
	private int titleX;
	private int titleY;
	private int messageX;
	private int messageY;

	// Final Attributes
	private final String name = "Square";
	private final String message = "A Square has 4 sides.";

	// Overloaded Constructor
	public Shape1Square(int startX, int startY, int side, int titleX,int titleY, int messageX, int messageY) {
		this.startX = startX;
		this.startY = startY;
		this.side = side;
		this.titleX = titleX;
		this.titleY = titleY;
		this.messageX = messageX;
		this.messageY = messageY;

	}

	// Draw Shape
	public void drawShape(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(startX, startY, side, side);

	}

	// Display Names
	public void displayName(Graphics g) {
		g.drawString(name, titleX, titleY);
	}

	//Display message
	public void displayNumSides(Graphics g) {
		g.drawString(message, messageX, messageY);
	}

}
