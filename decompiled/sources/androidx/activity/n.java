package androidx.activity;

import androidx.lifecycle.E;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static final class a extends j {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X2.l<j, H0> f4505d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z3, X2.l<? super j, H0> lVar) {
            super(z3);
            this.f4505d = lVar;
        }

        @Override // androidx.activity.j
        public void e() {
            this.f4505d.C(this);
        }
    }

    @l3.d
    public static final j a(@l3.d OnBackPressedDispatcher onBackPressedDispatcher, @l3.e E e4, boolean z3, @l3.d X2.l<? super j, H0> onBackPressed) {
        F.p(onBackPressedDispatcher, "<this>");
        F.p(onBackPressed, "onBackPressed");
        a aVar = new a(z3, onBackPressed);
        if (e4 != null) {
            onBackPressedDispatcher.c(e4, aVar);
        } else {
            onBackPressedDispatcher.b(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ j b(OnBackPressedDispatcher onBackPressedDispatcher, E e4, boolean z3, X2.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            e4 = null;
        }
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        return a(onBackPressedDispatcher, e4, z3, lVar);
    }
}
