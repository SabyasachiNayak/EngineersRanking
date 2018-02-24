<!DOCTYPE html>
<html>
<head>
  <title >SW Engineers Ranking</title>
  <script src="../resources/scripts/jquery.min.js"></script>
  <script src="../resources/scripts/engineer.js"></script>
  <link rel="stylesheet" href="../resources/css/style.css">
</head>

<body style="white-space:nowrap;width: 83.8em">
<div class="header">
  <h1 align="center" style="color:whitesmoke;">
  	<a id="userid" ref="#" style="font-size:20px;color:whitesmoke;margin-left:1%"></a>
    <a style="color:whitesmoke;margin-left:10%">Software Engineers Ranking System</a>
    <a href="#" style="font-size:20px;color:whitesmoke;margin-left:2%" onclick="welcome();">Home</a>
  	<a href="#" style="font-size:20px;color:whitesmoke;margin-left:1%" onclick="getProfile();">Profile</a>
  	<a href="#" style="font-size:20px;color:whitesmoke;margin-left:1%" onclick="getRankBoard();">RankBoard</a>
  	<a href="#" style="font-size:20px;color:whitesmoke;margin-left:1%" onclick="signOut();">Sign Out</a>
  </h1>
</div>
<br/>
<div id="welcomeDivContent" class="visible">
 <div id="userName" style="font-weight:bold;font-size:20px;color:black;display: none"></div>
 <br/><br/>
 <h2 align="center" style="color:blue;">Welcome to our ranking system. <br/><br/>
 This tool calculates your score based on certain attributes and compute the rank for you.
 <br/><br/>
 Please click on<a href="#" style="font-size:20px;color:black;margin-left:1%" onclick="getProfile();">Profile</a> to complete your profile which will help us to calculate your score in an efficient manner.
 <br/><br/>
 Please click on<a href="#" style="font-size:20px;color:black;margin-left:1%" onclick="getRankBoard();">RankBoard</a> to go to score/rank calculation page.
 </h2>

</div>   
</body>

<script type="text/javascript">
$(document).ready(function(){
    var name = sessionStorage.getItem("name");
    var fname = name.split(' ').shift();
    document.getElementById('userName').style.display='block';
	document.getElementById('userid').innerHTML= "Welcome " + fname; 
});
</script>
</html>



