package de.buw.se4de;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class AddWrkExp implements ActionListener {
	private int componentCounter;
    private JPanel contentPanel;
    private GridBagConstraints gbc;
    private JTextField JTField;
    private JTextField CMField;
    private JTextField POEField;
    private JTextField JDField;
    //private int currentGridy;
    //private CV_GUI cvGui;
	

	public AddWrkExp(JPanel contentPanel, GridBagConstraints gbc, JTextField JTField, JTextField CMField, JTextField POEField, JTextField JDField) {
		
		this.contentPanel = contentPanel;
        this.gbc = gbc;
        this.JTField = JTField;
        this.CMField = CMField;
        this.POEField = POEField;
        this.JDField = JDField;
        this.componentCounter = 2;
        //this.currentGridy = currentGridy;
        //this.cvGui = cvGui;
	
	}
    
	//public void setCurrentGridy(int currentGridy) {
	//    this.currentGridy = currentGridy;
	//}
	
	
	//public int getCurrentGridy() {
	//    return currentGridy;
	//}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//getCurrentGridy();
		//gbc.gridy = currentGridy;
		JLabel LabelWrkexp = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++;
		gbc.weightx = 1;
		gbc.gridwidth = 2;
		LabelWrkexp.setText("Work Experience" + componentCounter);
		LabelWrkexp.setForeground(new Color(255, 255, 255));
		LabelWrkexp.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
		LabelWrkexp.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		LabelWrkexp.setBackground(new Color(128, 128, 128));
		LabelWrkexp.setOpaque(true);
		LabelWrkexp.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelWrkexp, gbc);

		JLabel LabelJobTitle = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelJobTitle.setText("Job Title");
		LabelJobTitle.setForeground(Color.BLACK);
		LabelJobTitle.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelJobTitle.setBorder(BorderFactory.createEmptyBorder());
		LabelJobTitle.setBackground(Color.WHITE);
		LabelJobTitle.setOpaque(true);
		LabelJobTitle.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelJobTitle, gbc);

		JTField = new JTextField();
		gbc.gridx = 1;
		//gbc.gridy = gbc.gridy;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		JTField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		JTField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		JTField.setBackground(new Color(192, 192, 192));
		contentPanel.add(JTField, gbc);

		JLabel LabelCompany = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelCompany.setText("Company Name");
		LabelCompany.setForeground(Color.BLACK);
		LabelCompany.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelCompany.setBorder(BorderFactory.createEmptyBorder());
		LabelCompany.setBackground(Color.WHITE);
		LabelCompany.setOpaque(true);
		LabelCompany.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelCompany, gbc);

		CMField = new JTextField();
		gbc.gridx = 1;
		//gbc.gridy = gbc.gridy;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		CMField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		CMField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		CMField.setBackground(new Color(192, 192, 192));
		contentPanel.add(CMField, gbc);

		JLabel LabelPOE = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelPOE.setText("Period of Experience");
		LabelPOE.setForeground(Color.BLACK);
		LabelPOE.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelPOE.setBorder(BorderFactory.createEmptyBorder());
		LabelPOE.setBackground(Color.WHITE);
		LabelPOE.setOpaque(true);
		LabelPOE.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelPOE, gbc);

		POEField = new JTextField();
		gbc.gridx = 1;
		//gbc.gridy = gbc.gridy;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		POEField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		POEField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		POEField.setBackground(new Color(192, 192, 192));
		contentPanel.add(POEField, gbc);

		JLabel LabelJobD = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelJobD.setText("Job Description");
		LabelJobD.setForeground(Color.BLACK);
		LabelJobD.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelJobD.setBorder(BorderFactory.createEmptyBorder());
		LabelJobD.setBackground(Color.WHITE);
		LabelJobD.setOpaque(true);
		LabelJobD.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelJobD, gbc);

		JDField = new JTextField();
		gbc.gridx = 1;
		//gbc.gridy = gbc.gridy;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		JDField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		JDField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		JDField.setBackground(new Color(192, 192, 192));
		contentPanel.add(JDField, gbc);
		
		contentPanel.revalidate(); // Refresh the panel to reflect the changes
        contentPanel.repaint();
        
		//currentGridy = gbc.gridy;
		
		//Component[] components = contentPanel.getComponents();
	  //  for (Component component : components) {
	  //      GridBagConstraints constraints = ((GridBagLayout) contentPanel.getLayout()).getConstraints(component);
	 //       if (constraints.gridy >= currentGridy) {
	 //           constraints.gridy += 5; // Increment by 2 to make space for work experience fields
	  //      }
	  //  }

	  //  ((GridBagLayout) contentPanel.getLayout()).layoutContainer(contentPanel);
	  //  System.out.println("New gbc.gridy value: " + gbc.gridy);
		
        componentCounter++;
		
        
    }
}