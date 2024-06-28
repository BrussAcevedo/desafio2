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
		Habitacion habitacionEncontrada = habitacionServicio.getHabitacionPorId(Integer.parseInt(request.getParameter("idevento")));

		int valorPagar =  habitacionServicio.valorTotalHabitacion(habitacionEncontrada.getPrecio(), Integer.parseInt(request.getParameter("txtDias")));
		
		Persona persona = new Persona(request.getParameter("txtNombre"), request.getParameter("txtApellido"), request.getParameter("txtCorreo"));
		Reserva reserva = new Reserva(request.getParameter("txtMedioDePago"), request.getParameter("txtDias"), request.getParameter("txtFecha"));
		
		request.setAttribute("persona", persona);
		request.setAttribute("reserva", reserva);
		request.setAttribute("nombreHabitacion", habitacionEncontrada.getNombre());
		request.setAttribute("valor", valorPagar);
		
		request.getRequestDispatcher("detalle.jsp").forward(request, response);
		
	}

}
