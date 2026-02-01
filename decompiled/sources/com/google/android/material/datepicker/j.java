package com.google.android.material.datepicker;

import T0.a;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
class j extends BaseAdapter {

    /* renamed from: H, reason: collision with root package name */
    private static final int f32217H = 4;

    /* renamed from: I, reason: collision with root package name */
    private static final int f32218I;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Calendar f32219E;

    /* renamed from: F, reason: collision with root package name */
    private final int f32220F;

    /* renamed from: G, reason: collision with root package name */
    private final int f32221G;

    static {
        int i4;
        if (Build.VERSION.SDK_INT >= 26) {
            i4 = 4;
        } else {
            i4 = 1;
        }
        f32218I = i4;
    }

    public j() {
        Calendar v3 = v.v();
        this.f32219E = v3;
        this.f32220F = v3.getMaximum(7);
        this.f32221G = v3.getFirstDayOfWeek();
    }

    private int b(int i4) {
        int i5 = i4 + this.f32221G;
        int i6 = this.f32220F;
        if (i5 > i6) {
            return i5 - i6;
        }
        return i5;
    }

    @Override // android.widget.Adapter
    @P
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i4) {
        if (i4 >= this.f32220F) {
            return null;
        }
        return Integer.valueOf(b(i4));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f32220F;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @P
    @SuppressLint({"WrongConstant"})
    public View getView(int i4, @P View view, @N ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f3021s0, viewGroup, false);
        }
        this.f32219E.set(7, b(i4));
        textView.setText(this.f32219E.getDisplayName(7, f32218I, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(a.m.f3062M0), this.f32219E.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
