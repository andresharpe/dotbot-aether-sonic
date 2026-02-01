package com.harman.jbl.partybox.ui.help.ui;

import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.E;
import androidx.lifecycle.Q;
import com.harman.jbl.partybox.databinding.C1909n2;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class e extends com.harman.jbl.partybox.ui.help.ui.a {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final C1909n2 f43823I;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.l<Boolean, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Resources f43825G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Resources resources) {
            super(1);
            this.f43825G = resources;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            e.this.f43823I.f39906I.setText(this.f43825G.getText(j.m.f41650H0));
            e.this.f43823I.f39905H.setText(this.f43825G.getText(j.m.f41646G0));
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.l<Boolean, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Resources f43827G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Resources resources) {
            super(1);
            this.f43827G = resources;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            e.this.f43823I.f39906I.setText(this.f43827G.getText(j.m.f41814r3));
            e.this.f43823I.f39905H.setText(this.f43827G.getText(j.m.Q9));
        }
    }

    /* loaded from: classes2.dex */
    static final class c implements Q, A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f43828a;

        c(X2.l function) {
            F.p(function, "function");
            this.f43828a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43828a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof A)) {
                return F.g(a(), ((A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43828a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(@l3.d com.harman.jbl.partybox.databinding.C1909n2 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.F.p(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.d()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.F.o(r0, r1)
            r2.<init>(r0)
            r2.f43823I = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.help.ui.e.<init>(com.harman.jbl.partybox.databinding.n2):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(X2.l onItemClick, f fVar, View view) {
        F.p(onItemClick, "$onItemClick");
        onItemClick.C(fVar);
    }

    public final void T(@l3.d o mainViewModel, @l3.d E viewLifecycleOwner, @l3.d Resources resources, @l3.e final f fVar, @l3.d final X2.l<? super f, H0> onItemClick) {
        F.p(mainViewModel, "mainViewModel");
        F.p(viewLifecycleOwner, "viewLifecycleOwner");
        F.p(resources, "resources");
        F.p(onItemClick, "onItemClick");
        mainViewModel.t1().k(viewLifecycleOwner, new c(new a(resources)));
        mainViewModel.u1().k(viewLifecycleOwner, new c(new b(resources)));
        this.f43823I.f39905H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.U(X2.l.this, fVar, view);
            }
        });
    }
}
