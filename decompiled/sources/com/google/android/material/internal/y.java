package com.google.android.material.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class y extends B implements A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static y f(ViewGroup viewGroup) {
        return (y) B.e(viewGroup);
    }

    @Override // com.google.android.material.internal.A
    public void c(@N View view) {
        this.f32493a.b(view);
    }

    @Override // com.google.android.material.internal.A
    public void d(@N View view) {
        this.f32493a.h(view);
    }
}
