package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.C0771a;
import androidx.core.view.accessibility.M;

/* loaded from: classes2.dex */
class a extends C0771a {

    /* renamed from: d, reason: collision with root package name */
    private final M.a f33916d;

    public a(Context context, int i4) {
        this.f33916d = new M.a(16, context.getString(i4));
    }

    @Override // androidx.core.view.C0771a
    public void g(View view, M m4) {
        super.g(view, m4);
        m4.b(this.f33916d);
    }
}
