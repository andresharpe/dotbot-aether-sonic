package com.airbnb.lottie;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f23305a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final LottieAnimationView f23306b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final j f23307c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23308d;

    @i0
    v() {
        this.f23305a = new HashMap();
        this.f23308d = true;
        this.f23306b = null;
        this.f23307c = null;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f23306b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        j jVar = this.f23307c;
        if (jVar != null) {
            jVar.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String c(String str, String str2) {
        if (this.f23308d && this.f23305a.containsKey(str2)) {
            return this.f23305a.get(str2);
        }
        String b4 = b(str, str2);
        if (this.f23308d) {
            this.f23305a.put(str2, b4);
        }
        return b4;
    }

    public void e() {
        this.f23305a.clear();
        d();
    }

    public void f(String str) {
        this.f23305a.remove(str);
        d();
    }

    public void g(boolean z3) {
        this.f23308d = z3;
    }

    public void h(String str, String str2) {
        this.f23305a.put(str, str2);
        d();
    }

    public v(LottieAnimationView lottieAnimationView) {
        this.f23305a = new HashMap();
        this.f23308d = true;
        this.f23306b = lottieAnimationView;
        this.f23307c = null;
    }

    public v(j jVar) {
        this.f23305a = new HashMap();
        this.f23308d = true;
        this.f23307c = jVar;
        this.f23306b = null;
    }
}
