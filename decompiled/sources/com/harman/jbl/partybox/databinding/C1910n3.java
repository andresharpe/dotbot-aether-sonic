package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment;

/* renamed from: com.harman.jbl.partybox.databinding.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1910n3 extends AbstractC1905m3 implements a.InterfaceC0358a {

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39907p0 = null;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39908q0 = null;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f39909m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39910n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f39911o0;

    public C1910n3(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 2, f39907p0, f39908q0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        StereoCreateFragment stereoCreateFragment = this.f39855k0;
        if (stereoCreateFragment != null) {
            stereoCreateFragment.onPlacementBannerBtnClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            w1((StereoCreateFragment) obj);
        } else if (11 == i4) {
            x1((com.harman.jbl.partybox.ui.party.stereo.s) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39911o0 != 0) {
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
            this.f39911o0 = 4L;
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
            j4 = this.f39911o0;
            this.f39911o0 = 0L;
        }
        if ((j4 & 4) != 0) {
            this.f39854j0.setOnClickListener(this.f39910n0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1905m3
    public void w1(@androidx.annotation.P StereoCreateFragment stereoCreateFragment) {
        this.f39855k0 = stereoCreateFragment;
        synchronized (this) {
            this.f39911o0 |= 1;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1905m3
    public void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.s sVar) {
        this.f39856l0 = sVar;
    }

    private C1910n3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (HmCustomFontTextView) objArr[1]);
        this.f39911o0 = -1L;
        this.f39854j0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f39909m0 = linearLayout;
        linearLayout.setTag(null);
        N0(view);
        this.f39910n0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
