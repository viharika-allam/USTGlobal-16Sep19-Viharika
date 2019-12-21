function fact(num){
    var fact=1
    for(i=1;i<=num;i++){
        fact*=i;
    }
    return fact
}
console.log(fact(6))
var fact=function(num){
 var fact=1
 for(i=1;i<=num;i++){
     fact*=i
 }
 return fact
}
console.log(fact(4))
console.log('----------------')
(function(num){
    var fact=1
    for(i=1;i<=num;i++){
    fact*=i
    }
     console.log(fact)
})
(3)
var div1=num=>{
    var fact=1
    for(i=1;i<=num;i++){
        fact*=i
    }
    console.log(fact)
}
div1(5)