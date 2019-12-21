const items=[{
    name:'bangles',
    id:1,
    price:100,
    },
    {
     name:'eyeliner',
        id:2,
        price:500,
        },
        {
            name:'watch',
            id:3,
            price:5000,
        },
        {
            name:'bike',
            id:4,
           price:100000,
        },
        {
            name:'Pen',
            id:5,
           price:10,
        },
        {
            name:'Slipers',
            id:6,
            price:10000,
            },
            {
             name:'Jeans',
                id:7,
                price:5000,
                },
                {
                    name:'Ring',
                    id:8,
                    price:7000,
                },
                {
                    name:'bed',
                    id:9,
                    price:100000,
                },
                {
                    name:'Iron Box',
                    id:10,
                    price:7000,
                }
            ]
        const updatedItem = items.map (function(item,index){
            item.price=item.price+300;
            return item;
        })
        console.log(",items=",updatedItem);
        console.log("=============================");

        const itemsArrow = items.map((value)=>{
            value.price=value.price+300;
            return value;
        })
        console.log("items=",itemsArrow);
        console.log("============================");

            const filteredItems=items.filter((item)=>item.price>2000);
            console.log("items=",filteredItems);        