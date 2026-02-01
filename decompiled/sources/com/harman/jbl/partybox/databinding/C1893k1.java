package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1893k1 extends AbstractC1888j1 implements a.InterfaceC0358a {

    /* renamed from: C0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39763C0;

    /* renamed from: D0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39764D0;

    /* renamed from: A0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39765A0;

    /* renamed from: B0, reason: collision with root package name */
    private long f39766B0;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39767y0;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.N
    private final ImageView f39768z0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(15);
        f39763C0 = iVar;
        iVar.a(0, new String[]{"layout_stereo_banner_placement", "layout_stereo_banner_select_channel"}, new int[]{6, 7}, new int[]{j.i.f41553u2, j.i.f41561w2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39764D0 = sparseIntArray;
        sparseIntArray.put(j.h.Yg, 8);
        sparseIntArray.put(j.h.Ai, 9);
        sparseIntArray.put(j.h.Q8, 10);
        sparseIntArray.put(j.h.w5, 11);
        sparseIntArray.put(j.h.v5, 12);
        sparseIntArray.put(j.h.Wf, 13);
        sparseIntArray.put(j.h.dg, 14);
    }

    public C1893k1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 15, f39763C0, f39764D0));
    }

    private boolean A1(LiveData<Boolean> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39766B0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean B1(LiveData<HmDevice> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39766B0 |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean C1(LiveData<HmDevice> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39766B0 |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean D1(LiveData<com.harman.jbl.partybox.ui.party.stereo.state.create.e> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39766B0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean y1(AbstractC1905m3 abstractC1905m3, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39766B0 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean z1(AbstractC1925q3 abstractC1925q3, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39766B0 |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M0(@androidx.annotation.P androidx.lifecycle.E e4) {
        super.M0(e4);
        this.f39711o0.M0(e4);
        this.f39712p0.M0(e4);
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        StereoCreateFragment stereoCreateFragment = this.f39719w0;
        if (stereoCreateFragment != null) {
            stereoCreateFragment.onBtnBackClick();
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
                if (this.f39766B0 != 0) {
                    return true;
                }
                if (this.f39711o0.h0() || this.f39712p0.h0()) {
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
            this.f39766B0 = 256L;
        }
        this.f39711o0.j0();
        this.f39712p0.j0();
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return false;
                            }
                            return B1((LiveData) obj, i5);
                        }
                        return C1((LiveData) obj, i5);
                    }
                    return D1((LiveData) obj, i5);
                }
                return A1((LiveData) obj, i5);
            }
            return z1((AbstractC1925q3) obj, i5);
        }
        return y1((AbstractC1905m3) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.C1893k1.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1888j1
    public void w1(@androidx.annotation.P StereoCreateFragment stereoCreateFragment) {
        this.f39719w0 = stereoCreateFragment;
        synchronized (this) {
            this.f39766B0 |= 64;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1888j1
    public void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.s sVar) {
        this.f39720x0 = sVar;
        synchronized (this) {
            this.f39766B0 |= 128;
        }
        g(11);
        super.B0();
    }

    private C1893k1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 6, (Guideline) objArr[12], (Guideline) objArr[11], (ImageView) objArr[3], (ImageView) objArr[2], (ConstraintLayout) objArr[10], (AbstractC1905m3) objArr[6], (AbstractC1925q3) objArr[7], (LottieAnimationView) objArr[4], (View) objArr[13], (View) objArr[14], (ConstraintLayout) objArr[8], (HmCustomFontTextView) objArr[5], (HmCustomFontTextView) objArr[9]);
        this.f39766B0 = -1L;
        this.f39708l0.setTag(null);
        this.f39709m0.setTag(null);
        L0(this.f39711o0);
        L0(this.f39712p0);
        this.f39713q0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39767y0 = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f39768z0 = imageView;
        imageView.setTag(null);
        this.f39717u0.setTag(null);
        N0(view);
        this.f39765A0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
