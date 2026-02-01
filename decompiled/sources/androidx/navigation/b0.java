package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.C0617b;
import androidx.navigation.i0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final b0 f16387a = new b0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements X2.l<View, View> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f16388F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final View C(@l3.d View it) {
            kotlin.jvm.internal.F.p(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements X2.l<View, C0943u> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f16389F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C0943u C(@l3.d View it) {
            kotlin.jvm.internal.F.p(it, "it");
            return b0.f16387a.m(it);
        }
    }

    private b0() {
    }

    @W2.j
    @W2.n
    @l3.d
    public static final View.OnClickListener d(@androidx.annotation.D int i4) {
        return g(i4, null, 2, null);
    }

    @W2.j
    @W2.n
    @l3.d
    public static final View.OnClickListener e(@androidx.annotation.D final int i4, @l3.e final Bundle bundle) {
        return new View.OnClickListener() { // from class: androidx.navigation.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0.h(i4, bundle, view);
            }
        };
    }

    @W2.n
    @l3.d
    public static final View.OnClickListener f(@l3.d final I directions) {
        kotlin.jvm.internal.F.p(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0.i(I.this, view);
            }
        };
    }

    public static /* synthetic */ View.OnClickListener g(int i4, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        return e(i4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i4, Bundle bundle, View view) {
        kotlin.jvm.internal.F.o(view, "view");
        k(view).X(i4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(I directions, View view) {
        kotlin.jvm.internal.F.p(directions, "$directions");
        kotlin.jvm.internal.F.o(view, "view");
        k(view).h0(directions);
    }

    @W2.n
    @l3.d
    public static final C0943u j(@l3.d Activity activity, @androidx.annotation.D int i4) {
        kotlin.jvm.internal.F.p(activity, "activity");
        View K3 = C0617b.K(activity, i4);
        kotlin.jvm.internal.F.o(K3, "requireViewById<View>(activity, viewId)");
        C0943u l4 = f16387a.l(K3);
        if (l4 != null) {
            return l4;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i4);
    }

    @W2.n
    @l3.d
    public static final C0943u k(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "view");
        C0943u l4 = f16387a.l(view);
        if (l4 != null) {
            return l4;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final C0943u l(View view) {
        kotlin.sequences.m n4;
        kotlin.sequences.m p12;
        Object F02;
        n4 = kotlin.sequences.s.n(view, a.f16388F);
        p12 = SequencesKt___SequencesKt.p1(n4, b.f16389F);
        F02 = SequencesKt___SequencesKt.F0(p12);
        return (C0943u) F02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0943u m(View view) {
        Object tag = view.getTag(i0.b.f16490a);
        if (tag instanceof WeakReference) {
            return (C0943u) ((WeakReference) tag).get();
        }
        if (tag instanceof C0943u) {
            return (C0943u) tag;
        }
        return null;
    }

    @W2.n
    public static final void n(@l3.d View view, @l3.e C0943u c0943u) {
        kotlin.jvm.internal.F.p(view, "view");
        view.setTag(i0.b.f16490a, c0943u);
    }
}
