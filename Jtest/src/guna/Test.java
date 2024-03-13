package guna;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {

	

		
	JFrame f;  
	public void OptionPaneExample(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
	}    
	

	public static void main(String[] args) {  
	    Test t=new Test();
	    t.OptionPaneExample();
	}  

}
