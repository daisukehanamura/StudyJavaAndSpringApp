function callApi() {
    fetch('/api/hello?name=dellgreen')
        .then
        // ここでcallback関数として登録する
        .then(data => {
            document.getElementById('result').textContent = JSON.stringify(data, null, 2);
            console.log("成功した時に通る")
        });
            console.log("fetchは非同期だからここが先に通るお")
}