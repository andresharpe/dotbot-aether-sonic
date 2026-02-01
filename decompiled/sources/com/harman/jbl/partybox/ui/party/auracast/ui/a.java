package com.harman.jbl.partybox.ui.party.auracast.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.I;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public abstract class a<BINDING extends ViewDataBinding> extends RecyclerView.Adapter<b<BINDING>> {

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private List<? extends HmDevice> f44869d;

    /* renamed from: com.harman.jbl.partybox.ui.party.auracast.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0393a extends C0964j.b {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final List<HmDevice> f44870a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final List<HmDevice> f44871b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0393a(@l3.d List<? extends HmDevice> oldList, @l3.d List<? extends HmDevice> newList) {
            F.p(oldList, "oldList");
            F.p(newList, "newList");
            this.f44870a = oldList;
            this.f44871b = newList;
        }

        @Override // androidx.recyclerview.widget.C0964j.b
        public boolean a(int i4, int i5) {
            Object W22;
            Object W23;
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            W22 = D.W2(this.f44870a, i4);
            W23 = D.W2(this.f44871b, i5);
            return bVar.n((HmDevice) W22, (HmDevice) W23);
        }

        @Override // androidx.recyclerview.widget.C0964j.b
        public boolean b(int i4, int i5) {
            Object W22;
            Object W23;
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            W22 = D.W2(this.f44870a, i4);
            W23 = D.W2(this.f44871b, i5);
            return bVar.o((HmDevice) W22, (HmDevice) W23);
        }

        @Override // androidx.recyclerview.widget.C0964j.b
        public int d() {
            return this.f44871b.size();
        }

        @Override // androidx.recyclerview.widget.C0964j.b
        public int e() {
            return this.f44870a.size();
        }
    }

    public a(@l3.e List<? extends HmDevice> list) {
        this.f44869d = list;
    }

    public abstract void O(@l3.d BINDING binding, int i4);

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final List<HmDevice> P() {
        return this.f44869d;
    }

    @I
    public abstract int Q();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b<BINDING> holder, int i4) {
        F.p(holder, "holder");
        O(holder.R(), i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b<BINDING> E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        ViewDataBinding j4 = m.j(LayoutInflater.from(parent.getContext()), Q(), parent, false);
        F.m(j4);
        return new b<>(j4);
    }

    protected final void T(@l3.e List<? extends HmDevice> list) {
        this.f44869d = list;
    }

    public final void U(@l3.d List<? extends HmDevice> list) {
        F.p(list, "list");
        List<? extends HmDevice> list2 = this.f44869d;
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.H();
        }
        C0964j.e b4 = C0964j.b(new C0393a(list2, list));
        F.o(b4, "calculateDiff(...)");
        this.f44869d = list;
        b4.e(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        List<? extends HmDevice> list = this.f44869d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
