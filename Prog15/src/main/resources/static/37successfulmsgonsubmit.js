function message()
{
	var Name=document.getElementById('name');
	var email=document.getElementById('email');
	var msg=document.getElementById('msg');
	const success=document.getElementById('success');
	const danger=document.getElementById('danger');
	if(Name.value===''||email.value===''||msg.value==='')
	{
		danger.style.display='block';
	}
	else{
		success.style.display='block';
		danger.style.display='hide';
	}
	
}