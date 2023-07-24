let money = 35;
let buyIphone = () =>{
    return new Promise(function(resolve, reject){
        if(money>30){
            resolve("Mua iphone thôi")
        }else{
            reject("Kiếm thêm tiền đi")
        }
    })
}

let buyAirpot= () =>{
    return new Promise(function(resolve, reject){
        if(money - 30 - 4 >=0){
            resolve("Mua thêm airpot")
        }else{
            reject("Không đủ tiền mua airpot")
        }
    })
}

buyIphone().then(res =>{
    console.log(res);
    // buyAirpot().then(res1 =>{
    //     console.log(res1);
    // })
    // .catch(err2 =>{
    //     console.log(err2);
    // })
    return buyAirpot();
})
.then(res =>{
    console.log(res);
})
.catch(err =>{
    console.log(err);
})
.finally(() =>{
    console.log("về nhà đi")
})