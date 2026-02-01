package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0965k extends RecyclerView.n {

    /* renamed from: d, reason: collision with root package name */
    public static final int f18123d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18124e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f18125f = "DividerItem";

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f18126g = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f18127a;

    /* renamed from: b, reason: collision with root package name */
    private int f18128b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f18129c = new Rect();

    public C0965k(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f18126g);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f18127a = drawable;
        if (drawable == null) {
            Log.w(f18125f, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        p(i4);
    }

    private void l(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i4 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i4, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i4 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.getLayoutManager().X(childAt, this.f18129c);
            int round = this.f18129c.right + Math.round(childAt.getTranslationX());
            this.f18127a.setBounds(round - this.f18127a.getIntrinsicWidth(), i4, round, height);
            this.f18127a.draw(canvas);
        }
        canvas.restore();
    }

    private void m(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i4 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i4, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i4 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.v0(childAt, this.f18129c);
            int round = this.f18129c.bottom + Math.round(childAt.getTranslationY());
            this.f18127a.setBounds(i4, round - this.f18127a.getIntrinsicHeight(), width, round);
            this.f18127a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c4) {
        Drawable drawable = this.f18127a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f18128b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c4) {
        if (recyclerView.getLayoutManager() != null && this.f18127a != null) {
            if (this.f18128b == 1) {
                m(canvas, recyclerView);
            } else {
                l(canvas, recyclerView);
            }
        }
    }

    @P
    public Drawable n() {
        return this.f18127a;
    }

    public void o(@N Drawable drawable) {
        if (drawable != null) {
            this.f18127a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void p(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f18128b = i4;
    }
}
