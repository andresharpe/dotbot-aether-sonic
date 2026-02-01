package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.N;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    @N
    public static final String f27771b = "detail";

    /* renamed from: c, reason: collision with root package name */
    @N
    public static final String f27772c = "click";

    /* renamed from: d, reason: collision with root package name */
    @N
    public static final String f27773d = "add";

    /* renamed from: e, reason: collision with root package name */
    @N
    public static final String f27774e = "remove";

    /* renamed from: f, reason: collision with root package name */
    @N
    public static final String f27775f = "checkout";

    /* renamed from: g, reason: collision with root package name */
    @N
    public static final String f27776g = "checkout_option";

    /* renamed from: h, reason: collision with root package name */
    @N
    @Deprecated
    public static final String f27777h = "checkout_options";

    /* renamed from: i, reason: collision with root package name */
    @N
    public static final String f27778i = "purchase";

    /* renamed from: j, reason: collision with root package name */
    @N
    public static final String f27779j = "refund";

    /* renamed from: a, reason: collision with root package name */
    Map f27780a = new HashMap();

    public b(@N String str) {
        l("&pa", str);
    }

    @N
    public b a(@N String str) {
        l("&col", str);
        return this;
    }

    @N
    public b b(int i4) {
        l("&cos", Integer.toString(i4));
        return this;
    }

    @N
    public b c(@N String str) {
        l("&pal", str);
        return this;
    }

    @N
    public b d(@N String str) {
        l("&pls", str);
        return this;
    }

    @N
    public b e(@N String str) {
        l("&ta", str);
        return this;
    }

    @N
    public b f(@N String str) {
        l("&tcc", str);
        return this;
    }

    @N
    public b g(@N String str) {
        l("&ti", str);
        return this;
    }

    @N
    public b h(double d4) {
        l("&tr", Double.toString(d4));
        return this;
    }

    @N
    public b i(double d4) {
        l("&ts", Double.toString(d4));
        return this;
    }

    @N
    public b j(double d4) {
        l("&tt", Double.toString(d4));
        return this;
    }

    @N
    @D
    public final Map k() {
        return new HashMap(this.f27780a);
    }

    final void l(String str, String str2) {
        C1285y.m(str, "Name should be non-null");
        this.f27780a.put(str, str2);
    }

    @N
    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f27780a.entrySet()) {
            if (((String) entry.getKey()).startsWith("&")) {
                hashMap.put(((String) entry.getKey()).substring(1), (String) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return s.zzb(hashMap);
    }
}
