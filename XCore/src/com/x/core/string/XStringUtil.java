package com.x.core.string;

public class XStringUtil {

	public static boolean isNullOrTrimEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}

}
