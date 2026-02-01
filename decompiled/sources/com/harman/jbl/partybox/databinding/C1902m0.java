package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.support.FactoryResetFragment;

/* renamed from: com.harman.jbl.partybox.databinding.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1902m0 extends AbstractC1897l0 implements a.InterfaceC0358a {

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39839u0 = null;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39840v0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayoutCompat f39841q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    private final ImageView f39842r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39843s0;

    /* renamed from: t0, reason: collision with root package name */
    private long f39844t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39840v0 = sparseIntArray;
        sparseIntArray.put(j.h.Yg, 2);
        sparseIntArray.put(j.h.Ai, 3);
        sparseIntArray.put(j.h.w5, 4);
        sparseIntArray.put(j.h.S5, 5);
        sparseIntArray.put(j.h.z7, 6);
        sparseIntArray.put(j.h.G7, 7);
    }

    public C1902m0(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 8, f39839u0, f39840v0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        FactoryResetFragment factoryResetFragment = this.f39807p0;
        if (factoryResetFragment != null) {
            factoryResetFragment.onBtnBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            v1((FactoryResetFragment) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39844t0 != 0) {
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
            this.f39844t0 = 2L;
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
            j4 = this.f39844t0;
            this.f39844t0 = 0L;
        }
        if ((j4 & 2) != 0) {
            this.f39842r0.setOnClickListener(this.f39843s0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1897l0
    public void v1(@androidx.annotation.P FactoryResetFragment factoryResetFragment) {
        this.f39807p0 = factoryResetFragment;
        synchronized (this) {
            this.f39844t0 |= 1;
        }
        g(7);
        super.B0();
    }

    private C1902m0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (Guideline) objArr[4], (ImageView) objArr[5], (ImageView) objArr[6], (ImageView) objArr[7], (ConstraintLayout) objArr[2], (HmCustomFontTextView) objArr[3]);
        this.f39844t0 = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f39841q0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f39842r0 = imageView;
        imageView.setTag(null);
        N0(view);
        this.f39843s0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
