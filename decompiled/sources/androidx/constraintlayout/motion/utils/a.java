package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8421a = "CustomSupport";

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f8422b = false;

    /* renamed from: androidx.constraintlayout.motion.utils.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0063a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8423a;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            f8423a = iArr;
            try {
                iArr[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8423a[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8423a[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8423a[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8423a[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8423a[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8423a[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int a(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    public static void b(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + constraintAttribute.h();
        try {
            boolean z3 = true;
            switch (C0063a.f8423a[constraintAttribute.j().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int a4 = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(a4);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.h());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z3 = false;
                    }
                    objArr[0] = Boolean.valueOf(z3);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e4) {
            Log.e(f8421a, "cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.c.k(view) + "\"");
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            Log.e(f8421a, "no method " + str + " on View \"" + androidx.constraintlayout.motion.widget.c.k(view) + "\"");
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
    }
}
