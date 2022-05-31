var cnt=1;
function modules(){
	if(cnt==1){
	const map2=new Map();
	const myarr=new Array();
	const map3=new Map();
	var oauth=document.getElementById("oauth").value;
	var auth=document.getElementById("oauth").value;
	 var requestOptions = {
			    method: 'POST',
			    headers: { 'Content-Type': 'application/json' },
			    body:auth
			};
	 fetch("http://localhost:8080/modules",requestOptions)
	  	.then(response => response.text())
	  	.then(data => {
	  		var obj=JSON.parse(data);
	  		
	  		for(let i=0;i<obj.length;i++)
	  		{
	  			const map1=new Map();
	  			var checkbox = document.createElement('input');
	  		    checkbox.type = 'checkbox';
	  		    checkbox.id = obj[i];
	  		    checkbox.name = "chk1";
	  		    checkbox.value = obj[i];
	  		    checkbox.onclick = function(){
	  		    document.getElementById("container1").innerHTML="";
	  		    var md=document.getElementById(obj[i]);
	  		    var mdRow=document.getElementById(obj[i]+"n");
	  		    var mdname;
	  		    	if(md.checked==true&&(mdRow)&&(mdRow.value)){
	  		    	   
	  		    		mdname=md.value;
	  		    		myarr.push(mdRow.value);
	  		    		map3.set(mdname,mdRow.value);
	  		    		
	  		    		const parameter=[obj[i],auth];
         		    		 var pdata = {
	  		   			    method: 'POST',
	  		   			    headers: { 'Content-Type': 'application/json' },
	  		   			    body:JSON.stringify(parameter)
	  		   			};
	  		    		 fetch("http://localhost:8080/fields",pdata)
	  		   	  	.then(response =>{
	  		   	  		if(response.status==200)
	  		   	  		 return response.text()
	  		   	  		else{
	  		   	  		 document.getElementById("container1").innerHTML="Fields Not Available";
	  		   	  		 return 0;
	  		   	  		}})
	  		   	  	.then(data => {
	  		   	  	var obj1=JSON.parse(data);
	  		   	  	for(let j=0;j<obj1.length;j++)
	  		   	  	{
	  		   	  	var checkbox = document.createElement('input');
		  		    checkbox.type = 'checkbox';
		  		    checkbox.id = obj1[j]+obj[i];
		  		    checkbox.name = "chk";
		  		    checkbox.value = obj1[j];
		  		    checkbox.onclick = function() {
		  		    var fields=(obj1[j]+obj[i]);
		  		    var fieldsPrefix=(obj1[j]+obj[i]+"prefix");
		  			var fd=document.getElementById((obj1[j]+obj[i]));
		  			var fdPrefix=document.getElementById(obj1[j]+obj[i]+"prefix");
		  		    if(fd.checked==true)
		  		    {
		  		      console.log(mdname);
		  		      console.log(fd.value);
		  		      map1.set(fd.value,fdPrefix.value);
		  		    }
		  		    else if(fd.checked==false)
		  		    {
		  		       map1.delete(fd.value);
		  		    }
		  		  map2.set(mdname,map1);
		  		  }
		  		    var label = document.createElement('label')
		  		    label.htmlFor = obj1[j]+obj[i];
		  		    label.appendChild(document.createTextNode(obj1[j]));
		  		    var row1=document.createElement('input');
		  		    row1.type = 'text';
		  		    row1.id = obj1[j]+obj[i]+'prefix';
		  		    row1.name = obj1[j]+obj[i]+'prefix';
		  		    var br = document.createElement('br');
		  		    var rr = document.createElement('br');
		  		    
		  		    var container = document.getElementById('container1');
		  		    container.appendChild(checkbox);
		  		    container.appendChild(label);
		  		    container.appendChild(row1);
		  		    container.appendChild(br);
		  		    container.appendChild(rr);
		  		    
	  		   	  	}
	  		   	var btn = document.createElement('button');
	  	        btn.type = 'button';
	  	        btn.innerHTML = 'Select All';
	  	        btn.className = 'btn'; 
	  	        btn.onclick = function(){
	  	    	 var ele=document.getElementsByName('chk');  
	  	         for(var k=0; k<ele.length; k++){  
	  	           if(ele[k].type=='checkbox')  
	  	               ele[k].checked=true;  
	  	         for(let j=0;j<obj1.length;j++){
	  	            var fields=(obj1[j]+obj[i]);
		  		    var fieldsPrefix=(obj1[j]+obj[i]+"prefix");
		  			var fd=document.getElementById((obj1[j]+obj[i]));
		  			var fdPrefix=document.getElementById(obj1[j]+obj[i]+"prefix");
		  		    if(fd.checked==true)
		  		    {
		  		      console.log(mdname);
		  		      console.log(fd.value);
		  		      map1.set(fd.value,fdPrefix.value);
		  		    }
		  		    else if(fd.checked==false)
		  		    {
		  		       map1.delete(fd.value);
		  		    }
		  		  map2.set(mdname,map1);
	  	       }  
	  	         }
	  	      }
	  	        var btn1 = document.createElement('button');
	  	        btn1.type = 'button';
	  	        btn1.innerHTML = 'Unselect All';
	  	        btn1.className = 'btn1'; 
	  	        btn1.onclick = function(){
	  	        	 var ele=document.getElementsByName('chk');  
	  	           for(var k=0; k<ele.length; k++){  
	  	               if(ele[k].type=='checkbox')  
	  	                   ele[k].checked=false;  
	  	             for(let j=0;j<obj1.length;j++){
	 	  	            var fields=(obj1[j]+obj[i]);
	 		  		    var fieldsPrefix=(obj1[j]+obj[i]+"prefix");
	 		  			var fd=document.getElementById((obj1[j]+obj[i]));
	 		  			var fdPrefix=document.getElementById(obj1[j]+obj[i]+"prefix");
	 		  		    if(fd.checked==true)
	 		  		    {
	 		  		      console.log(mdname);
	 		  		      console.log(fd.value);
	 		  		      map1.set(fd.value,fdPrefix.value);
	 		  		    }
	 		  		    else if(fd.checked==false)
	 		  		    {
	 		  		       map1.delete(fd.value);
	 		  		    }
	 		  		  map2.set(mdname,map1);
	 	  	       }  
	  	                 
	  	           }  
	  	        }
	  	        container.appendChild(btn); 
	  		    container.appendChild(btn1);
	  		   	  	
		  		});
	  		    	}
	  		    	else if(md.checked==false) {	
	  		    		var name=md.value;
	  		    		console.log(md.value+" is unchecked");
	  		    		map2.delete(name);
	  		    		map3.delete(name);
	  		    		
	  		    		/*for (const role of map2.entries()) {
	  		    			if(role[0].has(name)){
	  		    		     map2.delete(role[0]);
	  		    		}*/
	  		    		
	  		    	}
	  		    	
	  		    	else
	  		    		{
	  		    		 document.getElementById('container1').innerHTML="";
	  		    		}
	 	  		    }
	  		    var label = document.createElement('label')
	  		    label.htmlFor = obj[i];
	  		    label.appendChild(document.createTextNode(obj[i]));
	  		    var row=document.createElement('input');
	  		    row.type = 'number';
	  		    row.id = obj[i]+'n';
	  		    row.name = obj[i]+'n';
	  		    row.value =10;
	  		    var br = document.createElement('br');
	  		    var rr = document.createElement('br');
	  		    var container = document.getElementById('container');
	  		    container.appendChild(checkbox);
	  		    container.appendChild(label);
	  		    container.appendChild(row);
	  		    container.appendChild(br);
	  		    container.appendChild(rr); 
	  		}
	  	    var button = document.createElement('button');
  	        button.type = 'button';
  	        button.innerHTML = 'Populate';
  	        button.className = 'bt'; 
  	        container.appendChild(button);
  	       button.onclick = function(){
  	        document.getElementById("container1").innerHTML="";
  	       const toObject = (map = new Map) => {
  		  if (!(map instanceof Map)) return map
  		  return (Array.from(map.entries(), ([k, v]) =>{
  			 
  		    if(v instanceof Map) {
  		    	return [(toObject(k)),(toObject(v))]
  		    }
   		    else
  		     return [(k),(v)]
  		  }))
  		}
	  const arrayMap = (toObject(map2));
	  var JsonMap=JSON.stringify(Object.fromEntries(arrayMap));
	  const mapObj = JSON.stringify(Object.fromEntries(map3));
	  console.log((mapObj));
	  console.log(JSON.stringify(Object.fromEntries(arrayMap)));
	  var dataPayload = {
			    method: 'POST',
			    headers: { 'Content-Type': 'application/json' },
			    body:JsonMap+"^"+mapObj+"&"+oauth
			};
	 fetch("http://localhost:8080/csvapi",dataPayload)
	  	.then(response => response.text())
	  	.then(data => 
	  	{
	  		if(data=="success")
	  			{
	  			 fetch("http://localhost:8080/download")
	  		    .then(response => response.text())
	  		    .then(data =>  {
	  		    	window.open("http://localhost:8080/download");
	  		    });
	  			}
	  		console.log("hi");
	  	});
	  	}
	cnt--;
}
	  	)
}
}
   