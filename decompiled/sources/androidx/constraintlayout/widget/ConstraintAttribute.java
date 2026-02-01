package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.h;
import androidx.core.view.C0823k0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class ConstraintAttribute {

    /* renamed from: i, reason: collision with root package name */
    private static final String f9423i = "TransitionLayout";

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f9424j = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f9425a;

    /* renamed from: b, reason: collision with root package name */
    String f9426b;

    /* renamed from: c, reason: collision with root package name */
    private AttributeType f9427c;

    /* renamed from: d, reason: collision with root package name */
    private int f9428d;

    /* renamed from: e, reason: collision with root package name */
    private float f9429e;

    /* renamed from: f, reason: collision with root package name */
    private String f9430f;

    /* renamed from: g, reason: collision with root package name */
    boolean f9431g;

    /* renamed from: h, reason: collision with root package name */
    private int f9432h;

    /* loaded from: classes.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9433a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f9433a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9433a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9433a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9433a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9433a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9433a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9433a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9433a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
        this.f9425a = false;
        this.f9426b = str;
        this.f9427c = attributeType;
    }

    private static int b(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    public static HashMap<String, ConstraintAttribute> d(HashMap<String, ConstraintAttribute> hashMap, View view) {
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void q(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.qd);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == h.m.rd) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == h.m.Bd) {
                str = obtainStyledAttributes.getString(index);
                z3 = true;
            } else if (index == h.m.sd) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == h.m.ud) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == h.m.td) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == h.m.yd) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == h.m.vd) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == h.m.wd) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == h.m.xd) {
                    attributeType = AttributeType.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == h.m.Ad) {
                    attributeType = AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == h.m.zd) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj, z3));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0047. Please report as an issue. */
    public static void r(View view, HashMap<String, ConstraintAttribute> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str2);
            if (!constraintAttribute.f9425a) {
                str = "set" + str2;
            } else {
                str = str2;
            }
            try {
                switch (a.f9433a[constraintAttribute.f9427c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f9428d));
                        break;
                    case 2:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f9431g));
                        break;
                    case 3:
                        cls.getMethod(str, CharSequence.class).invoke(view, constraintAttribute.f9430f);
                        break;
                    case 4:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f9432h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f9432h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f9428d));
                        break;
                    case 7:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f9429e));
                        break;
                    case 8:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f9429e));
                        break;
                }
            } catch (IllegalAccessException e4) {
                Log.e(f9423i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                e4.printStackTrace();
            } catch (NoSuchMethodException e5) {
                Log.e(f9423i, e5.getMessage());
                Log.e(f9423i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str);
                Log.e(f9423i, sb.toString());
            } catch (InvocationTargetException e6) {
                Log.e(f9423i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                e6.printStackTrace();
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f9426b;
        if (!this.f9425a) {
            str = "set" + str2;
        } else {
            str = str2;
        }
        try {
            switch (a.f9433a[this.f9427c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f9428d));
                    return;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f9431g));
                    return;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f9430f);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f9432h));
                    return;
                case 5:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f9432h);
                    method.invoke(view, colorDrawable);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f9429e));
                    return;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f9429e));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e4) {
            Log.e(f9423i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            Log.e(f9423i, e5.getMessage());
            Log.e(f9423i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" must have a method ");
            sb.append(str);
            Log.e(f9423i, sb.toString());
        } catch (InvocationTargetException e6) {
            Log.e(f9423i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e6.printStackTrace();
        }
    }

    public boolean c(ConstraintAttribute constraintAttribute) {
        AttributeType attributeType;
        if (constraintAttribute == null || (attributeType = this.f9427c) != constraintAttribute.f9427c) {
            return false;
        }
        switch (a.f9433a[attributeType.ordinal()]) {
            case 1:
            case 6:
                if (this.f9428d != constraintAttribute.f9428d) {
                    return false;
                }
                return true;
            case 2:
                if (this.f9431g != constraintAttribute.f9431g) {
                    return false;
                }
                return true;
            case 3:
                if (this.f9428d != constraintAttribute.f9428d) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                if (this.f9432h != constraintAttribute.f9432h) {
                    return false;
                }
                return true;
            case 7:
                if (this.f9429e != constraintAttribute.f9429e) {
                    return false;
                }
                return true;
            case 8:
                if (this.f9429e != constraintAttribute.f9429e) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public int e() {
        return this.f9432h;
    }

    public float f() {
        return this.f9429e;
    }

    public int g() {
        return this.f9428d;
    }

    public String h() {
        return this.f9426b;
    }

    public String i() {
        return this.f9430f;
    }

    public AttributeType j() {
        return this.f9427c;
    }

    public float k() {
        switch (a.f9433a[this.f9427c.ordinal()]) {
            case 2:
                if (this.f9431g) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f9428d;
            case 7:
                return this.f9429e;
            case 8:
                return this.f9429e;
            default:
                return Float.NaN;
        }
    }

    public void l(float[] fArr) {
        float f4;
        switch (a.f9433a[this.f9427c.ordinal()]) {
            case 2:
                if (this.f9431g) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                fArr[0] = f4;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i4 = (this.f9432h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i4 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f9428d;
                return;
            case 7:
                fArr[0] = this.f9429e;
                return;
            case 8:
                fArr[0] = this.f9429e;
                return;
            default:
                return;
        }
    }

    public boolean m() {
        return this.f9431g;
    }

    public boolean n() {
        int i4 = a.f9433a[this.f9427c.ordinal()];
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            return true;
        }
        return false;
    }

    public boolean o() {
        return this.f9425a;
    }

    public int p() {
        int i4 = a.f9433a[this.f9427c.ordinal()];
        if (i4 == 4 || i4 == 5) {
            return 4;
        }
        return 1;
    }

    public void s(int i4) {
        this.f9432h = i4;
    }

    public void t(float f4) {
        this.f9429e = f4;
    }

    public void u(int i4) {
        this.f9428d = i4;
    }

    public void v(String str) {
        this.f9430f = str;
    }

    public void w(Object obj) {
        switch (a.f9433a[this.f9427c.ordinal()]) {
            case 1:
            case 6:
                this.f9428d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f9431g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f9430f = (String) obj;
                return;
            case 4:
            case 5:
                this.f9432h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f9429e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f9429e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void x(float[] fArr) {
        boolean z3 = false;
        switch (a.f9433a[this.f9427c.ordinal()]) {
            case 1:
            case 6:
                this.f9428d = (int) fArr[0];
                return;
            case 2:
                if (fArr[0] > 0.5d) {
                    z3 = true;
                }
                this.f9431g = z3;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int HSVToColor = Color.HSVToColor(fArr);
                this.f9432h = HSVToColor;
                this.f9432h = (b((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & C0823k0.f13588s);
                return;
            case 7:
                this.f9429e = fArr[0];
                return;
            case 8:
                this.f9429e = fArr[0];
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z3) {
        this.f9426b = str;
        this.f9427c = attributeType;
        this.f9425a = z3;
        w(obj);
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f9425a = false;
        this.f9426b = constraintAttribute.f9426b;
        this.f9427c = constraintAttribute.f9427c;
        w(obj);
    }
}
