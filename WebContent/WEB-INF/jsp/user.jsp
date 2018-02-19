<!DOCTYPE HTML>
<html>
<head>
<title >SW Engineers Ranking</title>
  <script src="../resources/scripts/jquery.min.js"></script>
  <script src="../resources/scripts/engineer.js"></script>
  <link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
  <div id="userdiv">
  <div align="left" style="font-size:20px;margin-left:5%;">
  <label style="font-size:20px;padding-left:30%">Please fill all your details.</label> 
  <a href="#" style="font-size:20px;color:blue;margin-left:10%" onclick="editProfile();">Edit</a>
  <a href="#" style="font-size:20px;color:blue;margin-left:1%" onclick="cancelProfile();">Cancel</a>
  <br/><br/>
  <form id="userForm" style="padding-left: 12%;width: 70%">
	  <fieldset id="userFieldset" disabled="disabled">
		  <div id ="content-container">
			  <div style="padding-left: 24%">
			  <label style="font-size:20px;">Name:</label> 
			  <input type="text" id="name" style="font-size:15px;height:40px;width:350px;" placeholder="Enter your name"/><br/><br/>
			  </div>
			  
			  <div style="padding-left: 24%">
			  <label style="font-size:20px;">Email:</label>
			  <input type="text" id="emailId" style="font-size:15px;height:40px;width:350px;" placeholder="Enter your email id"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 12.3%">
			  <label style="font-size:20px;">Highest Education:</label>
			  <select id="highestEducation" style="font-size:15px;height:40px;width:353px;">
			  	  <option selected disabled hidden>Select Highest Education</option>
				  <option value="Phd">PhD</option>
				  <option value="MTech">MTech</option>
				  <option value="MS">MS</option>
				  <option value="BTech/BE">BTech/BE</option>
				  <option value="MCA">MCA</option>
				  <option value="BCA">BCA</option>
				  <option value="MSC">MSC</option>
				  <option value="Other">Other</option>
			  </select>
			  <br/><br/>
			  </div>
			   
			  <div style="padding-left: 12%">
			  <label style="font-size:20px;">College/University:</label>
			  <input id="college" type="text" style="font-size:15px;height:40px;width:350px;" placeholder="Enter your college/university"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 21%">
			  <label style="font-size:20px;">Company:</label> 
			  <input type="text" id="companyName" style="font-size:15px;height:40px;width:350px;" placeholder="Enter your copmany name"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 12%">
			  <label style="font-size:20px;">Company Location:</label>
			  <select id="location" style="font-size:15px;height:40px;width:353px;">
			      <option selected disabled hidden>Select Company Location</option>
				  <option value="Bangalore">Bangalore</option>
				  <option value="Chennai">Chennai</option>
				  <option value="Hyderabad">Hyderabad</option>
				  <option value="Pune">Pune</option>
				  <option value="Kolkata">Kolkata</option>
				  <option value="Delhi">Delhi</option>
				  <option value="All">Others</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div style="padding-left: 26%">
			  <label style="font-size:20px;">Role:</label>
			  <select id="role" style="font-size:15px;height:40px;width:353px;">
			      <option selected disabled hidden>Select Role</option>
				  <option value="Developer">Developer</option>
				  <option value="Tester">Tester</option>
				  <option value="Architect">Architect</option>
				  <option value="Database">Database</option>
				  <option value="Admin">Admin</option>
				  <option value="Other">Other</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div style="padding-left: 18%">
			  <label style="font-size:20px;">Primary Skill:</label>
			  <select id="primarySkill" style="font-size:15px;height:40px;width:350px;">
			      <option selected disabled hidden>Select Primary Skill</option>
				  <option value="Hadoop">Hadoop</option>
				  <option value="Java">Java</option>
				  <option value="C">C</option>
				  <option value="C++">C++</option>
				  <option value=".Net">.Net</option>
				  <option value="Cloud">Cloud</option>
				  <option value="AI/Machine Learning">AI/Machine Learning</option>
				  <option value="Automation Testing">Automation Testing</option>
				  <option value="Manual Testing">Manual Testing</option>
				  <option value="SAP">SAP</option>
				  <option value="Oracle/SQL Server/Others">Oracle/SQL Server/Others</option>
				  <option value="BI">BI</option>
				  <option value="Unix">Unix</option>
				  <option value="Blockchain">BlockChain</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div style="padding-left: 15.8%">
			  <label style="font-size:20px;">Secondary Skill:</label>
			  <select id="secondarySkill" style="font-size:15px;height:40px;width:350px;">
			      <option selected disabled hidden>Select Secondary Skill</option>
				  <option value="Hadoop">Hadoop</option>
				  <option value="Java">Java</option>
				  <option value="C">C</option>
				  <option value="C++">C++</option>
				  <option value=".Net">.Net</option>
				  <option value="Cloud">Cloud</option>
				  <option value="AI/Machine Learning">AI/Machine Learning</option>
				  <option value="Automation Testing">Automation Testing</option>
				  <option value="Manual Testing">Manual Testing</option>
				  <option value="SAP">SAP</option>
				  <option value="Oracle/SQL Server/Others">Oracle/SQL Server/Others</option>
				  <option value="BI">BI</option>
				  <option value="Unix">Unix</option>
				  <option value="Blockchain">BlockChain</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div style="padding-left: 11.6%">
			  <label style="font-size:20px;">Total Experience yrs:</label>
			  <select id="totalExperience" style="font-size:15px;height:40px;width:60px;">
			  	<option>1</option><option>2</option><option>3</option><option>4</option><option>5</option>
			  	<option>6</option><option>7</option><option>8</option><option>9</option><option>10</option>
			  	<option>11</option><option>12</option><option>13</option><option>14</option><option>15</option>
			  	<option>16</option><option>17</option><option>18</option><option>19</option><option>20</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div style="padding-left: 3.8%">
			  <label style="font-size:20px;">Primary Skill Experience yrs:</label>
			  <select id="primarySkillExperience" style="font-size:15px;height:40px;width:60px;">
			  	<option>1</option><option>2</option><option>3</option><option>4</option><option>5</option>
			  	<option>6</option><option>7</option><option>8</option><option>9</option><option>10</option>
			  	<option>11</option><option>12</option><option>13</option><option>14</option><option>15</option>
			  	<option>16</option><option>17</option><option>18</option><option>19</option><option>20</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div style="padding-left: 1.5%">
			  <label style="font-size:20px;">Secondary Skill Experience yrs:</label>
			  <select id="secondarySkillExperience" style="font-size:15px;height:40px;width:60px;">
			  	<option>1</option><option>2</option><option>3</option><option>4</option><option>5</option>
			  	<option>6</option><option>7</option><option>8</option><option>9</option><option>10</option>
			  	<option>11</option><option>12</option><option>13</option><option>14</option><option>15</option>
			  	<option>16</option><option>17</option><option>18</option><option>19</option><option>20</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div style="padding-left: 18.5%">
			  <label style="font-size:20px;">Patents Filed:</label>
			  <select id="patentsFiled" style="font-size:15px;height:40px;width:60px;" onchange="showPatent();">
			      <option value="no">No</option>
			      <option value="yes">Yes</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div id="showPatentDiv" style="display:none;padding-left: 13.2%">
			  <label style="font-size:20px;">Number of Patents:</label>
			  <select id="noOfPatents" class="1-20" style="font-size:15px;height:40px;width:60px;"></select>
			  <br/><br/>
			  
			  <label style="font-size:20px;padding-left: 4%">Patent Number:</label>
			  <input id="patentsNumber" type="text" style="font-size:15px;height:40px;width:350px;padding-left: 0.9%" placeholder="Enter patent number"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 22%">
			  <label style="font-size:20px;">LinkedIn:</label>
			  <input id="linkedInUrl" type="text" style="font-size:15px;height:40px;width:360px;" placeholder="Enter your linkedin url"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 16.5%">
			  <label style="font-size:20px;">StackOverflow:</label>
			  <input id="stackOverflowUserid" type="text" style="font-size:15px;height:40px;width:360px;" placeholder="Enter your stackoverflow userid"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 24.2%">
			  <label style="font-size:20px;">Github:</label>
			  <input id="githubLink" type="text" style="font-size:15px;height:40px;width:360px;" placeholder="Enter your github link"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 6%">
			  <label style="font-size:20px;">Open Source Contribution:</label>
			  <select id="openSourceContribution" style="font-size:15px;height:40px;width:60px;" onchange="showOpenSource();">
			      <option value="no">No</option>
			      <option value="yes">Yes</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div id="openSourceDiv" style="display:none;">
			  <label style="font-size:20px;padding-left:1%">Open Source Contribution Link:</label>
			  <input id="openSourceCommitLink" type="text" style="font-size:15px;height:40px;width:360px;" placeholder="Enter your open source contibution details/link"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 8%">
			  <label style="font-size:20px;">Hackathon Participation:</label>
			  <select id="hackathonParticipation" style="font-size:15px;height:40px;width:60px;" onchange="showParticipation();">
			     <option value="no">No</option>
			     <option value="yes">Yes</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div id="participationDiv" style="display:none;">
			  <label style="font-size:20px;padding-left:13.5%">Hackathon Details:</label>
			  <input id="hackathonLink" type="text" style="font-size:15px;height:40px;width:360px;" placeholder="Enter hackathon details"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 15%">
			  <label style="font-size:20px;">Tools Developed:</label>
			  <select id="openSourceToolDeveloped" style="font-size:15px;height:40px;width:60px;" onchange="showTools();">
			     <option value="no">No</option>
			     <option value="yes">Yes</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div id="toolsDiv" style="display:none;">
			  <label style="font-size:20px;padding-left: 19.5%">Tool Details:</label>
			  <input id="toolDetails" type="text" style="font-size:15px;height:40px;width:360px;" placeholder="Enter tool details/link"><br/><br/>
			  </div>
			  
			  <div style="padding-left: 19%">
			  <label style="font-size:20px;">Certification:</label>
			  <select id="certification" style="font-size:15px;height:40px;width:60px;" onchange="showCertification();">
			     <option value="no">No</option>
			     <option value="yes">Yes</option>
			  </select>
			  <br/><br/>
			  </div>
			  
			  <div id="certificationDiv" style="display:none;">
			  <label style="font-size:20px;padding-left: 11.7%">Certification Details:</label>
			  <select id="certificationType" style="font-size:15px;height:40px;width:100px;">
			      <option value="aws">AWS</option>
				  <option value="hadoop">Hadoop</option>
				  <option value="java">Java</option>
				  <option value=".net">.Net</option>
				  <option value=".net">Others</option>
			  </select>
			  <input type="text" id="certificationDetails" style="font-size:15px;height:40px;width:450px;" placeholder="Enter certification details and links">
			  </div>
		  </div>
	  </fieldset>
 </form>
  <br/>
  <br/>
  <input type="button" id="btnSave" class="button" style="font-size:15px;height:40px;width:160px;margin:auto;margin-left:40%;" value="Save" onclick="saveProfile();">
  <input type="button" id="btnUpdate" class="button" style="font-size:15px;height:40px;width:160px;margin:auto;margin-left:40%;display: none" value="Update" onclick="updateProfile();">
  </div>
 
 <!--Modal-Profile -->
 <div id="userProfileModal" class="modal">
  <form class="modal-content">  
    <div align="center">
     <br/>
     <h2 align="center">Profile details updated successfully.Now you can check your rank.</h2>
     <br/>
     <br/>
    <!-- <a href="#" style="font-size:25px;color:blue;" onclick="getRankBoard();">Check Rank</a> -->
    <button id="checkRankbtn" class="button" style="font-size:15px;height:40px;width:160px;margin:auto;margin-left:7%; display:inline-block;" onclick="getRankBoard();">Check Rank</button>
   </div>
  </form>
 </div>
 </div>
</body>
</html>





