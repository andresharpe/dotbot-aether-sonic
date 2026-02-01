package com.harman.jbl.partybox.utils;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class h extends ClickableSpan {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private View.OnClickListener f46177E;

    /* renamed from: F, reason: collision with root package name */
    private int f46178F;

    public h(@l3.d View.OnClickListener listener, int i4) {
        F.p(listener, "listener");
        this.f46177E = listener;
        this.f46178F = i4;
    }

    public final int a() {
        return this.f46178F;
    }

    @l3.d
    public final View.OnClickListener b() {
        return this.f46177E;
    }

    public final void c(int i4) {
        this.f46178F = i4;
    }

    public final void d(@l3.d View.OnClickListener onClickListener) {
        F.p(onClickListener, "<set-?>");
        this.f46177E = onClickListener;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@l3.d View v3) {
        F.p(v3, "v");
        View.OnClickListener onClickListener = this.f46177E;
        if (onClickListener != null) {
            onClickListener.onClick(v3);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@l3.d TextPaint ds) {
        F.p(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.f46178F);
        ds.setUnderlineText(true);
        ds.setFakeBoldText(true);
    }
}
