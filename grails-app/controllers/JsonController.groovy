import grails.converters.*
class JsonController {

    def index = {
	def jsonparsed=JSON.parse("{'2118':{'road_name':'\u0e16\u0e19\u0e19\u0e1e\u0e0d\u0e32\u0e44\u0e17','road_start':'\u0e41\u0e22\u0e01\u0e1e\u0e0d\u0e32\u0e44\u0e17','road_end':'\u0e2d\u0e19\u0e38\u0e2a\u0e32\u0e27\u0e23\u0e35\u0e22\u0e4c\u0e0a\u0e31\u0e22\u0e2a\u0e21\u0e23\u0e20\u0e39\u0e21\u0e34','vms':['1','39','24','33','22','21','10'],'distance':'78.8780177464336'},'1017':{'road_name':'\u0e16\u0e19\u0e19\u0e23\u0e32\u0e0a\u0e27\u0e34\u0e16\u0e35','road_start':'\u0e41\u0e22\u0e01\u0e2a\u0e32\u0e21\u0e40\u0e2b\u0e25\u0e35\u0e48\u0e22\u0e21\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','road_end':'\u0e2d\u0e19\u0e38\u0e2a\u0e32\u0e27\u0e23\u0e35\u0e22\u0e4c\u0e0a\u0e31\u0e22\u0e2a\u0e21\u0e23\u0e20\u0e39\u0e21\u0e34','vms':['21','1','39','10','40','24','11'],'distance':'103.731874695818'},'2113':{'road_name':'\u0e16\u0e19\u0e19\u0e23\u0e32\u0e0a\u0e27\u0e34\u0e16\u0e35','road_start':'\u0e2d\u0e19\u0e38\u0e2a\u0e32\u0e27\u0e23\u0e35\u0e22\u0e4c\u0e0a\u0e31\u0e22\u0e2a\u0e21\u0e23\u0e20\u0e39\u0e21\u0e34','road_end':'\u0e41\u0e22\u0e01\u0e2a\u0e32\u0e21\u0e40\u0e2b\u0e25\u0e35\u0e48\u0e22\u0e21\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','vms':['10'],'distance':'117.052579930309'},'107':{'road_name':'\u0e16\u0e19\u0e19\u0e23\u0e32\u0e0a\u0e27\u0e34\u0e16\u0e35','road_start':'\u0e2d\u0e19\u0e38\u0e2a\u0e32\u0e27\u0e23\u0e35\u0e22\u0e4c\u0e0a\u0e31\u0e22\u0e2a\u0e21\u0e23\u0e20\u0e39\u0e21\u0e34','road_end':'\u0e41\u0e22\u0e01\u0e2a\u0e32\u0e21\u0e40\u0e2b\u0e25\u0e35\u0e48\u0e22\u0e21\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','vms':['24','11','1','40','39','21'],'distance':'119.954679485084'},'3922':{'road_name':'\u0e16\u0e19\u0e19\u0e23\u0e32\u0e0a\u0e27\u0e34\u0e16\u0e35','road_start':'\u0e41\u0e22\u0e01\u0e15\u0e36\u0e01\u0e0a\u0e31\u0e22','road_end':'\u0e2d\u0e19\u0e38\u0e2a\u0e32\u0e27\u0e23\u0e35\u0e22\u0e4c\u0e0a\u0e31\u0e22\u0e2a\u0e21\u0e23\u0e20\u0e39\u0e21\u0e34','vms':['24','21','10','1','39','40'],'distance':'122.167598394264'},'109':{'road_name':'\u0e16\u0e19\u0e19\u0e23\u0e32\u0e0a\u0e27\u0e34\u0e16\u0e35','road_start':'\u0e2d\u0e19\u0e38\u0e2a\u0e32\u0e27\u0e23\u0e35\u0e22\u0e4c\u0e0a\u0e31\u0e22\u0e2a\u0e21\u0e23\u0e20\u0e39\u0e21\u0e34','road_end':'\u0e41\u0e22\u0e01\u0e15\u0e36\u0e01\u0e0a\u0e31\u0e22','vms':['39','40','10','1','21','24'],'distance':'130.237743646753'},'1014':{'road_name':'\u0e16\u0e19\u0e19\u0e1e\u0e2b\u0e25\u0e42\u0e22\u0e18\u0e34\u0e19','road_start':'\u0e2d\u0e19\u0e38\u0e2a\u0e32\u0e27\u0e23\u0e35\u0e22\u0e4c\u0e0a\u0e31\u0e22\u0e2a\u0e21\u0e23\u0e20\u0e39\u0e21\u0e34','road_end':'\u0e41\u0e22\u0e01\u0e2a\u0e30\u0e1e\u0e32\u0e19\u0e04\u0e27\u0e32\u0e22','vms':['24','1','39','10','40','21','2'],'distance':'148.995545269616'},'601':{'road_name':'\u0e16\u0e19\u0e19\u0e1e\u0e2b\u0e25\u0e42\u0e22\u0e18\u0e34\u0e19','road_start':'\u0e41\u0e22\u0e01\u0e2a\u0e30\u0e1e\u0e32\u0e19\u0e04\u0e27\u0e32\u0e22','road_end':'\u0e2d\u0e19\u0e38\u0e2a\u0e32\u0e27\u0e23\u0e35\u0e22\u0e4c\u0e0a\u0e31\u0e22\u0e2a\u0e21\u0e23\u0e20\u0e39\u0e21\u0e34','vms':['1','40','39','24','21','6','10','2'],'distance':'171.877868593658'},'1807':{'road_name':'\u0e17\u0e32\u0e07\u0e14\u0e48\u0e27\u0e19\u0e02\u0e31\u0e49\u0e19\u0e17\u0e35\u0e48 2 \u0e28\u0e23\u0e35\u0e23\u0e31\u0e10','road_start':'\u0e14\u0e48\u0e32\u0e19\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','road_end':'\u0e14\u0e48\u0e32\u0e19\u0e1e\u0e2b\u0e25\u0e42\u0e22\u0e18\u0e34\u0e19 1','vms':['18','19'],'distance':'235.984101774645'},'409':{'road_name':'\u0e17\u0e32\u0e07\u0e14\u0e48\u0e27\u0e19\u0e02\u0e31\u0e49\u0e19\u0e17\u0e35\u0e48 1 \u0e40\u0e09\u0e25\u0e34\u0e21\u0e21\u0e2b\u0e32\u0e19\u0e04\u0e23','road_start':'\u0e14\u0e48\u0e32\u0e19\u0e1e\u0e23\u0e30\u0e23\u0e32\u0e21 6','road_end':'\u0e14\u0e48\u0e32\u0e19\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','vms':['4'],'distance':'247.156968473537'},'1808':{'road_name':'\u0e17\u0e32\u0e07\u0e14\u0e48\u0e27\u0e19\u0e02\u0e31\u0e49\u0e19\u0e17\u0e35\u0e48 2 \u0e28\u0e23\u0e35\u0e23\u0e31\u0e10','road_start':'\u0e14\u0e48\u0e32\u0e19\u0e1e\u0e2b\u0e25\u0e42\u0e22\u0e18\u0e34\u0e19 1','road_end':'\u0e14\u0e48\u0e32\u0e19\u0e1e\u0e23\u0e30\u0e23\u0e32\u0e21 6','vms':['18','19','35'],'distance':'257.397621205734'},'108':{'road_name':'\u0e16\u0e19\u0e19\u0e1e\u0e0d\u0e32\u0e44\u0e17','road_start':'\u0e16\u0e19\u0e19\u0e23\u0e32\u0e07\u0e19\u0e49\u0e33','road_end':'\u0e41\u0e22\u0e01\u0e1e\u0e0d\u0e32\u0e44\u0e17','vms':['40','33','39','21','22','24','1','10'],'distance':'379.173258834653'},'2214':{'road_name':'\u0e16\u0e19\u0e19\u0e23\u0e32\u0e0a\u0e1b\u0e23\u0e32\u0e23\u0e20','road_start':'\u0e21\u0e31\u0e01\u0e01\u0e30\u0e2a\u0e31\u0e19(\u0e2b\u0e21\u0e2d\u0e40\u0e2b\u0e25\u0e47\u0e07)','road_end':'\u0e41\u0e22\u0e01\u0e2a\u0e32\u0e21\u0e40\u0e2b\u0e25\u0e35\u0e48\u0e22\u0e21\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','vms':['11','33','39','10','22','24'],'distance':'516.384682710805'},'1019':{'road_name':'\u0e16\u0e19\u0e19\u0e23\u0e32\u0e0a\u0e1b\u0e23\u0e32\u0e23\u0e20','road_start':'\u0e41\u0e22\u0e01\u0e2a\u0e32\u0e21\u0e40\u0e2b\u0e25\u0e35\u0e48\u0e22\u0e21\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','road_end':'\u0e21\u0e31\u0e01\u0e01\u0e30\u0e2a\u0e31\u0e19(\u0e2b\u0e21\u0e2d\u0e40\u0e2b\u0e25\u0e47\u0e07)','vms':['33','11','10','39','24','22','21'],'distance':'520.767110005924'},'1020':{'road_name':'\u0e16\u0e19\u0e19\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','road_start':'\u0e41\u0e22\u0e01\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','road_end':'\u0e41\u0e22\u0e01\u0e2a\u0e32\u0e21\u0e40\u0e2b\u0e25\u0e35\u0e48\u0e22\u0e21\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','vms':['24','21','11','10','39'],'distance':'522.371678035724'},'2114':{'road_name':'\u0e16\u0e19\u0e19\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','road_start':'\u0e41\u0e22\u0e01\u0e2a\u0e32\u0e21\u0e40\u0e2b\u0e25\u0e35\u0e48\u0e22\u0e21\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','road_end':'\u0e41\u0e22\u0e01\u0e14\u0e34\u0e19\u0e41\u0e14\u0e07','vms':['21','39','11','10','24'],'distance':'560.373798261411'},'101':{'road_name':'\u0e16\u0e19\u0e19\u0e28\u0e23\u0e35\u0e2d\u0e22\u0e38\u0e18\u0e22\u0e32','road_start':'\u0e41\u0e22\u0e01\u0e1e\u0e0d\u0e32\u0e44\u0e17','road_end':'\u0e21\u0e31\u0e01\u0e01\u0e30\u0e2a\u0e31\u0e19(\u0e2b\u0e21\u0e2d\u0e40\u0e2b\u0e25\u0e47\u0e07)','vms':['40','24','39','11','33','10','22'],'distance':'792.234950400212'},'1016':{'road_name':'\u0e16\u0e19\u0e19\u0e28\u0e23\u0e35\u0e2d\u0e22\u0e38\u0e18\u0e22\u0e32','road_start':'\u0e21\u0e31\u0e01\u0e01\u0e30\u0e2a\u0e31\u0e19(\u0e2b\u0e21\u0e2d\u0e40\u0e2b\u0e25\u0e47\u0e07)','road_end':'\u0e41\u0e22\u0e01\u0e1e\u0e0d\u0e32\u0e44\u0e17','vms':['11','24','22','1','10','39','33','40'],'distance':'800.839276419754'}}")
/*	render (jsonparsed."2113".distance)*/
	jsonparsed.each { k,v-> println k+"<br>\n" }
	println jsonparsed.keySet()
	[roadData:jsonparsed,roadKey:jsonparsed.keySet()]
	
	
	 }
}