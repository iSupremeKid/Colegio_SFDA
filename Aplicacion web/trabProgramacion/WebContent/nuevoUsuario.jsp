<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PublicoRegistro</title>
</head>
<body>


<h3>Registro</h3>
<form action="<%=getServletContext().getContextPath()%>/RegistrarCliente" method="post">


 
 <p>Name*</p>
  <p>
    <input type="text" name="name" id="usuario">
  </p>
  
   <table width="300" border="0" cellspacing="2">
    <tbody><tr>
      <td><input type="text" name="last_name1" id=""></td>
      <td><input type="text" name="last_name2" id=""></td>
    </tr>
    <tr>
      <td><p>Last Mother's Name</p></td>
      <td>Last Father's Name</td>
    </tr>
  </tbody></table>
  
  <p>User*</p>
  <p>
    <input type="text" name="user" id="usuario">
  </p>
  
   <p>Password*</p>
  <p>
    <input type="text" name="pwd" id="pwd">
  </p>
  
 
  
  <p>Birthday*</p>
<select name="mes" onchange="changeDate(this.options[selectedIndex].value);">
<option value="na">Mes</option>
<option value="1">Enero</option>
<option value="2">Febrero</option>
<option value="3">Marzo</option>
<option value="4">Abril</option>
<option value="5">Mayo</option>
<option value="6">Junio</option>
<option value="7">Julio</option>
<option value="8">Agosto</option>
<option value="9">Septiembre</option>
<option value="10">Octubre</option>
<option value="11">Noviembre</option>
<option value="12">Diciembre</option>
</select>
<select name="dia" id="day">
<option value="na">Dia</option>
</select>
<select name="ano" id="year">
<option value="na">Año</option>
<option value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="1989">1989</option><option value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option value="1980">1980</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="1969">1969</option><option value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option><option value="1960">1960</option><option value="1959">1959</option><option value="1958">1958</option><option value="1957">1957</option><option value="1956">1956</option><option value="1955">1955</option><option value="1954">1954</option><option value="1953">1953</option><option value="1952">1952</option><option value="1951">1951</option><option value="1950">1950</option><option value="1949">1949</option><option value="1948">1948</option><option value="1947">1947</option><option value="1946">1946</option><option value="1945">1945</option><option value="1944">1944</option><option value="1943">1943</option><option value="1942">1942</option><option value="1941">1941</option><option value="1940">1940</option></select>

  
  <p>Gender*</p>
  
  <p>
    <select name="gender">
      <option value="M">Male</option>
      <option value="F">Female</option>
    </select>
    
    <input type="submit" value="Enviar">
  </p>
<p>&nbsp;</p>
</form>







<a href="<%=getServletContext().getContextPath()%>/index.jsp">Atras</a>
</body>
<script language="JavaScript" type="text/javascript">
function changeDate(i){
var e = document.getElementById('day');
while(e.length>0)
e.remove(e.length-1);
var j=-1;
if(i=="na")
k=0;
else if(i==2)
k=28;
else if(i==4||i==6||i==9||i==11)
k=30;
else
k=31;
while(j++<k){
var s=document.createElement('option');
var e=document.getElementById('day');
if(j==0){
s.text="Dia";
s.value="na";
try{
e.add(s,null);}
catch(ex){
e.add(s);}}
else{
s.text=j;
s.value=j;
try{
e.add(s,null);}
catch(ex){
e.add(s);}}}}
y = 1993;
while (y-->1940){
var s = document.createElement('option');
var e = document.getElementById('year');
s.text=y;
s.value=y;
try{
e.add(s,null);}
catch(ex){
e.add(s);}}
</script>
 
</html>