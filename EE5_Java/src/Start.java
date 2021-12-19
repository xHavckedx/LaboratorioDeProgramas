import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

/**
 * @author Francesc Gómez Cano
 * 26/11/2021
 * DAM - EE5
 */
public class Start implements ActionListener {

	private static JFrame frmEjemplo;
	private static JTextField texto;
	private static String strTexto;
	private static String strOperacion;
	private static String strResultado;
	private static Float flOperacion = null;
	private static Float flOperacion1 = null;
	private static Float flOperacion2 = null;

	public static void main(String[] args) {

		frmEjemplo = new JFrame();
		frmEjemplo.setTitle("Calculadora");
		frmEjemplo.setBounds(100, 100, 459, 387);
		frmEjemplo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjemplo.getContentPane().setLayout(null);

		texto = new JTextField();
		texto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		texto.setHorizontalAlignment(SwingConstants.RIGHT);
		texto.setEditable(false);
		texto.setBounds(58, 41, 347, 36);
		frmEjemplo.getContentPane().add(texto);
		texto.setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.setBounds(33, 175, 89, 23);
		frmEjemplo.getContentPane().add(btn1);

		JButton btn4 = new JButton("4");
		btn4.setBounds(33, 209, 89, 23);
		frmEjemplo.getContentPane().add(btn4);

		JButton btn7 = new JButton("7");
		btn7.setBounds(33, 243, 89, 23);
		frmEjemplo.getContentPane().add(btn7);

		JButton btn2 = new JButton("2");
		btn2.setBounds(144, 175, 89, 23);
		frmEjemplo.getContentPane().add(btn2);

		JButton btn5 = new JButton("5");
		btn5.setBounds(144, 209, 89, 23);
		frmEjemplo.getContentPane().add(btn5);

		JButton btn8 = new JButton("8");
		btn8.setBounds(144, 243, 89, 23);
		frmEjemplo.getContentPane().add(btn8);

		JButton btn3 = new JButton("3");
		btn3.setBounds(249, 175, 89, 23);
		frmEjemplo.getContentPane().add(btn3);

		JButton btn6 = new JButton("6");
		btn6.setBounds(249, 209, 89, 23);
		frmEjemplo.getContentPane().add(btn6);

		JButton btn9 = new JButton("9");
		btn9.setBounds(249, 243, 89, 23);
		frmEjemplo.getContentPane().add(btn9);

		JButton btnC = new JButton("C");
		btnC.setBounds(33, 109, 89, 23);
		frmEjemplo.getContentPane().add(btnC);

		JButton btnPar = new JButton("Par");
		btnPar.setBounds(144, 109, 89, 23);
		frmEjemplo.getContentPane().add(btnPar);

		JButton btnMas = new JButton("+");
		btnMas.setBounds(360, 175, 51, 23);
		frmEjemplo.getContentPane().add(btnMas);

		JButton btnMenos = new JButton("-");
		btnMenos.setBounds(360, 209, 51, 23);
		frmEjemplo.getContentPane().add(btnMenos);

		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplicar.setBounds(360, 243, 51, 23);
		frmEjemplo.getContentPane().add(btnMultiplicar);

		JButton btn0 = new JButton("0");
		btn0.setBounds(33, 297, 89, 23);
		frmEjemplo.getContentPane().add(btn0);

		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(144, 297, 194, 23);
		frmEjemplo.getContentPane().add(btnIgual);

		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(360, 297, 51, 23);
		frmEjemplo.getContentPane().add(btnDividir);

		JLabel lblOperacion = new JLabel("");
		lblOperacion.setBounds(58, 11, 347, 14);
		lblOperacion.setHorizontalAlignment(4);
		frmEjemplo.getContentPane().add(lblOperacion);

		JButton btnPunto = new JButton(".");
		btnPunto.setBounds(360, 109, 51, 23);
		frmEjemplo.getContentPane().add(btnPunto);
		
		JButton btnPrimo = new JButton("Primo");
		btnPrimo.setBounds(249, 109, 89, 23);
		frmEjemplo.getContentPane().add(btnPrimo);
//		ActionListener
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strTexto = "";
				texto.setText(strTexto);
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnMas.setEnabled(true);
				btnMenos.setEnabled(true);
				btnDividir.setEnabled(true);
				btnMultiplicar.setEnabled(true);
				btnIgual.setEnabled(true);
				btnPar.setEnabled(true);
				btnPrimo.setEnabled(true);
				btnPunto.setEnabled(true);
				flOperacion = null;
				flOperacion1 = null;
				flOperacion2 = null;
				lblOperacion.setText("");
			}
		});
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strResultado = texto.getText();
				strTexto = strTexto + ".";
				texto.setText(strResultado + ".");

			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "0";
				} else {
					strTexto = strTexto + "0";
				}
				texto.setText(strTexto);
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "1";
				} else {
					strTexto = strTexto + "1";
				}
				texto.setText(strTexto);
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "2";
				} else {
					strTexto = strTexto + "2";
				}
				texto.setText(strTexto);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "3";
				} else {
					strTexto = strTexto + "3";
				}
				texto.setText(strTexto);
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "4";
				} else {
					strTexto = strTexto + "4";
				}
				texto.setText(strTexto);
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "5";
				} else {
					strTexto = strTexto + "5";
				}
				texto.setText(strTexto);
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "6";
				} else {
					strTexto = strTexto + "6";
				}
				texto.setText(strTexto);
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "7";
				} else {
					strTexto = strTexto + "7";
				}
				texto.setText(strTexto);
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "8";
				} else {
					strTexto = strTexto + "8";
				}
				texto.setText(strTexto);
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (strTexto == null) {
					strTexto = "9";
				} else {
					strTexto = strTexto + "9";
				}
				texto.setText(strTexto);
			}
		});
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (texto.getText().equals("")) {
					strResultado = "0";
				} else {
					strResultado = texto.getText();
				}
				flOperacion1 = Float.parseFloat(strResultado);
				lblOperacion.setText(Float.toString(flOperacion1) + " " + "+");
				texto.setText("");
				strTexto = "";
				strOperacion = "sumar";
			}
		});
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (texto.getText().equals("")) {
					strResultado = "0";
					texto.setText("-");
					strTexto = "-";
					System.out.println("funciona");
				} else {
					strResultado = texto.getText();
					flOperacion1 = Float.parseFloat(strResultado);
					lblOperacion.setText(Float.toString(flOperacion1) + " " + "-");
					texto.setText("");
					strTexto = "";
					strOperacion = "restar";
				}

			}
		});
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (texto.getText().equals("")) {
					strResultado = "0";
				} else {
					strResultado = texto.getText();
				}
				flOperacion1 = Float.parseFloat(strResultado);
				lblOperacion.setText(Float.toString(flOperacion1) + " " + "*");
				texto.setText("");
				strTexto = "";
				strOperacion = "multiplicar";
			}
		});
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (texto.getText().equals("")) {
					strResultado = "0";
				} else {
					strResultado = texto.getText();
				}
				flOperacion1 = Float.parseFloat(strResultado);
				lblOperacion.setText(Float.toString(flOperacion1) + " " + "/");
				texto.setText("");
				strTexto = "";
				strOperacion = "dividir";
			}
		});
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					flOperacion2 = Float.parseFloat(strTexto);
				if (strOperacion.equals("sumar")) {
					flOperacion = flOperacion1 + flOperacion2;
					texto.setText(Float.toString(flOperacion));
					lblOperacion.setText(Float.toString(flOperacion1) + " + " + Float.toString(flOperacion2) + " = "
							+ Float.toString(flOperacion));
					if (texto.getText().charAt(0) == '-') {
						btnPar.setEnabled(false);
					} else if(texto.getText().charAt(0) != '-'){
						btnPar.setEnabled(true);
					}
				} else if (strOperacion.equals("restar")) {
					flOperacion = flOperacion1 - flOperacion2;
					texto.setText(Float.toString(flOperacion));
					lblOperacion.setText(Float.toString(flOperacion1) + " - " + Float.toString(flOperacion2) + " = "
							+ Float.toString(flOperacion));
					if (texto.getText().charAt(0) == '-') {
						btnPar.setEnabled(false);
					}else if(texto.getText().charAt(0) != '-'){
						btnPar.setEnabled(true);
					}
				} else if (strOperacion.equals("multiplicar")) {
					flOperacion = flOperacion1 * flOperacion2;
					texto.setText(Float.toString(flOperacion));
					lblOperacion.setText(Float.toString(flOperacion1) + " * " + Float.toString(flOperacion2) + " = "
							+ Float.toString(flOperacion));
					if (texto.getText().charAt(0) == '-') {
						btnPar.setEnabled(false);
					} else if(texto.getText().charAt(0) != '-'){
						btnPar.setEnabled(true);
					}
				} else if ((strResultado.equals("0")) && (strOperacion.equals("dividir"))) {
					texto.setText("Indeterminación");
					lblOperacion.setText("Indeterminación");
					if (texto.getText().charAt(0) == '-') {
						btnPar.setEnabled(false);
					}else if(texto.getText().charAt(0) != '-'){
						btnPar.setEnabled(true);
					}
				} else if ((flOperacion2 == 0) && (strOperacion.equals("dividir"))) {
					texto.setText("Indeterminación");
					lblOperacion.setText("Indeterminación");
					if (texto.getText().charAt(0) == '-') {
						btnPar.setEnabled(false);
					}else if(texto.getText().charAt(0) != '-'){
						btnPar.setEnabled(true);
					}
				} else if (strOperacion.equals("dividir")) {
					flOperacion = flOperacion1 / flOperacion2;
					texto.setText(Float.toString(flOperacion));
					lblOperacion.setText(Float.toString(flOperacion1) + " / " + Float.toString(flOperacion2) + " = "
							+ Float.toString(flOperacion));
					if (texto.getText().charAt(0) == '-') {
						btnPar.setEnabled(false);
					}else if(texto.getText().charAt(0) != '-'){
						btnPar.setEnabled(true);
					}
				}
				}catch(Exception e1){
					texto.setText("Error");
					lblOperacion.setText("Error");
					btn0.setEnabled(false);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					btnMas.setEnabled(false);
					btnMenos.setEnabled(false);
					btnDividir.setEnabled(false);
					btnMultiplicar.setEnabled(false);
					btnIgual.setEnabled(false);
					btnPar.setEnabled(false);
					btnPrimo.setEnabled(false);
					btnPunto.setEnabled(false);
				}
			}
		});
		btnPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flOperacion1 = Float.parseFloat(texto.getText());
				if(flOperacion1 % 2 == 0) {
					texto.setText("Es par");
					lblOperacion.setText(flOperacion1 + " es par");
				} else {
					texto.setText("Es impar");
					lblOperacion.setText(flOperacion1 + " es impar");
				}
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnMas.setEnabled(false);
				btnMenos.setEnabled(false);
				btnDividir.setEnabled(false);
				btnMultiplicar.setEnabled(false);
				btnIgual.setEnabled(false);
				btnPar.setEnabled(false);
				btnPrimo.setEnabled(false);
				btnPunto.setEnabled(false);
			}
		});
		btnPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flOperacion1 = Float.parseFloat(texto.getText());
				int j = 0;
				for (float i = 1; i <= flOperacion1; ++i) {
					if (flOperacion1 % i == 0) {
						j++;
					}
					if (j != 2) {
						texto.setText("no es primo");
						lblOperacion.setText(flOperacion1 + " no es primo");
					} else {
						texto.setText("es primo");
						lblOperacion.setText(flOperacion1 + " es primo");
					}
				}
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnMas.setEnabled(false);
				btnMenos.setEnabled(false);
				btnDividir.setEnabled(false);
				btnMultiplicar.setEnabled(false);
				btnIgual.setEnabled(false);
				btnPar.setEnabled(false);
				btnPrimo.setEnabled(false);
				btnPunto.setEnabled(false);

			}
		});
		frmEjemplo.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

	}
}