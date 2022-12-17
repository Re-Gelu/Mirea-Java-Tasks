import javax.swing.*;
import java.awt.*;
import java.net.JarURLConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task11_punkt1 {
    public static class App extends JFrame {
        JFrame jf = new JFrame("TEST");
        Image icon = Toolkit.getDefaultToolkit().getImage("src/fon_1.jpg");
        //Image fon = new ImageIcon("src/fon_2.png").getImage();
        JTextField sample = new JTextField();
        int attempt = 0;
        int rndm = 1+(int)(Math.random()*20);
        boolean win = false;


        App() {


            jf.setSize(400, 300);
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setIconImage(icon);

            jf.setLayout(new GridLayout(2, 3));


            sample.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    System.out.println("Дебаг ответа " + rndm);
                    System.out.println("Попытка номер: " + ++attempt);
                    if(Integer.parseInt(sample.getText()) < rndm){
                        JOptionPane.showMessageDialog(App.this,
                                "Ваше число меньше заданного"); }
                    if(Integer.parseInt(sample.getText()) > rndm){
                        JOptionPane.showMessageDialog(App.this,
                                "Ваше число больше заданного"); }
                    if(Integer.parseInt(sample.getText()) == rndm){
                        win = true;
                        JOptionPane.showMessageDialog(App.this,
                                "УРА! ЭТО ОНО!"); }
                    if (win || attempt == 3) {
                        attempt = 0;
                        rndm = 1 + (int) (Math.random() * 20);
                        if (win)
                            JOptionPane.showMessageDialog(App.this,
                                    "Победа! Игра начинается заново");
                        else
                            JOptionPane.showMessageDialog(App.this,
                                    "Потрачено три попытки! Игра начинается заново");
                        win = false;
                    }
                }
            });

            jf.add(sample);
            jf.setVisible(true);
            JOptionPane.showMessageDialog(null,
                    "Игра началась, введите число от 1 до 21");
        }
    }

    public static void main(String[] args) {

        new App();
    }
}
