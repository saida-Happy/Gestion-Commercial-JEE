// JavaScript Document
function slideImg1(){
setTimeout(function(){ // on utilise une fonction anonyme
		if(i < indexImg2){ // si le compteur est inférieur au dernier

			i++; // on l'incrémente
			}
	else{ // sinon, on le remet à 0 (première image)
		i = 0;
		}
		//$img.css('display', 'none');
		$img2.fadeOut(5,'linear');
		$img2.css('display', 'none');
		$('.bt img').eq(i-1).css('background-color','');
		$currentImg2 = $img2.eq(i);
		//$currentImg.css('display', 'block');
		$currentImg2.fadeIn(1900,'swing');
		$('.bt img').eq(i).css('background-color','#06F');
		slideImg1(); // on oublie pas de relancer la fonction à la fin
}, 7000); // on d

}
function IsEmail(email) {
        var regex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        if(!regex.test(email)) {
           return false;
        }else{
           return true;
        }
      }
	  
	  
	  function verifierinsc(par){
	  $err=$('#f');
	  if(par==" "){
		  $('#f').empty().append("vous devez completez votre formulaire").slideDown();
		  return false;
		  }
		  
		  else {
		  
		  	$(this).removeClass("err1");
			$('#f').slideUp();
		  
		  return true;
		  }
	  
	  
	  }