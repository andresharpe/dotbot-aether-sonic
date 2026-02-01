package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.GroupSettingFragment;

/* renamed from: com.harman.jbl.partybox.databinding.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1926r0 extends AbstractC1922q0 implements a.InterfaceC0358a {

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40065y0 = null;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40066z0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f40067q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    private final ImageView f40068r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40069s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40070t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40071u0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40072v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40073w0;

    /* renamed from: x0, reason: collision with root package name */
    private long f40074x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40066z0 = sparseIntArray;
        sparseIntArray.put(j.h.Yg, 4);
        sparseIntArray.put(j.h.Ai, 5);
        sparseIntArray.put(j.h.Fh, 6);
        sparseIntArray.put(j.h.O5, 7);
        sparseIntArray.put(j.h.pi, 8);
        sparseIntArray.put(j.h.g6, 9);
    }

    public C1926r0(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 10, f40065y0, f40066z0));
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        GroupSettingFragment groupSettingFragment;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 && (groupSettingFragment = this.f40041p0) != null) {
                    groupSettingFragment.onRenameThisGroupClick();
                    return;
                }
                return;
            }
            GroupSettingFragment groupSettingFragment2 = this.f40041p0;
            if (groupSettingFragment2 != null) {
                groupSettingFragment2.onChannelAssignmentClick();
                return;
            }
            return;
        }
        GroupSettingFragment groupSettingFragment3 = this.f40041p0;
        if (groupSettingFragment3 != null) {
            groupSettingFragment3.onBtnBackClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            v1((GroupSettingFragment) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f40074x0 != 0) {
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
            this.f40074x0 = 2L;
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
            j4 = this.f40074x0;
            this.f40074x0 = 0L;
        }
        if ((j4 & 2) != 0) {
            this.f40068r0.setOnClickListener(this.f40073w0);
            this.f40069s0.setOnClickListener(this.f40071u0);
            this.f40070t0.setOnClickListener(this.f40072v0);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1922q0
    public void v1(@androidx.annotation.P GroupSettingFragment groupSettingFragment) {
        this.f40041p0 = groupSettingFragment;
        synchronized (this) {
            this.f40074x0 |= 1;
        }
        g(7);
        super.B0();
    }

    private C1926r0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[7], (ImageView) objArr[9], (ConstraintLayout) objArr[4], (HmCustomFontTextView) objArr[6], (HmCustomFontTextView) objArr[8], (HmCustomFontTextView) objArr[5]);
        this.f40074x0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40067q0 = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f40068r0 = imageView;
        imageView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.f40069s0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[3];
        this.f40070t0 = constraintLayout2;
        constraintLayout2.setTag(null);
        N0(view);
        this.f40071u0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        this.f40072v0 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        this.f40073w0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
