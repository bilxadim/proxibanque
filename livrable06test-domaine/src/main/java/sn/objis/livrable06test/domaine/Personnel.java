package sn.objis.livrable06test.domaine;

/**
 * 
 * @author Xidma
 *
 */
public class Personnel {

	private int idPersonnel;

	private String nomPersonnel;

	private String prenomPersonnel;

	private int telPersonnel;
	
	protected String loginPersonnel;
	
	protected String passwordPersonnel;

	public Personnel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personnel(int idPersonnel, String nomPersonnel, String prenomPersonnel, int telPersonnel,
			String loginPersonnel, String passwordPersonnel) {
		super();
		this.idPersonnel = idPersonnel;
		this.nomPersonnel = nomPersonnel;
		this.prenomPersonnel = prenomPersonnel;
		this.telPersonnel = telPersonnel;
		this.loginPersonnel = loginPersonnel;
		this.passwordPersonnel = passwordPersonnel;
	}

	public int getIdPersonnel() {
		return idPersonnel;
	}

	public void setIdPersonnel(int idPersonnel) {
		this.idPersonnel = idPersonnel;
	}

	public String getNomPersonnel() {
		return nomPersonnel;
	}

	public void setNomPersonnel(String nomPersonnel) {
		this.nomPersonnel = nomPersonnel;
	}

	public String getPrenomPersonnel() {
		return prenomPersonnel;
	}

	public void setPrenomPersonnel(String prenomPersonnel) {
		this.prenomPersonnel = prenomPersonnel;
	}

	public int getTelPersonnel() {
		return telPersonnel;
	}

	public void setTelPersonnel(int telPersonnel) {
		this.telPersonnel = telPersonnel;
	}

	public String getLoginPersonnel() {
		return loginPersonnel;
	}

	public void setLoginPersonnel(String loginPersonnel) {
		this.loginPersonnel = loginPersonnel;
	}

	public String getPasswordPersonnel() {
		return passwordPersonnel;
	}

	public void setPasswordPersonnel(String passwordPersonnel) {
		this.passwordPersonnel = passwordPersonnel;
	}

	

}
