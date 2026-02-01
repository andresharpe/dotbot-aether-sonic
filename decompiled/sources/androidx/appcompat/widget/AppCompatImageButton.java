package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0814h0;
import d.C2042a;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton implements InterfaceC0814h0, androidx.core.widget.w {

    /* renamed from: E, reason: collision with root package name */
    private final C0593f f5603E;

    /* renamed from: F, reason: collision with root package name */
    private final C0604q f5604F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f5605G;

    public AppCompatImageButton(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f5603E;
        if (c0593f != null) {
            c0593f.b();
        }
        C0604q c0604q = this.f5604F;
        if (c0604q != null) {
            c0604q.c();
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f5603E;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f5603E;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        C0604q c0604q = this.f5604F;
        if (c0604q != null) {
            return c0604q.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        C0604q c0604q = this.f5604F;
        if (c0604q != null) {
            return c0604q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.f5604F.f() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f5603E;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f5603E;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0604q c0604q = this.f5604F;
        if (c0604q != null) {
            c0604q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.P Drawable drawable) {
        C0604q c0604q = this.f5604F;
        if (c0604q != null && drawable != null && !this.f5605G) {
            c0604q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C0604q c0604q2 = this.f5604F;
        if (c0604q2 != null) {
            c0604q2.c();
            if (!this.f5605G) {
                this.f5604F.b();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.f5605G = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@InterfaceC0578v int i4) {
        this.f5604F.i(i4);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.P Uri uri) {
        super.setImageURI(uri);
        C0604q c0604q = this.f5604F;
        if (c0604q != null) {
            c0604q.c();
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f5603E;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f5603E;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0604q c0604q = this.f5604F;
        if (c0604q != null) {
            c0604q.k(colorStateList);
        }
    }

    @Override // androidx.core.widget.w
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0604q c0604q = this.f5604F;
        if (c0604q != null) {
            c0604q.l(mode);
        }
    }

    public AppCompatImageButton(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49133K1);
    }

    public AppCompatImageButton(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(d0.b(context), attributeSet, i4);
        this.f5605G = false;
        b0.a(this, getContext());
        C0593f c0593f = new C0593f(this);
        this.f5603E = c0593f;
        c0593f.e(attributeSet, i4);
        C0604q c0604q = new C0604q(this);
        this.f5604F = c0604q;
        c0604q.g(attributeSet, i4);
    }
}
