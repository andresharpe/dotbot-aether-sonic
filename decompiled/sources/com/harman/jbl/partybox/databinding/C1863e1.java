package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;

/* renamed from: com.harman.jbl.partybox.databinding.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1863e1 extends AbstractC1858d1 {

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39511o0 = null;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39512p0 = null;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f39513m0;

    /* renamed from: n0, reason: collision with root package name */
    private long f39514n0;

    public C1863e1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 3, f39511o0, f39512p0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (6 == i4) {
            v1((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39514n0 != 0) {
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
            this.f39514n0 = 2L;
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
        int i4;
        long j5;
        synchronized (this) {
            j4 = this.f39514n0;
            this.f39514n0 = 0L;
        }
        Boolean bool = this.f39469l0;
        long j6 = j4 & 3;
        int i5 = 0;
        if (j6 != 0) {
            boolean J02 = ViewDataBinding.J0(bool);
            if (j6 != 0) {
                if (J02) {
                    j5 = 40;
                } else {
                    j5 = 20;
                }
                j4 |= j5;
            }
            if (J02) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            if (J02) {
                i5 = 8;
            }
        } else {
            i4 = 0;
        }
        if ((j4 & 3) != 0) {
            this.f39467j0.setVisibility(i5);
            this.f39468k0.setVisibility(i4);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1858d1
    public void v1(@androidx.annotation.P Boolean bool) {
        this.f39469l0 = bool;
        synchronized (this) {
            this.f39514n0 |= 1;
        }
        g(6);
        super.B0();
    }

    private C1863e1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[2], (SurfaceView) objArr[1]);
        this.f39514n0 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f39513m0 = frameLayout;
        frameLayout.setTag(null);
        this.f39467j0.setTag(null);
        this.f39468k0.setTag(null);
        N0(view);
        j0();
    }
}
