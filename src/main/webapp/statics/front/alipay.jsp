<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>支付宝电脑网站支付</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/alipay.css" />
</head>
<%
	//获取订单金额
	String totalAmounts=request.getParameter("totalAmounts");
	double amounts=0.0;
	if (StringUtils.isNoneEmpty(totalAmounts)) {
		amounts=Double.valueOf(totalAmounts);
	}
	//方便EL表达式获取
	request.setAttribute("amounts",amounts);
%>
<body text=#000000 bgColor="#ffffff" leftMargin=0 topMargin=4>
	<header class="am-header">
	<h1>支付宝电脑网站支付体验入口页</h1>
	</header>
	<div id="main">
		<div id="tabhead" class="tab-head">
			<h2 id="tab1" class="selected" name="tab">付 款</h2>
			<h2 id="tab2" name="tab">交 易 查 询</h2>
			<h2 id="tab3" name="tab">退 款</h2>
			<h2 id="tab4" name="tab">退 款 查 询</h2>
			<h2 id="tab5" name="tab">交 易 关 闭</h2>
		</div>
		<form name=alipayment action=alipay.trade.page.pay.jsp method=post
			target="_blank">
			<div id="body1" class="show" name="divcontent">
				<dl class="content">
					<dt>商户订单号 ：</dt>
					<dd>
						<input id="WIDout_trade_no" name="WIDout_trade_no" />
					</dd>
					<hr class="one_line">
					<dt>订单名称 ：</dt>
					<dd>
						<input id="WIDsubject" name="WIDsubject" />
					</dd>
					<hr class="one_line">
					<dt>付款金额 ：</dt>
					<dd>
						<input id="WIDtotal_amount" name="WIDtotal_amount" value="${amounts}" />
					</dd>
					<hr class="one_line">
					<dt>商品描述：</dt>
					<dd>
						<input id="WIDbody" name="WIDbody" />
					</dd>
					<hr class="one_line">
					<dt></dt>
					<dd id="btn-dd">
						<span class="new-btn-login-sp">
							<button class="new-btn-login" type="submit"
								style="text-align: center;">付 款</button>
						</span> <span class="note-help">如果您点击“付款”按钮，即表示您同意该次的执行操作。</span>
					</dd>
				</dl>
			</div>
		</form>
		<form name=tradequery action=alipay.trade.query.jsp method=post
			target="_blank">
			<div id="body2" class="tab-content" name="divcontent">
				<dl class="content">
					<dt>商户订单号 ：</dt>
					<dd>
						<input id="WIDTQout_trade_no" name="WIDTQout_trade_no" />
					</dd>
					<hr class="one_line">
					<dt>支付宝交易号 ：</dt>
					<dd>
						<input id="WIDTQtrade_no" name="WIDTQtrade_no" />
					</dd>
					<hr class="one_line">
					<dt></dt>
					<dd id="btn-dd">
						<span class="new-btn-login-sp">
							<button class="new-btn-login" type="submit"
								style="text-align: center;">交 易 查 询</button>
						</span> <span class="note-help">商户订单号与支付宝交易号二选一，如果您点击“交易查询”按钮，即表示您同意该次的执行操作。</span>
					</dd>
				</dl>
			</div>
		</form>
		<form name=traderefund action=alipay.trade.refund.jsp method=post
			target="_blank">
			<div id="body3" class="tab-content" name="divcontent">
				<dl class="content">
					<dt>商户订单号 ：</dt>
					<dd>
						<input id="WIDTRout_trade_no" name="WIDTRout_trade_no" />
					</dd>
					<hr class="one_line">
					<dt>支付宝交易号 ：</dt>
					<dd>
						<input id="WIDTRtrade_no" name="WIDTRtrade_no" />
					</dd>
					<hr class="one_line">
					<dt>退款金额 ：</dt>
					<dd>
						<input id="WIDTRrefund_amount" name="WIDTRrefund_amount" />
					</dd>
					<hr class="one_line">
					<dt>退款原因 ：</dt>
					<dd>
						<input id="WIDTRrefund_reason" name="WIDTRrefund_reason" />
					</dd>
					<hr class="one_line">
					<dt>退款请求号 ：</dt>
					<dd>
						<input id="WIDTRout_request_no" name="WIDTRout_request_no" />
					</dd>
					<hr class="one_line">
					<dt></dt>
					<dd id="btn-dd">
						<span class="new-btn-login-sp">
							<button class="new-btn-login" type="submit"
								style="text-align: center;">退 款</button>
						</span> <span class="note-help">商户订单号与支付宝交易号二选一，如果您点击“退款”按钮，即表示您同意该次的执行操作。</span>
					</dd>
				</dl>
			</div>
		</form>
		<form name=traderefundquery
			action=alipay.trade.fastpay.refund.query.jsp method=post
			target="_blank">
			<div id="body4" class="tab-content" name="divcontent">
				<dl class="content">
					<dt>商户订单号 ：</dt>
					<dd>
						<input id="WIDRQout_trade_no" name="WIDRQout_trade_no" />
					</dd>
					<hr class="one_line">
					<dt>支付宝交易号 ：</dt>
					<dd>
						<input id="WIDRQtrade_no" name="WIDRQtrade_no" />
					</dd>
					<hr class="one_line">
					<dt>退款请求号 ：</dt>
					<dd>
						<input id="WIDRQout_request_no" name="WIDRQout_request_no" />
					</dd>
					<hr class="one_line">
					<dt></dt>
					<dd id="btn-dd">
						<span class="new-btn-login-sp">
							<button class="new-btn-login" type="submit"
								style="text-align: center;">退 款 查 询</button>
						</span> <span class="note-help">商户订单号与支付宝交易号二选一，如果您点击“退款查询”按钮，即表示您同意该次的执行操作。</span>
					</dd>
				</dl>
			</div>
		</form>
		<form name=tradeclose action=alipay.trade.close.jsp method=post
			target="_blank">
			<div id="body5" class="tab-content" name="divcontent">
				<dl class="content">
					<dt>商户订单号 ：</dt>
					<dd>
						<input id="WIDTCout_trade_no" name="WIDTCout_trade_no" />
					</dd>
					<hr class="one_line">
					<dt>支付宝交易号 ：</dt>
					<dd>
						<input id="WIDTCtrade_no" name="WIDTCtrade_no" />
					</dd>
					<hr class="one_line">
					<dt></dt>
					<dd id="btn-dd">
						<span class="new-btn-login-sp">
							<button class="new-btn-login" type="submit"
								style="text-align: center;">交 易 关 闭</button>
						</span> <span class="note-help">商户订单号与支付宝交易号二选一，如果您点击“交易关闭”按钮，即表示您同意该次的执行操作。</span>
					</dd>
				</dl>
			</div>
		</form>
		<div id="foot">
			<ul class="foot-ul">
				<li>支付宝版权所有 2015-2018 ALIPAY.COM</li>
			</ul>
		</div>
	</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/scripts/alipay.js" />

</html>