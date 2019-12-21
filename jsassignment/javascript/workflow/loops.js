var brands=['kingfisher','bisleri','aqus','kinley']
console.log('For of Loop')
for(var element of brands){
    console.log('Brand=',element);
    }
    console.log("===========")
    var brands=['kingfisher','bisleri','aqus','kinley']
console.log('For in Loop')
for(var index  in  brands){
    console.log('Brand=',brands[index])
    }
    console.log('====================');
console.log('For in Loop for object')
var person={
    name:'Viha',
    age:22,
    color:'White'
}
for(var key in person){
    console.log('Value=',person[key])
}
console.log('===================');
console.log('For Each Method of Array ')
var brands=['kingfisher','bisleri','aqus','kinley']
brands.forEach(function(value,index){
    console.log('Brands=',value)
    console.log('Brands Index=',index)
})
console.log('------------------');
console.log('For Each for items')
var items=[{
item:'bangles',
id:1,
price:100
},
{
    item:'eyeliner',
    id:2,
    price:500,
    },
    {
        item:'watch',
        id:3,
        price:5000,
    },
    {
        item:'bike',
        id:4,
        price:100000
    }
]
items.forEach(function(item,index){
    console.log('Item=',item)
    console.log('Index of item=',index )
})

//console.log(name)
    let name ;
  //  let name = 'Viha'
    name = 'Inna';
    console.log('name=',name);
    console.log('============')
     
    // const name2;
    const name2='Aruna';
    console.log('name2=',name2);
    console.log('-----------')
    for(let i=0;i<=5;i++){
        console.log('inside for loop',i)
    }
    console.log('---------------------')
    for(var i=0;i<=5;i++){
        console.log('inside for loop',i);
}
console.log('outside for loop',i);

