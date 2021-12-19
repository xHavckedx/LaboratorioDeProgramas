package calculadora;

// Para bloquear la pantalla de la calculadora enable = false

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Start {

	private JFrame frame;
	private JTextField screen;
	private JLabel label1;
	private JButton buttonC;
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonPlus;
	private JButton buttonMinus;
	private JButton buttonMultiplied;
	private JButton buttonDivided;
	private JButton buttonEqual;
	private JButton buttonPar;
	private float numero1=0.0f;
	private float numero2;
	private float resultado;
	private String cadenaNumero = "";
	private String cadenaLabel = "";
	private String signo = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 241, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		screen = new JTextField();
		screen.setEditable(false);
		screen.setForeground(Color.BLACK);
		screen.setBackground(Color.WHITE);
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.setText("0");
		screen.setBounds(10, 28, 206, 28);
		frame.getContentPane().add(screen);
		screen.setColumns(10);
		
		label1 = new JLabel("");
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		label1.setBounds(10, 11, 206, 11);
		frame.getContentPane().add(label1);
		
		buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero="";
				screen.setText("0");
				label1.setText("");
				button0.setEnabled(true);
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				buttonPlus.setEnabled(true);
				buttonMinus.setEnabled(true);
				buttonMultiplied.setEnabled(true);
				buttonDivided.setEnabled(true);
				buttonPar.setEnabled(true);
				buttonEqual.setEnabled(true);
			}
		});
		buttonC.setBounds(10, 67, 42, 33);
		frame.getContentPane().add(buttonC);
		
		button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=1;
				screen.setText(cadenaNumero);
			}
		});
		button1.setBounds(10, 111, 42, 33);
		frame.getContentPane().add(button1);
		
		button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=4;
				screen.setText(cadenaNumero);
			}
		});
		button4.setBounds(10, 155, 42, 33);
		frame.getContentPane().add(button4);
		
		button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=7;
				screen.setText(cadenaNumero);
			}
		});
		button7.setBounds(10, 199, 42, 33);
		frame.getContentPane().add(button7);
		
		button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=0;
				screen.setText(cadenaNumero);
			}
		});
		button0.setBounds(10, 243, 42, 33);
		frame.getContentPane().add(button0);
		
		button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=2;
				screen.setText(cadenaNumero);
			}
		});
		button2.setBounds(62, 111, 42, 33);
		frame.getContentPane().add(button2);
		
		button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=5;
				screen.setText(cadenaNumero);
			}
		});
		button5.setBounds(62, 155, 42, 33);
		frame.getContentPane().add(button5);
		
		button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=8;
				screen.setText(cadenaNumero);
			}
		});
		button8.setBounds(62, 199, 42, 33);
		frame.getContentPane().add(button8);
		
		buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(signo) {
					case "+":
						try {
							numero2 = Integer.parseInt(cadenaNumero);
							resultado = numero1 + numero2;
							cadenaNumero = String.valueOf(Math.round(resultado));
							screen.setText(cadenaNumero);
							cadenaLabel = label1.getText();
							cadenaLabel += Math.round(numero2);
							label1.setText(cadenaLabel);
							numero1 = 0;
							numero2 = 0;
							signo = "";
						} catch (Exception e2) {
							// TODO: handle exception
							numero2 = 0;
							resultado = numero1 + numero2;
							cadenaNumero = String.valueOf(Math.round(resultado));
							screen.setText(cadenaNumero);
							cadenaLabel = label1.getText();
							cadenaLabel += Math.round(numero2);
							label1.setText(cadenaLabel);
							numero1 = 0;
							numero2 = 0;
							signo = "";
						}
						
						buttonEqual.setEnabled(false);
						button0.setEnabled(false);
						button1.setEnabled(false);
						button2.setEnabled(false);
						button3.setEnabled(false);
						button4.setEnabled(false);
						button5.setEnabled(false);
						button6.setEnabled(false);
						button7.setEnabled(false);
						button8.setEnabled(false);
						button9.setEnabled(false);
						buttonPlus.setEnabled(false);
						buttonMinus.setEnabled(false);
						buttonMultiplied.setEnabled(false);
						buttonDivided.setEnabled(false);
						buttonPar.setEnabled(false);
						break;
						
					case "-":
						try {
							numero2 = Integer.parseInt(cadenaNumero);
							resultado = numero1 - numero2;
							cadenaNumero = String.valueOf(Math.round(resultado));
							screen.setText(cadenaNumero);
							cadenaLabel = label1.getText();
							cadenaLabel += Math.round(numero2);
							label1.setText(cadenaLabel);
							numero1 = 0;
							numero2 = 0;
							signo = "";
						} catch (Exception e2) {
							// TODO: handle exception
							numero2 = 0;
							resultado = numero1 - numero2;
							cadenaNumero = String.valueOf(Math.round(resultado));
							screen.setText(cadenaNumero);
							cadenaLabel = label1.getText();
							cadenaLabel += Math.round(numero2);
							label1.setText(cadenaLabel);
							numero1 = 0;
							numero2 = 0;
							signo = "";
						}
						
						buttonEqual.setEnabled(false);
						button0.setEnabled(false);
						button1.setEnabled(false);
						button2.setEnabled(false);
						button3.setEnabled(false);
						button4.setEnabled(false);
						button5.setEnabled(false);
						button6.setEnabled(false);
						button7.setEnabled(false);
						button8.setEnabled(false);
						button9.setEnabled(false);
						buttonPlus.setEnabled(false);
						buttonMinus.setEnabled(false);
						buttonMultiplied.setEnabled(false);
						buttonDivided.setEnabled(false);
						buttonPar.setEnabled(false);
						break;
						
					case "*":
						try {
							numero2 = Integer.parseInt(cadenaNumero);
							resultado = numero1 * numero2;
							cadenaNumero = String.valueOf(Math.round(resultado));
							screen.setText(cadenaNumero);
							cadenaLabel = label1.getText();
							cadenaLabel += Math.round(numero2);
							label1.setText(cadenaLabel);
							numero1 = 0;
							numero2 = 0;
							signo = "";
						} catch (Exception e2) {
							// TODO: handle exception
							numero2 = 0;
							resultado = numero1 * numero2;
							cadenaNumero = String.valueOf(Math.round(resultado));
							screen.setText(cadenaNumero);
							cadenaLabel = label1.getText();
							cadenaLabel += Math.round(numero2);
							label1.setText(cadenaLabel);
							numero1 = 0;
							numero2 = 0;
							signo = "";
						}
						
						buttonEqual.setEnabled(false);
						button0.setEnabled(false);
						button1.setEnabled(false);
						button2.setEnabled(false);
						button3.setEnabled(false);
						button4.setEnabled(false);
						button5.setEnabled(false);
						button6.setEnabled(false);
						button7.setEnabled(false);
						button8.setEnabled(false);
						button9.setEnabled(false);
						buttonPlus.setEnabled(false);
						buttonMinus.setEnabled(false);
						buttonMultiplied.setEnabled(false);
						buttonDivided.setEnabled(false);
						buttonPar.setEnabled(false);
						break;
						
					case "/":
						try {
							numero2 = Integer.parseInt(cadenaNumero);
							resultado = numero1 / numero2;
							cadenaNumero = String.valueOf(resultado);
							screen.setText(cadenaNumero);
							cadenaLabel = label1.getText();
							cadenaLabel += Math.round(numero2);
							label1.setText(cadenaLabel);
							numero1 = 0;
							numero2 = 0;
							signo = "";
						} catch (Exception e2) {
							// TODO: handle exception
							screen.setText("INDETERMINACIÓN");
							label1.setText(Math.round(numero1) + "/0");
							numero1 = 0;
							numero2 = 0;
							signo = "";
						}
						
						buttonEqual.setEnabled(false);
						button0.setEnabled(false);
						button1.setEnabled(false);
						button2.setEnabled(false);
						button3.setEnabled(false);
						button4.setEnabled(false);
						button5.setEnabled(false);
						button6.setEnabled(false);
						button7.setEnabled(false);
						button8.setEnabled(false);
						button9.setEnabled(false);
						buttonPlus.setEnabled(false);
						buttonMinus.setEnabled(false);
						buttonMultiplied.setEnabled(false);
						buttonDivided.setEnabled(false);
						buttonPar.setEnabled(false);
						break;
						
					default:

					if (cadenaNumero.equals("")) {
						screen.setText("0");
					}

					else {
						screen.setText(cadenaNumero);
					}
								
					break;
				}
			}
		});
		buttonEqual.setBounds(62, 243, 94, 33);
		frame.getContentPane().add(buttonEqual);
		
		button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=3;
				screen.setText(cadenaNumero);
			}
		});
		button3.setBounds(114, 111, 42, 33);
		frame.getContentPane().add(button3);
		
		button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=6;
				screen.setText(cadenaNumero);
			}
		});
		button6.setBounds(114, 155, 42, 33);
		frame.getContentPane().add(button6);
		
		button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaNumero+=9;
				screen.setText(cadenaNumero);
			}
		});
		button9.setBounds(114, 199, 42, 33);
		frame.getContentPane().add(button9);
		
		buttonPar = new JButton("Par");
		buttonPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Integer.parseInt(screen.getText());
				if(numero1%2==0) {
					screen.setText("PAR");
				}
				
				else {
					screen.setText("IMPAR");
				}
				
				buttonEqual.setEnabled(false);
				button0.setEnabled(false);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				buttonPlus.setEnabled(false);
				buttonMinus.setEnabled(false);
				buttonMultiplied.setEnabled(false);
				buttonDivided.setEnabled(false);
				buttonPar.setEnabled(false);
				cadenaNumero = String.valueOf(Math.round(numero1));
				label1.setText(cadenaNumero);
			}
		});
		
		buttonPar.setBounds(72, 67, 55, 33);
		frame.getContentPane().add(buttonPar);
		
		buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					screen.setText("0");
					label1.setText(cadenaNumero + "+");
					numero1 = Integer.parseInt(cadenaNumero);
					signo = "+";
					cadenaNumero="";
					buttonPlus.setEnabled(false);
					buttonMinus.setEnabled(false);
					buttonMultiplied.setEnabled(false);
					buttonDivided.setEnabled(false);
				} catch (Exception e2) {
					// TODO: handle exception
					screen.setText("0");
					label1.setText("0+");
					numero1 = 0;
					signo = "+";
					buttonPlus.setEnabled(false);
					buttonMinus.setEnabled(false);
					buttonMultiplied.setEnabled(false);
					buttonDivided.setEnabled(false);
				}
				
			}
		});
		buttonPlus.setBounds(170, 111, 46, 33);
		frame.getContentPane().add(buttonPlus);
		
		buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					screen.setText("0");
					label1.setText(cadenaNumero + "-");
					numero1 = Integer.parseInt(cadenaNumero);
					signo = "-";
					cadenaNumero = "";
					buttonPlus.setEnabled(false);
					buttonMinus.setEnabled(false);
					buttonMultiplied.setEnabled(false);
					buttonDivided.setEnabled(false);
				} catch (Exception e2) {
					// TODO: handle exception
					screen.setText("0");
					label1.setText("0-");
					numero1 = 0;
					signo = "-";
					buttonPlus.setEnabled(false);
					buttonMinus.setEnabled(false);
					buttonMultiplied.setEnabled(false);
					buttonDivided.setEnabled(false);
				}
				
			}
		});
		buttonMinus.setBounds(170, 155, 46, 33);
		frame.getContentPane().add(buttonMinus);
		
		buttonMultiplied = new JButton("*");
		buttonMultiplied.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					screen.setText("0");
					label1.setText(cadenaNumero + "*");
					numero1 = Integer.parseInt(cadenaNumero);
					signo = "*";
					cadenaNumero = "";
					buttonPlus.setEnabled(false);
					buttonMinus.setEnabled(false);
					buttonMultiplied.setEnabled(false);
					buttonDivided.setEnabled(false);
				} catch (Exception e2) {
					// TODO: handle exception
					screen.setText("0");
					label1.setText("0*");
					numero1 = 0;
					signo = "*";
					buttonPlus.setEnabled(false);
					buttonMinus.setEnabled(false);
					buttonMultiplied.setEnabled(false);
					buttonDivided.setEnabled(false);
				}
				
			}
		});
		buttonMultiplied.setBounds(170, 199, 46, 33);
		frame.getContentPane().add(buttonMultiplied);
		
		buttonDivided = new JButton("/");
		buttonDivided.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					screen.setText("0");
					label1.setText(cadenaNumero + "/");
					numero1 = Integer.parseInt(cadenaNumero);
					signo = "/";
					cadenaNumero = "";
					buttonPlus.setEnabled(false);
					buttonMinus.setEnabled(false);
					buttonMultiplied.setEnabled(false);
					buttonDivided.setEnabled(false);
				} catch (Exception e2) {
					// TODO: handle exception
					screen.setText("0");
					label1.setText("0/");
					numero1 = 0;
					signo = "/";
					buttonPlus.setEnabled(false);
					buttonMinus.setEnabled(false);
					buttonMultiplied.setEnabled(false);
					buttonDivided.setEnabled(false);
				}
				
			}
		});
		buttonDivided.setBounds(170, 243, 46, 33);
		frame.getContentPane().add(buttonDivided);
	}
}