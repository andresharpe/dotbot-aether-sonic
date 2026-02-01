package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.List;
import m.C2356a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12359a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12360b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f12361c = 2;

    private g() {
    }

    private static a a(@P a aVar, @InterfaceC0569l int i4, @InterfaceC0569l int i5, boolean z3, @InterfaceC0569l int i6) {
        if (aVar != null) {
            return aVar;
        }
        if (z3) {
            return new a(i4, i6, i5);
        }
        return new a(i4, i5);
    }

    static Shader b(@N Resources resources, @N XmlPullParser xmlPullParser, @P Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader c(@N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray s4 = n.s(resources, theme, attributeSet, C2356a.j.f54987C);
            float j4 = n.j(s4, xmlPullParser, "startX", C2356a.j.f54996L, 0.0f);
            float j5 = n.j(s4, xmlPullParser, "startY", C2356a.j.f54997M, 0.0f);
            float j6 = n.j(s4, xmlPullParser, "endX", C2356a.j.f54998N, 0.0f);
            float j7 = n.j(s4, xmlPullParser, "endY", C2356a.j.f54999O, 0.0f);
            float j8 = n.j(s4, xmlPullParser, "centerX", C2356a.j.f54991G, 0.0f);
            float j9 = n.j(s4, xmlPullParser, "centerY", C2356a.j.f54992H, 0.0f);
            int k4 = n.k(s4, xmlPullParser, "type", C2356a.j.f54990F, 0);
            int f4 = n.f(s4, xmlPullParser, "startColor", C2356a.j.f54988D, 0);
            boolean r4 = n.r(xmlPullParser, "centerColor");
            int f5 = n.f(s4, xmlPullParser, "centerColor", C2356a.j.f54995K, 0);
            int f6 = n.f(s4, xmlPullParser, "endColor", C2356a.j.f54989E, 0);
            int k5 = n.k(s4, xmlPullParser, "tileMode", C2356a.j.f54994J, 0);
            float j10 = n.j(s4, xmlPullParser, "gradientRadius", C2356a.j.f54993I, 0.0f);
            s4.recycle();
            a a4 = a(d(resources, xmlPullParser, attributeSet, theme), f4, f6, r4, f5);
            if (k4 != 1) {
                if (k4 != 2) {
                    return new LinearGradient(j4, j5, j6, j7, a4.f12362a, a4.f12363b, e(k5));
                }
                return new SweepGradient(j8, j9, a4.f12362a, a4.f12363b);
            }
            if (j10 > 0.0f) {
                return new RadialGradient(j8, j9, j10, a4.f12362a, a4.f12363b, e(k5));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.res.g.a d(@androidx.annotation.N android.content.res.Resources r8, @androidx.annotation.N org.xmlpull.v1.XmlPullParser r9, @androidx.annotation.N android.util.AttributeSet r10, @androidx.annotation.P android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = m.C2356a.j.f55000P
            android.content.res.TypedArray r3 = androidx.core.content.res.n.s(r8, r11, r10, r3)
            int r5 = m.C2356a.j.f55001Q
            boolean r5 = r3.hasValue(r5)
            int r6 = m.C2356a.j.f55002R
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = m.C2356a.j.f55001Q
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = m.C2356a.j.f55002R
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            androidx.core.content.res.g$a r8 = new androidx.core.content.res.g$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.g.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.g$a");
    }

    private static Shader.TileMode e(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f12362a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f12363b;

        a(@N List<Integer> list, @N List<Float> list2) {
            int size = list.size();
            this.f12362a = new int[size];
            this.f12363b = new float[size];
            for (int i4 = 0; i4 < size; i4++) {
                this.f12362a[i4] = list.get(i4).intValue();
                this.f12363b[i4] = list2.get(i4).floatValue();
            }
        }

        a(@InterfaceC0569l int i4, @InterfaceC0569l int i5) {
            this.f12362a = new int[]{i4, i5};
            this.f12363b = new float[]{0.0f, 1.0f};
        }

        a(@InterfaceC0569l int i4, @InterfaceC0569l int i5, @InterfaceC0569l int i6) {
            this.f12362a = new int[]{i4, i5, i6};
            this.f12363b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
