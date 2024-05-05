package com.student.niraj;



public class beean {

	 private int id;
	 
	 
		private String firstName;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String employeeid;
	
		public String getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeid(String employeeid) {
			this.employeeid = employeeid;
		}

		public String Department;

		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}

		public String Designation;
		
		public String getDesignation() {
			return Designation;
		}
		public void setDesignation(String designation) {
			Designation = designation;
		}

		public String Location;
		
		public String getLocation() {
			return Location;
		}
		public void setLocation(String location) {
			Location = location;
		}

		public String joiningdate;
		
		public String getJoiningdate() {
			return joiningdate;
		}
		public void setJoiningdate(String joiningdate) {
			this.joiningdate = joiningdate;
		}
		

		public String accountnumber;
		
		

		public String getAccountnumber() {
			return accountnumber;
		}
		public void setAccountnumber(String accountnumber) {
			this.accountnumber = accountnumber;
		}

		public String PAN_Number;
		
		public String getPAN_Number() {
			return PAN_Number;
		}
		public void setPAN_Number(String pAN_Number) {
			PAN_Number = pAN_Number;
		}

		public String paymentmode;
		
		

		public String getPaymentmode() {
			return paymentmode;
		}
		public void setPaymentmode(String paymentmode) {
			this.paymentmode = paymentmode;
		}

		public String bankname;
		
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}

		public String monthdays;
		
		

		

		public String getMonthdays() {
			return monthdays;
		}
		public void setMonthdays(String monthdays) {
			this.monthdays = monthdays;
		}

		public String payable_days;
		
		

		public String getPayable_days() {
			return payable_days;
		}
		public void setPayable_days(String payable_days) {
			this.payable_days = payable_days;
		}

		public String CTCMonthly;
		
		public String getCTCMonthly() {
			return CTCMonthly;
		}
		public void setCTCMonthly(String cTCMonthly) {
			CTCMonthly = cTCMonthly;
		}

		public String basicsalary;
		
		

		public String getBasicsalary() {
			return basicsalary;
		}
		public void setBasicsalary(String basicsalary) {
			this.basicsalary = basicsalary;
		}

		public String HRA;
		
		public String getHRA() {
			return HRA;
		}
		public void setHRA(String hRA) {
			HRA = hRA;
		}

		public String CCA;
		
		public String getCCA() {
			return CCA;
		}
		public void setCCA(String cCA) {
			CCA = cCA;
		}

		public String Deduction;
		
		public String getDeduction() {
			return Deduction;
		}
		public void setDeduction(String deduction) {
			Deduction = deduction;
		}

		public String EPFDeduction;
		
		public String getEPFDeduction() {
			return EPFDeduction;
		}
		public void setEPFDeduction(String ePFDeduction) {
			EPFDeduction = ePFDeduction;
		}

		public String EPF;

		
		public String getEPF() {
			return EPF;
		}
		public void setEPF(String ePF) {
			EPF = ePF;
		}

		public String TDSDeduction;
		
		public String getTDSDeduction() {
			return TDSDeduction;
		}
		public void setTDSDeduction(String tDSDeduction) {
			TDSDeduction = tDSDeduction;
		}

		public String netpayment;
		
		

		public String getNetpayment() {
			return netpayment;
		}
		public void setNetpayment(String netpayment) {
			this.netpayment = netpayment;
		}

		public String AmtTRF;
		
		public String getAmtTRF() {
			return AmtTRF;
		}
		public void setAmtTRF(String amtTRF) {
			AmtTRF = amtTRF;
		}

		public String month;
		
		public String getMonth() {
			return month;
		}
		public void setMonth(String month) {
			this.month = month;
		}

		public String years;
		
		

	  
	 public String getYears() {
			return years;
		}
		public void setYears(String years) {
			this.years = years;
		}
	
	
	public beean(){}
	 public beean(int id)
	  {
	    this.id = id;
	    
	  }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String transferamount;
	
	public String getTransferamount() {
		return transferamount;
	}
	public void setTransferamount(String transferamount) {
		this.transferamount = transferamount;
	}
	public String Lop;
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}

	public String Profession_Tax;
	public String getProfession_Tax() {
		return Profession_Tax;
	}
	public void setProfession_Tax(String profession_Tax) {
		Profession_Tax = profession_Tax;
	}

	public String UAN;
	public String getUAN() {
		return UAN;
	}  
	public void setUAN(String uAN) {
		UAN = uAN;
	}

	public String PF_Account_No;
	
	public String getPF_Account_No() {
		return PF_Account_No;
	}
	public void setPF_Account_No(String pF_Account_No) {
		PF_Account_No = pF_Account_No;
	}
	public String Gender;
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "beean [id=" + id + ", firstName=" + firstName + ", employeeid=" + employeeid + ", Department="
				+ Department + ", Designation=" + Designation + ", Location=" + Location + ", joiningdate="
				+ joiningdate + ", accountnumber=" + accountnumber + ", PAN_Number=" + PAN_Number + ", paymentmode="
				+ paymentmode + ", bankname=" + bankname + ", monthdays=" + monthdays + ", payable_days=" + payable_days
				+ ", CTCMonthly=" + CTCMonthly + ", basicsalary=" + basicsalary + ", HRA=" + HRA + ", CCA=" + CCA
				+ ", Deduction=" + Deduction + ", EPFDeduction=" + EPFDeduction + ", EPF=" + EPF + ", TDSDeduction="
				+ TDSDeduction + ", netpayment=" + netpayment + ", AmtTRF=" + AmtTRF + ", month=" + month + ", years="
				+ years + ", transferamount=" + transferamount + ", Lop=" + Lop + ", Profession_Tax=" + Profession_Tax
				+ ", UAN=" + UAN + ", PF_Account_No=" + PF_Account_No + ", Gender=" + Gender + "]";
	}

		
}
