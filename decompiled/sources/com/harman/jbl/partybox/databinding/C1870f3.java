package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1870f3 extends AbstractC1865e3 implements a.InterfaceC0358a {

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39581t0 = null;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39582u0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39583q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39584r0;

    /* renamed from: s0, reason: collision with root package name */
    private long f39585s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39582u0 = sparseIntArray;
        sparseIntArray.put(j.h.Hh, 4);
        sparseIntArray.put(j.h.N8, 5);
    }

    public C1870f3(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 6, f39581t0, f39582u0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastFragment auracastFragment = this.f39526o0;
        if (auracastFragment != null) {
            auracastFragment.onCloseSelectDeviceTipClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            x1((AuracastFragment) obj);
        } else if (4 == i4) {
            w1((HmDevice) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39585s0 != 0) {
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
            this.f39585s0 = 4L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        synchronized (this) {
            j4 = this.f39585s0;
            this.f39585s0 = 0L;
        }
        HmDevice hmDevice = this.f39527p0;
        long j5 = 6 & j4;
        if ((j4 & 4) != 0) {
            this.f39521j0.setOnClickListener(this.f39584r0);
        }
        if (j5 != 0) {
            com.harman.jbl.partybox.ui.party.a.L(this.f39522k0, hmDevice);
            com.harman.jbl.partybox.ui.party.a.x(this.f39525n0, hmDevice);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1865e3
    public void w1(@androidx.annotation.P HmDevice hmDevice) {
        this.f39527p0 = hmDevice;
        synchronized (this) {
            this.f39585s0 |= 2;
        }
        g(4);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1865e3
    public void x1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f39526o0 = auracastFragment;
        synchronized (this) {
            this.f39585s0 |= 1;
        }
        g(7);
        super.B0();
    }

    private C1870f3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[1], (ImageView) objArr[2], (ConstraintLayout) objArr[5], (HmCustomFontTextView) objArr[4], (HmCustomFontTextView) objArr[3]);
        this.f39585s0 = -1L;
        this.f39521j0.setTag(null);
        this.f39522k0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39583q0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f39525n0.setTag(null);
        N0(view);
        this.f39584r0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
