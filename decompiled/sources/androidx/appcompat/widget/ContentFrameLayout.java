package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: E, reason: collision with root package name */
    private TypedValue f5646E;

    /* renamed from: F, reason: collision with root package name */
    private TypedValue f5647F;

    /* renamed from: G, reason: collision with root package name */
    private TypedValue f5648G;

    /* renamed from: H, reason: collision with root package name */
    private TypedValue f5649H;

    /* renamed from: I, reason: collision with root package name */
    private TypedValue f5650I;

    /* renamed from: J, reason: collision with root package name */
    private TypedValue f5651J;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f5652K;

    /* renamed from: L, reason: collision with root package name */
    private a f5653L;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void b(int i4, int i5, int i6, int i7) {
        this.f5652K.set(i4, i5, i6, i7);
        if (C0823k0.U0(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f5650I == null) {
            this.f5650I = new TypedValue();
        }
        return this.f5650I;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f5651J == null) {
            this.f5651J = new TypedValue();
        }
        return this.f5651J;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f5648G == null) {
            this.f5648G = new TypedValue();
        }
        return this.f5648G;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f5649H == null) {
            this.f5649H = new TypedValue();
        }
        return this.f5649H;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f5646E == null) {
            this.f5646E = new TypedValue();
        }
        return this.f5646E;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f5647F == null) {
            this.f5647F = new TypedValue();
        }
        return this.f5647F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f5653L;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f5653L;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f5653L = aVar;
    }

    public ContentFrameLayout(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5652K = new Rect();
    }
}
