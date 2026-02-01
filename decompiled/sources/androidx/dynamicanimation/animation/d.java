package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.W;

/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: a, reason: collision with root package name */
    final String f14271a;

    /* loaded from: classes.dex */
    static class a extends d<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FloatProperty f14272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, FloatProperty floatProperty) {
            super(str);
            this.f14272b = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(T t3) {
            return ((Float) this.f14272b.get(t3)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(T t3, float f4) {
            this.f14272b.setValue(t3, f4);
        }
    }

    public d(String str) {
        this.f14271a = str;
    }

    @W(24)
    public static <T> d<T> a(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float b(T t3);

    public abstract void c(T t3, float f4);
}
