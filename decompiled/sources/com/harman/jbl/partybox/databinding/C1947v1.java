package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.welcome.WelcomeFragment;

/* renamed from: com.harman.jbl.partybox.databinding.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1947v1 extends AbstractC1942u1 implements a.InterfaceC0358a {

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40229r0 = null;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40230s0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40231o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40232p0;

    /* renamed from: q0, reason: collision with root package name */
    private long f40233q0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40230s0 = sparseIntArray;
        sparseIntArray.put(j.h.Ig, 2);
        sparseIntArray.put(j.h.Eg, 3);
        sparseIntArray.put(j.h.v6, 4);
    }

    public C1947v1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 5, f40229r0, f40230s0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        WelcomeFragment welcomeFragment = this.f40196n0;
        if (welcomeFragment != null) {
            welcomeFragment.getStartedButtonClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            v1((WelcomeFragment) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f40233q0 != 0) {
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
            this.f40233q0 = 2L;
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
            j4 = this.f40233q0;
            this.f40233q0 = 0L;
        }
        if ((j4 & 2) != 0) {
            this.f40192j0.setOnClickListener(this.f40232p0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1942u1
    public void v1(@androidx.annotation.P WelcomeFragment welcomeFragment) {
        this.f40196n0 = welcomeFragment;
        synchronized (this) {
            this.f40233q0 |= 1;
        }
        g(7);
        super.B0();
    }

    private C1947v1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (TextView) objArr[1], (ImageView) objArr[4], (TextView) objArr[3], (TextView) objArr[2]);
        this.f40233q0 = -1L;
        this.f40192j0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f40231o0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        this.f40232p0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
