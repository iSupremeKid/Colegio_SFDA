package beans;

public class PersonaBean {

	private int id_Persona;
	private int id_Rol;
	private String nombres;
	private String apePat;
	private String apeMat;
	private String telefono;
	private String dni;
	private String dirección;
	private String correo;
	private String fec_nac;
	private char genero;
	private String foto;
	private String user;
	private String password;
	public int getId_Persona() {
		return id_Persona;
	}
	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}
	public int getId_Rol() {
		return id_Rol;
	}
	public void setId_Rol(int id_Rol) {
		this.id_Rol = id_Rol;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApePat() {
		return apePat;
	}
	public void setApePat(String apePat) {
		this.apePat = apePat;
	}
	public String getApeMat() {
		return apeMat;
	}
	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFec_nac() {
		return fec_nac;
	}
	public void setFec_nac(String fec_nac) {
		this.fec_nac = fec_nac;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public PersonaBean(int id_Persona, int id_Rol, String nombres,
			String apePat, String apeMat, String telefono, String dni,
			String dirección, String correo, String fec_nac, char genero,
			String foto, String user, String password) {
		super();
		this.id_Persona = id_Persona;
		this.id_Rol = id_Rol;
		this.nombres = nombres;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.telefono = telefono;
		this.dni = dni;
		this.dirección = dirección;
		this.correo = correo;
		this.fec_nac = fec_nac;
		this.genero = genero;
		this.foto = foto;
		this.user = user;
		this.password = password;
	}
	
	
	public PersonaBean(){
		
	}

	
}
