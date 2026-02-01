package com.harman.jbl.partybox.ui.partybutton;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.databinding.R3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.partybutton.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class f extends RecyclerView.Adapter<c> {

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final a f45427f = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private ArrayList<com.harman.jbl.partybox.model.c> f45428d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private b f45429e;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.harman.jbl.partybox.ui.partybutton.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0403a extends C0964j.f<com.harman.jbl.partybox.model.c> {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            public static final C0403a f45430a = new C0403a();

            private C0403a() {
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean a(@l3.d com.harman.jbl.partybox.model.c oldItem, @l3.d com.harman.jbl.partybox.model.c newItem) {
                F.p(oldItem, "oldItem");
                F.p(newItem, "newItem");
                return F.g(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public boolean b(@l3.d com.harman.jbl.partybox.model.c oldItem, @l3.d com.harman.jbl.partybox.model.c newItem) {
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

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i4);
    }

    /* loaded from: classes2.dex */
    public final class c extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final R3 f45431I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ f f45432J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@l3.d f fVar, R3 binding) {
            super(binding.d());
            F.p(binding, "binding");
            this.f45432J = fVar;
            this.f45431I = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void T(com.harman.jbl.partybox.model.c partyButton, f this$0, int i4, View view) {
            b bVar;
            F.p(partyButton, "$partyButton");
            F.p(this$0, "this$0");
            if (!partyButton.k() && (bVar = this$0.f45429e) != null) {
                bVar.a(i4);
            }
        }

        public final void S(final int i4) {
            Context context;
            int i5;
            int i6;
            int i7;
            Object obj = this.f45432J.f45428d.get(i4);
            F.o(obj, "get(...)");
            final com.harman.jbl.partybox.model.c cVar = (com.harman.jbl.partybox.model.c) obj;
            HmCustomFontTextView hmCustomFontTextView = this.f45431I.f39017G;
            hmCustomFontTextView.setText(cVar.j());
            if (cVar.k()) {
                context = hmCustomFontTextView.getContext();
                i5 = j.d.f40753h;
            } else {
                context = hmCustomFontTextView.getContext();
                i5 = j.d.f40749f1;
            }
            hmCustomFontTextView.setTextColor(context.getColor(i5));
            this.f45431I.d().setBackgroundResource(j.f.Ja);
            ConstraintLayout d4 = this.f45431I.d();
            final f fVar = this.f45432J;
            if (cVar.k()) {
                i6 = cVar.h();
            } else {
                i6 = j.f.Ja;
            }
            d4.setBackgroundResource(i6);
            d4.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.partybutton.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.c.T(com.harman.jbl.partybox.model.c.this, fVar, i4, view);
                }
            });
            ImageView imageView = this.f45431I.f39016F;
            if (cVar.k()) {
                i7 = cVar.i();
            } else {
                i7 = j.f.f41073m3;
            }
            imageView.setImageResource(i7);
        }
    }

    @l3.d
    public final List<com.harman.jbl.partybox.model.c> Q() {
        return this.f45428d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d c holder, int i4) {
        F.p(holder, "holder");
        holder.S(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public c E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        R3 e4 = R3.e(LayoutInflater.from(parent.getContext()), parent, false);
        F.o(e4, "inflate(...)");
        return new c(this, e4);
    }

    public final void T(@l3.d b listener) {
        F.p(listener, "listener");
        this.f45429e = listener;
    }

    public final void U(@l3.d List<com.harman.jbl.partybox.model.c> data) {
        F.p(data, "data");
        this.f45428d.clear();
        this.f45428d.addAll(data);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f45428d.size();
    }
}
