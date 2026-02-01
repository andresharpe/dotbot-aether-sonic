package W0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.d;
import com.google.android.material.circularreveal.g;

/* loaded from: classes2.dex */
public class a extends CoordinatorLayout implements g {

    /* renamed from: l0, reason: collision with root package name */
    @N
    private final d f3806l0;

    public a(@N Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.g
    public void a() {
        this.f3806l0.a();
    }

    @Override // com.google.android.material.circularreveal.g
    public void b() {
        this.f3806l0.b();
    }

    @Override // com.google.android.material.circularreveal.d.a
    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.d.a
    public boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public void draw(Canvas canvas) {
        d dVar = this.f3806l0;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.g
    @P
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f3806l0.g();
    }

    @Override // com.google.android.material.circularreveal.g
    public int getCircularRevealScrimColor() {
        return this.f3806l0.h();
    }

    @Override // com.google.android.material.circularreveal.g
    @P
    public g.e getRevealInfo() {
        return this.f3806l0.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public boolean isOpaque() {
        d dVar = this.f3806l0;
        if (dVar != null) {
            return dVar.l();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealOverlayDrawable(@P Drawable drawable) {
        this.f3806l0.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealScrimColor(@InterfaceC0569l int i4) {
        this.f3806l0.n(i4);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setRevealInfo(@P g.e eVar) {
        this.f3806l0.o(eVar);
    }

    public a(@N Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3806l0 = new d(this);
    }
}
