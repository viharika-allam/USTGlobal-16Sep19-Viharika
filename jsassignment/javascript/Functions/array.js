const hobbies = ['Sleeping','Eating','Playing','Coding','Roaming']
console.log(typeof hobbies);
const isArrayorNot = Array.isArray(hobbies)
console.log('Hobbies array on not',isArrayorNot)
const hasCricket = hobbies.includes ('Cricket');
console.log('using includes method',hasCricket)
hobbies.push('Guitar','Valleyball')
console.log('After push method',hobbies)
hobbies.pop()
console.log('After pop method',hobbies)
hobbies.unshift('Numismatics','Singing')
console.log('After unshift method',hobbies)
hobbies.shift()
console.log('After Shift method',hobbies)
const hobbies1 = ['Sleeping','Cricket','Eating','Coding'];
hobbies1.splice(1,2,'Bird Flying','Pubg')
console.log('After splice method ',hobbies1)
const afterSlice = hobbies1.slice(2,4)
console.log('After Slice method',hobbies1)
console.log('After Slice method',afterSlice)
const indexOfCoding = hobbies1.indexOf('Coding',1)
console.log('Index of Coding',indexOfCoding);
const stringHobbies = hobbies1.join('-')
console.log('After Join method',stringHobbies)
const numbers = [100,200,300,400,500]
const nums1 = numbers.map (function(value,index){
    let newValue = value+50
    return newValue
})
console.log('After Mao method',nums1)
const nums2 = numbers.map(value=>value+500)
console.log('After Map arrow function',nums2)
numbers.filter(function(value,index){
    if(value>200){
        return true
}else{
    return false
}
})
const filterNumArrow = 
numbers.filter(value=>value>200)
console.log('After filter  method using arrow',filterNumArrow)