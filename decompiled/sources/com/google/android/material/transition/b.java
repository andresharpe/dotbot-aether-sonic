package com.google.android.material.transition;

/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.a f34027a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.a f34028b = new C0305b();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.a f34029c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.a f34030d = new d();

    /* loaded from: classes2.dex */
    class a implements com.google.android.material.transition.a {
        a() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.c.a(255, u.n(0, 255, f5, f6, f4));
        }
    }

    /* renamed from: com.google.android.material.transition.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0305b implements com.google.android.material.transition.a {
        C0305b() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.c.b(u.n(255, 0, f5, f6, f4), 255);
        }
    }

    /* loaded from: classes2.dex */
    class c implements com.google.android.material.transition.a {
        c() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.c.b(u.n(255, 0, f5, f6, f4), u.n(0, 255, f5, f6, f4));
        }
    }

    /* loaded from: classes2.dex */
    class d implements com.google.android.material.transition.a {
        d() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f4, float f5, float f6, float f7) {
            float f8 = ((f6 - f5) * f7) + f5;
            return com.google.android.material.transition.c.b(u.n(255, 0, f5, f8, f4), u.n(0, 255, f8, f6, f4));
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.material.transition.a a(int i4, boolean z3) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return f34030d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i4);
                }
                return f34029c;
            }
            if (z3) {
                return f34028b;
            }
            return f34027a;
        }
        if (z3) {
            return f34027a;
        }
        return f34028b;
    }
}
