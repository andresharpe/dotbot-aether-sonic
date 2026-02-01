package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* loaded from: classes.dex */
abstract class k extends f {

    /* renamed from: E, reason: collision with root package name */
    protected static final float f8701E = 20.0f;

    /* renamed from: D, reason: collision with root package name */
    int f8702D = f.f8535f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
    }

    abstract void o(int i4, int i5, float f4, float f5, float f6, float f7);

    abstract float p();

    abstract float q();

    public abstract boolean r(int i4, int i5, RectF rectF, RectF rectF2, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(View view, RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr);
}
