import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Lol  implements ActionListener {

JFrame frame = new JFrame(); 
JTextArea textArea = new JTextArea();
JButton buttonA = new JButton();
JButton buttonB = new JButton();

public Lol() {
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(715,650);
  frame.getContentPane().setBackground(new Color(50,50,50));
  frame.setLayout(null);
  frame.setResizable(false);
  
  textArea.setBounds(100,200,315,80);
  textArea.setLineWrap(true);
  textArea.setWrapStyleWord(true);
  textArea.setBackground(new Color(25,25,25));
  textArea.setForeground(new Color(25,255,0));
  textArea.setFont(new Font("MV Boli",Font.BOLD,25));
  textArea.setBorder(BorderFactory.createBevelBorder(1));
  textArea.setEditable(false);
  textArea.setText("Will u take the quiz ?");
  
  buttonA.setBounds(100,300,150,80);
  buttonA.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
  buttonA.setFocusable(false);
  buttonA.addActionListener(this);
  buttonA.setText("Yes");

  frame.add(buttonA);
  frame.add(textArea);
  frame.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
  
  buttonA.setEnabled(false);
  buttonB.setEnabled(false);
  
  if(e.getSource()==buttonA) {

    Quiz quiz = new Quiz();

    }

}
	
	}
