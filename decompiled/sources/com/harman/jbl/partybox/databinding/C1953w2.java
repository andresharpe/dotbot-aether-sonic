package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1953w2 extends AbstractC1948v2 {

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40281r0 = null;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40282s0 = null;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40283p0;

    /* renamed from: q0, reason: collision with root package name */
    private long f40284q0;

    public C1953w2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 4, f40281r0, f40282s0));
    }

    private boolean A1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40284q0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (2 == i4) {
            x1((AuracastViewModel) obj);
        } else if (4 == i4) {
            z1((HmDevice) obj);
        } else if (3 == i4) {
            y1(((Integer) obj).intValue());
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f40284q0 != 0) {
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
            this.f40284q0 = 16L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return A1((androidx.lifecycle.P) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        androidx.lifecycle.P<HmDevice> p4;
        synchronized (this) {
            j4 = this.f40284q0;
            this.f40284q0 = 0L;
        }
        AuracastViewModel auracastViewModel = this.f40239o0;
        HmDevice hmDevice = this.f40237m0;
        int i4 = this.f40238n0;
        long j5 = 23 & j4;
        HmDevice hmDevice2 = null;
        if (j5 != 0) {
            if (auracastViewModel != null) {
                p4 = auracastViewModel.s0();
            } else {
                p4 = null;
            }
            j1(0, p4);
            if (p4 != null) {
                hmDevice2 = p4.f();
            }
        }
        long j6 = 24 & j4;
        if ((j4 & 20) != 0) {
            com.harman.jbl.partybox.ui.party.a.J(this.f40234j0, hmDevice);
            com.harman.jbl.partybox.ui.party.a.b(this.f40235k0, hmDevice);
        }
        if (j6 != 0) {
            com.harman.jbl.partybox.ui.party.a.z(this.f40236l0, i4);
        }
        if (j5 != 0) {
            com.harman.jbl.partybox.ui.party.a.h(this.f40283p0, hmDevice, hmDevice2);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1948v2
    public void x1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f40239o0 = auracastViewModel;
        synchronized (this) {
            this.f40284q0 |= 2;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1948v2
    public void y1(int i4) {
        this.f40238n0 = i4;
        synchronized (this) {
            this.f40284q0 |= 8;
        }
        g(3);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1948v2
    public void z1(@androidx.annotation.P HmDevice hmDevice) {
        this.f40237m0 = hmDevice;
        synchronized (this) {
            this.f40284q0 |= 4;
        }
        g(4);
        super.B0();
    }

    private C1953w2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (ImageView) objArr[2], (ImageView) objArr[3], (ImageView) objArr[1]);
        this.f40284q0 = -1L;
        this.f40234j0.setTag(null);
        this.f40235k0.setTag(null);
        this.f40236l0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f40283p0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        j0();
    }
}
