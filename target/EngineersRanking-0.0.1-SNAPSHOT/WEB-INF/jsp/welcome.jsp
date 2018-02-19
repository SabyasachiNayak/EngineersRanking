<!DOCTYPE html>
<html>
<head>
  <title >SW Engineers Ranking</title>
  <script src="../resources/scripts/jquery.min.js"></script>
  <script src="../resources/scripts/engineer.js"></script>
  <link rel="stylesheet" href="../resources/css/style.css">
</head>

<body>
<div class="header">
  <h1 align="center" style="color:whitesmoke;padding-left: 28%">Software Engineers Ranking System
    <a href="#" style="font-size:20px;color:whitesmoke;margin-left:10%" onclick="welcome();">Home</a>
  	<a href="#" style="font-size:20px;color:whitesmoke;margin-left:1%" onclick="getProfile();">Profile</a>
  	<a href="#" style="font-size:20px;color:whitesmoke;margin-left:1%" onclick="getRankBoard();">RankBoard</a>
  	<a href="#" style="font-size:20px;color:whitesmoke;margin-left:1%" onclick="signOut();">Sign Out</a>
  </h1>
</div>
<br/>
<div id="welcomeDivContent" class="visible">
 <div id="userName" style="font-weight:bold;font-style:italic;font-size:20px;color:blue;display: none"></div>
 <br/><br/>
 <h2 align="left" style="color:blue;">Welcome to our ranking system. <br/><br/>
 This tool calculates your score based on certain attributes and compute the rank for you.
 <br/><br/>
 Please click on Profile to complete your profile which will help us to calculate your score in an efficient manner.
 <br/><br/>
 Please click on RankBoard to go to rank calculation page.
 </h2>

</div>   
</body>

<script type="text/javascript">
$(document).ready(function(){
    var name = sessionStorage.getItem("name");
    document.getElementById('userName').style.display='block';
	document.getElementById('userName').innerHTML='Hey ' + name; 
});
</script>
</html>



