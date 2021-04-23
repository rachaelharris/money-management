import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.util.Random;

public class BoardFrame extends JFrame implements ActionListener{
  JFrame welcome = new JFrame(); //first frame, introduces program
  JFrame level = new JFrame(); //second frame, asks the user to indicate their level -- parent or child player
  JFrame Parents = new JFrame(); //parent home page
  JFrame Child = new JFrame(); //child player home page
  JFrame Status = new JFrame(); //child status checker
  JFrame Global = new JFrame(); //global leadership
  JFrame ParentSettings = new JFrame(); //parent settings page
  JFrame Transaction = new JFrame(); //view transactions from parents point of view
  JFrame AboutUs = new JFrame(); //frame for the about us section
  JButton ChangeView = new JButton("Change POV"); //button to switch from parent to child pov
  JButton ChangePov = new JButton("Change View"); //button to switch from child to parent pov
  JButton StatusChecker = new JButton("Check Status"); //check score and transactions for child
  JButton MessageChecker = new JButton("Check Messages"); //check status of messages from parent to child from child's pov.
  JButton GlobalStatus = new JButton("Global"); //check global ranking for child
  JButton Transactions = new JButton("Check Transactions"); //check transaction log from parents point of view
  JButton HomeView = new JButton("Home"); //extra home button for certain frames on parent pov
  JButton Back = new JButton("Back"); //extra back button for parental settings page
  JButton Previous = new JButton("Previous"); //extra back button for About Page
  JButton PreviousView = new JButton("Home Page"); //extra back button for check status page
  JButton BackAgain = new JButton("Previous Page"); //extra back button for Global page
  JButton ParentalSettings = new JButton("Parent Settings"); //change settings from parental pov
  public int savingsAccount = 0;
  public double scoreStatus = (savingsAccount / 100) * 0.1234;
  public String message = "";

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
    //Adding transactions button from other class
    Parents.add(Transactions);
    Transactions.addActionListener(this);
    //Adding settings button from other class
    Parents.add(ParentalSettings);
    Parents.add(ChangeView);
    ChangeView.addActionListener(this);
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
    //Adding global status checker button from other class
    Child.add(GlobalStatus);
    GlobalStatus.addActionListener(this);
    //Adding status checker button from other class
    Child.add(StatusChecker);
    StatusChecker.addActionListener(this);
    Child.add(MessageChecker);
    MessageChecker.addActionListener(this);
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
    Transaction.add(HomeView);
    HomeView.addActionListener(this);
    Transaction.setSize(500, 500);
    Transaction.setLayout(new GridLayout(4,2));
    Transaction.setResizable(false);
    Transaction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Status.setTitle("Money Management");
    JLabel StatusLabel = new JLabel("Status");
    Status.add(StatusLabel);
    JLabel StatusText = new JLabel("Name: [insert child name] \tAmount in savings account: $" + savingsAccount + "\tscore: " + scoreStatus);
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
    JButton About = new JButton();
    About.setText("About");
    ParentSettings.add(About);
    About.addActionListener(this);
    JButton Contact = new JButton();
    Contact.setText("Contact Us");
    ParentSettings.add(Contact);
    Contact.addActionListener(this);
    ParentSettings.add(Back);
    Back.addActionListener(this);
    ParentSettings.setSize(500, 500);
    ParentSettings.setLayout(new GridLayout(4,2));
    ParentSettings.setResizable(false);
    ParentSettings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    AboutUs.setTitle("Money Management");
    JLabel AboutUsLabel = new JLabel("About");
    AboutUs.add(AboutUsLabel);
    JLabel AboutUsText = new JLabel("[insert literally any information about the game, please add as much as you can]");
    //this model is after the first idea that we came up with
    AboutUs.add(AboutUsText);
    AboutUs.add(Previous);
    Previous.addActionListener(this);
    //@ front end team <3 add more / make this look nice
    AboutUs.setSize(500, 500);
    AboutUs.setLayout(new GridLayout(4,2));
    AboutUs.setResizable(false);
    AboutUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        Parents.setVisible(false);
        String in = JOptionPane.showInputDialog("Deposit Amount:");
        Parents.setVisible(true);
        if (in != null) {
          savingsAccount += Integer.parseInt(in);
        }
      }

      else if (choice.equals("Message")) {
        Parents.setVisible(false);
        String value = JOptionPane.showInputDialog("Message:");
        message = value;
        Parents.setVisible(true);
      }

      else if (choice.equals("Add a new Parent")) {
        Parents.setVisible(false);
        JOptionPane.showInputDialog("Parent Email:");
        Parents.setVisible(true);
      }

      else if (choice.equals("Check Transactions")) {
        Parents.setVisible(false);
        Transaction.setVisible(true);
      }

      else if(choice.equals("Home")) {
        Transaction.setVisible(false);
        Parents.setVisible(true);
      }

      else if(choice.equals("Parent Settings")) {
        Parents.setVisible(false);
        ParentSettings.setVisible(true);
      }

      else if (choice.equals("Name Change")) {
        Parents.setVisible(false);
        JOptionPane.showInputDialog("Enter New Name:");
        Parents.setVisible(true);
      }

      else if (choice.equals("Plan Change")) {
        Parents.setVisible(false);
        String[] options = {"Intensive Involvement", "Intermediate Involvement", "Low-level Involvements"};
        JOptionPane.showInputDialog(null, "Change Plan to:", "Changing Plans", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        Parents.setVisible(true);
      }

      else if (choice.equals("Add Bank Information")) {
        Parents.setVisible(false);
        JOptionPane.showInputDialog("Enter Bank Name:");
        JOptionPane.showInputDialog("Enter Account Holder's Name:");
        JOptionPane.showInputDialog("Enter Account Number:");
        JOptionPane.showInputDialog("Enter Routing Number:");
        Parents.setVisible(true);
      }

      else if (choice.equals("About")) {
        Parents.setVisible(false);
        AboutUs.setVisible(true);
      }

      else if (choice.equals("Previous")) {
        Parents.setVisible(true);
        AboutUs.setVisible(false);
      }

      else if (choice.equals("Contact Us")) {
        Parents.setVisible(false);
        JOptionPane.showInputDialog("Enter Emaill Address:");
        JOptionPane.showInputDialog("Enter Message:");
        Parents.setVisible(true);
      }

      else if(choice.equals("Change POV")) {
        Parents.setVisible(false);
        level.setVisible(true);
      }

      else if(choice.equals("Change View")) {
        Child.setVisible(false);
        level.setVisible(true);
      }

      else if(choice.equals("Back")) {
        Parents.setVisible(true);
        ParentSettings.setVisible(false);
      }

      else if(choice.equals("Check Status")) {
        Child.setVisible(false);
        Status.setVisible(true);
      }

      else if (choice.equals("Check Messages")) {
        Child.setVisible(false);
        if (message.equals("")){
          String out = "No Messages at this time";
          JOptionPane.showMessageDialog(null, out);
          Child.setVisible(true);
        }
        else {
          JOptionPane.showMessageDialog(null, message);
          Child.setVisible(true);
        }
      }

      else if(choice.equals("Roll")) {
        Child.setVisible(false);
        Random r = new Random();
        int rand = r.nextInt(7);
        String event = "";
        if (rand == 0) {
            event += "SPEND: One of your friends is having a birthday party, you must get them a gift. Withdraw $20 from your account.";
            savingsAccount -= 20;
        }
        if (rand == 1){
          event += "SAVE: Your parents just gave you $20 for doing household chores! Add $20 to your account!";
          savingsAccount += 20;
        }
        else if (rand == 2) {
          event += "SAVE: You have recently been offered a position at the local ice cream shop! You will be making $8.00 per hour! Add $76.00 to your account weekly!";
          savingsAccount += 76;
        }
        else if (rand == 3){
          event += "SPEND: Your friends want to go to the movies this weekend. Withdraw $15 from your account.";
          savingsAccount -= 15;
        }
        else if (rand == 4){
          event += "SAVE: You did some yardwork for an elderly neighbor! Add $30 to your account!";
          savingsAccount += 30;
        }
        else if (rand == 5){
          event += "SPEND: You broke your mom's favorite vase. In order to take accountability for your actions, you will replace the vase. Withdraw $50 from your account.";
          savingsAccount -= 50;
        }
        else if (rand == 6){
          event+= "SAVE: You recently had a lemonade stand with some friends on a hot summer day. Add $10 to your account.";
          savingsAccount += 10;
        }
        String output = "Your event today is: " + event;
        JOptionPane.showMessageDialog(null, output);
        Child.setVisible(true);
      }

      else if(choice.equals("Home Page")) {
        Child.setVisible(true);
        Status.setVisible(false);
      }

      else if(choice.equals("Global")) {
        Child.setVisible(false);
        Global.setVisible(false);
      }

      else if(choice.equals("Previous Page")) {
        Child.setVisible(true);
        Global.setVisible(false);
      }
    }


  public static void main (String[] args) {
    new BoardFrame();
  }
}
