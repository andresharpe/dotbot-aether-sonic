package com.harman.jbl.partylight.lib.productinfo;

import W2.n;
import X2.l;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.navigation.C0943u;
import androidx.navigation.I;
import com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment;
import com.harman.jbl.cd_biz_comm.widget.MatchWidthCardView;
import com.harman.jbl.cd_biz_comm.widget.MenuItemView;
import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.g;
import com.harman.jbl.partylight.lib.productinfo.h;
import h2.C2063b;
import i2.C2069a;
import kotlin.E;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;
import m2.p;

@E(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/harman/jbl/partylight/lib/productinfo/ProductInformationFragment;", "Lcom/harman/jbl/cd_biz_comm/base/BackDispatcherFragment;", "Lm2/p;", "Lkotlin/H0;", "q0", "()V", "v0", "createBinding", "()Lm2/p;", "initView", "<init>", "Companion", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ProductInformationFragment extends BackDispatcherFragment<p> {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "ProductInformationFragment";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final ProductInformationFragment a() {
            return new ProductInformationFragment();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.productinfo.ProductInformationFragment$buildMwcvSerialNumber$1", f = "ProductInformationFragment.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47519I;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            String str;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47519I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partylight.lib.core.b bVar = com.harman.jbl.partylight.lib.core.b.f46256F;
                if (bVar.o()) {
                    MatchWidthCardView mwcvSerialNumber = ProductInformationFragment.access$getBinding(ProductInformationFragment.this).f55208I;
                    F.o(mwcvSerialNumber, "mwcvSerialNumber");
                    com.harman.jbl.cd_biz_comm.utils.p.k(mwcvSerialNumber);
                    com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                    PartyLightDevice j4 = bVar.j();
                    C2069a c2069a = new C2069a();
                    this.f47519I = 1;
                    obj = cVar.y(j4, c2069a, this);
                    if (obj == l4) {
                        return l4;
                    }
                } else {
                    MatchWidthCardView mwcvSerialNumber2 = ProductInformationFragment.access$getBinding(ProductInformationFragment.this).f55208I;
                    F.o(mwcvSerialNumber2, "mwcvSerialNumber");
                    com.harman.jbl.cd_biz_comm.utils.p.f(mwcvSerialNumber2);
                    return H0.f51801a;
                }
            }
            C2063b c2063b = (C2063b) ((WriteResp) obj).k();
            TextView desc = ProductInformationFragment.access$getBinding(ProductInformationFragment.this).f55208I.getDesc();
            if (c2063b == null || (str = c2063b.k()) == null) {
                str = "";
            }
            desc.setText(str);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(cVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<View, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p f47521F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ ProductInformationFragment f47522G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p pVar, ProductInformationFragment productInformationFragment) {
            super(1);
            this.f47521F = pVar;
            this.f47522G = productInformationFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(View view) {
            c(view);
            return H0.f51801a;
        }

        public final void c(@l3.d View it) {
            F.p(it, "it");
            AppCompatTextView headerText = this.f47521F.f55207H.f55033I;
            F.o(headerText, "headerText");
            com.harman.jbl.cd_biz_comm.utils.p.b(headerText, null);
            Group gUsage = this.f47521F.f55206G;
            F.o(gUsage, "gUsage");
            com.harman.jbl.cd_biz_comm.utils.p.k(gUsage);
            this.f47522G.v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.productinfo.ProductInformationFragment$launchRequestUsageJob$1", f = "ProductInformationFragment.kt", i = {0, 1}, l = {80, 90}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47523I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f47524J;

        d(kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b5 -> B:6:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.f47523I
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r9.f47524J
                kotlinx.coroutines.U r1 = (kotlinx.coroutines.U) r1
                kotlin.W.n(r10)
            L15:
                r10 = r1
                goto L2e
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                java.lang.Object r1 = r9.f47524J
                kotlinx.coroutines.U r1 = (kotlinx.coroutines.U) r1
                kotlin.W.n(r10)
                goto L4f
            L27:
                kotlin.W.n(r10)
                java.lang.Object r10 = r9.f47524J
                kotlinx.coroutines.U r10 = (kotlinx.coroutines.U) r10
            L2e:
                boolean r1 = kotlinx.coroutines.V.k(r10)
                if (r1 == 0) goto Lb8
                com.harman.jbl.cd_biz_comm.wireless_tech.c r1 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G
                com.harman.jbl.partylight.lib.core.b r4 = com.harman.jbl.partylight.lib.core.b.f46256F
                com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r4 = r4.j()
                com.harman.jbl.partylight.lib.productinfo.command.c r5 = new com.harman.jbl.partylight.lib.productinfo.command.c
                r5.<init>()
                r9.f47524J = r10
                r9.f47523I = r3
                java.lang.Object r1 = r1.y(r4, r5, r9)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r8 = r1
                r1 = r10
                r10 = r8
            L4f:
                com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp r10 = (com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp) r10
                java.lang.Object r10 = r10.k()
                com.harman.jbl.partylight.lib.productinfo.command.b r10 = (com.harman.jbl.partylight.lib.productinfo.command.b) r10
                if (r10 == 0) goto Laa
                int r10 = r10.d()
                java.lang.Integer r10 = kotlin.coroutines.jvm.internal.a.f(r10)
                com.harman.jbl.partylight.lib.productinfo.ProductInformationFragment r4 = com.harman.jbl.partylight.lib.productinfo.ProductInformationFragment.this
                int r10 = r10.intValue()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                int r6 = r10 / 60
                java.lang.String r7 = " "
                if (r6 <= 0) goto L88
                java.lang.String r6 = java.lang.String.valueOf(r6)
                r5.append(r6)
                r5.append(r7)
                int r6 = com.harman.jbl.partylight.lib.g.l.f47063B
                java.lang.String r6 = r4.getString(r6)
                r5.append(r6)
                r5.append(r7)
            L88:
                int r10 = r10 % 60
                java.lang.String r10 = java.lang.String.valueOf(r10)
                r5.append(r10)
                r5.append(r7)
                int r10 = com.harman.jbl.partylight.lib.g.l.f47089O
                java.lang.String r10 = r4.getString(r10)
                r5.append(r10)
                m2.p r10 = com.harman.jbl.partylight.lib.productinfo.ProductInformationFragment.access$getBinding(r4)
                com.harman.jbl.cd_biz_comm.widget.MatchWidthCardView r10 = r10.f55209J
                android.widget.TextView r10 = r10.getDesc()
                r10.setText(r5)
            Laa:
                r9.f47524J = r1
                r9.f47523I = r2
                r4 = 60000(0xea60, double:2.9644E-319)
                java.lang.Object r10 = kotlinx.coroutines.C2269d0.b(r4, r9)
                if (r10 != r0) goto L15
                return r0
            Lb8:
                kotlin.H0 r10 = kotlin.H0.f51801a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.productinfo.ProductInformationFragment.d.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            d dVar = new d(cVar);
            dVar.f47524J = obj;
            return dVar;
        }
    }

    public static final /* synthetic */ p access$getBinding(ProductInformationFragment productInformationFragment) {
        return productInformationFragment.l0();
    }

    @n
    @l3.d
    public static final ProductInformationFragment newInstance() {
        return Companion.a();
    }

    private final void q0() {
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(ProductInformationFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(ProductInformationFragment this$0, View view) {
        F.p(this$0, "this$0");
        I a4 = h.a();
        F.o(a4, "actionToBleOtaFragement(...)");
        com.harman.jbl.cd_biz_comm.utils.p.h(this$0, a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(ProductInformationFragment this$0, View view) {
        F.p(this$0, "this$0");
        HowToFactoryDialogFragment.Companion.a().show(this$0.getChildFragmentManager(), HowToFactoryDialogFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(ProductInformationFragment this$0, View view) {
        F.p(this$0, "this$0");
        C0943u a4 = androidx.navigation.fragment.f.a(this$0);
        h.a c4 = h.c(j2.d.f51050a.b(com.harman.jbl.partylight.lib.core.b.f46256F.j().d()).g(), this$0.getString(g.l.f47153z0));
        F.o(c4, "toWebviewFragment(...)");
        a4.h0(c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new d(null), 3, null);
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void initView() {
        p l02 = l0();
        l02.f55207H.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.productinfo.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductInformationFragment.r0(ProductInformationFragment.this, view);
            }
        });
        l02.f55207H.f55033I.setText(getString(g.l.f47109d0));
        l02.f55210K.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.productinfo.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductInformationFragment.s0(ProductInformationFragment.this, view);
            }
        });
        l02.f55205F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.productinfo.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductInformationFragment.t0(ProductInformationFragment.this, view);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            l02.f55210K.setMenuIndicator(arguments.getBoolean("hasNew"));
        }
        com.harman.jbl.partylight.lib.core.b bVar = com.harman.jbl.partylight.lib.core.b.f46256F;
        if (bVar.o()) {
            AppCompatTextView headerText = l02.f55207H.f55033I;
            F.o(headerText, "headerText");
            com.harman.jbl.cd_biz_comm.utils.p.b(headerText, new c(l02, this));
        }
        if (bVar.j().t()) {
            MenuItemView productSupport = l02.f55211L;
            F.o(productSupport, "productSupport");
            com.harman.jbl.cd_biz_comm.utils.p.f(productSupport);
        } else {
            MenuItemView productSupport2 = l02.f55211L;
            F.o(productSupport2, "productSupport");
            com.harman.jbl.cd_biz_comm.utils.p.f(productSupport2);
        }
        l02.f55212M.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.productinfo.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductInformationFragment.u0(ProductInformationFragment.this, view);
            }
        });
        q0();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    @l3.d
    public p createBinding() {
        p c4 = p.c(getLayoutInflater());
        F.o(c4, "inflate(...)");
        return c4;
    }
}
