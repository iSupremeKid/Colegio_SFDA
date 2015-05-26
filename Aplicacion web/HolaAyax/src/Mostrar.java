

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mostrar
 */
@WebServlet("/Mostrar")
public class Mostrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mostrar() {
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
		// TODO Auto-generated method stub
		
		
		
		try {
			response.setContentType("text/html:charset=UTB-8");
			String usuario = request.getParameter("usuario");
			try(PrintWriter out = response.getWriter()){
				out.println(usuario);
				
			}
			Class.forName("com.mysql.jdbc.Driver");
			
//			String url = "jdbc:mysql://sql16.000webhost.com/a4574680_tablas";
//			Connection conexion = DriverManager.getConnection(url, "a4574680_tablas", "12345678AB");
			String url = "jdbc:mysql://db4free.net:3306/ejemplohorario";
			Connection conexion = DriverManager.getConnection(url, "ejemplouser", "ejemplouser");
			
			Statement stmt = conexion.createStatement();
			
			String consulta = "INSERT INTO autores (`nombres`) VALUES ('"+usuario+"')";
			
//			String consulta = "insert into autores(nombres, apellidos)" +
//								" values('" + nombre+ "','" +apellido+ "') ";
			
			stmt.executeUpdate(consulta);
			

			
		} catch (Exception e) {

		}
	}

}
