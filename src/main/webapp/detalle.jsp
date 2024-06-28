<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="assets/html/head.jsp"%>
</head>
<body>
	<%@include file="assets/html/header.jsp"%>
	<%@include file="assets/html/header2.jsp"%>


	<section class="MargenBoddy px-5 mx-5 justify-content-center">
		<div class="Titulo mt-5 pt-5 mb-2 pb-2">
			<h2>
				Detalle de solicitud: <b>${nombreHabitacion}</b>
			</h2>
		</div>


		<div class="pb-5 mb-5">
			<table class="table">

				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Item</th>
						<th scope="col">Valor</th>

					</tr>

				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>Nombre</td>
						<td>${persona.nombre}</td>

					</tr>

					<tr>
						<th scope="row">2</th>
						<td>Apellido</td>
						<td>${persona.apellido}</td>

					</tr>

					<tr>
						<th scope="row">3</th>
						<td>Email</td>
						<td>${persona.email}</td>

					</tr>

					<tr>
						<th scope="row">4</th>
						<td>Medio de Pago</td>
						<td>${reserva.medioPago}</td>

					</tr>

					<tr>
						<th scope="row">6</th>
						<td>Fecha</td>
						<td>${reserva.fechaEntrada}</td>

					</tr>

					<tr>
						<th scope="row">6</th>
						<td>Días</td>
						<td>${reserva.diasStr}</td>

					</tr>



					<tr>
						<th scope="row">7</th>
						<td>Valor a Pagar</td>
						<td><b>CLP$ ${valor}</b></td>

					</tr>

				</tbody>
			</table>
		</div>

	</section>


	<%@include file="assets/html/footer.jsp"%>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>