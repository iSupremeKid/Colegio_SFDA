<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-2.1.3.js"></script>
<title>Insert title here</title>
<style>
		.clase1{
			color:black;
		}
		.clase2{
			color:red;
		}
		.clase3{
			color:orange;
		}
	</style>
<script>
	$(document).ready(function (){
		$('#enviar').click(function (event) {
			var y = $("div#hi5").html();
			$.post('Mostrar' ,{
				usuario: y
			},
			function (responseText) {
				$('#datos').html(responseText);
			});
		});
	});
</script>
<script type="text/javascript">
		function action (x) {
			
			
			
			if(x.textContent=="Libre"){
				x.innerHTML = "Ocupado";
				x.className = "clase3";
			}else if (x.textContent=="Ocupado"){
				x.innerHTML = "Preferencia";
				x.className = "clase2";
			}else{
				x.innerHTML = "Libre";
				x.className = "clase1";
			}
		}
	</script>
</head>
<body>

	<div id="hi5">
	<table>
		<tbody>
			<tr>
				<td>hor</td>
				<td>lun</td>
				<td>mar</td>
			</tr>
			<tr>
				<td>1</td>
				<td onclick="action(this)" class="clase1">Libre</td>
				<td onclick="action(this)" class="clase1">Libre</td>
			</tr>
			<tr>
				<td>2</td>
				<td onclick="action(this)" class="clase1">Libre</td>
				<td onclick="action(this)" class="clase1">Libre</td>
			</tr>
		</tbody>
	</table>
	</div>



	<form action="" id="form">
		<input type="button" name="enviar" id="enviar" value="enviar" />
	</form>
	<div id="datos"></div>
</body>
</html>