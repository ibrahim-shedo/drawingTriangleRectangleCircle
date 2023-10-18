import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDrawer extends JFrame implements ActionListener {
    private final JComboBox<String> shapeComboBox;
    private final JTextField dimension1Field, dimension2Field;
    private final JLabel dimension1Label, dimension2Label;
    private final JButton drawButton;
    private final JPanel drawingPanel;

    public ShapeDrawer() {
        setTitle("Shape Drawer");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] shapes = {"Select a Shape", "Triangle", "Rectangle", "Circle"};
        shapeComboBox = new JComboBox<>(shapes);
        shapeComboBox.addActionListener(this);

        dimension1Label = new JLabel("Dimension 1:");
        dimension1Field = new JTextField(10);

        dimension2Label = new JLabel("Dimension 2:");
        dimension2Field = new JTextField(10);

        drawButton = new JButton("Draw");
        drawButton.addActionListener(this);

        drawingPanel = new JPanel();

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        container.add(shapeComboBox);
        container.add(dimension1Label);
        container.add(dimension1Field);
        container.add(dimension2Label);
        container.add(dimension2Field);
        container.add(drawButton);
        container.add(drawingPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawButton) {
            String selectedShape = (String) shapeComboBox.getSelectedItem();

            if (selectedShape.equals("Triangle")) {
                drawTriangle();
            } else if (selectedShape.equals("Rectangle")) {
                drawRectangle();
            } else if (selectedShape.equals("Circle")) {
                drawCircle();
            }
        }
    }

    private void drawTriangle() {
        try {
            int base = Integer.parseInt(dimension1Field.getText());
            int height = Integer.parseInt(dimension2Field.getText());

            Graphics g = drawingPanel.getGraphics();
            g.setColor(Color.BLUE);

            // Check if dimensions are valid
            if (base <= 0 || height <= 0) {
                JOptionPane.showMessageDialog(this, "Invalid dimensions. Please enter positive values.");
            } else {
                // Draw the triangle
                int[] xPoints = {50, 50 + base, 50};
                int[] yPoints = {150, 150, 150 - height};
                g.drawPolygon(xPoints, yPoints, 3);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid dimensions.");
        }
    }

    private void drawRectangle() {
        try {
            int width = Integer.parseInt(dimension1Field.getText());
            int height = Integer.parseInt(dimension2Field.getText());

            Graphics g = drawingPanel.getGraphics();
            g.setColor(Color.GREEN);

            // Check if dimensions are valid
            if (width <= 0 || height <= 0) {
                JOptionPane.showMessageDialog(this, "Invalid dimensions. Please enter positive values.");
            } else {
                // Draw the rectangle
                g.drawRect(50, 150 - height, width, height);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid dimensions.");
        }
    }

    private void drawCircle() {
        try {
            int radius = Integer.parseInt(dimension1Field.getText());

            Graphics g = drawingPanel.getGraphics();
            g.setColor(Color.RED);

            // Check if dimensions are valid
            if (radius <= 0) {
                JOptionPane.showMessageDialog(this, "Invalid radius. Please enter a positive value.");
            } else {
                // Draw the circle
                g.drawOval(50, 150 - radius, 2 * radius, 2 * radius);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid radius.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShapeDrawer());
    }
}
