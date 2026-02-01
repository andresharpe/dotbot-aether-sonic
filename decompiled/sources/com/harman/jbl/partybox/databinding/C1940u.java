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
import com.harman.jbl.partybox.ui.dashboard.DashboardBannerDialogFragment;
import com.harman.jbl.partybox.ui.dashboard.DashboardBannerViewModel;

/* renamed from: com.harman.jbl.partybox.databinding.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1940u extends AbstractC1935t implements a.InterfaceC0358a {

    /* renamed from: E0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40180E0 = null;

    /* renamed from: F0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40181F0;

    /* renamed from: A0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40182A0;

    /* renamed from: B0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40183B0;

    /* renamed from: C0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40184C0;

    /* renamed from: D0, reason: collision with root package name */
    private long f40185D0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40186w0;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f40187x0;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40188y0;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40189z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40181F0 = sparseIntArray;
        sparseIntArray.put(j.h.I7, 8);
        sparseIntArray.put(j.h.B9, 9);
        sparseIntArray.put(j.h.N7, 10);
        sparseIntArray.put(j.h.Y8, 11);
        sparseIntArray.put(j.h.qi, 12);
        sparseIntArray.put(j.h.X6, 13);
        sparseIntArray.put(j.h.M9, 14);
    }

    public C1940u(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 15, f40180E0, f40181F0));
    }

    private boolean A1(LiveData<Boolean> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40185D0 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean B1(LiveData<Boolean> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40185D0 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean C1(LiveData<Boolean> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40185D0 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean D1(LiveData<String> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40185D0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        DashboardBannerDialogFragment dashboardBannerDialogFragment;
        if (i4 != 1) {
            if (i4 == 2 && (dashboardBannerDialogFragment = this.f40143t0) != null) {
                dashboardBannerDialogFragment.onCloseBtnClick();
                return;
            }
            return;
        }
        DashboardBannerDialogFragment dashboardBannerDialogFragment2 = this.f40143t0;
        if (dashboardBannerDialogFragment2 != null) {
            dashboardBannerDialogFragment2.dismiss();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            x1((DashboardBannerDialogFragment) obj);
        } else if (9 == i4) {
            y1((com.harman.jbl.partybox.ui.party.stereo.g) obj);
        } else if (11 == i4) {
            z1((DashboardBannerViewModel) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f40185D0 != 0) {
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
            this.f40185D0 = 128L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    return C1((LiveData) obj, i5);
                }
                return A1((LiveData) obj, i5);
            }
            return B1((LiveData) obj, i5);
        }
        return D1((LiveData) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d5  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.C1940u.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1935t
    public void x1(@androidx.annotation.P DashboardBannerDialogFragment dashboardBannerDialogFragment) {
        this.f40143t0 = dashboardBannerDialogFragment;
        synchronized (this) {
            this.f40185D0 |= 16;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1935t
    public void y1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.g gVar) {
        this.f40144u0 = gVar;
        synchronized (this) {
            this.f40185D0 |= 32;
        }
        g(9);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1935t
    public void z1(@androidx.annotation.P DashboardBannerViewModel dashboardBannerViewModel) {
        this.f40145v0 = dashboardBannerViewModel;
    }

    private C1940u(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (ImageView) objArr[13], (ImageView) objArr[3], (ImageView) objArr[8], (ImageView) objArr[10], (LinearLayout) objArr[11], (LinearLayout) objArr[9], (LinearLayout) objArr[14], (HmCustomFontTextView) objArr[2], (HmCustomFontTextView) objArr[7], (HmCustomFontTextView) objArr[12]);
        this.f40185D0 = -1L;
        this.f40134k0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f40186w0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f40187x0 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[4];
        this.f40188y0 = constraintLayout2;
        constraintLayout2.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[5];
        this.f40189z0 = constraintLayout3;
        constraintLayout3.setTag(null);
        ConstraintLayout constraintLayout4 = (ConstraintLayout) objArr[6];
        this.f40182A0 = constraintLayout4;
        constraintLayout4.setTag(null);
        this.f40140q0.setTag(null);
        this.f40141r0.setTag(null);
        N0(view);
        this.f40183B0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f40184C0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        j0();
    }
}
