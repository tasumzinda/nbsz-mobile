/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.util;

import java.security.MessageDigest;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class EdelpyhnbbUtilities {

    public static String EMPTY_EXCEPTION = "EMPTY_EXCEPTION";
    static final long ONE_HOUR = 3600000L;
    private static final String SEPARATOR = "separator=";
    private static final String HEADER = "header=";

    public static String encryptSHA1(String paramString) {
        try {
            MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
            byte[] arrayOfByte = localMessageDigest.digest(paramString.getBytes());
            StringBuffer localStringBuffer = new StringBuffer();

            for (int i = 0; i < arrayOfByte.length; i++) {
                int j = arrayOfByte[i];
                String str = Integer.toHexString(0xFF & j);
                str = "0" + str;
                localStringBuffer.append(str);
            }
            return localStringBuffer.toString().toUpperCase();
        } catch (Exception localException) {
            localException.printStackTrace();
        }
        return "";
    }
}
