/* Задание на практическую работу №9
   В задании из практической работы №8 добавить кнопку, в результате обработки нажатия события нажатия на которую, 
   генерируются случайным образом различные фигуры из задания на эту практическую работу */

package Java_task_9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

// App class
class MyApp extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String background_image_path;
    String animation_images_path = "Java_task_8/frames/";
    int method;

    // Init
    MyApp() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // setBackground(Color.BLACK);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;

        // Btn "Start animation"
        Button btn = new Button("Start animation");
        btn.setSize(200, 100);
        btn.setLocation(0, 0);
        btn.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    method = 1;
                    setTitle("Animation");

                    // Update window
                    setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
                    setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
                }
            }
        );
        add(btn);

        // Btn spawn one random shape
        Button btn2 = new Button("Spawn one random shape");
        btn2.setSize(200, 50);
        btn2.setLocation(0, 100);
        btn2.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    method = 2;

                    // Update window
                    setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
                    setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
                }
            }
        );
        add(btn2);
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    void set_animation_images_path(String path) {
        this.animation_images_path = path;
    }

    // Paint method
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);

        switch (this.method) {
            case 0:
                random_shapes_paint(50, g);
                break;

            case 1:
                animate(this.animation_images_path, g);
                break;

            case 2:
                random_shapes_paint(1, g);
                break;

            default:
                break;
        }
    }

    // Random shapes paint methid
    void random_shapes_paint(int shapes, Graphics2D g) {
        for (int i = 0; i < shapes; i++) {
            int choice = (int) (Math.random() * 7);

            switch (choice) {

                // Oval
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200));
                    break;

                // Rect
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200));
                    break;

                // Line
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawLine(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * WINDOW_HEIGHT));
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
                            (int) (Math.random() * 360));
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
                            (int) (Math.random() * 200));
                    break;

                // Circle
                case 6:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            100,
                            100);
                    break;

                default:
                    break;
            }
        }
    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    // Start app
    public static void main(String[] args) {
        MyApp app = new MyApp();
        if (args.length == 1) {
            app.set_background_image_path(args[0]);
        } else if (args.length == 2) {
            app.set_background_image_path(args[0]);
            app.set_animation_images_path(args[1]);
        } else {
            System.out.println("[!] Background image path is empty");
        }
        /* "C:/Users/moran/Desktop/MIREA/Mirea-Java-Tasks/Java_task_8/background.jpg" */
    }
}