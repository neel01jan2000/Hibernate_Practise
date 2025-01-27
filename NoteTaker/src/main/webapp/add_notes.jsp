<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all_js_css.jsp" %>
<title>Add_Notes</title>
</head>
<body>

 <div class="container-fluid p-0 m-0">
  <%@include file="navbar.jsp" %>
	<br>  
  <div class="container">
  
  <h1>Please fill your note details</h1>
  
  
  <form action="SaveNoteServlet" method="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">Note Title</label>
    <input required type="text" name="title" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter here">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Note Content</label>
    <textarea required id="content" name="content" placeholder="Enter your content here" class="form-control" style="height:300px"></textarea>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
  
  
  
  </div>
  
  
  
  </div>
</body>
</html>