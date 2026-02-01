package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0598k {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final CompoundButton f6247a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f6248b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f6249c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6250d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6251e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6252f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0598k(@androidx.annotation.N CompoundButton compoundButton) {
        this.f6247a = compoundButton;
    }

    void a() {
        Drawable a4 = androidx.core.widget.d.a(this.f6247a);
        if (a4 != null) {
            if (this.f6250d || this.f6251e) {
                Drawable mutate = androidx.core.graphics.drawable.d.r(a4).mutate();
                if (this.f6250d) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f6248b);
                }
                if (this.f6251e) {
                    androidx.core.graphics.drawable.d.p(mutate, this.f6249c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f6247a.getDrawableState());
                }
                this.f6247a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i4) {
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f6248b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f6249c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(@androidx.annotation.P android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f6247a
            android.content.Context r0 = r0.getContext()
            int[] r1 = d.C2042a.m.x3
            r2 = 0
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.g0.G(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f6247a
            android.content.Context r4 = r3.getContext()
            int[] r5 = d.C2042a.m.x3
            android.content.res.TypedArray r7 = r0.B()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.C0823k0.z1(r3, r4, r5, r6, r7, r8, r9)
            int r11 = d.C2042a.m.z3     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            int r11 = d.C2042a.m.z3     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.u(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            android.widget.CompoundButton r12 = r10.f6247a     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r11 = e.C2046a.b(r1, r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            goto L5c
        L3d:
            r11 = move-exception
            goto L8c
        L3f:
            int r11 = d.C2042a.m.y3     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            int r11 = d.C2042a.m.y3     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.u(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            android.widget.CompoundButton r12 = r10.f6247a     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r11 = e.C2046a.b(r1, r11)     // Catch: java.lang.Throwable -> L3d
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3d
        L5c:
            int r11 = d.C2042a.m.A3     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L6f
            android.widget.CompoundButton r11 = r10.f6247a     // Catch: java.lang.Throwable -> L3d
            int r12 = d.C2042a.m.A3     // Catch: java.lang.Throwable -> L3d
            android.content.res.ColorStateList r12 = r0.d(r12)     // Catch: java.lang.Throwable -> L3d
            androidx.core.widget.d.d(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L6f:
            int r11 = d.C2042a.m.B3     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L88
            android.widget.CompoundButton r11 = r10.f6247a     // Catch: java.lang.Throwable -> L3d
            int r12 = d.C2042a.m.B3     // Catch: java.lang.Throwable -> L3d
            r1 = -1
            int r12 = r0.o(r12, r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.L.e(r12, r1)     // Catch: java.lang.Throwable -> L3d
            androidx.core.widget.d.e(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L88:
            r0.I()
            return
        L8c:
            r0.I()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0598k.e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f6252f) {
            this.f6252f = false;
        } else {
            this.f6252f = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f6248b = colorStateList;
        this.f6250d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f6249c = mode;
        this.f6251e = true;
        a();
    }
}
