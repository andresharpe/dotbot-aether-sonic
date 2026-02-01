package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import androidx.annotation.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f12549a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f12550b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f12551c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f12552d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(@P o oVar) {
        this.f12551c = null;
        this.f12552d = m.f12540K;
        if (oVar != null) {
            this.f12549a = oVar.f12549a;
            this.f12550b = oVar.f12550b;
            this.f12551c = oVar.f12551c;
            this.f12552d = oVar.f12552d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f12550b != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i4;
        int i5 = this.f12549a;
        Drawable.ConstantState constantState = this.f12550b;
        if (constantState != null) {
            i4 = constantState.getChangingConfigurations();
        } else {
            i4 = 0;
        }
        return i5 | i4;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @N
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @N
    public Drawable newDrawable(@P Resources resources) {
        return new n(this, resources);
    }
}
