<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta content="yes" name="apple-mobile-web-app-capable" />
	<meta content="index,follow" name="robots" />
	<meta content="text/html; charset=iso-8859-1" http-equiv="Content-Type" />
	<link href="http://iwebkit.net/apple-touch-icon.png" rel="apple-touch-icon" />
	<meta content="minimum-scale=1.0, width=device-width, maximum-scale=0.6667, user-scalable=no" name="viewport" />
	<link href="/CTIS/Framework/css/style.css" rel="stylesheet" type="text/css" />
	<script src="/CTIS/Framework/javascript/functions.js" type="text/javascript"></script>
 
		
<title>Traffic ListView Report</title>
<meta content="iPod,iPhone,Webkit,iWebkit,Website,Create,mobile,Tutorial,free" name="keywords" />
<meta content="Community-generated Traffic Information System" name="description" /></head>

<body class="list" onload="iWebkit();">

	<div id="topbar">
		<div id="title">
			ข้อมูลจากทวิตเตอร์</div>
		<div id="leftnav">
			<a href="/CTIS/iwebkit/view">Back</a>
		</div>
	</div>
<div id="content">
 <ul class="autolist">
	<li class="title">Traffic  Report</li>
	 <g:each in="${reportInstanceList.text}" status="i" var="reportInstance">
			<li class="autolist " >
					<a class="noeffect" href="#">
					
					<span class="name">${reportInstance.replaceAll("RT ","")}</span>
	
				</a>
			</li>
		  </g:each>
		<li class=" autolisttext  "><a href="#" class="noeffect">Show 10 more items...</a></li>
	</ul>
</div>
 
</body>
</html>