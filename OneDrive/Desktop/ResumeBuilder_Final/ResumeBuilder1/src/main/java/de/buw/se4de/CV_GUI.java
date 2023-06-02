package de.buw.se4de;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.border.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.Image;

import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.util.GregorianCalendar;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.*;
import com.itextpdf.text.List;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import com.itextpdf.text.Rectangle;


public class CV_GUI {

	private static JTextField NameField;
	private static JTextField Headline;
	private static JTextField mailField;
	private static JTextField AddressField;
	private static JTextField DOFField;
	private static JTextField PhoneField;
	private static JTextField JTField;
	private static JTextField CMField;
	private static JTextField POEField;
	private static JTextField JDField;
	private static JTextField DEGREEField;
	private static JTextField UniField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private String picturePath="";
	private ImageIcon imageIcon;
	private JPanel contentPanel;
	private GridBagConstraints gbc;
	//private int currentGridy = 12;
	//private CV_GUI cvGui;
	
	//public int getCurrentGridy() {
     //   return currentGridy;
   // }

   // public void setCurrentGridy(int currentGridy) {
    //    this.currentGridy = currentGridy;
   // }

    public JPanel getContentPanel() {
        return contentPanel;
    }

	public CV_GUI() {
		JPanel contentPanel = new JPanel(new GridBagLayout());
		contentPanel.setBackground(Color.white);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		
		JScrollPane scrollPane = new JScrollPane(contentPanel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    //scrollPane.setPreferredSize(new Dimension(1200, 1200));
		Dimension preferredSize = contentPanel.getPreferredSize();
		scrollPane.setPreferredSize(new Dimension(preferredSize.width + 20, preferredSize.height + 20));
	    
	    final JFrame frame = new JFrame();
	    frame.setTitle("Resume Builder Application");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setResizable(true);
	    //frame.setSize(1200, 1200);
	    frame.getContentPane().setBackground(Color.GRAY);
	    frame.getContentPane().setLayout(new BorderLayout());
	    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);


//----------------------Adding Personal Information--------------------------------------
		
		JLabel Label1 = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.gridwidth = 2;
		Label1.setText("PERSONAL INFORMATION");
		Label1.setForeground(new Color(255, 255, 255));
		Label1.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 20));
		Label1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		Label1.setBackground(new Color(128, 128, 128));
		Label1.setOpaque(true);
		Label1.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(Label1, gbc);
		
		JLabel LabelHeadline = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		LabelHeadline.setText("Headline for your CV");
		LabelHeadline.setForeground(Color.BLACK);
		LabelHeadline.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelHeadline.setBorder(BorderFactory.createEmptyBorder());
		LabelHeadline.setBackground(Color.WHITE);
		LabelHeadline.setOpaque(true);
		LabelHeadline.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelHeadline, gbc);
		
		Headline = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		Headline.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		Headline.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		Headline.setBackground(Color.LIGHT_GRAY);
		contentPanel.add(Headline, gbc);
		

		JLabel LabelName = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		LabelName.setText("Full name");
		LabelName.setForeground(Color.BLACK);
		LabelName.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelName.setBorder(BorderFactory.createEmptyBorder());
		LabelName.setBackground(Color.WHITE);
		LabelName.setOpaque(true);
		LabelName.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelName, gbc);

		NameField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		NameField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		NameField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		NameField.setBackground(new Color(192, 192, 192));
		contentPanel.add(NameField, gbc);

		JLabel Labelmail = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		Labelmail.setText("E-mail Address");
		Labelmail.setForeground(Color.BLACK);
		Labelmail.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		Labelmail.setBorder(BorderFactory.createEmptyBorder());
		Labelmail.setBackground(Color.WHITE);
		Labelmail.setOpaque(true);
		Labelmail.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(Labelmail, gbc);

		mailField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		mailField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		mailField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		mailField.setBackground(new Color(192, 192, 192));
		contentPanel.add(mailField, gbc);

		JLabel LabelAddress = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelAddress.setText("Address");
		LabelAddress.setForeground(Color.BLACK);
		LabelAddress.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelAddress.setBorder(BorderFactory.createEmptyBorder());
		LabelAddress.setBackground(Color.WHITE);
		LabelAddress.setOpaque(true);
		LabelAddress.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelAddress, gbc);

		AddressField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		AddressField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		AddressField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		AddressField.setBackground(new Color(192, 192, 192));
		contentPanel.add(AddressField, gbc);

		JLabel LabelPhone = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelPhone.setText("Contact information");
		LabelPhone.setForeground(Color.BLACK);
		LabelPhone.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelPhone.setBorder(BorderFactory.createEmptyBorder());
		LabelPhone.setBackground(Color.WHITE);
		LabelPhone.setOpaque(true);
		LabelPhone.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelPhone, gbc);

		PhoneField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		PhoneField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		PhoneField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		PhoneField.setBackground(new Color(192, 192, 192));
		contentPanel.add(PhoneField, gbc);

		JLabel LabelDOF = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelDOF.setText("Date of Birth");
		LabelDOF.setForeground(Color.BLACK);
		LabelDOF.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelDOF.setBorder(BorderFactory.createEmptyBorder());
		LabelDOF.setBackground(Color.WHITE);
		LabelDOF.setOpaque(true);
		LabelDOF.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelDOF, gbc);

		DOFField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		DOFField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		DOFField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		DOFField.setBackground(new Color(192, 192, 192));
		contentPanel.add(DOFField, gbc);

//----------------------Adding Work Experience------------------------------------------------

		JLabel LabelWrkexp = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.weightx = 1;
		gbc.gridwidth = 2;
		LabelWrkexp.setText("Work Experience");
		LabelWrkexp.setForeground(new Color(255, 255, 255));
		LabelWrkexp.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
		LabelWrkexp.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		LabelWrkexp.setBackground(new Color(128, 128, 128));
		LabelWrkexp.setOpaque(true);
		LabelWrkexp.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelWrkexp, gbc);

		JLabel LabelJobTitle = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 8;
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
		gbc.gridy = 8;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		JTField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		JTField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		JTField.setBackground(new Color(192, 192, 192));
		contentPanel.add(JTField, gbc);

		JLabel LabelCompany = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 9;
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
		gbc.gridy = 9;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		CMField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		CMField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		CMField.setBackground(new Color(192, 192, 192));
		contentPanel.add(CMField, gbc);

		JLabel LabelPOE = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 10;
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
		gbc.gridy = 10;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		POEField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		POEField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		POEField.setBackground(new Color(192, 192, 192));
		contentPanel.add(POEField, gbc);

		JLabel LabelJobD = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy = 11;
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
		gbc.gridy = 11;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		JDField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		JDField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		JDField.setBackground(new Color(192, 192, 192));
		contentPanel.add(JDField, gbc);
		
	//------------------------AddWrkExp Button-----------------	
		JButton addButton = new JButton("+ Add Work Experience");
		gbc.gridx = 0;
		gbc.gridy = 12;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		ImageIcon addIcon = new ImageIcon("src/main/resources/add-exp.png");
		Image resizedImage = addIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon AddIcon = new ImageIcon(resizedImage);
		addButton.setIcon(AddIcon);
		contentPanel.add(addButton, gbc);
		
		AddWrkExp addWrkExp = new AddWrkExp(contentPanel, gbc, JTField, CMField, POEField, JDField);
	    addButton.addActionListener(addWrkExp);
	    //currentGridy = addWrkExp.getCurrentGridy();

//-------------------------Adding Education Details----------------------------------------------
        //gbc.gridy = currentGridy;
        gbc.gridy++;
		JLabel lblEducation = new JLabel(); 
		gbc.gridx = 0;
		//gbc.gridy= 13;
		gbc.weightx = 1;
		gbc.gridwidth = 2;
		lblEducation.setText("Education");
		lblEducation.setForeground(new Color(255, 255, 255));
		lblEducation.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
		lblEducation.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		lblEducation.setBackground(new Color(128, 128, 128));
		lblEducation.setOpaque(true);
		lblEducation.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(lblEducation, gbc);

		JLabel Labeldegree = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++;//= 14;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		Labeldegree.setText("Degree Aquired");
		Labeldegree.setForeground(Color.BLACK);
		Labeldegree.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		Labeldegree.setBorder(BorderFactory.createEmptyBorder());
		Labeldegree.setBackground(Color.WHITE);
		Labeldegree.setOpaque(true);
		Labeldegree.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(Labeldegree, gbc);

		DEGREEField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = gbc.gridy;//14;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		DEGREEField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		DEGREEField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		DEGREEField.setBackground(new Color(192, 192, 192));
		contentPanel.add(DEGREEField, gbc);

		JLabel LabelUniversity = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++;// = 15;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelUniversity.setText("Name of University");
		LabelUniversity.setForeground(Color.BLACK);
		LabelUniversity.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelUniversity.setBorder(BorderFactory.createEmptyBorder());
		LabelUniversity.setBackground(Color.WHITE);
		LabelUniversity.setOpaque(true);
		LabelUniversity.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelUniversity, gbc);

		UniField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = gbc.gridy; //15;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		UniField.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		UniField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		UniField.setBackground(new Color(192, 192, 192));
		contentPanel.add(UniField, gbc);

//--------------------------Adding Skills and Languages---------------------------------------

		JLabel lblSkills = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++ ;//= 16;
		gbc.weightx = 1;
		gbc.gridwidth = 2;
		lblSkills.setText("Skills and Languages");
		lblSkills.setForeground(new Color(255, 255, 255));
		lblSkills.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
		lblSkills.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		lblSkills.setBackground(new Color(128, 128, 128));
		lblSkills.setOpaque(true);
		lblSkills.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(lblSkills, gbc);

		JLabel LabelSkill = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy ++;//= 17;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelSkill.setText("Skills");
		LabelSkill.setForeground(Color.DARK_GRAY);
		LabelSkill.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelSkill.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		//LabelSkill.setBorder(BorderFactory.createEmptyBorder());
		LabelSkill.setBackground(Color.WHITE);
		LabelSkill.setOpaque(true);
		LabelSkill.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelSkill, gbc);
		
		textField_1 = new JTextField();
		gbc.gridx = 1;
		//gbc.gridy =gbc.gridy;//= 18;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		textField_1.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		textField_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		textField_1.setBackground(new Color(192, 192, 192));
		contentPanel.add(textField_1, gbc);

		textField_2 = new JTextField();
		gbc.gridx = 1;
		gbc.gridy ++;//= 19;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		textField_2.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		textField_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		textField_2.setBackground(new Color(192, 192, 192));
		contentPanel.add(textField_2, gbc);

		textField_3 = new JTextField();
		gbc.gridx = 1;
		gbc.gridy ++;//= 20;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		textField_3.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		textField_3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		textField_3.setBackground(new Color(192, 192, 192));
		contentPanel.add(textField_3, gbc);

		JLabel LabelLanguage = new JLabel(); 
		gbc.gridx = 0;
		gbc.gridy++; // = 17;
		gbc.weightx = 1;
		gbc.gridwidth = 1;
		LabelLanguage.setText("Languages Known");
		LabelLanguage.setForeground(Color.DARK_GRAY);
		LabelLanguage.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
		LabelLanguage.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		//LabelLanguage.setBorder(BorderFactory.createEmptyBorder());
		LabelLanguage.setBackground(Color.WHITE);
		LabelLanguage.setOpaque(true);
		LabelLanguage.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(LabelLanguage, gbc);

		textField_4 = new JTextField();
		gbc.gridx = 1;
		//gbc.gridy = gbc.gridy;// = 18;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		textField_4.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		textField_4.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		textField_4.setBackground(new Color(192, 192, 192));
		contentPanel.add(textField_4, gbc);

		textField_5 = new JTextField();
		gbc.gridx = 1;
		gbc.gridy ++; //19;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		textField_5.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		textField_5.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		textField_5.setBackground(new Color(192, 192, 192));
		contentPanel.add(textField_5, gbc);

		textField_6 = new JTextField();
		gbc.gridx = 1;
		gbc.gridy ++;//20;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		textField_6.setFont(new java.awt.Font("Cambria", java.awt.Font.BOLD | java.awt.Font.ITALIC, 14));
		textField_6.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 160), null, null, null));
		textField_6.setBackground(new Color(192, 192, 192));
		contentPanel.add(textField_6, gbc);

//--------------------Upload Image Button-----------------------------------------	
		
		JLabel imagePreviewLabel = new JLabel();
		gbc.gridx = 1;
		gbc.gridy++;// = 21;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		imagePreviewLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPanel.add(imagePreviewLabel, gbc);
		
		JButton uploadButton = new JButton("Upload Image");
		gbc.gridx = 0;
		//gbc.gridy =gbc.gridy;// 21;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		uploadButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        JFileChooser fileChooser = new JFileChooser();
		        int result = fileChooser.showOpenDialog(frame);
		        if (result == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = fileChooser.getSelectedFile();
		            picturePath = selectedFile.getAbsolutePath();
		            java.awt.Image image = Toolkit.getDefaultToolkit().getImage(picturePath);
		            java.awt.Image scaledImage = image.getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT);
		            imageIcon = new ImageIcon(scaledImage);
		            imagePreviewLabel.setIcon(imageIcon);
		        }
		    }
		});
		contentPanel.add(uploadButton, gbc);
		
//-------------------------------SaveasPDF Button------------------------------------------------------
		
		JButton btnSaveasPDF = new JButton("Save as PDF ");
		gbc.gridx = 0;
		gbc.gridy++;// = 22;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		ImageIcon saveIcon = new ImageIcon("src/main/resources/Save-icon.png");
		Image saveIconresize = saveIcon.getImage().getScaledInstance(22, 22, Image.SCALE_SMOOTH);
		ImageIcon SaveIcon = new ImageIcon(saveIconresize);
		btnSaveasPDF.setIcon(SaveIcon);
		btnSaveasPDF.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSaveasPDF.setForeground(new Color(0, 0, 0));
		btnSaveasPDF.setBackground(new Color(0, 150, 105));
		contentPanel.add(btnSaveasPDF, gbc);
		
		
		btnSaveasPDF.addActionListener(new SavePDFActionListener(NameField, mailField, AddressField, DOFField, PhoneField, JTField, CMField, POEField, JDField, DEGREEField, UniField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, Headline, picturePath, imagePreviewLabel));
		

//-------------------------Exit Button-------------------------------------------------
		
		JButton btnExit = new JButton("Exit");
		gbc.gridx = 1;
		//gbc.gridy = gbc.gridy;// 22;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		btnExit.setIcon(new ImageIcon("src/main/resources/delete_16x16.gif"));
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBackground(Color.red);

		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}

		});
		contentPanel.add(btnExit, gbc);
		
		ImageIcon image0 = new ImageIcon("logo.png");
	    frame.setIconImage(image0.getImage());

	    frame.setVisible(true);
	}
	
}
