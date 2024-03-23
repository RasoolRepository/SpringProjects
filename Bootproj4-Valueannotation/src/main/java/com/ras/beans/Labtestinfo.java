package com.ras.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component("linfo")
public class Labtestinfo {
	@Value("${lab.bpprice}")
    private float boodprofileprice;
	@Value("${lab.rtprice}")
    private float rtpcrprice;
	@Value("${lab.eprice}")
    private float ech02price;
	public float getBoodprofileprice() {
		return boodprofileprice;
	}
	public void setBoodprofileprice(float boodprofileprice) {
		this.boodprofileprice = boodprofileprice;
	}
	public float getRtpcrprice() {
		return rtpcrprice;
	}
	public void setRtpcrprice(float rtpcrprice) {
		this.rtpcrprice = rtpcrprice;
	}
	public float getEch02price() {
		return ech02price;
	}
	public void setEch02price(float ech02price) {
		this.ech02price = ech02price;
	}
	@Override
	public String toString() {
		return "Labtestinfo [boodprofileprice=" + boodprofileprice + ", rtpcrprice=" + rtpcrprice + ", ech02price="
				+ ech02price + "]";
	}
	
	
}
