package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.scrollpageindicator.ViewPagerIndicator;
import com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment;
import com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoScanPageStyle;
import com.harman.sdk.device.HmDevice;
import java.util.List;

/* renamed from: com.harman.jbl.partybox.databinding.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1913o1 extends AbstractC1908n1 implements a.InterfaceC0358a {

    /* renamed from: I0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39924I0 = null;

    /* renamed from: J0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39925J0;

    /* renamed from: A0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39926A0;

    /* renamed from: B0, reason: collision with root package name */
    @androidx.annotation.N
    private final ImageView f39927B0;

    /* renamed from: C0, reason: collision with root package name */
    @androidx.annotation.N
    private final ImageView f39928C0;

    /* renamed from: D0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39929D0;

    /* renamed from: E0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39930E0;

    /* renamed from: F0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39931F0;

    /* renamed from: G0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39932G0;

    /* renamed from: H0, reason: collision with root package name */
    private long f39933H0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39925J0 = sparseIntArray;
        sparseIntArray.put(j.h.Yg, 11);
        sparseIntArray.put(j.h.Ai, 12);
        sparseIntArray.put(j.h.fi, 13);
        sparseIntArray.put(j.h.L5, 14);
        sparseIntArray.put(j.h.u5, 15);
        sparseIntArray.put(j.h.Wf, 16);
        sparseIntArray.put(j.h.dg, 17);
    }

    public C1913o1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 18, f39924I0, f39925J0));
    }

    private boolean A1(LiveData<List<HmDevice>> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39933H0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean B1(LiveData<EnumStereoScanPageStyle> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39933H0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean C1(androidx.lifecycle.P<Boolean> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39933H0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean y1(LiveData<String> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39933H0 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean z1(LiveData<HmDevice> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39933H0 |= 16;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        StereoScanFragment stereoScanFragment;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4 && (stereoScanFragment = this.f39900y0) != null) {
                        stereoScanFragment.onDeviceTipClick();
                        return;
                    }
                    return;
                }
                StereoScanFragment stereoScanFragment2 = this.f39900y0;
                if (stereoScanFragment2 != null) {
                    stereoScanFragment2.onNextBtnClick();
                    return;
                }
                return;
            }
            StereoScanFragment stereoScanFragment3 = this.f39900y0;
            if (stereoScanFragment3 != null) {
                stereoScanFragment3.closeShowTips();
                return;
            }
            return;
        }
        StereoScanFragment stereoScanFragment4 = this.f39900y0;
        if (stereoScanFragment4 != null) {
            stereoScanFragment4.onBtnBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            w1((StereoScanFragment) obj);
        } else if (11 == i4) {
            x1((StereoScanViewModel) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39933H0 != 0) {
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
            this.f39933H0 = 128L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return false;
                        }
                        return z1((LiveData) obj, i5);
                    }
                    return B1((LiveData) obj, i5);
                }
                return C1((androidx.lifecycle.P) obj, i5);
            }
            return y1((LiveData) obj, i5);
        }
        return A1((LiveData) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.C1913o1.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1908n1
    public void w1(@androidx.annotation.P StereoScanFragment stereoScanFragment) {
        this.f39900y0 = stereoScanFragment;
        synchronized (this) {
            this.f39933H0 |= 32;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1908n1
    public void x1(@androidx.annotation.P StereoScanViewModel stereoScanViewModel) {
        this.f39901z0 = stereoScanViewModel;
        synchronized (this) {
            this.f39933H0 |= 64;
        }
        g(11);
        super.B0();
    }

    private C1913o1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 5, (HmCustomFontTextView) objArr[6], (ViewPagerIndicator) objArr[7], (Guideline) objArr[15], (ImageView) objArr[14], (ImageView) objArr[4], (LinearLayout) objArr[2], (LottieAnimationView) objArr[10], (View) objArr[16], (View) objArr[17], (ConstraintLayout) objArr[11], (HmCustomFontTextView) objArr[5], (HmCustomFontTextView) objArr[9], (HmCustomFontTextView) objArr[13], (HmCustomFontTextView) objArr[12], (ViewPager2) objArr[8]);
        this.f39933H0 = -1L;
        this.f39885j0.setTag(null);
        this.f39886k0.setTag(null);
        this.f39889n0.setTag(null);
        this.f39890o0.setTag(null);
        this.f39891p0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39926A0 = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f39927B0 = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[3];
        this.f39928C0 = imageView2;
        imageView2.setTag(null);
        this.f39895t0.setTag(null);
        this.f39896u0.setTag(null);
        this.f39899x0.setTag(null);
        N0(view);
        this.f39929D0 = new com.harman.jbl.partybox.generated.callback.a(this, 4);
        this.f39930E0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        this.f39931F0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f39932G0 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        j0();
    }
}
