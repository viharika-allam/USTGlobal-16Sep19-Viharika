function fabonacci(a,b){
    var c;
         for(i=1;i<=10;i++){
             c=a+b
             console.log(c) 
             a=b;
             b=c;
         }
     }
     fabonacci(0,1);
     var fabonacci=function(a,b){
      var c;
      for(i=1;i<=10;i++){
          c=a+b
          console.log(c)
           a=b;
           b=c;
      }
  }
  fabonacci(0,1);
    (function(a,b){
      var c;
      for(i=1;i<=10;i++){
      c=a+b
      console.log(c)
      a=b;
      b=c;
      }
  })
  (0,1);
 var fabonacci=(a,b)=>{
     var c;
      for(i=1;i<=10;i++){
          c=a+b
          console.log(c)
          a=b;
          b=c;
      }
}
fabonacci(0,1) 