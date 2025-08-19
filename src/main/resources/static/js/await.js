// 2,3,1の順で出力される
async function resolveSample() {
    setTimeout(function(){console.log("1")},2000);
    return '2';
}

resolveSample().then(value => {
    console.log(value); // => resolve!!
    console.log(3);
});

// setTimeout を Promise でラップして待つ必要があります👇
function wait(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function resolveSample() {
  await wait(2000);
  console.log("1");
  return "2";
}

resolveSample().then(value => {
  console.log(value); // "2"
  console.log(3);
});

// setTimeout 単体では値を返せない
// async/await で待つには Promise が必須
// だから Timeout 関数は Promise を使う必要がある