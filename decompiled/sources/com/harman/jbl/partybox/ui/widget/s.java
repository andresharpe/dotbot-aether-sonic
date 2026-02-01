package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class s extends ConstraintLayout {

    /* renamed from: p0, reason: collision with root package name */
    private Context f46151p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f46152q0;

    /* renamed from: r0, reason: collision with root package name */
    private View f46153r0;

    /* renamed from: s0, reason: collision with root package name */
    private TextView f46154s0;

    /* renamed from: t0, reason: collision with root package name */
    private TextView f46155t0;

    /* renamed from: u0, reason: collision with root package name */
    private ImageView f46156u0;

    /* renamed from: v0, reason: collision with root package name */
    private ImageView f46157v0;

    public s(Context context) {
        this(context, null);
    }

    private void L(Context context, AttributeSet attributeSet) {
        this.f46151p0 = context;
        View inflate = LayoutInflater.from(context).inflate(j.i.f41513k2, (ViewGroup) this, true);
        this.f46153r0 = inflate;
        this.f46154s0 = (TextView) inflate.findViewById(j.h.Ai);
        this.f46155t0 = (TextView) this.f46153r0.findViewById(j.h.Ph);
        this.f46156u0 = (ImageView) this.f46153r0.findViewById(j.h.y7);
        this.f46157v0 = (ImageView) this.f46153r0.findViewById(j.h.p7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41947V);
        String string = obtainStyledAttributes.getString(j.o.f41965c1);
        if (!TextUtils.isEmpty(string)) {
            this.f46154s0.setText(string);
        }
        this.f46154s0.setTextColor(obtainStyledAttributes.getColor(j.o.f41959a1, Color.parseColor("#59FFFF")));
        this.f46154s0.setBackgroundResource(obtainStyledAttributes.getResourceId(j.o.f41962b1, j.f.Va));
        this.f46156u0.setImageResource(obtainStyledAttributes.getResourceId(j.o.f41954Y0, j.f.f41051i1));
        setChecked(obtainStyledAttributes.getBoolean(j.o.f41956Z0, false));
        obtainStyledAttributes.recycle();
    }

    public boolean M() {
        return this.f46152q0;
    }

    public void setChecked(boolean z3) {
        float f4;
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.5f;
        }
        this.f46153r0.setAlpha(f4);
        this.f46152q0 = z3;
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f46154s0.setText(str);
        setSelected(true);
    }

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46152q0 = false;
        L(context, attributeSet);
    }
}
