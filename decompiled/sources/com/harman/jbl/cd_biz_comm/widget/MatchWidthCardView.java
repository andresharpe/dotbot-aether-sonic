package com.harman.jbl.cd_biz_comm.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c0;
import androidx.core.content.C0669d;
import androidx.core.content.res.m;
import com.harman.jbl.partylight.lib.g;
import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import m2.H;

@E(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/harman/jbl/cd_biz_comm/widget/MatchWidthCardView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "l", "Lkotlin/H0;", "setCardOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", b.c.f48986a, com.harman.log.b.f47574c, "(I)V", "a", "()V", "", "highlight", "setHighlight", "(Z)V", "", "desc", "setDesc", "(Ljava/lang/String;)V", "Lm2/H;", androidx.exifinterface.media.a.U4, "Lm2/H;", "binding", "Landroid/widget/TextView;", "getDesc", "()Landroid/widget/TextView;", "getTitle", "title", "Landroid/widget/ImageView;", "getIndicator", "()Landroid/widget/ImageView;", "indicator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMatchWidthCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchWidthCardView.kt\ncom/harman/jbl/cd_biz_comm/widget/MatchWidthCardView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,73:1\n52#2,9:74\n*S KotlinDebug\n*F\n+ 1 MatchWidthCardView.kt\ncom/harman/jbl/cd_biz_comm/widget/MatchWidthCardView\n*L\n24#1:74,9\n*E\n"})
/* loaded from: classes2.dex */
public final class MatchWidthCardView extends LinearLayout {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final H f38029E;

    public /* synthetic */ MatchWidthCardView(Context context, AttributeSet attributeSet, int i4, C2197u c2197u) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    public final void a() {
        this.f38029E.f55063H.setVisibility(8);
        this.f38029E.f55061F.setVisibility(0);
        this.f38029E.f55064I.setVisibility(8);
    }

    public final void b(@c0 int i4) {
        this.f38029E.f55063H.setVisibility(0);
        this.f38029E.f55061F.setVisibility(8);
        this.f38029E.f55064I.setVisibility(0);
        this.f38029E.f55064I.setText(i4);
    }

    @l3.d
    public final TextView getDesc() {
        TextView cardDesc = this.f38029E.f55061F;
        F.o(cardDesc, "cardDesc");
        return cardDesc;
    }

    @l3.d
    public final ImageView getIndicator() {
        ImageView cardIndicator = this.f38029E.f55063H;
        F.o(cardIndicator, "cardIndicator");
        return cardIndicator;
    }

    @l3.d
    public final TextView getTitle() {
        TextView cardTitle = this.f38029E.f55065J;
        F.o(cardTitle, "cardTitle");
        return cardTitle;
    }

    public final void setCardOnClickListener(@l3.e View.OnClickListener onClickListener) {
        this.f38029E.d().setOnClickListener(onClickListener);
    }

    public final void setDesc(@l3.d String desc) {
        F.p(desc, "desc");
        this.f38029E.f55061F.setText(desc);
    }

    public final void setHighlight(boolean z3) {
        if (z3) {
            this.f38029E.f55061F.setTextColor(-8585241);
        } else {
            this.f38029E.f55061F.setTextColor(C0669d.f(getContext(), g.c.f46635m));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchWidthCardView(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        H e4 = H.e(LayoutInflater.from(context), this, true);
        F.o(e4, "inflate(...)");
        this.f38029E = e4;
        int[] XmMatchWidthCardView = g.n.f47181O;
        F.o(XmMatchWidthCardView, "XmMatchWidthCardView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, XmMatchWidthCardView, 0, 0);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        e4.f55065J.setText(m.n(obtainStyledAttributes, g.n.f47185S));
        e4.f55061F.setText(m.n(obtainStyledAttributes, g.n.f47182P));
        e4.f55063H.setVisibility(obtainStyledAttributes.getBoolean(g.n.f47184R, true) ? 0 : 4);
        e4.f55062G.setVisibility(obtainStyledAttributes.getBoolean(g.n.f47183Q, true) ? 0 : 4);
        obtainStyledAttributes.recycle();
    }
}
