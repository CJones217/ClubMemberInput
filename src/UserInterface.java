import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class UserInterface extends JFrame implements ActionListener
{

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel panel2 = new JPanel();
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
    private JButton buttonSubmit= new JButton("submit");

    private JLabel panel2HelloLabel = new JLabel();
    private JButton buttonLogout=new JButton("logout");

    private String lucEmail="";
    private String name="";
    private String id="";
    private String gradYear="";
    private String major="";
    private static dojoUser user1;



    public UserInterface(){
        frame = new JFrame("LUC NO Registration");
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        setFrameAndPanel();
        addAllActionListeners();
    }
    public void addAllActionListeners()
    {
        buttonSubmit.addActionListener(this);
        buttonLogout.addActionListener(this);
        buttonSignUp.addActionListener(this);
    }


    public void setFrameAndPanel()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500); // 390,400
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        loginPanel();
    }
    public void loginPanel()
    {
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

    public void removePanel1()
    {
        frame.getContentPane().remove(panel);
        frame.repaint();
        frame.validate();
    }

    public void removePanel2()
    {
        frame.getContentPane().remove(panel2);
        frame.repaint();
        frame.validate();
    }
    public void removeLoginPanel()
    {
        frame.getContentPane().remove(loginPanel);
        frame.repaint();
        frame.validate();
    }

    public void setFrameAndPanel2()
    {
        panel2HelloLabel.setText("Hello "+textField1.getText());
        panel2.add(panel2HelloLabel);
        panel2.add(buttonLogout);
        frame.getContentPane().add(panel2);
        frame.repaint();
        frame.validate();
    }


    public void actionPerformed(ActionEvent event)
    {

         if(event.getSource()==buttonSubmit)
        {
            pressSubmit();
        }
        else if(event.getSource()==buttonLogout)
        {
            removePanel2();
            loginPanel();
            frame.repaint();
            frame.validate();
        }

        else if(event.getSource()==buttonSignUp)
        {
            pressSubmit();
        }
    }
    public void pressLogin()
    {
        if(UserDataFile.isAnAccount(textField1.getText(),textField2.getText())==true)
        {
            removeLoginPanel();
            setFrameAndPanel2();
        }
        else
        {
            loginLabel.setText("error finding user");
        }

    }

    public void pressSubmit(){
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

    public void resetFieldsAndButtons()
    {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField8.setText("");
    }

    public static dojoUser returnUser()
    {
        return user1;
    }



}
