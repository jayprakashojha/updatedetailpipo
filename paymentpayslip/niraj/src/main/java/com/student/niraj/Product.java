package com.student.niraj;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payslip_Employee")
public class Product {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstname;
public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Column(name="employeeid")
	public String employeeid;
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	
	@Column(name="designation")
	public String designation;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name="location")
	public String location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Column(name="joiningdate")
	public String joiningdate;
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	@Column(name="accountnumber")
	public String accountnumber;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	@Column(name="paymentmode")
	public String paymentmode;
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	@Column(name="bankname")
	public String bankname;
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	@Column(name="monthdays")
	public String monthdays;
	public String getMonthdays() {
		return monthdays;
	}
	public void setMonthdays(String monthdays) {
		this.monthdays = monthdays;
	}
	@Column(name="payabledays")
	public String payabledays;
	public String getPayabledays() {
		return payabledays;
	}
	public void setPayabledays(String payabledays) {
		this.payabledays = payabledays;
	}
	@Column(name="ctcmonthly")
	public String ctcmonthly;
	public String getCtcmonthly() {
		return ctcmonthly;
	}
	public void setCtcmonthly(String ctcmonthly) {
		this.ctcmonthly = ctcmonthly;
	}
	@Column(name="basicsalary")
	public String basicsalary;
	public String getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(String basicsalary) {
		this.basicsalary = basicsalary;
	}
	@Column(name="hRA")
	public String hRA;
	public String gethRA() {
		return hRA;
	}
	public void sethRA(String hRA) {
		this.hRA = hRA;
	}
	@Column(name="cCA")
	public String cCA;
	public String getcCA() {
		return cCA;
	}
	public void setcCA(String cCA) {
		this.cCA = cCA;
	}
	@Column(name="deduction")
	public String deduction;
	public String getDeduction() {
		return deduction;
	}
	public void setDeduction(String deduction) {
		this.deduction = deduction;
	}
	@Column(name="ePFdeduction")
	public String ePFdeduction;
	public String getePFdeduction() {
		return ePFdeduction;
	}
	public void setePFdeduction(String ePFdeduction) {
		this.ePFdeduction = ePFdeduction;
	}
	@Column(name="ePF")
	public String ePF;

	public String getePF() {
		return ePF;
	}
	public void setePF(String ePF) {
		this.ePF = ePF;
	}
	@Column(name="tDSdeduction")
	public String tDSdeduction;
	public String gettDSdeduction() {
		return tDSdeduction;
	}
	public void settDSdeduction(String tDSdeduction) {
		this.tDSdeduction = tDSdeduction;
	}
	@Column(name="netpayment")
	public String netpayment;
	public String getNetpayment() {
		return netpayment;
	}
	public void setNetpayment(String netpayment) {
		this.netpayment = netpayment;
	}
	@Column(name="transferamount")
	public String transferamount;
	
	public String getTransferamount() {
		return transferamount;
	}
	public void setTransferamount(String transferamount) {
		this.transferamount = transferamount;
	}
	@Column(name="month")
	public String month;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Column(name="years")
	public String years;
	
	
	
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public Product()
	{
		
	}
	
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="Profession_Tax")
public String Profession_Tax;
public String getProfession_Tax() {
	return Profession_Tax;
}
public void setProfession_Tax(String profession_Tax) {
	Profession_Tax = profession_Tax;
}
@Column(name="UAN")
public String UAN;
public String getUAN() {
	return UAN;
}
public void setUAN(String uAN) {
	UAN = uAN;
}
@Column(name="PF_Account_No")
public String PF_Account_No;

	public String getPF_Account_No() {
	return PF_Account_No;
}
public void setPF_Account_No(String pF_Account_No) {
	PF_Account_No = pF_Account_No;
}

@Column(name="Gender")
public String Gender;
	public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}

@Column(name="Department")
public String Department;


	public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}

@Column(name="PAN_Number")
public String PAN_Number;
	public String getPAN_Number() {
	return PAN_Number;
}
public void setPAN_Number(String pAN_Number) {
	PAN_Number = pAN_Number;
}

public String Lop;


	public String getLop() {
	return Lop;
}
public void setLop(String lop) {
	Lop = lop;
}
	@Override
	public String toString() {
		return "Product [id=" + id + ", firstname=" + firstname + ", employeeid=" + employeeid + ", designation="
				+ designation + ", location=" + location + ", joiningdate=" + joiningdate + ", accountnumber="
				+ accountnumber + ", paymentmode=" + paymentmode + ", bankname=" + bankname + ", monthdays=" + monthdays
				+ ", payabledays=" + payabledays + ", ctcmonthly=" + ctcmonthly + ", basicsalary=" + basicsalary
				+ ", hRA=" + hRA + ", cCA=" + cCA + ", deduction=" + deduction + ", ePFdeduction=" + ePFdeduction
				+ ", ePF=" + ePF + ", tDSdeduction=" + tDSdeduction + ", netpayment=" + netpayment + ", transferamount="
				+ transferamount + ", month=" + month + ", years=" + years + ", Profession_Tax=" + Profession_Tax
				+ ", UAN=" + UAN + ", PF_Account_No=" + PF_Account_No + ", Gender=" + Gender + ", Department="
				+ Department + ", PAN_Number=" + PAN_Number + ", Lop=" + Lop + "]";
	}
	


}
