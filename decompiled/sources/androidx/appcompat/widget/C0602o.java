package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import d.C2042a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0602o {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final TextView f6291a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    private final androidx.emoji2.viewsintegration.f f6292b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0602o(@androidx.annotation.N TextView textView) {
        this.f6291a = textView;
        this.f6292b = new androidx.emoji2.viewsintegration.f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public InputFilter[] a(@androidx.annotation.N InputFilter[] inputFilterArr) {
        return this.f6292b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f6292b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(@androidx.annotation.P AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f6291a.getContext().obtainStyledAttributes(attributeSet, C2042a.m.f50174v0, i4, 0);
        try {
            boolean z3 = true;
            if (obtainStyledAttributes.hasValue(C2042a.m.f50007K0)) {
                z3 = obtainStyledAttributes.getBoolean(C2042a.m.f50007K0, true);
            }
            obtainStyledAttributes.recycle();
            e(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z3) {
        this.f6292b.c(z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z3) {
        this.f6292b.d(z3);
    }

    @androidx.annotation.P
    public TransformationMethod f(@androidx.annotation.P TransformationMethod transformationMethod) {
        return this.f6292b.f(transformationMethod);
    }
}
