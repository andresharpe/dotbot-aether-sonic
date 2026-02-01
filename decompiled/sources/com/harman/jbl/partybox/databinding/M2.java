package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;
import java.util.List;

/* loaded from: classes2.dex */
public class M2 extends L2 implements a.InterfaceC0358a {

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38883t0 = null;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38884u0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38885q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38886r0;

    /* renamed from: s0, reason: collision with root package name */
    private long f38887s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38884u0 = sparseIntArray;
        sparseIntArray.put(j.h.K9, 3);
        sparseIntArray.put(j.h.gi, 4);
    }

    public M2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 5, f38883t0, f38884u0));
    }

    private boolean A1(androidx.lifecycle.N<List<HmDevice>> n4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38887s0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastFragment auracastFragment = this.f38866p0;
        if (auracastFragment != null) {
            auracastFragment.onPartyMoreDevicesCloseClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            z1((AuracastFragment) obj);
            return true;
        }
        if (1 == i4) {
            x1((com.harman.jbl.partybox.ui.party.auracast.ui.c) obj);
            return true;
        }
        if (2 == i4) {
            y1((AuracastViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f38887s0 != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void j0() {
        synchronized (this) {
            this.f38887s0 = 16L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return A1((androidx.lifecycle.N) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        androidx.lifecycle.N<List<HmDevice>> n4;
        synchronized (this) {
            j4 = this.f38887s0;
            this.f38887s0 = 0L;
        }
        com.harman.jbl.partybox.ui.party.auracast.ui.c cVar = this.f38864n0;
        AuracastViewModel auracastViewModel = this.f38865o0;
        long j5 = 20 & j4;
        long j6 = 25 & j4;
        List<HmDevice> list = null;
        if (j6 != 0) {
            if (auracastViewModel != null) {
                n4 = auracastViewModel.n0();
            } else {
                n4 = null;
            }
            j1(0, n4);
            if (n4 != null) {
                list = n4.f();
            }
        }
        if ((j4 & 16) != 0) {
            this.f38860j0.setOnClickListener(this.f38886r0);
        }
        if (j5 != 0) {
            com.harman.jbl.partybox.ui.party.a.v(this.f38862l0, cVar);
        }
        if (j6 != 0) {
            com.harman.jbl.partybox.ui.party.a.F(this.f38862l0, list);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.L2
    public void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.c cVar) {
        this.f38864n0 = cVar;
        synchronized (this) {
            this.f38887s0 |= 4;
        }
        g(1);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.L2
    public void y1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f38865o0 = auracastViewModel;
        synchronized (this) {
            this.f38887s0 |= 8;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.L2
    public void z1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f38866p0 = auracastFragment;
        synchronized (this) {
            this.f38887s0 |= 2;
        }
        g(7);
        super.B0();
    }

    private M2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (ImageView) objArr[1], (ConstraintLayout) objArr[3], (RecyclerView) objArr[2], (HmCustomFontTextView) objArr[4]);
        this.f38887s0 = -1L;
        this.f38860j0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f38885q0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f38862l0.setTag(null);
        N0(view);
        this.f38886r0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
