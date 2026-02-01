package com.google.android.material.datepicker;

import T0.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class w extends RecyclerView.Adapter<b> {

    /* renamed from: d, reason: collision with root package name */
    private final MaterialCalendar<?> f32272d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f32273E;

        a(int i4) {
            this.f32273E = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.f32272d.C0(w.this.f32272d.v0().e(m.e(this.f32273E, w.this.f32272d.x0().f32227F)));
            w.this.f32272d.D0(MaterialCalendar.k.DAY);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        final TextView f32275I;

        b(TextView textView) {
            super(textView);
            this.f32275I = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(MaterialCalendar<?> materialCalendar) {
        this.f32272d = materialCalendar;
    }

    @N
    private View.OnClickListener P(int i4) {
        return new a(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int Q(int i4) {
        return i4 - this.f32272d.v0().m().f32228G;
    }

    int R(int i4) {
        return this.f32272d.v0().m().f32228G + i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void C(@N b bVar, int i4) {
        com.google.android.material.datepicker.b bVar2;
        int R3 = R(i4);
        String string = bVar.f32275I.getContext().getString(a.m.f3072R0);
        bVar.f32275I.setText(String.format(Locale.getDefault(), com.google.android.material.timepicker.e.f33926M, Integer.valueOf(R3)));
        bVar.f32275I.setContentDescription(String.format(string, Integer.valueOf(R3)));
        c w02 = this.f32272d.w0();
        Calendar t3 = v.t();
        if (t3.get(1) == R3) {
            bVar2 = w02.f32195f;
        } else {
            bVar2 = w02.f32193d;
        }
        Iterator<Long> it = this.f32272d.getDateSelector().H().iterator();
        while (it.hasNext()) {
            t3.setTimeInMillis(it.next().longValue());
            if (t3.get(1) == R3) {
                bVar2 = w02.f32194e;
            }
        }
        bVar2.f(bVar.f32275I);
        bVar.f32275I.setOnClickListener(P(R3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b E(@N ViewGroup viewGroup, int i4) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f2919A0, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f32272d.v0().n();
    }
}
