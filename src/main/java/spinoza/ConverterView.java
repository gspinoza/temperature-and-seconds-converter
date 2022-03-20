package spinoza;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

// Temperature and Seconds Converter GUI
public class ConverterView {
    // declare swing components
    public JTabbedPane myTabbedPane;
	public static JButton ButtonConvert;
	public static JButton ButtonCalculate;
	public static JButton ButtonClear;
    public static JComboBox<String> myComboBox;
	public static JTextField UserInput1;
	public static JTextField ResultsFahrenheit;
	public static JTextField ResultsCelsius;
	public static JTextField ResultsKelvin;
	public static JTextField InputSeconds;
	public static JLabel InfoLabel;
	public static JTextField ResultsDays;
	public static JTextField ResultsHours;
	public static JTextField ResultsMinutes;
	public static JTextField ResultsSeconds;
	public static JLabel TotalSeconds;
	
    // class body
	{  
		// icon for first tab
		ImageIcon icon = new ImageIcon("resources/temperature-converter.png");	
		// icon for second tab
		ImageIcon icon2 = new ImageIcon("resources/time-calculator.png");
		
		// create new JTabbedPane (where Tabs will be)
		myTabbedPane = new JTabbedPane();
		
		// create inner panel
		JPanel myPanel = new JPanel();
		
	    // strings for JComboBox 
        String[] InitialScale = new String[] {"Fahrenheit", "Celsius", "Kelvin"};
        myComboBox = new JComboBox<>(InitialScale);
		
		// initialize JTextField with user input
	    UserInput1 = new JTextField();
		UserInput1.setColumns(10);
		
		// initialize Convert Button
		JButton ButtonConvert = new JButton("Convert");
		// add ActionListener
		ButtonConvert.addActionListener(Controller.ConvertButtonListener);
		
		// initialize Labels
		JLabel LabelFahrenheit = new JLabel("Fahrenheit:");
		JLabel LabelCelsius = new JLabel("Celsius:");
		JLabel LabelKelvin = new JLabel("Kelvin:");
		
		// initialize JTextField for Output Results
		ResultsFahrenheit = new JTextField();
		ResultsFahrenheit.setColumns(10);
		ResultsFahrenheit.setEditable(false);
		ResultsCelsius = new JTextField();
		ResultsCelsius.setColumns(10);
		ResultsCelsius.setEditable(false);
		ResultsKelvin = new JTextField();
		ResultsKelvin.setColumns(10);
		ResultsKelvin.setEditable(false);
		
		// Clear All Button
		JButton ButtonClear = new JButton("Clear All");
		// add ActionListener
		ButtonClear.addActionListener(Controller.ButtonClearListener);
		
		// GROUPLAYOUT MANAGER
		GroupLayout myLayout = new GroupLayout(myPanel);
		myLayout.setHorizontalGroup(
			myLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(myLayout.createSequentialGroup()
					.addGroup(myLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(myLayout.createSequentialGroup()
							.addGap(29)
							.addGroup(myLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(myLayout.createSequentialGroup()
									.addComponent(myComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(57))
								.addGroup(myLayout.createSequentialGroup()
									.addGroup(myLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(LabelCelsius)
										.addComponent(LabelFahrenheit)
										.addComponent(LabelKelvin))
									.addGap(18)))
							.addGroup(myLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(ResultsKelvin, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addComponent(ResultsCelsius, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addComponent(ResultsFahrenheit, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, myLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(UserInput1, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))))
						.addGroup(myLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(ButtonConvert)
							.addPreferredGap(ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
							.addComponent(ButtonClear)))
					.addContainerGap())
		);
		myLayout.setVerticalGroup(
			myLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(myLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(UserInput1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(myComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(85)
					.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(ResultsFahrenheit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelFahrenheit))
					.addGap(27)
					.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(ResultsCelsius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelCelsius))
					.addGap(26)
					.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(ResultsKelvin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelKelvin))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(ButtonConvert)
						.addComponent(ButtonClear))
					.addContainerGap())
		);
		myPanel.setLayout(myLayout);
		myLayout.setAutoCreateGaps(true);
		myLayout.setAutoCreateContainerGaps(true);

		// create/add new tab to TabbedPane - arguments "TabName", iconImage, JPanel, "ToolTip"
		myTabbedPane.addTab("Temperature Converter", icon, myPanel, "Convers temperature to different units of measurements");
		
				
		//TIME CALCULATOR VIEW
		// create another inner panel for a new tab
		JPanel myPanel2 = new JPanel();
		
		JLabel lblEnterNumberOf = new JLabel("Enter Seconds to Calculate");
		
		// user input field
		InputSeconds = new JTextField("");
		InputSeconds.setColumns(10);
        
		// calculate button
		JButton ButtonCalculate = new JButton("Calculate");
		// add ActionListener
		ButtonCalculate.addActionListener(Controller.ButtonCalculateListener);
		// info label
		InfoLabel = new JLabel();
		
		// Output Results in TextFields
		ResultsDays = new JTextField(); // Days
		ResultsDays.setColumns(10);
		ResultsDays.setEditable(false);
		ResultsHours = new JTextField(); // Hours
		ResultsHours.setColumns(10);
		ResultsHours.setEditable(false);
		ResultsMinutes = new JTextField(); // Minutes
		ResultsMinutes.setColumns(10);
		ResultsMinutes.setEditable(false);
		ResultsSeconds = new JTextField(); // Seconds
		ResultsSeconds.setColumns(10);
		ResultsSeconds.setEditable(false);
		
		// labels
		JLabel LabelDays = new JLabel("Days");
		JLabel LabelHours = new JLabel("Hours");
		JLabel LabelMinutes = new JLabel("Minutes");
		JLabel LabelSeconds = new JLabel("Seconds");
		
		// display total seconds
		TotalSeconds = new JLabel();	
		
		 // GROUPLAYOUT MANAGER
		GroupLayout gl_myPanel2 = new GroupLayout(myPanel2);
		gl_myPanel2.setHorizontalGroup(
			gl_myPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myPanel2.createSequentialGroup()
					.addGroup(gl_myPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_myPanel2.createSequentialGroup()
							.addGap(21)
							.addComponent(lblEnterNumberOf)
							.addGap(18)
							.addComponent(InputSeconds, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ButtonCalculate))
						.addGroup(gl_myPanel2.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_myPanel2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_myPanel2.createSequentialGroup()
									.addComponent(ResultsDays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(LabelDays))
								.addComponent(InfoLabel)
								.addGroup(gl_myPanel2.createSequentialGroup()
									.addComponent(ResultsHours, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(LabelHours))
								.addGroup(gl_myPanel2.createSequentialGroup()
									.addComponent(ResultsSeconds, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(LabelSeconds))
								.addGroup(gl_myPanel2.createSequentialGroup()
									.addComponent(ResultsMinutes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(LabelMinutes))
								.addComponent(TotalSeconds))))
					.addContainerGap())
		);
		gl_myPanel2.setVerticalGroup(
			gl_myPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myPanel2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_myPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterNumberOf)
						.addComponent(InputSeconds, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonCalculate))
					.addGap(18)
					.addComponent(InfoLabel)
					.addGap(18)
					.addGroup(gl_myPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(ResultsDays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelDays))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_myPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(ResultsHours, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelHours))
					.addGap(12)
					.addGroup(gl_myPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(ResultsMinutes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelMinutes))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_myPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(ResultsSeconds, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelSeconds))
					.addGap(18)
					.addComponent(TotalSeconds)
					.addGap(109))
		);
		myPanel2.setLayout(gl_myPanel2);

		// add new tab to TabbedPane
		myTabbedPane.addTab("Time Calculator", icon2, myPanel2, "Calculate how many days, hours, and minutes, there are in given seconds. ");
		
		// default selected tab
		// myTabbedPane.setSelectedIndex(0);
	}

}
