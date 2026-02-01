package com.google.android.material.color;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f31920a = 15.0f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f31921b = 0.5f;

    private a() {
    }

    public static int a(int i4, int i5, float f4) {
        b b4 = b.b(i4);
        b b5 = b.b(i5);
        float n4 = b4.n();
        float h4 = b4.h();
        float i6 = b4.i();
        return b.f(n4 + ((b5.n() - n4) * f4), h4 + ((b5.h() - h4) * f4), i6 + ((b5.i() - i6) * f4)).l();
    }

    public static int b(int i4, int i5, float f4) {
        return r.b(b.b(a(i4, i5, f4)).k(), b.b(i4).j(), k.l(i4)).m();
    }

    public static int c(int i4, int i5) {
        r c4 = r.c(i4);
        r c5 = r.c(i5);
        return r.b(t.d(c4.g() + (Math.min(t.b(c4.g(), c5.g()) * 0.5f, f31920a) * d(c4.g(), c5.g()))), c4.f(), c4.h()).m();
    }

    private static float d(float f4, float f5) {
        float f6 = f5 - f4;
        float f7 = f6 + 360.0f;
        float f8 = f6 - 360.0f;
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f7);
        float abs3 = Math.abs(f8);
        if (abs <= abs2 && abs <= abs3) {
            if (f6 < com.google.firebase.remoteconfig.l.f37524n) {
                return -1.0f;
            }
            return 1.0f;
        }
        if (abs2 <= abs && abs2 <= abs3) {
            if (f7 < com.google.firebase.remoteconfig.l.f37524n) {
                return -1.0f;
            }
            return 1.0f;
        }
        if (f8 < com.google.firebase.remoteconfig.l.f37524n) {
            return -1.0f;
        }
        return 1.0f;
    }
}
