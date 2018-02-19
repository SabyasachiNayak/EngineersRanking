 $(function(){
	    var $select = $(".1-20");
	    for (var i=0;i<=100;i++){
	        $select.append($('<option></option>').val(i).html(i));
	    }
	});
 
function showDiv() {
	   document.getElementById('eng5').style.display = "block";
}

function showPatent() {
	   var isPatent = document.getElementById("patentsFiled");
	   var isPatentVal = isPatent.options[isPatent.selectedIndex].value;
	   if(isPatentVal == 'yes')
	   	{
		   document.getElementById('showPatentDiv').style.display = "block";
	   	}
	   else
		{
		   document.getElementById('showPatentDiv').style.display = "none";
		}
}

function showOpenSource() {
	   var dropDown = document.getElementById("openSourceContribution");
	   var dropDownVal = dropDown.options[dropDown.selectedIndex].value;
	   if(dropDownVal == 'yes')
	   	{
		   document.getElementById('openSourceDiv').style.display = "block";
	   	}
	   else
		{
		   document.getElementById('openSourceDiv').style.display = "none";
		}
}

function showParticipation() {
	   var dropDown = document.getElementById("programmingParticipation");
	   var dropDownVal = dropDown.options[dropDown.selectedIndex].value;
	   if(dropDownVal == 'yes')
	   	{
		   document.getElementById('participationDiv').style.display = "block";
	   	}
	   else
		{
		   document.getElementById('participationDiv').style.display = "none";
		}
}

function showTools() {
	   var dropDown = document.getElementById("openSourceToolDeveloped");
	   var dropDownVal = dropDown.options[dropDown.selectedIndex].value;
	   if(dropDownVal == 'yes')
	   	{
		   document.getElementById('toolsDiv').style.display = "block";
	   	}
	   else
		{
		   document.getElementById('toolsDiv').style.display = "none";
		}
}

function showCertification() {
	   //var dropDown = document.getElementById("certification");
	   //var dropDownVal = dropDown.options[dropDown.selectedIndex].value;
	   var dropDownVal = document.getElementById("certification").value;
	   if(dropDownVal == 'yes')
	   	{
		   document.getElementById('certificationDiv').style.display = "block";
	   	}
	   else
		{
		   document.getElementById('certificationDiv').style.display = "none";
		}
}
 
 function openSignup() {
	    document.getElementById('newUserRegModal').style.display='block';
	    
	    var modal = document.getElementById('newUserRegModal');
	    // When the user clicks anywhere outside of the modal, close it
	    window.onclick = function(event) {
	        if (event.target == modal) {
	            modal.style.display = "none";
	        }
	    };
	};

	function register() {
		var formData = {
	    		name : $("#name").val(),
	    		email : $("#emailId").val(),
	    		password: $("#passwrd").val()
	    	};
		if(formData.name != "" && formData.email != "" && formData.password != "")
		{
			document.getElementById('allFields').style.display='none';
		    $.ajax({
		    type: 'POST',
		    contentType : 'application/json',
		    url:  '../register/registerUser',
		    data : JSON.stringify(formData),
		    async: true,
		    success: function(result) {
		    	 document.getElementById('profileCompleteModal').style.display='block'; 
		    	 console.log("passed" + result);
		    },
		    error: function(result) { 
		        if(result.responseText == "Email already exists.")
		        {
		    		document.getElementById('emailExist').style.display='block';
		        }
		        else
		        {
		        	document.getElementById('profileCompleteModal').style.display='block'; 
		        }
		    }
		  });
		 }
		 else
		 {
			 document.getElementById('emailExist').style.display='none';
			 document.getElementById('allFields').style.display='block';
		 }
		
	};

	function signIn() {
		var formData = {
	    		email :  $("#userid").val(),
	    		password: $("#passwd").val(),
	    	};
		if(formData.email != "" && formData.password != "")
		{
		    $.ajax({
		    type: 'POST',
		    contentType : 'application/json',
		    url:  '../login/validate',
		    data : JSON.stringify(formData),
		    dataType: 'json',
		    async: true,
		    success: function(result) {
		    
			    if(result == '' || result == null)
		    	{
		    		document.getElementById('wrongPass').style.display='block';
		    	}
		    	else
		    	{
		    		document.getElementById('wrongPass').style.display='none';
		    		sessionStorage.setItem("id", result.id);
		    		sessionStorage.setItem("name", result.name);	
		    		window.location.replace("../engineer/welcome");
		    	}
		    	
		    },
		    error: function() {
		    	 document.getElementById('wrongPass').style.display='block';
		    	 console.log('sign in error');
		    }
		  });
		}
	};
	
	function saveProfile() {
		var formData = {
	    		name : $("#name").val(),
	    		emailId : $("#emailId").val(),
	    		highestEducation:$("#highestEducation").val(),
	    		college:$("#college").val(),
	    		companyName : $("#companyName").val(),
	    		location:$("#location").val(),
	    		role:$("#role").val(),
	    		totalExperience:$("#totalExperience").val(),
	    		primarySkill:$("#primarySkill").val(),
	    		secondarySkill:$("#secondarySkill").val(),
	    		primarySkillExperience:$("#primarySkillExperience").val(),
	    		secondarySkillExperience:$("#secondarySkillExperience").val(),
	    		patentsFiled:$("#patentsFiled").val(),
	    		noOfPatents:$("#noOfPatents").val(),
	    		patentsNumber:$("#patentsNumber").val(),
	    		linkedInUrl:$("#linkedInUrl").val(),
	    		stackOverflowUserid:$("#stackOverflowUserid").val(),
	    		githubLink:$("#githubLink").val(),
	    		openSourceContribution:$("#openSourceContribution").val(),
	    		openSourceCommitLink:$("#openSourceCommitLink").val(),
	    		programmingParticipation:$("#programmingParticipation").val(),
	    		competitionLink:$("#competitionLink").val(),
	    		openSourceToolDeveloped:$("#openSourceToolDeveloped").val(),
	    		toolDetails:$("#toolDetails").val(),
	    		certification:$("#certification").val(),
	    		certificationType:$("#certificationType").val(),
	    		certificationDetails:$("#certificationDetails").val(),
	    	};
		$.ajax({
		    type: 'POST',
		    contentType : 'application/json',
		    url:  '../engineer/addEngineer',
		    data : JSON.stringify(formData),
		    dataType: 'json',
		    async: true,
		    success: function(result) {
		    	console.log('record added successfully.');
		    	document.getElementById('userProfileModal').style.display='block';
		    },
		    error: function() {
		    }
		  });
	}
	
	function getProfile() {
		var id = sessionStorage.getItem("id");
		var email = sessionStorage.getItem("email");
		if(id == '' || id == null)
		{
			 $.ajax({
				    type: 'GET',
				    contentType: "application/json; charset=utf-8",
				    url:  '../engineer/getId/',
				    data: {'email':email},
				    async: true,
				    success: function(result) {
					    if(result == '' || result == null)
				    	{
				    	}
				    	else
				    	{
				    		sessionStorage.setItem("id", result);
				    	}
				    },
				    error: function() {
				    	 console.log('session id error');
				    }
			 });
		}
		id = sessionStorage.getItem("id");
		$.ajax({
		    type: 'GET',
		    contentType : 'application/json',
		    url:  '../engineer/getEngineer/' + id,
		    dataType: 'json',
		    async: true,
		    success: function(result) {
		    	$.ajax({
				        type: 'GET',
				        url:  '../engineer/user',
				        async: true,
				        success: function(res) {
				        	$("#welcomeDivContent").html(res);
				        	
				        	document.getElementById("name").disabled = true;
				        	document.getElementById("emailId").disabled = true;
				        	
				        	document.getElementById('btnSave').style.display='none';
				        	document.getElementById('btnUpdate').style.display='block'; 
				        	
				        	if(result.certification == 'yes')
				        	{
				        		document.getElementById('certificationDiv').style.display = "block";
				        	}
				      				        	
				        	$("#name").val(result.name);
				    		$("#emailId").val(result.emailId);
				    		$("#highestEducation").val(result.highestEducation);
				    		$("#college").val(result.college);
				    		$("#companyName").val(result.companyName);
				    		$("#location").val(result.location);
				    		$("#role").val(result.role);
				    		$("#totalExperience").val(result.totalExperience);
				    		$("#primarySkill").val(result.primarySkill);
				    		$("#secondarySkill").val(result.secondarySkill);
				    		$("#primarySkillExperience").val(result.primarySkillExperience);
				    		$("#secondarySkillExperience").val(result.secondarySkillExperience);
				    		$("#patentsFiled").val(result.patentsFiled);
				    		$("#noOfPatents").val(result.noOfPatents);
				    		$("#patentsNumber").val(result.patentsNumber);
				    		$("#linkedInUrl").val(result.linkedInUrl);
				    		$("#stackOverflowUserid").val(result.stackOverflowUserid);
				    		$("#githubLink").val(result.githubLink);
				    		$("#openSourceContribution").val(result.openSourceContribution);
				    		$("#openSourceCommitLink").val(result.openSourceCommitLink);
				    		$("#programmingParticipation").val(result.programmingParticipation);
				    		$("#competitionLink").val(result.competitionLink);
				    		$("#openSourceToolDeveloped").val(result.openSourceToolDeveloped);
				    		$("#toolDetails").val(result.toolDetails);
				    		$("#certification").val(result.certification);
				    		$("#certificationType").val(result.certificationType);
				    		$("#certificationDetails").val(result.certificationDetails);
				        },
				        error: function() {
				            console.log('user profile error');
				        }
				      });
		    	
		    },
		    error: function() {
		    	$.ajax({
			        type: 'GET',
			        url:  '../engineer/user',
			        async: true,
			        success: function(res) {
			        	$("#welcomeDivContent").html(res);
			        },
			        error: function() {
		            console.log('blank user profile error');
		        }
		    	});
		    }
		  });
	}
	
	function updateProfile() {
		var id = sessionStorage.getItem("id");
		
		var formData = {
				id : $("#id").val(),
	    		name : $("#name").val(),
	    		emailId : $("#emailId").val(),
	    		highestEducation:$("#highestEducation").val(),
	    		college:$("#college").val(),
	    		companyName : $("#companyName").val(),
	    		location:$("#location").val(),
	    		role:$("#role").val(),
	    		totalExperience:$("#totalExperience").val(),
	    		primarySkill:$("#primarySkill").val(),
	    		secondarySkill:$("#secondarySkill").val(),
	    		primarySkillExperience:$("#primarySkillExperience").val(),
	    		secondarySkillExperience:$("#secondarySkillExperience").val(),
	    		patentsFiled:$("#patentsFiled").val(),
	    		noOfPatents:$("#noOfPatents").val(),
	    		patentsNumber:$("#patentsNumber").val(),
	    		linkedInUrl:$("#linkedInUrl").val(),
	    		stackOverflowUserid:$("#stackOverflowUserid").val(),
	    		githubLink:$("#githubLink").val(),
	    		openSourceContribution:$("#openSourceContribution").val(),
	    		openSourceCommitLink:$("#openSourceCommitLink").val(),
	    		programmingParticipation:$("#programmingParticipation").val(),
	    		competitionLink:$("#competitionLink").val(),
	    		openSourceToolDeveloped:$("#openSourceToolDeveloped").val(),
	    		toolDetails:$("#toolDetails").val(),
	    		certification:$("#certification").val(),
	    		certificationType:$("#certificationType").val(),
	    		certificationDetails:$("#certificationDetails").val(),
	    	};
		
		$.ajax({
			contentType: "application/json;charset=utf-8",
	        type: 'PUT',
	        url:  '../engineer/updateEngineer/' + id,
	        data : JSON.stringify(formData),
	        dataType: 'json',
	        async: true,
	        success: function(result) {
	        	console.log("engineer record updated");
		    	document.getElementById('userProfileModal').style.display='block';
		    	
		    	$("#name").val(result.name);
	    		$("#emailId").val(result.emailId);
	    		$("#highestEducation").val(result.highestEducation);
	    		$("#college").val(result.college);
	    		$("#companyName").val(result.companyName);
	    		$("#location").val(result.location);
	    		$("#role").val(result.role);
	    		$("#totalExperience").val(result.totalExperience);
	    		$("#primarySkill").val(result.primarySkill);
	    		$("#secondarySkill").val(result.secondarySkill);
	    		$("#primarySkillExperience").val(result.primarySkillExperience);
	    		$("#secondarySkillExperience").val(result.secondarySkillExperience);
	    		$("#patentsFiled").val(result.patentsFiled);
	    		$("#noOfPatents").val(result.noOfPatents);
	    		$("#patentsNumber").val(result.patentsNumber);
	    		$("#linkedInUrl").val(result.linkedInUrl);
	    		$("#stackOverflowUserid").val(result.stackOverflowUserid);
	    		$("#githubLink").val(result.githubLink);
	    		$("#openSourceContribution").val(result.openSourceContribution);
	    		$("#openSourceCommitLink").val(result.openSourceCommitLink);
	    		$("#programmingParticipation").val(result.programmingParticipation);
	    		$("#competitionLink").val(result.competitionLink);
	    		$("#openSourceToolDeveloped").val(result.openSourceToolDeveloped);
	    		$("#toolDetails").val(result.toolDetails);
	    		$("#certification").val(result.certification);
	    		$("#certificationType").val(result.certificationType);
	    		$("#certificationDetails").val(result.certificationDetails);
	        },
	        error: function() {
	            console.log("update engineer error");
	        }
	      });
	    };
	
	function closeUserModal(){
		 var modal = document.getElementById('userProfileModal');
	 	    
	 	    window.onclick = function(event) {
	 	        if (event.target == modal) {
	 	            modal.style.display = "none";
	 	        }
	 	    };
	}
	function getScore() {
		var id = sessionStorage.getItem("id");
		
		$.ajax({
        type: 'POST',
        url:  '../engineer/addEngineerScore/' + id,
        dataType: 'json',
        async: true,
        success: function(result) {
        	getRank();
        },
        error: function() {
            alert("score error");
        }
      });
    };
	
	function getRank() {
		var id = sessionStorage.getItem("id");
		
        $.ajax({
        type: 'GET',
        url:  '../engineer/getEngineerScore/' + id,
        dataType: 'json',
        async: true,
        success: function(result) {
           	document.getElementById('engPoint').style.display='block';
        	document.getElementById("engPoint").innerHTML = "Your Rank in Bangalore is: " + result.score;
        },
        error: function() {
            console.log('rank error');
        }
      });
    };
    
	function recoverPassword() {
	    document.getElementById('forgotPasswordModal').style.display='block';
	    document.getElementById('recoveryEmail').value = '';
	    document.getElementById('getPassword').style.display='none';
	    var modal = document.getElementById('forgotPasswordModal');
	 
	    window.onclick = function(event) {
	        if (event.target == modal) {
	            modal.style.display = "none";
	        }
	    };
	};

	function sendPassword() {
		var recEmail = document.getElementById('recoveryEmail').value;
		if(recEmail != '')
		{
			document.getElementById('getPassword').style.display='block';
		}
		else
		{
			document.getElementById('getPassword').style.display='none';
		}
	};
	
	function getRankBoard()  {
		 $.ajax({
		        type: 'GET',
		        url:  '../engineer/rankboard',
		        async: true,
		        success: function(result) {
		        	$("#welcomeDivContent").html(result);
		        },
		        error: function() {
		            console.log('rank board error');
		        }
		      });
	}
	
	function welcome()  {
		 $.ajax({
		        type: 'GET',
		        url:  '../engineer/welcome',
		        async: true,
		        success: function(result) {
		        	window.location.replace("../engineer/welcome");
		        	var name = document.getElementById('name').value;
		        	var email = document.getElementById('emailId').value;
		        	sessionStorage.setItem('name',name);
		        	sessionStorage.setItem('email',email);
		        },
		        error: function() {
		            console.log('go to profile error');
		        }
		      });
	}
	
	function signOut()  {
		sessionStorage.clear();
		window.location.replace("../login/home");
	}
	
	