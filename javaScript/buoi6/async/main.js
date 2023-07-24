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

const buy = async ()=>{
    let res = await buyIphone();
    console.log(res);
}

buy();