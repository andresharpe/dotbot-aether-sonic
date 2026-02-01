package com.harman.jbl.partybox.ui.customviews;

import android.graphics.PointF;
import android.view.View;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class b implements View.OnTouchListener {

    /* renamed from: E, reason: collision with root package name */
    private final int f42642E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final X2.l<Integer, H0> f42643F;

    /* renamed from: G, reason: collision with root package name */
    private int f42644G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private PointF f42645H;

    /* renamed from: I, reason: collision with root package name */
    private float f42646I;

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i4, @l3.d X2.l<? super Integer, H0> onLevelChange) {
        F.p(onLevelChange, "onLevelChange");
        this.f42642E = i4;
        this.f42643F = onLevelChange;
        this.f42645H = new PointF(0.0f, 0.0f);
    }

    private final float a(View view) {
        return view.getHeight() / (this.f42642E * 2);
    }

    private final void b() {
        this.f42644G = 0;
        this.f42643F.C(0);
    }

    private final void c(View view) {
        int ceil = (int) Math.ceil(this.f42646I / a(view));
        if (ceil != this.f42644G) {
            this.f42644G = ceil;
            X2.l<Integer, H0> lVar = this.f42643F;
            int i4 = this.f42642E;
            if (ceil > i4) {
                ceil = i4;
            }
            lVar.C(Integer.valueOf(ceil));
            view.performHapticFeedback(1, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r0 != 3) goto L13;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(@l3.d android.view.View r4, @l3.d android.view.MotionEvent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.F.p(r4, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.F.p(r5, r0)
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 == r1) goto L2d
            r2 = 2
            if (r0 == r2) goto L1a
            r5 = 3
            if (r0 == r5) goto L2d
            goto L4f
        L1a:
            float r5 = r5.getY()
            android.graphics.PointF r0 = r3.f42645H
            float r0 = r0.y
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            r3.f42646I = r5
            r3.c(r4)
            goto L4f
        L2d:
            r5 = 0
            r4.setPressed(r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r5 = 0
            r4.<init>(r5, r5)
            r3.f42645H = r4
            r3.b()
            goto L4f
        L3d:
            r4.setPressed(r1)
            android.graphics.PointF r4 = new android.graphics.PointF
            float r0 = r5.getX()
            float r5 = r5.getY()
            r4.<init>(r0, r5)
            r3.f42645H = r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.customviews.b.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
