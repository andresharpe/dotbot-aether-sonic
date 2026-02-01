package com.harman.jbl.partybox.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment;
import com.harman.sdk.utils.AudioChannel;
import e.C2046a;

/* renamed from: com.harman.jbl.partybox.databinding.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1929r3 extends AbstractC1925q3 implements a.InterfaceC0358a {

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40095v0 = null;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40096w0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f40097p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final HmCustomFontTextView f40098q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40099r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40100s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40101t0;

    /* renamed from: u0, reason: collision with root package name */
    private long f40102u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40096w0 = sparseIntArray;
        sparseIntArray.put(j.h.w5, 5);
    }

    public C1929r3(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 6, f40095v0, f40096w0));
    }

    private boolean y1(LiveData<AudioChannel> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40102u0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        StereoCreateFragment stereoCreateFragment;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 && (stereoCreateFragment = this.f40058n0) != null) {
                    stereoCreateFragment.onChannelSelectedBtnClick();
                    return;
                }
                return;
            }
            StereoCreateFragment stereoCreateFragment2 = this.f40058n0;
            if (stereoCreateFragment2 != null) {
                stereoCreateFragment2.onChannelSelected(AudioChannel.STEREO_RIGHT);
                return;
            }
            return;
        }
        StereoCreateFragment stereoCreateFragment3 = this.f40058n0;
        if (stereoCreateFragment3 != null) {
            stereoCreateFragment3.onChannelSelected(AudioChannel.STEREO_LEFT);
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
                if (this.f40102u0 != 0) {
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
            this.f40102u0 = 8L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return y1((LiveData) obj, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        Drawable drawable;
        Drawable drawable2;
        int i4;
        LiveData<AudioChannel> liveData;
        Object[] objArr;
        Object[] objArr2;
        Context context;
        int i5;
        int i6;
        int i7;
        int i8;
        long j5;
        long j6;
        long j7;
        synchronized (this) {
            j4 = this.f40102u0;
            this.f40102u0 = 0L;
        }
        StereoCreateFragment stereoCreateFragment = this.f40058n0;
        com.harman.jbl.partybox.ui.party.stereo.s sVar = this.f40059o0;
        long j8 = j4 & 13;
        Drawable drawable3 = null;
        AudioChannel audioChannel = null;
        boolean z3 = false;
        if (j8 != 0) {
            if (sVar != null) {
                liveData = sVar.B();
            } else {
                liveData = null;
            }
            j1(0, liveData);
            if (liveData != null) {
                audioChannel = liveData.f();
            }
            if (AudioChannel.STEREO_RIGHT == audioChannel) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (AudioChannel.STEREO_LEFT == audioChannel) {
                objArr2 = true;
            } else {
                objArr2 = false;
            }
            if (audioChannel != null) {
                z3 = true;
            }
            if (j8 != 0) {
                if (objArr != false) {
                    j7 = 512;
                } else {
                    j7 = 256;
                }
                j4 |= j7;
            }
            if ((j4 & 13) != 0) {
                if (objArr2 != false) {
                    j6 = 32;
                } else {
                    j6 = 16;
                }
                j4 |= j6;
            }
            if ((j4 & 13) != 0) {
                if (z3) {
                    j5 = 2176;
                } else {
                    j5 = 1088;
                }
                j4 |= j5;
            }
            if (objArr != false) {
                context = this.f40056l0.getContext();
                i5 = j.f.f40909B;
            } else {
                context = this.f40056l0.getContext();
                i5 = j.f.f40913C;
            }
            Drawable b4 = C2046a.b(context, i5);
            Context context2 = this.f40054j0.getContext();
            if (objArr2 != false) {
                i6 = j.f.f40909B;
            } else {
                i6 = j.f.f40913C;
            }
            Drawable b5 = C2046a.b(context2, i6);
            HmCustomFontTextView hmCustomFontTextView = this.f40055k0;
            if (z3) {
                i7 = j.d.f40749f1;
            } else {
                i7 = j.d.f40755h1;
            }
            i4 = ViewDataBinding.I(hmCustomFontTextView, i7);
            Context context3 = this.f40055k0.getContext();
            if (z3) {
                i8 = j.f.f41104t;
            } else {
                i8 = j.f.f41108u;
            }
            drawable2 = C2046a.b(context3, i8);
            drawable3 = b5;
            drawable = b4;
        } else {
            drawable = null;
            drawable2 = null;
            i4 = 0;
        }
        if ((13 & j4) != 0) {
            androidx.databinding.adapters.J.b(this.f40054j0, drawable3);
            androidx.databinding.adapters.J.b(this.f40055k0, drawable2);
            this.f40055k0.setFocusable(z3);
            this.f40055k0.setTextColor(i4);
            androidx.databinding.adapters.J.e(this.f40055k0, this.f40100s0, z3);
            androidx.databinding.adapters.J.b(this.f40056l0, drawable);
        }
        if ((8 & j4) != 0) {
            this.f40054j0.setOnClickListener(this.f40101t0);
            this.f40056l0.setOnClickListener(this.f40099r0);
        }
        if ((j4 & 10) != 0) {
            com.harman.jbl.partybox.ui.party.a.f(this.f40098q0, stereoCreateFragment);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1925q3
    public void w1(@androidx.annotation.P StereoCreateFragment stereoCreateFragment) {
        this.f40058n0 = stereoCreateFragment;
        synchronized (this) {
            this.f40102u0 |= 2;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1925q3
    public void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.s sVar) {
        this.f40059o0 = sVar;
        synchronized (this) {
            this.f40102u0 |= 4;
        }
        g(11);
        super.B0();
    }

    private C1929r3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (HmCustomFontTextView) objArr[2], (HmCustomFontTextView) objArr[4], (HmCustomFontTextView) objArr[3], (Guideline) objArr[5]);
        this.f40102u0 = -1L;
        this.f40054j0.setTag(null);
        this.f40055k0.setTag(null);
        this.f40056l0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40097p0 = linearLayout;
        linearLayout.setTag(null);
        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) objArr[1];
        this.f40098q0 = hmCustomFontTextView;
        hmCustomFontTextView.setTag(null);
        N0(view);
        this.f40099r0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        this.f40100s0 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        this.f40101t0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
