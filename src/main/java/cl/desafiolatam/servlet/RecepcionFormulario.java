package cl.desafiolatam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.business.HabitacionBusiness;
import cl.desafiolatam.model.Habitacion;
import cl.desafiolatam.model.Persona;
import cl.desafiolatam.model.Reserva;

/**
 * Servlet implementation class RecepcionFormulario
 */
@WebServlet("/RecepcionFormulario")
public class RecepcionFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecepcionFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HabitacionBusiness habitacionServicio = new HabitacionBusiness();
		List<Habitacion> habitaciones = habitacionServicio.obtenerHabitaciones();
		String idTest = request.getParameter("idevento");
		String idRecibida = request.getParameter("idevento");
		int idHabitacion = Integer.parseInt(idRecibida); 
		Habitacion habitacionEncontrada = habitacionServicio.getHabitacionPorId(idHabitacion);
		
		String nombre = request.getParameter("txtNombre");
		String apellido = request.getParameter("txtApellido");
		String email = request.getParameter("txtCorreo");
		String medioPago = request.getParameter("txtMedioDePago");;
		String diasStr = request.getParameter("txtDias");
		String fechaEntrada = request.getParameter("txtFecha");
		int dias = Integer.parseInt(diasStr);
		int valorPagar =  habitacionServicio.valorTotalHabitacion(habitacionEncontrada.getPrecio(), dias);
		
		Persona persona = new Persona(nombre, apellido, email);
		Reserva reserva = new Reserva(medioPago, diasStr, fechaEntrada);
		
		System.out.println(idTest);
		
		request.setAttribute("persona", persona);
		request.setAttribute("reserva", reserva);
		request.setAttribute("nombreHabitacion", habitacionEncontrada.getNombre());
		request.setAttribute("valor", valorPagar);
		
		request.getRequestDispatcher("detalle.jsp").forward(request, response);
		
	}

}
