const nacionalidad = "ES";
console.log(nacionalidad);

document.getElementById("refresh").addEventListener('click', function(){
    fetch(`https://randomuser.me/api/?nat=${nacionalidad}`).then(function(res){
        return res.json();
    }).then(function(data) {
        console.log(data);
        datos = data.results[1];
        console.log(datos);
        document.getElementsByClassName("full-name")[0].innerHTML = datos.name.first + " " + datos.name.last;
        document.getElementsByClassName("profile-image")[0].setAttribute("src",datos.picture.thumbnail);
        document.getElementsByClassName("registration-date")[0].innerHTML = datos.registered.date;
        document.getElementsByClassName("born-date")[0].innerHTML = datos.dob.date;
        document.getElementsByClassName("nationality")[0].innerHTML = datos.location.country;
        document.getElementsByClassName("gender")[0].innerHTML = datos.gender;
        document.getElementsByClassName("address")[0].innerHTML = datos.location.street.number + " " + datos.location.street.name;
        document.getElementsByClassName("email")[0].innerHTML = datos.email;
        document.getElementsByClassName("phone")[0].innerHTML = datos.phone;
    }).catch(function(){
        console.log("Problem!");
    });
});