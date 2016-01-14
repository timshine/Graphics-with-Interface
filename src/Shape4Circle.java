import java.awt.*;

public class Shape4Circle implements Shape {
	// Attributes
	private int startX;
	private int startY;
	private int radius;
	private int titleX;
	private int titleY;
	private int messageX;
	private int messageY;

	// Final Attributes
	private final String name = "Circle";
	private final String message = "A Circle has 0 sides.";

	// Overloaded Constructor
	public Shape4Circle(int startX, int startY, int radius, int titleX,int titleY, int messageX, int messageY) {
		this.startX = startX;
		this.startY = startY;
		this.radius = radius;
		this.titleX = titleX;
		this.titleY = titleY;
		this.messageX = messageX;
		this.messageY = messageY;

	}

	// Draw Shape
	public void drawShape(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(startX, startY, radius, radius);
	}

	//Display Names
	public void displayName(Graphics g) {
		g.drawString(name, titleX, titleY);
	}

	//Display message
	public void displayNumSides(Graphics g) {
		g.drawString(message, messageX, messageY);
	}
}
