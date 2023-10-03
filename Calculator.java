package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum,secondnum,result;
	String operations,answer;

	/**
	 * Start the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 46, 340, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblNewLabel.setBounds(102, 11, 200, 37);
		frame.getContentPane().add(lblNewLabel);
		
		//............row1..........
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b7.getText();
				textField.setText(number);
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 25));
		b7.setBounds(10, 94, 60, 60);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b8.getText();
				textField.setText(number);
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 25));
		b8.setBounds(80, 94, 60, 60);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b9.getText();
				textField.setText(number);
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 25));
		b9.setBounds(150, 94, 60, 60);
		frame.getContentPane().add(b9);
		
		//...........row2..........
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b4.getText();
				textField.setText(number);
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 25));
		b4.setBounds(10, 164, 60, 60);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b5.getText();
				textField.setText(number);
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 25));
		b5.setBounds(80, 164, 60, 60);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b6.getText();
				textField.setText(number);
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 25));
		b6.setBounds(150, 164, 60, 60);
		frame.getContentPane().add(b6);
		
		//.............row3..........

		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b1.getText();
				textField.setText(number);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 25));
		b1.setBounds(10, 234, 60, 60);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b2.getText();
				textField.setText(number);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 25));
		b2.setBounds(80, 234, 60, 60);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b3.getText();
				textField.setText(number);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 25));
		b3.setBounds(150, 234, 60, 60);
		frame.getContentPane().add(b3);
		
		//.........row4...............
		
		JButton bp = new JButton(".");
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bp.getText();
				textField.setText(number);
			}
		});
		bp.setFont(new Font("Tahoma", Font.BOLD, 25));
		bp.setBounds(150, 304, 60, 60);
		frame.getContentPane().add(bp);
		
		JButton b00 = new JButton("00");
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b00.getText();
				textField.setText(number);
			}
		});
		b00.setFont(new Font("Tahoma", Font.BOLD, 20));
		b00.setBounds(80, 304, 60, 60);
		frame.getContentPane().add(b00);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+b0.getText();
				textField.setText(number);
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 25));
		b0.setBounds(10, 304, 60, 60);
		frame.getContentPane().add(b0);
		
		//..........Operators.........
		
		JButton btao = new JButton("+");
		btao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btao.setFont(new Font("Tahoma", Font.BOLD, 25));
		btao.setBounds(220, 264, 60, 100);
		frame.getContentPane().add(btao);
		
		JButton bteo = new JButton("=");
		bteo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum=Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result=firstnum+secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations=="-")
				{
					result=firstnum-secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations=="*")
				{
					result=firstnum*secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations=="/")
				{
					result=firstnum/secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations=="%")
				{
					result=firstnum%secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		bteo.setFont(new Font("Tahoma", Font.BOLD, 25));
		bteo.setBounds(290, 264, 60, 100);
		frame.getContentPane().add(bteo);
		
		JButton btmo = new JButton("x");
		btmo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btmo.setFont(new Font("Tahoma", Font.BOLD, 25));
		btmo.setBounds(220, 214, 60, 40);
		frame.getContentPane().add(btmo);
		
		JButton btso = new JButton("-");
		btso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btso.setFont(new Font("Tahoma", Font.BOLD, 25));
		btso.setBounds(290, 214, 60, 40);
		frame.getContentPane().add(btso);
		
		JButton btpo = new JButton("%");
		btpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btpo.setFont(new Font("Tahoma", Font.BOLD, 20));
		btpo.setBounds(220, 164, 60, 40);
		frame.getContentPane().add(btpo);
		
		JButton btdo = new JButton("/");
		btdo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btdo.setFont(new Font("Tahoma", Font.BOLD, 25));
		btdo.setBounds(290, 164, 60, 40);
		frame.getContentPane().add(btdo);
		
		JButton btc = new JButton("C");
		btc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btc.setForeground(Color.RED);
		btc.setFont(new Font("Tahoma", Font.BOLD, 25));
		btc.setBounds(220, 94, 60, 60);
		frame.getContentPane().add(btc);
		
		JButton btb = new JButton("<x");
		btb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					String s=textField.getText();
					backspace=s.substring(0,s.length()-1);
					textField.setText(backspace);
				}
			}
		});
		btb.setFont(new Font("Tahoma", Font.BOLD, 18));
		btb.setBounds(290, 94, 60, 60);
		frame.getContentPane().add(btb);
	
	}
}
