package com.harman.jbl.partybox.ui.customviews;

import N0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

@E(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bRT\u0010\u0019\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/harman/jbl/partybox/ui/customviews/DJEffectBar2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/H0;", "L", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/widget/TextView;", "p0", "Landroid/widget/TextView;", "titleTextView", "Lkotlin/Function2;", "", "Lkotlin/O;", a.C0015a.f1688b, FirebaseAnalytics.b.f34812t, "v", "q0", "LX2/p;", "getOnLevelChanged", "()LX2/p;", "setOnLevelChanged", "(LX2/p;)V", "onLevelChanged", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "r0", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DJEffectBar2 extends ConstraintLayout {

    /* renamed from: r0, reason: collision with root package name */
    @l3.d
    public static final a f42433r0 = new a(null);

    /* renamed from: s0, reason: collision with root package name */
    private static final int f42434s0 = 4;

    /* renamed from: p0, reason: collision with root package name */
    private TextView f42435p0;

    /* renamed from: q0, reason: collision with root package name */
    @l3.e
    private X2.p<? super Integer, ? super DJEffectBar2, H0> f42436q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l<Integer, H0> {
        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Integer num) {
            c(num.intValue());
            return H0.f51801a;
        }

        public final void c(int i4) {
            X2.p<Integer, DJEffectBar2, H0> onLevelChanged = DJEffectBar2.this.getOnLevelChanged();
            if (onLevelChanged != null) {
                onLevelChanged.c0(Integer.valueOf(i4), DJEffectBar2.this);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @W2.j
    public DJEffectBar2(@l3.d Context context) {
        this(context, null, 0, 6, null);
        F.p(context, "context");
    }

    private final void L(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(j.i.f41392G1, (ViewGroup) this, true);
        View findViewById = findViewById(j.h.Ai);
        F.o(findViewById, "findViewById(...)");
        this.f42435p0 = (TextView) findViewById;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41984j);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(j.o.f41981i);
        obtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            TextView textView = this.f42435p0;
            if (textView == null) {
                F.S("titleTextView");
                textView = null;
            }
            textView.setText(string);
        }
        setOnTouchListener(new com.harman.jbl.partybox.ui.customviews.b(4, new b()));
    }

    @l3.e
    public final X2.p<Integer, DJEffectBar2, H0> getOnLevelChanged() {
        return this.f42436q0;
    }

    public final void setOnLevelChanged(@l3.e X2.p<? super Integer, ? super DJEffectBar2, H0> pVar) {
        this.f42436q0 = pVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @W2.j
    public DJEffectBar2(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        F.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @W2.j
    public DJEffectBar2(@l3.d Context context, @l3.e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        F.p(context, "context");
        L(context, attributeSet);
    }

    public /* synthetic */ DJEffectBar2(Context context, AttributeSet attributeSet, int i4, int i5, C2197u c2197u) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }
}
