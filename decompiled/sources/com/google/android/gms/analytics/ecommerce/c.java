package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.N;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import com.spotify.sdk.android.auth.b;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    @N
    public static final String f27781b = "click";

    /* renamed from: c, reason: collision with root package name */
    @N
    public static final String f27782c = "view";

    /* renamed from: a, reason: collision with root package name */
    Map f27783a = new HashMap();

    @N
    public c a(@N String str) {
        f("cr", str);
        return this;
    }

    @N
    public c b(@N String str) {
        f(b.c.f48986a, str);
        return this;
    }

    @N
    public c c(@N String str) {
        f("nm", str);
        return this;
    }

    @N
    public c d(@N String str) {
        f("ps", str);
        return this;
    }

    @N
    public final Map e(@N String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f27783a.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }

    final void f(String str, String str2) {
        C1285y.m(str, "Name should be non-null");
        this.f27783a.put(str, str2);
    }

    @N
    public String toString() {
        return s.zzb(this.f27783a);
    }
}
