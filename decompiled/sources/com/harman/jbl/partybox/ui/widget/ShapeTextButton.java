package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
public class ShapeTextButton extends ConstraintLayout {

    /* renamed from: p0, reason: collision with root package name */
    private Context f45870p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f45871q0;

    /* renamed from: r0, reason: collision with root package name */
    private View f45872r0;

    /* renamed from: s0, reason: collision with root package name */
    private TextView f45873s0;

    /* renamed from: t0, reason: collision with root package name */
    private ImageView f45874t0;

    public ShapeTextButton(Context context) {
        this(context, null);
    }

    private Drawable L(int i4) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f45870p0.getDrawable(j.f.Va);
        gradientDrawable.setStroke(com.harman.jbl.partybox.utils.j.a(this.f45870p0, 2.0f), i4);
        return gradientDrawable;
    }

    private void M(Context context, AttributeSet attributeSet) {
        this.f45870p0 = context;
        View inflate = LayoutInflater.from(context).inflate(j.i.f41533p2, (ViewGroup) this, true);
        this.f45872r0 = inflate;
        this.f45873s0 = (TextView) inflate.findViewById(j.h.Ai);
        this.f45874t0 = (ImageView) this.f45872r0.findViewById(j.h.q7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41952X0);
        String string = obtainStyledAttributes.getString(j.o.f41965c1);
        if (!TextUtils.isEmpty(string)) {
            this.f45873s0.setText(string);
        }
        this.f45873s0.setTextColor(obtainStyledAttributes.getColor(j.o.f41959a1, Color.parseColor("#59FFFF")));
        this.f45873s0.setBackgroundResource(obtainStyledAttributes.getResourceId(j.o.f41962b1, j.f.Va));
        this.f45874t0.setImageResource(obtainStyledAttributes.getResourceId(j.o.f41954Y0, j.f.f41051i1));
        setChecked(obtainStyledAttributes.getBoolean(j.o.f41956Z0, false));
        obtainStyledAttributes.recycle();
    }

    public boolean N() {
        return this.f45871q0;
    }

    public void setChecked(boolean z3) {
        float f4;
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.5f;
        }
        this.f45872r0.setAlpha(f4);
        this.f45871q0 = z3;
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f45873s0.setText(str);
        setSelected(true);
    }

    public ShapeTextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45871q0 = false;
        M(context, attributeSet);
    }
}
