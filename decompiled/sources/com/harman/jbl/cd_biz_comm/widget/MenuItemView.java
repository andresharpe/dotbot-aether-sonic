package com.harman.jbl.cd_biz_comm.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partylight.lib.g;

/* loaded from: classes2.dex */
public class MenuItemView extends ConstraintLayout {

    /* renamed from: p0, reason: collision with root package name */
    private TextView f38030p0;

    /* renamed from: q0, reason: collision with root package name */
    private ImageView f38031q0;

    /* renamed from: r0, reason: collision with root package name */
    private ImageView f38032r0;

    public MenuItemView(@N Context context) {
        this(context, null);
    }

    public void setMenuIcon(int i4) {
        this.f38031q0.setImageResource(i4);
    }

    public void setMenuIndicator(boolean z3) {
        int i4;
        ImageView imageView = this.f38032r0;
        if (z3) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        imageView.setVisibility(i4);
    }

    public void setMenuTitle(String str) {
        this.f38030p0.setText(str);
    }

    public MenuItemView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuItemView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater.from(context).inflate(g.h.f46999I, this);
        this.f38030p0 = (TextView) findViewById(g.C0418g.f46921g2);
        this.f38031q0 = (ImageView) findViewById(g.C0418g.f46947n0);
        this.f38032r0 = (ImageView) findViewById(g.C0418g.f46951o0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.n.f47206u);
        setMenuTitle(obtainStyledAttributes.getString(g.n.f47209x));
        setMenuIcon(obtainStyledAttributes.getResourceId(g.n.f47207v, g.e.f46787c));
        setMenuIndicator(obtainStyledAttributes.getBoolean(g.n.f47208w, false));
        obtainStyledAttributes.recycle();
    }
}
