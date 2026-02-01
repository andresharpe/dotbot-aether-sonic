package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.m;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements m {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f23284a = new HashSet();

    @Override // com.airbnb.lottie.m
    public void a(String str, Throwable th) {
        if (com.airbnb.lottie.e.f21417a) {
            Log.d(com.airbnb.lottie.e.f21418b, str, th);
        }
    }

    @Override // com.airbnb.lottie.m
    public void b(String str) {
        e(str, null);
    }

    @Override // com.airbnb.lottie.m
    public void c(String str, Throwable th) {
        Set<String> set = f23284a;
        if (set.contains(str)) {
            return;
        }
        Log.w(com.airbnb.lottie.e.f21418b, str, th);
        set.add(str);
    }

    @Override // com.airbnb.lottie.m
    public void d(String str) {
        c(str, null);
    }

    @Override // com.airbnb.lottie.m
    public void e(String str, Throwable th) {
        if (com.airbnb.lottie.e.f21417a) {
            Log.d(com.airbnb.lottie.e.f21418b, str, th);
        }
    }
}
