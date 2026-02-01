package com.harman.jbl.partylight.lib.dashboard.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.content.C0669d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.cd_biz_comm.utils.q;
import com.harman.jbl.partylight.lib.biz.LightInfo;
import com.harman.jbl.partylight.lib.core.e;
import com.harman.jbl.partylight.lib.g;
import java.util.ArrayList;
import java.util.List;
import l2.C2355a;

/* loaded from: classes2.dex */
public class LightShowPanelView extends RecyclerView {

    /* renamed from: Q1, reason: collision with root package name */
    private a f46431Q1;

    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.Adapter<C0411a> {

        /* renamed from: f, reason: collision with root package name */
        private static int f46432f;

        /* renamed from: g, reason: collision with root package name */
        private static int f46433g;

        /* renamed from: d, reason: collision with root package name */
        private List<C2355a> f46434d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private b f46435e;

        /* renamed from: com.harman.jbl.partylight.lib.dashboard.widget.LightShowPanelView$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0411a extends RecyclerView.F {

            /* renamed from: I, reason: collision with root package name */
            private LottieAnimationView f46436I;

            /* renamed from: J, reason: collision with root package name */
            private TextView f46437J;

            /* renamed from: K, reason: collision with root package name */
            private C2355a f46438K;

            /* renamed from: L, reason: collision with root package name */
            private b f46439L;

            /* renamed from: com.harman.jbl.partylight.lib.dashboard.widget.LightShowPanelView$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0412a extends AnimatorListenerAdapter {
                C0412a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    C0411a c0411a = C0411a.this;
                    c0411a.W(c0411a.f46438K);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C0411a c0411a = C0411a.this;
                    c0411a.W(c0411a.f46438K);
                }
            }

            /* renamed from: com.harman.jbl.partylight.lib.dashboard.widget.LightShowPanelView$a$a$b */
            /* loaded from: classes2.dex */
            class b implements View.OnClickListener {
                b() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C0411a.this.f46439L != null && C0411a.this.f46438K != null) {
                        C0411a.this.f46439L.a(C0411a.this.p(), C0411a.this.f46438K);
                    }
                }
            }

            public C0411a(@N View view) {
                super(view);
                this.f46436I = (LottieAnimationView) view.findViewById(g.C0418g.f46859O0);
                this.f46437J = (TextView) view.findViewById(g.C0418g.f46862P0);
                this.f46436I.g(new C0412a());
                view.setOnClickListener(new b());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void W(C2355a c2355a) {
                if (c2355a == null) {
                    return;
                }
                this.f46436I.setImageResource(c2355a.l());
            }

            public void U(b bVar, C2355a c2355a) {
                this.f46439L = bVar;
                if (c2355a == null) {
                    return;
                }
                this.f46438K = c2355a;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColors(c2355a.i());
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BR_TL);
                if (c2355a.n()) {
                    this.f46437J.setTypeface(null, 1);
                    gradientDrawable.setStroke(a.f46432f * 2, C0669d.f(this.f17770a.getContext(), g.c.f46641s));
                    if (c2355a.k() != 0) {
                        this.f46436I.setImageDrawable(null);
                        this.f46436I.setAnimation(c2355a.k());
                        if (e.f46285a) {
                            this.f46436I.B();
                        }
                    } else {
                        W(c2355a);
                    }
                } else {
                    if (this.f46436I.x()) {
                        this.f46436I.m();
                    }
                    W(c2355a);
                    this.f46437J.setTypeface(null, 0);
                }
                gradientDrawable.setCornerRadius(a.f46433g);
                this.f17770a.setBackground(gradientDrawable);
                this.f46437J.setText(this.f17770a.getContext().getString(c2355a.m()));
            }

            public b V() {
                return this.f46439L;
            }

            public void X(b bVar) {
                this.f46439L = bVar;
            }
        }

        public a(int i4, int i5) {
            f46432f = i4;
            f46433g = i5;
        }

        public List<C2355a> Q() {
            return this.f46434d;
        }

        public b R() {
            return this.f46435e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public void C(@N C0411a c0411a, int i4) {
            c0411a.U(this.f46435e, this.f46434d.get(i4));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @N
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public C0411a E(@N ViewGroup viewGroup, int i4) {
            return new C0411a(LayoutInflater.from(viewGroup.getContext()).inflate(g.h.f47023w, viewGroup, false));
        }

        public void U(List<C2355a> list) {
            this.f46434d = list;
            r();
        }

        public void V(b bVar) {
            this.f46435e = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int l() {
            List<C2355a> list = this.f46434d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i4, C2355a c2355a);
    }

    public LightShowPanelView(@N Context context) {
        this(context, null);
    }

    private void W1(@N Context context) {
        q.a aVar = q.f37940a;
        a aVar2 = new a((int) aVar.a(context, 2.0f), (int) aVar.a(context, 20.0f));
        this.f46431Q1 = aVar2;
        setAdapter(aVar2);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        n(new com.harman.jbl.cd_biz_comm.widget.e(0, 0, context.getResources().getDimensionPixelOffset(g.d.f46738q)));
    }

    public void V1() {
        if (this.f46431Q1.l() > 0) {
            for (int i4 = 0; i4 < this.f46431Q1.l(); i4++) {
                C2355a c2355a = this.f46431Q1.Q().get(i4);
                if (c2355a.j() == LightInfo.Pattern.RANDOM && c2355a.n()) {
                    this.f46431Q1.s(i4);
                    return;
                }
            }
        }
    }

    public void X1() {
        if (this.f46431Q1.l() > 0) {
            int i4 = 0;
            while (true) {
                if (i4 < this.f46431Q1.l()) {
                    C2355a c2355a = this.f46431Q1.Q().get(i4);
                    if (c2355a != null && c2355a.n()) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                O1(i4);
            }
        }
    }

    public void Y1(@P List<C2355a> list) {
        this.f46431Q1.U(list);
    }

    public b getOnLightShowListener() {
        return this.f46431Q1.R();
    }

    public void setOnLightShowListener(b bVar) {
        this.f46431Q1.V(bVar);
    }

    public LightShowPanelView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LightShowPanelView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        W1(context);
    }
}
