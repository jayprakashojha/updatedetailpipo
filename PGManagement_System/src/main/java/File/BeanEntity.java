package File;




import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payingguest1")
public class BeanEntity {

	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	@Override
	public String toString() {
		return "BeanEntity [id=" + id + ", name=" + name + ", FatherName=" + FatherName + ", MotherName=" + MotherName
				+ ", Dob=" + Dob + ", CurrentAddress=" + CurrentAddress + ", PermanentAddress=" + PermanentAddress
				+ ", Mobile=" + Mobile + ", Emailid=" + Emailid + ", photo=" + Arrays.toString(photo) + ", photoname="
				+ photoname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="name")
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="FatherName")
	public String FatherName;
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	@Column(name="MotherName")
	public String MotherName;
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	@Column(name="Dob")
	public Date Dob;
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	@Column(name="CurrentAddress")
	public String CurrentAddress;
	public String getCurrentAddress() {
		return CurrentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		CurrentAddress = currentAddress;
	}
	@Column(name="PermanentAddress")
	public String PermanentAddress;
	public String getPermanentAddress() {
		return PermanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		PermanentAddress = permanentAddress;
	}
	@Column(name="Mobile")
	public String Mobile;
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	@Column(name="Emailid")
	public String Emailid;
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	@Column(name="photo")
	public byte[] photo;
	
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Column(name="photoname")
	public String photoname;
	
	public String getPhotoname() {
		return photoname;
	}
	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}
	
}
