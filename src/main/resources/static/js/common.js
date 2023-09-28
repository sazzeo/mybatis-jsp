
console.log("실행");

const $ = (cssSelector)=>{
  return document.querySelector(cssSelector);
}

const generateQueryString = (params)=>{

  const queryStrings = [];
  for(const key in params) {
    queryStrings.push(key+"="+params[key]);
  }

  return "?"+queryStrings.join("&");

};

const $fetch = (url , options) => {

  if(options.body) {
     options.body = JSON.stringify(options.body);
  }

  if(options.method === "get" && options.params) {
    url = url+generateQueryString(options.params);
  }

  return fetch(url, {
    headers: {
      "Content-Type": "application/json",
    },
    ...options,
    redirect: "/index"
  });

}
