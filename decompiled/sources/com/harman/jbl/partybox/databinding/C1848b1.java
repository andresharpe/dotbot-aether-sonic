package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.support.RenameDeviceFragment;

/* renamed from: com.harman.jbl.partybox.databinding.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1848b1 extends AbstractC1843a1 implements a.InterfaceC0358a {

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f39365t0 = null;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f39366u0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    private final HmCustomFontTextView f39367q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f39368r0;

    /* renamed from: s0, reason: collision with root package name */
    private long f39369s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39366u0 = sparseIntArray;
        sparseIntArray.put(j.h.x5, 3);
        sparseIntArray.put(j.h.Yd, 4);
        sparseIntArray.put(j.h.Nd, 5);
        sparseIntArray.put(j.h.f41332r3, 6);
    }

    public C1848b1(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 7, f39365t0, f39366u0));
    }

    private boolean w1(LiveData<Boolean> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f39369s0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        RenameDeviceFragment renameDeviceFragment = this.f39334p0;
        if (renameDeviceFragment != null) {
            renameDeviceFragment.onSaveBtnClicked();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            v1((RenameDeviceFragment) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f39369s0 != 0) {
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
            this.f39369s0 = 4L;
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
        LiveData<Boolean> liveData;
        synchronized (this) {
            j4 = this.f39369s0;
            this.f39369s0 = 0L;
        }
        RenameDeviceFragment renameDeviceFragment = this.f39334p0;
        long j5 = 7 & j4;
        boolean z3 = false;
        if (j5 != 0) {
            Boolean bool = null;
            if (renameDeviceFragment != null) {
                liveData = renameDeviceFragment.getKeyboardShow();
            } else {
                liveData = null;
            }
            j1(0, liveData);
            if (liveData != null) {
                bool = liveData.f();
            }
            z3 = ViewDataBinding.J0(bool);
        }
        if ((j4 & 4) != 0) {
            this.f39367q0.setOnClickListener(this.f39368r0);
        }
        if (j5 != 0) {
            com.harman.jbl.partybox.ui.party.a.o(this.f39367q0, z3);
            com.harman.jbl.partybox.ui.party.a.p(this.f39333o0, z3);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1843a1
    public void v1(@androidx.annotation.P RenameDeviceFragment renameDeviceFragment) {
        this.f39334p0 = renameDeviceFragment;
        synchronized (this) {
            this.f39369s0 |= 2;
        }
        g(7);
        super.B0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C1848b1(androidx.databinding.l r13, android.view.View r14, java.lang.Object[] r15) {
        /*
            r12 = this;
            r3 = 1
            r0 = 0
            r0 = r15[r0]
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 6
            r0 = r15[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 3
            r0 = r15[r0]
            r10 = 0
            if (r0 == 0) goto L1b
            android.view.View r0 = (android.view.View) r0
            com.harman.jbl.partybox.databinding.F1 r0 = com.harman.jbl.partybox.databinding.F1.a(r0)
            r6 = r0
            goto L1c
        L1b:
            r6 = r10
        L1c:
            r0 = 5
            r0 = r15[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 4
            r0 = r15[r0]
            r8 = r0
            android.widget.ScrollView r8 = (android.widget.ScrollView) r8
            r11 = 1
            r0 = r15[r11]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = r12
            r1 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r12.f39369s0 = r0
            androidx.constraintlayout.widget.ConstraintLayout r13 = r12.f39328j0
            r13.setTag(r10)
            r13 = 2
            r13 = r15[r13]
            com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView r13 = (com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView) r13
            r12.f39367q0 = r13
            r13.setTag(r10)
            android.widget.EditText r13 = r12.f39333o0
            r13.setTag(r10)
            r12.N0(r14)
            com.harman.jbl.partybox.generated.callback.a r13 = new com.harman.jbl.partybox.generated.callback.a
            r13.<init>(r12, r11)
            r12.f39368r0 = r13
            r12.j0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.C1848b1.<init>(androidx.databinding.l, android.view.View, java.lang.Object[]):void");
    }
}
