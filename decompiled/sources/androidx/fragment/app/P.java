package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class P {
    @l3.d
    public static final <F extends Fragment> F a(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "<this>");
        F f4 = (F) FragmentManager.m0(view);
        kotlin.jvm.internal.F.o(f4, "findFragment(this)");
        return f4;
    }
}
