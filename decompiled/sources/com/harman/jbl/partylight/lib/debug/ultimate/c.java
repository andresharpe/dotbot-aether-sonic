package com.harman.jbl.partylight.lib.debug.ultimate;

import X2.l;
import android.annotation.SuppressLint;
import android.bluetooth.le.ScanRecord;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.E;
import androidx.lifecycle.Q;
import androidx.recyclerview.widget.C0958d;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C1115z;
import com.harman.jbl.cd_biz_comm.utils.p;
import com.harman.jbl.partylight.lib.g;
import java.util.List;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.text.z;
import m2.C2365e;
import o.InterfaceMenuC2377a;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.Adapter<b> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final d f46549d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final C0958d<e> f46550e;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements l<List<? extends e>, H0> {
        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends e> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<e> list) {
            C0958d<e> P3 = c.this.P();
            if (list.isEmpty()) {
                list = null;
            }
            P3.f(list);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final C2365e f46552I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d View itemView) {
            super(itemView);
            F.p(itemView, "itemView");
            C2365e a4 = C2365e.a(itemView);
            F.o(a4, "bind(...)");
            this.f46552I = a4;
        }

        @l3.d
        public final C2365e R() {
            return this.f46552I;
        }
    }

    /* renamed from: com.harman.jbl.partylight.lib.debug.ultimate.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0416c implements Q, A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f46553a;

        C0416c(l function) {
            F.p(function, "function");
            this.f46553a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f46553a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof A)) {
                return F.g(a(), ((A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f46553a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public c(@l3.d d vm, @l3.d E lifeOwner) {
        F.p(vm, "vm");
        F.p(lifeOwner, "lifeOwner");
        this.f46549d = vm;
        this.f46550e = p.e(this, null, 1, null);
        vm.x().k(lifeOwner, new C0416c(new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(c this$0, e eVar, View view) {
        F.p(this$0, "this$0");
        F.m(eVar);
        this$0.U(eVar);
    }

    private final void U(e eVar) {
        this.f46549d.v(eVar);
    }

    @l3.d
    public final C0958d<e> P() {
        return this.f46550e;
    }

    @l3.d
    public final d Q() {
        return this.f46549d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b holder, int i4) {
        ColorStateList valueOf;
        byte[] bArr;
        String m22;
        F.p(holder, "holder");
        final e eVar = this.f46550e.b().get(i4);
        C2365e R3 = holder.R();
        R3.f55110I.setText(eVar.e().c());
        R3.f55111J.setText("rssi:  " + eVar.e().f().getRssi());
        R3.f55107F.setText("mac:  " + eVar.e().g());
        R3.f55108G.setText("bleAddress:  " + eVar.e().f().getDevice().getAddress());
        View view = R3.f55114M;
        if (eVar.f()) {
            valueOf = ColorStateList.valueOf(-16711936);
        } else {
            valueOf = ColorStateList.valueOf(InterfaceMenuC2377a.f55290c);
        }
        view.setBackgroundTintList(valueOf);
        R3.f55109H.setText("connectable:  " + eVar.e().h());
        TextView textView = R3.f55112K;
        ScanRecord scanRecord = eVar.e().f().getScanRecord();
        if (scanRecord != null) {
            bArr = scanRecord.getBytes();
        } else {
            bArr = null;
        }
        String l4 = C1115z.l(bArr);
        F.o(l4, "bytes2HexString(...)");
        m22 = z.m2(l4, "FF", "FF  ", false, 4, null);
        textView.setText("scanRecord:  " + m22);
        R3.d().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.debug.ultimate.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.S(c.this, eVar, view2);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(g.h.f47005e, parent, false);
        F.m(inflate);
        return new b(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f46550e.b().size();
    }
}
