let girar = true;
var giros = document.getElementsByClassName("girar");
var videos = document.getElementsByClassName('video');
var play = document.getElementsByClassName("btn-play");
var parar = document.getElementsByClassName("btn-stop");

/*Este for esta dedicado a la transformacion de girar a 360deg, utilizando una classList, 
cuanda haga el evento de clickar.*/
for(let i = 0;i < giros.length;i++) {
    giros[i].addEventListener('click',function(){
        if(girar == true){
            videos[i].classList.add('rotate');
            girar = false;
        }
        else {
            videos[i].classList.remove('rotate');
            girar = true;
        }  
    });
}

//Este for es para el play y el stop del class video, cuando haga el evento de clickar.
for(let i = 0;i < videos.length;i++) {
    play[i].addEventListener('click',function(){
        videos[i].play();
    });

    parar[i].addEventListener('click',function(){
        videos[i].pause();
    });
}