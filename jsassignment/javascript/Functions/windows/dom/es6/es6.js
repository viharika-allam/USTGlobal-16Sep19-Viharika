const employees = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name:'Viha',
            age:22
        },{
            name : 'jaffa',
            age : 23
        }])
    }else{
        reject('Failed')
    }
})
employees.then(function(data){
    console.log('Employee Data',data)
}).catch(function(error){
    console.log('Failure Message',error)
})


// const message = new Promise(function(resolve,reject){
//     if(30>10){
//         resolve([{
//             name: 'viha',
//             age:20
//         },
//         {
//             name:'nav',
//             age:21
//         }])
//     }
// })


//closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter+10
        return count
    }
return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value',counter)