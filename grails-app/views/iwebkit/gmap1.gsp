<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w2.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>Google Maps API Example - Google North America Offices</title>
    <script src="http://maps.google.com/maps?file=api&v=2&key=ABQIAAAAnGpifcTyPEhEhb5IwFOjbhQYQr-BOzv_76a80Oz0dZB9ymGy6BScRuR5dKCaAfBSCMIv6oE0IJp_Jg"
            type="text/javascript"></script>
    <script src="google_northamerica_offices.js" type="text/javascript"></script>
    <script src="../src/markermanager.js"></script>
    <script type="text/javascript">
    //<![CDATA[
    var map;
    var mgr;
    var icons = {};
    var allmarkers = [];

    function load() {
      if (GBrowserIsCompatible()) {
        map = new GMap2(document.getElementById("map"));
        map.addControl(new GLargeMapControl());
        map.addControl(new GOverviewMapControl());
        map.setCenter(new GLatLng(50, -98), 3);
        map.enableDoubleClickZoom();
        mgr = new MarkerManager(map, {trackMarkers:true});
        window.setTimeout(setupOfficeMarkers, 0);
      }
    }

    function getIcon(images) {
      var icon = null;
      if (images) {
        if (icons[images[0]]) {
          icon = icons[images[0]];
        } else {
          icon = new GIcon();
          icon.image = "images/" 
              + images[0] + ".png";
          var size = iconData[images[0]];
          icon.iconSize = new GSize(size.width, size.height);
          icon.iconAnchor = new GPoint(size.width >> 1, size.height >> 1);
          icon.shadow = "images/" 
              + images[1] + ".png";
          size = iconData[images[1]];
          icon.shadowSize = new GSize(size.width, size.height);
          icons[images[0]] = icon;
        }
      }
      return icon;
    }

    function setupOfficeMarkers() {
      allmarkers.length = 0;
      for (var i in officeLayer) {
        var layer = officeLayer[i];
        var markers = [];
        for (var j in layer["places"]) {
          var place = layer["places"][j];
          var icon = getIcon(place["icon"]);
          var title = place["name"];
          var posn = new GLatLng(place["posn"][0], place["posn"][1]);
          var marker = createMarker(posn,title,icon); 
          markers.push(marker);
          allmarkers.push(marker);
        }
        mgr.addMarkers(markers, layer["zoom"][0], layer["zoom"][1]);
      }
      mgr.refresh();
    }
  
    function createMarker(posn, title, icon) {
      var marker = new GMarker(posn, {title: title, icon: icon, draggable:true });
      GEvent.addListener(marker, 'dblclick', function() { mgr.removeMarker(marker) } ); 
      return marker;
    }

    function deleteMarker() {
      var markerNum = parseInt(document.getElementById("markerNum").value);
      mgr.removeMarker(allmarkers[markerNum]);
    }
   
    function clearMarkers() {
      mgr.clearMarkers();
    }
   
    function reloadMarkers() {
      setupOfficeMarkers();
    }
    //]]>
    </script>

  </head>
  <body onload="load()" onunload="GUnload()">
    <input type="button" onclick="deleteMarker()" value="delete marker #:" />
    &nbsp;
    <input type="text" id="markerNum" value="0" size="3"/>
    |
    <input type="button" onclick="clearMarkers()" value="clear all markers" />
    |
    <input type="button" onclick="reloadMarkers()" value="reload all markers" />

    <br/>
    <div id="map" style="width: 600px; height: 400px;"></div>
  </body>
</html>
