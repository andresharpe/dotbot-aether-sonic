package com.harman.jbl.cd_biz_comm.utils;

import android.view.View;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public abstract class g implements View.OnClickListener {

    /* renamed from: E, reason: collision with root package name */
    private final int f37884E;

    /* renamed from: F, reason: collision with root package name */
    private long f37885F;

    public g() {
        this(0, 1, null);
    }

    public abstract void a(@l3.d View view);

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.d View v3) {
        F.p(v3, "v");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f37885F > this.f37884E) {
            a(v3);
        }
        this.f37885F = currentTimeMillis;
    }

    public g(int i4) {
        this.f37884E = i4;
    }

    public /* synthetic */ g(int i4, int i5, C2197u c2197u) {
        this((i5 & 1) != 0 ? 500 : i4);
    }
}
