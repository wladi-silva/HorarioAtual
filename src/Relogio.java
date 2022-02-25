import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Relogio extends JFrame {
    public static void main(String[] args) throws Exception {

        new Relogio().run();

    }

    public static JLabel relogio;
    public static Date data;
    public static SimpleDateFormat format;
    public static String horario;
    public static JPanel painel;
    
    Font grande =  new Font("Arial", Font.BOLD, 150);

    public Relogio() {

        new JFrame();
        setSize(900, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setVisible(true);

        painel = new JPanel();
        painel.setBackground(Color.BLACK);
        add(painel);
        
        relogio = new JLabel();
        
        relogio.setFont(grande);
        relogio.setHorizontalAlignment(SwingConstants.CENTER);
        relogio.setText(horario);
        relogio.setForeground(Color.WHITE);
        
        painel.add(relogio);
    }

    public static String capturaHorario() {
        
        data = new Date();
        format = new SimpleDateFormat("HH:mm:ss");
        horario = format.format(data);

        return horario;
    }

    public void run() throws InterruptedException {
        while (true) {
            
            relogio.setText(capturaHorario());
            painel.add(relogio);
            

            Thread.sleep(1);
        }
    }
}
