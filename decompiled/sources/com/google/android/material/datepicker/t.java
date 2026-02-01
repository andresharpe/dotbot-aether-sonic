package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
class t extends LinearLayoutManager {

    /* renamed from: O, reason: collision with root package name */
    private static final float f32265O = 100.0f;

    /* loaded from: classes2.dex */
    class a extends androidx.recyclerview.widget.r {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        protected float w(DisplayMetrics displayMetrics) {
            return t.f32265O / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Context context, int i4, boolean z3) {
        super(context, i4, z3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.C c4, int i4) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(i4);
        g2(aVar);
    }
}
