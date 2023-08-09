import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener
{	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo()
	{
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTrack(true);													//	slider.setPaintTicks(true);
		slider.setMajorTickSpacing(25);												//	slider.setMinorTickSpacing(10);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font(Font.SANS_SERIF/*"MV Boli"*/, Font.PLAIN, 15));
		label.setFont(new Font(Font.SANS_SERIF/*"MV Boli"*/, Font.PLAIN, 25));
		//	slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.setOrientation(SwingConstants.VERTICAL);
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		label.setText("\u00B0C = " + slider.getValue());
		//label.setText("°C = " + slider.getValue());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e)
	{
		label.setText("\u00B0C = " + slider.getValue());
	}
}