package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.license.AgreementFragment;

/* loaded from: classes2.dex */
public class A0 extends AbstractC1965z0 implements a.InterfaceC0358a {

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38447x0 = null;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38448y0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38449s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38450t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38451u0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38452v0;

    /* renamed from: w0, reason: collision with root package name */
    private long f38453w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38448y0 = sparseIntArray;
        sparseIntArray.put(j.h.v6, 5);
        sparseIntArray.put(j.h.Ig, 6);
        sparseIntArray.put(j.h.Eg, 7);
    }

    public A0(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 8, f38447x0, f38448y0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        AgreementFragment agreementFragment;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4 && (agreementFragment = this.f40369r0) != null) {
                        agreementFragment.onNotAcceptButtonClicked();
                        return;
                    }
                    return;
                }
                AgreementFragment agreementFragment2 = this.f40369r0;
                if (agreementFragment2 != null) {
                    agreementFragment2.onAcceptButtonClicked();
                    return;
                }
                return;
            }
            AgreementFragment agreementFragment3 = this.f40369r0;
            if (agreementFragment3 != null) {
                agreementFragment3.onPrivacyTextClicked();
                return;
            }
            return;
        }
        AgreementFragment agreementFragment4 = this.f40369r0;
        if (agreementFragment4 != null) {
            agreementFragment4.onEulaTextClicked();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            v1((AgreementFragment) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f38453w0 != 0) {
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
            this.f38453w0 = 2L;
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
            j4 = this.f38453w0;
            this.f38453w0 = 0L;
        }
        if ((j4 & 2) != 0) {
            this.f40361j0.setOnClickListener(this.f38449s0);
            this.f40364m0.setOnClickListener(this.f38450t0);
            this.f40366o0.setOnClickListener(this.f38451u0);
            this.f40367p0.setOnClickListener(this.f38452v0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1965z0
    public void v1(@androidx.annotation.P AgreementFragment agreementFragment) {
        this.f40369r0 = agreementFragment;
        synchronized (this) {
            this.f38453w0 |= 1;
        }
        g(7);
        super.B0();
    }

    private A0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (TextView) objArr[3], (ConstraintLayout) objArr[0], (ImageView) objArr[5], (TextView) objArr[4], (TextView) objArr[7], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[6]);
        this.f38453w0 = -1L;
        this.f40361j0.setTag(null);
        this.f40362k0.setTag(null);
        this.f40364m0.setTag(null);
        this.f40366o0.setTag(null);
        this.f40367p0.setTag(null);
        N0(view);
        this.f38449s0 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        this.f38450t0 = new com.harman.jbl.partybox.generated.callback.a(this, 4);
        this.f38451u0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        this.f38452v0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        j0();
    }
}
