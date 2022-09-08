/* Задание на практическую работу №8
  1.Создать окно, нарисовать в нем 20 случайных фигур, случайного цвета. Классы фигур должны наследоваться от абстрактного класса Shape, в котором описаны свойства фигуры: цвет, позиция.
  2. Создать окно, отобразить в нем картинку, путь к которой указан в аргументах командной строки.
  3. Создать окно, реализовать анимацию, с помощью картинки, состоящей из нескольких кадров. */

package Java_task_8;

import java.util.*;
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

class MyApp extends JFrame {
    java.util.List<Shape> shapes_array = new ArrayList<Shape>();
    JLabel lbl = new JLabel("");

    MyApp() {
        super("My app");
        setSize(600,600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setPaint(Color.RED);
        gr2d.drawOval((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 200), (int) (Math.random() * 200));
        gr2d.setPaint(Color.YELLOW);
        gr2d.drawRoundRect(200, 50, 200, 300, 200, 400);
        gr2d.setPaint(Color.DARK_GRAY);
        // Прямоугольник с закругленными краями
        gr2d.drawRoundRect(500, 500, 70, 40, 10, 10);
        // Фигура овал
        gr2d.drawOval(300, 50, 300, 300);
        // Заполненный овал
        gr2d.fillOval(100, 50, 200, 300);
    }

    void random_shapes_gen(int max_shapes) {
        for (int i = 0; i < max_shapes; i++) {
            switch ((int)(Math.random() * 2)) {
                case 1:
                    
                    break;
                
                case 2:

                    break;
            
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new MyApp();
    }
}

/* import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class task_8 {
    public static void main(String[] args) {
        paintComponent paint_component = new paintComponent();
        paint_component.setVisible(true);
        paint_component.setLocation(300,300);
    }
}

class paintComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        
        // super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // очищаем фон
        Rectangle r = getBounds();
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, r.width, r.height);

        // выводим надпись и выводим квадрат красного цвет
        g.setColor(Color.red);
        g.drawString("Hello, world", 20, 20);
        g.fillRect(60, 60, 120, 120);
    }
} */

/* public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new DrawShapes();
            }
        });
    } */

/* class DrawShapes extends JFrame {
    
    //private static final long serialVersionUID = 1L;

    DrawShapes() {

        setSize(new Dimension(320, 320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {

            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                for (int i=0; i < 20; i++) {

                }
                g2.drawRect(3, 3, 200, 303);
            }
        };
        setTitle("First AWT app");
        this.getContentPane().add(p);
    }
} */


/*
 * Shape line = new Line2D.Double(3, 3, 303, 303);
 * Shape rect = new Rectangle(3, 3, 303, 303);
 * Shape circle = new Ellipse2D.Double(100, 22, 100, 100);
 * Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 5, 25);
 * g2.draw(line);
 * g2.draw(rect);
 * g2.draw(circle);
 * g2.draw(roundRect);
 */