package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.jbl.partybox.ui.widget.BatteryView;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1864e2 extends AbstractC1859d2 implements a.InterfaceC0358a {

    /* renamed from: A0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39515A0 = null;

    /* renamed from: B0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39516B0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39517w0;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39518x0;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39519y0;

    /* renamed from: z0, reason: collision with root package name */
    private long f39520z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39516B0 = sparseIntArray;
        sparseIntArray.put(j.h.P8, 10);
        sparseIntArray.put(j.h.O8, 11);
    }

    public C1864e2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 12, f39515A0, f39516B0));
    }

    private boolean A1(ObservableArrayList<HmDevice> observableArrayList, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39520z0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean B1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39520z0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean y1(ObservableArrayList<HmDevice> observableArrayList, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39520z0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean z1(LiveData<com.harman.jbl.partybox.ui.party.mode.c> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39520z0 |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        androidx.lifecycle.P<HmDevice> s02;
        if (i4 != 1) {
            if (i4 == 2) {
                AuracastFragment auracastFragment = this.f39482v0;
                AuracastViewModel auracastViewModel = this.f39481u0;
                if (auracastFragment != null && auracastViewModel != null && (s02 = auracastViewModel.s0()) != null) {
                    auracastFragment.onBtnQuitPartyClick(s02.f());
                    return;
                }
                return;
            }
            return;
        }
        AuracastFragment auracastFragment2 = this.f39482v0;
        if (auracastFragment2 != null) {
            auracastFragment2.onDeviceCardBtnNarrowClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            x1((AuracastFragment) obj);
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
                if (this.f39520z0 != 0) {
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
            this.f39520z0 = 64L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    return y1((ObservableArrayList) obj, i5);
                }
                return B1((androidx.lifecycle.P) obj, i5);
            }
            return z1((LiveData) obj, i5);
        }
        return A1((ObservableArrayList) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        ObservableArrayList<HmDevice> observableArrayList;
        ObservableArrayList<HmDevice> observableArrayList2;
        com.harman.jbl.partybox.ui.party.mode.c cVar;
        LiveData<com.harman.jbl.partybox.ui.party.mode.c> liveData;
        androidx.lifecycle.P<HmDevice> p4;
        synchronized (this) {
            j4 = this.f39520z0;
            this.f39520z0 = 0L;
        }
        AuracastViewModel auracastViewModel = this.f39481u0;
        long j5 = 111 & j4;
        HmDevice hmDevice = null;
        if (j5 != 0) {
            if (auracastViewModel != null) {
                observableArrayList2 = auracastViewModel.q0();
                liveData = auracastViewModel.o0();
                p4 = auracastViewModel.s0();
                observableArrayList = auracastViewModel.h0();
            } else {
                observableArrayList = null;
                observableArrayList2 = null;
                liveData = null;
                p4 = null;
            }
            l1(0, observableArrayList2);
            j1(1, liveData);
            j1(2, p4);
            l1(3, observableArrayList);
            if (liveData != null) {
                cVar = liveData.f();
            } else {
                cVar = null;
            }
            if (p4 != null) {
                hmDevice = p4.f();
            }
        } else {
            observableArrayList = null;
            observableArrayList2 = null;
            cVar = null;
        }
        if ((100 & j4) != 0) {
            com.harman.jbl.partybox.ui.party.a.H(this.f39470j0, hmDevice);
            com.harman.jbl.partybox.ui.party.a.b(this.f39473m0, hmDevice);
            com.harman.jbl.partybox.ui.party.a.L(this.f39475o0, hmDevice);
            com.harman.jbl.partybox.ui.party.a.x(this.f39479s0, hmDevice);
        }
        if ((j4 & 64) != 0) {
            this.f39471k0.setOnClickListener(this.f39518x0);
            this.f39476p0.setOnClickListener(this.f39519y0);
        }
        if (j5 != 0) {
            com.harman.jbl.partybox.ui.party.a.q(this.f39472l0, hmDevice, observableArrayList2, observableArrayList, cVar);
            com.harman.jbl.partybox.ui.party.a.t(this.f39474n0, hmDevice, observableArrayList2, observableArrayList, cVar);
            com.harman.jbl.partybox.ui.party.a.e(this.f39476p0, hmDevice, observableArrayList2, observableArrayList, cVar);
            com.harman.jbl.partybox.ui.party.a.d(this.f39480t0, hmDevice, observableArrayList2, observableArrayList, cVar);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1859d2
    public void w1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f39481u0 = auracastViewModel;
        synchronized (this) {
            this.f39520z0 |= 32;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1859d2
    public void x1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f39482v0 = auracastFragment;
        synchronized (this) {
            this.f39520z0 |= 16;
        }
        g(7);
        super.B0();
    }

    private C1864e2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (BatteryView) objArr[5], (ImageView) objArr[3], (HmCustomFontTextView) objArr[8], (ImageView) objArr[2], (ImageView) objArr[9], (ImageView) objArr[1], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[10], (HmCustomFontTextView) objArr[4], (HmCustomFontTextView) objArr[7]);
        this.f39520z0 = -1L;
        this.f39470j0.setTag(null);
        this.f39471k0.setTag(null);
        this.f39472l0.setTag(null);
        this.f39473m0.setTag(null);
        this.f39474n0.setTag(null);
        this.f39475o0.setTag(null);
        this.f39476p0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39517w0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f39479s0.setTag(null);
        this.f39480t0.setTag(null);
        N0(view);
        this.f39518x0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f39519y0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        j0();
    }
}
