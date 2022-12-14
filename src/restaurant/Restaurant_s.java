package restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Restaurant_s {

	private JFrame frame;
	private JTextField txtFish;
	private JTextField txtTurkey;
	private JTextField txtPork;
	private JTextField txtBush;
	private JTextField txtAchicha;
	private JTextField txtUkwa;
	private JTextField txtJollof;
	private JTextField txtFried;
	private JTextField txtCostOfMeat;
	private JTextField txtCostOfFood;
	private JTextField txtTax;
	private JTextField txtSubtotal;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant_s window = new Restaurant_s();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant_s() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 102, 0));
		frame.setBounds(0, 0, 1360, 800);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 102, 0));
		panel.setBorder(new LineBorder(new Color(119, 136, 153), 13));
		panel.setBounds(0, 0, 1360, 122);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new LineBorder(new Color(255, 255, 255), 13));
		lblNewLabel.setBounds(101, 11, 1156, 100);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\servidooricon.PNG"));
		lblNewLabel_1.setBounds(10, 11, 92, 100);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\servidooricon.PNG"));
		lblNewLabel_2.setBounds(1255, 11, 95, 100);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128), 12));
		panel_1.setBackground(new Color(204, 102, 0));
		panel_1.setBounds(0, 133, 1360, 425);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(671, 11, 8, 238);
		panel_1.add(separator);
		separator.setForeground(new Color(0, 128, 128));
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 128, 128));
		separator_1.setBounds(0, 11, 673, 9);
		panel_1.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(0, 128, 128));
		separator_1_1.setBounds(0, 50, 673, 9);
		panel_1.add(separator_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(new Color(0, 128, 128));
		separator_1_2.setBounds(0, 100, 673, 9);
		panel_1.add(separator_1_2);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setForeground(new Color(0, 128, 128));
		separator_1_3.setBounds(0, 150, 673, 9);
		panel_1.add(separator_1_3);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setForeground(new Color(0, 128, 128));
		separator_1_4.setBounds(0, 200, 673, 9);
		panel_1.add(separator_1_4);
		
		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setForeground(new Color(0, 128, 128));
		separator_1_5.setBounds(671, 50, 689, 9);
		panel_1.add(separator_1_5);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(new Color(0, 128, 128));
		separator_1_1_1.setBounds(671, 11, 689, 9);
		panel_1.add(separator_1_1_1);
		
		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setForeground(new Color(0, 128, 128));
		separator_1_1_2.setBounds(671, 100, 689, 9);
		panel_1.add(separator_1_1_2);
		
		JSeparator separator_1_1_3 = new JSeparator();
		separator_1_1_3.setForeground(new Color(0, 128, 128));
		separator_1_1_3.setBounds(671, 150, 689, 9);
		panel_1.add(separator_1_1_3);
		
		JSeparator separator_1_1_4 = new JSeparator();
		separator_1_1_4.setForeground(new Color(0, 128, 128));
		separator_1_1_4.setBounds(671, 200, 689, 9);
		panel_1.add(separator_1_1_4);
		
		JLabel lblFishBarbeque = new JLabel("Fish Berbeque");
		lblFishBarbeque.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblFishBarbeque.setBounds(25, 20, 178, 27);
		panel_1.add(lblFishBarbeque);
		
		txtFish = new JTextField();
		txtFish.setForeground(Color.DARK_GRAY);
		txtFish.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtFish.setHorizontalAlignment(SwingConstants.CENTER);
		txtFish.setText("0");
		txtFish.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.numbersOnly(e);
			}
		});
		txtFish.setBounds(309, 20, 276, 27);
		panel_1.add(txtFish);
		txtFish.setColumns(10);
		
		JLabel lblTurkey = new JLabel("Turkey Meat");
		lblTurkey.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTurkey.setBounds(25, 62, 178, 27);
		panel_1.add(lblTurkey);
		
		JLabel lblPork = new JLabel("Pork Meat");
		lblPork.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblPork.setBounds(25, 112, 178, 27);
		panel_1.add(lblPork);
		
		JLabel lblBushMeat = new JLabel("Bush Meat");
		lblBushMeat.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblBushMeat.setBounds(25, 162, 178, 27);
		panel_1.add(lblBushMeat);
		
		txtTurkey = new JTextField();
		txtTurkey.setForeground(Color.DARK_GRAY);
		txtTurkey.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtTurkey.setHorizontalAlignment(SwingConstants.CENTER);
		txtTurkey.setText("0");
		txtTurkey.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.numbersOnly(e);
			}
		});
		txtTurkey.setColumns(10);
		txtTurkey.setBounds(309, 62, 276, 27);
		panel_1.add(txtTurkey);
		
		txtPork = new JTextField();
		txtPork.setForeground(Color.DARK_GRAY);
		txtPork.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtPork.setHorizontalAlignment(SwingConstants.CENTER);
		txtPork.setText("0");
		txtPork.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.numbersOnly(e);
			}
		});
		txtPork.setColumns(10);
		txtPork.setBounds(309, 112, 276, 27);
		panel_1.add(txtPork);
		
		txtBush = new JTextField();
		txtBush.setForeground(Color.DARK_GRAY);
		txtBush.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtBush.setHorizontalAlignment(SwingConstants.CENTER);
		txtBush.setText("0");
		txtBush.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.numbersOnly(e);
			}
		});		txtBush.setColumns(10);
		txtBush.setBounds(309, 162, 276, 27);
		panel_1.add(txtBush);
		
		JLabel lblFriedRice = new JLabel("Fried Rice");
		lblFriedRice.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblFriedRice.setBounds(689, 20, 178, 27);
		panel_1.add(lblFriedRice);
		
		JLabel lblJollofRice = new JLabel("Jollof Rice");
		lblJollofRice.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblJollofRice.setBounds(689, 62, 178, 27);
		panel_1.add(lblJollofRice);
		
		JLabel lblUkwa = new JLabel("Ukwa");
		lblUkwa.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblUkwa.setBounds(689, 112, 178, 27);
		panel_1.add(lblUkwa);
		
		JLabel lblAchicha = new JLabel("Achicha");
		lblAchicha.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblAchicha.setBounds(689, 162, 178, 27);
		panel_1.add(lblAchicha);
		
		txtAchicha = new JTextField();
		txtAchicha.setForeground(Color.DARK_GRAY);
		txtAchicha.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtAchicha.setHorizontalAlignment(SwingConstants.CENTER);
		txtAchicha.setText("0");
		txtAchicha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.numbersOnly(e);
			}
		});
		txtAchicha.setColumns(10);
		txtAchicha.setBounds(973, 162, 276, 27);
		panel_1.add(txtAchicha);
		
		txtUkwa = new JTextField();
		txtUkwa.setForeground(Color.DARK_GRAY);
		txtUkwa.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtUkwa.setHorizontalAlignment(SwingConstants.CENTER);
		txtUkwa.setText("0");
		txtUkwa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.numbersOnly(e);
			}
		});
		txtUkwa.setColumns(10);
		txtUkwa.setBounds(973, 112, 276, 27);
		panel_1.add(txtUkwa);
		
		txtJollof = new JTextField();
		txtJollof.setForeground(Color.DARK_GRAY);
		txtJollof.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtJollof.setHorizontalAlignment(SwingConstants.CENTER);
		txtJollof.setText("0");
		txtJollof.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.numbersOnly(e);
			}
		});
		txtJollof.setColumns(10);
		txtJollof.setBounds(973, 62, 276, 27);
		panel_1.add(txtJollof);
		
		txtFried = new JTextField();
		txtFried.setForeground(Color.DARK_GRAY);
		txtFried.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtFried.setHorizontalAlignment(SwingConstants.CENTER);
		txtFried.setText("0");
		txtFried.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.numbersOnly(e);
			}
		});
		txtFried.setColumns(10);
		txtFried.setBounds(973, 20, 276, 27);
		panel_1.add(txtFried);
		
		JSeparator separator_1_4_1 = new JSeparator();
		separator_1_4_1.setForeground(new Color(0, 128, 128));
		separator_1_4_1.setBounds(0, 250, 673, 9);
		panel_1.add(separator_1_4_1);
		
		JSeparator separator_1_4_1_1 = new JSeparator();
		separator_1_4_1_1.setForeground(new Color(0, 128, 128));
		separator_1_4_1_1.setBounds(671, 250, 689, 9);
		panel_1.add(separator_1_4_1_1);
		
		JLabel lblCostOfMeat = new JLabel("Cost of Meat");
		lblCostOfMeat.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCostOfMeat.setBounds(25, 212, 178, 27);
		panel_1.add(lblCostOfMeat);
		
		txtCostOfMeat = new JTextField();
		txtCostOfMeat.setEditable(false);
		txtCostOfMeat.setForeground(Color.DARK_GRAY);
		txtCostOfMeat.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtCostOfMeat.setHorizontalAlignment(SwingConstants.CENTER);
		txtCostOfMeat.setText("0");
		txtCostOfMeat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			Child_Restaurant iNum = new Child_Restaurant();
			iNum.numbersOnly(e);
			}
		});
		txtCostOfMeat.setColumns(10);
		txtCostOfMeat.setBounds(309, 212, 276, 27);
		panel_1.add(txtCostOfMeat);
		
		JLabel lblCostOfFood = new JLabel("Cost of Food");
		lblCostOfFood.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCostOfFood.setBounds(689, 212, 178, 27);
		panel_1.add(lblCostOfFood);
		
		txtCostOfFood = new JTextField();
		txtCostOfFood.setEditable(false);
		txtCostOfFood.setForeground(Color.DARK_GRAY);
		txtCostOfFood.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtCostOfFood.setHorizontalAlignment(SwingConstants.CENTER);
		txtCostOfFood.setText("0");
		txtCostOfFood.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			Child_Restaurant iNum = new Child_Restaurant();
			iNum.numbersOnly(e);
			}
		});
		txtCostOfFood.setColumns(10);
		txtCostOfFood.setBounds(973, 212, 276, 27);
		panel_1.add(txtCostOfFood);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTax.setBounds(25, 270, 178, 27);
		panel_1.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblSubtotal.setBounds(25, 320, 178, 27);
		panel_1.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTotal.setBounds(25, 370, 178, 27);
		panel_1.add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setForeground(Color.DARK_GRAY);
		txtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtTax.setText("0");
		txtTax.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtTax.setColumns(10);
		txtTax.setBounds(309, 270, 276, 27);
		panel_1.add(txtTax);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setForeground(Color.DARK_GRAY);
		txtSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubtotal.setText("0");
		txtSubtotal.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(309, 320, 276, 27);
		panel_1.add(txtSubtotal);
		
		txtTotal = new JTextField();
		txtTotal.setForeground(Color.DARK_GRAY);
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setText("0");
		txtTotal.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		txtTotal.setColumns(10);
		txtTotal.setBounds(309, 370, 276, 27);
		panel_1.add(txtTotal);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Child_Restaurant itemCost = new Child_Restaurant();
				double iTax, iSubtotal, iTotal;
				
				itemCost.fishBarbeque = itemCost.pfishBarbeque * Double.parseDouble(txtFish.getText());				
				itemCost.turkeyMeat = itemCost.pturkeyMeat * Double.parseDouble(txtTurkey.getText());
				itemCost.porkMeat = itemCost.pporkMeat * Double.parseDouble(txtPork.getText());
				itemCost.bushMeat = itemCost.pbushMeat * Double.parseDouble(txtBush.getText());
				
				itemCost.friedRice = itemCost.pfriedRice * Double.parseDouble(txtFried.getText());
				itemCost.jollofRice = itemCost.pjollofRice * Double.parseDouble(txtJollof.getText());
				itemCost.ukwa = itemCost.pukwa * Double.parseDouble(txtUkwa.getText());
				itemCost.achicha = itemCost.pachicha * Double.parseDouble(txtAchicha.getText());
				
				iSubtotal = itemCost.GetAmount();
				iTax = itemCost.cFindTax(iSubtotal);
				iTotal = iSubtotal + iTax;
				
				String Subtotal = String.format("$%.2f", iSubtotal);
				txtSubtotal.setText(Subtotal);
				
				String Tax = String.format("$%.2f", iTax);
				txtTax.setText(Tax);				
				
				String Total = String.format("$%.2f", iTotal);
				txtTotal.setText(Total);
				
				String costOfMeal = String.format("$%.2f", itemCost.itemCost1);
				txtCostOfMeat.setText(costOfMeal);				
				
				String costOfFood = String.format("$%.2f", itemCost.itemCost2);
				txtCostOfFood.setText(costOfFood);
				
				
//₦
				
			}
		});
		btnTotal.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnTotal.setFocusable(false);
		btnTotal.setBackground(new Color(204, 153, 51));
		btnTotal.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		btnTotal.setBounds(689, 320, 135, 63);
		panel_1.add(btnTotal);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField clearText = null;
				for(java.awt.Component c:panel_1.getComponents()) {
					
					if(c.getClass().toString().contains("javax.swing.JTextField"))
					{
						clearText = (JTextField)c;
						clearText.setText("0");
					}
				}
				
				/*
				 * textField.setText("0"); textField_1.setText("0"); textField_2.setText("0");
				 * textField_3.setText("0"); textField_4.setText("0"); textField_5.setText("0");
				 * textField_6.setText("0"); textField_7.setText("0");
				 */
			}
		});
		btnClear.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear.setFocusable(false);
		btnClear.setBackground(new Color(204, 153, 51));
		btnClear.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		btnClear.setBounds(916, 320, 135, 63);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Child_Restaurant iExit = new Child_Restaurant();
				iExit.iExitSystem();
			}
		});
		btnExit.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnExit.setFocusable(false);
		btnExit.setBackground(new Color(204, 153, 51));
		btnExit.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		btnExit.setBounds(1114, 320, 135, 63);
		panel_1.add(btnExit);
	}
}
