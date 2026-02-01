package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class G {
    public static final /* synthetic */ <F extends Fragment> F a(F f4, @androidx.annotation.D int i4, String str, Bundle bundle) {
        kotlin.jvm.internal.F.p(f4, "<this>");
        kotlin.jvm.internal.F.y(4, "F");
        F i5 = f4.i(i4, Fragment.class, bundle, str);
        kotlin.jvm.internal.F.o(i5, "add(containerViewId, F::class.java, args, tag)");
        return i5;
    }

    public static final /* synthetic */ <F extends Fragment> F b(F f4, String tag, Bundle bundle) {
        kotlin.jvm.internal.F.p(f4, "<this>");
        kotlin.jvm.internal.F.p(tag, "tag");
        kotlin.jvm.internal.F.y(4, "F");
        F l4 = f4.l(Fragment.class, bundle, tag);
        kotlin.jvm.internal.F.o(l4, "add(F::class.java, args, tag)");
        return l4;
    }

    public static /* synthetic */ F c(F f4, int i4, String str, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.F.p(f4, "<this>");
        kotlin.jvm.internal.F.y(4, "F");
        F i6 = f4.i(i4, Fragment.class, bundle, str);
        kotlin.jvm.internal.F.o(i6, "add(containerViewId, F::class.java, args, tag)");
        return i6;
    }

    public static /* synthetic */ F d(F f4, String tag, Bundle bundle, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.F.p(f4, "<this>");
        kotlin.jvm.internal.F.p(tag, "tag");
        kotlin.jvm.internal.F.y(4, "F");
        F l4 = f4.l(Fragment.class, bundle, tag);
        kotlin.jvm.internal.F.o(l4, "add(F::class.java, args, tag)");
        return l4;
    }

    public static final /* synthetic */ <F extends Fragment> F e(F f4, @androidx.annotation.D int i4, String str, Bundle bundle) {
        kotlin.jvm.internal.F.p(f4, "<this>");
        kotlin.jvm.internal.F.y(4, "F");
        F F3 = f4.F(i4, Fragment.class, bundle, str);
        kotlin.jvm.internal.F.o(F3, "replace(containerViewId, F::class.java, args, tag)");
        return F3;
    }

    public static /* synthetic */ F f(F f4, int i4, String str, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.F.p(f4, "<this>");
        kotlin.jvm.internal.F.y(4, "F");
        F F3 = f4.F(i4, Fragment.class, bundle, str);
        kotlin.jvm.internal.F.o(F3, "replace(containerViewId, F::class.java, args, tag)");
        return F3;
    }
}
