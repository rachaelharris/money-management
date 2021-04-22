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

public class finalProject extends JFrame implements ActionListener{
  JFrame welcome = new JFrame(); //first frame, introduces program
  JFrame level = new JFrame(); //second frame, asks the user to indicate their knoowledge on HR
  JFrame OneQuestion1 = new JFrame(); //first question for the easiest level
  JFrame OneQuestion2 = new JFrame(); //second question for the easiest level
  JFrame OneQuestion3 = new JFrame(); //third question for the easiest level
  JFrame OneQuestion4 = new JFrame(); //fourth question for the easiest level
  JFrame OneQuestion5 = new JFrame(); //fifth question for the easiest level
  JFrame OneQuestion6 = new JFrame(); //sixth question for the easiest level
  JFrame OneQuestion7 = new JFrame(); //seventh question for the easiest level
  JFrame OneQuestion8 = new JFrame(); //eighth question for the easiest level
  JFrame OneQuestion9 = new JFrame(); //ninth question for the easiest level
  JFrame OneQuestion10 = new JFrame(); //tenth question forthe easiest level
  JFrame OneResult = new JFrame(); //result for the easiest level
  JFrame TwoQuestion1 = new JFrame(); //first question for the middle level
  JFrame TwoQuestion2 = new JFrame(); //second question for the middle level
  JFrame TwoQuestion3 = new JFrame(); //third question for the middle level
  JFrame TwoQuestion4 = new JFrame(); //fourth question for the middle level
  JFrame TwoQuestion5 = new JFrame(); //fifth question for the middle level
  JFrame TwoQuestion6 = new JFrame(); //sixth question for the middle level
  JFrame TwoQuestion7 = new JFrame(); //seventh question for the middle level
  JFrame TwoQuestion8 = new JFrame(); //eighth question for the mididle level
  JFrame TwoQuestion9 = new JFrame(); //ninth question for the middle level
  JFrame TwoQuestion10 = new JFrame(); //tenth question for the middle level
  JFrame TwoResult = new JFrame(); //result for the middle level
  JFrame ThreeQuestion1 = new JFrame(); //first question for the hardest level
  JFrame ThreeQuestion2 = new JFrame(); //second question for the hardest level
  JFrame ThreeQuestion3 = new JFrame(); //third question for the hardest level
  JFrame ThreeQuestion4 = new JFrame(); //fourth question for the hardest level
  JFrame ThreeQuestion5 = new JFrame(); //fifth question for the hardest level
  JFrame ThreeQuestion6 = new JFrame(); //sixth question for the hardest level
  JFrame ThreeQuestion7 = new JFrame(); //seventh question for the hardest level
  JFrame ThreeQuestion8 = new JFrame(); //eighth question for the hardest level
  JFrame ThreeQuestion9 = new JFrame(); //ninth question for the hardest level
  JFrame ThreeQuestion10 = new JFrame(); //tenth question for the hardest level
  JFrame ThreeResult = new JFrame();

  finalProject() {
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
    JLabel label = new JLabel("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\Are you a parent or a child player?");
    level.add(label);
    JButton button1 = new JButton("Parent");
    level.add(button1);
    button1.addActionListener(this);
    JButton button2 = new JButton("Child Player");
    level.add(button2);
    button2.addActionListener(this);
    //delete button 3
    JButton button3 = new JButton("Above Average or Extensive");
    level.add(button3);
    button3.addActionListener(this);
    level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    level.setSize(500, 500);
    level.setLayout(new GridLayout(4,2));
    level.setResizable(false);

    OneQuestion1.setTitle("Human Rights Interactive");
    JLabel textQuestion1 = new JLabel("What does UDHR stand for?");
    OneQuestion1.add(textQuestion1);
    JButton button4 = new JButton("United Nations Declaring Respect for Humans");
    OneQuestion1.add(button4);
    button4.addActionListener(this);
    JButton button5 = new JButton("Universal Declaration of Human Rights");
    OneQuestion1.add(button5);
    button5.addActionListener(this);
    JButton button6 = new JButton("Universal Declaration for Resounding Humans");
    OneQuestion1.add(button6);
    button6.addActionListener(this);
    OneQuestion1.setSize(500, 500);
    OneQuestion1.setLayout(new GridLayout(4,2));
    OneQuestion1.setResizable(false);
    OneQuestion1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion2.setTitle("Human Rights Interactive");
    JLabel textQuestion2 = new JLabel("What is the UDHR?");
    OneQuestion2.add(textQuestion2);
    JButton button7 = new JButton();
    button7.setText("<html><center>"+"a document adopted by the United Nations as a result "+"<br>"+"of the actions taken during WWII. It guarantees "+"<br>"+" the rights of every individual everywhere."+"</center></html>");
    OneQuestion2.add(button7);
    button7.addActionListener(this);
    JButton button8 = new JButton("a proposed document as to how humans should be treated.");
    OneQuestion2.add(button8);
    button8.addActionListener(this);
    JButton button9 = new JButton("a document that guarantees rights.");
    OneQuestion2.add(button9);
    button9.addActionListener(this);
    OneQuestion2.setSize(500, 500);
    OneQuestion2.setLayout(new GridLayout(4,2));
    OneQuestion2.setResizable(false);
    OneQuestion2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion3.setTitle("Human Rights Interactive");
    JLabel textQuestion3 = new JLabel("True or False: the UDHR is legally binding.");
    OneQuestion3.add(textQuestion3);
    JButton button10 = new JButton("True");
    OneQuestion3.add(button10);
    button10.addActionListener(this);
    JButton button11 = new JButton("False");
    OneQuestion3.add(button11);
    button11.addActionListener(this);
    OneQuestion3.setSize(500, 500);
    OneQuestion3.setLayout(new GridLayout(4,2));
    OneQuestion3.setResizable(false);
    OneQuestion3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion4.setTitle("Human Rights Interactive");
    JLabel textQuestion4 = new JLabel("Why is the UDHR not legally binding?");
    OneQuestion4.add(textQuestion4);
    JButton button12 = new JButton();
    button12.setText("<html><center>"+"It forms part of customary international law "+"<br>"+"(laws that have developed through custom "+"<br>"+" rather than by formal agreement)."+"</center></html>");
    OneQuestion4.add(button12);
    button12.addActionListener(this);
    JButton button13 = new JButton("It is not a treaty so it does not create legal obligations.");
    OneQuestion4.add(button13);
    button13.addActionListener(this);
    JButton button14 = new JButton("Both choices are correct.");
    OneQuestion4.add(button14);
    button14.addActionListener(this);
    OneQuestion4.setSize(500, 500);
    OneQuestion4.setLayout(new GridLayout(4,2));
    OneQuestion4.setResizable(false);
    OneQuestion4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion5.setTitle("Human Rights Interactive");
    JLabel textQuestion5 = new JLabel("What is the purpose of the UDHR?");
    OneQuestion5.add(textQuestion5);
    JButton button15 = new JButton("To list the rights that the UN thinks all humans should have.");
    OneQuestion5.add(button15);
    button15.addActionListener(this);
    JButton button16 = new JButton("To outline what every human deserves and should be given.");
    OneQuestion5.add(button16);
    button16.addActionListener(this);
    JButton button17 = new JButton("To provide a basis for how all humans should be treated.");
    OneQuestion5.add(button17);
    button17.addActionListener(this);
    OneQuestion5.setSize(500, 500);
    OneQuestion5.setLayout(new GridLayout(4,2));
    OneQuestion5.setResizable(false);
    OneQuestion5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion6.setTitle("Human Rights Interactive");
    JLabel textQuestion6 = new JLabel("What are the two sections that the UDHR is broken down into?");
    OneQuestion6.add(textQuestion6);
    JButton button18 = new JButton();
    button18.setText("<html><center>"+"The Universal Covenant on Civil, Social, and "+"<br>"+"Political Rights and "+"<br>"+"The Universal Covenant on Economic and Cultural Rights."+"</center></html>");
    OneQuestion6.add(button18);
    JButton button19 = new JButton();
    button19.setText("<html><center>"+"The International Covenant on Social, Civil, and "+"<br>"+"Political Rights and "+"<br>"+"International Covenant on Economic, Social and Cultural Rights."+"</center></html>");
    OneQuestion6.add(button19);
    button19.addActionListener(this);
    JButton button20 = new JButton();
    button20.setText("<html><center>"+"The Universal Declaration of Social, Civil, and "+"<br>"+"Cultural Rights and "+"<br>"+"The Universal Declaration of Economic and Political Rights."+"</center></html>");
    OneQuestion6.add(button20);
    button20.addActionListener(this);
    OneQuestion6.setSize(500, 500);
    OneQuestion6.setLayout(new GridLayout(4,2));
    OneQuestion6.setResizable(false);
    OneQuestion6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion7.setTitle("Human Rights Interactive");
    JLabel textQuestion7 = new JLabel("How many Articles are outlined in the UDHR?");
    OneQuestion7.add(textQuestion7);
    JButton button21 = new JButton("30");
    OneQuestion7.add(button21);
    button21.addActionListener(this);
    JButton button22 = new JButton("100");
    OneQuestion7.add(button22);
    button22.addActionListener(this);
    JButton button23 = new JButton("50");
    OneQuestion7.add(button23);
    button23.addActionListener(this);
    OneQuestion7.setSize(500, 500);
    OneQuestion7.setLayout(new GridLayout(4,2));
    OneQuestion7.setResizable(false);
    OneQuestion7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion8.setTitle("Human Rights Interactive");
    JLabel textQuestion8 = new JLabel("How is the UDHR applicable?");
    OneQuestion8.add(textQuestion8);
    JButton button24 = new JButton("It is regarded as the foundation of international human rights law.");
    OneQuestion8.add(button24);
    button18.addActionListener(this);
    JButton button25 = new JButton("It is universal, it applies to all individuals and all states.");
    OneQuestion8.add(button25);
    button25.addActionListener(this);
    JButton button26 = new JButton("Both answers are correct.");
    OneQuestion8.add(button26);
    button26.addActionListener(this);
    OneQuestion8.setSize(500, 500);
    OneQuestion8.setLayout(new GridLayout(4,2));
    OneQuestion8.setResizable(false);
    OneQuestion8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion9.setTitle("Human Rights Interactive");
    JLabel textQuestion9 = new JLabel("How many states supported the treaty in 1948?");
    OneQuestion9.add(textQuestion9);
    JButton button27 = new JButton("10");
    OneQuestion9.add(button27);
    button27.addActionListener(this);
    JButton button28 = new JButton("28");
    OneQuestion9.add(button28);
    button28.addActionListener(this);
    JButton button29 = new JButton("48");
    OneQuestion9.add(button29);
    button29.addActionListener(this);
    OneQuestion9.setSize(500, 500);
    OneQuestion9.setLayout(new GridLayout(4,2));
    OneQuestion9.setResizable(false);
    OneQuestion9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneQuestion10.setTitle("Human Rights Interactive");
    JLabel textQuestion10 = new JLabel("How many states signed the treaty in 2018?");
    OneQuestion10.add(textQuestion10);
    JButton button30 = new JButton("49");
    OneQuestion10.add(button30);
    button30.addActionListener(this);
    JButton button31 = new JButton("100");
    OneQuestion10.add(button31);
    button31.addActionListener(this);
    JButton button32 = new JButton("90");
    OneQuestion10.add(button32);
    button32.addActionListener(this);
    OneQuestion10.setSize(500, 500);
    OneQuestion10.setLayout(new GridLayout(4,2));
    OneQuestion10.setResizable(false);
    OneQuestion10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    OneResult.setTitle("Human Rights Interactive");
    JLabel textResult1 = new JLabel("Congratulations on completing the questioning segment!");
    OneResult.add(textResult1);
    JLabel textResult2 = new JLabel("You might want to check out this link for further reading:");
    OneResult.add(textResult2);
    String link1Link = "https://www.equalityhumanrights.com/en/our-human-rights-work/monitoring-and-promoting-un-treaties";
    JTextArea textArea2 = new JTextArea(2, 40);
    textArea2.setText(link1Link);
    textArea2.setWrapStyleWord(true);
    textArea2.setLineWrap(true);
    textArea2.setOpaque(false);
    textArea2.setEditable(false);
    textArea2.setFocusable(false);
    OneResult.add(textArea2, BorderLayout.CENTER);
    OneResult.setSize(500, 500);
    OneResult.setLayout(new FlowLayout());
    OneResult.setResizable(false);
    OneResult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion1.setTitle("Human Rights Interactive");
    JLabel textQuestion11 = new JLabel("What are human rights?");
    TwoQuestion1.add(textQuestion11);
    JButton button33 = new JButton("The right to be a human.");
    TwoQuestion1.add(button33);
    button33.addActionListener(this);
    JButton button34 = new JButton("A right that is believed to belong justifiably to every person.");
    TwoQuestion1.add(button34);
    button34.addActionListener(this);
    JButton button35 = new JButton("Basic rights.");
    TwoQuestion1.add(button35);
    button35.addActionListener(this);
    TwoQuestion1.setSize(500, 500);
    TwoQuestion1.setLayout(new GridLayout(4,2));
    TwoQuestion1.setResizable(false);
    TwoQuestion1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion2.setTitle("Human Rights Interactive");
    JLabel textQuestion12 = new JLabel("What is the Universal Declaration for Human Rights?");
    TwoQuestion2.add(textQuestion12);
    JButton button36 = new JButton("A document that guarantees rights.");
    TwoQuestion2.add(button36);
    button36.addActionListener(this);
    JButton button37 = new JButton();
    button37.setText("<html><center>"+"A treaty that outlines the rights that human "+"<br>"+"beings deserve as respected by "+"<br>"+"individuals and states."+"</center></html>");
    TwoQuestion2.add(button37);
    button37.addActionListener(this);
    JButton button38 = new JButton();
    button38.setText("<html><center>"+"A legally binding document that guarantees "+"<br>"+"the rights that human beings deserve as respected "+"<br>"+"by individuals and states."+"</center></html>");
    TwoQuestion2.add(button38);
    button38.addActionListener(this);
    TwoQuestion2.setSize(500, 500);
    TwoQuestion2.setLayout(new GridLayout(4,2));
    TwoQuestion2.setResizable(false);
    TwoQuestion2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion3.setTitle("Human Rights Interactive");
    JLabel textQuestion13 = new JLabel("Who is responsible for upholding Human Rights?");
    TwoQuestion3.add(textQuestion13);
    JButton button39 = new JButton("The government");
    TwoQuestion3.add(button39);
    button39.addActionListener(this);
    JButton button40 = new JButton("<html><center>"+"The government, businesses, "+"<br>"+"and civil socieities "+"<br>"+"</center></html>");
    TwoQuestion3.add(button40);
    button40.addActionListener(this);
    JButton button41 = new JButton("<html><center>"+"The government, businesses "+"<br>"+"civil socieities, and individuals "+"<br>"+"</center></html>");
    TwoQuestion3.add(button41);
    button41.addActionListener(this);
    TwoQuestion3.setSize(500, 500);
    TwoQuestion3.setLayout(new GridLayout(4,2));
    TwoQuestion3.setResizable(false);
    TwoQuestion3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion4.setTitle("Human Rights Interactive");
    JLabel textQuestion14 = new JLabel("<html><center>"+"True or False: "+"<br>"+"Children are entitled "+"<br>"+"to Human Rights."+"</center></html>");
    TwoQuestion4.add(textQuestion14);
    JButton button42 = new JButton();
    button42.setText("<html><center>"+"True. "+"The UN Convention on Rights of the Child "+"<br>"+"establishes them"+"</center></html>");
    TwoQuestion4.add(button42);
    button42.addActionListener(this);
    JButton button43 = new JButton();
    button43.setText("<html><center>"+"False. "+"<br>"+"Children under the age of 16 "+"<br>"+"have different rights because they are dependents."+"</center></html>");
    TwoQuestion4.add(button43);
    button43.addActionListener(this);
    TwoQuestion4.setSize(500, 500);
    TwoQuestion4.setLayout(new GridLayout(4,2));
    TwoQuestion4.setResizable(false);
    TwoQuestion4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion5.setTitle("Human Rights Interactive");
    JLabel textQuestion15 = new JLabel("What is the Human Rights Act of 1998?");
    TwoQuestion5.add(textQuestion15);
    JButton button45 = new JButton("<html><center>"+"An act which brought about"+"<br>"+"a new culture of respect for Human Rights"+"</center></html>");
    TwoQuestion5.add(button45);
    button45.addActionListener(this);
    JButton button46 = new JButton();
    button46.setText("<html><center>"+"An act which brought about "+"<br>"+"rights from the European Convention on Human Rights "+"<br>"+"under jurisdiction of UK courts"+"</center></html>");
    TwoQuestion5.add(button46);
    button46.addActionListener(this);
    JButton button47 = new JButton("All of the above");
    TwoQuestion5.add(button47);
    button47.addActionListener(this);
    TwoQuestion5.setSize(500, 500);
    TwoQuestion5.setLayout(new GridLayout(4,2));
    TwoQuestion5.setResizable(false);
    TwoQuestion5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion6.setTitle("Human Rights Interactive");
    JLabel textQuestion16 = new JLabel("What is R2P");
    TwoQuestion6.add(textQuestion16);
    JButton button48 = new JButton("Responsibility to Protect");
    TwoQuestion6.add(button48);
    button48.addActionListener(this);
    JButton button49 = new JButton("Right to Protect");
    TwoQuestion6.add(button49);
    button49.addActionListener(this);
    JButton button50 = new JButton("Responsibility to Keep Peace");
    TwoQuestion6.add(button50);
    button50.addActionListener(this);
    TwoQuestion6.setSize(500, 500);
    TwoQuestion6.setLayout(new GridLayout(4,2));
    TwoQuestion6.setResizable(false);
    TwoQuestion6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion7.setTitle("Human Rights Interactive");
    JLabel textQuestion17 = new JLabel("Why did R2P emerge?");
    TwoQuestion7.add(textQuestion17);
    JButton button51 = new JButton("Failures during WWII");
    TwoQuestion7.add(button51);
    button51.addActionListener(this);
    JButton button52 = new JButton("<html><center>"+"Failures during genocides "+"<br>"+"in Rwanda & Yugoslavia "+"</center></html>");
    TwoQuestion7.add(button52);
    TwoQuestion7.setSize(500, 500);
    TwoQuestion7.setLayout(new GridLayout(4,2));
    TwoQuestion7.setResizable(false);
    TwoQuestion7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion8.setTitle("Human Rights Interactive");
    JLabel textQuestion18 = new JLabel("What is Naming and Shaming?");
    TwoQuestion8.add(textQuestion18);
    JButton button53 = new JButton();
    button53.setText("<html><center>"+"Public outing, "+"<br>"+"which should promote a change "+"<br>"+"in behavior."+"</center></html>");
    TwoQuestion8.add(button53);
    button53.addActionListener(this);
    JButton button54 = new JButton();
    button54.setText("<html><center>"+"Reporting another country "+"<br>"+"to the UN."+"</center></html>");
    TwoQuestion8.add(button54);
    button54.addActionListener(this);
    JButton button55 = new JButton("Neither of these are correct.");
    TwoQuestion8.add(button55);
    button55.addActionListener(this);
    TwoQuestion8.setSize(500, 500);
    TwoQuestion8.setLayout(new GridLayout(4,2));
    TwoQuestion8.setResizable(false);
    TwoQuestion8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion9.setTitle("Human Rights Interactive");
    JLabel textQuestion19 = new JLabel("<html><center>"+"What is the difference "+"<br>"+"between cheap talk "+"<br>"+"and costly signals?"+"</center></html>");
    TwoQuestion9.add(textQuestion19);
    JButton button56 = new JButton("<html><center>"+"Costly signals show "+"<br>"+"severe and sincere interests "+"<br>"+"but they cost something."+"</center></html>");
    TwoQuestion9.add(button56);
    button56.addActionListener(this);
    JButton button57 = new JButton("<html><center>"+"Cheap talk is used "+"<br>"+"when naming and shaming "+"<br>"+"isn't productive."+"</center></html>");
    TwoQuestion9.add(button57);
    button57.addActionListener(this);
    JButton button58 = new JButton("Both of these are correct");
    TwoQuestion9.add(button58);
    button58.addActionListener(this);
    TwoQuestion9.setSize(500, 500);
    TwoQuestion9.setLayout(new GridLayout(4,2));
    TwoQuestion9.setResizable(false);
    TwoQuestion9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoQuestion10.setTitle("Human Rights Interactive");
    JLabel textQuestion20 = new JLabel("What is humanitarian intervention?");
    TwoQuestion10.add(textQuestion20);
    JButton button59 = new JButton("A synonym to peacekeeping");
    TwoQuestion10.add(button59);
    button59.addActionListener(this);
    JButton button60 = new JButton("<html><center>"+"Using force in "+"<br>"+"in another state to prevent "+"<br>"+"sufferring and death."+"</center></html>");
    TwoQuestion10.add(button60);
    button60.addActionListener(this);
    JButton button61 = new JButton("<html><center>"+"Sending reporters"+"<br>"+" to another state to calcualte "+"<br>"+"the severity of death and suffering."+"</center></html>");
    TwoQuestion10.add(button61);
    button61.addActionListener(this);
    TwoQuestion10.setSize(500, 500);
    TwoQuestion10.setLayout(new GridLayout(4,2));
    TwoQuestion10.setResizable(false);
    TwoQuestion10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoResult.setTitle("Human Rights Interactive");
    JLabel textResult3 = new JLabel("Congratulations on completing the questioning segment!");
    TwoResult.add(textResult3);
    JLabel textResult4 = new JLabel("You might want to check out this link for further reading:");
    TwoResult.add(textResult4);
    String link2Link = "https://erlc.com/resource-library/articles/5-facts-about-international-human-rights";
    JTextArea textArea3 = new JTextArea(2, 40);
    textArea3.setText(link2Link);
    textArea3.setWrapStyleWord(true);
    textArea3.setLineWrap(true);
    textArea3.setOpaque(false);
    textArea3.setEditable(false);
    textArea3.setFocusable(false);
    TwoResult.add(textArea3, BorderLayout.CENTER);
    TwoResult.setSize(500, 500);
    TwoResult.setLayout(new FlowLayout());
    TwoResult.setResizable(false);
    TwoResult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion1.setTitle("Human Rights Interactive");
    String textQuestion21 = "How many countries & territories did Amnesty International record and investigate human rights abuses for?";
    JTextArea textArea6 = new JTextArea(2, 40);
    textArea6.setText(textQuestion21);
    textArea6.setWrapStyleWord(true);
    textArea6.setLineWrap(true);
    textArea6.setOpaque(false);
    textArea6.setEditable(false);
    textArea6.setFocusable(false);
    ThreeQuestion1.add(textArea6, BorderLayout.CENTER);
    JButton button62 = new JButton("all of them");
    ThreeQuestion1.add(button62);
    button62.addActionListener(this);
    JButton button63 = new JButton("160");
    ThreeQuestion1.add(button63);
    button63.addActionListener(this);
    JButton button64 = new JButton("120");
    ThreeQuestion1.add(button64);
    button64.addActionListener(this);
    ThreeQuestion1.setSize(500, 500);
    ThreeQuestion1.setLayout(new GridLayout(4,2));
    ThreeQuestion1.setResizable(false);
    ThreeQuestion1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion2.setTitle("Human Rights Interactive");
    JLabel textQuestion22 = new JLabel("How many of these countries had reported abuses?");
    ThreeQuestion2.add(textQuestion22);
    JButton button65 = new JButton("35");
    ThreeQuestion2.add(button65);
    button65.addActionListener(this);
    JButton button66 = new JButton("45");
    ThreeQuestion2.add(button66);
    button66.addActionListener(this);
    JButton button67 = new JButton("55");
    ThreeQuestion2.add(button67);
    button67.addActionListener(this);
    ThreeQuestion2.setSize(500, 500);
    ThreeQuestion2.setLayout(new GridLayout(4,2));
    ThreeQuestion2.setResizable(false);
    ThreeQuestion2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion3.setTitle("Human Rights Interactive");
    JLabel textQuestion23 = new JLabel("How many countries had tortured or otherwise ill-treated people?");
    ThreeQuestion3.add(textQuestion23);
    JButton button68 = new JButton("65");
    ThreeQuestion3.add(button68);
    button68.addActionListener(this);
    JButton button69 = new JButton("127");
    ThreeQuestion3.add(button69);
    button69.addActionListener(this);
    JButton button70 = new JButton("131");
    ThreeQuestion3.add(button70);
    button70.addActionListener(this);
    ThreeQuestion3.setSize(500, 500);
    ThreeQuestion3.setLayout(new GridLayout(4,2));
    ThreeQuestion3.setResizable(false);
    ThreeQuestion3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion4.setTitle("Human Rights Interactive");
    String textQuestion24 = "How many locked up prisoners of conscience (people who were simply exercising their rights and freedoms)?";
    JTextArea textArea7 = new JTextArea(2, 40);
    textArea7.setText(textQuestion24);
    textArea7.setWrapStyleWord(true);
    textArea7.setLineWrap(true);
    textArea7.setOpaque(false);
    textArea7.setEditable(false);
    textArea7.setFocusable(false);
    ThreeQuestion4.add(textArea7, BorderLayout.CENTER);
    JButton button71 = new JButton("101");
    ThreeQuestion4.add(button71);
    button71.addActionListener(this);
    JButton button72 = new JButton("73");
    ThreeQuestion4.add(button72);
    button72.addActionListener(this);
    JButton button73 = new JButton("62");
    ThreeQuestion4.add(button73);
    button73.addActionListener(this);
    ThreeQuestion4.setSize(500, 500);
    ThreeQuestion4.setLayout(new GridLayout(4,2));
    ThreeQuestion4.setResizable(false);
    ThreeQuestion4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion5.setTitle("Human Rights Interactive");
    String textQuestion25 = "Which Hollywood film has been endorsed by Amnesty International or highlighting the arms trafficking by the international arms industry?";
    JTextArea textArea5 = new JTextArea(2, 40);
    textArea5.setText(textQuestion25);
    textArea5.setWrapStyleWord(true);
    textArea5.setLineWrap(true);
    textArea5.setOpaque(false);
    textArea5.setEditable(false);
    textArea5.setFocusable(false);
    ThreeQuestion5.add(textArea5, BorderLayout.CENTER);
    JButton button74 = new JButton("Hacksaw Ridge (2016)");
    ThreeQuestion5.add(button74);
    button74.addActionListener(this);
    JButton button75 = new JButton("Lord of War (2005)");
    ThreeQuestion5.add(button75);
    button75.addActionListener(this);
    JButton button76 = new JButton("War Machine (2017)");
    ThreeQuestion5.add(button76);
    button76.addActionListener(this);
    ThreeQuestion5.setSize(500, 500);
    ThreeQuestion5.setLayout(new GridLayout(4,2));
    ThreeQuestion5.setResizable(false);
    ThreeQuestion5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion6.setTitle("Human Rights Interactive");
    JLabel textQuestion26 = new JLabel("How does the UDHR get enforced?");
    ThreeQuestion6.add(textQuestion26);
    JButton button77 = new JButton("<html><center>"+"They can be adapted into International treaties "+"<br>"+"and enforced that way. "+"</center></html>");
    ThreeQuestion6.add(button77);
    button77.addActionListener(this);
    JButton button78 = new JButton("<html><center>"+"Countries can adapt articles into their own "+"<br>"+"laws and enforce them that way. "+"</center></html>");
    ThreeQuestion6.add(button78);
    button78.addActionListener(this);
    JButton button79 = new JButton("All of the above are correct");
    ThreeQuestion6.add(button79);
    button79.addActionListener(this);
    ThreeQuestion6.setSize(500, 500);
    ThreeQuestion6.setLayout(new GridLayout(4,2));
    ThreeQuestion6.setResizable(false);
    ThreeQuestion6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion7.setTitle("Human Rights Interactive");
    JLabel textQuestion27 = new JLabel("How does the UN help to enforce the UDHR?");
    ThreeQuestion7.add(textQuestion27);
    JButton button80 = new JButton("The International Court of Justice (ICJ)");
    ThreeQuestion7.add(button80);
    button80.addActionListener(this);
    JButton button81 = new JButton("The International Criminal Court (ICC)");
    ThreeQuestion7.add(button81);
    button81.addActionListener(this);
    JButton button82 = new JButton("Both of these choices are correct");
    ThreeQuestion7.add(button82);
    button82.addActionListener(this);
    ThreeQuestion7.setSize(500, 500);
    ThreeQuestion7.setLayout(new GridLayout(4,2));
    ThreeQuestion7.setResizable(false);
    ThreeQuestion7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion8.setTitle("Human Rights Interactive");
    JLabel textQuestion28 = new JLabel("How many countries have  National human rights institutions (NHRIs)?");
    ThreeQuestion8.add(textQuestion28);
    JButton button83 = new JButton("Over 90");
    ThreeQuestion8.add(button83);
    button83.addActionListener(this);
    JButton button84 = new JButton("Over 110");
    ThreeQuestion8.add(button84);
    button84.addActionListener(this);
    JButton button85 = new JButton("Over 120");
    ThreeQuestion8.add(button85);
    button85.addActionListener(this);
    ThreeQuestion8.setSize(500, 500);
    ThreeQuestion8.setLayout(new GridLayout(4,2));
    ThreeQuestion8.setResizable(false);
    ThreeQuestion8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion9.setTitle("Human Rights Interactive");
    JLabel textQuestion29 = new JLabel("In 2011, what did the UN declare as a basic human right?");
    ThreeQuestion9.add(textQuestion29);
    JButton button86 = new JButton("Internet access");
    ThreeQuestion9.add(button86);
    button86.addActionListener(this);
    JButton button87 = new JButton("Water");
    ThreeQuestion9.add(button87);
    button87.addActionListener(this);
    JButton button88 = new JButton("Clean air");
    ThreeQuestion9.add(button88);
    button88.addActionListener(this);
    ThreeQuestion9.setSize(500, 500);
    ThreeQuestion9.setLayout(new GridLayout(4,2));
    ThreeQuestion9.setResizable(false);
    ThreeQuestion9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeQuestion10.setTitle("Human Rights Interactive");
    JLabel textQuestion30 = new JLabel("<html><center>"+"True or false: the International "+"<br>"+"Residual Mechanism for Criminal"+ "<br>" + "Tribunals can sentence individuals" + "</center></html>");
    ThreeQuestion10.add(textQuestion30);
    JButton button89 = new JButton();
    button89.setText("<html><center>"+"True. "+"<br>"+"62 have been sentenced and 14 have been acquitted "+"</center></html>");
    ThreeQuestion10.add(button89);
    button89.addActionListener(this);
    JButton button90 = new JButton();
    button90.setText("<html><center>"+"False. "+"<br>"+"It is an international court; that is impossible "+"</center></html>");
    ThreeQuestion10.add(button90);
    button90.addActionListener(this);
    ThreeQuestion10.setSize(500, 500);
    ThreeQuestion10.setLayout(new GridLayout(4,2));
    ThreeQuestion10.setResizable(false);
    ThreeQuestion10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ThreeResult.setTitle("Human Rights Interactive");
    JLabel textResult5 = new JLabel("Congratulations on completing the questioning segment!");
    ThreeResult.add(textResult5);
    JLabel textResult6 = new JLabel("You might want to check out this link for further reading:");
    ThreeResult.add(textResult6);
    String link3Link = "https://www.weforum.org/agenda/2015/12/10-things-to-know-about-human-rights/";
    JTextArea textArea4 = new JTextArea(2, 40);
    textArea4.setText(link3Link);
    textArea4.setWrapStyleWord(true);
    textArea4.setLineWrap(true);
    textArea4.setOpaque(false);
    textArea4.setEditable(false);
    textArea4.setFocusable(false);
    ThreeResult.add(textArea4, BorderLayout.CENTER);
    ThreeResult.setSize(500, 500);
    ThreeResult.setLayout(new FlowLayout());
    ThreeResult.setResizable(false);
    ThreeResult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent ae) {
      String choice = ae.getActionCommand();
      if (choice.equals("Next")) {
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
    new finalProject();
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
