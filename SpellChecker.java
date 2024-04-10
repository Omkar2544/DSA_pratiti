package com.om.dsa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SpellChecker extends JFrame implements ActionListener {
	
	static JFrame f;
	 
    // JButton
    static JButton b;
 
    // label to display text
    static JLabel l;
 
    // text area
    static JTextArea jt;
 
    // default constructor
    SpellChecker()
    {
    }

	public static void main(String[] args) {
		f = new JFrame("textfield");
		 
        // create a label to display text
        l = new JLabel("nothing entered");
 
        // create a new button
        b = new JButton("submit");
   
        // create a object of the text class
        SpellChecker te = new SpellChecker();
 
        // addActionListener to button
        b.addActionListener((ActionListener) te);
 
        // create a text area, specifying the rows and columns
        jt = new JTextArea(25, 25);
 
        JPanel p = new JPanel();
 
        // add the text area and button to panel
        p.add(jt);
        p.add(b);
        p.add(l);
 
        f.add(p);
        // set the size of frame
        f.setSize(300, 300);
 
        f.show();
	}
	
	public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            // set the text of the label to the text of the field
        	String userData = jt.getText();
        	List<String> Dictionary  = new ArrayList<>();
        	Dictionary.add("hello");
        	Dictionary.add("home");
        	for(String it: Dictionary) {
        		if(it.equals(userData)) {
        			l.setText(jt.getText());
        			return;
        		}
        	}
        	l.setText("enter text has no meaning");
        }
    }
}
