/* Задание на практическую работу №8
  1.Создать окно, нарисовать в нем 20 случайных фигур, случайного цвета. Классы фигур должны наследоваться от абстрактного класса Shape, в котором описаны свойства фигуры: цвет, позиция.
  2. Создать окно, отобразить в нем картинку, путь к которой указан в аргументах командной строки.
  3. Создать окно, реализовать анимацию, с помощью картинки, состоящей из нескольких кадров. */

package Java_task_8;

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

// App class
class MyApp extends JFrame {
    JLabel lbl = new JLabel("");
    int WINDOW_WIDTH = 1000;
    int WINDOW_HEIGHT = 1000;

    // Init
    MyApp() {
        super("My app");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.white);
    }

    // Paint method
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        random_shapes_paint(20, g);
    }

    // Random shapes paint methid
    void random_shapes_paint(int max_shapes, Graphics2D g) {
        for (int i = 0; i < max_shapes; i++) {
            int choice = (int) (Math.random() * 7);

            switch (choice) {
                
                // Oval
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                        (int) (Math.random() * WINDOW_WIDTH),
                        (int) (Math.random() * WINDOW_HEIGHT),
                        (int) (Math.random() * 200),
                        (int) (Math.random() * 200)
                    );
                    break;
                
                // Rect
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                        (int) (Math.random() * WINDOW_WIDTH),
                        (int) (Math.random() * WINDOW_HEIGHT),
                        (int) (Math.random() * 200),
                        (int) (Math.random() * 200)
                    );
                    break;

                // Line
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawLine(
                        (int) (Math.random() * WINDOW_WIDTH), 
                        (int) (Math.random() * WINDOW_WIDTH), 
                        (int) (Math.random() * WINDOW_HEIGHT), 
                        (int) (Math.random() * WINDOW_HEIGHT)
                    );
                    break;

                // Arc
                case 4:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawArc(
                        (int) (Math.random() * WINDOW_WIDTH), 
                        (int) (Math.random() * WINDOW_HEIGHT), 
                        (int) (Math.random() * WINDOW_WIDTH), 
                        (int) (Math.random() * WINDOW_HEIGHT),
                        (int) (Math.random() * 360), 
                        (int) (Math.random() * 360)
                    );
                    break;

                // Rounded rect
                case 5:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                        (int) (Math.random() * WINDOW_WIDTH), 
                        (int) (Math.random() * WINDOW_HEIGHT), 
                        (int) (Math.random() * 200),
                        (int) (Math.random() * 200), 
                        (int) (Math.random() * 200),
                        (int) (Math.random() * 200)
                    );
                    break;

                // Circle
                case 6:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                        (int) (Math.random() * WINDOW_WIDTH),
                        (int) (Math.random() * WINDOW_HEIGHT),
                        100,
                        100
                    );
                    break;

                default:
                    break;
            }
        }
    }
    
    // Start app
    public static void main(String[] args) {
        new MyApp();
    }
}