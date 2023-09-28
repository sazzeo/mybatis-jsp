<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>공지사항 상세 조회</title>
    <script src="/js/common.js"></script>
</head>
<body>
<div>
    userSeq: <input type="text" id="userSeq"/>
</div>
<div>
    제목: <input type="text" id="title"/>
</div>
<div>
    내용: <input type="text" id="contents"/>
</div>
<button id="insertButton">등록</button>
</body>
<script type="text/javascript">

  $("#insertButton").addEventListener("click", () => {
    onInsert();
  })

  const onInsert =  () => {
    const userSeq = $("#userSeq").value;
    const title = $("#title").value;
    const contents = $("#contents").value;

    const insertData = {userSeq, title, contents};

    console.log(insertData);

    // await fetch("/board", {
    //   method: "post",
    //   headers: {
    //     "Content-Type": "application/json",
    //   },
    //   body: JSON.stringify(insertData)
    // })

      $fetch("/board" , {
        method: "post" ,
        body: insertData
      }).then( res => {
        return res.json();
      }).then(res=> {
        if(res.error) {
            alert(res.message);
        }
      })
        .catch(error => {
        console.log("error:" ,error);
      })
  }

</script>
</html>