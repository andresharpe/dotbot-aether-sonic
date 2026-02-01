package com.harman.jbl.cd_biz_comm.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partylight.lib.g;

/* loaded from: classes2.dex */
public class MenuSwitchView extends ConstraintLayout {

    /* renamed from: p0, reason: collision with root package name */
    private TextView f38033p0;

    /* renamed from: q0, reason: collision with root package name */
    private TextView f38034q0;

    /* renamed from: r0, reason: collision with root package name */
    private ImageView f38035r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f38036s0;

    /* renamed from: t0, reason: collision with root package name */
    private a f38037t0;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z3);
    }

    public MenuSwitchView(@N Context context) {
        this(context, null);
    }

    public a getOnSwitchChangedListener() {
        return this.f38037t0;
    }

    public boolean getSwitchValue() {
        return this.f38036s0;
    }

    public void onClick(View view) {
        boolean z3 = !this.f38036s0;
        setSwitchValue(z3);
        a aVar = this.f38037t0;
        if (aVar != null) {
            aVar.a(z3);
        }
    }

    public void setOnSwitchChangedListener(a aVar) {
        this.f38037t0 = aVar;
    }

    public void setSwitchDesc(String str) {
        this.f38034q0.setText(str);
    }

    public void setSwitchTitle(String str) {
        this.f38033p0.setText(str);
    }

    public void setSwitchValue(boolean z3) {
        if (this.f38036s0 != z3) {
            this.f38036s0 = z3;
            if (z3) {
                this.f38035r0.setImageResource(g.e.f46789e);
            } else {
                this.f38035r0.setImageResource(g.e.f46788d);
            }
        }
    }

    public MenuSwitchView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuSwitchView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f38036s0 = false;
        LayoutInflater.from(context).inflate(g.h.f47000J, this);
        this.f38033p0 = (TextView) findViewById(g.C0418g.f46945m2);
        this.f38034q0 = (TextView) findViewById(g.C0418g.f46941l2);
        ImageView imageView = (ImageView) findViewById(g.C0418g.f46974u0);
        this.f38035r0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.cd_biz_comm.widget.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSwitchView.this.onClick(view);
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.n.f47177K);
        setSwitchTitle(obtainStyledAttributes.getString(g.n.f47179M));
        setSwitchDesc(obtainStyledAttributes.getString(g.n.f47178L));
        setSwitchValue(obtainStyledAttributes.getBoolean(g.n.f47180N, false));
        obtainStyledAttributes.recycle();
    }
}
