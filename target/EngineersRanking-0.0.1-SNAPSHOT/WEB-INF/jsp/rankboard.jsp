<!DOCTYPE HTML>
<html>
<head>
  <script src="../resources/scripts/jquery.min.js"></script>
  <script src="../resources/scripts/engineer.js"></script>
  <link rel="stylesheet" href="../resources/css/style.css">
</head>

<body style="white-space:nowrap;width:83.8em">
<div id="rankContent">
<br/>
<label style="font-size:20px;margin-left:30%;">Are you interested to know your professional rank? Click below.</label>
<br/><br/><br/>

<div align="center">
<button id="btn" class="button" style="font-size:15px;height:40px;width:200px;margin:auto; display:inline-block;" onclick="getRank();">Get your rank</button>
<!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select style="font-size:15px;height:40px;width:200px;margin:auto; display:inline-block;">
  <option value="bangalore">Bangalore</option>
  <option value="chennai">Chennai</option>
  <option value="hyderabad">Hyderabad</option>
  <option value="pune">Pune</option>
  <option value="kolkata">Kolkata</option>
  <option value="delhi">Delhi</option>
  <option value="all">All location</option>
</select> -->
</div>

<br/><br/>
<button id="engPoint" class="result" style="font-size:20px;height:40px;width:350px;margin:auto;border-radius:10px;border:1px solid #0084bf;color:navy;display: none"></button>
<br/><br/>
 
<div align="center">
<label style="font-size:20px;">Are you interested to know top 5 professionals rank? Click below.</label>
<br/><br/><br/>
<button id="btn5" class="button" style="font-size:15px;height:40px;width:200px;margin:auto; display:inline-block;" onclick="getScoreList();">Get top 5 Engineers</button>
<!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select style="font-size:15px;height:40px;width:200px;margin:auto; display:inline-block;">
  <option value="bangalore">Bangalore</option>
  <option value="chennai">Chennai</option>
  <option value="hyderabad">Hyderabad</option>
  <option value="pune">Pune</option>
  <option value="kolkata">Kolkata</option>
  <option value="delhi">Delhi</option>
  <option value="all">All location</option>
</select> -->
</div>
<br/>
<br/>

<div id="topScoreList" align="center" style="display:none;" >
<table id="scoreTable" style="width:50%">
  <tr>
    <th>Name</th>
    <th>Score</th> 
    <th>Company</th>
    <th>Skill</th>
  </tr>
</table>
</div>

</div>
</body>

</html>


