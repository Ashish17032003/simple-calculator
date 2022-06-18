// Simple UI Based Calculator using swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator
{
    private JPanel myPanel;
    private JTextField display;
    private JPanel keysPanel;
    private JButton ACButton;
    private JButton backspaceButton;
    private JButton changeSignButton;
    private JButton addButton;
    private JButton doubleZeroButton;
    private JButton zeroButton;
    private JButton pointButton;
    private JButton resultButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton multiplyButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton minusButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton divideButton;

    // to store the operator and the operands
    private String opA;
    private String opB;
    private String op;


    public Calculator()
    {
        /*
        On ACButton, we are calling a method which takes object as a parameter
        we are creating an instance of an ActionListener class { new ActionListener() } , we are also overriding
        the method in that immediately.

        Take ActionListener
        Override the method according to how you specify
        After overriding that method, create an instance of that class and pass it to addActionListener.
        */

        ACButton.addActionListener (new ActionListener()  // Anonymous Class.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText(""); // all clear blanks out the screen
            }
        });

        oneButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "1");
            }
        });

        twoButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "2");
            }
        });

        threeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "3");
            }
        });

        fourButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "4");
            }
        });

        fiveButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "5");
            }
        });

        sixButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "6");
            }
        });

        sevenButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "7");
            }
        });

        eightButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "8");
            }
        });

        nineButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "7");
            }
        });

        zeroButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "0");
            }
        });

        doubleZeroButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText( display.getText() + "00");
            }
        });

        backspaceButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String disp = display.getText();
                if( !disp.isEmpty() )
                {
                    disp = disp.substring( 0, disp.length() - 1 );
                }
                display.setText( disp );
            }
        });


        changeSignButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String disp = display.getText();
                if (!disp.isEmpty())
                {
                    if (disp.contains(".")) // if it contains a decimal, parse it as a double
                    {
                        double doubleDisp = Double.parseDouble(disp);
                        doubleDisp = -doubleDisp; // to change the sign
                        display.setText( Double.toString(doubleDisp) );
                    }

                    else //do the same for integers
                    {
                        int integerDisp = Integer.parseInt(disp);
                        integerDisp = -integerDisp; // to change the sign
                        display.setText( Integer.toString(integerDisp) );
                    }
                }
            }
        });

        pointButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String disp = display.getText();
                if (!disp.contains("."))  //should do nothing if a point is already there
                {
                    disp = disp + ".";
                    display.setText(disp);
                }
            }
        });

        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String disp = display.getText();
                // it should do nothing if somebody clicks + and nothing is present on the screen

                if (!disp.isEmpty())
                {
                    opA = disp; // stores the value in opA variable
                    op = "+"; //stores + as the operator
                    display.setText(""); //clears the screen
                }
            }
        });

        minusButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String disp = display.getText();
                // it should do nothing if somebody clicks + and nothing is present on the screen

                if (!disp.isEmpty())
                {
                    opA = disp; // stores the value in opA variable
                    op = "-"; //stores + as the operator
                    display.setText(""); //clears the screen
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String disp = display.getText();
                // it should do nothing if somebody clicks + and nothing is present on the screen

                if (!disp.isEmpty())
                {
                    opA = disp; // stores the value in opA variable
                    op = "*"; //stores + as the operator
                    display.setText(""); //clears the screen
                }
            }
        });

        divideButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String disp = display.getText();
                // it should do nothing if somebody clicks + and nothing is present on the screen

                if (!disp.isEmpty())
                {
                    opA = disp; // stores the first operand value in opA variable
                    op = "/"; //stores + as the operator
                    display.setText(""); //clears the screen
                }
            }
        });

        resultButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String disp = display.getText();
                 if (!disp.isEmpty() && !op.isEmpty()) //display and operator shouldn't be empty
                 {
                     opB = disp; // stores the second operand
                     double a = Double.parseDouble(opA);
                     double b = Double.parseDouble(opB);
                     String result = "";
                     if (op.equals("+"))
                     {
                         result = Double.toString(a + b);
                     } else if (op.equals("-")) {
                         result = Double.toString(a - b);
                     } else if (op.equals("*")) {
                         result = Double.toString(a * b);
                     } else if (op.equals("/")) {
                         result = Double.toString(a / b);
                     }
                     display.setText(result);
                 }
            }
        });

    }

    public JPanel getRoot()
    {
        return myPanel;
    }

    public static void main(String[] args)
    {
        //JFrame is GUI window to add components to

        JFrame frame = new JFrame("Calculator"); //creates a frame with title as Calculator
        frame.setContentPane( (new Calculator()).getRoot() ); //allows you to replace the content panel of the JFrame
        // so basically when you click to close it minimises, to make sure it's closed we have to do this
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.pack();
        frame.setVisible(true); // to make it visible, we have to set the visibility to true
        ImageIcon icon = new ImageIcon("C:\\Users\\ashis\\IdeaProjects\\Calculator\\images\\icon.png");
        frame.setIconImage(icon.getImage()); //change icon of frame
    }

}