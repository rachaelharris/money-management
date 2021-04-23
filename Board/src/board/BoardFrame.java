import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class BoardFrame extends JFrame implements ActionListener{
  JFrame welcome = new JFrame(); //first frame, introduces program
  JFrame level = new JFrame(); //second frame, asks the user to indicate their level -- parent or child player
  JFrame Parents = new JFrame(); //parent home page
  JFrame Child = new JFrame(); //child player home page
  JFrame Status = new JFrame(); //child status checker
  JFrame Global = new JFrame(); //global leadership
  JFrame ParentSettings = new JFrame(); //parent settings page
  JFrame Transaction = new JFrame(); //view transactions from parents point of view
  JFrame DepositMoney = new JFrame(); //depisot money into child's account
  JButton Home = new JButton("Home"); //home view button for child
  JButton StatusChecker = new JButton("Check Status"); //check score and transactions for child
  JButton GlobalStatus = new JButton("Global"); //check global ranking for child
  JButton HomeView = new JButton("Home View"); //home view button for parent
  JButton Transactions = new JButton("Check Transactions"); //check transaction log from parents point of view
  JButton ParentalSettings = new JButton("Parent Settings"); //change settings from parental pov

  BoardFrame() {
    welcome.setTitle("Money Management");
    JLabel beginning = new JLabel("Welcome to the Money Management Game");
    welcome.add(beginning, BorderLayout.CENTER);
    String text = "This program is designed to encourage financial responsibility on behalf of an adolescent while creating an environment for parents and children to collaborate together. The game will feature a series of events, similar to that of popular board games. As a parent, you can encourage your child, add money to their account, and monitor their progress. As a child player, you can choose to deposit money, spend it, and check your progres! Let's get started!";
    JTextArea textArea = new JTextArea(2, 40);
    textArea.setText(text);
    textArea.setWrapStyleWord(true);
    textArea.setLineWrap(true);
    textArea.setOpaque(false);
    textArea.setEditable(false);
    textArea.setFocusable(false);
    welcome.add(textArea, BorderLayout.CENTER);
    JButton button = new JButton("Get Started!");
    button.setBounds(300, 150, 80, 80);
    welcome.add(button);
    button.addActionListener(this);
    welcome.setSize(500, 500);
    welcome.setLayout(new FlowLayout());
    welcome.setVisible(true);
    welcome.setResizable(false);
    welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    level.setTitle("Money Management");
    JLabel label = new JLabel("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Are you a parent or a child player?");
    level.add(label);
    JButton Parent_Option = new JButton("Parent");
    level.add(Parent_Option);
    Parent_Option.addActionListener(this);
    JButton Child_Option = new JButton("Child Player");
    level.add(Child_Option);
    Child_Option.addActionListener(this);
    level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    level.setSize(500, 500);
    level.setLayout(new GridLayout(4,2));
    level.setResizable(false);

    Parents.setTitle("Money Management");
    JLabel ParentView = new JLabel("Parent View");
    ParentView.setText("Parent View");
    Parents.add(ParentView);
    //Parents can deposit money into the child's account, should they so choose. This can be in the form of an "allowance" or as a gift. This is giving a little bit of financial dependency (but the child is literally a dependent), but it also allows the parents to use positive reinforcement as a training mechanism.
    JButton Deposit = new JButton("Deposit");
    Deposit.setText("Deposit");
    Parents.add(Deposit);
    Deposit.addActionListener(this);
    JButton Message = new JButton("Message");
    //Parents can message their child to show support, give a hint, or discuss financial reponsibility with them.
    Message.setText("Message");
    Parents.add(Message);
    Message.addActionListener(this);
    //Parents can add a new parent or guardian to view the child's progress
    JButton AddParent = new JButton("Add a new Parent");
    AddParent.setText("Add a new Parent");
    Parents.add(AddParent);
    AddParent.addActionListener(this);
    //Adding homeview button from other class
    Parents.add(HomeView);
    HomeView.addActionListener(this);
    //Adding transactions button from other class
    Parents.add(Transactions);
    Transactions.addActionListener(this);
    //Adding settings button from other class
    Parents.add(ParentalSettings);
    ParentalSettings.addActionListener(this);
    Parents.setSize(500, 500);
    Parents.setLayout(new GridLayout(4,2));
    Parents.setResizable(false);
    Parents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Child.setTitle("Money Management");
    JLabel ChildVeiw = new JLabel("Child View");
    Child.add(ChildVeiw);
    JButton Roll = new JButton();
    //To play the game, children will roll a dice to give them different scenarios to encounter
    Roll.setText("Roll");
    Child.add(Roll);
    Roll.addActionListener(this);
    //Adding home button from other class
    Child.add(Home);
    Home.addActionListener(this);
    //Adding global status checker button from other class
    Child.add(GlobalStatus);
    GlobalStatus.addActionListener(this);
    //Adding status checker button from other class
    Child.add(StatusChecker);
    StatusChecker.addActionListener(this);
    Child.setSize(500, 500);
    Child.setLayout(new GridLayout(4,2));
    Child.setResizable(false);
    Child.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Global.setTitle("Money Management");
    JLabel GlobalLabel = new JLabel("Global");
    Global.add(GlobalLabel);
    JLabel GlobalText = new JLabel("Top player: \tName: Rachael Harris \tSavings: $10,000 \tScore: 4,321");
    Global.add(GlobalText);
    //@ front end team <3 add more / make this look nice
    // add more top players if you can (these can be hard coded)
    Global.setSize(500, 500);
    Global.setLayout(new GridLayout(4,2));
    Global.setResizable(false);
    Global.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Transaction.setTitle("Money Management");
    JLabel TransactionLabel = new JLabel("Transaction");
    Transaction.add(TransactionLabel);
    JLabel TransactionText = new JLabel("Date: 4/21 \tWithdrawl \nAmount: \t$500");
    Transaction.add(TransactionText);
    //@ front end team <3 add more / make this look nice
    //also, try to add more transactions if you can (these can be hard coded)
    Transaction.setSize(500, 500);
    Transaction.setLayout(new GridLayout(4,2));
    Transaction.setResizable(false);
    Transaction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    DepositMoney.setTitle("Money Management");
    JLabel DepositLabel = new JLabel("Deposit Money");
    DepositMoney.add(DepositLabel);
    JLabel DepositText = new JLabel("Date: 4/21 \tDeposit \nAmount: \t$100");
    DepositMoney.add(DepositText);
    //@ front end team <3 add more / make this look nice
    //also, try to add more recent deposit statements if you can (these can be hard coded)
    DepositMoney.setSize(500, 500);
    DepositMoney.setLayout(new GridLayout(4,2));
    DepositMoney.setResizable(false);
    DepositMoney.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Status.setTitle("Money Management");
    JLabel StatusLabel = new JLabel("Status");
    Status.add(StatusLabel);
    JLabel StatusText = new JLabel("Name: [insert child name] \tScore: [insert child score]");
    Status.add(StatusText);
    //@ front end team <3 add more / make this look nice
    //also, try to add recent transactions if you can (these can be hard coded)
    Status.setSize(500, 500);
    Status.setLayout(new GridLayout(4,2));
    Status.setResizable(false);
    Status.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ParentSettings.setTitle("Money Management");
    JLabel SettingsLabel = new JLabel("Parent Settings");
    ParentSettings.add(SettingsLabel);
    JButton NameChange = new JButton();
    NameChange.setText("Name Change");
    ParentSettings.add(NameChange);
    NameChange.addActionListener(this);
    JButton PlanChange = new JButton();
    PlanChange.setText("Plan Change");
    ParentSettings.add(PlanChange);
    PlanChange.addActionListener(this);
    JButton AddInfo = new JButton();
    AddInfo.setText("Add Bank Information");
    ParentSettings.add(AddInfo);
    AddInfo.addActionListener(this);
    JButton FAQ = new JButton();
    FAQ.setText("FAQ");
    ParentSettings.add(FAQ);
    FAQ.addActionListener(this);
    JButton About = new JButton();
    About.setText("About");
    ParentSettings.add(About);
    About.addActionListener(this);
    JButton Contact = new JButton();
    Contact.setText("Contact Us");
    ParentSettings.add(Contact);
    Contact.addActionListener(this);
    ParentSettings.setSize(500, 500);
    ParentSettings.setLayout(new GridLayout(4,2));
    ParentSettings.setResizable(false);
    ParentSettings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent ae) {
      String choice = ae.getActionCommand();
      if (choice.equals("Get Started!")) {
        level.setVisible(true);
        welcome.setVisible(false);
      }

      else if (choice.equals("Parent")) {
         Parents.setVisible(true);
         level.setVisible(false);
      }


      else if (choice.equals("Child Player")) {
        Child.setVisible(true);
        level.setVisible(false);
      }

      else if (choice.equals("Deposit")) {
        DepositMoney.setVisible(true);
        Parents.setVisible(false);
        JOptionPane.showInputDialog("Deposit Amount:");
        DepositMoney.setVisible(false);
        Parents.setVisible(true);
      }

      else if (choice.equals("Message")) {
        Parents.setVisible(false);
        JOptionPane.showInputDialog("Message:");
        Parents.setVisible(true);
      }

      else if (choice.equals("Add a new parent")) {
        Parents.setVisible(false);
        JOptionPane.showInputDialog("Parent Email:");
        Parents.setVisible(true);
      }


      //else if (choice.equals("Settings")) {
        //OneQuestion3.setVisible(true);
        //OneQuestion2.setVisible(false);
      //}

      /*
      else if (choice.equals("True")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 3", JOptionPane.ERROR_MESSAGE);
      }
*/
      }

  public static void main (String[] args) {
    new BoardFrame();
  }
}


/*
https://www.proprofs.com/quiz-school/quizshow.php?title=mte3mzu3oq9ldf&q=3
https://www.guru99.com/java-swing-gui.html
https://www.geeksforgeeks.org/creating-frames-using-swings-java/
https://javatutorial.net/display-text-and-graphics-java-jframe
https://javatutorial.net/java-swing-jframe-layouts
https://javatutorial.net/jframe-buttons-listeners-text-fields
https://stackoverflow.com/questions/5766175/word-wrap-in-jbuttons
https://www.experts-exchange.com/questions/27444198/Linking-two-JFrame-Frames-using-a-JButton.html
https://www.un.org/en/universal-declaration-human-rights/
http://www.coalitionfortheicc.org/news/20160930/what-universal-declaration-human-rights
https://www.weforum.org/agenda/2015/12/10-things-to-know-about-human-rights/
https://www.responsiblebusiness.com/sdg-action/prosperity-news/7-interesting-facts-about-human-rights/
https://www.amnestyusa.org/9-eye-opening-facts-about-the-state-of-human-rights-worldwide/
https://www.equalityhumanrights.com/en/secondary-education-resources/useful-information/understanding-human-rights
*/
