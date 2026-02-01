package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0589b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f6098a;

    @androidx.annotation.W(21)
    /* renamed from: androidx.appcompat.widget.b$a */
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0589b(ActionBarContainer actionBarContainer) {
        this.f6098a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f6098a;
        if (actionBarContainer.f5491L) {
            Drawable drawable = actionBarContainer.f5490K;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f5488I;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f6098a;
        Drawable drawable3 = actionBarContainer2.f5489J;
        if (drawable3 != null && actionBarContainer2.f5492M) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.W(21)
    public void getOutline(@androidx.annotation.N Outline outline) {
        ActionBarContainer actionBarContainer = this.f6098a;
        if (actionBarContainer.f5491L) {
            if (actionBarContainer.f5490K != null) {
                a.a(actionBarContainer.f5488I, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f5488I;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
