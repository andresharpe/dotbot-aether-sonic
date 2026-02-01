package com.harman.jbl.partybox.ui.lightcontrol;

import X2.l;
import a2.AbstractC0557b;
import a2.C0556a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.core.content.C0669d;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.harman.jbl.partybox.databinding.B1;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class b extends t<AbstractC0557b, C0381b> {

    /* renamed from: g, reason: collision with root package name */
    @d
    public static final a f43939g = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @d
    private final l<AbstractC0557b, H0> f43940f;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.harman.jbl.partybox.ui.lightcontrol.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0380a extends C0964j.f<AbstractC0557b> {

            /* renamed from: a, reason: collision with root package name */
            @d
            public static final C0380a f43941a = new C0380a();

            private C0380a() {
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean a(@d AbstractC0557b oldItem, @d AbstractC0557b newItem) {
                F.p(oldItem, "oldItem");
                F.p(newItem, "newItem");
                if ((oldItem instanceof a2.c) && (newItem instanceof a2.c)) {
                    a2.c cVar = (a2.c) oldItem;
                    a2.c cVar2 = (a2.c) newItem;
                    if (cVar.f() == cVar2.f() && cVar.h() == cVar2.h()) {
                        return true;
                    }
                    return false;
                }
                return F.g(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public boolean b(@d AbstractC0557b oldItem, @d AbstractC0557b newItem) {
                F.p(oldItem, "oldItem");
                F.p(newItem, "newItem");
                return F.g(oldItem, newItem);
            }
        }

        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.lightcontrol.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0381b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @d
        private final B1 f43942I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ b f43943J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0381b(@d b bVar, B1 binding) {
            super(binding.d());
            F.p(binding, "binding");
            this.f43943J = bVar;
            this.f43942I = binding;
        }

        public final void R(@d AbstractC0557b element) {
            F.p(element, "element");
            CheckBox checkBox = this.f43942I.f38490F;
            if (element instanceof a2.c) {
                checkBox.setVisibility(0);
                a2.c cVar = (a2.c) element;
                checkBox.setButtonDrawable(C0669d.i(checkBox.getContext(), cVar.g()));
                checkBox.setChecked(cVar.h());
                return;
            }
            if (element instanceof C0556a) {
                checkBox.setVisibility(4);
            }
        }

        @d
        public final B1 S() {
            return this.f43942I;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @d
        private final l<AbstractC0557b, H0> f43944a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@d l<? super AbstractC0557b, H0> clickListener) {
            F.p(clickListener, "clickListener");
            this.f43944a = clickListener;
        }

        @d
        public final l<AbstractC0557b, H0> a() {
            return this.f43944a;
        }

        public final void b(@d AbstractC0557b element) {
            F.p(element, "element");
            this.f43944a.C(element);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@d l<? super AbstractC0557b, H0> onClickListener) {
        super(a.C0380a.f43941a);
        F.p(onClickListener, "onClickListener");
        this.f43940f = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(b this$0, a2.c it, CompoundButton compoundButton, boolean z3) {
        F.p(this$0, "this$0");
        F.p(it, "$it");
        this$0.f43940f.C(a2.c.e(it, null, 0, z3, 3, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void C(@d C0381b lightElementHolder, int i4) {
        final a2.c cVar;
        F.p(lightElementHolder, "lightElementHolder");
        AbstractC0557b P3 = P(i4);
        if (P3 instanceof a2.c) {
            cVar = (a2.c) P3;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            lightElementHolder.S().d().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partybox.ui.lightcontrol.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    b.V(b.this, cVar, compoundButton, z3);
                }
            });
        } else {
            lightElementHolder.S().d().setOnCheckedChangeListener(null);
        }
        F.m(P3);
        lightElementHolder.R(P3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @d
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public C0381b E(@d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        B1 e4 = B1.e(LayoutInflater.from(parent.getContext()), parent, false);
        F.o(e4, "inflate(...)");
        return new C0381b(this, e4);
    }
}
