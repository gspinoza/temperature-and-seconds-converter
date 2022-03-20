package spinoza;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		// Create and set up the frame or window.
		JFrame myframe = new JFrame("Coverter Tool");
		myframe.setSize(500, 380);
		myframe.setResizable(true);

        // exit program when JFrame is closed
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        // new instance of GUI
		ConverterView Panels = new ConverterView();
        
        // default selected tab when program opens
		Panels.myTabbedPane.setSelectedIndex(0);

		// add JTabbedPane to the JFrame
		myframe.getContentPane().add(Panels.myTabbedPane, BorderLayout.CENTER);

		// Display the frame.
		myframe.setVisible(true);
	}

}