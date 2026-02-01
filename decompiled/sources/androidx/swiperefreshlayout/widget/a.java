package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends ImageView {

    /* renamed from: G, reason: collision with root package name */
    private static final int f18461G = 503316480;

    /* renamed from: H, reason: collision with root package name */
    private static final int f18462H = 1023410176;

    /* renamed from: I, reason: collision with root package name */
    private static final float f18463I = 0.0f;

    /* renamed from: J, reason: collision with root package name */
    private static final float f18464J = 1.75f;

    /* renamed from: K, reason: collision with root package name */
    private static final float f18465K = 3.5f;

    /* renamed from: L, reason: collision with root package name */
    private static final int f18466L = 4;

    /* renamed from: E, reason: collision with root package name */
    private Animation.AnimationListener f18467E;

    /* renamed from: F, reason: collision with root package name */
    int f18468F;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0176a extends OvalShape {

        /* renamed from: E, reason: collision with root package name */
        private RadialGradient f18469E;

        /* renamed from: F, reason: collision with root package name */
        private Paint f18470F = new Paint();

        C0176a(int i4) {
            a.this.f18468F = i4;
            a((int) rect().width());
        }

        private void a(int i4) {
            float f4 = i4 / 2;
            RadialGradient radialGradient = new RadialGradient(f4, f4, a.this.f18468F, new int[]{a.f18462H, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f18469E = radialGradient;
            this.f18470F.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = a.this.getWidth() / 2;
            float height = a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f18470F);
            canvas.drawCircle(width, height, r0 - a.this.f18468F, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f4, float f5) {
            super.onResize(f4, f5);
            a((int) f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, int i4) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f4 = getContext().getResources().getDisplayMetrics().density;
        int i5 = (int) (f18464J * f4);
        int i6 = (int) (0.0f * f4);
        this.f18468F = (int) (f18465K * f4);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0823k0.N1(this, f4 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0176a(this.f18468F));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f18468F, i6, i5, f18461G);
            int i7 = this.f18468F;
            setPadding(i7, i7, i7, i7);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i4);
        C0823k0.I1(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f18467E = animationListener;
    }

    public void c(int i4) {
        setBackgroundColor(C0669d.f(getContext(), i4));
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f18467E;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f18467E;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f18468F * 2), getMeasuredHeight() + (this.f18468F * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i4);
        }
    }
}
