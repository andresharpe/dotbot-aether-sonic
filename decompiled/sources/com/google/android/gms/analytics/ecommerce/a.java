package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.N;
import com.google.android.gms.analytics.m;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import com.spotify.sdk.android.auth.b;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    Map f27770a = new HashMap();

    @N
    public a a(@N String str) {
        m("br", str);
        return this;
    }

    @N
    public a b(@N String str) {
        m("ca", str);
        return this;
    }

    @N
    public a c(@N String str) {
        m("cc", str);
        return this;
    }

    @N
    public a d(int i4, @N String str) {
        m(m.c(i4), str);
        return this;
    }

    @N
    public a e(int i4, int i5) {
        m(m.f(i4), Integer.toString(i5));
        return this;
    }

    @N
    public a f(@N String str) {
        m(b.c.f48986a, str);
        return this;
    }

    @N
    public a g(@N String str) {
        m("nm", str);
        return this;
    }

    @N
    public a h(int i4) {
        m("ps", Integer.toString(i4));
        return this;
    }

    @N
    public a i(double d4) {
        m("pr", Double.toString(d4));
        return this;
    }

    @N
    public a j(int i4) {
        m("qt", Integer.toString(i4));
        return this;
    }

    @N
    public a k(@N String str) {
        m("va", str);
        return this;
    }

    @N
    public final Map l(@N String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f27770a.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }

    final void m(String str, String str2) {
        C1285y.m(str, "Name should be non-null");
        this.f27770a.put(str, str2);
    }

    @N
    public String toString() {
        return s.zzb(this.f27770a);
    }
}
