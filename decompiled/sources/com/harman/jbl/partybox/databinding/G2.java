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
import java.util.List;

/* loaded from: classes2.dex */
public class G2 extends F2 implements a.InterfaceC0358a {

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38654q0 = null;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38655r0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38656o0;

    /* renamed from: p0, reason: collision with root package name */
    private long f38657p0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38655r0 = sparseIntArray;
        sparseIntArray.put(j.h.f7, 2);
    }

    public G2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 3, f38654q0, f38655r0));
    }

    private boolean y1(LiveData<List<HmDevice>> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38657p0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean z1(androidx.lifecycle.N<Boolean> n4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38657p0 |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastFragment auracastFragment = this.f38618n0;
        if (auracastFragment != null) {
            auracastFragment.onBtnNearbyDeviceClick();
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
                if (this.f38657p0 != 0) {
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
            this.f38657p0 = 16L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return z1((androidx.lifecycle.N) obj, i5);
        }
        return y1((LiveData) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.f38657p0     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            r13.f38657p0 = r2     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7d
            com.harman.jbl.partybox.ui.party.auracast.AuracastFragment r4 = r13.f38618n0
            com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel r5 = r13.f38617m0
            r6 = 22
            long r8 = r0 & r6
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L41
            if (r4 == 0) goto L1d
            androidx.lifecycle.N r4 = r4.getMoreDeviceIcVisible()
            goto L1e
        L1d:
            r4 = r10
        L1e:
            r11 = 1
            r13.j1(r11, r4)
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r4.f()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            goto L2c
        L2b:
            r4 = r10
        L2c:
            boolean r4 = androidx.databinding.ViewDataBinding.J0(r4)
            if (r8 == 0) goto L3b
            if (r4 == 0) goto L38
            r11 = 64
        L36:
            long r0 = r0 | r11
            goto L3b
        L38:
            r11 = 32
            goto L36
        L3b:
            if (r4 == 0) goto L3e
            goto L41
        L3e:
            r4 = 8
            goto L42
        L41:
            r4 = r9
        L42:
            r11 = 25
            long r11 = r11 & r0
            int r8 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r8 == 0) goto L5d
            if (r5 == 0) goto L50
            androidx.lifecycle.LiveData r5 = r5.k0()
            goto L51
        L50:
            r5 = r10
        L51:
            r13.j1(r9, r5)
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r5.f()
            r10 = r5
            java.util.List r10 = (java.util.List) r10
        L5d:
            r11 = 16
            long r11 = r11 & r0
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L6b
            androidx.constraintlayout.widget.ConstraintLayout r5 = r13.f38615k0
            android.view.View$OnClickListener r9 = r13.f38656o0
            r5.setOnClickListener(r9)
        L6b:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L75
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f38615k0
            r0.setVisibility(r4)
        L75:
            if (r8 == 0) goto L7c
            com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView r0 = r13.f38616l0
            com.harman.jbl.partybox.ui.party.a.O(r0, r10)
        L7c:
            return
        L7d:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.G2.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.F2
    public void w1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f38617m0 = auracastViewModel;
        synchronized (this) {
            this.f38657p0 |= 8;
        }
        g(2);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.F2
    public void x1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f38618n0 = auracastFragment;
        synchronized (this) {
            this.f38657p0 |= 4;
        }
        g(7);
        super.B0();
    }

    private G2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (ImageView) objArr[2], (ConstraintLayout) objArr[0], (HmCustomFontTextView) objArr[1]);
        this.f38657p0 = -1L;
        this.f38615k0.setTag(null);
        this.f38616l0.setTag(null);
        N0(view);
        this.f38656o0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
