package com.harman.jbl.partybox.ui.equalizer;

import X2.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.log.f;
import java.util.ArrayList;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.Adapter<b> {

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    public static final a f43630g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    public static final String f43631h = "EQTheme2Adapter";

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final Context f43632d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private ArrayList<com.harman.jbl.partybox.model.a> f43633e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final c f43634f;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private HmCustomFontTextView f43635I;

        /* renamed from: J, reason: collision with root package name */
        @l3.d
        private ImageView f43636J;

        /* renamed from: K, reason: collision with root package name */
        @l3.d
        private ConstraintLayout f43637K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ d f43638L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d d dVar, View itemView) {
            super(itemView);
            F.p(itemView, "itemView");
            this.f43638L = dVar;
            View findViewById = itemView.findViewById(j.h.Mh);
            F.o(findViewById, "findViewById(...)");
            this.f43635I = (HmCustomFontTextView) findViewById;
            View findViewById2 = itemView.findViewById(j.h.Q7);
            F.o(findViewById2, "findViewById(...)");
            this.f43636J = (ImageView) findViewById2;
            View findViewById3 = itemView.findViewById(j.h.t4);
            F.o(findViewById3, "findViewById(...)");
            this.f43637K = (ConstraintLayout) findViewById3;
        }

        @l3.d
        public final ConstraintLayout R() {
            return this.f43637K;
        }

        @l3.d
        public final ImageView S() {
            return this.f43636J;
        }

        @l3.d
        public final HmCustomFontTextView T() {
            return this.f43635I;
        }

        public final void U(@l3.d ConstraintLayout constraintLayout) {
            F.p(constraintLayout, "<set-?>");
            this.f43637K = constraintLayout;
        }

        public final void V(@l3.d com.harman.jbl.partybox.model.a eqPresetCategory, boolean z3) {
            String b4;
            F.p(eqPresetCategory, "eqPresetCategory");
            this.f43635I.setText(eqPresetCategory.f());
            if (eqPresetCategory.i()) {
                b4 = eqPresetCategory.g();
            } else {
                b4 = eqPresetCategory.b();
            }
            d dVar = this.f43638L;
            dVar.W(this.f43637K, dVar.R(b4));
        }

        public final void W(@l3.d ImageView imageView) {
            F.p(imageView, "<set-?>");
            this.f43636J = imageView;
        }

        public final void X(@l3.d HmCustomFontTextView hmCustomFontTextView) {
            F.p(hmCustomFontTextView, "<set-?>");
            this.f43635I = hmCustomFontTextView;
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final p<com.harman.jbl.partybox.model.a, Boolean, H0> f43639a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@l3.d p<? super com.harman.jbl.partybox.model.a, ? super Boolean, H0> clickListener) {
            F.p(clickListener, "clickListener");
            this.f43639a = clickListener;
        }

        @l3.d
        public final p<com.harman.jbl.partybox.model.a, Boolean, H0> a() {
            return this.f43639a;
        }

        public final void b(@l3.d com.harman.jbl.partybox.model.a eqPresetCategory, boolean z3) {
            F.p(eqPresetCategory, "eqPresetCategory");
            this.f43639a.c0(eqPresetCategory, Boolean.valueOf(z3));
        }
    }

    public d(@l3.d Context context, @l3.d ArrayList<com.harman.jbl.partybox.model.a> eqPresetList, @l3.d c onItemListener) {
        F.p(context, "context");
        F.p(eqPresetList, "eqPresetList");
        F.p(onItemListener, "onItemListener");
        this.f43632d = context;
        this.f43633e = eqPresetList;
        this.f43634f = onItemListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(String str) {
        return this.f43632d.getResources().getIdentifier(str, "drawable", this.f43632d.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(d this$0, boolean z3, com.harman.jbl.partybox.model.a eqPresetModel, int i4, View view) {
        boolean K12;
        F.p(this$0, "this$0");
        F.p(eqPresetModel, "$eqPresetModel");
        f.a(f43631h, "constraintLayout setOnClickListener called, eqPresetList = " + this$0.f43633e);
        if (!z3) {
            K12 = z.K1(eqPresetModel.f(), "custom", true);
            if (K12) {
                f.a(f43631h, "Custom first time edit");
                int size = this$0.f43633e.size();
                for (int i5 = 0; i5 < size; i5++) {
                    this$0.f43633e.get(i5).p(false);
                }
                this$0.f43633e.get(i4).p(true);
                this$0.r();
                this$0.f43634f.b(eqPresetModel, true);
                return;
            }
        }
        int size2 = this$0.f43633e.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (this$0.f43633e.get(i6).i() && i6 == i4) {
                f.a(f43631h, "Selected EQ clicked again");
                return;
            }
        }
        f.a(f43631h, "resetData and position is " + i4);
        this$0.V(i4);
    }

    private final void V(int i4) {
        int size = this.f43633e.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f43633e.get(i5).p(false);
        }
        this.f43633e.get(i4).p(true);
        c cVar = this.f43634f;
        com.harman.jbl.partybox.model.a aVar = this.f43633e.get(i4);
        F.o(aVar, "get(...)");
        cVar.b(aVar, false);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(ConstraintLayout constraintLayout, int i4) {
        constraintLayout.setBackgroundResource(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b holder, final int i4) {
        F.p(holder, "holder");
        com.harman.jbl.partybox.model.a aVar = this.f43633e.get(i4);
        F.o(aVar, "get(...)");
        final com.harman.jbl.partybox.model.a aVar2 = aVar;
        final boolean g4 = com.harman.jbl.partybox.persistence.a.g(s3.a.f57652l);
        holder.V(aVar2, g4);
        holder.R().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.equalizer.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.T(d.this, g4, aVar2, i4, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public b E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(j.i.f41425O2, parent, false);
        F.o(inflate, "inflate(...)");
        return new b(this, inflate);
    }

    public final void X(@l3.d ArrayList<com.harman.jbl.partybox.model.a> eqList) {
        F.p(eqList, "eqList");
        this.f43633e = eqList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f43633e.size();
    }
}
