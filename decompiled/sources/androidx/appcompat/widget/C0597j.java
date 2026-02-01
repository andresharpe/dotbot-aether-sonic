package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0597j {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final CheckedTextView f6215a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f6216b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f6217c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6218d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6219e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6220f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0597j(@androidx.annotation.N CheckedTextView checkedTextView) {
        this.f6215a = checkedTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Drawable a4 = androidx.core.widget.c.a(this.f6215a);
        if (a4 != null) {
            if (this.f6218d || this.f6219e) {
                Drawable mutate = androidx.core.graphics.drawable.d.r(a4).mutate();
                if (this.f6218d) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f6216b);
                }
                if (this.f6219e) {
                    androidx.core.graphics.drawable.d.p(mutate, this.f6217c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f6215a.getDrawableState());
                }
                this.f6215a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f6216b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f6217c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(@androidx.annotation.P android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.f6215a
            android.content.Context r0 = r0.getContext()
            int[] r1 = d.C2042a.m.f50164s3
            r2 = 0
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.g0.G(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.f6215a
            android.content.Context r4 = r3.getContext()
            int[] r5 = d.C2042a.m.f50164s3
            android.content.res.TypedArray r7 = r0.B()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.C0823k0.z1(r3, r4, r5, r6, r7, r8, r9)
            int r11 = d.C2042a.m.u3     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            int r11 = d.C2042a.m.u3     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.u(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            android.widget.CheckedTextView r12 = r10.f6215a     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r11 = e.C2046a.b(r1, r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            goto L5c
        L3d:
            r11 = move-exception
            goto L8c
        L3f:
            int r11 = d.C2042a.m.t3     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            int r11 = d.C2042a.m.t3     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.u(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            android.widget.CheckedTextView r12 = r10.f6215a     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r11 = e.C2046a.b(r1, r11)     // Catch: java.lang.Throwable -> L3d
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L3d
        L5c:
            int r11 = d.C2042a.m.v3     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L6f
            android.widget.CheckedTextView r11 = r10.f6215a     // Catch: java.lang.Throwable -> L3d
            int r12 = d.C2042a.m.v3     // Catch: java.lang.Throwable -> L3d
            android.content.res.ColorStateList r12 = r0.d(r12)     // Catch: java.lang.Throwable -> L3d
            androidx.core.widget.c.d(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L6f:
            int r11 = d.C2042a.m.w3     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L88
            android.widget.CheckedTextView r11 = r10.f6215a     // Catch: java.lang.Throwable -> L3d
            int r12 = d.C2042a.m.w3     // Catch: java.lang.Throwable -> L3d
            r1 = -1
            int r12 = r0.o(r12, r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.L.e(r12, r1)     // Catch: java.lang.Throwable -> L3d
            androidx.core.widget.c.e(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L88:
            r0.I()
            return
        L8c:
            r0.I()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0597j.d(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.f6220f) {
            this.f6220f = false;
        } else {
            this.f6220f = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f6216b = colorStateList;
        this.f6218d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f6217c = mode;
        this.f6219e = true;
        a();
    }
}
