package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import com.harman.jbl.partybox.ui.party.auracast.ui.AuracastStopGuideDialog;

/* renamed from: com.harman.jbl.partybox.databinding.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1916p extends AbstractC1911o implements a.InterfaceC0358a {

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39941u0 = null;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39942v0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39943q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39944r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39945s0;

    /* renamed from: t0, reason: collision with root package name */
    private long f39946t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39942v0 = sparseIntArray;
        sparseIntArray.put(j.h.w5, 3);
        sparseIntArray.put(j.h.I9, 4);
        sparseIntArray.put(j.h.zi, 5);
        sparseIntArray.put(j.h.B6, 6);
    }

    public C1916p(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 7, f39941u0, f39942v0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastStopGuideDialog auracastStopGuideDialog;
        if (i4 != 1) {
            if (i4 == 2 && (auracastStopGuideDialog = this.f39918p0) != null) {
                auracastStopGuideDialog.onBtnGotItClick();
                return;
            }
            return;
        }
        AuracastStopGuideDialog auracastStopGuideDialog2 = this.f39918p0;
        if (auracastStopGuideDialog2 != null) {
            auracastStopGuideDialog2.onBtnCloseClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (5 == i4) {
            v1((AuracastStopGuideDialog) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39946t0 != 0) {
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
            this.f39946t0 = 2L;
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
            j4 = this.f39946t0;
            this.f39946t0 = 0L;
        }
        if ((j4 & 2) != 0) {
            this.f39912j0.setOnClickListener(this.f39944r0);
            this.f39913k0.setOnClickListener(this.f39945s0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1911o
    public void v1(@androidx.annotation.P AuracastStopGuideDialog auracastStopGuideDialog) {
        this.f39918p0 = auracastStopGuideDialog;
        synchronized (this) {
            this.f39946t0 |= 1;
        }
        g(5);
        super.B0();
    }

    private C1916p(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[1], (HmCustomFontTextView) objArr[2], (Guideline) objArr[3], (ImageView) objArr[6], (ConstraintLayout) objArr[4], (HmTextViewWithImage) objArr[5]);
        this.f39946t0 = -1L;
        this.f39912j0.setTag(null);
        this.f39913k0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f39943q0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        this.f39944r0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f39945s0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        j0();
    }
}
