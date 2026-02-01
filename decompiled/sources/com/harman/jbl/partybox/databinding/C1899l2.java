package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;

/* renamed from: com.harman.jbl.partybox.databinding.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1899l2 extends AbstractC1894k2 implements a.InterfaceC0358a {

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39820q0 = null;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39821r0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39822n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39823o0;

    /* renamed from: p0, reason: collision with root package name */
    private long f39824p0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39821r0 = sparseIntArray;
        sparseIntArray.put(j.h.G6, 2);
        sparseIntArray.put(j.h.Yi, 3);
    }

    public C1899l2(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 4, f39820q0, f39821r0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastFragment auracastFragment = this.f39772m0;
        if (auracastFragment != null) {
            auracastFragment.onBtnGrantClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            v1((AuracastFragment) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39824p0 != 0) {
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
            this.f39824p0 = 2L;
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
            j4 = this.f39824p0;
            this.f39824p0 = 0L;
        }
        if ((j4 & 2) != 0) {
            this.f39769j0.setOnClickListener(this.f39823o0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1894k2
    public void v1(@androidx.annotation.P AuracastFragment auracastFragment) {
        this.f39772m0 = auracastFragment;
        synchronized (this) {
            this.f39824p0 |= 1;
        }
        g(7);
        super.B0();
    }

    private C1899l2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (TextView) objArr[1], (ImageView) objArr[2], (TextView) objArr[3]);
        this.f39824p0 = -1L;
        this.f39769j0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39822n0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        this.f39823o0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
