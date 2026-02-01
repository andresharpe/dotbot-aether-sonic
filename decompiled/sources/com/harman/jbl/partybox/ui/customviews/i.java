package com.harman.jbl.partybox.ui.customviews;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public class i extends ClickableSpan {

    /* renamed from: E, reason: collision with root package name */
    private final View.OnClickListener f42722E;

    /* renamed from: F, reason: collision with root package name */
    private final int f42723F;

    public i(View.OnClickListener onClickListener, int i4) {
        this.f42722E = onClickListener;
        this.f42723F = i4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f42722E.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f42723F);
        textPaint.setUnderlineText(true);
        textPaint.setFakeBoldText(true);
    }
}
