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
	@GeneratedValue
	@Column(name="id")
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

	@Column(name="Employee_Id")
	public String Employee_Id;
	

	public String getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(String employee_Id) {
		this.Employee_Id = employee_Id;
	}

	@Column(name="Designation")
	public String Designation;
	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		this.Designation = designation;
	}

	@Column(name="Location")
	public String Location;
	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		this.Location = location;
	}

	@Column(name="joiningDate")
	public String joiningDate;
	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Column(name="AccountNumber")
	public String AccountNumber;
	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.AccountNumber = accountNumber;
	}

	@Column(name="PaymentMode")
	public String PaymentMode;
	public String getPaymentMode() {
		return PaymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.PaymentMode = paymentMode;
	}

	@Column(name="BankName")
	public String BankName;
	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		this.BankName = bankName;
	}

	@Column(name="MonthDays")
	public String MonthDays;
	public String getMonthDays() {
		return MonthDays;
	}

	public void setMonthDays(String monthDays) {
		this.MonthDays = monthDays;
	}

	@Column(name="PayableDays")
	public String PayableDays;
	public String getPayableDays() {
		return PayableDays;
	}

	public void setPayableDays(String payableDays) {
		this.PayableDays = payableDays;
	}

	@Column(name="CTCMonthly")
	public String CTCMonthly;
	public String getCTCMonthly() {
		return CTCMonthly;
	}

	public void setCTCMonthly(String cTCMonthly) {
		this.CTCMonthly = cTCMonthly;
	}

	@Column(name="BasicSalary")
	public String BasicSalary;
	public String getBasicSalary() {
		return BasicSalary;
	}

	public void setBasicSalary(String basicSalary) {
		this.BasicSalary = basicSalary;
	}

	@Column(name="HRA")
	public String HRA;
	public String getHRA() {
		return HRA;
	}

	public void setHRA(String hRA) {
		this.HRA = hRA;
	}

	@Column(name="CCA")
	public String CCA;
	public String getCCA() {
		return CCA;
	}

	public void setCCA(String cCA) {
		this.CCA = cCA;
	}

	@Column(name="Deduction")
	public String Deduction;
	public String getDeduction() {
		return Deduction;
	}

	public void setDeduction(String deduction) {
		this.Deduction = deduction;
	}

	@Column(name="EPF")
	public String EPF;
	public String getEPF() {
		return EPF;
	}

	public void setEPF(String ePF) {
		this.EPF = ePF;
	}

	@Column(name="EPFDeduction")
	public String EPFDeduction;
	public String getEPFDeduction() {
		return EPFDeduction;
	}

	public void setEPFDeduction(String ePFDeduction) {
		this.EPFDeduction = ePFDeduction;
	}

	@Column(name="TDSDeduction")
	public String TDSDeduction;
	public String getTDSDeduction() {
		return TDSDeduction;
	}

	public void setTDSDeduction(String tDSDeduction) {
		this.TDSDeduction = tDSDeduction;
	}

	@Column(name="NetPayment")
	public String NetPayment;
	public String getNetPayment() {
		return NetPayment;
	}

	public void setNetPayment(String netPayment) {
		this.NetPayment = netPayment;
	}

	@Column(name="AmtTRF")
	public String AmtTRF;
	
	
	
	
	public String getAmtTRF() {
		return AmtTRF;
	}
	@Column(name="month")
	public String month;

	public Employee(String month, String years) {
	
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
	@Column(name="year")
	public String years;

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public Employee()
	{
	
	}

	public Employee(int id, String firstName, String Employee_Id, String designation, String location,
			String joiningDate, String accountNumber, String paymentMode, String bankName, String monthDays,
			String payableDays, String cTCMonthly, String basicSalary, String hRA, String cCA, String deduction,
			String ePF, String ePFDeduction, String tDSDeduction, String netPayment, String AmtTRF) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.Employee_Id = Employee_Id;
		this.Designation = designation;
		this.Location = location;
		this.joiningDate = joiningDate;
		this.AccountNumber = accountNumber;
		this.PaymentMode = paymentMode;
		this.BankName = bankName;
		this.MonthDays = monthDays;
		this.PayableDays = payableDays;
		this.CTCMonthly = cTCMonthly;
		this.BasicSalary = basicSalary;
		this.HRA = hRA;
		this.CCA = cCA;
		this.Deduction = deduction;
		this.EPF = ePF;
		this.EPFDeduction = ePFDeduction;
		this.TDSDeduction = tDSDeduction;
		this.NetPayment = netPayment;
		this.AccountNumber = AmtTRF;
	}

	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", firstName=" + this.firstName + ", Employee_Id=" + this.Employee_Id + ", Designation="
				+ this.Designation + ", Location=" + this.Location + ", joiningDate=" + this.joiningDate + ", AccountNumber="
				+ this.AccountNumber + ", PaymentMode=" + this.PaymentMode + ", BankName=" + this.BankName + ", MonthDays=" + this.MonthDays
				+ ", PayableDays=" + this.PayableDays + ", CTCMonthly=" + this.CTCMonthly + ", BasicSalary=" + this.BasicSalary
				+ ", HRA=" + this.HRA + ", CCA=" + this.CCA + ", Deduction=" + this.Deduction + ", EPF=" + this.EPF + ", EPFDeduction="
				+ EPFDeduction + ", TDSDeduction=" + this.TDSDeduction + ", this.NetPayment=" + this.NetPayment + ", AmtTRF=" + this.AmtTRF
				+ ", month=" + this.month + ", years=" + this.years + "]";
	}
	

	
	
	
	
}
