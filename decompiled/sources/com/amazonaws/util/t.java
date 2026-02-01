package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Protocol;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24361a = ", ";

    /* renamed from: b, reason: collision with root package name */
    private static final String f24362b = " ";

    public static URL a(com.amazonaws.f<?> fVar, boolean z3, boolean z4) {
        String p4;
        String str;
        if (z4) {
            p4 = n.j(fVar.p(), true);
        } else {
            p4 = fVar.p();
        }
        if (z3 && p4.startsWith("/")) {
            p4 = p4.substring(1);
        }
        String replaceAll = ("/" + p4).replaceAll("(?<=/)/", "%2F");
        StringBuilder sb = new StringBuilder(fVar.s().toString());
        sb.append(replaceAll);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : fVar.e().entrySet()) {
            if (sb2.length() > 0) {
                str = "&";
            } else {
                str = "?";
            }
            sb2.append(str);
            sb2.append(n.j(entry.getKey(), false));
            sb2.append("=");
            sb2.append(n.j(entry.getValue(), false));
        }
        sb.append(sb2.toString());
        try {
            return new URL(sb.toString());
        } catch (MalformedURLException e4) {
            throw new AmazonClientException("Unable to convert request to well formed URL: " + e4.getMessage(), e4);
        }
    }

    public static URI b(String str, com.amazonaws.d dVar) {
        if (dVar != null) {
            return c(str, dVar.e());
        }
        throw new IllegalArgumentException("ClientConfiguration cannot be null");
    }

    public static URI c(String str, Protocol protocol) {
        if (str != null) {
            if (!str.contains("://")) {
                str = protocol.toString() + "://" + str;
            }
            try {
                return new URI(str);
            } catch (URISyntaxException e4) {
                throw new IllegalArgumentException(e4);
            }
        }
        throw new IllegalArgumentException("endpoint cannot be null");
    }
}
