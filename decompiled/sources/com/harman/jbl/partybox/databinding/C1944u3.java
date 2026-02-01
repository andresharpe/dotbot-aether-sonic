package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1944u3 extends AbstractC1939t3 {

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40201p0 = null;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40202q0 = null;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40203n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f40204o0;

    public C1944u3(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 3, f40201p0, f40202q0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            x1((StereoScanFragment) obj);
        } else if (4 == i4) {
            w1((HmDevice) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f40204o0 != 0) {
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
            this.f40204o0 = 4L;
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
            j4 = this.f40204o0;
            this.f40204o0 = 0L;
        }
        HmDevice hmDevice = this.f40178l0;
        if ((j4 & 6) != 0) {
            com.harman.jbl.partybox.ui.party.a.K(this.f40176j0, hmDevice);
            com.harman.jbl.partybox.ui.party.a.x(this.f40177k0, hmDevice);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1939t3
    public void w1(@androidx.annotation.P HmDevice hmDevice) {
        this.f40178l0 = hmDevice;
        synchronized (this) {
            this.f40204o0 |= 2;
        }
        g(4);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1939t3
    public void x1(@androidx.annotation.P StereoScanFragment stereoScanFragment) {
        this.f40179m0 = stereoScanFragment;
    }

    private C1944u3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[1], (HmCustomFontTextView) objArr[2]);
        this.f40204o0 = -1L;
        this.f40176j0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f40203n0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f40177k0.setTag(null);
        N0(view);
        j0();
    }
}
