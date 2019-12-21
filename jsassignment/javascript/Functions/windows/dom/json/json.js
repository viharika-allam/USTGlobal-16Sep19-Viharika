const person = {
    name : 'Viharika',
    age : 22,
    color : 'Black',
    address :{
        city : 'Guntur',
        state: 'Ap',
        pincode : 46644
    },
    hobbies :['Coding','Eating','Sleeping']
}
console.log('JavaScript person Object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person Object',jsonObject)
const JavaScriptPersonObject = JSON.parse(jsonObject)
console.log('javaScript person object after parse',JavaScriptPersonObject)
localStorage.setItem('email','billgate@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email ID',emailID)
localStorage.clear();