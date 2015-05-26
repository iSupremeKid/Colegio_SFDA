package beans;

public class ProfesorBean {
	
		private int id_Profesor;
		private int id_Persona;
		private char tutor;
		public int getId_Profesor() {
			return id_Profesor;
		}
		public void setId_Profesor(int id_Profesor) {
			this.id_Profesor = id_Profesor;
		}
		public int getId_Persona() {
			return id_Persona;
		}
		public void setId_Persona(int id_Persona) {
			this.id_Persona = id_Persona;
		}
		public char getTutor() {
			return tutor;
		}
		public void setTutor(char tutor) {
			this.tutor = tutor;
		}
		public ProfesorBean(int id_Profesor, int id_Persona, char tutor) {
			super();
			this.id_Profesor = id_Profesor;
			this.id_Persona = id_Persona;
			this.tutor = tutor;
		}
		
		public ProfesorBean() {
			// 
		}
}
