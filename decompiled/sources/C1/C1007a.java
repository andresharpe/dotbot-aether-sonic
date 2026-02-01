package c1;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.J;
import com.google.android.material.resources.b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1007a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21158a = "cubic-bezier";

    /* renamed from: b, reason: collision with root package name */
    private static final String f21159b = "path";

    /* renamed from: c, reason: collision with root package name */
    private static final String f21160c = "(";

    /* renamed from: d, reason: collision with root package name */
    private static final String f21161d = ")";

    private C1007a() {
    }

    private static float a(String[] strArr, int i4) {
        float parseFloat = Float.parseFloat(strArr[i4]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean c(String str, String str2) {
        if (str.startsWith(str2 + f21160c) && str.endsWith(f21161d)) {
            return true;
        }
        return false;
    }

    public static int d(@N Context context, @InterfaceC0563f int i4, int i5) {
        return b.e(context, i4, i5);
    }

    @N
    public static TimeInterpolator e(@N Context context, @InterfaceC0563f int i4, @N TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (c(valueOf, f21158a)) {
                    String[] split = b(valueOf, f21158a).split(",");
                    if (split.length == 4) {
                        return androidx.core.view.animation.b.b(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                }
                if (c(valueOf, f21159b)) {
                    return androidx.core.view.animation.b.c(J.e(b(valueOf, f21159b)));
                }
                throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
            }
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        return timeInterpolator;
    }
}
