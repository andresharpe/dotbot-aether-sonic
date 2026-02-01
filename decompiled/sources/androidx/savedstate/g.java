package androidx.savedstate;

import W2.i;
import X2.l;
import android.view.View;
import androidx.savedstate.a;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import kotlin.sequences.s;

@i(name = "ViewTreeSavedStateRegistryOwner")
/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    static final class a extends Lambda implements l<View, View> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f18386F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final View C(@l3.d View view) {
            F.p(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Lambda implements l<View, e> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f18387F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final e C(@l3.d View view) {
            F.p(view, "view");
            Object tag = view.getTag(a.C0172a.f18372a);
            if (tag instanceof e) {
                return (e) tag;
            }
            return null;
        }
    }

    @l3.e
    @i(name = "get")
    public static final e a(@l3.d View view) {
        m n4;
        m p12;
        Object F02;
        F.p(view, "<this>");
        n4 = s.n(view, a.f18386F);
        p12 = SequencesKt___SequencesKt.p1(n4, b.f18387F);
        F02 = SequencesKt___SequencesKt.F0(p12);
        return (e) F02;
    }

    @i(name = "set")
    public static final void b(@l3.d View view, @l3.e e eVar) {
        F.p(view, "<this>");
        view.setTag(a.C0172a.f18372a, eVar);
    }
}
