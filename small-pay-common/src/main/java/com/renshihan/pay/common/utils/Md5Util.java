package com.renshihan.pay.common.utils;
import org.apache.commons.codec.digest.DigestUtils;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/**
 * 
 * 
 */
public class Md5Util {

//    加盐
	public final static String MD5(String plain,String password) {
        return DigestUtils.md5Hex(plain+password);
    }

}
