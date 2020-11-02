package com.trackme.webgis.entity;
/**
 * 经纬度坐标点，lng 代表经度X，lat代表纬度 Y
 * @author DELL
 *
 */
public class PointLatLng {

	public double lat;

	public double lng;

	public PointLatLng()
	{

	}

	public PointLatLng(double _lng, double _lat)
	{
		lat = _lat;
		lng = _lng;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

}
