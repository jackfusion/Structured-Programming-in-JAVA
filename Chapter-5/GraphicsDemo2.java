// Graphics, Image, Color 
// Graphics2D, RadialGradientPaint, AlphaComposite, Font 
import java.awt.*; 
import javax.swing.JApplet;
public class GraphicsDemo2 extends JApplet {
    public void paint(Graphics g) {
        Image image = 
            this.getImage(getDocumentBase(), "image.jpg"); 
        Graphics2D g2 = (Graphics2D) g.create(); 
        float centerX = 340; 
        float centerY = 240; 
        float radius = 300; 
        float[] gradientRange = {0.7f, 1.0f};   // times radius
        // Color components are: red, green, blue, & opaqueness
        // in the range between 0.0f and 1.0f
        Color insideColor = new Color(0.0f, 0.0f, 0.0f, 0.0f); 
        Color outsideColor = Color.BLACK; 
        Color[] colors = {insideColor, outsideColor};
        g.drawImage(image, 0, 0, 680, 480,          // destination topL, botR
            0, 0, 2306, 1625, this);                // source topL, botR
        g2.setPaint(new RadialGradientPaint(centerX, centerY, radius, gradientRange, colors));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);
        g.setFont(new Font(Font.SERIF, Font.ITALIC, 20));
        g.drawString("CAIDEN", 435, 470);
    }
}