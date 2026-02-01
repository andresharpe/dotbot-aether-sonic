package com.harman.jbl.partybox.ui.dashboard.lightshow;

import X2.l;
import a2.AbstractC0557b;
import a2.C0556a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.databinding.C1886j;
import com.harman.jbl.partybox.ui.dashboard.lightshow.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.Adapter<b> {

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final C0372a f43274f = new C0372a(null);

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    public static final String f43275g = "LightElementCompactAdapter";

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final l<AbstractC0557b, H0> f43276d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final List<AbstractC0557b> f43277e;

    /* renamed from: com.harman.jbl.partybox.ui.dashboard.lightshow.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0372a {
        public /* synthetic */ C0372a(C2197u c2197u) {
            this();
        }

        private C0372a() {
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final C1886j f43278I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ a f43279J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d final a aVar, C1886j binding) {
            super(binding.d());
            F.p(binding, "binding");
            this.f43279J = aVar;
            this.f43278I = binding;
            binding.d().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partybox.ui.dashboard.lightshow.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    a.b.S(a.b.this, aVar, compoundButton, z3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void S(b this$0, a this$1, CompoundButton compoundButton, boolean z3) {
            a2.c cVar;
            F.p(this$0, "this$0");
            F.p(this$1, "this$1");
            int p4 = this$0.p();
            if (p4 == -1) {
                com.harman.log.f.a(a.f43275g, "setOnCheckedChangeListener>>> position = NO_POSITION");
                return;
            }
            Object obj = this$1.f43277e.get(p4);
            H0 h02 = null;
            if (obj instanceof a2.c) {
                cVar = (a2.c) obj;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                com.harman.log.f.a(a.f43275g, "OnCheckedChangeListener>>> let position = " + p4 + ", isChecked = " + z3 + ", element = " + cVar);
                if (cVar.h() != z3) {
                    cVar.i(z3);
                    this$1.f43276d.C(a2.c.e(cVar, null, 0, z3, 3, null));
                }
                h02 = H0.f51801a;
            }
            if (h02 == null) {
                com.harman.log.f.a(a.f43275g, "OnCheckedChangeListener>>> run position = " + p4 + ", isChecked = " + z3 + ", element = " + this$1.f43277e.get(p4));
            }
        }

        public final void T(@l3.d AbstractC0557b element) {
            F.p(element, "element");
            CheckBox checkBox = this.f43278I.f39698F;
            if (element instanceof a2.c) {
                checkBox.setVisibility(0);
                a2.c cVar = (a2.c) element;
                if (checkBox.isChecked() != cVar.h()) {
                    checkBox.setChecked(cVar.h());
                }
                checkBox.setBackgroundResource(cVar.g());
                return;
            }
            if (element instanceof C0556a) {
                checkBox.setVisibility(4);
            }
        }

        @l3.d
        public final C1886j U() {
            return this.f43278I;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final l<AbstractC0557b, H0> f43280a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@l3.d l<? super AbstractC0557b, H0> clickListener) {
            F.p(clickListener, "clickListener");
            this.f43280a = clickListener;
        }

        @l3.d
        public final l<AbstractC0557b, H0> a() {
            return this.f43280a;
        }

        public final void b(@l3.d AbstractC0557b element) {
            F.p(element, "element");
            this.f43280a.C(element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@l3.d l<? super AbstractC0557b, H0> onClickListener) {
        F.p(onClickListener, "onClickListener");
        this.f43276d = onClickListener;
        this.f43277e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b lightElementHolder, int i4) {
        F.p(lightElementHolder, "lightElementHolder");
        AbstractC0557b abstractC0557b = this.f43277e.get(i4);
        com.harman.log.f.a(f43275g, "onBindViewHolder>>> position = " + i4 + ", element = " + abstractC0557b);
        lightElementHolder.T(abstractC0557b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        C1886j e4 = C1886j.e(LayoutInflater.from(parent.getContext()), parent, false);
        F.o(e4, "inflate(...)");
        return new b(this, e4);
    }

    public final void S(@l3.d List<? extends AbstractC0557b> cards) {
        F.p(cards, "cards");
        this.f43277e.clear();
        this.f43277e.addAll(cards);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f43277e.size();
    }
}
