import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button;
	JLabel label;
	
	MyFrame()
	{
		ImageIcon icon = new ImageIcon("C:\\Users\\AT95\\OneDrive\\Desktop\\Java GUI Tutorial\\4_buttons\\vector-illustration-of-index-finger-pointing-at-you-ENJM73 resized.jpg");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\AT95\\OneDrive\\Desktop\\Java GUI Tutorial\\4_buttons\\png-transparent-smiley-thumb-signal-emoticon-smiley-miscellaneous-face-emoji resize1.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		/*
			Constructor Call
		*/
		button.setBounds(50, 50, 250, 250);
		/*
			Slika koju sam preuzeo sa interneta tj. datoteka imena vector-illustration-of-index-finger-pointing-at-you-ENJM73.jpg
			je velikih dimenzija sto se moze vidjeti ako desnim klikom kliknemo na istu, zatim Properties, zatim Deatils.
			Da bi prilikom pokretanja programa slika bila vidljiva dimenzije su podesene tako da sliku s'lijeva u desno odbacim od frame-a za 50 pixeil-a,
			da je spustim na dole za 50 pixel-a te njene dimenzije sto su X/Y koordinate Dekratovog 3D koordinatnog sistema.
			
			Naravno originalni tutorial jeste bolji primjer ali u zelji da iako sam selekcijom slike tolikih dimenzija sacuvam izmjene
			i napravim balans izmedju na greska se uci i tutorial-a odlucio sam se da podesim program te slika, frame i tekst budu prikazani u cjelosti
			pa se ova datoteka pored button prezentacije pretvorila u vjezbanje/ucenje front-end-a.
			
			Elem, da bih nastavio sa tutorial-om sliku sam resize-ovao koristeci obicnu Windows Photos aplikaciju 
			tako da je tutorial ispracen slikom 	vector-illustration-of-index-finger-pointing-at-you-ENJM73 resized.jpg
		*/
	//	button.addActionListener(e -> System.out.println("poo"));
		/*
			Klik na dugme <=> akcija
			
			1.	button: This refers to the JButton instance to which we want to add an action listener.
			2.	addActionListener(...): This is a method of the JButton class that allows you to register an action listener to the button. 
				An action listener is an object that listens for specific events, like a button click, and executes the corresponding code when that event occurs.
			3.	e -> System.out.println("poo"): This is the lambda expression that serves as the action listener. 
			It 	specifies what action should be taken when the button is clicked.
			4.	e: This is a parameter that represents the ActionEvent object generated when the button is clicked. 
			It 	holds information about the event, but since the lambda expression doesn't use this parameter, it can be omitted.
			5.	System.out.println("poo"): This is the action that will be performed when the button is clicked. In this case, it simply prints "poo" to the console.
				To summarize, the line button.addActionListener(e -> System.out.println("poo")); 
				adds an action listener to the button instance, and when the button is clicked, it prints "poo" to the console.
		*/
		button.addActionListener(this);
		button.setText("I'm a button!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			System.out.println("poo");
			label.setVisible(true);
		}
	}	
}