package com.google.android.material.datepicker;

import T0.a;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* loaded from: classes2.dex */
abstract class e extends com.google.android.material.internal.v {

    /* renamed from: K, reason: collision with root package name */
    private static final int f32204K = 1000;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final TextInputLayout f32205E;

    /* renamed from: F, reason: collision with root package name */
    private final DateFormat f32206F;

    /* renamed from: G, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f32207G;

    /* renamed from: H, reason: collision with root package name */
    private final String f32208H;

    /* renamed from: I, reason: collision with root package name */
    private final Runnable f32209I;

    /* renamed from: J, reason: collision with root package name */
    private Runnable f32210J;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f32211E;

        a(String str) {
            this.f32211E = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout textInputLayout = e.this.f32205E;
            DateFormat dateFormat = e.this.f32206F;
            Context context = textInputLayout.getContext();
            textInputLayout.setError(context.getString(a.m.f3064N0) + "\n" + String.format(context.getString(a.m.f3068P0), this.f32211E) + "\n" + String.format(context.getString(a.m.f3066O0), dateFormat.format(new Date(v.t().getTimeInMillis()))));
            e.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f32213E;

        b(long j4) {
            this.f32213E = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f32205E.setError(String.format(e.this.f32208H, g.c(this.f32213E)));
            e.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, DateFormat dateFormat, @N TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar) {
        this.f32206F = dateFormat;
        this.f32205E = textInputLayout;
        this.f32207G = aVar;
        this.f32208H = textInputLayout.getContext().getString(a.m.f3074S0);
        this.f32209I = new a(str);
    }

    private Runnable d(long j4) {
        return new b(j4);
    }

    void e() {
    }

    abstract void f(@P Long l4);

    public void g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    @Override // com.google.android.material.internal.v, android.text.TextWatcher
    public void onTextChanged(@N CharSequence charSequence, int i4, int i5, int i6) {
        this.f32205E.removeCallbacks(this.f32209I);
        this.f32205E.removeCallbacks(this.f32210J);
        this.f32205E.setError(null);
        f(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date parse = this.f32206F.parse(charSequence.toString());
            this.f32205E.setError(null);
            long time = parse.getTime();
            if (this.f32207G.g().D(time) && this.f32207G.o(time)) {
                f(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable d4 = d(time);
            this.f32210J = d4;
            g(this.f32205E, d4);
        } catch (ParseException unused) {
            g(this.f32205E, this.f32209I);
        }
    }
}
