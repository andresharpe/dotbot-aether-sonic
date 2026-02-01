package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontEditText;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog;

/* loaded from: classes2.dex */
public class K extends J implements a.InterfaceC0358a {

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f38797t0 = null;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f38798u0 = null;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38799o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38800p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f38801q0;

    /* renamed from: r0, reason: collision with root package name */
    private androidx.databinding.o f38802r0;

    /* renamed from: s0, reason: collision with root package name */
    private long f38803s0;

    /* loaded from: classes2.dex */
    class a implements androidx.databinding.o {
        a() {
        }

        @Override // androidx.databinding.o
        public void a() {
            androidx.lifecycle.P<String> name;
            String a4 = androidx.databinding.adapters.F.a(K.this.f38752l0);
            DevRenameDialog devRenameDialog = K.this.f38754n0;
            if (devRenameDialog != null && (name = devRenameDialog.getName()) != null) {
                name.r(a4);
            }
        }
    }

    public K(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 4, f38797t0, f38798u0));
    }

    private boolean w1(androidx.lifecycle.P<String> p4, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f38803s0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        DevRenameDialog devRenameDialog;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 && (devRenameDialog = this.f38754n0) != null) {
                    devRenameDialog.onConfirmClick();
                    return;
                }
                return;
            }
            DevRenameDialog devRenameDialog2 = this.f38754n0;
            if (devRenameDialog2 != null) {
                devRenameDialog2.releaseFocus();
                return;
            }
            return;
        }
        DevRenameDialog devRenameDialog3 = this.f38754n0;
        if (devRenameDialog3 != null) {
            devRenameDialog3.onBoarderClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (5 == i4) {
            v1((DevRenameDialog) obj);
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f38803s0 != 0) {
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
            this.f38803s0 = 4L;
        }
        B0();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean o0(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return w1((androidx.lifecycle.P) obj, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void v() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.f38803s0     // Catch: java.lang.Throwable -> L53
            r2 = 0
            r9.f38803s0 = r2     // Catch: java.lang.Throwable -> L53
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L53
            com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog r4 = r9.f38754n0
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L19
            androidx.lifecycle.P r4 = r4.getName()
            goto L1a
        L19:
            r4 = r6
        L1a:
            r7 = 0
            r9.j1(r7, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.f()
            java.lang.String r4 = (java.lang.String) r4
            goto L28
        L27:
            r4 = r6
        L28:
            r7 = 4
            long r0 = r0 & r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4b
            com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView r0 = r9.f38750j0
            android.view.View$OnClickListener r1 = r9.f38800p0
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.f38751k0
            android.view.View$OnClickListener r1 = r9.f38801q0
            r0.setOnClickListener(r1)
            com.harman.jbl.partybox.ui.customviews.HmCustomFontEditText r0 = r9.f38752l0
            androidx.databinding.o r1 = r9.f38802r0
            androidx.databinding.adapters.F.C(r0, r6, r6, r6, r1)
            android.widget.LinearLayout r0 = r9.f38753m0
            android.view.View$OnClickListener r1 = r9.f38799o0
            r0.setOnClickListener(r1)
        L4b:
            if (r5 == 0) goto L52
            com.harman.jbl.partybox.ui.customviews.HmCustomFontEditText r0 = r9.f38752l0
            androidx.databinding.adapters.F.A(r0, r4)
        L52:
            return
        L53:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.databinding.K.v():void");
    }

    @Override // com.harman.jbl.partybox.databinding.J
    public void v1(@androidx.annotation.P DevRenameDialog devRenameDialog) {
        this.f38754n0 = devRenameDialog;
        synchronized (this) {
            this.f38803s0 |= 2;
        }
        g(5);
        super.B0();
    }

    private K(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (HmCustomFontTextView) objArr[3], (ConstraintLayout) objArr[0], (HmCustomFontEditText) objArr[2], (LinearLayout) objArr[1]);
        this.f38802r0 = new a();
        this.f38803s0 = -1L;
        this.f38750j0.setTag(null);
        this.f38751k0.setTag(null);
        this.f38752l0.setTag(null);
        this.f38753m0.setTag(null);
        N0(view);
        this.f38799o0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        this.f38800p0 = new com.harman.jbl.partybox.generated.callback.a(this, 3);
        this.f38801q0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
