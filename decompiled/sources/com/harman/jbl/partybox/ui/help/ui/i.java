package com.harman.jbl.partybox.ui.help.ui;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.E;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.databinding.C1904m2;
import com.harman.jbl.partybox.databinding.C1909n2;
import com.harman.jbl.partybox.databinding.C1914o2;
import com.harman.jbl.partybox.databinding.C1919p2;
import com.harman.jbl.partybox.databinding.C1924q2;
import com.harman.jbl.partybox.ui.main.o;
import java.util.List;
import kotlin.H0;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final LiveData<List<f>> f43835d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final LayoutInflater f43836e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final o f43837f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final E f43838g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final Resources f43839h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private final X2.l<f, H0> f43840i;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@l3.d LiveData<List<f>> liveLayoutBeans, @l3.d LayoutInflater inflater, @l3.d o mainViewModel, @l3.d E viewLifecycleOwner, @l3.d Resources resources, @l3.d X2.l<? super f, H0> onItemClick) {
        F.p(liveLayoutBeans, "liveLayoutBeans");
        F.p(inflater, "inflater");
        F.p(mainViewModel, "mainViewModel");
        F.p(viewLifecycleOwner, "viewLifecycleOwner");
        F.p(resources, "resources");
        F.p(onItemClick, "onItemClick");
        this.f43835d = liveLayoutBeans;
        this.f43836e = inflater;
        this.f43837f = mainViewModel;
        this.f43838g = viewLifecycleOwner;
        this.f43839h = resources;
        this.f43840i = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d a holder, int i4) {
        Object W22;
        F.p(holder, "holder");
        List<f> f4 = this.f43835d.f();
        if (f4 != null) {
            W22 = D.W2(f4, i4);
            f fVar = (f) W22;
            if (fVar == null) {
                return;
            }
            if (holder instanceof e) {
                ((e) holder).T(this.f43837f, this.f43838g, this.f43839h, fVar, this.f43840i);
                return;
            }
            if (holder instanceof c) {
                ((c) holder).S(fVar, this.f43840i);
            } else if (holder instanceof k) {
                ((k) holder).S(fVar, this.f43840i);
            } else if (holder instanceof g) {
                ((g) holder).R(this.f43839h);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public a E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        if (i4 == EnumGridLayoutType.GRANT_PERMISSION.ordinal()) {
            C1909n2 e4 = C1909n2.e(this.f43836e, parent, false);
            F.o(e4, "inflate(...)");
            return new e(e4);
        }
        if (i4 == EnumGridLayoutType.DEVICE.ordinal()) {
            C1904m2 e5 = C1904m2.e(this.f43836e, parent, false);
            F.o(e5, "inflate(...)");
            return new c(e5);
        }
        if (i4 == EnumGridLayoutType.ULTIMATE_DEVICE.ordinal()) {
            C1919p2 e6 = C1919p2.e(this.f43836e, parent, false);
            F.o(e6, "inflate(...)");
            return new k(e6);
        }
        if (i4 == EnumGridLayoutType.NOT_ON_THE_LIST.ordinal()) {
            C1914o2 e7 = C1914o2.e(this.f43836e, parent, false);
            F.o(e7, "inflate(...)");
            return new g(e7);
        }
        C1924q2 c4 = C1924q2.c(this.f43836e, parent, false);
        F.o(c4, "inflate(...)");
        return new l(c4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        List<f> f4 = this.f43835d.f();
        if (f4 == null) {
            return 0;
        }
        return f4.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int n(int i4) {
        Object W22;
        EnumGridLayoutType enumGridLayoutType;
        List<f> f4 = this.f43835d.f();
        if (f4 != null) {
            W22 = D.W2(f4, i4);
            f fVar = (f) W22;
            if (fVar == null || (enumGridLayoutType = fVar.f()) == null) {
                enumGridLayoutType = EnumGridLayoutType.UNKNOWN;
            }
            return enumGridLayoutType.ordinal();
        }
        return EnumGridLayoutType.UNKNOWN.ordinal();
    }
}
