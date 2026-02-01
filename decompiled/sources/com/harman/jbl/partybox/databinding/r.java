package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.ui.AuracastWelcomeDialog;

/* loaded from: classes2.dex */
public class r extends AbstractC1921q implements a.InterfaceC0358a {

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40060q0 = null;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40061r0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40062n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40063o0;

    /* renamed from: p0, reason: collision with root package name */
    private long f40064p0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40061r0 = sparseIntArray;
        sparseIntArray.put(j.h.H6, 2);
        sparseIntArray.put(j.h.Hh, 3);
    }

    public r(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 4, f40060q0, f40061r0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AuracastWelcomeDialog auracastWelcomeDialog = this.f40034m0;
        if (auracastWelcomeDialog != null) {
            auracastWelcomeDialog.onBtnCreatePartyClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (5 == i4) {
            v1((AuracastWelcomeDialog) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f40064p0 != 0) {
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
            this.f40064p0 = 2L;
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
            j4 = this.f40064p0;
            this.f40064p0 = 0L;
        }
        if ((j4 & 2) != 0) {
            this.f40031j0.setOnClickListener(this.f40063o0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1921q
    public void v1(@androidx.annotation.P AuracastWelcomeDialog auracastWelcomeDialog) {
        this.f40034m0 = auracastWelcomeDialog;
        synchronized (this) {
            this.f40064p0 |= 1;
        }
        g(5);
        super.B0();
    }

    private r(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (HmCustomFontTextView) objArr[1], (ImageView) objArr[2], (HmCustomFontTextView) objArr[3]);
        this.f40064p0 = -1L;
        this.f40031j0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f40062n0 = constraintLayout;
        constraintLayout.setTag(null);
        N0(view);
        this.f40063o0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
