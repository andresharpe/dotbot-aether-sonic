package com.harman.jbl.partylight.lib.debug.productlist;

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
    private final d f46508d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final C0958d<f> f46509e;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements l<List<f>, H0> {
        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<f> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<f> list) {
            C0958d<f> P3 = c.this.P();
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
        private final C2365e f46511I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d View itemView) {
            super(itemView);
            F.p(itemView, "itemView");
            C2365e a4 = C2365e.a(itemView);
            F.o(a4, "bind(...)");
            this.f46511I = a4;
        }

        @l3.d
        public final C2365e R() {
            return this.f46511I;
        }
    }

    /* renamed from: com.harman.jbl.partylight.lib.debug.productlist.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0414c implements Q, A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f46512a;

        C0414c(l function) {
            F.p(function, "function");
            this.f46512a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f46512a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof A)) {
                return F.g(a(), ((A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f46512a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public c(@l3.d d vm, @l3.d E lifeOwner) {
        F.p(vm, "vm");
        F.p(lifeOwner, "lifeOwner");
        this.f46508d = vm;
        this.f46509e = p.e(this, null, 1, null);
        vm.z().k(lifeOwner, new C0414c(new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(c this$0, f fVar, View view) {
        F.p(this$0, "this$0");
        F.m(fVar);
        this$0.U(fVar);
    }

    private final void U(f fVar) {
        this.f46508d.x(fVar);
    }

    @l3.d
    public final C0958d<f> P() {
        return this.f46509e;
    }

    @l3.d
    public final d Q() {
        return this.f46508d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b holder, int i4) {
        ColorStateList valueOf;
        byte[] bArr;
        String m22;
        F.p(holder, "holder");
        final f fVar = this.f46509e.b().get(i4);
        C2365e R3 = holder.R();
        R3.f55110I.setText(fVar.e().c());
        R3.f55111J.setText("rssi:  " + fVar.e().f().getRssi());
        R3.f55107F.setText("mac:  " + fVar.e().g());
        R3.f55108G.setText("bleAddress:  " + fVar.e().f().getDevice().getAddress());
        View view = R3.f55114M;
        if (fVar.f()) {
            valueOf = ColorStateList.valueOf(-16711936);
        } else {
            valueOf = ColorStateList.valueOf(InterfaceMenuC2377a.f55290c);
        }
        view.setBackgroundTintList(valueOf);
        R3.f55113L.setText("version:  " + fVar.e().p());
        R3.f55109H.setText("connectable:  " + fVar.e().h());
        TextView textView = R3.f55112K;
        ScanRecord scanRecord = fVar.e().f().getScanRecord();
        if (scanRecord != null) {
            bArr = scanRecord.getBytes();
        } else {
            bArr = null;
        }
        String l4 = C1115z.l(bArr);
        F.o(l4, "bytes2HexString(...)");
        m22 = z.m2(l4, "FF", "FF  ", false, 4, null);
        textView.setText("scanRecord:  " + m22);
        R3.d().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.debug.productlist.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.S(c.this, fVar, view2);
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
        return this.f46509e.b().size();
    }
}
