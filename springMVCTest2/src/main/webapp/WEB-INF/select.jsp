<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript">
	function sub(){
		var id = document.getElementById("idval").value;
		window.location.href="select/"+id+".form";
	}
</script> -->
<script src="jquery-3.2.1.min.js"></script>
<script>
	$(document).ready(function(){
		$("#button1").click(function(){
			var id = $("#idval").val();
			window.location.href="select/"+id+".form";
		})
	})
</script>
</head>
<body>
	<table>
		<tr>
			<td>id</td><td>name</td><td>price</td>
		</tr>
		<tr>
			<td>1</td><td>剃须刀</td><td>100</td>
		</tr>
		<tr>
			<td>2</td><td>电吹风</td><td>50</td>
		</tr>
		<tr>
			<td>3</td><td>充电宝</td><td>25</td>
		</tr>
	</table>
	<form name="form">
		id:<input type="text" name="id" id="idval"><br>
		<button type="button" id="button1" onclick="sub()">提交</button>
	</form>
</body>
</html>