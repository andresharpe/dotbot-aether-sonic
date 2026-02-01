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
public class Z2 extends Y2 implements a.InterfaceC0358a {

    /* renamed from: B0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39300B0;

    /* renamed from: C0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39301C0;

    /* renamed from: A0, reason: collision with root package name */
    private long f39302A0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39303t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39304u0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39305v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39306w0;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39307x0;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39308y0;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39309z0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        f39300B0 = iVar;
        int i4 = j.i.f41436R1;
        iVar.a(0, new String[]{"layout_in_party_device_side", "layout_in_party_device_side", "layout_in_party_device_side", "layout_in_party_device_side", "layout_in_party_device_side", "layout_more_in_party_device"}, new int[]{1, 2, 3, 4, 5, 6}, new int[]{i4, i4, i4, i4, i4, j.i.f41473a2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39301C0 = sparseIntArray;
        sparseIntArray.put(j.h.w5, 7);
        sparseIntArray.put(j.h.v5, 8);
    }

    public Z2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 9, f39300B0, f39301C0));
    }

    private boolean A1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean B1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean C1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= PlaybackStateCompat.f4286a0;
            }
            return true;
        }
        return false;
    }

    private boolean D1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 256;
            }
            return true;
        }
        return false;
    }

    private boolean E1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 128;
            }
            return true;
        }
        return false;
    }

    private boolean F1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean G1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= PlaybackStateCompat.f4287b0;
            }
            return true;
        }
        return false;
    }

    private boolean H1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 512;
            }
            return true;
        }
        return false;
    }

    private boolean I1(androidx.lifecycle.P<HmDevice> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean J1(H2 h22, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean y1(androidx.lifecycle.P<List<HmDevice>> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean z1(AbstractC1948v2 abstractC1948v2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39302A0 |= 64;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M0(@androidx.annotation.P androidx.lifecycle.E e4) {
        super.M0(e4);
        this.f39254j0.M0(e4);
        this.f39255k0.M0(e4);
        this.f39256l0.M0(e4);
        this.f39257m0.M0(e4);
        this.f39258n0.M0(e4);
        this.f39261q0.M0(e4);
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        androidx.lifecycle.P<HmDevice> sideDeviceOne;
        androidx.lifecycle.P<HmDevice> sideDeviceTwo;
        androidx.lifecycle.P<HmDevice> sideDeviceThree;
        androidx.lifecycle.P<HmDevice> sideDeviceFour;
        androidx.lifecycle.P<HmDevice> sideDeviceFive;
        switch (i4) {
            case 1:
                AuracastFragment auracastFragment = this.f39263s0;
                if (auracastFragment != null && (sideDeviceOne = auracastFragment.getSideDeviceOne()) != null) {
                    auracastFragment.onPartyLayoutDeviceClick(sideDeviceOne.f());
                    return;
                }
                return;
            case 2:
                AuracastFragment auracastFragment2 = this.f39263s0;
                if (auracastFragment2 != null && (sideDeviceTwo = auracastFragment2.getSideDeviceTwo()) != null) {
                    auracastFragment2.onPartyLayoutDeviceClick(sideDeviceTwo.f());
                    return;
                }
                return;
            case 3:
                AuracastFragment auracastFragment3 = this.f39263s0;
                if (auracastFragment3 != null && (sideDeviceThree = auracastFragment3.getSideDeviceThree()) != null) {
                    auracastFragment3.onPartyLayoutDeviceClick(sideDeviceThree.f());
                    return;
                }
                return;
            case 4:
                AuracastFragment auracastFragment4 = this.f39263s0;
                if (auracastFragment4 != null && (sideDeviceFour = auracastFragment4.getSideDeviceFour()) != null) {
                    auracastFragment4.onPartyLayoutDeviceClick(sideDeviceFour.f());
                    return;
                }
                return;
            case 5:
                AuracastFragment auracastFragment5 = this.f39263s0;
                if (auracastFragment5 != null && (sideDeviceFive = auracastFragment5.getSideDeviceFive()) != null) {
                    auracastFragment5.onPartyLayoutDeviceClick(sideDeviceFive.f());
                    return;
                }
                return;
            case 6:
                AuracastFragment auracastFragment6 = this.f39263s0;
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
                if (this.f39302A0 != 0) {
                    return true;
                }
                if (this.f39254j0.h0() || this.f39255k0.h0() || this.f39256l0.h0() || this.f39257m0.h0() || this.f39258n0.h0() || this.f39261q0.h0()) {
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
            this.f39302A0 = PlaybackStateCompat.f4290e0;
        }
        this.f39254j0.j0();
        this.f39255k0.j0();
        this.f39256l0.j0();
        this.f39257m0.j0();
        this.f39258n0.j0();
        this.f39261q0.j0();
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        switch (i4) {
            case 0:
                return B1((AbstractC1948v2) obj, i5);
            case 1:
                return F1((androidx.lifecycle.P) obj, i5);
            case 2:
                return J1((H2) obj, i5);
            case 3:
                return A1((AbstractC1948v2) obj, i5);
            case 4:
                return I1((androidx.lifecycle.P) obj, i5);
            case 5:
                return y1((androidx.lifecycle.P) obj, i5);
            case 6:
                return z1((AbstractC1948v2) obj, i5);
            case 7:
                return E1((androidx.lifecycle.P) obj, i5);
            case 8:
                return D1((AbstractC1948v2) obj, i5);
            case 9:
                return H1((androidx.lifecycle.P) obj, i5);
            case 10:
                return C1((AbstractC1948v2) obj, i5);
            case 11:
                return G1((androidx.lifecycle.P) obj, i5);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        HmDevice hmDevice;
        HmDevice hmDevice2;
        HmDevice hmDevice3;
        HmDevice hmDevice4;
        HmDevice hmDevice5;
        HmDevice hmDevice6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        HmDevice hmDevice7;
        androidx.lifecycle.P<List<HmDevice>> p4;
        List<HmDevice> list;
        boolean z3;
        long j5;
        androidx.lifecycle.P<HmDevice> p5;
        boolean z4;
        long j6;
        androidx.lifecycle.P<HmDevice> p6;
        boolean z5;
        long j7;
        androidx.lifecycle.P<HmDevice> p7;
        boolean z6;
        long j8;
        androidx.lifecycle.P<HmDevice> p8;
        boolean z7;
        long j9;
        androidx.lifecycle.P<HmDevice> p9;
        boolean z8;
        long j10;
        synchronized (this) {
            j4 = this.f39302A0;
            this.f39302A0 = 0L;
        }
        AuracastFragment auracastFragment = this.f39263s0;
        AuracastViewModel auracastViewModel = this.f39262r0;
        int i15 = 8;
        if ((23186 & j4) != 0) {
            long j11 = j4 & 20482;
            if (j11 != 0) {
                if (auracastFragment != null) {
                    p9 = auracastFragment.getSideDeviceFour();
                } else {
                    p9 = null;
                }
                j1(1, p9);
                if (p9 != null) {
                    hmDevice3 = p9.f();
                } else {
                    hmDevice3 = null;
                }
                if (hmDevice3 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (j11 != 0) {
                    if (z8) {
                        j10 = PlaybackStateCompat.f4296k0;
                    } else {
                        j10 = PlaybackStateCompat.f4295j0;
                    }
                    j4 |= j10;
                }
                if (z8) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
            } else {
                i5 = 0;
                hmDevice3 = null;
            }
            long j12 = j4 & 20496;
            if (j12 != 0) {
                if (auracastFragment != null) {
                    p8 = auracastFragment.getSideDeviceTwo();
                } else {
                    p8 = null;
                }
                j1(4, p8);
                if (p8 != null) {
                    hmDevice2 = p8.f();
                } else {
                    hmDevice2 = null;
                }
                if (hmDevice2 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (j12 != 0) {
                    if (z7) {
                        j9 = 67108864;
                    } else {
                        j9 = 33554432;
                    }
                    j4 |= j9;
                }
                if (z7) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
            } else {
                i8 = 0;
                hmDevice2 = null;
            }
            long j13 = j4 & 20608;
            if (j13 != 0) {
                if (auracastFragment != null) {
                    p7 = auracastFragment.getSideDeviceFive();
                } else {
                    p7 = null;
                }
                j1(7, p7);
                if (p7 != null) {
                    hmDevice5 = p7.f();
                } else {
                    hmDevice5 = null;
                }
                if (hmDevice5 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (j13 != 0) {
                    if (z6) {
                        j8 = 16777216;
                    } else {
                        j8 = 8388608;
                    }
                    j4 |= j8;
                }
                if (z6) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
            } else {
                i7 = 0;
                hmDevice5 = null;
            }
            long j14 = j4 & 20992;
            if (j14 != 0) {
                if (auracastFragment != null) {
                    p6 = auracastFragment.getSideDeviceThree();
                } else {
                    p6 = null;
                }
                j1(9, p6);
                if (p6 != null) {
                    hmDevice4 = p6.f();
                } else {
                    hmDevice4 = null;
                }
                if (hmDevice4 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (j14 != 0) {
                    if (z5) {
                        j7 = PlaybackStateCompat.f4292g0;
                    } else {
                        j7 = PlaybackStateCompat.f4291f0;
                    }
                    j4 |= j7;
                }
                if (z5) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
            } else {
                i6 = 0;
                hmDevice4 = null;
            }
            long j15 = j4 & 22528;
            if (j15 != 0) {
                if (auracastFragment != null) {
                    p5 = auracastFragment.getSideDeviceOne();
                } else {
                    p5 = null;
                }
                j1(11, p5);
                if (p5 != null) {
                    hmDevice = p5.f();
                } else {
                    hmDevice = null;
                }
                if (hmDevice != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (j15 != 0) {
                    if (z4) {
                        j6 = PlaybackStateCompat.f4294i0;
                    } else {
                        j6 = PlaybackStateCompat.f4293h0;
                    }
                    j4 |= j6;
                }
                if (z4) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
            } else {
                i4 = 0;
                hmDevice = null;
            }
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            hmDevice = null;
            hmDevice2 = null;
            hmDevice3 = null;
            hmDevice4 = null;
            hmDevice5 = null;
        }
        long j16 = j4 & 24608;
        if (j16 != 0) {
            if (auracastViewModel != null) {
                p4 = auracastViewModel.r0();
                hmDevice6 = hmDevice5;
            } else {
                hmDevice6 = hmDevice5;
                p4 = null;
            }
            j1(5, p4);
            if (p4 != null) {
                list = p4.f();
            } else {
                list = null;
            }
            if (list != null && list.size() > 5) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (j16 != 0) {
                if (z3) {
                    j5 = 4194304;
                } else {
                    j5 = PlaybackStateCompat.f4297l0;
                }
                j4 |= j5;
            }
            if (z3) {
                i15 = 0;
            }
            i9 = i15;
        } else {
            hmDevice6 = hmDevice5;
            i9 = 0;
        }
        long j17 = j4 & PlaybackStateCompat.f4290e0;
        if (j17 != 0) {
            int i16 = j.f.g8;
            i10 = i9;
            i11 = j.f.i8;
            i12 = i16;
            i13 = i7;
            i14 = j.f.h8;
        } else {
            i10 = i9;
            i11 = 0;
            i12 = 0;
            i13 = i7;
            i14 = 0;
        }
        if (j17 != 0) {
            hmDevice7 = hmDevice3;
            this.f39254j0.d().setOnClickListener(this.f39306w0);
            this.f39254j0.y1(i12);
            this.f39255k0.d().setOnClickListener(this.f39308y0);
            this.f39255k0.y1(i11);
            this.f39256l0.d().setOnClickListener(this.f39309z0);
            this.f39256l0.y1(i14);
            this.f39257m0.d().setOnClickListener(this.f39304u0);
            this.f39257m0.y1(i12);
            this.f39258n0.d().setOnClickListener(this.f39305v0);
            this.f39258n0.y1(i14);
            this.f39261q0.d().setOnClickListener(this.f39307x0);
            this.f39261q0.v1(i14);
        } else {
            hmDevice7 = hmDevice3;
        }
        if ((22528 & j4) != 0) {
            this.f39254j0.d().setVisibility(i4);
            this.f39254j0.z1(hmDevice);
        }
        if ((24576 & j4) != 0) {
            this.f39254j0.x1(auracastViewModel);
            this.f39255k0.x1(auracastViewModel);
            this.f39256l0.x1(auracastViewModel);
            this.f39257m0.x1(auracastViewModel);
            this.f39258n0.x1(auracastViewModel);
        }
        if ((20496 & j4) != 0) {
            this.f39255k0.d().setVisibility(i8);
            this.f39255k0.z1(hmDevice2);
        }
        if ((20992 & j4) != 0) {
            this.f39256l0.d().setVisibility(i6);
            this.f39256l0.z1(hmDevice4);
        }
        if ((j4 & 20482) != 0) {
            this.f39257m0.d().setVisibility(i5);
            this.f39257m0.z1(hmDevice7);
        }
        if ((20608 & j4) != 0) {
            this.f39258n0.d().setVisibility(i13);
            this.f39258n0.z1(hmDevice6);
        }
        if ((j4 & 24608) != 0) {
            this.f39261q0.d().setVisibility(i10);
        }
        ViewDataBinding.x(this.f39254j0);
        ViewDataBinding.x(this.f39255k0);
        ViewDataBinding.x(this.f39256l0);
        ViewDataBinding.x(this.f39257m0);
        ViewDataBinding.x(this.f39258n0);
        ViewDataBinding.x(this.f39261q0);
    }

    @Override // com.harman.jbl.partybox.databinding.Y2
    public void w1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f39262r0 = auracastViewModel;
        synchronized (this) {
            this.f39302A0 |= PlaybackStateCompat.f4289d0;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.Y2
    public void x1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f39263s0 = auracastFragment;
        synchronized (this) {
            this.f39302A0 |= PlaybackStateCompat.f4288c0;
        }
        g(7);
        super.B0();
    }

    private Z2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 12, (AbstractC1948v2) objArr[1], (AbstractC1948v2) objArr[2], (AbstractC1948v2) objArr[3], (AbstractC1948v2) objArr[4], (AbstractC1948v2) objArr[5], (Guideline) objArr[8], (Guideline) objArr[7], (H2) objArr[6]);
        this.f39302A0 = -1L;
        L0(this.f39254j0);
        L0(this.f39255k0);
        L0(this.f39256l0);
        L0(this.f39257m0);
        L0(this.f39258n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39303t0 = constraintLayout;
        constraintLayout.setTag(null);
        L0(this.f39261q0);
        N0(view);
        this.f39304u0 = new com.harman.jbl.partybox.generated.callback.a(this, 4);
        this.f39305v0 = new com.harman.jbl.partybox.generated.callback.a(this, 5);
        this.f39306w0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f39307x0 = new com.harman.jbl.partybox.generated.callback.a(this, 6);
        this.f39308y0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        this.f39309z0 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        j0();
    }
}
