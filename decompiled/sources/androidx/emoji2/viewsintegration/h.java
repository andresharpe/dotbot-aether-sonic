package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(19)
/* loaded from: classes.dex */
class h implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final TransformationMethod f14595a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(@P TransformationMethod transformationMethod) {
        this.f14595a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f14595a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@P CharSequence charSequence, @N View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f14595a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.g.b().f() == 1) {
            return androidx.emoji2.text.g.b().u(charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i4, Rect rect) {
        TransformationMethod transformationMethod = this.f14595a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i4, rect);
        }
    }
}
