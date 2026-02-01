package com.amazonaws.util;

import com.amazonaws.http.HttpMethodName;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24337a = "UTF-8";

    /* renamed from: b, reason: collision with root package name */
    private static final int f24338b = 80;

    /* renamed from: c, reason: collision with root package name */
    private static final int f24339c = 443;

    /* renamed from: d, reason: collision with root package name */
    private static final int f24340d = 200;

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f24341e = Pattern.compile(Pattern.quote("+") + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F"));

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f24342f;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Pattern.quote("%2A"));
        sb.append("|");
        sb.append(Pattern.quote("%2B"));
        sb.append("|");
        f24342f = Pattern.compile(sb.toString());
    }

    public static String a(String str, String str2) {
        return b(str, str2, false);
    }

    public static String b(String str, String str2, boolean z3) {
        if (str2 != null && str2.length() > 0) {
            if (str2.startsWith("/")) {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
            } else if (!str.endsWith("/")) {
                str = str + "/";
            }
            String j4 = j(str2, true);
            if (z3) {
                j4 = j4.replace("//", "/%2F");
            }
            return str + j4;
        }
        if (!str.endsWith("/")) {
            return str + "/";
        }
        return str;
    }

    public static String c(com.amazonaws.f<?> fVar) {
        String encode;
        if (fVar.e().isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            boolean z3 = true;
            for (Map.Entry<String, String> entry : fVar.e().entrySet()) {
                String encode2 = URLEncoder.encode(entry.getKey(), "UTF-8");
                String value = entry.getValue();
                if (value == null) {
                    encode = "";
                } else {
                    encode = URLEncoder.encode(value, "UTF-8");
                }
                if (!z3) {
                    sb.append("&");
                } else {
                    z3 = false;
                }
                sb.append(encode2);
                sb.append("=");
                sb.append(encode);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static InputStream d(URI uri, com.amazonaws.d dVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) uri.toURL().openConnection();
        httpURLConnection.setConnectTimeout(e(dVar));
        httpURLConnection.setReadTimeout(f(dVar));
        httpURLConnection.addRequestProperty(com.amazonaws.http.h.f23650i, g(dVar));
        if (httpURLConnection.getResponseCode() != 200) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                errorStream.close();
            }
            httpURLConnection.disconnect();
            throw new IOException("Error fetching file from " + uri + ": " + httpURLConnection.getResponseMessage());
        }
        return httpURLConnection.getInputStream();
    }

    static int e(com.amazonaws.d dVar) {
        if (dVar != null) {
            return dVar.a();
        }
        return 15000;
    }

    static int f(com.amazonaws.d dVar) {
        if (dVar != null) {
            return dVar.o();
        }
        return 15000;
    }

    static String g(com.amazonaws.d dVar) {
        String str;
        if (dVar != null) {
            str = dVar.q();
        } else {
            str = null;
        }
        if (str == null) {
            return com.amazonaws.d.f23543z;
        }
        String str2 = com.amazonaws.d.f23543z;
        if (!str2.equals(str)) {
            return str + ", " + str2;
        }
        return str;
    }

    public static boolean h(URI uri) {
        String n4 = w.n(uri.getScheme());
        int port = uri.getPort();
        if (port <= 0) {
            return false;
        }
        if ("http".equals(n4) && port == f24338b) {
            return false;
        }
        if ("https".equals(n4) && port == f24339c) {
            return false;
        }
        return true;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String j(String str, boolean z3) {
        if (str == null) {
            return "";
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Matcher matcher = f24341e.matcher(encode);
            StringBuffer stringBuffer = new StringBuffer(encode.length());
            while (matcher.find()) {
                String group = matcher.group(0);
                if ("+".equals(group)) {
                    group = "%20";
                } else if ("*".equals(group)) {
                    group = "%2A";
                } else if ("%7E".equals(group)) {
                    group = "~";
                } else if (z3 && "%2F".equals(group)) {
                    group = "/";
                }
                matcher.appendReplacement(stringBuffer, group);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static boolean k(com.amazonaws.f<?> fVar) {
        boolean z3;
        boolean equals = HttpMethodName.POST.equals(fVar.l());
        if (fVar.getContent() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!equals || !z3) {
            return false;
        }
        return true;
    }
}
