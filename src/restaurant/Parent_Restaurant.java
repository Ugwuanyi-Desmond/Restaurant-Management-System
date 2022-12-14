package restaurant;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Parent_Restaurant {
	
	public double itemCost1;
	public double itemCost2;
	public double itemCost3;

	public double fishBarbeque;
	public double turkeyMeat;
	public double porkMeat;
	public double bushMeat;

	public double friedRice;
	public double jollofRice;
	public double ukwa;
	public double achicha;

	public double pfishBarbeque = 09.50;
	public double pturkeyMeat = 11.80;
	public double pporkMeat = 01.00;
	public double pbushMeat = 10.40;

	public double pfriedRice = 04.00;
	public double pjollofRice = 3.50;
	public double pukwa = 7.00;
	public double pachicha = 5.30;

	public double GetAmount()
	{
		itemCost1 = fishBarbeque + turkeyMeat + porkMeat + bushMeat;
		itemCost2 = friedRice + jollofRice + ukwa + achicha;
		itemCost3 = itemCost1 + itemCost2;
		return itemCost3;
	}
	private JFrame frame;
	
	public void iExitSystem()
	{
		frame = new JFrame();
		
		int i = JOptionPane.showConfirmDialog(frame, "Are You Sure You Want To Exit?", 
				"Restaurant Management System", JOptionPane.WARNING_MESSAGE);
		if (i == 0)
		{
			System.exit(0);
		}
		
	}
	public double mcTax = 0.75;

	public Double cFindTax(double cAmount) {
		double FindTax = cAmount - (cAmount * mcTax);
		return FindTax;
	}
	
	public void numbersOnly(java.awt.event.KeyEvent evt)
	{
		char iNumber = evt.getKeyChar();
		if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE))
		{
			evt.consume();
		}
	}

}



