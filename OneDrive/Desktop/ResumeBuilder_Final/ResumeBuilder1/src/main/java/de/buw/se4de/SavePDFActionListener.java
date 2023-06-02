package de.buw.se4de;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.BaseColor;

public class SavePDFActionListener implements ActionListener {
	private  JTextField NameField;
	private  JTextField Headline;
	private  JTextField mailField;
	private  JTextField AddressField;
	private  JTextField DOFField;
	private  JTextField PhoneField;
	private  JTextField JTField;
	private  JTextField CMField;
	private  JTextField POEField;
	private  JTextField JDField;
	private  JTextField DEGREEField;
	private  JTextField UniField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private String picturePath;
	private ImageIcon imageIcon;
	private JLabel imagePreviewLabel;
	
	public SavePDFActionListener(JTextField NameField, JTextField mailField, JTextField AddressField, JTextField DOFField, JTextField PhoneField, JTextField JTField, JTextField CMField, JTextField POEField, JTextField JDField, JTextField DEGREEField, JTextField UniField, JTextField textField_1,JTextField textField_2,JTextField textField_3,JTextField textField_4, JTextField textField_5, JTextField textField_6,JTextField Headline, String picturePath, JLabel imagePreviewLabel) {
		this.NameField = NameField;
        this.mailField = mailField;
        this.AddressField = AddressField;
        this.DOFField = DOFField;
        this.PhoneField = PhoneField;
        this.JTField = JTField;
        this.CMField = CMField;
        this.POEField = POEField;
        this.JDField = JDField;
        this.DEGREEField = DEGREEField;
        this.UniField = UniField;
        this.textField_1 = textField_1;
        this.textField_2 = textField_2;
        this.textField_3 = textField_3;
        this.textField_4 = textField_4;
        this.textField_5 = textField_5;
        this.textField_6 = textField_6;
        this.Headline = Headline;
        //this.picturePath = picturePath;
        this.imageIcon = imageIcon;
        this.imagePreviewLabel = imagePreviewLabel;
        
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = NameField.getText();
		String email = mailField.getText();
		String phone = PhoneField.getText();
		String address = AddressField.getText();
		String dateOfBirth = DOFField.getText();
		String jobTitle = JTField.getText();
		String company = CMField.getText();
		String periodOfEmployment = POEField.getText();
		String jobDescription = JDField.getText();
		String uniDegree = DEGREEField.getText();
		String uniName = UniField.getText();
		String skillOne = textField_1.getText();
		String skillTwo = textField_2.getText();
		String skillThree = textField_3.getText();
		String languageOne = textField_4.getText();
		String languageTwo = textField_5.getText();
		String languageThree = textField_6.getText();
		String headline1 = Headline.getText();
		String Path = this.picturePath;

		if (name.isEmpty() || email.isEmpty() || jobDescription.isEmpty() || uniDegree.isEmpty()
				|| uniName.isEmpty() || periodOfEmployment.isEmpty() || phone.isEmpty() || address.isEmpty()
				|| dateOfBirth.isEmpty() || jobTitle.isEmpty() || company.isEmpty()) {
			JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL DETAILS TO GENERATE CV");
		} else {
			try {
			    String nameOfFile = NameField.getText() + "_CV.pdf";
			    Document myDocument = new Document();
			    PdfWriter.getInstance(myDocument, new FileOutputStream(nameOfFile));

			    myDocument.open();
			    BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_BOLD, BaseFont.CP1252, BaseFont.EMBEDDED);
			    com.itextpdf.text.Font headerFont = new com.itextpdf.text.Font(baseFont, 32, com.itextpdf.text.Font.BOLD);
			    //-----------------------------------------------------
			    Paragraph nameLabel = new Paragraph(name, headerFont);
			    myDocument.add(nameLabel);
			    myDocument.add(new Paragraph("", new com.itextpdf.text.Font(baseFont, 9, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph(headline1,
			            new com.itextpdf.text.Font(baseFont, 11, com.itextpdf.text.Font.ITALIC)));
			    myDocument.add(new Paragraph("", new com.itextpdf.text.Font(baseFont, 9, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph("", new com.itextpdf.text.Font(baseFont, 9, com.itextpdf.text.Font.BOLD)));
			    
			    ImageIcon imageIcon = (ImageIcon) imagePreviewLabel.getIcon();
			    if (imageIcon != null) {
		            try {
		            	com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance(imageIcon.getImage(), null);
		                image.scaleAbsolute(100, 100);
		                myDocument.add(image);
		            } catch (Exception ex) {
		                ex.printStackTrace();
		            }
		        } else {System.out.println("no image");}
			    
			    myDocument.add(new Paragraph("", new com.itextpdf.text.Font(baseFont, 9, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph(
			            "----------------------------------------------------------------------------------------------------------------------------------"));

			    myDocument.add(new Paragraph("PERSONAL CONTACT INFORMATION",
			            new com.itextpdf.text.Font(baseFont, 16, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph("Email:  "+email,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph("Contact no:  "+phone,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph("Address:  "+address,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph("Date of Birth:  "+dateOfBirth,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));

			    myDocument.add(new Paragraph(
			            "----------------------------------------------------------------------------------------------------------------------------------"));

			    myDocument.add(new Paragraph("WORK EXPERIENCE",
			            new com.itextpdf.text.Font(baseFont, 16, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph(jobTitle,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph("at  "+company,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph("Period of Experience: "+periodOfEmployment,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph("Job Description",
			            new com.itextpdf.text.Font(baseFont, 14, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph(jobDescription,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));

			    myDocument.add(new Paragraph(
			            "----------------------------------------------------------------------------------------------------------------------------------"));

			    myDocument.add(new Paragraph("EDUCATION",
			            new com.itextpdf.text.Font(baseFont, 16, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph(uniDegree,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));
			    myDocument.add(new Paragraph(uniName,
			            new com.itextpdf.text.Font(baseFont, 12, com.itextpdf.text.Font.BOLD)));

			    myDocument.add(new Paragraph(
			            "----------------------------------------------------------------------------------------------------------------------------------"));
//-------------------------------------------------------------------
			    
//------------------------------------------------------------------
			    
			    PdfPTable table = new PdfPTable(2);
			    table.setWidthPercentage(100);
			    table.setSpacingBefore(10f);
			    table.setSpacingAfter(10f);

			    table.getDefaultCell().setPadding(5);
			    table.getDefaultCell().setBackgroundColor(BaseColor.WHITE);
			    table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			    table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);

			    com.itextpdf.text.Font tableHeaderFont = new com.itextpdf.text.Font(baseFont, 14, com.itextpdf.text.Font.BOLD);
			    PdfPCell headerCell1 = new PdfPCell(new Phrase("Skills", tableHeaderFont));
			    PdfPCell headerCell2 = new PdfPCell(new Phrase("Languages", tableHeaderFont));
			    table.addCell(headerCell1);
			    table.addCell(headerCell2);

			    table.addCell(skillOne);
			    table.addCell(languageOne);
			    table.addCell(skillTwo);
			    table.addCell(languageTwo);
			    table.addCell(skillThree);
			    table.addCell(languageThree);

			    myDocument.add(table);
			    

			    JOptionPane.showMessageDialog(null, "CV was successfully generated");
			    myDocument.close();
			} catch (Exception ex) {
			    ex.printStackTrace();
			}

		}
	}
}