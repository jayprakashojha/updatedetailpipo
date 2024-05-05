package com.student.niraj;


import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;


public class DatabasePDFService {

	
	public static  ByteArrayInputStream employeePDFReport(List<beean> employees, String months,String year) throws DocumentException, IOException {
	   
      
	    Document document = new Document(PageSize.A4);
	    ByteArrayOutputStream out = new ByteArrayOutputStream();  
	    PdfWriter.getInstance(document, out);
	    document.open();
	    Image img = Image.getInstance("C:\\Users\\Dell\\Documents\\workspace-spring-tool-suite-4-4.20.0.RELEASE\\PaymentProject\\src\\main\\resources\\templates\\tgak logo.jpeg");
	    img.setAbsolutePosition(42, 790);
	    document.add(img);
 	    
	    Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	    fontTiltle.setSize(25);
	    // Creating paragraph
	    Paragraph paragraph2 = new Paragraph("TGAK Memorial Software India Private Limited", fontTiltle);
	    
	    // Aligning the paragraph in the document
	    paragraph2.setAlignment(Paragraph.ALIGN_CENTER);
	    // Adding the created paragraph in the document
	    document.add(paragraph2);
	    
	   // Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	    fontTiltle.setSize(22);
	    // Creating paragraph
	    Paragraph paragraph1 = new Paragraph("Pay slip for the month of "+months +"-" +year, fontTiltle);
	    // Aligning the paragraph in the document
	    paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
	    // Adding the created paragraph in the document
	    paragraph1.setExtraParagraphSpace(5);
	    document.add(paragraph1);
	    
	    PdfPTable table = new PdfPTable(4);
	    table.setWidthPercentage(100f);
	    
        // Space before and after table
        table.setSpacingBefore(40f);
        

        // Set Column widths of table
        float[] columnWidths = { 1f, 1f, 1f ,1f}; // Second column will be
                                                 // twice as first and third
        table.setWidths(columnWidths);
        
        for(beean employee:employees)
        {
        
        PdfPCell cell1 = new PdfPCell(new Paragraph("Employee Name"));
        PdfPCell cell2 = new PdfPCell(new Paragraph(employee.getFirstName()));
        PdfPCell cell3 = new PdfPCell(new Paragraph("Employee Id"));
        PdfPCell cell4 = new PdfPCell(new Paragraph(employee.getEmployeeid()));
        PdfPCell department = new PdfPCell(new Paragraph("Department"));
        PdfPCell getdepartment = new PdfPCell(new Paragraph(employee.getDepartment()));
        
        PdfPCell cell5 = new PdfPCell(new Paragraph("Designation"));
        PdfPCell cell6 = new PdfPCell(new Paragraph(employee.getDesignation()));
        
        PdfPCell gender = new PdfPCell(new Paragraph("Gender"));
        PdfPCell getgender = new PdfPCell(new Paragraph(employee.getGender()));
        PdfPCell pan = new PdfPCell(new Paragraph("PAN Number"));
        PdfPCell getpan = new PdfPCell(new Paragraph(employee.getPAN_Number()));
        
        PdfPCell cell7 = new PdfPCell(new Paragraph("Location"));
        PdfPCell cell8 = new PdfPCell(new Paragraph(employee.getLocation()));
        PdfPCell cell9 = new PdfPCell(new Paragraph("Joining Date"));
        PdfPCell cell10 = new PdfPCell(new Paragraph(employee.getJoiningdate()));
        PdfPCell cell11 = new PdfPCell(new Paragraph("Bank A/c No."));
        PdfPCell cell12 = new PdfPCell(new Paragraph(employee.getAccountnumber()));
        
        PdfPCell cell13 = new PdfPCell(new Paragraph("Payment Mode"));
        PdfPCell cell14 = new PdfPCell(new Paragraph(employee.getPaymentmode()));
        PdfPCell cell15 = new PdfPCell(new Paragraph("Bank Name"));
        PdfPCell cell16 = new PdfPCell(new Paragraph(employee.getBankname()));

        PdfPCell celll7 = new PdfPCell(new Paragraph("Month Days"));
        PdfPCell cell18 = new PdfPCell(new Paragraph(employee.getMonthdays()));
     
        PdfPCell cell19 = new PdfPCell(new Paragraph("Lop"));
        PdfPCell cell20 = new PdfPCell(new Paragraph(employee.getLop()));

        PdfPCell cell21 = new PdfPCell(new Paragraph("CTC Monthly"));
        PdfPCell cell22 = new PdfPCell(new Paragraph(employee.getCTCMonthly()));
        PdfPCell uan = new PdfPCell(new Paragraph("UAN No"));
        PdfPCell uanac = new PdfPCell(new Paragraph(employee.getUAN()));

        PdfPCell cell25 = new PdfPCell(new Paragraph("Basic Salary"));
        PdfPCell cell26 = new PdfPCell(new Paragraph(employee.getBasicsalary()));
        PdfPCell cell27 = new PdfPCell(new Paragraph("HRA"));
        PdfPCell cell28 = new PdfPCell(new Paragraph(employee.getHRA()));

        PdfPCell cell29 = new PdfPCell(new Paragraph("CCA"));
        PdfPCell cell30 = new PdfPCell(new Paragraph(employee.getCCA()));
       // PdfPCell cell31 = new PdfPCell(new Paragraph("Other Deduction"));
        //PdfPCell cell32 = new PdfPCell(new Paragraph(employee.getDeduction()));

        PdfPCell cell33 = new PdfPCell(new Paragraph("PF Account No."));
        PdfPCell cell34 = new PdfPCell(new Paragraph(employee.getEPF()));
        PdfPCell cell35 = new PdfPCell(new Paragraph("PF Deduction"));
        PdfPCell cell36 = new PdfPCell(new Paragraph(employee.getEPFDeduction()));
        PdfPCell cell37 = new PdfPCell(new Paragraph("TDS Deduction"));
        PdfPCell cell38 = new PdfPCell(new Paragraph(employee.getTDSDeduction()));
        PdfPCell cell39 = new PdfPCell(new Paragraph("Net Payable"));
        PdfPCell cell40 = new PdfPCell(new Paragraph(employee.getNetpayment()));
        PdfPCell cell41 = new PdfPCell(new Paragraph("Net Payable in Words"));
        PdfPCell cell42 = new PdfPCell(new Paragraph(employee.getTransferamount()));  
        PdfPCell cell43 = new PdfPCell(new Paragraph (""));  
        
        table.addCell(cell1);
        table.addCell(cell2);
        table.addCell(cell3);
        table.addCell(cell4);
        table.addCell(department);
        table.addCell(getdepartment);
        table.addCell(cell5);
        table.addCell(cell6);
        table.addCell(gender);
        table.addCell(getgender);
        table.addCell(pan);
        table.addCell(getpan);
        
        table.addCell(cell7);
        table.addCell(cell8);
        table.addCell(cell9);
        table.addCell(cell10);
        table.addCell(cell11);
        table.addCell(cell12);
        table.addCell(cell15);
        table.addCell(cell16);
        table.addCell(cell13);
        table.addCell(cell14);
      
        
        
        table.addCell(celll7);
        table.addCell(cell18);
        table.addCell(cell19);
        table.addCell(cell20);
        table.addCell(cell21);
        table.addCell(cell22);
        table.addCell(uan);
        table.addCell(uanac);
       
        table.addCell(cell25);
        table.addCell(cell26);
        table.addCell(cell27);
        table.addCell(cell28);
        table.addCell(cell29);
        table.addCell(cell30);
       // table.addCell(cell31);
       // table.addCell(cell32);
        table.addCell(cell33);
        table.addCell(cell34);
        table.addCell(cell35);
        table.addCell(cell36);
        table.addCell(cell37);
        table.addCell(cell38);
        table.addCell(cell39);
        table.addCell(cell40);
        table.addCell(cell41);
        table.addCell(cell42); 
        table.addCell(cell43);
 
	    table.setSpacingBefore(15f);
	    
	/*    Stream.of("EMP ID","First Name","Last Name","Department","Mobile").forEach(headerTitle ->{
	    	PdfPCell header = new PdfPCell();
	    	Font headfont = FontFactory.getFont(FontFactory.TIMES_BOLD);
	    	header.setBackgroundColor(Color.white);
	    	header.setHorizontalAlignment(Element.ALIGN_CENTER);
	    	header.setBorderWidth(2);
	    	header.setPhrase(new Phrase(headerTitle,headfont));
	    	table.addCell(header);
	    	
	    }); */
	    
	    
	    
	    
	    	
	    
	        PdfPCell idcell = new PdfPCell(new Paragraph());
	    	idcell.setPaddingLeft(4);
	    	idcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
	    	idcell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    	table.addCell(idcell); 
	    	
	    /*	PdfPCell firstname = new PdfPCell(new Phrase(employee.getFirstName()));
	    	firstname.setPaddingLeft(4);
	    	firstname.setVerticalAlignment(Element.ALIGN_MIDDLE);
	    	firstname.setHorizontalAlignment(Element.ALIGN_CENTER);
	    	table.addCell(firstname);
	    	
	    /*	PdfPCell lastname = new PdfPCell(new Phrase(String.valueOf(employee.getLastName())));
	    	lastname.setPaddingLeft(4);
	    	lastname.setVerticalAlignment(Element.ALIGN_MIDDLE);
	    	lastname.setHorizontalAlignment(Element.ALIGN_CENTER);
	    	table.addCell(lastname);*/
	    	
	    /*	PdfPCell trfamt = new PdfPCell(new Paragraph(" "));
	    	trfamt.setPaddingLeft(4);
	    	trfamt.setVerticalAlignment(Element.ALIGN_CENTER);
	    	trfamt.setHorizontalAlignment(Element.ALIGN_CENTER);
	    	table.addCell(trfamt);
	    	
	    	PdfPCell amttrf = new PdfPCell(new Paragraph(employee.getAmtTRF()));
	    	amttrf.setPaddingLeft(4);
	    	amttrf.setVerticalAlignment(Element.ALIGN_MIDDLE);
	    	amttrf.setHorizontalAlignment(Element.ALIGN_CENTER);
	    	table.addCell(amttrf); 
	    	*/
        }
        
        
	    document.add(table);
	    document.add(new Paragraph("Note : This is computer generated payslip and does not require a signature."));   
	    document.close();
                 
       return new ByteArrayInputStream(out.toByteArray());

	}}
