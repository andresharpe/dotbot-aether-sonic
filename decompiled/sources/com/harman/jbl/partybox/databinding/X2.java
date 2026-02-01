package com.harman.jbl.partybox.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;
import java.util.List;

/* loaded from: classes2.dex */
public class X2 extends W2 implements a.InterfaceC0358a {

    /* renamed from: B0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39207B0;

    /* renamed from: C0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39208C0;

    /* renamed from: A0, reason: collision with root package name */
    private long f39209A0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39210t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39211u0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39212v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39213w0;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39214x0;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39215y0;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39216z0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        f39207B0 = iVar;
        int i4 = j.i.f41432Q1;
        int i5 = j.i.f41436R1;
        iVar.a(0, new String[]{"layout_in_party_device_central", "layout_in_party_device_side", "layout_in_party_device_side", "layout_in_party_device_side", "layout_in_party_device_side", "layout_more_in_party_device"}, new int[]{1, 2, 3, 4, 5, 6}, new int[]{i4, i5, i5, i5, i5, j.i.f41473a2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39208C0 = sparseIntArray;
        sparseIntArray.put(j.h.w5, 7);
        sparseIntArray.put(j.h.v5, 8);
    }

    public X2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 9, f39207B0, f39208C0));
    }

    private boolean A1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 64;
            }
            return true;
        }
        return false;
    }

    private boolean B1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean C1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean D1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 512;
            }
            return true;
        }
        return false;
    }

    private boolean E1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= PlaybackStateCompat.f4286a0;
            }
            return true;
        }
        return false;
    }

    private boolean F1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean G1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= PlaybackStateCompat.f4287b0;
            }
            return true;
        }
        return false;
    }

    private boolean H1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 256;
            }
            return true;
        }
        return false;
    }

    private boolean I1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean J1(H2 h22, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean y1(androidx.lifecycle.P<List<HmDevice>> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean z1(AbstractC1938t2 abstractC1938t2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39209A0 |= 128;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M0(@androidx.annotation.P androidx.lifecycle.E e4) {
        super.M0(e4);
        this.f39175j0.M0(e4);
        this.f39176k0.M0(e4);
        this.f39177l0.M0(e4);
        this.f39178m0.M0(e4);
        this.f39179n0.M0(e4);
        this.f39182q0.M0(e4);
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        androidx.lifecycle.P<HmDevice> centerDevice;
        androidx.lifecycle.P<HmDevice> sideDeviceOne;
        androidx.lifecycle.P<HmDevice> sideDeviceTwo;
        androidx.lifecycle.P<HmDevice> sideDeviceThree;
        androidx.lifecycle.P<HmDevice> sideDeviceFour;
        switch (i4) {
            case 1:
                AuracastFragment auracastFragment = this.f39184s0;
                if (auracastFragment != null && (centerDevice = auracastFragment.getCenterDevice()) != null) {
                    auracastFragment.onPartyLayoutDeviceClick(centerDevice.f());
                    return;
                }
                return;
            case 2:
                AuracastFragment auracastFragment2 = this.f39184s0;
                if (auracastFragment2 != null && (sideDeviceOne = auracastFragment2.getSideDeviceOne()) != null) {
                    auracastFragment2.onPartyLayoutDeviceClick(sideDeviceOne.f());
                    return;
                }
                return;
            case 3:
                AuracastFragment auracastFragment3 = this.f39184s0;
                if (auracastFragment3 != null && (sideDeviceTwo = auracastFragment3.getSideDeviceTwo()) != null) {
                    auracastFragment3.onPartyLayoutDeviceClick(sideDeviceTwo.f());
                    return;
                }
                return;
            case 4:
                AuracastFragment auracastFragment4 = this.f39184s0;
                if (auracastFragment4 != null && (sideDeviceThree = auracastFragment4.getSideDeviceThree()) != null) {
                    auracastFragment4.onPartyLayoutDeviceClick(sideDeviceThree.f());
                    return;
                }
                return;
            case 5:
                AuracastFragment auracastFragment5 = this.f39184s0;
                if (auracastFragment5 != null && (sideDeviceFour = auracastFragment5.getSideDeviceFour()) != null) {
                    auracastFragment5.onPartyLayoutDeviceClick(sideDeviceFour.f());
                    return;
                }
                return;
            case 6:
                AuracastFragment auracastFragment6 = this.f39184s0;
                if (auracastFragment6 != null) {
                    auracastFragment6.onPartyMoreDevicesClick();
                    return;
                }
                return;
            default:
                return;
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
                if (this.f39209A0 != 0) {
                    return true;
                }
                if (this.f39175j0.h0() || this.f39176k0.h0() || this.f39177l0.h0() || this.f39178m0.h0() || this.f39179n0.h0() || this.f39182q0.h0()) {
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
            this.f39209A0 = PlaybackStateCompat.f4290e0;
        }
        this.f39175j0.j0();
        this.f39176k0.j0();
        this.f39177l0.j0();
        this.f39178m0.j0();
        this.f39179n0.j0();
        this.f39182q0.j0();
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        switch (i4) {
            case 0:
                return C1((AbstractC1948v2) obj, i5);
            case 1:
                return F1((androidx.lifecycle.P) obj, i5);
            case 2:
                return J1((H2) obj, i5);
            case 3:
                return B1((AbstractC1948v2) obj, i5);
            case 4:
                return I1((androidx.lifecycle.P) obj, i5);
            case 5:
                return y1((androidx.lifecycle.P) obj, i5);
            case 6:
                return A1((AbstractC1948v2) obj, i5);
            case 7:
                return z1((AbstractC1938t2) obj, i5);
            case 8:
                return H1((androidx.lifecycle.P) obj, i5);
            case 9:
                return D1((AbstractC1948v2) obj, i5);
            case 10:
                return E1((androidx.lifecycle.P) obj, i5);
            case 11:
                return G1((androidx.lifecycle.P) obj, i5);
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.X2.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.W2
    public void w1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f39183r0 = auracastViewModel;
        synchronized (this) {
            this.f39209A0 |= PlaybackStateCompat.f4289d0;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.W2
    public void x1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f39184s0 = auracastFragment;
        synchronized (this) {
            this.f39209A0 |= PlaybackStateCompat.f4288c0;
        }
        g(7);
        super.B0();
    }

    private X2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 12, (AbstractC1938t2) objArr[1], (AbstractC1948v2) objArr[2], (AbstractC1948v2) objArr[3], (AbstractC1948v2) objArr[4], (AbstractC1948v2) objArr[5], (Guideline) objArr[8], (Guideline) objArr[7], (H2) objArr[6]);
        this.f39209A0 = -1L;
        L0(this.f39175j0);
        L0(this.f39176k0);
        L0(this.f39177l0);
        L0(this.f39178m0);
        L0(this.f39179n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39210t0 = constraintLayout;
        constraintLayout.setTag(null);
        L0(this.f39182q0);
        N0(view);
        this.f39211u0 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        this.f39212v0 = new com.harman.jbl.partybox.generated.callback.a(this, 4);
        this.f39213w0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f39214x0 = new com.harman.jbl.partybox.generated.callback.a(this, 5);
        this.f39215y0 = new com.harman.jbl.partybox.generated.callback.a(this, 6);
        this.f39216z0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        j0();
    }
}
