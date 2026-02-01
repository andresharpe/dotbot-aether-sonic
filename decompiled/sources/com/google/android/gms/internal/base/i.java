package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.P;

/* loaded from: classes.dex */
public final class i extends Drawable implements Drawable.Callback {

    /* renamed from: E, reason: collision with root package name */
    private int f29106E;

    /* renamed from: F, reason: collision with root package name */
    private long f29107F;

    /* renamed from: G, reason: collision with root package name */
    private int f29108G;

    /* renamed from: H, reason: collision with root package name */
    private int f29109H;

    /* renamed from: I, reason: collision with root package name */
    private int f29110I;

    /* renamed from: J, reason: collision with root package name */
    private int f29111J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f29112K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f29113L;

    /* renamed from: M, reason: collision with root package name */
    private h f29114M;

    /* renamed from: N, reason: collision with root package name */
    private Drawable f29115N;

    /* renamed from: O, reason: collision with root package name */
    private Drawable f29116O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f29117P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f29118Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f29119R;

    /* renamed from: S, reason: collision with root package name */
    private int f29120S;

    public i(@P Drawable drawable, @P Drawable drawable2) {
        this(null);
        drawable = drawable == null ? g.f29102a : drawable;
        this.f29115N = drawable;
        drawable.setCallback(this);
        h hVar = this.f29114M;
        hVar.f29105b = drawable.getChangingConfigurations() | hVar.f29105b;
        drawable2 = drawable2 == null ? g.f29102a : drawable2;
        this.f29116O = drawable2;
        drawable2.setCallback(this);
        h hVar2 = this.f29114M;
        hVar2.f29105b = drawable2.getChangingConfigurations() | hVar2.f29105b;
    }

    public final Drawable a() {
        return this.f29116O;
    }

    public final void b(int i4) {
        this.f29108G = this.f29109H;
        this.f29111J = 0;
        this.f29110I = 250;
        this.f29106E = 1;
        invalidateSelf();
    }

    public final boolean c() {
        if (!this.f29117P) {
            boolean z3 = false;
            if (this.f29115N.getConstantState() != null && this.f29116O.getConstantState() != null) {
                z3 = true;
            }
            this.f29118Q = z3;
            this.f29117P = true;
        }
        return this.f29118Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 == 0) goto L22;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            int r0 = r6.f29106E
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L38
            if (r0 == r1) goto La
            goto L41
        La:
            long r0 = r6.f29107F
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L41
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.f29107F
            long r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r6.f29110I
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L25
            goto L26
        L25:
            r3 = r2
        L26:
            if (r3 == 0) goto L2a
            r6.f29106E = r2
        L2a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r6.f29108G
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r6.f29111J = r0
            goto L41
        L38:
            long r3 = android.os.SystemClock.uptimeMillis()
            r6.f29107F = r3
            r6.f29106E = r1
            r3 = r2
        L41:
            int r0 = r6.f29111J
            boolean r1 = r6.f29112K
            android.graphics.drawable.Drawable r4 = r6.f29115N
            android.graphics.drawable.Drawable r5 = r6.f29116O
            if (r3 == 0) goto L60
            if (r1 == 0) goto L50
            if (r0 != 0) goto L55
            goto L51
        L50:
            r2 = r0
        L51:
            r4.draw(r7)
            r0 = r2
        L55:
            int r1 = r6.f29109H
            if (r0 != r1) goto L5f
            r5.setAlpha(r1)
            r5.draw(r7)
        L5f:
            return
        L60:
            if (r1 == 0) goto L68
            int r2 = r6.f29109H
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L68:
            r4.draw(r7)
            if (r1 == 0) goto L72
            int r1 = r6.f29109H
            r4.setAlpha(r1)
        L72:
            if (r0 <= 0) goto L7f
            r5.setAlpha(r0)
            r5.draw(r7)
            int r7 = r6.f29109H
            r5.setAlpha(r7)
        L7f:
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.i.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        h hVar = this.f29114M;
        return changingConfigurations | hVar.f29104a | hVar.f29105b;
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public final Drawable.ConstantState getConstantState() {
        if (c()) {
            this.f29114M.f29104a = getChangingConfigurations();
            return this.f29114M;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f29115N.getIntrinsicHeight(), this.f29116O.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f29115N.getIntrinsicWidth(), this.f29116O.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f29119R) {
            this.f29120S = Drawable.resolveOpacity(this.f29115N.getOpacity(), this.f29116O.getOpacity());
            this.f29119R = true;
        }
        return this.f29120S;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f29113L && super.mutate() == this) {
            if (c()) {
                this.f29115N.mutate();
                this.f29116O.mutate();
                this.f29113L = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f29115N.setBounds(rect);
        this.f29116O.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f29111J == this.f29109H) {
            this.f29111J = i4;
        }
        this.f29109H = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@P ColorFilter colorFilter) {
        this.f29115N.setColorFilter(colorFilter);
        this.f29116O.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(@P h hVar) {
        this.f29106E = 0;
        this.f29109H = 255;
        this.f29111J = 0;
        this.f29112K = true;
        this.f29114M = new h(hVar);
    }
}
