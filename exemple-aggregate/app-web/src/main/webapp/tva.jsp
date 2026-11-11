<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>tva</title>
</head>
<body>
   <%
   String strHt = request.getParameter("ht");
   strHt=strHt!=null?strHt:"0";
   double ht = Double.parseDouble(strHt);
   String strTaux = request.getParameter("taux");
   strTaux=strTaux!=null?strTaux:"0";
   double taux = Double.parseDouble(strTaux);
   tp.service.MyService myService = new tp.service.impl.MyServiceImpl();
   double tva= myService.calculerTva(ht, taux);
   double ttc= myService.calculerTtc(ht, taux);
   %>
   <h3>tva</h3>
   <form method="GET">
      ht: <input name="ht" value="<%=strHt%>"> <br/>
      taux (%): <input name="taux" value="<%=strTaux%>"> <br/>
      <input type="submit"/> <br/>
   </form>
   <hr/>
   
   tva= <%=tva%> <br/>
   ttc= <%=ttc%> <br/>
</body>
</html>