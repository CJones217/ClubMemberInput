package ClubMemberInput;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class UserInterface extends JFrame implements ActionListener {

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel loginPanel= new JPanel();

    private JLabel textLabel1 = new JLabel("Type in your loyola email:");
    private JTextField textField1= new JTextField(20);
    private JLabel textLabel2 = new JLabel("Type in your first and last name:");
    private JTextField textField2= new JTextField(20);
    private JLabel textLabel3 = new JLabel("Type in your graduation year :");
    private JTextField textField3= new JTextField(20);
    private JLabel textLabel4 = new JLabel("Type in your major:");
    private JTextField textField4= new JTextField(20);
    private JLabel textLabel8 = new JLabel("Type in your loyola id:");
    private JTextField textField8= new JTextField(20);
    private JLabel labelSpace = new JLabel("                         ");
    private JLabel loginLabel= new JLabel("Welcome!");
    private JLabel needAcc=new JLabel("All finished?");

    private JButton buttonSignUp = new JButton("Click here");

    private JLabel panel2HelloLabel = new JLabel();

    private String lucEmail="";
    private String name="";
    private String id="";
    private String gradYear="";
    private String major="";
    private static dojoUser user1;



    public UserInterface() {
        frame = new JFrame("LUC NO Registration");
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        setFrameAndPanel();
        addAllActionListeners();
    }

    private void addAllActionListeners() {
        buttonSignUp.addActionListener(this);
    }


    private void setFrameAndPanel() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500); // 390,400
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        loginPanel();
        frame.setVisible(true);
    }

    private void loginPanel() {
        frame.getContentPane().add(loginPanel);
        loginPanel.add(loginLabel);
        loginPanel.add(textLabel1);
        loginPanel.add(textField1);
        loginPanel.add(textLabel2);
        loginPanel.add(textField2);
        loginPanel.add(textLabel8);
        loginPanel.add(textField8);
        loginPanel.add(textLabel3);
        loginPanel.add(textField3);
        loginPanel.add(labelSpace);
        loginPanel.add(textLabel4);
        loginPanel.add(textField4);
        loginPanel.add(labelSpace);
        loginPanel.add(needAcc);
        loginPanel.add(buttonSignUp);
        resetFieldsAndButtons();
    }

    private void removePanel1() {
        frame.getContentPane().remove(panel);
        frame.repaint();
        frame.validate();
    }

    private void removeLoginPanel() {
        frame.getContentPane().remove(loginPanel);
        frame.repaint();
        frame.validate();
    }

    public void actionPerformed(ActionEvent event) {

        if(event.getSource()==buttonSignUp) {
            pressSubmit();
        }
    }

    private void pressSubmit() {
        lucEmail=textField1.getText();
        name=textField2.getText();
        gradYear=textField3.getText();
        id=textField8.getText();
        major=textField4.getText();
        user1 =new dojoUser(lucEmail,name,id,gradYear,major);

        UserDataFile.printUser();
        removePanel1();
        setFrameAndPanel();
    }

    private void resetFieldsAndButtons() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField8.setText("");
    }

    public static dojoUser returnUser() {
        return user1;
    }



}
