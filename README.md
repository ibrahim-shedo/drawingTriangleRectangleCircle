# Shape Drawer

This Java program allows users to draw basic shapes (triangle, rectangle, circle) on a graphical interface.

## How to Use

### Launching the Program

1. Run the program by executing the `main` method in the `ShapeDrawer` class.
2. A window titled **"Shape Drawer"** will appear.

### Selecting a Shape

- Use the drop-down menu to select the shape you want to draw:
  - **Triangle**
  - **Rectangle**
  - **Circle**

### Entering Dimensions

- Based on the selected shape, input the required dimensions:
  - **Triangle**: Base and Height.
  - **Rectangle**: Width and Height.
  - **Circle**: Radius.
- Enter the dimensions in the provided text fields.

### Drawing the Shape

- After entering the dimensions, click the **"Draw"** button.
- The shape will be displayed on the drawing panel below the input fields.

### Error Handling

- If you provide invalid input (e.g., negative values, non-numeric characters), an error message will appear prompting you to enter valid dimensions.
- Ensure valid inputs are provided for accurate drawing.

## Notes

- **Predefined Colors**: 
  - Triangle: **Blue**
  - Rectangle: **Green**
  - Circle: **Red**
- The shapes are drawn on the drawing panel located at the bottom of the window.
- You can draw multiple shapes successively by selecting different shapes and entering dimensions.

## Additional Information

- This program uses **Java's Swing library** to create the graphical user interface (GUI).
- Error messages are shown using **JOptionPane** for easy-to-understand error handling.
- The code is structured with separate methods for drawing each shape, ensuring modularity and readability.

## Customization

Feel free to modify the code to add more advanced functionalities or additional shapes to suit your project needs.
