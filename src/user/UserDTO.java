package user;

public class UserDTO {
	
	private String userID;
	private String userPassWord;
	private String userEmail;
	private String userEamilHash;
	private boolean userEmailChecked;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassWord() {
		return userPassWord;
	}
	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserEamilHash() {
		return userEamilHash;
	}
	public void setUserEamilHash(String userEamilHash) {
		this.userEamilHash = userEamilHash;
	}
	public boolean isUserEmailChecked() {
		return userEmailChecked;
	}
	public void setUserEmailChecked(boolean userEmailChecked) {
		this.userEmailChecked = userEmailChecked;
	}
	
	public UserDTO() {	
	}
	
	public UserDTO(String userID, String userPassWord, String userEmail, String userEamilHash,
			boolean userEmailChecked) {
		super();
		this.userID = userID;
		this.userPassWord = userPassWord;
		this.userEmail = userEmail;
		this.userEamilHash = userEamilHash;
		this.userEmailChecked = userEmailChecked;
	}
	
	
}
