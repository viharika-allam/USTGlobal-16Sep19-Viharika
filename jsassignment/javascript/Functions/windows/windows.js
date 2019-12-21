console.log('Window Object',window)
console.log('This Keyword',this);
console.log(this == window)
//window.alert('Welcome to JavaScript')
//alert('Welcome Ust Global and TestYanthra')
//let confirmDelete=confirm('Are You Sure You Wnt TO Delete')
//console.log('confirm Delete ',confirmDelete)
let userName = prompt('What is Your Name','Viharika')
console.log('User Name',userName)

const person = {
    firstName :'Viha',
    age :22,
    lastName:'Reddy',
    getName:function(){
        console.log('This keyword',this)
        return this.firstName+''+this.lastName
    }
}
let fullName=person.getName()
console.log('Full Name',fullName)