/*ITCR
Área Académica Ingeniería en Computadores
II Semestre 2021/Algoritmos y Estructura de Datos I
Tarea Extraclase 1
Estudiante: Luis Pablo Céspedes Sequeira.
Carné: 201156162
IDE: NetBeans 12.2*/
package Chat;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Font;

/**
 * Esta clase contiene las partes de la interfaz que no intervienen en la lógica del programa, que por esto se puede
 * usar en ambos usuarios.
 * @author Luis Pablo Céspedes Sequeira.
 * @see Panel
 */
@SuppressWarnings("serial")
public class Panel extends JPanel {

    public String usuario;

     /**
     * Metodo parametrizado, constructor por defecto 
     * del otro usuario, y hacerle los cambios necesarios para asignarlos a las etiquetas que los desplegan
     * @param nombre Nombre del otro ususario para identificar que los datos que se desplegan son del otro usuario
     */
    public Panel(String nombre) {
        usuario = nombre;
        setFocusable(true);
    }

    @Override
     /**
      * Este método es el encargado de dibujar y escribir los
      * distintos elemento de la interfas en ciertas partes de la pantalla
     */
    public void paint(Graphics p) {
        super.paint(p);
        Graphics2D g2d = (Graphics2D) p;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        p.setColor(Color.BLACK);
        p.fillRect(0, 0, 450, 450);
        p.setColor(Color.white);
        p.fillRect(7, 150, 420, 243);
        p.setColor(Color.BLACK);
        Font font = new Font("", Font.PLAIN, 17);
        p.setFont(font);
        p.setColor(Color.green);
        p.drawString("Seleccione el articulo deseado para enviar los datos", 20, 30);
        p.drawString("a la otra caja y realizar la facturacion", 20, 50);
        p.setColor(Color.red);
        p.drawString("Datos de el otro usuario.   " + usuario, 20, 170);
        p.setColor(Color.BLACK);
        p.drawString("Articulo seleccionado:", 20, 200);
        p.drawString("Valor sin impuesto:", 20, 230);
        p.drawString("Impuesto:", 20, 260);
        p.drawString("Peso:", 20, 290);
        p.drawString("Monto:", 20, 340);
        font = new Font("Fac", Font.PLAIN, 96);
        p.setFont(font);
        p.setColor(Color.blue);
        p.drawString("₡", 330, 130);
    }

}
