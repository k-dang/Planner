import java.io.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class CalendarModule extends JFrame implements ActionListener, ItemListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel cards;
	GregorianCalendar cal = new GregorianCalendar();
	int realDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
	int realMonth = cal.get(GregorianCalendar.MONTH);
	int realYear = cal.get(GregorianCalendar.YEAR); 
	final static String BUTTONPANEL = "Calendar";
	//
	final static String TEXTPANEL1 = "show holidays";
	final static String TEXTPANEL2 = "search holidays";
	final static String TEXTPANEL3 = "add a holiday";
	final static String TEXTPANEL4 = "remove a holiday";
	//
	final static String TEXTPANEL5 = "show birthdays";
	final static String TEXTPANEL6 = "search birthdays";
	final static String TEXTPANEL7 = "add a birthday";
	final static String TEXTPANEL8 = "remove a birthday";
	//
	final static String TEXTPANEL9 = "show other events";
	final static String TEXTPANEL10 = "search other events";
	final static String TEXTPANEL11 = "add an event";
	final static String TEXTPANEL12 = "remove an event";
	//
	int x;
	String delimeter = ",";
	JLabel date = new JLabel("Date:");
	JTextArea day = new JTextArea("Day " + realDay,1,10);
	JTextArea month = new JTextArea("Month " + realMonth++,1,10);
	JTextArea year = new JTextArea("Year " + realYear,1,10);

	//-----------------------------------------------------------
	JLabel showholiday1 = new JLabel("View ALL Holiday");
	JButton showholiday2 = new JButton("Click Me to Show Holiday");
	JTextArea showholiday3 = new JTextArea(20,10);

	JLabel searchholiday1 = new JLabel("Enter the Exact Name of Holiday to Search For with Capitals and no Spaces used in the name");
	JButton searchholiday2 = new JButton("Click Me to Search for Holiday");
	JTextArea searchholiday3 = new JTextArea("");

	JLabel addholiday1 = new JLabel("Enter the Data seperated by commas: Name of Holiday,The day,The Month");
	JButton addholiday2 = new JButton("Click to Add Holiday");
	JTextArea addholiday3 = new JTextArea("");

	JLabel removeholiday1 =new JLabel("Enter Name of Holiday to be removed");
	JButton removeholiday2 =new JButton("Click to Remove a Holiday");
	JTextArea removeholiday3 = new JTextArea("");

	//---------------------------------------------------------
	JLabel showbirthday1 = new JLabel("View All Birthdays");
	JButton showbirthday2 = new JButton("Click Me to Show Birthday");
	JTextArea showbirthday3 = new JTextArea(20,10);

	JLabel searchbirthday1 = new JLabel("To Search for Birthdays, Enter the Exact Name of Person and your Relationship to them ,with Capitals and any Spaces used in the name seperated with commas");
	JButton searchbirthday2 = new JButton("Click Me to Search for Birthdays");
	JTextArea searchbirthday3 = new JTextArea("");

	JLabel addbirthday1 = new JLabel("Enter the Data seperated by commas: Name of Person,Relationship with that person,The day,The Month");
	JButton addbirthday2 = new JButton("Click to Add a Birthday");
	JTextArea addbirthday3 = new JTextArea("");

	JLabel removebirthday1 =new JLabel("Enter the Data seperated by commas: Name of Person,Relationship with that person,The day,The Month");
	JButton removebirthday2 =new JButton("Click to Remove a Birthday");
	JTextArea removebirthday3 = new JTextArea("");    

	//----------------------------------------------------------
	JLabel showother1 = new JLabel("View All Events");
	JButton showother2 = new JButton("Click Me to Show Other Event");
	JTextArea showother3 = new JTextArea(20,10);

	JLabel searchother1 = new JLabel("Enter exact Name of Event to Search for ,with Capitals and any Spaces");
	JButton searchother2 = new JButton("Click Me to Search for an event");
	JTextArea searchother3 = new JTextArea("");

	JLabel addother1 = new JLabel("Enter the Data seperated by commas: Actions on day of event,Name of Event,The day,The Month");
	JButton addother2 = new JButton("Click to Add an event");
	JTextArea addother3 = new JTextArea("");

	JLabel removeother1 =new JLabel("Enter the Data seperated by commas: Actions on day of event,Name of Event,The day,The Month");
	JButton removeother2 =new JButton("Click to Remove an event");
	JTextArea removeother3 = new JTextArea(""); 

	//----------------------------------------------------------

	JPanel a = new JPanel();
	JPanel b = new JPanel();
	JPanel c = new JPanel();
	JPanel d = new JPanel();
	JPanel e = new JPanel();
	JPanel f = new JPanel();
	JPanel g = new JPanel();
	JPanel h = new JPanel();
	JPanel i = new JPanel();
	JPanel j = new JPanel();
	JPanel k = new JPanel();
	JPanel l = new JPanel();
	JPanel mainpanel = new JPanel();


	public void addComponentToPane(Container pane){
		a.setLayout(new BorderLayout(100,10));
		b.setLayout(new BorderLayout());
		c.setLayout(new BorderLayout());
		a.setLayout(new BorderLayout());
		b.setLayout(new BorderLayout());
		c.setLayout(new BorderLayout());
		d.setLayout(new BorderLayout());
		e.setLayout(new BorderLayout());
		f.setLayout(new BorderLayout());
		g.setLayout(new BorderLayout());
		h.setLayout(new BorderLayout());
		i.setLayout(new BorderLayout());
		j.setLayout(new BorderLayout());
		k.setLayout(new BorderLayout());
		l.setLayout(new BorderLayout());
		mainpanel.setLayout(new BorderLayout());
		//------------------------------------
		mainpanel.add(date,BorderLayout.NORTH);
		mainpanel.add(year,BorderLayout.EAST);
		mainpanel.add(month,BorderLayout.CENTER);
		mainpanel.add(day,BorderLayout.WEST);
		//------------------------------------
		a.add(showholiday1,BorderLayout.NORTH);
		a.add(showholiday2,BorderLayout.SOUTH);
		a.add(showholiday3,BorderLayout.CENTER);

		b.add(searchholiday1,BorderLayout.NORTH);
		b.add(searchholiday2,BorderLayout.SOUTH);
		b.add(searchholiday3,BorderLayout.CENTER);

		c.add(addholiday1,BorderLayout.NORTH);
		c.add(addholiday2,BorderLayout.SOUTH);
		c.add(addholiday3,BorderLayout.CENTER);

		d.add(removeholiday1,BorderLayout.NORTH);
		d.add(removeholiday2,BorderLayout.SOUTH);
		d.add(removeholiday3,BorderLayout.CENTER);
		//--------------------------------------
		e.add(showbirthday1,BorderLayout.NORTH);
		e.add(showbirthday2,BorderLayout.SOUTH);
		e.add(showbirthday3,BorderLayout.CENTER);

		f.add(searchbirthday1,BorderLayout.NORTH);
		f.add(searchbirthday2,BorderLayout.SOUTH);
		f.add(searchbirthday3,BorderLayout.CENTER);

		g.add(addbirthday1,BorderLayout.NORTH);
		g.add(addbirthday2,BorderLayout.SOUTH);
		g.add(addbirthday3,BorderLayout.CENTER);   

		h.add(removebirthday1,BorderLayout.NORTH);
		h.add(removebirthday2,BorderLayout.SOUTH);
		h.add(removebirthday3,BorderLayout.CENTER);
		//----------------------------------------
		i.add(showother1,BorderLayout.NORTH);
		i.add(showother2,BorderLayout.SOUTH);
		i.add(showother3,BorderLayout.CENTER);    

		j.add(searchother1,BorderLayout.NORTH);
		j.add(searchother2,BorderLayout.SOUTH);
		j.add(searchother3,BorderLayout.CENTER);

		k.add(addother1,BorderLayout.NORTH);
		k.add(addother2,BorderLayout.SOUTH);
		k.add(addother3,BorderLayout.CENTER);   

		l.add(removeother1,BorderLayout.NORTH);
		l.add(removeother2,BorderLayout.SOUTH);
		l.add(removeother3,BorderLayout.CENTER);
		//---------------------------------------

		getContentPane().add(a, BorderLayout.CENTER);
		getContentPane().add(b, BorderLayout.CENTER);
		getContentPane().add(c, BorderLayout.CENTER);
		getContentPane().add(d, BorderLayout.CENTER);
		getContentPane().add(e, BorderLayout.CENTER);
		getContentPane().add(f, BorderLayout.CENTER);
		getContentPane().add(g, BorderLayout.CENTER);
		getContentPane().add(h, BorderLayout.CENTER);
		getContentPane().add(i, BorderLayout.CENTER);
		getContentPane().add(j, BorderLayout.CENTER);
		getContentPane().add(k, BorderLayout.CENTER);
		getContentPane().add(l, BorderLayout.CENTER);

		//--------------------------------------
		showholiday2.addActionListener(this);
		searchholiday2.addActionListener(this);
		addholiday2.addActionListener(this);
		removeholiday2.addActionListener(this);

		showbirthday2.addActionListener(this);
		searchbirthday2.addActionListener(this);
		addbirthday2.addActionListener(this);
		removebirthday2.addActionListener(this);

		showother2.addActionListener(this);
		searchother2.addActionListener(this);
		addother2.addActionListener(this);
		removeother2.addActionListener(this);


		//---------------------------------------
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JPanel comboBoxPane = new JPanel(); 
		String comboBoxItems[] = { BUTTONPANEL,TEXTPANEL1,TEXTPANEL2,TEXTPANEL3,TEXTPANEL4,TEXTPANEL5,TEXTPANEL6,TEXTPANEL7,TEXTPANEL8,TEXTPANEL9,TEXTPANEL10,TEXTPANEL11,TEXTPANEL12};
		JComboBox<Object> cb = new JComboBox<Object>(comboBoxItems);
		cb.setEditable(false);
		cb.addItemListener(this);
		comboBoxPane.add(cb);


		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		JPanel card4 = new JPanel();
		JPanel card5 = new JPanel();
		JPanel card6 = new JPanel();
		JPanel card7 = new JPanel();
		JPanel card8 = new JPanel();
		JPanel card9 = new JPanel();
		JPanel card10 = new JPanel();
		JPanel card11 = new JPanel();
		JPanel card12 = new JPanel();
		JPanel card13 = new JPanel();

		card1.add(mainpanel);
		card2.add(a);
		card3.add(b);
		card4.add(c);
		card5.add(d);
		card6.add(e);
		card7.add(f);
		card8.add(g);
		card9.add(h);
		card10.add(i);
		card11.add(j);
		card12.add(k);
		card13.add(l);

		cards = new JPanel(new CardLayout());
		cards.add(card1, BUTTONPANEL);
		cards.add(card2, TEXTPANEL1);
		cards.add(card3, TEXTPANEL2);
		cards.add(card4, TEXTPANEL3);
		cards.add(card5, TEXTPANEL4);
		cards.add(card6, TEXTPANEL5);
		cards.add(card7, TEXTPANEL6);
		cards.add(card8, TEXTPANEL7);
		cards.add(card9, TEXTPANEL8);
		cards.add(card10, TEXTPANEL9);
		cards.add(card11, TEXTPANEL10);
		cards.add(card12, TEXTPANEL11);
		cards.add(card13, TEXTPANEL11);

		pane.add(comboBoxPane, BorderLayout.PAGE_START);
		pane.add(cards, BorderLayout.CENTER);
	}
	public void itemStateChanged(ItemEvent evt) {
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, (String)evt.getItem());
	}


	public void actionPerformed(ActionEvent a){
		Calendar c1 = new Calendar(2011);
		try{
			//c1.readinBirthday();
			c1.readinHoliday();
			//c1.readinOther();
			if(a.getSource() == showholiday2){
				showholiday3.setText("");
				
				for(int i= 0;i<c1.holiday.length;i++){
					showholiday3.append(c1.sortHoliday(c1.readinHoliday())[i].printInfo());
					if(i == c1.holiday.length-1){
					}else{
						showholiday3.append("\n");
					}
				}
			}else if(a.getSource() == showbirthday2){
				showbirthday3.setText("");
				for(int i = 0;i<c1.birthday.length;i++){
					showbirthday3.append(c1.sortBirthday(c1.birthday)[i].printInfo());
					if(i == c1.birthday.length-1){
					}else{
						showbirthday3.append("\n");
					}
				}
			}else if(a.getSource() == showother2){ 
				showother3.setText("");
				for(int i = 0;i<c1.other.length;i++){
					showother3.append(c1.sortOther(c1.other)[i].printInfo());
					if(i == c1.other.length-1){
					}else{
						showother3.append("\n");
					}
				}
			}else if(a.getSource() == searchholiday2){
				String b = searchholiday3.getText().trim();
				if(c1.searchHoliday(b,c1.sortHoliday(c1.holiday),0,c1.holiday.length) == -1){
					searchholiday3.setText("Holiday not found , try again");
				}else{
					searchholiday3.setText(c1.holiday[c1.searchHoliday(b,c1.sortHoliday(c1.holiday),0,c1.holiday.length)].printInfo());

				}
			}else if(a.getSource() == searchbirthday2){
				String []b = new String[2];
				b = searchbirthday3.getText().split(delimeter);
				if(c1.searchBirthday(b[0],b[1],c1.sortBirthday(c1.birthday),0,c1.birthday.length) == -1){
					searchbirthday3.setText("Birthday not found , try again");
				}else{
					searchbirthday3.setText(c1.holiday[c1.searchBirthday(b[0].trim(),b[1].trim(),c1.sortBirthday(c1.birthday),0,c1.birthday.length)].printInfo());
				}
			}else if(a.getSource() == searchother2){
				String b = searchother3.getText().trim();
				if(c1.searchOther(b,c1.sortOther(c1.other),0,c1.other.length) == -1){
					searchother3.setText("Event not found , try again");
				}else{
					searchother3.setText(c1.other[c1.searchOther(b,c1.sortOther(c1.other),0,c1.other.length)].printInfo());
				}
			}else if(a.getSource() == addholiday2){
				String []c = new String[2];
				c = addholiday3.getText().split(delimeter);
				int day1 = Integer.parseInt(c[1].trim());
				int month1 = Integer.parseInt(c[2].trim());
				c1.addHoliday(c[0].trim(),day1,month1);
				c1.writeoutHoliday();
				addholiday3.setText("Holiday added");
			}else if(a.getSource() == addbirthday2){
				String []c = new String[3];
				c = addbirthday3.getText().split(delimeter);
				int day1 = Integer.parseInt(c[2].trim());
				int month1 = Integer.parseInt(c[3].trim());
				c1.addBirthday(c[0].trim(),c[1].trim(),day1,month1);
				addholiday3.setText("Birthday added");
			}else if(a.getSource() == addother2){
				String []c = new String[3];
				c = addother3.getText().split(delimeter);
				int day1 = Integer.parseInt(c[2].trim());
				int month1 = Integer.parseInt(c[3].trim());
				c1.addBirthday(c[0].trim(),c[1].trim(),day1,month1);
				addholiday3.setText("Event added");
			}else if(a.getSource() == removeholiday2){
				String c = removeholiday3.getText();
				if(c1.searchHoliday(c,c1.holiday,0,c1.holiday.length) == -1){
					removeholiday3.setText("Holiday not found, try again");
				}else{
					c1.deleteHoliday(c1.searchHoliday(c,c1.holiday,0,c1.holiday.length));
					removeholiday3.setText("Hoiday removed");
					c1.writeoutHoliday();
				}
			}else if(a.getSource() == removebirthday2){
				String []c = new String[3];
				c = removebirthday3.getText().split(delimeter);
				if(c1.searchBirthday(c[0],c[1],c1.birthday,0,c1.holiday.length) == -1){
					removebirthday3.setText("Birthday not found, try again");
				}else{
					c1.deleteBirthday(c1.searchBirthday(c[0],c[1],c1.birthday,0,c1.holiday.length));
					removebirthday3.setText("Birthday removed");
					c1.writeoutBirthday();
				}
			}else if(a.getSource() == removeother2){
				String []c = new String[3];
				c = removeother3.getText().split(delimeter);
				if(c1.searchOther(c[0],c1.other,0,c1.holiday.length) == -1){
					removeother3.setText("Event not found, try again");
				}else{
					c1.deleteOther(c1.searchOther(c[0],c1.other,0,c1.holiday.length));
					removeother3.setText("Event removed");
					c1.writeoutOther();
				}


			}else{
				showholiday2.setText(" ");
			}
		}catch(IOException obj){
			System.out.println("failed");
		}



	}
	public static void main(String str[])throws IOException{

		JFrame frame = new JFrame("Calendar Module");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
		CalendarModule test = new CalendarModule();
		test.addComponentToPane(frame.getContentPane());

		frame.pack();
		frame.setSize (600, 500);
		frame.setVisible(true);
	}
}

