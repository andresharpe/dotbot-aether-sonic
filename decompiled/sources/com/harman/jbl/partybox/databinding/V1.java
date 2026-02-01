package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;
import java.util.List;

/* loaded from: classes2.dex */
public class V1 extends U1 implements a.InterfaceC0358a {

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39151u0 = null;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39152v0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39153r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39154s0;

    /* renamed from: t0, reason: collision with root package name */
    private long f39155t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39152v0 = sparseIntArray;
        sparseIntArray.put(j.h.D8, 3);
        sparseIntArray.put(j.h.Ah, 4);
        sparseIntArray.put(j.h.C9, 5);
    }

    public V1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 6, f39151u0, f39152v0));
    }

    private boolean A1(LiveData<List<HmDevice>> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39155t0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean B1(androidx.lifecycle.N<Boolean> n4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39155t0 |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastFragment auracastFragment = this.f39128q0;
        if (auracastFragment != null) {
            auracastFragment.onBtnAddSpeakNarrowClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            y1((AuracastFragment) obj);
        } else if (10 == i4) {
            z1((com.harman.jbl.partybox.ui.party.auracast.ui.e) obj);
        } else if (2 == i4) {
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
                if (this.f39155t0 != 0) {
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
            this.f39155t0 = 32L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return B1((androidx.lifecycle.N) obj, i5);
        }
        return A1((LiveData) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.f39155t0     // Catch: java.lang.Throwable -> L8b
            r2 = 0
            r15.f39155t0 = r2     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L8b
            com.harman.jbl.partybox.ui.party.auracast.AuracastFragment r4 = r15.f39128q0
            com.harman.jbl.partybox.ui.party.auracast.ui.e r5 = r15.f39126o0
            com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel r6 = r15.f39127p0
            r7 = 38
            long r9 = r0 & r7
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L43
            if (r4 == 0) goto L1f
            androidx.lifecycle.N r4 = r4.getShowNearByExpandMore()
            goto L20
        L1f:
            r4 = r11
        L20:
            r12 = 1
            r15.j1(r12, r4)
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r4.f()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            goto L2e
        L2d:
            r4 = r11
        L2e:
            boolean r4 = androidx.databinding.ViewDataBinding.J0(r4)
            if (r9 == 0) goto L3d
            if (r4 == 0) goto L3a
            r12 = 128(0x80, double:6.32E-322)
        L38:
            long r0 = r0 | r12
            goto L3d
        L3a:
            r12 = 64
            goto L38
        L3d:
            if (r4 == 0) goto L40
            goto L43
        L40:
            r4 = 8
            goto L44
        L43:
            r4 = r10
        L44:
            r12 = 40
            long r12 = r12 & r0
            int r9 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            r12 = 49
            long r12 = r12 & r0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L64
            if (r6 == 0) goto L57
            androidx.lifecycle.LiveData r6 = r6.k0()
            goto L58
        L57:
            r6 = r11
        L58:
            r15.j1(r10, r6)
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.f()
            r11 = r6
            java.util.List r11 = (java.util.List) r11
        L64:
            r13 = 32
            long r13 = r13 & r0
            int r6 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r6 == 0) goto L72
            android.widget.ImageView r6 = r15.f39121j0
            android.view.View$OnClickListener r10 = r15.f39154s0
            r6.setOnClickListener(r10)
        L72:
            long r0 = r0 & r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L7c
            android.widget.ImageView r0 = r15.f39121j0
            r0.setVisibility(r4)
        L7c:
            if (r9 == 0) goto L83
            androidx.recyclerview.widget.RecyclerView r0 = r15.f39124m0
            com.harman.jbl.partybox.ui.party.a.v(r0, r5)
        L83:
            if (r12 == 0) goto L8a
            androidx.recyclerview.widget.RecyclerView r0 = r15.f39124m0
            com.harman.jbl.partybox.ui.party.a.F(r0, r11)
        L8a:
            return
        L8b:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L8b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.V1.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.U1
    public void x1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f39127p0 = auracastViewModel;
        synchronized (this) {
            this.f39155t0 |= 16;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.U1
    public void y1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f39128q0 = auracastFragment;
        synchronized (this) {
            this.f39155t0 |= 4;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.U1
    public void z1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.e eVar) {
        this.f39126o0 = eVar;
        synchronized (this) {
            this.f39155t0 |= 8;
        }
        g(10);
        super.B0();
    }

    private V1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (ImageView) objArr[1], (ConstraintLayout) objArr[3], (NestedScrollView) objArr[5], (RecyclerView) objArr[2], (HmCustomFontTextView) objArr[4]);
        this.f39155t0 = -1L;
        this.f39121j0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39153r0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f39124m0.setTag(null);
        N0(view);
        this.f39154s0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
