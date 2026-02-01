package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0990y {
    private C0990y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ObjectAnimator a(T t3, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
    }
}
