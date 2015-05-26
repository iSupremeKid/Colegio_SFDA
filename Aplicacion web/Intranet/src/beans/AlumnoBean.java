package beans;

public class AlumnoBean {
		
		private int id_Alumno;
		private int id_Persona;
		private String nomApo;
		private String apePapo;
		private String apeMapo;
		public int getId_Alumno() {
			return id_Alumno;
		}
		public void setId_Alumno(int id_Alumno) {
			this.id_Alumno = id_Alumno;
		}
		public int getId_Persona() {
			return id_Persona;
		}
		public void setId_Persona(int id_Persona) {
			this.id_Persona = id_Persona;
		}
		public String getNomApo() {
			return nomApo;
		}
		public void setNomApo(String nomApo) {
			this.nomApo = nomApo;
		}
		public String getApePapo() {
			return apePapo;
		}
		public void setApePapo(String apePapo) {
			this.apePapo = apePapo;
		}
		public String getApeMapo() {
			return apeMapo;
		}
		public void setApeMapo(String apeMapo) {
			this.apeMapo = apeMapo;
		}
		public AlumnoBean(int id_Alumno, int id_Persona, String nomApo,
				String apePapo, String apeMapo) {
			super();
			this.id_Alumno = id_Alumno;
			this.id_Persona = id_Persona;
			this.nomApo = nomApo;
			this.apePapo = apePapo;
			this.apeMapo = apeMapo;
		}
		
		
		public AlumnoBean(){
			
		}
	
}
