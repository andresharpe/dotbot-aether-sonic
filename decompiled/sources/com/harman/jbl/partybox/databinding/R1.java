package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;

/* loaded from: classes2.dex */
public class R1 extends Q1 {

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39007n0 = null;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39008o0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39009l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f39010m0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39008o0 = sparseIntArray;
        sparseIntArray.put(j.h.l6, 1);
        sparseIntArray.put(j.h.zi, 2);
    }

    public R1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 3, f39007n0, f39008o0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39010m0 != 0) {
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
            this.f39010m0 = 1L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        synchronized (this) {
            this.f39010m0 = 0L;
        }
    }

    private R1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (LottieAnimationView) objArr[1], (HmCustomFontTextView) objArr[2]);
        this.f39010m0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39009l0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        j0();
    }
}
