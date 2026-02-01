package com.harman.jbl.partybox.ui.lightshow;

import X2.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0669d;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import c2.C1008a;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.databinding.C3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.widget.x;
import com.harman.sdk.utils.LightPattern;
import kotlin.H0;
import kotlin.Pair;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b extends t<C1008a, C0383b> {

    /* renamed from: i, reason: collision with root package name */
    @d
    public static final a f43981i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final int f43982j = x.a(2);

    /* renamed from: k, reason: collision with root package name */
    private static final float f43983k = x.a(20);

    /* renamed from: f, reason: collision with root package name */
    @d
    private final l<C1008a, H0> f43984f;

    /* renamed from: g, reason: collision with root package name */
    @e
    private String f43985g;

    /* renamed from: h, reason: collision with root package name */
    @e
    private Pair<C0383b, C1008a> f43986h;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.harman.jbl.partybox.ui.lightshow.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0382a extends C0964j.f<C1008a> {

            /* renamed from: a, reason: collision with root package name */
            @d
            public static final C0382a f43987a = new C0382a();

            private C0382a() {
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean a(@d C1008a oldItem, @d C1008a newItem) {
                F.p(oldItem, "oldItem");
                F.p(newItem, "newItem");
                if (oldItem.j() == newItem.j() && oldItem.n() == newItem.n()) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public boolean b(@d C1008a oldItem, @d C1008a newItem) {
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

    /* renamed from: com.harman.jbl.partybox.ui.lightshow.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0383b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @d
        private final Context f43988I;

        /* renamed from: J, reason: collision with root package name */
        @d
        private final C3 f43989J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ b f43990K;

        /* renamed from: com.harman.jbl.partybox.ui.lightshow.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1008a f43992b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LottieAnimationView f43993c;

            a(C1008a c1008a, LottieAnimationView lottieAnimationView) {
                this.f43992b = c1008a;
                this.f43993c = lottieAnimationView;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@d Animator animation) {
                F.p(animation, "animation");
                C0383b.this.T(this.f43992b);
                this.f43993c.F(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@d Animator animation) {
                F.p(animation, "animation");
                C0383b.this.T(this.f43992b);
                this.f43993c.F(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0383b(@d b bVar, @d Context context, C3 binding) {
            super(binding.d());
            F.p(context, "context");
            F.p(binding, "binding");
            this.f43990K = bVar;
            this.f43988I = context;
            this.f43989J = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T(C1008a c1008a) {
            if (!com.harman.sdk.utils.d.H(this.f43990K.f43985g) && c1008a.j() == LightPattern.CUSTOM && c1008a.n()) {
                this.f43989J.f38527F.setImageResource(j.f.ca);
            } else {
                this.f43989J.f38527F.setImageResource(c1008a.l());
            }
        }

        public final void S(@d C1008a lightShowCard) {
            int i4;
            int i5;
            F.p(lightShowCard, "lightShowCard");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColors(lightShowCard.i());
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BR_TL);
            if (lightShowCard.n()) {
                this.f43989J.f38528G.setTypeface(null, 1);
                if (com.harman.sdk.utils.d.H(this.f43990K.f43985g)) {
                    i4 = b.f43982j;
                } else {
                    i4 = b.f43982j * 2;
                }
                if (com.harman.sdk.utils.d.H(this.f43990K.f43985g)) {
                    i5 = j.d.f40723V0;
                } else {
                    i5 = j.d.f40749f1;
                }
                gradientDrawable.setStroke(i4, C0669d.f(this.f43988I, i5));
                LottieAnimationView lottieAnimationView = this.f43989J.f38527F;
                if (lightShowCard.k() != 0) {
                    lottieAnimationView.setImageDrawable(null);
                    lottieAnimationView.setAnimation(lightShowCard.k());
                    if (o.f44128m1.e()) {
                        lottieAnimationView.B();
                    }
                    lottieAnimationView.g(new a(lightShowCard, lottieAnimationView));
                } else {
                    T(lightShowCard);
                }
            } else {
                if (this.f43989J.f38527F.x()) {
                    this.f43989J.f38527F.m();
                }
                T(lightShowCard);
                this.f43989J.f38528G.setTypeface(null, 0);
            }
            gradientDrawable.setCornerRadius(b.f43983k);
            this.f43989J.d().setBackground(gradientDrawable);
            if (com.harman.sdk.utils.d.H(this.f43990K.f43985g) || lightShowCard.j() != LightPattern.CUSTOM || !lightShowCard.n()) {
                this.f43990K.f43986h = null;
                this.f43989J.f38528G.setText(this.f43988I.getString(lightShowCard.m()));
            } else {
                this.f43990K.f43986h = new Pair(this, lightShowCard);
                this.f43989J.f38528G.setText(this.f43988I.getString(j.m.o9));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(@d C1008a c1008a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@e String str, @d l<? super C1008a, H0> onClickListener) {
        super(a.C0382a.f43987a);
        F.p(onClickListener, "onClickListener");
        this.f43984f = onClickListener;
        this.f43985g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(b this$0, C1008a c1008a, View view) {
        F.p(this$0, "this$0");
        l<C1008a, H0> lVar = this$0.f43984f;
        F.m(c1008a);
        lVar.C(c1008a);
    }

    public final void Y() {
        Pair<C0383b, C1008a> pair = this.f43986h;
        if (pair != null) {
            pair.e().S(pair.f());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void C(@d C0383b holder, int i4) {
        F.p(holder, "holder");
        final C1008a P3 = P(i4);
        holder.f17770a.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.lightshow.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.a0(b.this, P3, view);
            }
        });
        F.m(P3);
        holder.S(P3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @d
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C0383b E(@d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        Context context = parent.getContext();
        F.o(context, "getContext(...)");
        C3 e4 = C3.e(LayoutInflater.from(parent.getContext()), parent, false);
        F.o(e4, "inflate(...)");
        return new C0383b(this, context, e4);
    }
}
