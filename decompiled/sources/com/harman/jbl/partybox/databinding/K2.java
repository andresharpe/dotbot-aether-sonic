package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;

/* loaded from: classes2.dex */
public class K2 extends J2 implements a.InterfaceC0358a {

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38832t0 = null;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38833u0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38834q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38835r0;

    /* renamed from: s0, reason: collision with root package name */
    private long f38836s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38833u0 = sparseIntArray;
        sparseIntArray.put(j.h.P8, 4);
        sparseIntArray.put(j.h.O8, 5);
    }

    public K2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 6, f38832t0, f38833u0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastViewModel auracastViewModel = this.f38784p0;
        HmDevice hmDevice = this.f38783o0;
        if (auracastViewModel != null) {
            auracastViewModel.Q0(hmDevice);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (4 == i4) {
            x1((HmDevice) obj);
        } else if (2 == i4) {
            w1((AuracastViewModel) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f38836s0 != 0) {
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
            this.f38836s0 = 4L;
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
        String str;
        synchronized (this) {
            j4 = this.f38836s0;
            this.f38836s0 = 0L;
        }
        HmDevice hmDevice = this.f38783o0;
        long j5 = j4 & 5;
        boolean z3 = false;
        if (j5 != 0) {
            if (hmDevice != null) {
                z3 = true;
            }
            if (j5 != 0) {
                j4 = z3 ? j4 | 16 : j4 | 8;
            }
        }
        String str2 = null;
        if ((j4 & 16) != 0 && hmDevice != null) {
            str = hmDevice.p();
        } else {
            str = null;
        }
        long j6 = 5 & j4;
        if (j6 != 0) {
            if (z3) {
                str2 = str;
            } else {
                str2 = "";
            }
        }
        if (j6 != 0) {
            com.harman.jbl.partybox.ui.party.a.b(this.f38778j0, hmDevice);
            com.harman.jbl.partybox.ui.party.a.L(this.f38779k0, hmDevice);
            androidx.databinding.adapters.F.A(this.f38782n0, str2);
        }
        if ((j4 & 4) != 0) {
            this.f38834q0.setOnClickListener(this.f38835r0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.J2
    public void w1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f38784p0 = auracastViewModel;
        synchronized (this) {
            this.f38836s0 |= 2;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.J2
    public void x1(@androidx.annotation.P HmDevice hmDevice) {
        this.f38783o0 = hmDevice;
        synchronized (this) {
            this.f38836s0 |= 1;
        }
        g(4);
        super.B0();
    }

    private K2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[2], (ImageView) objArr[1], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[4], (HmCustomFontTextView) objArr[3]);
        this.f38836s0 = -1L;
        this.f38778j0.setTag(null);
        this.f38779k0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f38834q0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f38782n0.setTag(null);
        N0(view);
        this.f38835r0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
