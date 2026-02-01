package com.blankj.utilcode.util;

import android.text.Html;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* loaded from: classes.dex */
public final class D {
    private D() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] a(String str) {
        if (str != null && str.length() != 0) {
            return Base64.decode(str, 2);
        }
        return new byte[0];
    }

    public static byte[] b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return Base64.decode(bArr, 2);
        }
        return new byte[0];
    }

    public static byte[] c(String str) {
        return d(str.getBytes());
    }

    public static byte[] d(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return Base64.encode(bArr, 2);
        }
        return new byte[0];
    }

    public static String e(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return Base64.encodeToString(bArr, 2);
        }
        return "";
    }

    public static String f(String str) {
        if (str != null && str.length() != 0) {
            String[] split = str.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                sb.append((char) Integer.parseInt(str2, 2));
            }
            return sb.toString();
        }
        return "";
    }

    public static String g(String str) {
        if (str != null && str.length() != 0) {
            StringBuilder sb = new StringBuilder();
            for (char c4 : str.toCharArray()) {
                sb.append(Integer.toBinaryString(c4));
                sb.append(" ");
            }
            return sb.deleteCharAt(sb.length() - 1).toString();
        }
        return "";
    }

    public static CharSequence h(String str) {
        if (str != null && str.length() != 0) {
            return Html.fromHtml(str, 0);
        }
        return "";
    }

    public static String i(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            StringBuilder sb = new StringBuilder();
            int length = charSequence.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = charSequence.charAt(i4);
                if (charAt != '\"') {
                    if (charAt != '<') {
                        if (charAt != '>') {
                            if (charAt != '&') {
                                if (charAt != '\'') {
                                    sb.append(charAt);
                                } else {
                                    sb.append("&#39;");
                                }
                            } else {
                                sb.append("&amp;");
                            }
                        } else {
                            sb.append("&gt;");
                        }
                    } else {
                        sb.append("&lt;");
                    }
                } else {
                    sb.append("&quot;");
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String j(String str) {
        return k(str, "UTF-8");
    }

    public static String k(String str, String str2) {
        if (str != null && str.length() != 0) {
            try {
                return URLDecoder.decode(str.replaceAll("%(?![0-9a-fA-F]{2})", "%25").replaceAll("\\+", "%2B"), str2);
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }
        return "";
    }

    public static String l(String str) {
        return m(str, "UTF-8");
    }

    public static String m(String str, String str2) {
        if (str != null && str.length() != 0) {
            try {
                return URLEncoder.encode(str, str2);
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }
        return "";
    }
}
