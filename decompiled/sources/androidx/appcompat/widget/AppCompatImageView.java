package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0814h0;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC0814h0, androidx.core.widget.w {

    /* renamed from: E, reason: collision with root package name */
    private final C0593f f5606E;

    /* renamed from: F, reason: collision with root package name */
    private final C0604q f5607F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f5608G;

    public AppCompatImageView(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f5606E;
        if (c0593f != null) {
            c0593f.b();
        }
        C0604q c0604q = this.f5607F;
        if (c0604q != null) {
            c0604q.c();
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f5606E;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f5606E;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        C0604q c0604q = this.f5607F;
        if (c0604q != null) {
            return c0604q.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        C0604q c0604q = this.f5607F;
        if (c0604q != null) {
            return c0604q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.f5607F.f() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f5606E;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f5606E;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0604q c0604q = this.f5607F;
        if (c0604q != null) {
            c0604q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.P Drawable drawable) {
        C0604q c0604q = this.f5607F;
        if (c0604q != null && drawable != null && !this.f5608G) {
            c0604q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C0604q c0604q2 = this.f5607F;
        if (c0604q2 != null) {
            c0604q2.c();
            if (!this.f5608G) {
                this.f5607F.b();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.f5608G = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@InterfaceC0578v int i4) {
        C0604q c0604q = this.f5607F;
        if (c0604q != null) {
            c0604q.i(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.P Uri uri) {
        super.setImageURI(uri);
        C0604q c0604q = this.f5607F;
        if (c0604q != null) {
            c0604q.c();
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f5606E;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f5606E;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0604q c0604q = this.f5607F;
        if (c0604q != null) {
            c0604q.k(colorStateList);
        }
    }

    @Override // androidx.core.widget.w
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0604q c0604q = this.f5607F;
        if (c0604q != null) {
            c0604q.l(mode);
        }
    }

    public AppCompatImageView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(d0.b(context), attributeSet, i4);
        this.f5608G = false;
        b0.a(this, getContext());
        C0593f c0593f = new C0593f(this);
        this.f5606E = c0593f;
        c0593f.e(attributeSet, i4);
        C0604q c0604q = new C0604q(this);
        this.f5607F = c0604q;
        c0604q.g(attributeSet, i4);
    }
}
