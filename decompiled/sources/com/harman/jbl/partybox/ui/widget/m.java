package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0669d;
import com.harman.jbl.partybox.j;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public class m extends AppCompatTextView {

    /* renamed from: L, reason: collision with root package name */
    @l3.e
    private LinearGradient f46135L;

    /* renamed from: M, reason: collision with root package name */
    private int f46136M;

    /* renamed from: N, reason: collision with root package name */
    private int f46137N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@l3.d Context context) {
        super(context);
        F.p(context, "context");
        this.f46136M = C0669d.f(getContext(), j.d.f40762k);
        this.f46137N = C0669d.f(getContext(), j.d.f40693G0);
        v();
    }

    private final void u(TypedArray typedArray) {
        this.f46136M = typedArray.getColor(j.o.f41996n, this.f46136M);
        this.f46137N = typedArray.getColor(j.o.f41993m, this.f46137N);
    }

    private final void v() {
        float measureText = getPaint().measureText(getText().toString());
        setTextColor(this.f46136M);
        this.f46135L = new LinearGradient(0.0f, 0.0f, measureText, getTextSize(), this.f46136M, this.f46137N, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
            getPaint().setShader(this.f46135L);
        }
    }

    public final void w(int i4, int i5) {
        this.f46136M = i4;
        this.f46137N = i5;
        v();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@l3.d Context context, @l3.d AttributeSet attrs) {
        super(context, attrs);
        F.p(context, "context");
        F.p(attrs, "attrs");
        this.f46136M = C0669d.f(getContext(), j.d.f40762k);
        this.f46137N = C0669d.f(getContext(), j.d.f40693G0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, j.o.f41990l);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        u(obtainStyledAttributes);
        v();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@l3.d Context context, @l3.d AttributeSet attrs, int i4) {
        super(context, attrs, i4);
        F.p(context, "context");
        F.p(attrs, "attrs");
        this.f46136M = C0669d.f(getContext(), j.d.f40762k);
        this.f46137N = C0669d.f(getContext(), j.d.f40693G0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, j.o.f41990l);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        u(obtainStyledAttributes);
        v();
    }
}
