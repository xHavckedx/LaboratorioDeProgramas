import static org.junit.Assert.assertEquals;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebScrapping {
	private WebDriver driver;
	
	@Before
	public void setUp(){
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("./src/test/resources/Fireshot/mcbpblocgmgfnpjjppndjkmgjaogfceg-0.99.15-Crx4Chrome.crx"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("https://www.phpbb.com/community/viewforum.php?f=606");
		}
	
	@After
	public void tearDown() {
	//	driver.quit();
	}

	@Test
	public void test() throws AWTException, InterruptedException {
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); Tiempo de espera
		Robot send = new Robot();
		send.keyPress(KeyEvent.VK_CONTROL);
		send.keyPress(KeyEvent.VK_W);
		send.keyRelease(KeyEvent.VK_CONTROL);
		send.keyRelease(KeyEvent.VK_W);
		Evento ventanaCopia = new Evento();
		ventanaCopia.fncEvento();
		//fncRealizarCopia();
		//fncEvento();
	}
	

	public void fncRealizarCopia() throws AWTException {
		JOptionPane panel = new JOptionPane();
		Robot send = new Robot();
		String strOpcion = panel.showInputDialog("Introduce la clase del objeto en CSS.");
		List<WebElement> listaEntradas = driver.findElements(By.xpath(strOpcion));
		//System.out.println(listaEntradas.get(2).getText());
		for(int i = 0; i <= listaEntradas.size(); i ++) {
			System.out.println("Entradas" + listaEntradas.get(i).getText());
			String strNombreArchivo = listaEntradas.get(i).getText(); //guarda el nombre de la entrada en un string
			listaEntradas.get(i).click();			//abre la entrada
			send.keyPress(KeyEvent.VK_CONTROL);
			send.keyPress(KeyEvent.VK_S);
			send.keyRelease(KeyEvent.VK_CONTROL);
			send.keyRelease(KeyEvent.VK_S);			//genera la cópia de la pagina web y abre la pagina nueva
			if(driver.findElement(By.xpath("//*[@id=\"btnSaveImage\"]")).isDisplayed())//instrucción para esperar a que cargue la página.
			{
				driver.findElement(By.xpath("//*[@id=\"btnSaveImage\"]")).click(); //le da click para guardar la pagina en imagen
				//imprimir el texto para guardar el archivo.
			}
		}
	}
	
	/*public void fncEvento() throws InterruptedException  {
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

	}*/
}
