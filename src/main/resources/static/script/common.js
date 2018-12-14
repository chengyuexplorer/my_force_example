chc = function () {
};

chc.isInAjax = false;

chc.ajax = function (async, url, type, data, onsucess, onfail, content_type) {
    if (typeof (content_type) === "undefined" || content_type === "") {
        content_type = "application/json; charset=utf-8";
        data = JSON.stringify(data); // 将字符串解析成JSON数据格式
    }
    $.ajax({
        async: async,// 是否支持异步刷新，默认是true
        cache: false,
        type: type,  // 请求方式
        url: url,    // 请求路径
        contentType: content_type,
        data: data,  // 需要提交的数据
        dataType: "json", // 服务器返回数据的类型
        success: function (data) { // 请求成功后的回调函数
            if (data["code"] === 200) {
                if (onsucess)
                    onsucess(data["data"]);
                chc.isInAjax = false;
            } else {
                chc.isInAjax = false;
                if (onfail != null && typeof (onfail)!== "undefined") {
                    onfail(data);
                } else {
                    chc.alert(data["msg"]);
                }
            }
        },
        error: function (jqXHR, textStatus, errorThrown) { // 请求失败后的回调函数
            alert("请求错误！");
            chc.isInAjax = false;
        }
    });
};


chc.post = function (url, data, onsucess, onfail) {
    chc.isInAjax = true;
    chc.ajax(false, url, "POST", data, onsucess, onfail)
};

chc.get = function (url, data, onsucess, onfail) {
    chc.isInAjax = true;
    chc.ajax(false, url, "GET", data, onsucess, onfail);
};

chc.put = function (url, data, onsucess, onfail) {
    chc.isInAjax = true;
    chc.ajax(false, url, "PUT", data, onsucess, onfail);
};

chc.delete = function (url, data, onsucess, onfail) {
    chc.isInAjax = true;
    chc.ajax(false, url, "DELETE", data, onsucess, onfail);
};










