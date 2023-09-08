import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CountWordsInWindow extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 4L;
	
	
	JTextField sentence = new JTextField(30);
	JButton count = new JButton("Count");
	JButton clear = new JButton("Clear");
	JLabel result = new JLabel();
	
	public CountWordsInWindow(){
		
		super("Count Words In Window");
		setSize(350, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel message = new JLabel("Please enter you sentence:");
		
		JPanel panel = new JPanel();
		
		panel.add(message);
		panel.add(sentence);
		panel.add(count);
		panel.add(clear);
		panel.add(result);
		
		count.addActionListener(this);
		clear.addActionListener(this);
		
		
		add(panel);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String [] args){
		
		new CountWordsInWindow();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(count == e.getSource()){
			
			StringTokenizer t = new StringTokenizer(sentence.getText(), ".?!, ");
			
			int counter = t.countTokens();
			
		result.setText("Your sentence has " + counter + " words");
		}
		else if(clear == e.getSource()){
			
			sentence.setText("");
			result.setText("");
		}
		
	}
	
	
}
