package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;

/* loaded from: classes2.dex */
public class N1 extends M1 {

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38897n0 = null;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38898o0 = null;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38899l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f38900m0;

    public N1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 1, f38897n0, f38898o0));
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
                if (this.f38900m0 != 0) {
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
            this.f38900m0 = 4L;
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
            this.f38900m0 = 0L;
        }
    }

    @Override // com.harman.jbl.partybox.databinding.M1
    public void w1(@androidx.annotation.P AuracastViewModel auracastViewModel) {
        this.f38881j0 = auracastViewModel;
    }

    @Override // com.harman.jbl.partybox.databinding.M1
    public void x1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f38882k0 = auracastFragment;
    }

    private N1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0);
        this.f38900m0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f38899l0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        j0();
    }
}
