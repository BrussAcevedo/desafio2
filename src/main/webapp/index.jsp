<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="cl.desafiolatam.model.Habitacion"%>
<%@page import="cl.desafiolatam.business.HabitacionBusiness"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
HabitacionBusiness habitacionesServicio = new HabitacionBusiness();
List<Habitacion> listaHabitaciones = habitacionesServicio.obtenerHabitaciones();
%>
<!DOCTYPE html>
<html>
<head>
<%@include file="assets/html/head.jsp"%>
</head>
<body>
	<%@include file="assets/html/header.jsp"%>
	<%@include file="assets/html/header2.jsp"%>
	<section class="MargenBoddy px-5 mx-5 justify-content-center">
		<div class="titulo Cartas py-4">

			<h2>
				Habitaciones Disponibles (<%=listaHabitaciones.size()%>)
			</h2>

			<div class="linea">
				<hr>
			</div>
		</div>


		<form action="RecepcionFormulario" method="post">

			<div
				class="cartasForm row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-between">

				<%
				for (int i = 0; i < listaHabitaciones.size(); i++) {
				%>
				<div class="col mb-3">
					<div class="card" style="width: 18rem">
						<div class="imagenCard ratio ratio-4x3">
							<img class="card-img-top"
								src="<%=listaHabitaciones.get(i).getImagen()%>"
								alt="Card image cap">
						</div>

						<div class="card-body">
							<h5 class="card-title text-center"><%=listaHabitaciones.get(i).getNombre()%></h5>
							<p class="card-text text-center"><%=listaHabitaciones.get(i).getDescripcion()%></p>
							<p class="card-text text-center">
								CLP $<%=listaHabitaciones.get(i).getPrecio()%></p>
							<div class="text-center">
								<input type="radio" id="html" name="idevento"
									value="<%=listaHabitaciones.get(i).getId()%>" checked>
							</div>

						</div>
					</div>
				</div>
				<%
				}
				%>

			</div>

			<hr>
			<div class="tituloFormTxt py-5 ">

				<h2>Información de Reserva Habitación</h2>
			</div>

			<div class="row">

				<div class="col-md-6">
					<label for="validacionNombre" class="form-label">Nombre</label> <input
						type="text" class="form-control" id="txtNombre" name="txtNombre"
						value="" placeHolder="nombre" required>
					<div class="valid-feedback"></div>
				</div>

				<div class="col-md-6">
					<label for="validacionApellido" class="form-label">Apellido</label>
					<input type="text" class="form-control" id="txtApellido"
						name="txtApellido" value="" placeHolder="Apellido" required>
					<div class="valid-feedback"></div>
				</div>

				<div class="col-md-6">
					<label for="validacionCorreo" class="form-label">Email</label> <input
						type="text" class="form-control" id="txtCorreo" name="txtCorreo"
						value="" placeHolder="nombre@mail.com" required>
					<div class="valid-feedback"></div>
				</div>

				<div class="col-md-2">
					<label for="validationCustom04" class="form-label">medioDePago</label>
					<select class="form-select" id="validationCustom04"
						name="txtMedioDePago" required>
						<option value="contado">Contado</option>
						<option value="Transferencia Bancaria">Transferencia
							Bancaria</option>
						<option value="RedCompra">RedCompra</option>

					</select>
					<div class="invalid-feedback">Please select a valid state.</div>
				</div>

				<div class="col-md-2">
					<label for="validationCustom04" class="form-label">Días</label> <select
						class="form-select" id="txtDias" name="txtDias" required>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
					</select>
					<div class="invalid-feedback">Please select a valid state.</div>
				</div>
				<div class="col-md-2">
					<label for="datepicker" class="form-label">Fecha</label> <input
						type="text" class="form-control" id="datepicker" name="txtFecha" 
						required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Please select a valid date.</div>
				</div>
				<div class="botonEnviar ms-0 py-3">
					<button type="submit" class="btn btn-primary">Enviar
						Solicitud de Compra</button>
				</div>


			</div>



		</form>
	</section>

	<%@include file="assets/html/footer.jsp"%>


	<!-- jQuery -->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<!-- Bootstrap Datepicker JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
	<!-- Bootstrap datepicker js locales js -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/locales/bootstrap-datepicker.es.min.js"></script>

	<script>
		$(document).ready(function() {
			var today = new Date();
			$('#datepicker').datepicker({
				format : 'dd/mm/yyyy',
				autoclose : true,
				todayHighlight : true,
				language : 'es',
				startDate : today
			});
		});
	</script>
</body>
</html>