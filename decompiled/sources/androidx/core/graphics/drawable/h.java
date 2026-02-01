package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.N;
import androidx.annotation.W;

@W(21)
/* loaded from: classes.dex */
class h extends i {
    /* JADX INFO: Access modifiers changed from: protected */
    public h(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // androidx.core.graphics.drawable.i
    void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
        Gravity.apply(i4, i5, i6, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@N Outline outline) {
        t();
        outline.setRoundRect(this.f12533h, c());
    }

    @Override // androidx.core.graphics.drawable.i
    public boolean h() {
        Bitmap bitmap = this.f12526a;
        if (bitmap != null && bitmap.hasMipMap()) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.i
    public void o(boolean z3) {
        Bitmap bitmap = this.f12526a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z3);
            invalidateSelf();
        }
    }
}
