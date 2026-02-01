package androidx.activity;

import android.view.View;
import androidx.activity.s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;

@W2.i(name = "ViewTreeOnBackPressedDispatcherOwner")
/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    static final class a extends Lambda implements X2.l<View, View> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f4571F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final View C(@l3.d View it) {
            F.p(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Lambda implements X2.l<View, o> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f4572F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final o C(@l3.d View it) {
            F.p(it, "it");
            Object tag = it.getTag(s.a.f4570a);
            if (tag instanceof o) {
                return (o) tag;
            }
            return null;
        }
    }

    @l3.e
    @W2.i(name = "get")
    public static final o a(@l3.d View view) {
        kotlin.sequences.m n4;
        kotlin.sequences.m p12;
        Object F02;
        F.p(view, "<this>");
        n4 = kotlin.sequences.s.n(view, a.f4571F);
        p12 = SequencesKt___SequencesKt.p1(n4, b.f4572F);
        F02 = SequencesKt___SequencesKt.F0(p12);
        return (o) F02;
    }

    @W2.i(name = "set")
    public static final void b(@l3.d View view, @l3.d o onBackPressedDispatcherOwner) {
        F.p(view, "<this>");
        F.p(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(s.a.f4570a, onBackPressedDispatcherOwner);
    }
}
