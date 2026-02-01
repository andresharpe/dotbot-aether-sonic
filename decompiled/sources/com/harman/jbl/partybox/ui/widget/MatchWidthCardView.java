package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c0;
import com.harman.jbl.partybox.databinding.C2;
import com.harman.jbl.partybox.j;
import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/MatchWidthCardView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "l", "Lkotlin/H0;", "setCardOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", b.c.f48986a, com.harman.log.b.f47574c, "(I)V", "a", "()V", "Lcom/harman/jbl/partybox/databinding/C2;", androidx.exifinterface.media.a.U4, "Lcom/harman/jbl/partybox/databinding/C2;", "binding", "Landroid/widget/TextView;", "getDesc", "()Landroid/widget/TextView;", "desc", "getTitle", "title", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMatchWidthCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchWidthCardView.kt\ncom/harman/jbl/partybox/ui/widget/MatchWidthCardView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,53:1\n52#2,9:54\n*S KotlinDebug\n*F\n+ 1 MatchWidthCardView.kt\ncom/harman/jbl/partybox/ui/widget/MatchWidthCardView\n*L\n23#1:54,9\n*E\n"})
/* loaded from: classes2.dex */
public final class MatchWidthCardView extends LinearLayout {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final C2 f45850E;

    public /* synthetic */ MatchWidthCardView(Context context, AttributeSet attributeSet, int i4, C2197u c2197u) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    public final void a() {
        this.f45850E.f38523H.setVisibility(8);
        this.f45850E.f38521F.setVisibility(0);
        this.f45850E.f38524I.setVisibility(8);
    }

    public final void b(@c0 int i4) {
        this.f45850E.f38523H.setVisibility(0);
        this.f45850E.f38521F.setVisibility(8);
        this.f45850E.f38524I.setVisibility(0);
        this.f45850E.f38524I.setText(i4);
    }

    @l3.d
    public final TextView getDesc() {
        TextView cardDesc = this.f45850E.f38521F;
        F.o(cardDesc, "cardDesc");
        return cardDesc;
    }

    @l3.d
    public final TextView getTitle() {
        TextView cardTitle = this.f45850E.f38525J;
        F.o(cardTitle, "cardTitle");
        return cardTitle;
    }

    public final void setCardOnClickListener(@l3.e View.OnClickListener onClickListener) {
        this.f45850E.d().setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchWidthCardView(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        C2 e4 = C2.e(LayoutInflater.from(context), this, true);
        F.o(e4, "inflate(...)");
        this.f45850E = e4;
        int[] MatchWidthCardView = j.o.f41941S;
        F.o(MatchWidthCardView, "MatchWidthCardView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MatchWidthCardView, 0, 0);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        e4.f38525J.setText(androidx.core.content.res.m.n(obtainStyledAttributes, j.o.f41945U));
        e4.f38521F.setText(androidx.core.content.res.m.n(obtainStyledAttributes, j.o.f41943T));
        obtainStyledAttributes.recycle();
    }
}
