package com.harman.jbl.partybox.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPanelStyle;

/* loaded from: classes2.dex */
public class L1 extends K1 {

    /* renamed from: B0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38856B0;

    /* renamed from: C0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38857C0;

    /* renamed from: A0, reason: collision with root package name */
    private long f38858A0;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38859z0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(13);
        f38856B0 = iVar;
        iVar.a(0, new String[]{"layout_more_device"}, new int[]{11}, new int[]{j.i.f41468Z1});
        iVar.a(1, new String[]{"layout_in_party_devices"}, new int[]{3}, new int[]{j.i.f41440S1});
        iVar.a(2, new String[]{"layout_auracast_scan_dev_list", "layout_auracast_play_music_tips", "layout_auracast_no_connectable_devices_tips", "layout_auracast_receiver_tips", "layout_auracast_sharing_music_tips", "layout_device_card", "layout_more_nearby_device_popup"}, new int[]{4, 5, 6, 7, 8, 9, 10}, new int[]{j.i.f41560w1, j.i.f41552u1, j.i.f41548t1, j.i.f41556v1, j.i.f41564x1, j.i.f41380D1, j.i.f41481c2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38857C0 = sparseIntArray;
        sparseIntArray.put(j.h.Ga, 12);
    }

    public L1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 13, f38856B0, f38857C0));
    }

    private boolean C1(AbstractC1859d2 abstractC1859d2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 128;
            }
            return true;
        }
        return false;
    }

    private boolean D1(androidx.lifecycle.P<EnumPanelStyle> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 256;
            }
            return true;
        }
        return false;
    }

    private boolean E1(AbstractC1958x2 abstractC1958x2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 512;
            }
            return true;
        }
        return false;
    }

    private boolean F1(S1 s12, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean G1(W1 w12, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean H1(F2 f22, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 64;
            }
            return true;
        }
        return false;
    }

    private boolean I1(O1 o12, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean J1(Q1 q12, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean K1(L2 l22, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean L1(U1 u12, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38858A0 |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.databinding.K1
    public void A1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.c cVar) {
        this.f38831y0 = cVar;
        synchronized (this) {
            this.f38858A0 |= PlaybackStateCompat.f4289d0;
        }
        g(8);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.K1
    public void B1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.e eVar) {
        this.f38830x0 = eVar;
        synchronized (this) {
            this.f38858A0 |= PlaybackStateCompat.f4287b0;
        }
        g(10);
        super.B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M0(@androidx.annotation.P androidx.lifecycle.E e4) {
        super.M0(e4);
        this.f38817k0.M0(e4);
        this.f38826t0.M0(e4);
        this.f38823q0.M0(e4);
        this.f38821o0.M0(e4);
        this.f38818l0.M0(e4);
        this.f38819m0.M0(e4);
        this.f38816j0.M0(e4);
        this.f38825s0.M0(e4);
        this.f38820n0.M0(e4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            z1((AuracastFragment) obj);
        } else if (10 == i4) {
            B1((com.harman.jbl.partybox.ui.party.auracast.ui.e) obj);
        } else if (2 == i4) {
            y1((AuracastViewModel) obj);
        } else if (8 == i4) {
            A1((com.harman.jbl.partybox.ui.party.auracast.ui.c) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f38858A0 != 0) {
                    return true;
                }
                if (this.f38817k0.h0() || this.f38826t0.h0() || this.f38823q0.h0() || this.f38821o0.h0() || this.f38818l0.h0() || this.f38819m0.h0() || this.f38816j0.h0() || this.f38825s0.h0() || this.f38820n0.h0()) {
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
            this.f38858A0 = PlaybackStateCompat.f4290e0;
        }
        this.f38817k0.j0();
        this.f38826t0.j0();
        this.f38823q0.j0();
        this.f38821o0.j0();
        this.f38818l0.j0();
        this.f38819m0.j0();
        this.f38816j0.j0();
        this.f38825s0.j0();
        this.f38820n0.j0();
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        switch (i4) {
            case 0:
                return G1((W1) obj, i5);
            case 1:
                return L1((U1) obj, i5);
            case 2:
                return I1((O1) obj, i5);
            case 3:
                return K1((L2) obj, i5);
            case 4:
                return J1((Q1) obj, i5);
            case 5:
                return F1((S1) obj, i5);
            case 6:
                return H1((F2) obj, i5);
            case 7:
                return C1((AbstractC1859d2) obj, i5);
            case 8:
                return D1((androidx.lifecycle.P) obj, i5);
            case 9:
                return E1((AbstractC1958x2) obj, i5);
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
        int i9;
        int i10;
        androidx.lifecycle.P<EnumPanelStyle> p4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i11;
        int i12;
        int i13;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        synchronized (this) {
            j4 = this.f38858A0;
            this.f38858A0 = 0L;
        }
        AuracastFragment auracastFragment = this.f38828v0;
        com.harman.jbl.partybox.ui.party.auracast.ui.e eVar = this.f38830x0;
        AuracastViewModel auracastViewModel = this.f38829w0;
        com.harman.jbl.partybox.ui.party.auracast.ui.c cVar = this.f38831y0;
        long j12 = j4 & 17664;
        if (j12 != 0) {
            EnumPanelStyle enumPanelStyle = null;
            if (auracastFragment != null) {
                p4 = auracastFragment.getPanelStyle();
            } else {
                p4 = null;
            }
            j1(8, p4);
            if (p4 != null) {
                enumPanelStyle = p4.f();
            }
            boolean z9 = true;
            if (EnumPanelStyle.SHARING_TIPS == enumPanelStyle) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (EnumPanelStyle.PLAY_MUSIC_TIPS == enumPanelStyle) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (EnumPanelStyle.DEVICE_CARD == enumPanelStyle) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (EnumPanelStyle.OTHER_DEVICES_POPUP == enumPanelStyle) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (EnumPanelStyle.NO_CONNECTABLE_DEVICE == enumPanelStyle) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (EnumPanelStyle.NONE == enumPanelStyle) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (EnumPanelStyle.RECEIVER_TIPS != enumPanelStyle) {
                z9 = false;
            }
            if (j12 != 0) {
                if (z3) {
                    j11 = PlaybackStateCompat.f4294i0;
                } else {
                    j11 = PlaybackStateCompat.f4293h0;
                }
                j4 |= j11;
            }
            if ((j4 & 17664) != 0) {
                if (z4) {
                    j10 = 268435456;
                } else {
                    j10 = 134217728;
                }
                j4 |= j10;
            }
            if ((j4 & 17664) != 0) {
                if (z5) {
                    j9 = 67108864;
                } else {
                    j9 = 33554432;
                }
                j4 |= j9;
            }
            if ((j4 & 17664) != 0) {
                if (z6) {
                    j8 = PlaybackStateCompat.f4292g0;
                } else {
                    j8 = PlaybackStateCompat.f4291f0;
                }
                j4 |= j8;
            }
            if ((j4 & 17664) != 0) {
                if (z7) {
                    j7 = 16777216;
                } else {
                    j7 = 8388608;
                }
                j4 |= j7;
            }
            if ((j4 & 17664) != 0) {
                if (z8) {
                    j6 = 4194304;
                } else {
                    j6 = PlaybackStateCompat.f4297l0;
                }
                j4 |= j6;
            }
            if ((j4 & 17664) != 0) {
                if (z9) {
                    j5 = PlaybackStateCompat.f4296k0;
                } else {
                    j5 = PlaybackStateCompat.f4295j0;
                }
                j4 |= j5;
            }
            if (z3) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (z4) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            if (z5) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            if (z6) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            if (z7) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            if (z8) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            if (z9) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            i10 = i12;
            i6 = i11;
            i4 = i13;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        long j13 = 18432 & j4;
        long j14 = j4 & 20480;
        long j15 = j4 & 24576;
        if ((j4 & 17664) != 0) {
            this.f38816j0.d().setVisibility(i9);
            this.f38818l0.d().setVisibility(i4);
            this.f38819m0.d().setVisibility(i7);
            this.f38821o0.d().setVisibility(i5);
            this.f38823q0.d().setVisibility(i8);
            this.f38825s0.d().setVisibility(i6);
            this.f38826t0.d().setVisibility(i10);
        }
        if (j14 != 0) {
            this.f38816j0.w1(auracastViewModel);
            this.f38817k0.w1(auracastViewModel);
            this.f38820n0.w1(auracastViewModel);
            this.f38825s0.y1(auracastViewModel);
            this.f38826t0.x1(auracastViewModel);
        }
        if ((j4 & 17408) != 0) {
            this.f38816j0.x1(auracastFragment);
            this.f38817k0.x1(auracastFragment);
            this.f38820n0.x1(auracastFragment);
            this.f38825s0.z1(auracastFragment);
            this.f38826t0.y1(auracastFragment);
        }
        if (j15 != 0) {
            this.f38825s0.x1(cVar);
        }
        if (j13 != 0) {
            this.f38826t0.z1(eVar);
        }
        ViewDataBinding.x(this.f38817k0);
        ViewDataBinding.x(this.f38826t0);
        ViewDataBinding.x(this.f38823q0);
        ViewDataBinding.x(this.f38821o0);
        ViewDataBinding.x(this.f38818l0);
        ViewDataBinding.x(this.f38819m0);
        ViewDataBinding.x(this.f38816j0);
        ViewDataBinding.x(this.f38825s0);
        ViewDataBinding.x(this.f38820n0);
    }

    @Override // com.harman.jbl.partybox.databinding.K1
    public void y1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f38829w0 = auracastViewModel;
        synchronized (this) {
            this.f38858A0 |= PlaybackStateCompat.f4288c0;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.K1
    public void z1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f38828v0 = auracastFragment;
        synchronized (this) {
            this.f38858A0 |= PlaybackStateCompat.f4286a0;
        }
        g(7);
        super.B0();
    }

    private L1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 10, (AbstractC1859d2) objArr[9], (AbstractC1958x2) objArr[3], (S1) objArr[7], (W1) objArr[8], (F2) objArr[11], (O1) objArr[6], (ConstraintLayout) objArr[1], (Q1) objArr[5], (LottieAnimationView) objArr[12], (L2) objArr[10], (U1) objArr[4], (ConstraintLayout) objArr[2]);
        this.f38858A0 = -1L;
        L0(this.f38816j0);
        L0(this.f38817k0);
        L0(this.f38818l0);
        L0(this.f38819m0);
        L0(this.f38820n0);
        L0(this.f38821o0);
        this.f38822p0.setTag(null);
        L0(this.f38823q0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f38859z0 = constraintLayout;
        constraintLayout.setTag(null);
        L0(this.f38825s0);
        L0(this.f38826t0);
        this.f38827u0.setTag(null);
        N0(view);
        j0();
    }
}
