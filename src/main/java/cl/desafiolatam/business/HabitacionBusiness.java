package cl.desafiolatam.business;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.model.Habitacion;

public class HabitacionBusiness {

	
	public List<Habitacion> habitaciones(){
		List<Habitacion> habitaciones = new ArrayList<>();
		
		//Habitacion 1:
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setId(1);
		habitacion1.setNombre("Habitacion 1, Simple");
		habitacion1.setDescripcion("");
		habitacion1.setImagen("https://www.elmueble.com/medio/2019/06/25/dormitorio-principal-con-vistas-al-mar-y-banera_854db9e7_1280x944.jpg");
		habitacion1.setPrecio(100000);
		habitacion1.setHabitaciones(1);
		habitacion1.setMetraje(75);
		
		//Habitacion 2:
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setId(1);
		habitacion2.setNombre("Habitacion 1, Simple");
		habitacion2.setDescripcion("");
		habitacion2.setImagen("https://palafito1326.com/wp-content/uploads/2021/03/palafito-1326-vista-mar-1-840x560.jpg");
		habitacion2.setPrecio(100000);
		habitacion2.setHabitaciones(1);
		habitacion2.setMetraje(75);
		
		//Habitacion 3:
		Habitacion habitacion3 = new Habitacion();
		habitacion3.setId(1);
		habitacion3.setNombre("Habitacion 1, Simple");
		habitacion3.setDescripcion("");
		habitacion3.setImagen("https://media-cdn.tripadvisor.com/media/vr-splice-j/0f/90/55/4f.jpg");
		habitacion3.setPrecio(100000);
		habitacion3.setHabitaciones(1);
		habitacion3.setMetraje(75);
		
		
		
		//Habitacion 4:
		Habitacion habitacion4 = new Habitacion();
		habitacion4.setId(1);
		habitacion4.setNombre("Habitacion 1, Simple");
		habitacion4.setDescripcion("");
		habitacion4.setImagen("https://cf.bstatic.com/xdata/images/hotel/max1024x768/297880576.jpg?k=7b3c951a0f850646193bf91a38586ad3c2e5eba6ec8ba9688dbd76dafa871423&o=&hp=1");
		habitacion4.setPrecio(100000);
		habitacion4.setHabitaciones(1);
		habitacion4.setMetraje(75);
		
		
		
		//Habitacion 5:
		Habitacion habitacion5 = new Habitacion();
		habitacion5.setId(1);
		habitacion5.setNombre("Habitacion 1, Simple");
		habitacion5.setDescripcion("");
		habitacion5.setImagen("https://dormitorios.blog/wp-content/uploads/2023/08/ideas-de-dormitorios-con-vista-al-mar-24.jpg");
		habitacion5.setPrecio(100000);
		habitacion5.setHabitaciones(1);
		habitacion5.setMetraje(75);
		
		
		//Habitacion 6:
		Habitacion habitacion6 = new Habitacion();
		habitacion6.setId(1);
		habitacion6.setNombre("Habitacion 1, Simple");
		habitacion6.setDescripcion("");
		habitacion6.setImagen("https://content.arquitecturaydiseno.es/medio/2016/06/08/1_1161x930_7568cc20.jpg");
		habitacion6.setPrecio(100000);
		habitacion6.setHabitaciones(1);
		habitacion6.setMetraje(75);
		
		
		//Habitacion 7:
		Habitacion habitacion7 = new Habitacion();
		habitacion7.setId(1);
		habitacion7.setNombre("Habitacion 1, Simple");
		habitacion7.setDescripcion("");
		habitacion7.setImagen("https://hips.hearstapps.com/hmg-prod/images/casa-lujo-mallorca-minotti-dormitorio-terraza-vistas-mar-1541429730.jpg");
		habitacion7.setPrecio(100000);
		habitacion7.setHabitaciones(1);
		habitacion7.setMetraje(75);
		
		
		
		//Habitacion 8:
		Habitacion habitacion8 = new Habitacion();
		habitacion8.setId(1);
		habitacion8.setNombre("Habitacion 1, Simple");
		habitacion8.setDescripcion("");
		habitacion8.setImagen("https://www.hola.com/horizon/original_aspect_ratio/3c76815d95ec-dormitorio-matrimonio-8a-a.jpg");
		habitacion8.setPrecio(100000);
		habitacion8.setHabitaciones(1);
		habitacion8.setMetraje(75);
		
		
		
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);
		habitaciones.add(habitacion3);
		habitaciones.add(habitacion4);
		habitaciones.add(habitacion5);
		habitaciones.add(habitacion6);
		habitaciones.add(habitacion7);
		habitaciones.add(habitacion8);
		
		
		return habitaciones;
	}
	
	public Habitacion getHabitacionPorId(int id) {
		List<Habitacion>habitaciones = habitaciones();
		Habitacion habitacionEncontrada = null;
		for (Habitacion habitacion : habitaciones) {
			if(habitacion.getId() == id) {
				habitacionEncontrada = habitacion;
			}
		}
			
		return habitacionEncontrada;
	}
	
	public int valorTotalHabitacion(int valorHabitacion, int dias) {
		
		return valorHabitacion*dias;
	}
	
	
}
