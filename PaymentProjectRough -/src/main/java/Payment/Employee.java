package Payment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payslipEmployee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="firstname")
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String EmployeeId;
	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
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

	public String joiningDate;
	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String AccountNumber;
	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String PaymentMode;
	public String getPaymentMode() {
		return PaymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		PaymentMode = paymentMode;
	}

	public String BankName;
	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String MonthDays;
	public String getMonthDays() {
		return MonthDays;
	}

	public void setMonthDays(String monthDays) {
		MonthDays = monthDays;
	}

	public String PayableDays;
	public String getPayableDays() {
		return PayableDays;
	}

	public void setPayableDays(String payableDays) {
		PayableDays = payableDays;
	}

	public String CTCMonthly;
	public String getCTCMonthly() {
		return CTCMonthly;
	}

	public void setCTCMonthly(String cTCMonthly) {
		CTCMonthly = cTCMonthly;
	}

	public String BasicSalary;
	public String getBasicSalary() {
		return BasicSalary;
	}

	public void setBasicSalary(String basicSalary) {
		BasicSalary = basicSalary;
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

	public String EPF;
	public String getEPF() {
		return EPF;
	}

	public void setEPF(String ePF) {
		EPF = ePF;
	}

	public String EPFDeduction;
	public String getEPFDeduction() {
		return EPFDeduction;
	}

	public void setEPFDeduction(String ePFDeduction) {
		EPFDeduction = ePFDeduction;
	}

	public String TDSDeduction;
	public String getTDSDeduction() {
		return TDSDeduction;
	}

	public void setTDSDeduction(String tDSDeduction) {
		TDSDeduction = tDSDeduction;
	}

	public String NetPayment;
	public String getNetPayment() {
		return NetPayment;
	}

	public void setNetPayment(String netPayment) {
		NetPayment = netPayment;
	}

	public String AmtTRF;
	
	
	
	
	public String getAmtTRF() {
		return AmtTRF;
	}
	
	public String month;

	public Employee(String month, String years) {
		super();
		this.month = month;
		this.years = years;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setAmtTRF(String AmtTRF) {
		this.AmtTRF = AmtTRF;
	}
	
	public String years;

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public Employee()
	{
		super();
	}

	public Employee(int id, String firstName, String employeeId, String designation, String location,
			String joiningDate, String accountNumber, String paymentMode, String bankName, String monthDays,
			String payableDays, String cTCMonthly, String basicSalary, String hRA, String cCA, String deduction,
			String ePF, String ePFDeduction, String tDSDeduction, String netPayment, String AmtTRF) {
		super();
		this.id = id;
		this.firstName = firstName;
		EmployeeId = employeeId;
		Designation = designation;
		Location = location;
		this.joiningDate = joiningDate;
		AccountNumber = accountNumber;
		PaymentMode = paymentMode;
		BankName = bankName;
		MonthDays = monthDays;
		PayableDays = payableDays;
		CTCMonthly = cTCMonthly;
		BasicSalary = basicSalary;
		HRA = hRA;
		CCA = cCA;
		Deduction = deduction;
		EPF = ePF;
		EPFDeduction = ePFDeduction;
		TDSDeduction = tDSDeduction;
		NetPayment = netPayment;
		AccountNumber = AmtTRF;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", EmployeeId=" + EmployeeId + ", Designation="
				+ Designation + ", Location=" + Location + ", joiningDate=" + joiningDate + ", AccountNumber="
				+ AccountNumber + ", PaymentMode=" + PaymentMode + ", BankName=" + BankName + ", MonthDays=" + MonthDays
				+ ", PayableDays=" + PayableDays + ", CTCMonthly=" + CTCMonthly + ", BasicSalary=" + BasicSalary
				+ ", HRA=" + HRA + ", CCA=" + CCA + ", Deduction=" + Deduction + ", EPF=" + EPF + ", EPFDeduction="
				+ EPFDeduction + ", TDSDeduction=" + TDSDeduction + ", NetPayment=" + NetPayment + ", AmtTRF=" + AmtTRF
				+ ", month=" + month + ", years=" + years + "]";
	}
	

	
	
	
	
}
