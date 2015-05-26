package servlets;

import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import beans.PersonaBean;

import dao.interfaces.PersonaDao;
import daofactory.DaoFactory;


/**
 * Servlet implementation class Recuperar
 */
@WebServlet("/Recuperar")
public class Recuperar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	
    public Recuperar() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  
		
		String email = request.getParameter("resultado");
		PrintWriter out = response.getWriter();
		

			 String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
				    
				      if(email.matches(EMAIL_REGEX)){
				    	  DaoFactory dao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
				    	  PersonaDao perDao = dao.obtenerPersonaDao();
				    	  PersonaBean bean = perDao.validarEmail(email);
				    	  
				    	  if(bean == null){
				    		  //request.setAttribute("mensaje", "El correo ingresado no se encuentra registrado");
				    		  //request.setAttribute("color", "red");
				    		  out.println("El correo ingresado no se encuentra registrado ");
				    	  }else{
				    		  //request.setAttribute("mensaje", "Se le ha enviado sus datos a su correo, "+bean.getNombres()+", "+bean.getApePat()+" "+bean.getApeMat()+"<br>En caso de no tener acceso a su correo : "+email+" contáctenos en nuestras oficinas");
				    		  //request.setAttribute("color", "blue");
				    		  
				    		  final String username = "iSupremeKid@gmail.com";
				    			final String password = "RICK2010";
				    	 
				    			Properties props = new Properties();
				    			props.put("mail.smtp.auth", "true");
				    			props.put("mail.smtp.starttls.enable", "true");
				    			props.put("mail.smtp.host", "smtp.gmail.com");
				    			props.put("mail.smtp.port", "587");
				    		  
				    			
				    			Session session = Session.getInstance(props,
				    					  new javax.mail.Authenticator() {
				    						protected PasswordAuthentication getPasswordAuthentication() {
				    							return new PasswordAuthentication(username, password);
				    						}
				    					  });
				    			 
				    					try {
				    			 
				    						Message message = new MimeMessage(session);
				    						message.setFrom(new InternetAddress("iSupremeKids@gmail.com"));
				    						message.setRecipients(Message.RecipientType.TO,
				    							InternetAddress.parse("ricardo_garcia3@usmp.pe"));
				    						message.setSubject("Datos de usuario");
				    						String texto = "Hola! "+bean.getNombres()+", "+bean.getApePat()+" "+bean.getApeMat()+" \nUsted solicitó recuperar su contraseña en nuestro sistema.\n\nSus datos actuales son: \nUsuario: "+bean.getUser()+"\nClave: "+bean.getPassword()+"\n\nSaludos.";
				    						message.setText(texto);
				    						
				    						Transport.send(message);
				    						
				    						
				    			 
				    					} catch (MessagingException e) {
				    						out.println("Ocurrió un error enviando el correo");
				    						throw new RuntimeException(e);
				    						
				    					}
				    		  
				    		  
				    		  
				    		  out.println("Se le ha enviado sus datos a su correo, "+bean.getNombres()+", "+bean.getApePat()+" "+bean.getApeMat()+"<br>En caso de no tener acceso a su correo : "+email+" cont&#225ctenos en nuestras oficinas");
				    	  }
				      }else{
				    	  //request.setAttribute("mensaje", "Ingrese un correo válido");
				    	  //request.setAttribute("color", "red");
				    	  out.println("Ingrese un correo v&#225lido");
							//getServletContext().getRequestDispatcher("/recuperar.jsp").forward(request, response);
				      }
				     
			
		
		 
		
	
		
	}

}
