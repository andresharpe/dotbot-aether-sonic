package com.harman.jbl.cd_biz_comm.utils;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.navigation.C0943u;
import androidx.navigation.I;
import androidx.navigation.fragment.c;
import androidx.navigation.fragment.g;
import androidx.recyclerview.widget.C0958d;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class p {

    /* loaded from: classes2.dex */
    public static final class a extends g {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ X2.l<View, H0> f37936G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(X2.l<? super View, H0> lVar) {
            super(0, 1, null);
            this.f37936G = lVar;
        }

        @Override // com.harman.jbl.cd_biz_comm.utils.g
        public void a(@l3.d View v3) {
            F.p(v3, "v");
            this.f37936G.C(v3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends e {

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ X2.l<View, H0> f37937I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(X2.l<? super View, H0> lVar) {
            super(2, 0, 2, null);
            this.f37937I = lVar;
        }

        @Override // com.harman.jbl.cd_biz_comm.utils.e
        public void a(@l3.d View v3) {
            F.p(v3, "v");
            this.f37937I.C(v3);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class c<T> extends C0964j.f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.p<T, T, Boolean> f37938a;

        /* JADX WARN: Multi-variable type inference failed */
        c(X2.p<? super T, ? super T, Boolean> pVar) {
            this.f37938a = pVar;
        }

        @Override // androidx.recyclerview.widget.C0964j.f
        public boolean a(@l3.d T oldItem, @l3.d T newItem) {
            F.p(oldItem, "oldItem");
            F.p(newItem, "newItem");
            X2.p<T, T, Boolean> pVar = this.f37938a;
            if (pVar != null) {
                return pVar.c0(oldItem, newItem).booleanValue();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C0964j.f
        public boolean b(@l3.d T oldItem, @l3.d T newItem) {
            F.p(oldItem, "oldItem");
            F.p(newItem, "newItem");
            return F.g(oldItem, newItem);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends e {

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ X2.l<View, H0> f37939I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(X2.l<? super View, H0> lVar) {
            super(7, 0, 2, null);
            this.f37939I = lVar;
        }

        @Override // com.harman.jbl.cd_biz_comm.utils.e
        public void a(@l3.d View v3) {
            F.p(v3, "v");
            this.f37939I.C(v3);
        }
    }

    public static final void a(@l3.d View view, @l3.d X2.l<? super View, H0> invoke) {
        F.p(view, "<this>");
        F.p(invoke, "invoke");
        view.setOnClickListener(new a(invoke));
    }

    public static final void b(@l3.d View view, @l3.e X2.l<? super View, H0> lVar) {
        F.p(view, "<this>");
        if (lVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new b(lVar));
        }
    }

    public static /* synthetic */ void c(View view, X2.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        b(view, lVar);
    }

    @l3.d
    public static final <T> C0958d<T> d(@l3.d RecyclerView.Adapter<?> adapter, @l3.e X2.p<? super T, ? super T, Boolean> pVar) {
        F.p(adapter, "<this>");
        return new C0958d<>(adapter, new c(pVar));
    }

    public static /* synthetic */ C0958d e(RecyclerView.Adapter adapter, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            pVar = null;
        }
        return d(adapter, pVar);
    }

    public static final void f(@l3.d View view) {
        F.p(view, "<this>");
        view.setVisibility(8);
    }

    public static final void g(@l3.d View view) {
        F.p(view, "<this>");
        view.setVisibility(4);
    }

    public static final void h(@l3.d Fragment fragment, @l3.d I directions) {
        androidx.navigation.F I3;
        androidx.navigation.F I4;
        F.p(fragment, "<this>");
        F.p(directions, "directions");
        C0943u a4 = androidx.navigation.fragment.f.a(fragment);
        if (a4 != null) {
            androidx.navigation.F I5 = a4.I();
            if (I5 instanceof g.b) {
                if (F.g(fragment.getClass().getName(), ((g.b) I5).O()) && (I4 = a4.I()) != null && I4.o(directions.i()) != null) {
                    a4.h0(directions);
                    return;
                }
                return;
            }
            if ((I5 instanceof c.b) && F.g(fragment.getClass().getName(), ((c.b) I5).O()) && (I3 = a4.I()) != null && I3.o(directions.i()) != null) {
                a4.h0(directions);
            }
        }
    }

    public static final void i(@l3.d View view, @l3.e X2.l<? super View, H0> lVar) {
        F.p(view, "<this>");
        if (lVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new d(lVar));
        }
    }

    public static /* synthetic */ void j(View view, X2.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        i(view, lVar);
    }

    public static final void k(@l3.d View view) {
        F.p(view, "<this>");
        view.setVisibility(0);
    }
}
