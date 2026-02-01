package androidx.constraintlayout.core.motion;

import androidx.core.view.C0823k0;

/* loaded from: classes.dex */
public class CustomAttribute {

    /* renamed from: i, reason: collision with root package name */
    private static final String f6742i = "TransitionLayout";

    /* renamed from: a, reason: collision with root package name */
    private boolean f6743a;

    /* renamed from: b, reason: collision with root package name */
    String f6744b;

    /* renamed from: c, reason: collision with root package name */
    private AttributeType f6745c;

    /* renamed from: d, reason: collision with root package name */
    private int f6746d;

    /* renamed from: e, reason: collision with root package name */
    private float f6747e;

    /* renamed from: f, reason: collision with root package name */
    private String f6748f;

    /* renamed from: g, reason: collision with root package name */
    boolean f6749g;

    /* renamed from: h, reason: collision with root package name */
    private int f6750h;

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
        static final /* synthetic */ int[] f6751a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f6751a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6751a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6751a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6751a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6751a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6751a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6751a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6751a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.f6743a = false;
        this.f6744b = str;
        this.f6745c = attributeType;
    }

    private static int a(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    public static int f(float f4, float f5, float f6) {
        float f7 = f4 * 6.0f;
        int i4 = (int) f7;
        float f8 = f7 - i4;
        float f9 = f6 * 255.0f;
        int i5 = (int) (((1.0f - f5) * f9) + 0.5f);
        int i6 = (int) (((1.0f - (f8 * f5)) * f9) + 0.5f);
        int i7 = (int) (((1.0f - ((1.0f - f8) * f5)) * f9) + 0.5f);
        int i8 = (int) (f9 + 0.5f);
        if (i4 == 0) {
            return ((i8 << 16) + (i7 << 8) + i5) | C0823k0.f13589t;
        }
        if (i4 == 1) {
            return ((i6 << 16) + (i8 << 8) + i5) | C0823k0.f13589t;
        }
        if (i4 == 2) {
            return ((i5 << 16) + (i8 << 8) + i7) | C0823k0.f13589t;
        }
        if (i4 == 3) {
            return ((i5 << 16) + (i6 << 8) + i8) | C0823k0.f13589t;
        }
        if (i4 == 4) {
            return ((i7 << 16) + (i5 << 8) + i8) | C0823k0.f13589t;
        }
        if (i4 != 5) {
            return 0;
        }
        return ((i8 << 16) + (i5 << 8) + i6) | C0823k0.f13589t;
    }

    public boolean b(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute == null || (attributeType = this.f6745c) != customAttribute.f6745c) {
            return false;
        }
        switch (a.f6751a[attributeType.ordinal()]) {
            case 1:
            case 6:
                if (this.f6746d != customAttribute.f6746d) {
                    return false;
                }
                return true;
            case 2:
                if (this.f6749g != customAttribute.f6749g) {
                    return false;
                }
                return true;
            case 3:
                if (this.f6746d != customAttribute.f6746d) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                if (this.f6750h != customAttribute.f6750h) {
                    return false;
                }
                return true;
            case 7:
                if (this.f6747e != customAttribute.f6747e) {
                    return false;
                }
                return true;
            case 8:
                if (this.f6747e != customAttribute.f6747e) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public AttributeType c() {
        return this.f6745c;
    }

    public float d() {
        switch (a.f6751a[this.f6745c.ordinal()]) {
            case 2:
                if (this.f6749g) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f6746d;
            case 7:
                return this.f6747e;
            case 8:
                return this.f6747e;
            default:
                return Float.NaN;
        }
    }

    public void e(float[] fArr) {
        float f4;
        switch (a.f6751a[this.f6745c.ordinal()]) {
            case 2:
                if (this.f6749g) {
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
                int i4 = (this.f6750h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i4 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f6746d;
                return;
            case 7:
                fArr[0] = this.f6747e;
                return;
            case 8:
                fArr[0] = this.f6747e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int i4 = a.f6751a[this.f6745c.ordinal()];
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            return true;
        }
        return false;
    }

    public int h() {
        int i4 = a.f6751a[this.f6745c.ordinal()];
        if (i4 == 4 || i4 == 5) {
            return 4;
        }
        return 1;
    }

    public void i(int i4) {
        this.f6750h = i4;
    }

    public void j(float f4) {
        this.f6747e = f4;
    }

    public void k(int i4) {
        this.f6746d = i4;
    }

    public void l(String str) {
        this.f6748f = str;
    }

    public void m(Object obj) {
        switch (a.f6751a[this.f6745c.ordinal()]) {
            case 1:
            case 6:
                this.f6746d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f6749g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f6748f = (String) obj;
                return;
            case 4:
            case 5:
                this.f6750h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f6747e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f6747e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void n(float[] fArr) {
        boolean z3 = true;
        switch (a.f6751a[this.f6745c.ordinal()]) {
            case 1:
            case 6:
                this.f6746d = (int) fArr[0];
                return;
            case 2:
                if (fArr[0] <= 0.5d) {
                    z3 = false;
                }
                this.f6749g = z3;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int f4 = f(fArr[0], fArr[1], fArr[2]);
                this.f6750h = f4;
                this.f6750h = (a((int) (fArr[3] * 255.0f)) << 24) | (f4 & C0823k0.f13588s);
                return;
            case 7:
                this.f6747e = fArr[0];
                return;
            case 8:
                this.f6747e = fArr[0];
                return;
            default:
                return;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z3) {
        this.f6744b = str;
        this.f6745c = attributeType;
        this.f6743a = z3;
        m(obj);
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.f6743a = false;
        this.f6744b = customAttribute.f6744b;
        this.f6745c = customAttribute.f6745c;
        m(obj);
    }
}
