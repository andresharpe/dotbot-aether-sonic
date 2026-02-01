package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class I2 extends H2 {

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38736n0 = null;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38737o0 = null;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38738l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f38739m0;

    public I2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 2, f38736n0, f38737o0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (3 == i4) {
            v1(((Integer) obj).intValue());
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f38739m0 != 0) {
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
            this.f38739m0 = 2L;
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
            j4 = this.f38739m0;
            this.f38739m0 = 0L;
        }
        int i4 = this.f38694k0;
        if ((j4 & 3) != 0) {
            com.harman.jbl.partybox.ui.party.a.z(this.f38693j0, i4);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.H2
    public void v1(int i4) {
        this.f38694k0 = i4;
        synchronized (this) {
            this.f38739m0 |= 1;
        }
        g(3);
        super.B0();
    }

    private I2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[1]);
        this.f38739m0 = -1L;
        this.f38693j0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f38738l0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        j0();
    }
}
