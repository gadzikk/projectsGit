package com.gadzik.command;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener {
	private List<String> namesOfdishesHistory = new ArrayList<>();
	private List<Dish> tasksForEmployees = new ArrayList<>();
	private JButton bOdbierzZamowienie , bShowHistory , bExecute , bRemove;
	private JLabel lBurger , lVegburger , lChicken , aBurgers , aVegburgers , aChickens ,
	label1 , label2 , label3 , label4;
	private JTextField tAmountOfBurger , tAmountofVegburger , tAmountofChicken;
	private JTextArea aHistory , aTasks;
	private int currentBurgers , currentVegburgers , currentChickens;
	private boolean checker , checker2;
	public Gui(){
		setTitle("Burgerking");
		setSize(800,550);
		setLayout(null);
		
		
		bOdbierzZamowienie = new JButton("Take Order");
		bOdbierzZamowienie.setBounds(650, 100, 120, 30);
		add(bOdbierzZamowienie);
		bOdbierzZamowienie.addActionListener(this);
		
		bShowHistory = new JButton("show history");
		bShowHistory.setBounds(50, 200, 120, 30);
		add(bShowHistory);
		bShowHistory.addActionListener(this);
		
		bExecute = new JButton("execute");
		bExecute.setBounds(500, 200, 100, 30);
		add(bExecute);
		bExecute.addActionListener(this);
		
		bRemove = new JButton("X");
		bRemove.setBounds(350, 200, 50, 30);
		add(bRemove);
		bRemove.addActionListener(this);
		
		
		lBurger = new JLabel("Burgers");
		lBurger.setBounds(610, 10, 80, 20);;
		add(lBurger);
		
		tAmountOfBurger = new JTextField("0");
		tAmountOfBurger.setBounds(680, 10, 80, 20);;
		add(tAmountOfBurger);

		lVegburger = new JLabel("Vegburgers");
		lVegburger.setBounds(610, 40, 80, 20);;
		add(lVegburger);
		
		tAmountofVegburger = new JTextField("0");
		tAmountofVegburger.setBounds(680, 40, 80, 20);;
		add(tAmountofVegburger);

		lChicken = new JLabel("Chickens");
		lChicken.setBounds(610, 70, 80, 20);;
		add(lChicken);
		
		tAmountofChicken = new JTextField("0");
		tAmountofChicken.setBounds(680, 70, 80, 20);;
		add(tAmountofChicken);
		
		aHistory = new JTextArea();
		aHistory.setBounds(50, 250, 400, 200);
		add(aHistory);
		
		aTasks = new JTextArea();
		aTasks.setBounds(500, 250, 100, 250);
		add(aTasks);
		
		aBurgers = new JLabel("0");
		aBurgers.setBounds(100, 470, 20, 20);
		add(aBurgers);
		
		aVegburgers = new JLabel("0");
		aVegburgers.setBounds(250, 470, 20, 20);
		add(aVegburgers);
		
		aChickens = new JLabel("0");
		aChickens.setBounds(400, 470, 20, 20);
		add(aChickens);
		
		label1 = new JLabel("Burgers :");
		label1.setBounds(40, 470, 100, 20);
		add(label1);
		
		label2 = new JLabel("Vegburgers :");
		label2.setBounds(170, 470, 100, 20);
		add(label2);
		
		label3 = new JLabel("Chickens :");
		label3.setBounds(330, 470, 100, 20);
		add(label3);
		
		label4 = new JLabel("Dishes ordered in the day");
		label4.setBounds(40, 450, 300, 20);
		add(label4);
	}
	public static void main(String[] args)
	{
		Gui app = new Gui();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
				if(z==bOdbierzZamowienie){
					
					if(getAmoutofBurgers()>0)
					{
						for(int i=0;i<getAmoutofBurgers();i++)
						{
							
							namesOfdishesHistory.add("Burger" +" "+ new Date().toString());
							currentBurgers++;
							aBurgers.setText(String.valueOf(currentBurgers));
							tasksForEmployees.add(new Burger());
							storyTasksForEmployees();
							
						}

					}
					if(getAmoutofVegburgers()>0)
					{
						for(int i=0;i<getAmoutofVegburgers();i++)
						{
							namesOfdishesHistory.add("Vegburger" +" "+ new Date().toString());
							currentVegburgers++;
							aVegburgers.setText(String.valueOf(currentVegburgers));
							tasksForEmployees.add(new Vegburger());
							storyTasksForEmployees();
						}

					}
					if(getAmoutofChickens()>0)
					{
						for(int i=0;i<getAmoutofChickens();i++)
						{
							namesOfdishesHistory.add("Chicken" +" "+ new Date().toString());
							currentChickens++;
							aChickens.setText(String.valueOf(currentChickens));
							tasksForEmployees.add(new Chicken());
							storyTasksForEmployees();
						}

					}
					tAmountOfBurger.setText("0");  tAmountofVegburger.setText("0");  tAmountofChicken.setText("0");
				}
				if(z==bShowHistory){
					if(checker){
					aHistory.setText("");
					for(String s : namesOfdishesHistory)
					{aHistory.append(s+ "\n");}
					}
					else{
						for(String s : namesOfdishesHistory)
						{aHistory.append(s+ "\n");}
					checker=true;
					}
				
					
				}
				if(z==bExecute){
					if(tasksForEmployees.size()>0){
					tasksForEmployees.get(0).execute();
					tasksForEmployees.remove(0);
					aTasks.setText("");
					int index=1;
					for(Dish s : tasksForEmployees){
					aTasks.append(index + ": " + s.getName() + "\n");
					index++;
					}
					}
					else{
						System.out.println("no of tasks");
					}
				}
				if(z==bRemove){
					removeHistoryAndDetails();
				}
				
		
			
			
		}
	public int getAmoutofBurgers(){
		int a = Integer.parseInt((tAmountOfBurger.getText().toString()));
		return a;
	}
	public int getAmoutofVegburgers(){
		int b = Integer.parseInt((tAmountofVegburger.getText().toString()));
		return b;
	}
	public int getAmoutofChickens(){
		int c = Integer.parseInt((tAmountofChicken.getText().toString()));
		return c;
	}
	public void storyTasksForEmployees(){
		if(checker2){
			aTasks.setText("");
			int index=1;
			for(Dish s : tasksForEmployees){
			aTasks.append(index + ": " + s.getName() + "\n");
			index++;
			}
			}
			else{
				int index=1;
				for(Dish s : tasksForEmployees){
			    aTasks.append(index + ": " + s.getName() + "\n");
				index++;
				}
			checker2=true;
			}
	}
	public void removeHistoryAndDetails(){
		aHistory.setText("");
		namesOfdishesHistory.clear();
		currentBurgers=0; currentChickens=0 ; currentVegburgers =0;
		aBurgers.setText("0");
		aVegburgers.setText("0");
		aChickens.setText("0");
	}
		
}

	
		
	



