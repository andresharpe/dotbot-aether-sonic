package com.harman.jbl.partybox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.generated.callback.a;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoRenameFragment;

/* renamed from: com.harman.jbl.partybox.databinding.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1920p3 extends AbstractC1915o3 implements a.InterfaceC0358a {

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.P
    private static final ViewDataBinding.i f40025s0 = null;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private static final SparseIntArray f40026t0 = null;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f40027o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40028p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.P
    private final View.OnClickListener f40029q0;

    /* renamed from: r0, reason: collision with root package name */
    private long f40030r0;

    public C1920p3(@androidx.annotation.P androidx.databinding.l lVar, @androidx.annotation.N View view) {
        this(lVar, view, ViewDataBinding.m0(lVar, view, 4, f40025s0, f40026t0));
    }

    private boolean y1(LiveData<String> liveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f40030r0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.generated.callback.a.InterfaceC0358a
    public final void b(int i4, View view) {
        StereoRenameFragment stereoRenameFragment;
        if (i4 != 1) {
            if (i4 == 2 && (stereoRenameFragment = this.f39939m0) != null) {
                stereoRenameFragment.onRenameConfirmed();
                return;
            }
            return;
        }
        StereoRenameFragment stereoRenameFragment2 = this.f39939m0;
        if (stereoRenameFragment2 != null) {
            stereoRenameFragment2.onRenameClick();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g1(int i4, @androidx.annotation.P Object obj) {
        if (7 == i4) {
            w1((StereoRenameFragment) obj);
        } else if (11 == i4) {
            x1((com.harman.jbl.partybox.ui.party.stereo.w) obj);
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f40030r0 != 0) {
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
            this.f40030r0 = 8L;
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

    @Override // androidx.databinding.ViewDataBinding
    protected void v() {
        long j4;
        LiveData<String> liveData;
        synchronized (this) {
            j4 = this.f40030r0;
            this.f40030r0 = 0L;
        }
        com.harman.jbl.partybox.ui.party.stereo.w wVar = this.f39940n0;
        long j5 = 13 & j4;
        String str = null;
        if (j5 != 0) {
            if (wVar != null) {
                liveData = wVar.x();
            } else {
                liveData = null;
            }
            j1(0, liveData);
            if (liveData != null) {
                str = liveData.f();
            }
        }
        if ((j4 & 8) != 0) {
            this.f39936j0.setOnClickListener(this.f40028p0);
            this.f39937k0.setOnClickListener(this.f40029q0);
        }
        if (j5 != 0) {
            androidx.databinding.adapters.F.A(this.f39938l0, str);
        }
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1915o3
    public void w1(@androidx.annotation.P StereoRenameFragment stereoRenameFragment) {
        this.f39939m0 = stereoRenameFragment;
        synchronized (this) {
            this.f40030r0 |= 2;
        }
        g(7);
        super.B0();
    }

    @Override // com.harman.jbl.partybox.databinding.AbstractC1915o3
    public void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.w wVar) {
        this.f39940n0 = wVar;
        synchronized (this) {
            this.f40030r0 |= 4;
        }
        g(11);
        super.B0();
    }

    private C1920p3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (HmCustomFontTextView) objArr[3], (ImageView) objArr[2], (HmCustomFontTextView) objArr[1]);
        this.f40030r0 = -1L;
        this.f39936j0.setTag(null);
        this.f39937k0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40027o0 = linearLayout;
        linearLayout.setTag(null);
        this.f39938l0.setTag(null);
        N0(view);
        this.f40028p0 = new com.harman.jbl.partybox.generated.callback.a(this, 2);
        this.f40029q0 = new com.harman.jbl.partybox.generated.callback.a(this, 1);
        j0();
    }
}
