package com.google.android.gms.tasks;

@I0.a
/* loaded from: classes2.dex */
public class NativeOnCompleteListener implements InterfaceC1764e<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final long f31165a;

    @I0.a
    public NativeOnCompleteListener(long j4) {
        this.f31165a = j4;
    }

    @I0.a
    public static void b(@androidx.annotation.N AbstractC1770k<Object> abstractC1770k, long j4) {
        abstractC1770k.e(new NativeOnCompleteListener(j4));
    }

    @Override // com.google.android.gms.tasks.InterfaceC1764e
    @I0.a
    public void a(@androidx.annotation.N AbstractC1770k<Object> abstractC1770k) {
        Object obj;
        String str;
        Exception q4;
        if (abstractC1770k.v()) {
            obj = abstractC1770k.r();
            str = null;
        } else if (!abstractC1770k.t() && (q4 = abstractC1770k.q()) != null) {
            str = q4.getMessage();
            obj = null;
        } else {
            obj = null;
            str = null;
        }
        nativeOnComplete(this.f31165a, obj, abstractC1770k.v(), abstractC1770k.t(), str);
    }

    @I0.a
    public native void nativeOnComplete(long j4, @androidx.annotation.P Object obj, boolean z3, boolean z4, @androidx.annotation.P String str);
}
