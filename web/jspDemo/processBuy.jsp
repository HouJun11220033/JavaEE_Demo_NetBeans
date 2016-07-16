<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<body>

	<div>
		<%
	//	Session s=new Session();
	//	这里之所以用getAttribute(itemMap),是因为Map已经声明了这个itemMap.
		Map<String,Integer> itemMap=(Map<String,Integer>)session.getAttribute("itemMap");//多态！

		session.setAttribute("itemMap",itemMap);

		if(itemMap==null)
		{
			itemMap =new HashMap<String,Integer>();
			itemMap.put("Book",0);
			itemMap.put("Computer",0);
			itemMap.put("Car",0);

		}
		//获取上一个页面的请求参数
		String []buys=request.getParameterValues("item");//用数组存放属性值
		for(String item : buys)
		{
			if(item.equals("book"))
			{
				int num1=itemMap.get("Book").intValue();
				itemMap.put("Book",num1+1);
			}
			if(item.equals("computer"))
			{
				int num2=itemMap.get("Computer").intValue();
				itemMap.put("Computer",num2+1);
			}
			if(item.equals("car"))
			{
				int num3=itemMap.get("Car").intValue();
				itemMap.put("Car",num3+1);
			}


		}



		//session.setAttribute("itemMap",itemMap);

		%>
		List:<br/>
		Book:<%=itemMap.get("Book")%><br/>
		Computer:<%=itemMap.get("Computer")%><br/>
		Car:<%=itemMap.get("Car")%><br/>
		</div>
</body>
</html>
