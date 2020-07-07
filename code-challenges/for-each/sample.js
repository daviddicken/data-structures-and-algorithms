'use strict';
console.log('i am here');

  const inventory = [{ name: 'apples', available: true }, { name: 'pears', available: true }, { name: 'oranges', available: false }, { name: 'bananas', available: true }, { name: 'blueberries', available: false }];

const createList = (availableItems) => {
  const list = [];
  availableItems.forEach((value) =>
  {
    //console.log(value.name);
    if(value.available === true)
    {
     list.push(value.name);
    }
   // console.log(value.available);


  })
  console.log(list);
};

createList(inventory);