document.getElementById("refresh").addEventListener('click', function(){
    fetch("https://api.coindesk.com/v1/bpi/currentprice.json").then(function(res){
        return res.json();
    }).then(function(data) {
        console.log(data);
        document.getElementById("cotizacion").innerHTML = data.bpi.EUR.rate;
    }).catch(function(){
        console.log("Problem!");
    });
});