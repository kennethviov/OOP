package mypackage;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

class CalculatorPanel extends JPanel implements ActionListener{

    JFrame frame;

    JPanel overpanel;
    JTextField mainTextField, expressionTextField;
    JButton[] numberButtons = new JButton[10];
    JButton[] actionButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton, bakButton;

    Font defaultFont = new Font("Arial", Font.BOLD, 25);

    Color backColor = new Color(230,230,230);
    Color foreColor = new Color(55,58,64);

    Double num1, num2, result = 0.0;
    char operator;

    boolean ispressed = false;

    public CalculatorPanel(JFrame frame) {

        this.frame = frame;
        initComponents();

    }

    private void initComponents() {

        setPreferredSize(new Dimension(320, 500));
        setBackground(new Color(238,238,238));
        setLayout(null);

        mainTextField = new JTextField();
        mainTextField.setBounds(4,100,312,75);
        mainTextField.setFont(new Font("Arial", Font.BOLD, 50));
        mainTextField.setText("0");
        mainTextField.setHorizontalAlignment(JTextField.RIGHT);
        mainTextField.setCaretColor(getBackground());
        mainTextField.setBorder(BorderFactory.createEmptyBorder());
        mainTextField.setEditable(false);

        expressionTextField = new JTextField();
        expressionTextField.setBounds(4,70,312, 24);
        expressionTextField.setFont(new Font("Arial", Font.PLAIN, 25));
        expressionTextField.setHorizontalAlignment(JTextField.RIGHT);
        expressionTextField.setCaretColor(getBackground());
        expressionTextField.setBorder(BorderFactory.createEmptyBorder());
        expressionTextField.setForeground(new Color(160,160,160));
        expressionTextField.setEditable(false);

        addButton = new JButton("+"); 
        subButton = new JButton("-"); 
        mulButton = new JButton("×"); 
        divButton = new JButton("÷"); 
        decButton = new JButton("."); 
        equButton = new JButton("="); 
        negButton = new JButton("±");
        bakButton = new JButton("←");
        delButton = new JButton("del"); 
        clrButton = new JButton("AC");

        actionButtons[0] = addButton;
        actionButtons[1] = subButton;
        actionButtons[2] = mulButton;
        actionButtons[3] = divButton;
        actionButtons[4] = decButton;
        actionButtons[5] = equButton;
        actionButtons[6] = negButton;
        actionButtons[7] = bakButton;
        actionButtons[8] = delButton;
        actionButtons[9] = clrButton;

        for (int i = 0; i < 10; i++) {
            actionButtons[i].addActionListener(this);
            actionButtons[i].setFocusable(false);
            actionButtons[i].setBorderPainted(true);
            actionButtons[i].setFont(defaultFont);

            if (i != 5) {
                actionButtons[i].setBorder(new LineBorder(new Color(205,205,205)));
                actionButtons[i].setForeground(foreColor);
                actionButtons[i].setBackground(backColor);
            }
        }

        actionButtons[5].setForeground(new Color(238,238,238));
        actionButtons[5].setBackground(new Color(220,95,0));
        actionButtons[5].setBorder(new LineBorder(new Color(154,71,7)));

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(defaultFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(backColor);
            numberButtons[i].setForeground(foreColor);
            numberButtons[i].setBorderPainted(true);
            numberButtons[i].setBorder(new LineBorder(new Color(205,205,205)));
        }

        overpanel = new JPanel();
        overpanel.setBounds(4,180,312,316);
        overpanel.setLayout(new GridLayout(5,4,2,2));

        overpanel.add(bakButton);
        overpanel.add(clrButton);
        overpanel.add(delButton);
        overpanel.add(divButton);
        overpanel.add(numberButtons[7]);
        overpanel.add(numberButtons[8]);
        overpanel.add(numberButtons[9]);
        overpanel.add(mulButton);
        overpanel.add(numberButtons[4]);
        overpanel.add(numberButtons[5]);
        overpanel.add(numberButtons[6]);
        overpanel.add(subButton);
        overpanel.add(numberButtons[1]);
        overpanel.add(numberButtons[2]);
        overpanel.add(numberButtons[3]);
        overpanel.add(addButton);
        overpanel.add(negButton);
        overpanel.add(numberButtons[0]);
        overpanel.add(decButton);
        overpanel.add(equButton);

        add(overpanel);
        add(expressionTextField);
        add(mainTextField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // * Action  Buttons

        if (e.getSource() == bakButton) {
            frame.setContentPane(new LogInPanel(frame));
            frame.revalidate();
        }

        if (e.getSource() == clrButton) {
            expressionTextField.setText("");
            mainTextField.setText("0");
            num1 = 0.0;
            num2 = 0.0;
            result = 0.0;
            operator = '\u0000';
        }

        if (e.getSource() == delButton) {
            String fieldtext = mainTextField.getText();
            
            if (fieldtext.equals("0") || fieldtext.length() == 0) {
                mainTextField.setText("0");
            } else {
                mainTextField.setText(formatNumber(fieldtext.substring(0, fieldtext.length() - 1)));
                expressionTextField.setText(expressionTextField.getText().substring(0,expressionTextField.getText().length() - 1));
            }
            
        }

        if (e.getSource() == negButton) {
            String fieldtext = mainTextField.getText();

            if (fieldtext.charAt(0) == '-') {
                mainTextField.setText(fieldtext.substring(1, fieldtext.length()));
            } else {
                mainTextField.setText("-" + fieldtext);
            }

            String str = expressionTextField.getText();
            expressionTextField.setText(str.substring(0, str.length() - fieldtext.length()) + "(-" + fieldtext + ")");
        }

        if (e.getSource() == decButton) {
            if (!mainTextField.getText().contains(".")) {
                mainTextField.setText(mainTextField.getText().concat("."));
                expressionTextField.setText(expressionTextField.getText().concat("."));
            }
        }



        // *Operation Buttons

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {

                if (ispressed) {
                    clrButton.doClick();
                    ispressed = false;
                }

                expressionTextField.setText(expressionTextField.getText() + String.valueOf(i));
                
                if (mainTextField.getText().equals("0")) {
                    mainTextField.setText(String.valueOf(i));
                } else {
                    mainTextField.setText(formatNumber(mainTextField.getText().concat(String.valueOf(i))));

                }
            }
        }

        if(e.getSource()==addButton || e.getSource()==subButton || e.getSource()==mulButton || e.getSource()==divButton) {
            ispressed = false;

            if (operator != '\u0000') {
                num2 = Double.parseDouble(deformatNumber(mainTextField.getText()));
            } else {
                num1 = Double.parseDouble(deformatNumber(mainTextField.getText()));
            }
            
            char expressionOperator = ' ';

            if (e.getSource() == addButton) {
                operator = '+';
                expressionOperator = operator;
            }
            if (e.getSource() == subButton) {
                operator = '-';
                expressionOperator = operator;
            }
            if (e.getSource() == mulButton) {
                operator = '*';
                expressionOperator = '×';
            }
            if (e.getSource() == divButton) {
                operator = '/';
                expressionOperator = '÷';
            }
        
            mainTextField.setText("0");
            expressionTextField.setText(validateString(expressionTextField.getText()) + expressionOperator);
        }


        // *Equal Button

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(deformatNumber(mainTextField.getText()));
            calculateResult();
            operator = '\u0000';
            ispressed = true;
        }
    }

    private void calculateResult() {
        if (operator == '/' && num2 == 0) {
            mainTextField.setText("Error");
            num1 = 0.0;
        } else {
            switch (operator) {
                case '+':
                    num1 += num2;
                    break;
                case '-':
                    num1 -= num2;
                    break;
                case '*':
                    num1 *= num2;
                    break;
                case '/':
                    num1 /= num2;
                    break;
            }
        }
    
        if (num1 == num1.intValue()) {
            mainTextField.setText(formatNumber(String.valueOf(num1.intValue())));
        } else {
            mainTextField.setText(formatNumber(String.valueOf(num1)));
        }
    
        operator = '\u0000';
    }

    private String formatNumber(String number) {
        try {
            number = number.replace(",", "");
            double num = Double.parseDouble(number);
    
            DecimalFormat formatter;
            if (num == (long) num) {
                formatter = new DecimalFormat("#,###");
            } else {
                formatter = new DecimalFormat("#,###.######");
            }
            return formatter.format(num);
        } catch (NumberFormatException e) {
            return number;
        }
    }
    
    private String deformatNumber(String number) {
        return number.replace(",", "");
    }

    private String validateString(String str) {
        
        if (isOperator(str.charAt(str.length() - 1))) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '×' || c == '÷';
    }
    
}
