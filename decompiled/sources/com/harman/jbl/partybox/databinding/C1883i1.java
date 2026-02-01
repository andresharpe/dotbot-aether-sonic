package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment;
import com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoChannelConnectState;
import com.harman.sdk.utils.AudioChannel;

/* renamed from: com.harman.jbl.partybox.databinding.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1883i1 extends AbstractC1878h1 implements a.InterfaceC0358a {

    /* renamed from: g1, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39679g1 = null;

    /* renamed from: h1, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39680h1;

    /* renamed from: Y0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39681Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @androidx.annotation.N
    private final ImageView f39682Z0;

    /* renamed from: a1, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39683a1;

    /* renamed from: b1, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39684b1;

    /* renamed from: c1, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39685c1;

    /* renamed from: d1, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39686d1;

    /* renamed from: e1, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39687e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f39688f1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39680h1 = sparseIntArray;
        sparseIntArray.put(j.h.Yg, 18);
        sparseIntArray.put(j.h.F3, 19);
        sparseIntArray.put(j.h.w5, 20);
        sparseIntArray.put(j.h.c9, 21);
        sparseIntArray.put(j.h.A9, 22);
        sparseIntArray.put(j.h.M8, 23);
        sparseIntArray.put(j.h.d6, 24);
        sparseIntArray.put(j.h.v9, 25);
        sparseIntArray.put(j.h.I5, 26);
        sparseIntArray.put(j.h.t9, 27);
        sparseIntArray.put(j.h.Mi, 28);
        sparseIntArray.put(j.h.yj, 29);
        sparseIntArray.put(j.h.Bj, 30);
        sparseIntArray.put(j.h.tb, 31);
        sparseIntArray.put(j.h.Vb, 32);
        sparseIntArray.put(j.h.Tb, 33);
        sparseIntArray.put(j.h.Ui, 34);
        sparseIntArray.put(j.h.eg, 35);
        sparseIntArray.put(j.h.bg, 36);
        sparseIntArray.put(j.h.Xi, 37);
        sparseIntArray.put(j.h.I8, 38);
        sparseIntArray.put(j.h.Y5, 39);
        sparseIntArray.put(j.h.k9, 40);
    }

    public C1883i1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 41, f39679g1, f39680h1));
    }

    private boolean A1(LiveData<Boolean> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39688f1 |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean B1(LiveData<Boolean> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39688f1 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean C1(androidx.lifecycle.N<String> n4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39688f1 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean D1(LiveData<EnumStereoChannelConnectState> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39688f1 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean y1(androidx.lifecycle.N<Boolean> n4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39688f1 |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean z1(androidx.lifecycle.N<Boolean> n4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39688f1 |= 4;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        StereoChannelFragment stereoChannelFragment;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 == 5 && (stereoChannelFragment = this.f39645W0) != null) {
                            stereoChannelFragment.onUnGroupClick();
                            return;
                        }
                        return;
                    }
                    StereoChannelFragment stereoChannelFragment2 = this.f39645W0;
                    if (stereoChannelFragment2 != null) {
                        stereoChannelFragment2.onFlashBtnClick(AudioChannel.STEREO_RIGHT);
                        return;
                    }
                    return;
                }
                StereoChannelFragment stereoChannelFragment3 = this.f39645W0;
                if (stereoChannelFragment3 != null) {
                    stereoChannelFragment3.onFlashBtnClick(AudioChannel.STEREO_LEFT);
                    return;
                }
                return;
            }
            StereoChannelFragment stereoChannelFragment4 = this.f39645W0;
            if (stereoChannelFragment4 != null) {
                stereoChannelFragment4.onSwipeClick();
                return;
            }
            return;
        }
        StereoChannelFragment stereoChannelFragment5 = this.f39645W0;
        if (stereoChannelFragment5 != null) {
            stereoChannelFragment5.onBtnBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            w1((StereoChannelFragment) obj);
        } else if (11 == i4) {
            x1((StereoChannelViewModel) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39688f1 != 0) {
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
            this.f39688f1 = 256L;
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
                            if (i4 != 5) {
                                return false;
                            }
                            return y1((androidx.lifecycle.N) obj, i5);
                        }
                        return A1((LiveData) obj, i5);
                    }
                    return C1((androidx.lifecycle.N) obj, i5);
                }
                return z1((androidx.lifecycle.N) obj, i5);
            }
            return D1((LiveData) obj, i5);
        }
        return B1((LiveData) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.C1883i1.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1878h1
    public void w1(@androidx.annotation.P StereoChannelFragment stereoChannelFragment) {
        this.f39645W0 = stereoChannelFragment;
        synchronized (this) {
            this.f39688f1 |= 64;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1878h1
    public void x1(@androidx.annotation.P StereoChannelViewModel stereoChannelViewModel) {
        this.f39646X0 = stereoChannelViewModel;
        synchronized (this) {
            this.f39688f1 |= 128;
        }
        g(11);
        super.B0();
    }

    private C1883i1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 6, (ConstraintLayout) objArr[19], (Guideline) objArr[20], (ImageView) objArr[26], (ImageView) objArr[8], (ImageView) objArr[13], (HmCustomFontTextView) objArr[4], (ImageView) objArr[6], (ImageView) objArr[39], (ImageView) objArr[24], (HmCustomFontTextView) objArr[9], (ImageView) objArr[11], (ImageView) objArr[5], (ImageView) objArr[10], (ImageView) objArr[1], (ConstraintLayout) objArr[38], (LinearLayout) objArr[23], (ConstraintLayout) objArr[21], (LinearLayout) objArr[40], (ConstraintLayout) objArr[16], (LinearLayout) objArr[27], (ConstraintLayout) objArr[15], (LinearLayout) objArr[25], (ConstraintLayout) objArr[22], (View) objArr[31], (AppCompatImageView) objArr[33], (ConstraintLayout) objArr[32], (AppCompatImageView) objArr[36], (ConstraintLayout) objArr[35], (ConstraintLayout) objArr[18], (HmCustomFontTextView) objArr[14], (HmCustomFontTextView) objArr[7], (HmCustomFontTextView) objArr[12], (HmCustomFontTextView) objArr[2], (HmCustomFontTextView) objArr[17], (ConstraintLayout) objArr[28], (TextView) objArr[34], (TextView) objArr[37], (View) objArr[29], (View) objArr[30]);
        this.f39688f1 = -1L;
        this.f39650m0.setTag(null);
        this.f39651n0.setTag(null);
        this.f39652o0.setTag(null);
        this.f39653p0.setTag(null);
        this.f39656s0.setTag(null);
        this.f39657t0.setTag(null);
        this.f39658u0.setTag(null);
        this.f39659v0.setTag(null);
        this.f39660w0.setTag(null);
        this.f39624B0.setTag(null);
        this.f39626D0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39681Y0 = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.f39682Z0 = imageView;
        imageView.setTag(null);
        this.f39635M0.setTag(null);
        this.f39636N0.setTag(null);
        this.f39637O0.setTag(null);
        this.f39638P0.setTag(null);
        this.f39639Q0.setTag(null);
        N0(view);
        this.f39683a1 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f39684b1 = new com.harman.jbl.partybox.generated.callback.a(this, 5);
        this.f39685c1 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        this.f39686d1 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        this.f39687e1 = new com.harman.jbl.partybox.generated.callback.a(this, 4);
        j0();
    }
}
