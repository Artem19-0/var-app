package by.itstep.swing;

import by.itstep.MathUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GuessNumberJFrame extends JFrame {
    private int x = 0;
    private  int attempts = 0;

    public GuessNumberJFrame(){


        setTitle("Guess Number JFrame");
        setLayout(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700 , 700);

        JButton button = new JButton();
        button.setText("Generate");
        button.setSize(180,40);
        add(button);
        button.setLocation(40,300);

        JButton button1 = new JButton();
        button1.setText("GO!");
        button1.setSize(180,40);
        add(button1);
        button1.setLocation(300,300);
        button1.setVisible(false);




        JLabel lbl = new JLabel("from");
        JTextField field = new JTextField("0");
        lbl.setBounds(40,65,120,20);
        field.setBounds(40,90,100,20);
        add(lbl);
        add(field);


        JLabel lbl1 = new JLabel("to");
        JTextField field1 = new JTextField("10");
        lbl1.setBounds(220,65,120,20);
        field1.setBounds(220,90,100,20);
        add(lbl1);
        add(field1);


        JLabel lbl2 = new JLabel("Ваш ответ");
        JTextField field2 = new JTextField();
        lbl2.setBounds(300,200,120,20);
        field2.setBounds(300,220,100,20);
        add(lbl2);
        add(field2);
        lbl2.setVisible(false);
        field2.setVisible(false);


        JLabel lbl4 = new JLabel("количесво попыток");
        JTextField field4 = new JTextField("3");
        lbl4.setBounds(420,65,120,20);
        field4.setBounds(420,90,100,20);
        add(lbl4);
        add(field4);


        setVisible(true);






        JLabel lbl3 = new JLabel("");
        lbl3.setBounds(30 , 200, 300,30);
        add(lbl3);


        JButton restart = new JButton();
        restart.setText("Play again");
        restart.setSize(180,40);
        add(restart);
        restart.setLocation(70,300);
        restart.setVisible(false);





        button.addActionListener(new AbstractAction() {//нажатие кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
              int from = Integer.parseInt( field.getText()); //"20" -> 20
              int to = Integer.parseInt(field1.getText());
              attempts = Integer.parseInt(field4.getText());
              x = MathUtil.random(from , to);


                System.out.println(x);
                field.setEditable(false);//после нажатия кнопки, поля с цифрами нельзя исправить
                field1.setEditable(false);
                field4.setEditable(false);
                button.setVisible(false);//проподает кнопка

                lbl3.setText("Random value was generated!Try to guess!");
                button1.setVisible(true);
                lbl2.setVisible(true);
                field2.setVisible(true);



            }
        });



        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(attempts > 0 ){
                    int userX = Integer.parseInt( field2.getText());
                    if(x == userX){
                        lbl3.setText("YOU WON! =}");
                        button1.setEnabled(false);
                        field2.setEditable(false);
                        restart.setVisible(true);

                    }else {
                        if(attempts == 1 ) {
                            lbl3.setText("YOU LOSE! ={");
                            button1.setEnabled(false);//оключает кнопку и делает её серой
                            field2.setEditable(false);
                            restart.setVisible(true);
                        }else {
                            //still have attempts
                            lbl3.setText("Your number is " + (userX > x ? "greater " : "less "));//тернальный оператор
                        }
                    }
                }

               attempts--;
                field4.setText(attempts + "");

                restart.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        field.setEditable(true);
                        field.setText("0");
                        field1.setEditable(true);
                        field1.setText("10");
                        field4.setEditable(true);
                        field4.setText("3");
                        button.setVisible(true);


                        restart.setVisible(false);

                        lbl3.setText("");
                        field2.setVisible(false);


                        button1.setVisible(false);
                        button1.setEnabled(true);
                        restart.setVisible(false);

                        field2.setEditable(true);
                        lbl2.setVisible(false);
                    }
                });
                setVisible(true);
            }



        });











    }
}



class Player {
    public static void main(String[] args) {
        GuessNumberJFrame game = new GuessNumberJFrame();


    }
}
