package com.harman.jbl.partybox.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumSelectDeviceTip;
import com.harman.sdk.device.HmDevice;

/* loaded from: classes2.dex */
public class I extends H {

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38707t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38708u0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.P
    private final AbstractC1865e3 f38709l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38710m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.P
    private final AbstractC1949v3 f38711n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private final AbstractC1959x3 f38712o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.P
    private final U2 f38713p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private final AbstractC1895k3 f38714q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private final S2 f38715r0;

    /* renamed from: s0, reason: collision with root package name */
    private long f38716s0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        f38707t0 = iVar;
        iVar.a(0, new String[]{"layout_select_device_not_compatible_to_current_party_popup", "layout_the_speaker_is_in_other_party", "layout_the_speaker_is_not_bt_connected", "layout_party_only_support_two_speakers", "layout_start_a_new_party_popup", "layout_party_device_in_daisy_chain"}, new int[]{1, 2, 3, 4, 5, 6}, new int[]{j.i.f41529o2, j.i.f41573z2, j.i.f41369A2, j.i.f41501h2, j.i.f41549t2, j.i.f41497g2});
        f38708u0 = null;
    }

    public I(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 7, f38707t0, f38708u0));
    }

    private boolean y1(LiveData<com.harman.jbl.partybox.ui.party.auracast.w> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38716s0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M0(@androidx.annotation.P androidx.lifecycle.E e4) {
        super.M0(e4);
        this.f38709l0.M0(e4);
        this.f38711n0.M0(e4);
        this.f38712o0.M0(e4);
        this.f38713p0.M0(e4);
        this.f38714q0.M0(e4);
        this.f38715r0.M0(e4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            w1((AuracastFragment) obj);
        } else if (11 == i4) {
            x1((AuracastViewModel) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f38716s0 != 0) {
                    return true;
                }
                if (this.f38709l0.h0() || this.f38711n0.h0() || this.f38712o0.h0() || this.f38713p0.h0() || this.f38714q0.h0() || this.f38715r0.h0()) {
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
            this.f38716s0 = 8L;
        }
        this.f38709l0.j0();
        this.f38711n0.j0();
        this.f38712o0.j0();
        this.f38713p0.j0();
        this.f38714q0.j0();
        this.f38715r0.j0();
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return y1((LiveData) obj, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.harman.jbl.partybox.ui.party.auracast.define.EnumSelectDeviceTip] */
    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        LiveData<com.harman.jbl.partybox.ui.party.auracast.w> liveData;
        com.harman.jbl.partybox.ui.party.auracast.w wVar;
        HmDevice hmDevice;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        synchronized (this) {
            j4 = this.f38716s0;
            this.f38716s0 = 0L;
        }
        AuracastFragment auracastFragment = this.f38669j0;
        AuracastViewModel auracastViewModel = this.f38670k0;
        long j11 = j4 & 11;
        HmDevice hmDevice2 = null;
        if (j11 != 0) {
            if (auracastFragment != null) {
                liveData = auracastFragment.getBeanSelectDeviceTip();
            } else {
                liveData = null;
            }
            j1(0, liveData);
            if (liveData != null) {
                wVar = liveData.f();
            } else {
                wVar = null;
            }
            if (wVar != null) {
                HmDevice e4 = wVar.e();
                ?? f4 = wVar.f();
                hmDevice = e4;
                hmDevice2 = f4;
            } else {
                hmDevice = null;
            }
            if (EnumSelectDeviceTip.SPEAKER_NOT_BT_CONNECTED == hmDevice2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (EnumSelectDeviceTip.SPEAKER_IN_OTHER_PARTY == hmDevice2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (EnumSelectDeviceTip.PARTY_ONLY_SUPPORT_TWO_SPEAKERS == hmDevice2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (EnumSelectDeviceTip.NOT_COMPATIBLE_PARTY == hmDevice2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (EnumSelectDeviceTip.DEVICE_IN_DAISY_CHAIN == hmDevice2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (EnumSelectDeviceTip.START_NEW_PARTY == hmDevice2) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (j11 != 0) {
                if (z3) {
                    j10 = PlaybackStateCompat.f4287b0;
                } else {
                    j10 = PlaybackStateCompat.f4286a0;
                }
                j4 |= j10;
            }
            if ((j4 & 11) != 0) {
                if (z4) {
                    j9 = PlaybackStateCompat.f4291f0;
                } else {
                    j9 = PlaybackStateCompat.f4290e0;
                }
                j4 |= j9;
            }
            if ((j4 & 11) != 0) {
                if (z5) {
                    j8 = 32;
                } else {
                    j8 = 16;
                }
                j4 |= j8;
            }
            if ((j4 & 11) != 0) {
                if (z6) {
                    j7 = 128;
                } else {
                    j7 = 64;
                }
                j4 |= j7;
            }
            if ((j4 & 11) != 0) {
                if (z7) {
                    j6 = 512;
                } else {
                    j6 = 256;
                }
                j4 |= j6;
            }
            if ((j4 & 11) != 0) {
                if (z8) {
                    j5 = PlaybackStateCompat.f4289d0;
                } else {
                    j5 = PlaybackStateCompat.f4288c0;
                }
                j4 |= j5;
            }
            if (z3) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (z5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            if (z6) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            if (z7) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            if (z8) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            i5 = i11;
            i7 = i12;
            i9 = i13;
            i4 = i10;
            hmDevice2 = hmDevice;
            i8 = i14;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        long j12 = 12 & j4;
        if ((11 & j4) != 0) {
            this.f38709l0.d().setVisibility(i7);
            this.f38709l0.w1(hmDevice2);
            this.f38711n0.d().setVisibility(i4);
            this.f38711n0.w1(hmDevice2);
            this.f38712o0.d().setVisibility(i6);
            this.f38712o0.w1(hmDevice2);
            this.f38713p0.d().setVisibility(i5);
            this.f38713p0.w1(hmDevice2);
            this.f38714q0.d().setVisibility(i8);
            this.f38714q0.x1(hmDevice2);
            this.f38715r0.d().setVisibility(i9);
            this.f38715r0.w1(hmDevice2);
        }
        if ((j4 & 10) != 0) {
            this.f38709l0.x1(auracastFragment);
            this.f38711n0.x1(auracastFragment);
            this.f38712o0.x1(auracastFragment);
            this.f38713p0.x1(auracastFragment);
            this.f38714q0.y1(auracastFragment);
            this.f38715r0.x1(auracastFragment);
        }
        if (j12 != 0) {
            this.f38714q0.z1(auracastViewModel);
        }
        ViewDataBinding.x(this.f38709l0);
        ViewDataBinding.x(this.f38711n0);
        ViewDataBinding.x(this.f38712o0);
        ViewDataBinding.x(this.f38713p0);
        ViewDataBinding.x(this.f38714q0);
        ViewDataBinding.x(this.f38715r0);
    }

    @Override // com.harman.jbl.partybox.databinding.H
    public void w1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f38669j0 = auracastFragment;
        synchronized (this) {
            this.f38716s0 |= 2;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.H
    public void x1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f38670k0 = auracastViewModel;
        synchronized (this) {
            this.f38716s0 |= 4;
        }
        g(11);
        super.B0();
    }

    private I(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1);
        this.f38716s0 = -1L;
        AbstractC1865e3 abstractC1865e3 = (AbstractC1865e3) objArr[1];
        this.f38709l0 = abstractC1865e3;
        L0(abstractC1865e3);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f38710m0 = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC1949v3 abstractC1949v3 = (AbstractC1949v3) objArr[2];
        this.f38711n0 = abstractC1949v3;
        L0(abstractC1949v3);
        AbstractC1959x3 abstractC1959x3 = (AbstractC1959x3) objArr[3];
        this.f38712o0 = abstractC1959x3;
        L0(abstractC1959x3);
        U2 u22 = (U2) objArr[4];
        this.f38713p0 = u22;
        L0(u22);
        AbstractC1895k3 abstractC1895k3 = (AbstractC1895k3) objArr[5];
        this.f38714q0 = abstractC1895k3;
        L0(abstractC1895k3);
        S2 s22 = (S2) objArr[6];
        this.f38715r0 = s22;
        L0(s22);
        N0(view);
        j0();
    }
}
