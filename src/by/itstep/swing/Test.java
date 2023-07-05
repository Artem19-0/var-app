package by.itstep.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("My App");

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(300, 400);

        frame.setLayout(null);//помогает нам установить координаты кнопки



        JButton button = new JButton();
        button.setText("Push me");
        button.setSize(110,20);//размер кнопки

        frame.add(button);
        button.setLocation(40, 40);//координаты кнопки




        JLabel label = new JLabel("Name:");
        JTextField field = new JTextField();
        label.setBounds(40 , 65 , 120 , 20);//
        field.setBounds(40 , 90, 120 , 20);//

        frame.add(label);
        frame.add(field);


        JLabel helloLabl = new JLabel("");
        helloLabl.setBounds(40 , 120 , 200 , 20);
        frame.add(helloLabl);



        frame.setVisible(true);




        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new Date() + ": click");
                String name = field.getText();
                System.out.println("Hello " + name);

                helloLabl.setText("Hello " + name);

            }
        });






    }

}
