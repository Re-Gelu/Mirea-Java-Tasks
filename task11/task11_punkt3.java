import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task11_punkt3 {
    static class punkt3 extends JFrame {
        punkt3(String s) {

            super(s);
            setSize(600, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            String info = "Name:" + "<br>" +
                    "Phone:" + "<br>";


            JOptionPane.showMessageDialog(task11_punkt3.punkt3.this, "Я заменил шрифт MS Sans Serif на Broadway, так как сильного отличия MS Sans Serif от TimesNewRoman нету" + "\n" + "                                                                                           " + "Нажми ОК");
            JRadioButton blue = new JRadioButton("Синий");
            blue.setBounds(110, 20, 80, 20);
            blue.setForeground(Color.BLUE);
            add(blue);
            JRadioButton red = new JRadioButton("Красный");
            red.setBounds(200, 20, 80, 20);

            red.setForeground(Color.RED);
            add(red);
            JRadioButton black = new JRadioButton("Чёрный");
            black.setBounds(290, 20, 80, 20);

            black.setForeground(Color.BLACK);
            add(black);
            ButtonGroup bg = new ButtonGroup();
            bg.add(blue);
            bg.add(red);
            bg.add(black);
            JRadioButton times = new JRadioButton("TimesNewRoman");
            times.setBounds(30, 60, 150, 20);
            times.setFont(new Font("TimesNewRoman", Font.PLAIN, 14));
            add(times);
            JRadioButton cn = new JRadioButton("Broadway");
            cn.setBounds(200, 60, 120, 20);
            cn.setFont(new Font("Broadway", Font.PLAIN, 14));
            add(cn);
            JRadioButton cg = new JRadioButton("Courier New");
            cg.setBounds(350, 60, 120, 20);
            cg.setFont(new Font("Courier New", Font.PLAIN, 14));
            add(cg);
            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(times);
            bg2.add(cn);
            bg2.add(cg);

            setLayout(new FlowLayout());
            JTextArea textArea = new JTextArea("     ");

            textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 20));
            add(textArea);

            cg.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setFont(cg.getFont());
                }
            });
            cn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setFont(cn.getFont());
                }
            });
            times.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setFont(times.getFont());
                }
            });





            red.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setForeground(Color.RED);
                }
            }));
            blue.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setForeground(Color.BLUE);
                }
            });
            black.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setForeground(Color.BLACK);
                }
            });



            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new task11_punkt3.punkt3("Go step by step");
    }
}
