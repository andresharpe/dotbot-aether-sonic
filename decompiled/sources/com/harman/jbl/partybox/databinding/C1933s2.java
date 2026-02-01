package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment;

/* renamed from: com.harman.jbl.partybox.databinding.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1933s2 extends AbstractC1928r2 implements a.InterfaceC0358a {

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40120t0 = null;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40121u0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40122q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40123r0;

    /* renamed from: s0, reason: collision with root package name */
    private long f40124s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40121u0 = sparseIntArray;
        sparseIntArray.put(j.h.L8, 1);
        sparseIntArray.put(j.h.Z8, 2);
        sparseIntArray.put(j.h.b6, 3);
        sparseIntArray.put(j.h.Yh, 4);
        sparseIntArray.put(j.h.x3, 5);
        sparseIntArray.put(j.h.H5, 6);
    }

    public C1933s2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 7, f40120t0, f40121u0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        StageDashboardFragment stageDashboardFragment = this.f40094p0;
        if (stageDashboardFragment != null) {
            stageDashboardFragment.onBannerInAPlayTogetherPartyClicked();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            v1((StageDashboardFragment) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f40124s0 != 0) {
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
            this.f40124s0 = 2L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        synchronized (this) {
            j4 = this.f40124s0;
            this.f40124s0 = 0L;
        }
        if ((j4 & 2) != 0) {
            this.f40122q0.setOnClickListener(this.f40123r0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1928r2
    public void v1(@androidx.annotation.P StageDashboardFragment stageDashboardFragment) {
        this.f40094p0 = stageDashboardFragment;
        synchronized (this) {
            this.f40124s0 |= 1;
        }
        g(7);
        super.B0();
    }

    private C1933s2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (HmCustomFontTextView) objArr[5], (ImageView) objArr[6], (ImageView) objArr[3], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[2], (HmCustomFontTextView) objArr[4]);
        this.f40124s0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f40122q0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        this.f40123r0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
