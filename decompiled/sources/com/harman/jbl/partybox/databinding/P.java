package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPageStyle;

/* loaded from: classes2.dex */
public class P extends O implements a.InterfaceC0358a {

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38944x0;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38945y0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38946u0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38947v0;

    /* renamed from: w0, reason: collision with root package name */
    private long f38948w0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(8);
        f38944x0 = iVar;
        iVar.a(0, new String[]{"layout_grant_permission", "layout_no_product_connect", "layout_auracast"}, new int[]{4, 5, 6}, new int[]{j.i.f41404J1, j.i.f41489e2, j.i.f41540r1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38945y0 = sparseIntArray;
        sparseIntArray.put(j.h.H9, 3);
        sparseIntArray.put(j.h.f41234X2, 7);
    }

    public P(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 8, f38944x0, f38945y0));
    }

    private boolean C1(androidx.lifecycle.P<EnumPageStyle> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38948w0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean D1(LiveData<String> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38948w0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean E1(K1 k12, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38948w0 |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean F1(AbstractC1894k2 abstractC1894k2, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38948w0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean G1(P2 p22, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38948w0 |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.databinding.O
    public void A1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.c cVar) {
        this.f38923t0 = cVar;
        synchronized (this) {
            this.f38948w0 |= 256;
        }
        g(8);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.O
    public void B1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.e eVar) {
        this.f38922s0 = eVar;
        synchronized (this) {
            this.f38948w0 |= 64;
        }
        g(10);
        super.B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M0(@androidx.annotation.P androidx.lifecycle.E e4) {
        super.M0(e4);
        this.f38916m0.M0(e4);
        this.f38917n0.M0(e4);
        this.f38915l0.M0(e4);
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastFragment auracastFragment = this.f38920q0;
        if (auracastFragment != null) {
            auracastFragment.onInfoClicked();
        }
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
                if (this.f38948w0 != 0) {
                    return true;
                }
                if (this.f38916m0.h0() || this.f38917n0.h0() || this.f38915l0.h0()) {
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
            this.f38948w0 = 512L;
        }
        this.f38916m0.j0();
        this.f38917n0.j0();
        this.f38915l0.j0();
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return false;
                        }
                        return E1((K1) obj, i5);
                    }
                    return D1((LiveData) obj, i5);
                }
                return C1((androidx.lifecycle.P) obj, i5);
            }
            return G1((P2) obj, i5);
        }
        return F1((AbstractC1894k2) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.P.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.O
    public void y1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f38921r0 = auracastViewModel;
        synchronized (this) {
            this.f38948w0 |= 128;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.O
    public void z1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f38920q0 = auracastFragment;
        synchronized (this) {
            this.f38948w0 |= 32;
        }
        g(7);
        super.B0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private P(androidx.databinding.l r15, android.view.View r16, java.lang.Object[] r17) {
        /*
            r14 = this;
            r11 = r14
            r3 = 5
            r0 = 7
            r0 = r17[r0]
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r12 = 1
            r0 = r17[r12]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 6
            r0 = r17[r0]
            r6 = r0
            com.harman.jbl.partybox.databinding.K1 r6 = (com.harman.jbl.partybox.databinding.K1) r6
            r0 = 4
            r0 = r17[r0]
            r7 = r0
            com.harman.jbl.partybox.databinding.k2 r7 = (com.harman.jbl.partybox.databinding.AbstractC1894k2) r7
            r0 = 5
            r0 = r17[r0]
            r8 = r0
            com.harman.jbl.partybox.databinding.P2 r8 = (com.harman.jbl.partybox.databinding.P2) r8
            r0 = 3
            r0 = r17[r0]
            r13 = 0
            if (r0 == 0) goto L2e
            android.view.View r0 = (android.view.View) r0
            K2.g r0 = K2.g.a(r0)
            r9 = r0
            goto L2f
        L2e:
            r9 = r13
        L2f:
            r0 = 2
            r0 = r17[r0]
            r10 = r0
            com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView r10 = (com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView) r10
            r0 = r14
            r1 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r11.f38948w0 = r0
            android.widget.ImageView r0 = r11.f38914k0
            r0.setTag(r13)
            com.harman.jbl.partybox.databinding.K1 r0 = r11.f38915l0
            r14.L0(r0)
            com.harman.jbl.partybox.databinding.k2 r0 = r11.f38916m0
            r14.L0(r0)
            com.harman.jbl.partybox.databinding.P2 r0 = r11.f38917n0
            r14.L0(r0)
            r0 = 0
            r0 = r17[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r11.f38946u0 = r0
            r0.setTag(r13)
            com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView r0 = r11.f38919p0
            r0.setTag(r13)
            r0 = r16
            r14.N0(r0)
            com.harman.jbl.partybox.generated.callback.a r0 = new com.harman.jbl.partybox.generated.callback.a
            r0.<init>(r14, r12)
            r11.f38947v0 = r0
            r14.j0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.P.<init>(androidx.databinding.l, android.view.View, java.lang.Object[]):void");
    }
}
