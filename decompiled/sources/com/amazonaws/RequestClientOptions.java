package com.amazonaws;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class RequestClientOptions {

    /* renamed from: b, reason: collision with root package name */
    private static final int f23353b = 17;

    /* renamed from: c, reason: collision with root package name */
    public static final int f23354c = 131073;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Marker, String> f23355a = new EnumMap(Marker.class);

    /* loaded from: classes.dex */
    public enum Marker {
        USER_AGENT
    }

    private String c(String str, String str2) {
        if (!str.contains(str2)) {
            return str + " " + str2;
        }
        return str;
    }

    @Deprecated
    public void a(String str) {
        b(str);
    }

    public void b(String str) {
        Map<Marker, String> map = this.f23355a;
        Marker marker = Marker.USER_AGENT;
        String str2 = map.get(marker);
        if (str2 == null) {
            str2 = "";
        }
        f(marker, c(str2, str));
    }

    @Deprecated
    public String d() {
        return e(Marker.USER_AGENT);
    }

    public String e(Marker marker) {
        return this.f23355a.get(marker);
    }

    public void f(Marker marker, String str) {
        this.f23355a.put(marker, str);
    }
}
