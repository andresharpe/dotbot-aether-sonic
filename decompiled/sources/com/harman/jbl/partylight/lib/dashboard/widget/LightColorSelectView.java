package com.harman.jbl.partylight.lib.dashboard.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.annotation.N;
import com.harman.jbl.cd_biz_comm.utils.q;
import com.harman.jbl.partylight.lib.biz.Color;
import com.harman.jbl.partylight.lib.g;
import e.C2046a;
import java.util.Locale;

/* loaded from: classes2.dex */
public class LightColorSelectView extends RadioGroup implements View.OnClickListener {

    /* renamed from: I, reason: collision with root package name */
    public static String[] f46426I = {"#FFFFFF", "#FF4800", "#00FFD1", "#FF00C4"};

    /* renamed from: E, reason: collision with root package name */
    private int[] f46427E;

    /* renamed from: F, reason: collision with root package name */
    private int f46428F;

    /* renamed from: G, reason: collision with root package name */
    private q f46429G;

    /* renamed from: H, reason: collision with root package name */
    private a f46430H;

    /* loaded from: classes2.dex */
    public interface a {
        void a(@N Color color);

        void b();

        void c();
    }

    public LightColorSelectView(Context context) {
        this(context, null);
    }

    private int getCurrentLightRadioLength() {
        int[] iArr = this.f46427E;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    public void a(int[] iArr) {
        this.f46427E = iArr;
        if (iArr != null && iArr.length > 0) {
            removeAllViews();
            setWeightSum(iArr.length);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                View inflate = LayoutInflater.from(getContext()).inflate(g.h.f47024x, (ViewGroup) null);
                ImageView imageView = (ImageView) inflate.findViewById(g.C0418g.f46959q0);
                Drawable b4 = C2046a.b(getContext(), i5);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageDrawable(b4);
                inflate.setTag(Integer.valueOf(i4));
                if (this.f46428F == i4) {
                    imageView.setBackgroundResource(g.e.f46775R);
                }
                if (i4 == iArr.length - 1) {
                    ((ImageView) inflate.findViewById(g.C0418g.f46963r0)).setVisibility(0);
                }
                inflate.setOnClickListener(this);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
                layoutParams.weight = 1.0f;
                addView(inflate, layoutParams);
            }
        }
    }

    public void b(int i4, boolean z3) {
        int i5 = this.f46428F;
        if (i5 >= 0 && i5 < getChildCount()) {
            ((FrameLayout) getChildAt(i5)).getChildAt(0).setBackground(null);
        }
        ((FrameLayout) getChildAt(0)).getChildAt(0).setEnabled(z3);
        if (!z3 && i4 == 0) {
            i4++;
        }
        if (i4 >= 0 && i4 < getChildCount()) {
            ((FrameLayout) getChildAt(i4)).getChildAt(0).setBackgroundResource(g.e.f46775R);
        }
        this.f46428F = i4;
    }

    public a getOnLightColorSelectListener() {
        return this.f46430H;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f46429G.a(view);
        int intValue = ((Integer) view.getTag()).intValue();
        Log.d(getClass().getSimpleName(), String.format(Locale.CHINA, "onClick::currentLightRadioIndex = %1$d, index = %2$d, count = %3$d", Integer.valueOf(this.f46428F), Integer.valueOf(intValue), Integer.valueOf(getCurrentLightRadioLength())));
        int[] iArr = this.f46427E;
        if (iArr != null && intValue >= 0 && intValue < iArr.length) {
            if (this.f46430H != null && intValue == getCurrentLightRadioLength() - 1) {
                this.f46430H.c();
            }
            int i4 = this.f46428F;
            if (i4 == intValue) {
                return;
            }
            if (i4 >= 0 && i4 < getChildCount()) {
                ((FrameLayout) getChildAt(this.f46428F)).getChildAt(0).setBackground(null);
            }
            ((FrameLayout) view).getChildAt(0).setBackgroundResource(g.e.f46775R);
            this.f46428F = intValue;
            a aVar = this.f46430H;
            if (aVar != null) {
                if (intValue == 0) {
                    aVar.b();
                } else if (intValue != getCurrentLightRadioLength() - 1) {
                    this.f46430H.a(Color.f46223H.b(f46426I[intValue - 1]));
                }
            }
        }
    }

    public void setCurrentLightRadioIndex(int i4) {
        int i5 = this.f46428F;
        if (i5 >= 0 && i5 < getChildCount()) {
            ((FrameLayout) getChildAt(i5)).getChildAt(0).setBackground(null);
        }
        if (i4 >= 0 && i4 < getChildCount()) {
            ((FrameLayout) getChildAt(i4)).getChildAt(0).setBackgroundResource(g.e.f46775R);
        }
        this.f46428F = i4;
    }

    public void setOnLightColorSelectListener(a aVar) {
        this.f46430H = aVar;
    }

    public LightColorSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46428F = 0;
        this.f46429G = new q();
    }
}
