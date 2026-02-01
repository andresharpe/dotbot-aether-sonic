package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.annotation.P;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class q extends RelativeLayout {

    /* renamed from: E, reason: collision with root package name */
    private View f42789E;

    /* renamed from: F, reason: collision with root package name */
    private View f42790F;

    /* renamed from: G, reason: collision with root package name */
    private Animation f42791G;

    /* renamed from: H, reason: collision with root package name */
    private Animation f42792H;

    /* renamed from: I, reason: collision with root package name */
    private AnimationSet f42793I;

    public q(@l3.d Context context) {
        super(context);
        a();
    }

    private void a() {
        View.inflate(getContext(), j.i.f41384E1, this);
        this.f42789E = findViewById(j.h.y3);
        this.f42790F = findViewById(j.h.z3);
        this.f42789E.setVisibility(4);
        this.f42790F.setVisibility(4);
        this.f42791G = AnimationUtils.loadAnimation(getContext(), j.a.f40562a);
        this.f42792H = AnimationUtils.loadAnimation(getContext(), j.a.f40563b);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f42791G.setInterpolator(linearInterpolator);
        this.f42792H.setInterpolator(linearInterpolator);
    }

    public q(@l3.d Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public q(@l3.d Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a();
    }

    public q(@l3.d Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        a();
    }
}
