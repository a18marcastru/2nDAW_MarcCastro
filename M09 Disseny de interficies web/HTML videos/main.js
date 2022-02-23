let girar = true;
var video = document.getElementById('video');
var video2 = document.getElementById('video2');

document.getElementById("btn-girar").addEventListener('click',function(){
    if(girar == true){
       video.classList.add('rotate');
        girar = false;
    }
    else {
        video.classList.remove('rotate');
        girar = true;
    }  
});

document.getElementById("btn-girar2").addEventListener('click',function(){
    if(girar == true) {
        video2.classList.add('rotate');
        girar = false;
    }
    else {
        video2.classList.remove('rotate'); 
        girar = true;
    }     
    
});

document.getElementById("btn-play").addEventListener('click',function(){
    video.play();
});

document.getElementById("btn-stop").addEventListener('click',function(){
    video.pause();
});

document.getElementById("btn-play2").addEventListener('click',function(){
    video2.play();
});

document.getElementById("btn-stop2").addEventListener('click',function(){
    video2.pause();
});