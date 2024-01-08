import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class First implements ActionListener{
  
JFrame frame = new JFrame(); 
JTextField textfield = new JTextField(); 
JTextArea textArea = new JTextArea();
JButton buttonA = new JButton();
JButton buttonB = new JButton();

public First() {
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(715,650);
  frame.getContentPane().setBackground(new Color(50,50,50));
  frame.setLayout(null);
  frame.setResizable(false);
  
  textfield.setBounds(0,0,715,100);
  textfield.setBackground(new Color(25,25,25));
  textfield.setForeground(new Color(25,255,0));
  textfield.setFont(new Font("MV Boli",Font.BOLD,25));
  textfield.setBorder(BorderFactory.createBevelBorder(1));
  textfield.setEditable(false);
  textfield.setText("Welcome to ur probability test quiz");

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

  buttonB.setBounds(100,400,150,80);
  buttonB.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
  buttonB.setFocusable(false);
  buttonB.addActionListener(this);
  buttonB.setText("No");

  frame.add(buttonB);
  frame.add(buttonA);
  frame.add(textfield);
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

  if(e.getSource()==buttonA) {

    Quiz quiz = new Quiz();

    }
     if(e.getSource()==buttonB) {

    Lol quiz = new Lol();

    } 

}


}
