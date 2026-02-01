package com.google.android.material.transition.platform;

import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f34182a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f34183b = new C0306b();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f34184c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f34185d = new d();

    /* loaded from: classes2.dex */
    class a implements com.google.android.material.transition.platform.a {
        a() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.platform.c.a(255, v.n(0, 255, f5, f6, f4));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0306b implements com.google.android.material.transition.platform.a {
        C0306b() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.platform.c.b(v.n(255, 0, f5, f6, f4), 255);
        }
    }

    /* loaded from: classes2.dex */
    class c implements com.google.android.material.transition.platform.a {
        c() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.platform.c.b(v.n(255, 0, f5, f6, f4), v.n(0, 255, f5, f6, f4));
        }
    }

    /* loaded from: classes2.dex */
    class d implements com.google.android.material.transition.platform.a {
        d() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f4, float f5, float f6, float f7) {
            float f8 = ((f6 - f5) * f7) + f5;
            return com.google.android.material.transition.platform.c.b(v.n(255, 0, f5, f8, f4), v.n(0, 255, f8, f6, f4));
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.material.transition.platform.a a(int i4, boolean z3) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return f34185d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i4);
                }
                return f34184c;
            }
            if (z3) {
                return f34183b;
            }
            return f34182a;
        }
        if (z3) {
            return f34182a;
        }
        return f34183b;
    }
}
