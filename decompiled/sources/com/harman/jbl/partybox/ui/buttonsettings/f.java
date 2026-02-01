package com.harman.jbl.partybox.ui.buttonsettings;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.harman.jbl.partybox.databinding.A1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.buttonsettings.f;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class f extends t<V1.a, b> {

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final a f42257f = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.harman.jbl.partybox.ui.buttonsettings.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0365a extends C0964j.f<V1.a> {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            public static final C0365a f42258a = new C0365a();

            private C0365a() {
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean a(@l3.d V1.a oldItem, @l3.d V1.a newItem) {
                F.p(oldItem, "oldItem");
                F.p(newItem, "newItem");
                return F.g(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.C0964j.f
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public boolean b(@l3.d V1.a oldItem, @l3.d V1.a newItem) {
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
    public final class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final Context f42259I;

        /* renamed from: J, reason: collision with root package name */
        @l3.d
        private final A1 f42260J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ f f42261K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d f fVar, @l3.d Context context, A1 binding) {
            super(binding.d());
            F.p(context, "context");
            F.p(binding, "binding");
            this.f42261K = fVar;
            this.f42259I = context;
            this.f42260J = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean T(V1.a djButton, View view, MotionEvent motionEvent) {
            F.p(djButton, "$djButton");
            if (motionEvent.getAction() != 0) {
                return false;
            }
            C0823k0.C2(view, null, new View.DragShadowBuilder(view), djButton.f(), 0);
            return true;
        }

        public final void S(@l3.d final V1.a djButton) {
            F.p(djButton, "djButton");
            this.f42260J.f38455F.setImageDrawable(C0669d.i(this.f42259I, djButton.f().h()));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C0669d.f(this.f42259I, j.d.f40771o));
            gradientDrawable.setShape(1);
            gradientDrawable.setGradientType(0);
            this.f42260J.f38455F.setBackground(gradientDrawable);
            this.f42260J.f38456G.setText(djButton.f().i());
            if (djButton.h()) {
                this.f42260J.f38456G.setAlpha(0.3f);
                this.f42260J.f38455F.setAlpha(0.3f);
                this.f42260J.f38455F.setEnabled(false);
            } else {
                this.f42260J.f38456G.setAlpha(1.0f);
                this.f42260J.f38455F.setAlpha(1.0f);
                this.f42260J.f38455F.setEnabled(true);
                this.f42260J.f38455F.setOnTouchListener(new View.OnTouchListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.g
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean T3;
                        T3 = f.b.T(V1.a.this, view, motionEvent);
                        return T3;
                    }
                });
            }
        }
    }

    public f() {
        super(a.C0365a.f42258a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b djButtonViewHolder, int i4) {
        F.p(djButtonViewHolder, "djButtonViewHolder");
        V1.a P3 = P(i4);
        F.m(P3);
        djButtonViewHolder.S(P3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public b E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        Context context = parent.getContext();
        F.o(context, "getContext(...)");
        A1 e4 = A1.e(LayoutInflater.from(parent.getContext()), parent, false);
        F.o(e4, "inflate(...)");
        return new b(this, context, e4);
    }
}
