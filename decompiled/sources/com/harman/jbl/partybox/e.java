package com.harman.jbl.partybox;

import androidx.annotation.N;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;

/* loaded from: classes2.dex */
public class e implements m0.b {

    /* renamed from: b, reason: collision with root package name */
    private static e f40385b = new e();

    private e() {
    }

    public static e d() {
        return f40385b;
    }

    @Override // androidx.lifecycle.m0.b
    @N
    public <T extends j0> T a(@N Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e4) {
            com.harman.log.f.b("BaseViewModelFactory", e4.toString());
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}
