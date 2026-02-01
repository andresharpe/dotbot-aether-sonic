package com.harman.jbl.cd_biz_comm.utils;

import android.view.View;
import androidx.annotation.F;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public abstract class e implements View.OnClickListener {

    /* renamed from: E, reason: collision with root package name */
    private final int f37875E;

    /* renamed from: F, reason: collision with root package name */
    private final int f37876F;

    /* renamed from: G, reason: collision with root package name */
    private int f37877G;

    /* renamed from: H, reason: collision with root package name */
    private long f37878H;

    public e(@F(from = 2) int i4, int i5) {
        this.f37875E = i4;
        this.f37876F = i5;
    }

    public abstract void a(@l3.d View view);

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.d View v3) {
        kotlin.jvm.internal.F.p(v3, "v");
        this.f37877G++;
        if (this.f37878H == 0) {
            this.f37878H = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - this.f37878H <= this.f37876F) {
            if (this.f37877G >= this.f37875E) {
                a(v3);
            }
        } else {
            this.f37877G = 1;
        }
        this.f37878H = System.currentTimeMillis();
    }

    public /* synthetic */ e(int i4, int i5, int i6, C2197u c2197u) {
        this(i4, (i6 & 2) != 0 ? 500 : i5);
    }
}
