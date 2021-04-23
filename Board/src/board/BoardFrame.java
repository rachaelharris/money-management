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
  JFrame Global = new JFrame(); //global leadership
  JFrame Settings = new JFrame(); //settings page

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
    JButton button1 = new JButton("Parent");
    level.add(button1);
    button1.addActionListener(this);
    JButton button2 = new JButton("Child Player");
    level.add(button2);
    button2.addActionListener(this);
    //delete button 3
    //JButton button3 = new JButton("Above Average or Extensive");
    //level.add(button3);
    //button3.addActionListener(this);
    level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    level.setSize(500, 500);
    level.setLayout(new GridLayout(4,2));
    level.setResizable(false);

    Parents.setTitle("Money Management");
    JLabel textQuestion1 = new JLabel("What does UDHR stand for?");
    Parents.add(textQuestion1);
    JButton button4 = new JButton("United Nations Declaring Respect for Humans");
    Parents.add(button4);
    button4.addActionListener(this);
    JButton button5 = new JButton("Universal Declaration of Human Rights");
    Parents.add(button5);
    button5.addActionListener(this);
    JButton button6 = new JButton("Universal Declaration for Resounding Humans");
    Parents.add(button6);
    button6.addActionListener(this);
    Parents.setSize(500, 500);
    Parents.setLayout(new GridLayout(4,2));
    Parents.setResizable(false);
    Parents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Child.setTitle("Human Rights Interactive");
    JLabel textQuestion2 = new JLabel("What is the UDHR?");
    Child.add(textQuestion2);
    JButton button7 = new JButton();
    button7.setText("<html><center>"+"a document adopted by the United Nations as a result "+"<br>"+"of the actions taken during WWII. It guarantees "+"<br>"+" the rights of every individual everywhere."+"</center></html>");
    Child.add(button7);
    button7.addActionListener(this);
    JButton button8 = new JButton("a proposed document as to how humans should be treated.");
    Child.add(button8);
    button8.addActionListener(this);
    JButton button9 = new JButton("a document that guarantees rights.");
    Child.add(button9);
    button9.addActionListener(this);
    Child.setSize(500, 500);
    Friends.setLayout(new GridLayout(4,2));
    Child.setResizable(false);
    Child.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Global.setTitle("Human Rights Interactive");
    JLabel textQuestion3 = new JLabel("True or False: the UDHR is legally binding.");
    Global.add(textQuestion3);
    JButton button10 = new JButton("True");
    Global.add(button10);
    button10.addActionListener(this);
    JButton button11 = new JButton("False");
    Global.add(button11);
    button11.addActionListener(this);
    Global.setSize(500, 500);
    Global.setLayout(new GridLayout(4,2));
    Global.setResizable(false);
    Global.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Settings.setTitle("Human Rights Interactive");
    JLabel textQuestion4 = new JLabel("Why is the UDHR not legally binding?");
    Settings.add(textQuestion4);
    JButton button12 = new JButton();
    button12.setText("<html><center>"+"It forms part of customary international law "+"<br>"+"(laws that have developed through custom "+"<br>"+" rather than by formal agreement)."+"</center></html>");
    Settings.add(button12);
    button12.addActionListener(this);
    JButton button13 = new JButton("It is not a treaty so it does not create legal obligations.");
    Settings.add(button13);
    button13.addActionListener(this);
    JButton button14 = new JButton("Both choices are correct.");
    Settings.add(button14);
    button14.addActionListener(this);
    Settings.setSize(500, 500);
    Settings.setLayout(new GridLayout(4,2));
    Settings.setResizable(false);
    Settings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent ae) {
      String choice = ae.getActionCommand();
      if (choice.equals("Get Started!")) {
        level.setVisible(true);
        welcome.setVisible(false);
      }

      else if (choice.equals("Very Little or None at All")) {
         OneQuestion1.setVisible(true);
         level.setVisible(false);
      }

      else if (choice.equals("United Nations Declaring Respect for Humans") || choice.equals("Universal Declaration for Resounding Humans")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 1", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("Universal Declaration of Human Rights")) {
        OneQuestion2.setVisible(true);
        OneQuestion1.setVisible(false);
      }

      else if (choice.equals("a proposed document as to how humans should be treated.") || choice.equals("a document that garuantees rights.")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 2", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("<html><center>"+"a document adopted by the United Nations as a result "+"<br>"+"of the actions taken during WWII. It guarantees "+"<br>"+" the rights of every individual everywhere."+"</center></html>")) {
        OneQuestion3.setVisible(true);
        OneQuestion2.setVisible(false);
      }

      else if (choice.equals("True")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 3", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("False")) {
        OneQuestion4.setVisible(true);
        OneQuestion3.setVisible(false);
      }

      else if (choice.equals("<html><center>"+"It forms part of customary international law "+"<br>"+"(laws that have developed through custom "+"<br>"+" rather than by formal agreement)."+"</center></html>") || choice.equals("It is not a treaty so it does not create legal obligations.")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 4", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("Both choices are correct.")) {
        OneQuestion5.setVisible(true);
        OneQuestion4.setVisible(false);
      }

      else if (choice.equals("To list the rights that the UN thinks all humans should have.") || choice.equals("To outline what every human deserves and should be given.")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 5", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("To provide a basis for how all humans should be treated.")) {
        OneQuestion6.setVisible(true);
        OneQuestion5.setVisible(false);
      }

      else if (choice.equals("<html><center>"+"The Universal Covenant on Civil, Social, and "+"<br>"+"Political Rights and "+"<br>"+"The Universal Covenant on Economic and Cultural Rights."+"</center></html>") || choice.equals("<html><center>"+"The Universal Declaration of Social, Civil, and "+"<br>"+"Cultural Rights and "+"<br>"+"The Universal Declaration of Economic and Political Rights."+"</center></html>")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 6", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("<html><center>"+"The International Covenant on Social, Civil, and "+"<br>"+"Political Rights and "+"<br>"+"International Covenant on Economic, Social and Cultural Rights."+"</center></html>")) {
        OneQuestion7.setVisible(true);
        OneQuestion6.setVisible(false);
      }

      else if (choice.equals("50") || choice.equals("100")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 7", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("30")) {
        OneQuestion8.setVisible(true);
        OneQuestion7.setVisible(false);
      }

      else if (choice.equals("It is regarded as the foundation of international human rights law.") || choice.equals("It is universal, it applies to all individuals and all states.")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 8", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("Both answers are correct.")) {
        OneQuestion9.setVisible(true);
        OneQuestion8.setVisible(false);
      }

      else if (choice.equals("10") || choice.equals("28")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 9", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("48")) {
        OneQuestion10.setVisible(true);
        OneQuestion9.setVisible(false);
      }

      else if (choice.equals("100") || choice.equals("49")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 10", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("90")) {
        OneQuestion10.setVisible(false);
        OneResult.setVisible(true);

      }

      else if (choice.equals("Intermediary")) {
         level.setVisible(false);
         TwoQuestion1.setVisible(true);
      }

      else if (choice.equals("The right to be a human.") || choice.equals("Basic rights.")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 1", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("A right that is believed to belong justifiably to every person.")) {
         TwoQuestion2.setVisible(true);
         TwoQuestion1.setVisible(false);
      }

      else if (choice.equals("html><center>"+"A legally binding document that guarantees "+"<br>"+"the rights that human beings deserve as respected "+"<br>"+"by individuals and states."+"</center></html>") || choice.equals("A document that guarantees rights.")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 2", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("<html><center>"+"A treaty that outlines the rights that human "+"<br>"+"beings deserve as respected by "+"<br>"+"individuals and states."+"</center></html>")) {
         TwoQuestion3.setVisible(true);
         TwoQuestion2.setVisible(false);
      }

      else if (choice.equals("The government") || choice.equals("<html><center>"+"The government, businesses, "+"<br>"+"and civil socieities "+"<br>"+"</center></html>")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 3", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("<html><center>"+"The government, businesses "+"<br>"+"civil socieities, and individuals "+"<br>"+"</center></html>")) {
         TwoQuestion4.setVisible(true);
         TwoQuestion3.setVisible(false);
      }

      else if (choice.equals("<html><center>"+"False. "+"<br>"+"Children under the age of 16 "+"<br>"+"have different rights because they are dependents."+"</center></html>")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 4", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("<html><center>"+"True. "+"The UN Convention on Rights of the Child "+"<br>"+"establishes them"+"</center></html>")) {
         TwoQuestion5.setVisible(true);
         TwoQuestion4.setVisible(false);
      }

      else if (choice.equals("<html><center>"+"An act which brought about"+"<br>"+"a new culture of respect for Human Rights"+"</center></html>") || choice.equals("<html><center>"+"An act which brought about "+"<br>"+"rights from the European Convention on Human Rights "+"<br>"+"under jurisdiction of UK courts"+"</center></html>")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 5", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("All of the above")) {
         TwoQuestion6.setVisible(true);
         TwoQuestion5.setVisible(false);
      }

      else if (choice.equals("Right to Protect") || choice.equals("Responsibility to Keep Peace")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 6", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("Responsibility to Protect")) {
         TwoQuestion7.setVisible(true);
         TwoQuestion6.setVisible(false);
      }

      else if (choice.equals("This statement is false.")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 7", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("This statement is true.")) {
         TwoQuestion8.setVisible(true);
         TwoQuestion7.setVisible(false);
      }

      else if (choice.equals("<html><center>"+"Reporting another country "+"<br>"+"to the UN."+"</center></html>") || choice.equals("Neither of these choices are correct")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 8", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("<html><center>"+"Public outing, "+"<br>"+"which should promote a change "+"<br>"+"in behavior."+"</center></html>")) {
         TwoQuestion9.setVisible(true);
         TwoQuestion8.setVisible(false);
      }

      else if (choice.equals("<html><center>"+"Costly signals show "+"<br>"+"severe and sincere interests "+"<br>"+"but they cost something."+"</center></html>") || choice.equals("<html><center>"+"Cheap talk is used "+"<br>"+"when naming and shaming "+"<br>"+"isn't productive."+"</center></html>")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 9", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("Both of these are correct")) {
         TwoQuestion10.setVisible(true);
         TwoQuestion9.setVisible(false);
      }

      else if (choice.equals("A synonym to peacekeeping") || choice.equals("<html><center>"+"Sending reporters"+"<br>"+" to another state to calcualte "+"<br>"+"the severity of death and suffering."+"</center></html>")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 10", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("<html><center>"+"Using force in "+"<br>"+"in another state to prevent "+"<br>"+"sufferring and death."+"</center></html>")) {
         TwoResult.setVisible(true);
         TwoQuestion10.setVisible(false);
      }

      else if (choice.equals("Above Average or Extensive")) {
         ThreeQuestion1.setVisible(true);
         level.setVisible(false);
      }

      else if (choice.equals("all of them") || choice.equals("120")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 1", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("160")) {
         ThreeQuestion2.setVisible(true);
         ThreeQuestion1.setVisible(false);
       }

       else if (choice.equals("45") || choice.equals("55")) {
         JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 2", JOptionPane.ERROR_MESSAGE);
       }

      else if (choice.equals("35")) {
        ThreeQuestion3.setVisible(true);
        ThreeQuestion2.setVisible(false);
      }

      else if (choice.equals("65") || choice.equals("127")) {
        JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 3", JOptionPane.ERROR_MESSAGE);
      }

      else if (choice.equals("131")) {
          ThreeQuestion4.setVisible(true);
          ThreeQuestion3.setVisible(false);
        }

        else if (choice.equals("101") || choice.equals("73")) {
          JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 4", JOptionPane.ERROR_MESSAGE);
        }

        else if (choice.equals("62")) {
          ThreeQuestion5.setVisible(true);
          ThreeQuestion4.setVisible(false);
        }

        else if (choice.equals("Hacksaw Ridge (2016)") || choice.equals("War Machine (2017)")) {
          JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 5", JOptionPane.ERROR_MESSAGE);
        }

        else if (choice.equals("Lord of War (2005)")) {
            ThreeQuestion6.setVisible(true);
            ThreeQuestion5.setVisible(false);
        }

        else if (choice.equals("<html><center>"+"They can be adapted into International treaties "+"<br>"+"and enforced that way. "+"</center></html>") || choice.equals("<html><center>"+"Countries can adapt articles into their own "+"<br>"+"laws and enforce them that way. "+"</center></html>")) {
          JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 6", JOptionPane.ERROR_MESSAGE);
        }

        else if (choice.equals("All of the above are correct")) {
            ThreeQuestion7.setVisible(true);
            ThreeQuestion6.setVisible(false);
        }

        else if (choice.equals("The International Court of Justice (ICJ)") || choice.equals("The International Criminal Court (ICC)")) {
          JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 7", JOptionPane.ERROR_MESSAGE);
        }

        else if (choice.equals("Both of these choices are correct")) {
            ThreeQuestion8.setVisible(true);
            ThreeQuestion7.setVisible(false);
        }

        else if (choice.equals("Over 90") || choice.equals("Over 120")) {
          JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 8", JOptionPane.ERROR_MESSAGE);
        }

        else if (choice.equals("Over 110")) {
            ThreeQuestion9.setVisible(true);
            ThreeQuestion8.setVisible(false);
        }

        else if (choice.equals("Water") || choice.equals("Clean air")) {
          JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 9", JOptionPane.ERROR_MESSAGE);
        }

        else if (choice.equals("Internet access")) {
            ThreeQuestion10.setVisible(true);
            ThreeQuestion9.setVisible(false);
        }

        else if (choice.equals("<html><center>"+"True. "+"<br>"+"62 have been sentenced and 14 have been acquitted "+"</center></html>")) {
          JOptionPane.showMessageDialog(null, "The answer you have chosen is incorrect.", "Question 10", JOptionPane.ERROR_MESSAGE);
        }

        else if (choice.equals("<html><center>"+"True. "+"<br>"+"It is available in more than 370 languages. "+"</center></html>")) {
            ThreeResult.setVisible(true);
            ThreeQuestion10.setVisible(false);
        }
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
