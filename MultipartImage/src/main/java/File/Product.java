package File;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="picture91")
public class Product {

	@Id
	@GeneratedValue
	private long id;
	@Column(name="photoname")
	private String photoname;
	@Column(name="photo")
	private byte[] Photo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getPhotoname() {
		return photoname;
	}
	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}
	public byte[] getPhoto() {
		return Photo;
	}
	public void setPhoto(byte[] photo) {
		Photo = photo;
	}
	
	
	
	
}
