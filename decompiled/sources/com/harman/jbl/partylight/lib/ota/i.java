package com.harman.jbl.partylight.lib.ota;

import X2.l;
import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.E;
import androidx.recyclerview.widget.C0958d;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.blankj.utilcode.util.C1114y;
import com.blankj.utilcode.util.x0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.harman.jbl.cd_biz_comm.utils.p;
import com.harman.jbl.cd_biz_comm.widget.DonutProgress;
import com.harman.jbl.partylight.lib.g;
import com.harman.jbl.partylight.lib.ota.BleOtaFragment;
import java.util.List;
import kotlin.H0;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import m2.z;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\nBleOtaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleOtaFragment.kt\ncom/harman/jbl/partylight/lib/ota/RvAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,308:1\n252#2:309\n*S KotlinDebug\n*F\n+ 1 BleOtaFragment.kt\ncom/harman/jbl/partylight/lib/ota/RvAdapter\n*L\n267#1:309\n*E\n"})
/* loaded from: classes2.dex */
public final class i extends RecyclerView.Adapter<b> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final e f47284d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final C0958d<com.harman.jbl.partylight.lib.ota.c> f47285e;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements l<List<? extends com.harman.jbl.partylight.lib.ota.c>, H0> {
        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends com.harman.jbl.partylight.lib.ota.c> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<com.harman.jbl.partylight.lib.ota.c> list) {
            i.this.V().f(list);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final z f47287I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d View view) {
            super(view);
            F.p(view, "view");
            z a4 = z.a(view);
            F.o(a4, "bind(...)");
            this.f47287I = a4;
        }

        @l3.d
        public final z R() {
            return this.f47287I;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47288a;

        static {
            int[] iArr = new int[BleUpdateStatus.values().length];
            try {
                iArr[BleUpdateStatus.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleUpdateStatus.ReadyUpdate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BleUpdateStatus.Updating.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BleUpdateStatus.Installing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BleUpdateStatus.LowPower.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BleUpdateStatus.Failed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f47288a = iArr;
        }
    }

    public i(@l3.d e viewModel, @l3.d E lo) {
        F.p(viewModel, "viewModel");
        F.p(lo, "lo");
        this.f47284d = viewModel;
        this.f47285e = p.e(this, null, 1, null);
        viewModel.F().k(lo, new BleOtaFragment.f(new a()));
    }

    private final void P(z zVar, int i4) {
        Object W22;
        com.harman.jbl.partylight.lib.ota.c cVar = this.f47285e.b().get(i4);
        List<com.harman.jbl.partylight.lib.ota.c> b4 = this.f47285e.b();
        F.o(b4, "getCurrentList(...)");
        W22 = D.W2(b4, i4 + 1);
        com.harman.jbl.partylight.lib.ota.c cVar2 = (com.harman.jbl.partylight.lib.ota.c) W22;
        if (cVar.n() == BleUpdateStatus.LowPower && (cVar2 == null || cVar2.n() == BleUpdateStatus.Success)) {
            TextView tvLowPowerWarning = zVar.f55268N;
            F.o(tvLowPowerWarning, "tvLowPowerWarning");
            p.k(tvLowPowerWarning);
            zVar.f55268N.setText(zVar.d().getContext().getString(g.l.f47087N, "30%"));
            return;
        }
        TextView tvLowPowerWarning2 = zVar.f55268N;
        F.o(tvLowPowerWarning2, "tvLowPowerWarning");
        p.f(tvLowPowerWarning2);
    }

    private final void Q(z zVar, com.harman.jbl.partylight.lib.ota.c cVar) {
        BleUpdateStatus n4 = cVar.n();
        int[] iArr = c.f47288a;
        int i4 = iArr[n4.ordinal()];
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            if (i4 != 5) {
                zVar.f55266L.setText(x0.d(g.l.f47080J0));
            } else {
                zVar.f55266L.setText(x0.d(g.l.f47085M));
            }
        } else {
            zVar.f55266L.setText(x0.d(g.l.f47088N0) + cVar.k().p());
        }
        int i5 = iArr[cVar.n().ordinal()];
        if (i5 != 1) {
            if (i5 != 5 && i5 != 6) {
                zVar.f55266L.setTextColor(C1114y.g(-1, 0.8f));
                return;
            } else {
                zVar.f55266L.setTextColor(-169913);
                return;
            }
        }
        zVar.f55266L.setTextColor(-7147074);
    }

    private final void R(z zVar, com.harman.jbl.partylight.lib.ota.c cVar) {
        zVar.f55269O.setText(cVar.i());
        if (cVar.n() == BleUpdateStatus.LowPower) {
            zVar.f55269O.setTextColor(-169913);
        } else {
            zVar.f55269O.setTextColor(C1114y.a(R.color.white));
        }
    }

    private final void S(z zVar, int i4) {
        Object W22;
        BleUpdateStatus bleUpdateStatus;
        com.harman.jbl.partylight.lib.ota.c cVar = this.f47285e.b().get(i4);
        List<com.harman.jbl.partylight.lib.ota.c> b4 = this.f47285e.b();
        F.o(b4, "getCurrentList(...)");
        W22 = D.W2(b4, i4 - 1);
        com.harman.jbl.partylight.lib.ota.c cVar2 = (com.harman.jbl.partylight.lib.ota.c) W22;
        if (i4 == 0) {
            TextView tvGroup = zVar.f55267M;
            F.o(tvGroup, "tvGroup");
            p.k(tvGroup);
            if (cVar.n() != BleUpdateStatus.Success) {
                zVar.f55267M.setText(x0.e(g.l.f47076H0, cVar.l()));
                return;
            } else {
                zVar.f55267M.setText(x0.d(g.l.f47084L0));
                return;
            }
        }
        BleUpdateStatus n4 = cVar.n();
        BleUpdateStatus bleUpdateStatus2 = BleUpdateStatus.Success;
        if (n4 == bleUpdateStatus2) {
            if (cVar2 != null) {
                bleUpdateStatus = cVar2.n();
            } else {
                bleUpdateStatus = null;
            }
            if (bleUpdateStatus != bleUpdateStatus2) {
                TextView tvGroup2 = zVar.f55267M;
                F.o(tvGroup2, "tvGroup");
                p.k(tvGroup2);
                zVar.f55267M.setText(x0.d(g.l.f47084L0));
                return;
            }
        }
        TextView tvGroup3 = zVar.f55267M;
        F.o(tvGroup3, "tvGroup");
        p.f(tvGroup3);
    }

    private final void T(z zVar, final com.harman.jbl.partylight.lib.ota.c cVar) {
        DonutProgress donutProgress = zVar.f55265K;
        if (cVar.n() == BleUpdateStatus.Updating) {
            F.m(donutProgress);
            p.k(donutProgress);
            donutProgress.setProgress(cVar.m());
        } else {
            F.m(donutProgress);
            p.g(donutProgress);
        }
        CircularProgressIndicator circularProgressIndicator = zVar.f55262H;
        if (cVar.n() == BleUpdateStatus.Installing) {
            F.m(circularProgressIndicator);
            p.k(circularProgressIndicator);
        } else {
            F.m(circularProgressIndicator);
            p.g(circularProgressIndicator);
        }
        LottieAnimationView lottieAnimationView = zVar.f55264J;
        if (cVar.n() == BleUpdateStatus.ReadyUpdate && this.f47284d.I().f() == ProcessStatus.Processing) {
            F.m(lottieAnimationView);
            if (lottieAnimationView.getVisibility() != 0) {
                p.k(lottieAnimationView);
                lottieAnimationView.setAnimation(g.k.f47059f);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.B();
            }
        } else {
            F.m(lottieAnimationView);
            p.g(lottieAnimationView);
        }
        if (cVar.n() == BleUpdateStatus.Failed) {
            TextView tvRightBtn = zVar.f55270P;
            F.o(tvRightBtn, "tvRightBtn");
            p.k(tvRightBtn);
            zVar.f55270P.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.ota.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.U(i.this, cVar, view);
                }
            });
            return;
        }
        TextView tvRightBtn2 = zVar.f55270P;
        F.o(tvRightBtn2, "tvRightBtn");
        p.f(tvRightBtn2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(i this$0, com.harman.jbl.partylight.lib.ota.c item, View view) {
        F.p(this$0, "this$0");
        F.p(item, "$item");
        this$0.Z(item);
    }

    private final void Z(com.harman.jbl.partylight.lib.ota.c cVar) {
        this.f47284d.M(cVar);
    }

    @l3.d
    public final C0958d<com.harman.jbl.partylight.lib.ota.c> V() {
        return this.f47285e;
    }

    @l3.d
    public final e W() {
        return this.f47284d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b holder, int i4) {
        F.p(holder, "holder");
        com.harman.jbl.partylight.lib.ota.c cVar = this.f47285e.b().get(i4);
        z R3 = holder.R();
        S(R3, i4);
        R3.f55263I.setImageResource(cVar.j());
        F.m(cVar);
        R(R3, cVar);
        Q(R3, cVar);
        T(R3, cVar);
        P(R3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(g.h.f47026z, parent, false);
        F.o(inflate, "inflate(...)");
        return new b(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f47285e.b().size();
    }
}
