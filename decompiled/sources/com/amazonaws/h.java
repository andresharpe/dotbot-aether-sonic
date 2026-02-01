package com.amazonaws;

import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f23605b = "AWS_REQUEST_ID";

    /* renamed from: a, reason: collision with root package name */
    protected final Map<String, String> f23606a;

    public h(Map<String, String> map) {
        this.f23606a = map;
    }

    public String a() {
        return this.f23606a.get(f23605b);
    }

    public String toString() {
        Map<String, String> map = this.f23606a;
        if (map == null) {
            return "{}";
        }
        return map.toString();
    }

    public h(h hVar) {
        this(hVar.f23606a);
    }
}
