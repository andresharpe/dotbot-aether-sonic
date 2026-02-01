package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class i extends MetricAffectingSpan {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Typeface f46127E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final Context f46128F;

    public i(@l3.d Context context, @l3.d Typeface typeface) {
        F.p(context, "context");
        F.p(typeface, "typeface");
        this.f46127E = typeface;
        this.f46128F = context;
    }

    private final void a(Paint paint, Typeface typeface) {
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l3.d TextPaint ds) {
        F.p(ds, "ds");
        a(ds, this.f46127E);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l3.d TextPaint paint) {
        F.p(paint, "paint");
        a(paint, this.f46127E);
    }
}
