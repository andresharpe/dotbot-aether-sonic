package androidx.transition;

import android.animation.TypeEvaluator;

/* renamed from: androidx.transition.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0981o implements TypeEvaluator<float[]> {

    /* renamed from: a, reason: collision with root package name */
    private float[] f20119a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0981o(float[] fArr) {
        this.f20119a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f4, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f20119a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i4 = 0; i4 < fArr3.length; i4++) {
            float f5 = fArr[i4];
            fArr3[i4] = f5 + ((fArr2[i4] - f5) * f4);
        }
        return fArr3;
    }
}
