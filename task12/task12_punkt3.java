import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class task12_punkt3 extends JFrame implements ActionListener {
    Image planet = new ImageIcon("src/planet.jpg").getImage();

    JComboBox comboBox;
    JLabel label;




    // OverlayLayout

    //task12_punkt1 task = task12_punkt1;

    task12_punkt3() {

        //JFrame jf = new JFrame("TEST");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());

        ArrayList<String> arr = new ArrayList<String>();

        for (task12_punkt1 task : task12_punkt1.values()) {
            arr.add(task.name());
        }
        String[] array = arr.toArray(new String[arr.size()]);


        comboBox = new JComboBox(array);
        label = new JLabel();

        this.add(label);
        this.pack();
        this.setSize(600, 600);
        this.setVisible(true);
        comboBox.addActionListener(this);
        this.add(comboBox);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            JComboBox cb = (JComboBox)e.getSource();
            String msg = (String)cb.getSelectedItem();

            for (task12_punkt1 task : task12_punkt1.values()) {
                if (msg.equals(task.name())) {

                    label.setText(task.toString());
                    

                }


            }
        }


    }

    public static void main(String[] args) {
       new task12_punkt3();
    }
}
