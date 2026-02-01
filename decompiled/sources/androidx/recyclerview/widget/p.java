package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.C0823k0;
import b0.C1002a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p implements o {

    /* renamed from: a, reason: collision with root package name */
    static final o f18282a = new p();

    p() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            if (childAt != view) {
                float R3 = C0823k0.R(childAt);
                if (R3 > f4) {
                    f4 = R3;
                }
            }
        }
        return f4;
    }

    @Override // androidx.recyclerview.widget.o
    public void a(View view) {
        Object tag = view.getTag(C1002a.e.f21033V);
        if (tag instanceof Float) {
            C0823k0.N1(view, ((Float) tag).floatValue());
        }
        view.setTag(C1002a.e.f21033V, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.o
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.o
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f4, float f5, int i4, boolean z3) {
    }

    @Override // androidx.recyclerview.widget.o
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f4, float f5, int i4, boolean z3) {
        if (z3 && view.getTag(C1002a.e.f21033V) == null) {
            Float valueOf = Float.valueOf(C0823k0.R(view));
            C0823k0.N1(view, e(recyclerView, view) + 1.0f);
            view.setTag(C1002a.e.f21033V, valueOf);
        }
        view.setTranslationX(f4);
        view.setTranslationY(f5);
    }
}
