package com.google.firebase.crashlytics.internal.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f34993a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f34994b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34995c;

    public A(int i4, int i5) {
        this.f34994b = i4;
        this.f34995c = i5;
    }

    private String c(String str) {
        if (str != null) {
            return b(str);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    @androidx.annotation.N
    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f34993a));
    }

    public String b(String str) {
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            int i4 = this.f34995c;
            if (length > i4) {
                return trim.substring(0, i4);
            }
            return trim;
        }
        return str;
    }

    public synchronized void d(String str, String str2) {
        String b4;
        try {
            String c4 = c(str);
            if (this.f34993a.size() >= this.f34994b && !this.f34993a.containsKey(c4)) {
                com.google.firebase.crashlytics.internal.f.f().m("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f34994b);
            }
            Map<String, String> map = this.f34993a;
            if (str2 == null) {
                b4 = "";
            } else {
                b4 = b(str2);
            }
            map.put(c4, b4);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(Map<String, String> map) {
        String b4;
        try {
            int i4 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String c4 = c(entry.getKey());
                if (this.f34993a.size() >= this.f34994b && !this.f34993a.containsKey(c4)) {
                    i4++;
                }
                String value = entry.getValue();
                Map<String, String> map2 = this.f34993a;
                if (value == null) {
                    b4 = "";
                } else {
                    b4 = b(value);
                }
                map2.put(c4, b4);
            }
            if (i4 > 0) {
                com.google.firebase.crashlytics.internal.f.f().m("Ignored " + i4 + " entries when adding custom keys. Maximum allowable: " + this.f34994b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
