package com.KK.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {
    public static String getMD5String(String source){
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] bytes=md.digest(source.getBytes());
            StringBuilder sb=new StringBuilder();
            for(byte b :bytes){
                sb.append(String.format("%02X", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
