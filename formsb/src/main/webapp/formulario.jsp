<%@ page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<style>
.littleText{
	width: 60px;
}

.bigText{
	vertical-align: 5;
	width: 150px;
	margin-right: 1em;
}

.middleText{
	width: 90px;
}

input[type="number"]{
	width:70px;
}

table{
	border-collapse: collapse;
}

td{
	padding: .4em;
	margin: 0em;
	border: 2px solid black;
	text-align: center;
}

th {
	padding: .1em;
	margin: 0;
	border: 2px solid black;
	text-align: center;
}

textarea{
	vertical-align:top;
}

label{
	vertical-align: 5;
}

*{
	page-break-inside: avoid;
	margin-top:0.3em;
}

</style>
<title>Formulário</title>
<link rel="icon" href="imagens/favicon.jpeg">

</head>
<body>
	
	
	<form action="Formulario" method="post" id="formDados">
	
		<a href="index.jsp"><input type="button" value="Desconectar"></a>
		<%
			String voltarMenu = (String) request.getAttribute("voltarMenu");
			if(voltarMenu!=null){
				out.print("<a href=\"menu.jsp\"><input type=\"hidden\" name=\"voltarMenu\" value=\"voltar ao menu\"></a>");
				out.print("<a href=\"menu.jsp\"><input type=\"button\" value=\"voltar ao menu\"></a>");
			}
		%>
		
		<br>
		<br>
		
		<div style="font-size: xx-large; text-align: center">
			<%
			String mensagem = (String) request.getAttribute("mensagem");
			if (mensagem!=null){
				out.print(mensagem);
			}
			%>
		</div>
		
		<br>
	
		<label style="margin-left:46px;">FORMAN: </label><input type="text" class="bigText" name="forman">
		<br>
		<label style="margin-left:41px;">LINEMAN: </label><input type="text" class="bigText" name="lineman">
		<br>
		<label>GROUNDHAND: </label><input type="text" class="bigText" name="groundhand">
		
		<h3 style="margin-top: 1em;">CELL DISTRIBUTION AND MATERIALS SIGN OF SHEET</h3>
		<label style="margin-left:18px;">CELL NAME: </label><input type="text" class="bigText" name="cellName">
		<label style="margin-left:20px;">HP: </label><input type="text" class="littleText" name="hp" style="vertical-align: 5;">
		<br>
		<label style="margin-left:5px;">Trailer Location: </label><input type="text" class="bigText" name="trailerLocation" style="vertical-align: 5;">
		<label>ROLT: </label><input type="text" class="littleText" name="rolt">
		<br>
		<label>CONTRACTOR: </label><input type="text" class="bigText" name="contractor">
		
		<br>
		<br>
		<hr>
		<br>
		
		<table style="width: 50%; border-collapse: collapse;">
			<thead>
				<tr>
					<th>JSO/PDO</th>
					<th>PDO</th>
					<th>FC</th>
					<th>START</th>
					<th>STOP</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso1"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo1"></td>
					<td width="3%"><input type="text" class="littleText" name="fc1"></td>
					<td width="3%"><input type="number" class="middleText" name="start1"></td>
					<td width="3%"><input type="number" class="middleText" name="stop1"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso2"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo2"></td>
					<td width="3%"><input type="text" class="littleText" name="fc2"></td>
					<td width="3%"><input type="number" class="middleText" name="start2"></td>
					<td width="3%"><input type="number" class="middleText" name="stop2"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso3"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo3"></td>
					<td width="3%"><input type="text" class="littleText" name="fc3"></td>
					<td width="3%"><input type="number" class="middleText" name="start3"></td>
					<td width="3%"><input type="number" class="middleText" name="stop3"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso4"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo4"></td>
					<td width="3%"><input type="text" class="littleText" name="fc4"></td>
					<td width="3%"><input type="number" class="middleText" name="start4"></td>
					<td width="3%"><input type="number" class="middleText" name="stop4"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso5"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo5"></td>
					<td width="3%"><input type="text" class="littleText" name="fc5"></td>
					<td width="3%"><input type="number" class="middleText" name="start5"></td>
					<td width="3%"><input type="number" class="middleText" name="stop5"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso6"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo6"></td>
					<td width="3%"><input type="text" class="littleText" name="fc6"></td>
					<td width="3%"><input type="number" class="middleText" name="start6"></td>
					<td width="3%"><input type="number" class="middleText" name="stop6"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso7"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo7"></td>
					<td width="3%"><input type="text" class="littleText" name="fc7"></td>
					<td width="3%"><input type="number" class="middleText" name="start7"></td>
					<td width="3%"><input type="number" class="middleText" name="stop7"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso8"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo8"></td>
					<td width="3%"><input type="text" class="littleText" name="fc8"></td>
					<td width="3%"><input type="number" class="middleText" name="start8"></td>
					<td width="3%"><input type="number" class="middleText" name="stop8"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso9"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo9"></td>
					<td width="3%"><input type="text" class="littleText" name="fc9"></td>
					<td width="3%"><input type="number" class="middleText" name="start9"></td>
					<td width="3%"><input type="number" class="middleText" name="stop9"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso10"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo10"></td>
					<td width="3%"><input type="text" class="littleText" name="fc10"></td>
					<td width="3%"><input type="number" class="middleText" name="start10"></td>
					<td width="3%"><input type="number" class="middleText" name="stop10"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso11"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo11"></td>
					<td width="3%"><input type="text" class="littleText" name="fc11"></td>
					<td width="3%"><input type="number" class="middleText" name="start11"></td>
					<td width="3%"><input type="number" class="middleText" name="stop11"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso12"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo12"></td>
					<td width="3%"><input type="text" class="littleText" name="fc12"></td>
					<td width="3%"><input type="number" class="middleText" name="start12"></td>
					<td width="3%"><input type="number" class="middleText" name="stop12"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso13"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo13"></td>
					<td width="3%"><input type="text" class="littleText" name="fc13"></td>
					<td width="3%"><input type="number" class="middleText" name="start13"></td>
					<td width="3%"><input type="number" class="middleText" name="stop13"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso14"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo14"></td>
					<td width="3%"><input type="text" class="littleText" name="fc14"></td>
					<td width="3%"><input type="number" class="middleText" name="start14"></td>
					<td width="3%"><input type="number" class="middleText" name="stop14"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso15"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo15"></td>
					<td width="3%"><input type="text" class="littleText" name="fc15"></td>
					<td width="3%"><input type="number" class="middleText" name="start15"></td>
					<td width="3%"><input type="number" class="middleText" name="stop15"></td>
				</tr>
				<tr>
					<td width="3%"><input type="text" class="littleText" name="jso16"></td>
					<td width="3%"><input type="text" class="littleText" name="pdo16"></td>
					<td width="3%"><input type="text" class="littleText" name="fc16"></td>
					<td width="3%"><input type="number" class="middleText" name="start16"></td>
					<td width="3%"><input type="number" class="middleText" name="stop16"></td>
				</tr>
			</tbody>
		</table>
		
		<br>
		<br>
		
		<table>
			<thead>
				<tr>
					<th style="width: 100px;">Item #</th>
					<th style="width: 210px;">Construction/Description</th>
					<th style="width: 100px;">Quantity</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td >43146</td>
					<td >Washers</td>
					<td ><input type="number" name="washers"></td>
				</tr>
				<tr>
					<td >43148</td>
					<td >Thimble Eye Nut (90 Eye Nut)</td>
					<td ><input type="number" name="thimbleEyeNut"></td>
				</tr>
				<tr>
					<td >43149</td>
					<td >Long Extension Bolts</td>
					<td ><input type="number" name="longExtensionBolts"></td>
				</tr>
				<tr>
					<td >43150</td>
					<td >Short Extension Bolts</td>
					<td ><input type="number" name="shortExtensionBolts"></td>
				</tr>
				<tr>
					<td >43151</td>
					<td >Suspense Clamps</td>
					<td ><input type="number" name="suspenseClamps"></td>
				</tr>
				<tr>
					<td >43152</td>
					<td >Angled Suspension Clamps</td>
					<td ><input type="number" name="angledSuspensionClamps"></td>
				</tr>
				<tr>
					<td >43153</td>
					<td >J-Hook</td>
					<td ><input type="number" name="jHook"></td>
				</tr>
				<tr>
					<td >43154</td>
					<td >Long Eye Nuts</td>
					<td ><input type="number" name="longEyeNuts"></td>
				</tr>
				<tr>
					<td >43156</td>
					<td >Eye Nuts</td>
					<td ><input type="number" name="eyeNuts"></td>
				</tr>
				<tr>
					<td >43158</td>
					<td >Dead End 144</td>
					<td ><input type="number" name="deadEnd144"></td>
				</tr>
				<tr>
					<td >43159</td>
					<td >Dead End 288</td>
					<td ><input type="number" name="deadEnd288"></td>
				</tr>
				<tr>
					<td >43161</td>
					<td >Dead End 144 w/Thimble</td>
					<td ><input type="number" name="deadEnd144wThimble"></td>
				</tr>
				<tr>
					<td >43162</td>
					<td >Dead End 288 w/Thimble</td>
					<td ><input type="number" name="deadEnd288wThimble"></td>
				</tr>
				<tr>
					<td >1974</td>
					<td >5/8 Nuts</td>
					<td ><input type="number" name="nuts"></td>
				</tr>
				<tr>
					<td >30196</td>
					<td >Sno-Shoes(pair)</td>
					<td ><input type="number" name="snoShoes"></td>
				</tr>
				<tr>
					<td >14990</td>
					<td >Lashing Wire</td>
					<td ><input type="number" name="lashingWire"></td>
				</tr>
				<tr>
					<td >1876</td>
					<td >Lashing Clamps</td>
					<td ><input type="number" name="lashingClamps"></td>
				</tr>
				<tr>
					<td >17245</td>
					<td >Cable Tie Straps 16"</td>
					<td ><input type="number"name="cableTieStraps"></td>
				</tr>
				<tr>
					<td >44506</td>
					<td >Cable Straps 24"</td>
					<td ><input type="number" name="cableStraps"></td>
				</tr>
				<tr>
					<td >38391</td>
					<td >Tape</td>
					<td ><input type="number" name="Tape"></td>
				</tr>
				<tr>
					<td >17885</td>
					<td >Strand Spacer</td>
					<td ><input type="number" name="strandSpacer"></td>
				</tr>
				<tr>
					<td >28935</td>
					<td >Fiber Markers</td>
					<td ><input type="number" name="fiberMarkers"></td>
				</tr>
				<tr>
					<td >1938</td>
					<td >Tree Guards</td>
					<td ><input type="number" name="treeGuards"></td>
				</tr>
				<tr>
					<td >2053</td>
					<td >Copper</td>
					<td ><input type="number" name="Copper"></td>
				</tr>
				<tr>
					<td >5572</td>
					<td >Grounding Clamps</td>
					<td ><input type="number" name="groundingClamps"></td>
				</tr>
				<tr>
					<td >27399</td>
					<td >Universal Clamps</td>
					<td ><input type="number" name="universalClamps"></td>
				</tr>
			</tbody>
		</table>
		
		<br>
		
		<label id="observation">Observation: </label><textarea rows="5" cols="50" name="observation"></textarea>
		
		<br>
		
		<label style="margin-top: 1.5em;">Print Name:&ensp;</label><input type="text" name="printName" style="width:250px; margin-top: 1.5em;">
		<div>
			<br><br>
			
			<input type="submit" value="Enviar">
		</div>
	</form>
</body>
</html>