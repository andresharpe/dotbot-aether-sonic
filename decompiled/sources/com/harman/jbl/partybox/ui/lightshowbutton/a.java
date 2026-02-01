package com.harman.jbl.partybox.ui.lightshowbutton;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.harman.jbl.partybox.databinding.C1;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a extends t<Integer, C0385a> {

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final b f44038f = new b(null);

    /* renamed from: com.harman.jbl.partybox.ui.lightshowbutton.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0385a extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final C1 f44039I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ a f44040J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0385a(@l3.d a aVar, C1 binding) {
            super(binding.d());
            F.p(binding, "binding");
            this.f44040J = aVar;
            this.f44039I = binding;
        }

        public final void R(int i4) {
            this.f44039I.f38519F.setText(i4);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: com.harman.jbl.partybox.ui.lightshowbutton.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0386a extends C0964j.f<Integer> {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            public static final C0386a f44041a = new C0386a();

            private C0386a() {
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            public /* bridge */ /* synthetic */ boolean a(Integer num, Integer num2) {
                return d(num.intValue(), num2.intValue());
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            public /* bridge */ /* synthetic */ boolean b(Integer num, Integer num2) {
                return e(num.intValue(), num2.intValue());
            }

            public boolean d(int i4, int i5) {
                return i4 == i5;
            }

            public boolean e(int i4, int i5) {
                return i4 == i5;
            }
        }

        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        private b() {
        }
    }

    public a() {
        super(b.C0386a.f44041a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d C0385a holder, int i4) {
        F.p(holder, "holder");
        Integer P3 = P(i4);
        F.m(P3);
        holder.R(P3.intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public C0385a E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        C1 e4 = C1.e(LayoutInflater.from(parent.getContext()), parent, false);
        F.o(e4, "inflate(...)");
        return new C0385a(this, e4);
    }
}
