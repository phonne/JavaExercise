import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultComboBoxModel;

public class exercise1 extends JFrame {

	private JPanel mainContentPane;
	private JLabel lblInput;
	private JButton btnNewButton;
	private JTextField txtFirstInput;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNetRate;
	private JRadioButton rdbtnLocalRate;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					exercise1 frame = new exercise1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public exercise1() {
		
		initComponents();
		createEvents();

	}

	/*
	 * this method contains all of the code for creating events
	 */
	private void createEvents() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, txtFirstInput.getText());
				txtFirstInput.setText(txtFirstInput.getText() + "has been convert");
				
			}
		});

		// TODO Auto-generated method stub

	}
	/*
	 * this method contains all of the code for creating events and initalizing
	 * components
	 */

	private void initComponents() {
		// TODO Auto-generated method stub
		setTitle("Currency\tConverter");
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 402);
		mainContentPane = new JPanel();
		mainContentPane.setBackground(Color.GRAY);
		mainContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainContentPane);
		
		btnNewButton = new JButton("Convert");
		
		
		JComboBox incbBox = new JComboBox();
		incbBox.setModel(new DefaultComboBoxModel(new String[] {"GBP", "USD", "YEN", "EU"}));
		
		lblInput = new JLabel("Input:");
		
		txtFirstInput = new JTextField();
		txtFirstInput.setColumns(10);
		
		JLabel lblMethod = new JLabel("Method");
		
		rdbtnNetRate = new JRadioButton("Net Rate");
		rdbtnNetRate.setSelected(true);
		buttonGroup.add(rdbtnNetRate);
		
		rdbtnLocalRate = new JRadioButton("Local Rate");
		buttonGroup.add(rdbtnLocalRate);
		
		JLabel lblOutput = new JLabel("Output");
		
		textArea = new JTextArea();
		textArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JComboBox outcbBox = new JComboBox();
		outcbBox.setModel(new DefaultComboBoxModel(new String[] {"GBP", "USD", "YEN", "EU"}));
		outcbBox.setSelectedIndex(2);
		GroupLayout gl_mainContentPane = new GroupLayout(mainContentPane);
		gl_mainContentPane.setHorizontalGroup(
			gl_mainContentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mainContentPane.createSequentialGroup()
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_mainContentPane.createSequentialGroup()
							.addContainerGap(416, Short.MAX_VALUE)
							.addComponent(btnNewButton))
						.addGroup(gl_mainContentPane.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mainContentPane.createSequentialGroup()
									.addGroup(gl_mainContentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblMethod)
										.addComponent(lblInput))
									.addGap(18)
									.addGroup(gl_mainContentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_mainContentPane.createSequentialGroup()
											.addComponent(rdbtnNetRate)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(rdbtnLocalRate))
										.addGroup(gl_mainContentPane.createSequentialGroup()
											.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_mainContentPane.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
												.addComponent(txtFirstInput, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
											.addGap(57)
											.addGroup(gl_mainContentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(incbBox, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
												.addComponent(outcbBox, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))))
								.addComponent(lblOutput))))
					.addContainerGap())
		);
		gl_mainContentPane.setVerticalGroup(
			gl_mainContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainContentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblInput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtFirstInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(incbBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMethod)
						.addComponent(rdbtnNetRate)
						.addComponent(rdbtnLocalRate))
					.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOutput)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(outcbBox, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(67)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		mainContentPane.setLayout(gl_mainContentPane);

	}
}
