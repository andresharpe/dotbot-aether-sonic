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
import com.harman.sdk.device.HmDevice;

/* loaded from: classes2.dex */
public class O2 extends N2 implements a.InterfaceC0358a {

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38935w0 = null;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38936x0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38937t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38938u0;

    /* renamed from: v0, reason: collision with root package name */
    private long f38939v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38936x0 = sparseIntArray;
        sparseIntArray.put(j.h.P8, 7);
    }

    public O2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 8, f38935w0, f38936x0));
    }

    private boolean A1(LiveData<HmDevice> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38939v0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean B1(ObservableArrayList<HmDevice> observableArrayList, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38939v0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean C1(ObservableArrayList<HmDevice> observableArrayList, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38939v0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean D1(LiveData<com.harman.jbl.partybox.ui.party.mode.c> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38939v0 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean E1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38939v0 |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean F1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38939v0 |= 16;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastFragment auracastFragment = this.f38910s0;
        HmDevice hmDevice = this.f38908q0;
        if (auracastFragment != null) {
            auracastFragment.onNearbyDeviceClick(hmDevice);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            y1((AuracastFragment) obj);
        } else if (4 == i4) {
            x1((HmDevice) obj);
        } else if (12 == i4) {
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
                if (this.f38939v0 != 0) {
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
            this.f38939v0 = 512L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return false;
                            }
                            return E1((androidx.lifecycle.P) obj, i5);
                        }
                        return F1((androidx.lifecycle.P) obj, i5);
                    }
                    return C1((ObservableArrayList) obj, i5);
                }
                return A1((LiveData) obj, i5);
            }
            return D1((LiveData) obj, i5);
        }
        return B1((ObservableArrayList) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.O2.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.N2
    public void x1(@androidx.annotation.P HmDevice hmDevice) {
        this.f38908q0 = hmDevice;
        synchronized (this) {
            this.f38939v0 |= 128;
        }
        g(4);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.N2
    public void y1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f38910s0 = auracastFragment;
        synchronized (this) {
            this.f38939v0 |= 64;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.N2
    public void z1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f38909r0 = auracastViewModel;
        synchronized (this) {
            this.f38939v0 |= 256;
        }
        g(12);
        super.B0();
    }

    private O2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 6, (ImageView) objArr[3], (ImageView) objArr[2], (ImageView) objArr[1], (ConstraintLayout) objArr[7], (View) objArr[4], (HmCustomFontTextView) objArr[6], (HmCustomFontTextView) objArr[5]);
        this.f38939v0 = -1L;
        this.f38901j0.setTag(null);
        this.f38902k0.setTag(null);
        this.f38903l0.setTag(null);
        this.f38905n0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f38937t0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f38906o0.setTag(null);
        this.f38907p0.setTag(null);
        N0(view);
        this.f38938u0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
