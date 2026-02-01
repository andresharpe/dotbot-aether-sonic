package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.v;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class K {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f19925b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final androidx.collection.a<String, Constructor<?>> f19926c = new androidx.collection.a<>();

    /* renamed from: a, reason: collision with root package name */
    private final Context f19927a;

    private K(@androidx.annotation.N Context context) {
        this.f19927a = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue != null) {
            try {
                androidx.collection.a<String, Constructor<?>> aVar = f19926c;
                synchronized (aVar) {
                    try {
                        Constructor<?> constructor = aVar.get(attributeValue);
                        if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f19927a.getClassLoader()).asSubclass(cls)) != 0) {
                            constructor = asSubclass.getConstructor(f19925b);
                            constructor.setAccessible(true);
                            aVar.put(attributeValue, constructor);
                        }
                        newInstance = constructor.newInstance(this.f19927a, attributeSet);
                    } finally {
                    }
                }
                return newInstance;
            } catch (Exception e4) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e4);
            }
        }
        throw new InflateException(str + " tag must have a 'class' attribute");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x017d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.J b(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, androidx.transition.J r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.K.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.J):androidx.transition.J");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.M c(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L54
        L12:
            r3 = 1
            if (r2 == r3) goto L54
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b
            androidx.transition.M r1 = new androidx.transition.M
            r1.<init>()
            goto L5
        L2b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            if (r1 == 0) goto L39
            r4.h(r6, r5, r7, r1)
            goto L5
        L39:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.K.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.M");
    }

    @androidx.annotation.N
    public static K d(@androidx.annotation.N Context context) {
        return new K(context);
    }

    @SuppressLint({"RestrictedApi"})
    private void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, J j4) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    if (xmlPullParser.getName().equals(v.a.f7370M)) {
                        TypedArray obtainStyledAttributes = this.f19927a.obtainStyledAttributes(attributeSet, I.f19835a);
                        int l4 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                        if (l4 != 0) {
                            j4.b(l4);
                        } else {
                            int l5 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                            if (l5 != 0) {
                                j4.D(l5, true);
                            } else {
                                String m4 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                                if (m4 != null) {
                                    j4.f(m4);
                                } else {
                                    String m5 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                    if (m5 != null) {
                                        j4.G(m5, true);
                                    } else {
                                        String m6 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                        if (m6 != null) {
                                            try {
                                                j4.F(Class.forName(m6), true);
                                            } catch (ClassNotFoundException e4) {
                                                obtainStyledAttributes.recycle();
                                                throw new RuntimeException("Could not create " + m6, e4);
                                            }
                                        } else {
                                            String m7 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                            if (m7 != null) {
                                                j4.e(Class.forName(m7));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obtainStyledAttributes.recycle();
                    } else {
                        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                    }
                }
            } else {
                return;
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    private void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, M m4) throws Resources.NotFoundException {
        F d4;
        J f4;
        TypedArray obtainStyledAttributes = this.f19927a.obtainStyledAttributes(attributeSet, I.f19836b);
        int l4 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int l5 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        F f5 = null;
        if (l5 < 0) {
            d4 = null;
        } else {
            d4 = F.d(viewGroup, l5, this.f19927a);
        }
        int l6 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        if (l6 >= 0) {
            f5 = F.d(viewGroup, l6, this.f19927a);
        }
        if (l4 >= 0 && (f4 = f(l4)) != null) {
            if (f5 != null) {
                if (d4 == null) {
                    m4.l(f5, f4);
                } else {
                    m4.k(d4, f5, f4);
                }
            } else {
                throw new RuntimeException("No toScene for transition ID " + l4);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public J f(int i4) {
        XmlResourceParser xml = this.f19927a.getResources().getXml(i4);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e4) {
                throw new InflateException(xml.getPositionDescription() + ": " + e4.getMessage(), e4);
            } catch (XmlPullParserException e5) {
                throw new InflateException(e5.getMessage(), e5);
            }
        } finally {
            xml.close();
        }
    }

    public M g(int i4, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f19927a.getResources().getXml(i4);
        try {
            try {
                return c(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e4) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e4.getMessage());
                inflateException.initCause(e4);
                throw inflateException;
            } catch (XmlPullParserException e5) {
                InflateException inflateException2 = new InflateException(e5.getMessage());
                inflateException2.initCause(e5);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }
}
