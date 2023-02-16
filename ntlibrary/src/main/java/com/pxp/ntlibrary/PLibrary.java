package com.pxp.ntlibrary;


public class PLibrary {

	public static String getPString(){
		return DesUtil.encrypt("abc中国",CommonClass.key);
	}

	public static int getPInt(){
		return 8;
	}
}
