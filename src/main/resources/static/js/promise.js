
function f1(){
    return new Promise((resolve,reject) => {
        console.log("[START]");
        console.log("#1: f1");
        resolve("f1 ==> f2");
    })
}
function f2(passVal){
    return new Promise((resolve,reject) => {
    //setTimeoutは動きをそれっぽくするために入れているだけなので削除可
    setTimeout(
        () => {
            //f1のresolve内の "f1 ==> f2" がpassValに代入される
            console.log(passVal);
            console.log("#2: f2");
            resolve("f2 ==> f3");
         }
         ,Math.random()*2000)
})
}

function f3(passVal){
    return new Promise((resolve,reject) => {
    setTimeout(
        () => {
            console.log(passVal);
            console.log("#3: f3");
            resolve("f3 ==> f4");
        }
         ,Math.random()*3000)
})
}

function f4(passVal){
    return new Promise((resolve,reject) => {
    setTimeout(
        () => {
            console.log(passVal);
            console.log("#4: f4");
            resolve("f4");
        }
          ,Math.random()*4000)
})
}



//f1->f2->f3->f4の順に実行
f1()
.then(f2)
.then(f3)
.then(f4)
.then((response)=> {
    console.log("Final function: "+response);
    console.log("[END]");
}
)
