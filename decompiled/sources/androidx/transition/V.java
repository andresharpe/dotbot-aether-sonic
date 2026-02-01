package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class V extends c0 implements X {
    /* JADX INFO: Access modifiers changed from: package-private */
    public V(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static V g(ViewGroup viewGroup) {
        return (V) c0.e(viewGroup);
    }

    @Override // androidx.transition.X
    public void c(@androidx.annotation.N View view) {
        this.f19995a.b(view);
    }

    @Override // androidx.transition.X
    public void d(@androidx.annotation.N View view) {
        this.f19995a.h(view);
    }
}
