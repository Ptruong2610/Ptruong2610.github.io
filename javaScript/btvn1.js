const calculateFactorial = (n) => {
    if(n==0)
    return 1;
    else
    return n * calculateFactorial(n-1);
}
console.log(calculateFactorial(5));

const reverseString = (str) => {
    let rever = "";
    for (let i = str.length - 1; i >= 0; i--) {
        rever += str[i];
    }
    return rever;
}

console.log(reverseString("hello"));

const translate = (contrycode) => {
    switch (contrycode) {
        case 'VN':
            return 'xin chào';
        case 'EN':
            return 'hello';
        case 'FR':
            return 'Bonjour';
        case 'GE':
            return 'Hallo';
        default:
            return 'Không tìm thấy thông điệp cho mã quốc gia"' + contrycode + '"';
    }
}
console.log(translate("GE"));

const subString = (str) => {
    // let sub = "";
    //     for (i = 0; i < str.length - 1; i++) {
    //         if(i<=9){
    //             sub += str[i];
    //         }
    //     }
    //     return sub ;

        if (str.length > 15) {
            return str.substring(0, 10);
        } else {
            return str;
        }
}
console.log(subString("moinguoihaynoikhongvoimatuynhe")+"...");