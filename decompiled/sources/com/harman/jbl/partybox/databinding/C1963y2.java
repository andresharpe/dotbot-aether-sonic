package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPartyStyle;

/* renamed from: com.harman.jbl.partybox.databinding.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1963y2 extends AbstractC1958x2 {

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40339p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40340q0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40341n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f40342o0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        f40339p0 = iVar;
        iVar.a(0, new String[]{"layout_party_without_broadcaster", "layout_party_with_broadcaster"}, new int[]{1, 2}, new int[]{j.i.f41509j2, j.i.f41505i2});
        f40340q0 = null;
    }

    public C1963y2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 3, f40339p0, f40340q0));
    }

    private boolean A1(Y2 y22, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40342o0 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean y1(androidx.lifecycle.P<EnumPartyStyle> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40342o0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean z1(W2 w22, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40342o0 |= 4;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M0(@androidx.annotation.P androidx.lifecycle.E e4) {
        super.M0(e4);
        this.f40309k0.M0(e4);
        this.f40308j0.M0(e4);
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
                if (this.f40342o0 != 0) {
                    return true;
                }
                if (this.f40309k0.h0() || this.f40308j0.h0()) {
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
            this.f40342o0 = 32L;
        }
        this.f40309k0.j0();
        this.f40308j0.j0();
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return false;
                }
                return z1((W2) obj, i5);
            }
            return A1((Y2) obj, i5);
        }
        return y1((androidx.lifecycle.P) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        int i4;
        androidx.lifecycle.P<EnumPartyStyle> p4;
        boolean z3;
        long j5;
        long j6;
        synchronized (this) {
            j4 = this.f40342o0;
            this.f40342o0 = 0L;
        }
        AuracastFragment auracastFragment = this.f40311m0;
        AuracastViewModel auracastViewModel = this.f40310l0;
        long j7 = j4 & 41;
        int i5 = 0;
        if (j7 != 0) {
            EnumPartyStyle enumPartyStyle = null;
            if (auracastFragment != null) {
                p4 = auracastFragment.getPartyLayoutStyle();
            } else {
                p4 = null;
            }
            j1(0, p4);
            if (p4 != null) {
                enumPartyStyle = p4.f();
            }
            boolean z4 = true;
            if (EnumPartyStyle.NO_BROADCASTER == enumPartyStyle) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (EnumPartyStyle.BROADCASTER != enumPartyStyle) {
                z4 = false;
            }
            if (j7 != 0) {
                if (z3) {
                    j6 = 128;
                } else {
                    j6 = 64;
                }
                j4 |= j6;
            }
            if ((j4 & 41) != 0) {
                if (z4) {
                    j5 = 512;
                } else {
                    j5 = 256;
                }
                j4 |= j5;
            }
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            if (!z4) {
                i5 = 8;
            }
        } else {
            i4 = 0;
        }
        long j8 = 48 & j4;
        if ((41 & j4) != 0) {
            this.f40308j0.d().setVisibility(i5);
            this.f40309k0.d().setVisibility(i4);
        }
        if (j8 != 0) {
            this.f40308j0.w1(auracastViewModel);
            this.f40309k0.w1(auracastViewModel);
        }
        if ((j4 & 40) != 0) {
            this.f40308j0.x1(auracastFragment);
            this.f40309k0.x1(auracastFragment);
        }
        ViewDataBinding.x(this.f40309k0);
        ViewDataBinding.x(this.f40308j0);
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1958x2
    public void w1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f40310l0 = auracastViewModel;
        synchronized (this) {
            this.f40342o0 |= 16;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1958x2
    public void x1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f40311m0 = auracastFragment;
        synchronized (this) {
            this.f40342o0 |= 8;
        }
        g(7);
        super.B0();
    }

    private C1963y2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 3, (W2) objArr[2], (Y2) objArr[1]);
        this.f40342o0 = -1L;
        L0(this.f40308j0);
        L0(this.f40309k0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f40341n0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        j0();
    }
}
