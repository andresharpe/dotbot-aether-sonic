package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import d.C2042a;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0609w extends SeekBar {

    /* renamed from: E, reason: collision with root package name */
    private final C0610x f6323E;

    public C0609w(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f6323E.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f6323E.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6323E.g(canvas);
    }

    public C0609w(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49150O2);
    }

    public C0609w(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b0.a(this, getContext());
        C0610x c0610x = new C0610x(this);
        this.f6323E = c0610x;
        c0610x.c(attributeSet, i4);
    }
}
