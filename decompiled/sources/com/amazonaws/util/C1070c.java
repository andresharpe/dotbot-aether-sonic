package com.amazonaws.util;

import com.amazonaws.internal.config.c;
import com.amazonaws.logging.LogFactory;
import java.net.InetAddress;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.amazonaws.util.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1070c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f24281a = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    public static String a() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e4) {
            LogFactory.c(C1070c.class).b("Failed to determine the local hostname; fall back to use \"localhost\".", e4);
            return "localhost";
        }
    }

    public static String b(String str, String str2) {
        if (str != null) {
            String d4 = d(str);
            if (d4 != null) {
                return d4;
            }
            if (str.endsWith(".amazonaws.com")) {
                return f(str.substring(0, str.length() - 14));
            }
            if (str.endsWith(".amazonaws.com.cn")) {
                return f(str.substring(0, str.length() - 17));
            }
            if (str2 != null) {
                Matcher matcher = Pattern.compile("^(?:.+\\.)?" + Pattern.quote(str2) + "[.-]([a-z0-9-]+)\\.").matcher(str);
                if (matcher.find()) {
                    return matcher.group(1);
                }
                return "us-east-1";
            }
            return "us-east-1";
        }
        throw new IllegalArgumentException("hostname cannot be null");
    }

    @Deprecated
    public static String c(URI uri) {
        return b(uri.getHost(), null);
    }

    private static String d(String str) {
        for (com.amazonaws.internal.config.a aVar : c.a.a().h()) {
            if (str.matches(aVar.a())) {
                return aVar.b();
            }
        }
        return null;
    }

    @Deprecated
    public static String e(URI uri) {
        String host = uri.getHost();
        if (host.endsWith(".amazonaws.com")) {
            String substring = host.substring(0, host.indexOf(".amazonaws.com"));
            if (!substring.endsWith(".s3") && !f24281a.matcher(substring).matches()) {
                if (substring.indexOf(46) == -1) {
                    return substring;
                }
                return substring.substring(0, substring.indexOf(46));
            }
            return com.amazonaws.regions.f.f23893o;
        }
        throw new IllegalArgumentException("Cannot parse a service name from an unrecognized endpoint (" + host + ").");
    }

    private static String f(String str) {
        Matcher matcher = f24281a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "us-east-1";
        }
        String substring = str.substring(lastIndexOf + 1);
        if ("us-gov".equals(substring)) {
            return "us-gov-west-1";
        }
        return substring;
    }
}
