
function unregistered(){
    window.alert("Prijavi se kako bi mogao da uradis tu operaciju.");
}
function employerOpensAd(){
    window.alert("Prijavi se kao radnik kako bi mogao da uradis tu operaciju.");
}
function displayWaitPage(){
    window.setTimeout(function(){
        window.location.href="/OglasiImi";
    }, 4000);
}

function searchButton(){
    var kljucnarec = document.getElementById("kljucnarec").valueOf();
    document.getElementById("kljucna1").textContent = kljucnarec;
}

function required(inputtx)
   {
     if (inputtx.value.length == 0)
      { 
         alert("This field cannot be blank");
         return false; 
      }  	
      return true; 
    } 