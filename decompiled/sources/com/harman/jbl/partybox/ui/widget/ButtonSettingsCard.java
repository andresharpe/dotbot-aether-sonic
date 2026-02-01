package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.c0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.jbl.partybox.databinding.C1844a2;
import java.util.List;
import kotlin.E;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.text.A;
import kotlin.text.z;

@E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/ButtonSettingsCard;", "Landroid/widget/LinearLayout;", "", "title", "Lkotlin/H0;", "setTitle", "(Ljava/lang/String;)V", "", "(I)V", "", "ids", "setContent", "(Ljava/util/List;)V", FirebaseAnalytics.b.f34769P, "icon", "setFeatureIcon", "Landroid/view/View$OnClickListener;", "l", "setCardOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/harman/jbl/partybox/databinding/a2;", androidx.exifinterface.media.a.U4, "Lcom/harman/jbl/partybox/databinding/a2;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ButtonSettingsCard extends LinearLayout {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final C1844a2 f45721E;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.l<Integer, CharSequence> {
        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ CharSequence C(Integer num) {
            return c(num.intValue());
        }

        @l3.d
        public final CharSequence c(int i4) {
            String string = ButtonSettingsCard.this.getContext().getString(i4);
            F.o(string, "getString(...)");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonSettingsCard(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        C1844a2 e4 = C1844a2.e(LayoutInflater.from(context), this, true);
        F.o(e4, "inflate(...)");
        this.f45721E = e4;
    }

    public final void setCardOnClickListener(@l3.e View.OnClickListener onClickListener) {
        this.f45721E.d().setOnClickListener(onClickListener);
    }

    public final void setContent(@l3.d List<Integer> ids) {
        String str;
        boolean T22;
        F.p(ids, "ids");
        if (!ids.isEmpty()) {
            str = D.m3(ids, null, null, null, 0, null, new a(), 31, null);
            T22 = A.T2(str, "\n", false, 2, null);
            if (T22) {
                str = z.i2(str, "\n", "", false, 4, null);
            }
        } else {
            str = "";
        }
        this.f45721E.f39336F.setText(str);
    }

    public final void setFeatureIcon(@InterfaceC0578v int i4) {
        this.f45721E.f39338H.setImageResource(i4);
    }

    public final void setTitle(@l3.d String title) {
        F.p(title, "title");
        this.f45721E.f39337G.setText(title);
    }

    public final void setTitle(@c0 int i4) {
        this.f45721E.f39337G.setText(i4);
    }

    public /* synthetic */ ButtonSettingsCard(Context context, AttributeSet attributeSet, int i4, C2197u c2197u) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    public final void setContent(@c0 int i4) {
        this.f45721E.f39336F.setText(i4);
    }
}
