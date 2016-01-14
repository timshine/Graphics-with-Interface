import java.awt.*;

public class Shape3Octagon implements Shape {
	// Attributes
	private int startX;
	private int startY;
	private int side;
	private int titleX;
	private int titleY;
	private int messageX;
	private int messageY;

	// Final Attributes
	private final String name = "Octagon";
	private final String message = "An Octagon has 8 sides.";

	// Overloaded Constructor
	public Shape3Octagon(int startX, int startY, int side, int titleX,int titleY, int messageX, int messageY) {
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
		Polygon octagon = new Polygon();
		octagon.addPoint((startX + side), startY);
		octagon.addPoint(startX, (startY + side));
		octagon.addPoint(startX, (startY + (2 * side)));
		octagon.addPoint((startX + side), (startY + (3 * side)));// bottom left
		octagon.addPoint(startX + (2 * side), (startY + (3 * side)));
		octagon.addPoint(startX + (3 * side), (startY + (2 * side)));
		octagon.addPoint(startX + (3 * side), (startY + side));
		octagon.addPoint(startX + (2 * side), startY); // top right
		g.fillPolygon(octagon);
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
