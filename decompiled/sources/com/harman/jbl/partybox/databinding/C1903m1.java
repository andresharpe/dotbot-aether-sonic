package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoRenameFragment;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1903m1 extends AbstractC1898l1 implements a.InterfaceC0358a {

    /* renamed from: A0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39845A0;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39846z0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39847v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.N
    private final ImageView f39848w0;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39849x0;

    /* renamed from: y0, reason: collision with root package name */
    private long f39850y0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(12);
        f39846z0 = iVar;
        iVar.a(0, new String[]{"layout_stereo_banner_rename"}, new int[]{5}, new int[]{j.i.f41557v2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39845A0 = sparseIntArray;
        sparseIntArray.put(j.h.Yg, 6);
        sparseIntArray.put(j.h.Q8, 7);
        sparseIntArray.put(j.h.Wf, 8);
        sparseIntArray.put(j.h.dg, 9);
        sparseIntArray.put(j.h.w5, 10);
        sparseIntArray.put(j.h.v5, 11);
    }

    public C1903m1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 12, f39846z0, f39845A0));
    }

    private boolean A1(AbstractC1915o3 abstractC1915o3, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39850y0 |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean B1(LiveData<HmDevice> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39850y0 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean C1(LiveData<HmDevice> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39850y0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean y1(LiveData<Boolean> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39850y0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean z1(LiveData<String> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39850y0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M0(@androidx.annotation.P androidx.lifecycle.E e4) {
        super.M0(e4);
        this.f39813o0.M0(e4);
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        StereoRenameFragment stereoRenameFragment = this.f39818t0;
        if (stereoRenameFragment != null) {
            stereoRenameFragment.onBtnBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            w1((StereoRenameFragment) obj);
        } else if (11 == i4) {
            x1((com.harman.jbl.partybox.ui.party.stereo.w) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39850y0 != 0) {
                    return true;
                }
                if (this.f39813o0.h0()) {
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
            this.f39850y0 = 128L;
        }
        this.f39813o0.j0();
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
                        return A1((AbstractC1915o3) obj, i5);
                    }
                    return C1((LiveData) obj, i5);
                }
                return y1((LiveData) obj, i5);
            }
            return B1((LiveData) obj, i5);
        }
        return z1((LiveData) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b4  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.C1903m1.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1898l1
    public void w1(@androidx.annotation.P StereoRenameFragment stereoRenameFragment) {
        this.f39818t0 = stereoRenameFragment;
        synchronized (this) {
            this.f39850y0 |= 32;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1898l1
    public void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.w wVar) {
        this.f39819u0 = wVar;
        synchronized (this) {
            this.f39850y0 |= 64;
        }
        g(11);
        super.B0();
    }

    private C1903m1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 5, (Guideline) objArr[11], (Guideline) objArr[10], (ImageView) objArr[4], (ImageView) objArr[3], (ConstraintLayout) objArr[7], (AbstractC1915o3) objArr[5], (View) objArr[8], (View) objArr[9], (ConstraintLayout) objArr[6], (HmCustomFontTextView) objArr[2]);
        this.f39850y0 = -1L;
        this.f39810l0.setTag(null);
        this.f39811m0.setTag(null);
        L0(this.f39813o0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39847v0 = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f39848w0 = imageView;
        imageView.setTag(null);
        this.f39817s0.setTag(null);
        N0(view);
        this.f39849x0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
