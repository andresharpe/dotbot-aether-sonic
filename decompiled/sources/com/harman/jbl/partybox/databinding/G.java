package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.jbl.partybox.ui.party.stereo.ui.FindAnotherSpeakerDialog;

/* loaded from: classes2.dex */
public class G extends F implements a.InterfaceC0358a {

    /* renamed from: A0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38628A0 = null;

    /* renamed from: B0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38629B0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38630v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f38631w0;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38632x0;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38633y0;

    /* renamed from: z0, reason: collision with root package name */
    private long f38634z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38629B0 = sparseIntArray;
        sparseIntArray.put(j.h.Vh, 4);
        sparseIntArray.put(j.h.u9, 5);
        sparseIntArray.put(j.h.d6, 6);
        sparseIntArray.put(j.h.v9, 7);
        sparseIntArray.put(j.h.I5, 8);
        sparseIntArray.put(j.h.t9, 9);
        sparseIntArray.put(j.h.q9, 10);
        sparseIntArray.put(j.h.Q5, 11);
        sparseIntArray.put(j.h.r9, 12);
    }

    public G(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 13, f38628A0, f38629B0));
    }

    private boolean w1(LiveData<EnumStereoType> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38634z0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        FindAnotherSpeakerDialog findAnotherSpeakerDialog;
        if (i4 != 1) {
            if (i4 == 2 && (findAnotherSpeakerDialog = this.f38596u0) != null) {
                findAnotherSpeakerDialog.dismiss();
                return;
            }
            return;
        }
        FindAnotherSpeakerDialog findAnotherSpeakerDialog2 = this.f38596u0;
        if (findAnotherSpeakerDialog2 != null) {
            findAnotherSpeakerDialog2.dismiss();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (5 == i4) {
            v1((FindAnotherSpeakerDialog) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f38634z0 != 0) {
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
            this.f38634z0 = 4L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return w1((LiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        EnumStereoType enumStereoType;
        boolean z3;
        boolean z4;
        long j5;
        LiveData<EnumStereoType> liveData;
        synchronized (this) {
            j4 = this.f38634z0;
            this.f38634z0 = 0L;
        }
        FindAnotherSpeakerDialog findAnotherSpeakerDialog = this.f38596u0;
        long j6 = j4 & 7;
        boolean z5 = true;
        int i4 = 0;
        if (j6 != 0) {
            if (findAnotherSpeakerDialog != null) {
                liveData = findAnotherSpeakerDialog.getEnumStereoType();
            } else {
                liveData = null;
            }
            j1(0, liveData);
            if (liveData != null) {
                enumStereoType = liveData.f();
            } else {
                enumStereoType = null;
            }
            if (EnumStereoType.STEREO == enumStereoType) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (j6 != 0) {
                j4 = z3 ? j4 | 64 : j4 | 32;
            }
        } else {
            enumStereoType = null;
            z3 = false;
        }
        if ((j4 & 32) != 0 && EnumStereoType.TWS == enumStereoType) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j7 = j4 & 7;
        if (j7 != 0) {
            if (!z3) {
                z5 = z4;
            }
            if (j7 != 0) {
                if (z5) {
                    j5 = 16;
                } else {
                    j5 = 8;
                }
                j4 |= j5;
            }
            if (!z5) {
                i4 = 8;
            }
        }
        if ((4 & j4) != 0) {
            this.f38588m0.setOnClickListener(this.f38633y0);
            this.f38630v0.setOnClickListener(this.f38632x0);
            this.f38631w0.setOnClickListener(null);
        }
        if ((j4 & 7) != 0) {
            this.f38591p0.setVisibility(i4);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.F
    public void v1(@androidx.annotation.P FindAnotherSpeakerDialog findAnotherSpeakerDialog) {
        this.f38596u0 = findAnotherSpeakerDialog;
        synchronized (this) {
            this.f38634z0 |= 2;
        }
        g(5);
        super.B0();
    }

    private G(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (ImageView) objArr[8], (ImageView) objArr[11], (ImageView) objArr[6], (ImageView) objArr[2], (ConstraintLayout) objArr[10], (LinearLayout) objArr[12], (ConstraintLayout) objArr[3], (LinearLayout) objArr[9], (ConstraintLayout) objArr[5], (LinearLayout) objArr[7], (HmCustomFontTextView) objArr[4]);
        this.f38634z0 = -1L;
        this.f38588m0.setTag(null);
        this.f38591p0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f38630v0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f38631w0 = linearLayout;
        linearLayout.setTag(null);
        N0(view);
        this.f38632x0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f38633y0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        j0();
    }
}
