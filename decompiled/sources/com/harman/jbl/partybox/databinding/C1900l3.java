package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1900l3 extends AbstractC1895k3 implements a.InterfaceC0358a {

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39825y0 = null;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39826z0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39827t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39828u0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39829v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39830w0;

    /* renamed from: x0, reason: collision with root package name */
    private long f39831x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39826z0 = sparseIntArray;
        sparseIntArray.put(j.h.N8, 7);
    }

    public C1900l3(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 8, f39825y0, f39826z0));
    }

    private boolean A1(LiveData<com.harman.jbl.partybox.ui.party.mode.c> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39831x0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastFragment auracastFragment;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 && (auracastFragment = this.f39780q0) != null) {
                    auracastFragment.onCloseSelectDeviceTipClick();
                    return;
                }
                return;
            }
            AuracastFragment auracastFragment2 = this.f39780q0;
            HmDevice hmDevice = this.f39782s0;
            if (auracastFragment2 != null) {
                auracastFragment2.onStartNewPartyConfirmClick(hmDevice);
                return;
            }
            return;
        }
        AuracastFragment auracastFragment3 = this.f39780q0;
        if (auracastFragment3 != null) {
            auracastFragment3.onCloseSelectDeviceTipClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            y1((AuracastFragment) obj);
        } else if (4 == i4) {
            x1((HmDevice) obj);
        } else if (11 == i4) {
            z1((AuracastViewModel) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39831x0 != 0) {
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
            this.f39831x0 = 16L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return A1((LiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        LiveData<com.harman.jbl.partybox.ui.party.mode.c> liveData;
        synchronized (this) {
            j4 = this.f39831x0;
            this.f39831x0 = 0L;
        }
        HmDevice hmDevice = this.f39782s0;
        AuracastViewModel auracastViewModel = this.f39781r0;
        long j5 = 20 & j4;
        long j6 = 25 & j4;
        com.harman.jbl.partybox.ui.party.mode.c cVar = null;
        if (j6 != 0) {
            if (auracastViewModel != null) {
                liveData = auracastViewModel.o0();
            } else {
                liveData = null;
            }
            j1(0, liveData);
            if (liveData != null) {
                cVar = liveData.f();
            }
        }
        if ((j4 & 16) != 0) {
            this.f39773j0.setOnClickListener(this.f39829v0);
            this.f39774k0.setOnClickListener(this.f39828u0);
            this.f39775l0.setOnClickListener(this.f39830w0);
        }
        if (j5 != 0) {
            com.harman.jbl.partybox.ui.party.a.L(this.f39776m0, hmDevice);
            com.harman.jbl.partybox.ui.party.a.x(this.f39779p0, hmDevice);
        }
        if (j6 != 0) {
            com.harman.jbl.partybox.ui.party.a.j(this.f39778o0, cVar);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1895k3
    public void x1(@androidx.annotation.P HmDevice hmDevice) {
        this.f39782s0 = hmDevice;
        synchronized (this) {
            this.f39831x0 |= 4;
        }
        g(4);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1895k3
    public void y1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f39780q0 = auracastFragment;
        synchronized (this) {
            this.f39831x0 |= 2;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1895k3
    public void z1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f39781r0 = auracastViewModel;
        synchronized (this) {
            this.f39831x0 |= 8;
        }
        g(11);
        super.B0();
    }

    private C1900l3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (HmCustomFontTextView) objArr[6], (HmCustomFontTextView) objArr[5], (ImageView) objArr[1], (ImageView) objArr[3], (ConstraintLayout) objArr[7], (HmCustomFontTextView) objArr[2], (HmCustomFontTextView) objArr[4]);
        this.f39831x0 = -1L;
        this.f39773j0.setTag(null);
        this.f39774k0.setTag(null);
        this.f39775l0.setTag(null);
        this.f39776m0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39827t0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f39778o0.setTag(null);
        this.f39779p0.setTag(null);
        N0(view);
        this.f39828u0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        this.f39829v0 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        this.f39830w0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
