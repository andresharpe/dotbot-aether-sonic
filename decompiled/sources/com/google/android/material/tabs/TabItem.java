package com.google.android.material.tabs;

import T0.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.g0;

/* loaded from: classes2.dex */
public class TabItem extends View {

    /* renamed from: E, reason: collision with root package name */
    public final CharSequence f33452E;

    /* renamed from: F, reason: collision with root package name */
    public final Drawable f33453F;

    /* renamed from: G, reason: collision with root package name */
    public final int f33454G;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g0 F3 = g0.F(context, attributeSet, a.o.Rs);
        this.f33452E = F3.x(a.o.Us);
        this.f33453F = F3.h(a.o.Ss);
        this.f33454G = F3.u(a.o.Ts, 0);
        F3.I();
    }
}
