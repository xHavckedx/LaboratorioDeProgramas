import java.awt.AWTException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Evento {
	public void fncEvento() throws InterruptedException  {
		JFrame evPantalla = new JFrame();
		evPantalla.setSize(300, 500);
		evPantalla.setVisible(true);
		evPantalla.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JButton jbBoton = new JButton("Copiar");
		jbBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WebScrapping eObjeto = new WebScrapping();
				try {
					eObjeto.fncRealizarCopia();
				} catch (AWTException e1) {
					e1.printStackTrace();
				}
			}
		});
		evPantalla.add(jbBoton);
		while (true) {
			Thread.sleep(100);
		}

	}

}
