package com.harman.jbl.partylight.lib.debug;

import X2.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.E;
import androidx.lifecycle.Q;
import androidx.recyclerview.widget.C0958d;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.cd_biz_comm.utils.p;
import java.util.List;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class g extends RecyclerView.Adapter<RecyclerView.F> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final f f46489d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final E f46490e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final C0958d<String> f46491f;

    /* renamed from: g, reason: collision with root package name */
    private RecyclerView f46492g;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements l<List<? extends String>, H0> {

        /* renamed from: com.harman.jbl.partylight.lib.debug.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class ViewOnLayoutChangeListenerC0413a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f46494a;

            ViewOnLayoutChangeListenerC0413a(g gVar) {
                this.f46494a = gVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@l3.e View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                RecyclerView recyclerView = this.f46494a.f46492g;
                RecyclerView recyclerView2 = null;
                if (recyclerView == null) {
                    F.S("rv");
                    recyclerView = null;
                }
                recyclerView.removeOnLayoutChangeListener(this);
                RecyclerView recyclerView3 = this.f46494a.f46492g;
                if (recyclerView3 == null) {
                    F.S("rv");
                } else {
                    recyclerView2 = recyclerView3;
                }
                recyclerView2.O1(this.f46494a.f46491f.b().size() - 1);
            }
        }

        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends String> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<String> list) {
            g.this.f46491f.f(list);
            F.m(list);
            if (!list.isEmpty()) {
                RecyclerView recyclerView = g.this.f46492g;
                if (recyclerView == null) {
                    F.S("rv");
                    recyclerView = null;
                }
                recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0413a(g.this));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.F {
        b(TextView textView) {
            super(textView);
        }
    }

    /* loaded from: classes2.dex */
    static final class c implements Q, A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f46495a;

        c(l function) {
            F.p(function, "function");
            this.f46495a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f46495a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof A)) {
                return F.g(a(), ((A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f46495a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public g(@l3.d f vm, @l3.d E lifeCycleOwner) {
        F.p(vm, "vm");
        F.p(lifeCycleOwner, "lifeCycleOwner");
        this.f46489d = vm;
        this.f46490e = lifeCycleOwner;
        this.f46491f = p.e(this, null, 1, null);
        vm.y().k(lifeCycleOwner, new c(new a()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void B(@l3.d RecyclerView recyclerView) {
        F.p(recyclerView, "recyclerView");
        super.B(recyclerView);
        this.f46492g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void C(@l3.d RecyclerView.F holder, int i4) {
        F.p(holder, "holder");
        View view = holder.f17770a;
        F.n(view, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view).setText(this.f46491f.b().get(i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    public RecyclerView.F E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        TextView textView = new TextView(parent.getContext());
        textView.setLayoutParams(new RecyclerView.p(-1, -2));
        textView.setTextColor(-16676986);
        textView.setPadding(0, 30, 0, 0);
        return new b(textView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f46491f.b().size();
    }
}
