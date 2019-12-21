function first(){
    setTimeout(function(){
    console.log('First Function Executed')
},5000)
console.log('Executed');
}
function second(){
    console.log('Second Function Executed')
}

first()
second()
console.log("========================");

function first1(callback){
    setTimeout(function(){
    console.log('First Function Executed')
    callback()
},0)
//console.log('Executed');
}
function second1(){
    console.log('Second Function Executed')
}

first1(second1)

