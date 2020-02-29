<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<script src="${pageContext.request.contextPath}/statics/pay/js/jquery.min.js" type="text/javascript"></script>

<html>

    <head>
        
    </head>
    
    <body>
        
    <form id="payForm" action="${pageContext.request.contextPath}/statics/front/alipay.jsp" method="post">
    	<input type="hidden" name="orderId" value="${order.id }" />
        <table>
        	<tr>
        		<td>
        			订单编号: ${order.id }
        		</td>
        	</tr>
        		<td>
        			产品名称: ${p.name }
        		</td>
        	<tr>
        	</tr>
        		<td>
        			订单价格: ${order.orderAmount }
        		</td>
        	<tr>
        	</tr>
        		<td>
        			购买个数：${order.buyCounts }
        		</td>
        	</tr>
        	</tr>
        		<td>
					<a href="${pageContext.request.contextPath}/statics/front/alipay.jsp"><img src="${pageContext.request.contextPath}/statics/img/alipay.jpg" style="width: 50px;height: 50px"></a>
        			<input type="submit" value="前往支付宝进行支付">
					<a href="${pageContext.request.contextPath}/wxpay/createPreOrder?greensId=1&totalCount=2940" ><img src="${pageContext.request.contextPath}/statics/img/wx.jpg" style="width: 50px;height: 50px"></a>
        			<input type="button" value="微信扫码支付" onclick="wxpayDisplay()">
        		</td>
        	</tr>
        </table>
    </form>
    
    	
        <input type="hidden" id="hdnContextPath" name="hdnContextPath" value="${pageContext.request.contextPath}"/>
    </body>
    
</html>


<script type="text/javascript">

	function wxpayDisplay() {
		debugger;
		
		var hdnContextPath = $("#hdnContextPath").val();
		
		$("#payForm").attr("action", hdnContextPath + "/wxpay/createPreOrder.action?greensId=1&totalCount=2940");
		$("#payForm").submit();
	}

// 	$(document).ready(function() {
		
// 		var hdnContextPath = $("#hdnContextPath").val();
		
// 	});
	

</script>

