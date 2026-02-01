package com.harman.jbl.partybox.ui.lightshowbutton;

import X2.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.databinding.B2;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import f2.C2054a;
import java.util.ArrayList;
import java.util.List;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.Adapter<b> {

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final a f44044f = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final C0387c f44045d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final List<C2054a> f44046e;

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
        private final B2 f44047I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ c f44048J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d c cVar, B2 binding) {
            super(binding.d());
            F.p(binding, "binding");
            this.f44048J = cVar;
            this.f44047I = binding;
        }

        public final void R(@l3.d C2054a button) {
            int i4;
            float f4;
            F.p(button, "button");
            ImageView imageView = this.f44047I.f38494H;
            if (button.g()) {
                i4 = j.f.i4;
            } else {
                i4 = j.f.h4;
            }
            imageView.setImageResource(i4);
            ImageView imageView2 = this.f44047I.f38492F;
            imageView2.setImageResource(button.i());
            float f5 = 0.5f;
            if (button.g()) {
                f4 = 1.0f;
            } else {
                f4 = 0.5f;
            }
            imageView2.setAlpha(f4);
            HmCustomFontTextView hmCustomFontTextView = this.f44047I.f38493G;
            hmCustomFontTextView.setText(hmCustomFontTextView.getContext().getString(button.j()));
            if (button.g()) {
                f5 = 1.0f;
            }
            hmCustomFontTextView.setAlpha(f5);
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.lightshowbutton.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0387c {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final l<C2054a, H0> f44049a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0387c(@l3.d l<? super C2054a, H0> clickListener) {
            F.p(clickListener, "clickListener");
            this.f44049a = clickListener;
        }

        @l3.d
        public final l<C2054a, H0> a() {
            return this.f44049a;
        }

        public final void b(@l3.d C2054a button) {
            F.p(button, "button");
            this.f44049a.C(button);
        }
    }

    public c(@l3.d C0387c onClickListener) {
        F.p(onClickListener, "onClickListener");
        this.f44045d = onClickListener;
        this.f44046e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(c this$0, C2054a lightShowButton, View view) {
        F.p(this$0, "this$0");
        F.p(lightShowButton, "$lightShowButton");
        this$0.f44045d.b(lightShowButton);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b holder, int i4) {
        F.p(holder, "holder");
        final C2054a c2054a = this.f44046e.get(i4);
        holder.f17770a.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.lightshowbutton.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.Q(c.this, c2054a, view);
            }
        });
        holder.R(c2054a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        B2 e4 = B2.e(LayoutInflater.from(parent.getContext()), parent, false);
        F.o(e4, "inflate(...)");
        return new b(this, e4);
    }

    public final void S(@l3.d List<C2054a> cards) {
        F.p(cards, "cards");
        this.f44046e.clear();
        this.f44046e.addAll(cards);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f44046e.size();
    }
}
