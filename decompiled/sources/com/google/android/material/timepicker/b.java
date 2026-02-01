package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes2.dex */
class b implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private int f33917a;

    public b(int i4) {
        this.f33917a = i4;
    }

    public int a() {
        return this.f33917a;
    }

    public void b(int i4) {
        this.f33917a = i4;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i6, i7, charSequence.subSequence(i4, i5).toString());
            if (Integer.parseInt(sb.toString()) <= this.f33917a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
