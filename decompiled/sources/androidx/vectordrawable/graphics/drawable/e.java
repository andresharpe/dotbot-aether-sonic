package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.content.res.n;
import androidx.core.graphics.J;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20295a = "AnimatorInflater";

    /* renamed from: b, reason: collision with root package name */
    private static final int f20296b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f20297c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static final int f20298d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f20299e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f20300f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f20301g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f20302h = 4;

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f20303i = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<J.b[]> {

        /* renamed from: a, reason: collision with root package name */
        private J.b[] f20304a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public J.b[] evaluate(float f4, J.b[] bVarArr, J.b[] bVarArr2) {
            if (J.b(bVarArr, bVarArr2)) {
                if (!J.b(this.f20304a, bVarArr)) {
                    this.f20304a = J.f(bVarArr);
                }
                for (int i4 = 0; i4 < bVarArr.length; i4++) {
                    this.f20304a[i4].d(bVarArr[i4], bVarArr2[i4], f4);
                }
                return this.f20304a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }

        a(J.b[] bVarArr) {
            this.f20304a = bVarArr;
        }
    }

    private e() {
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f4) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe c(Keyframe keyframe, float f4) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f4);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f4);
        }
        return Keyframe.ofObject(f4);
    }

    private static void d(Keyframe[] keyframeArr, float f4, int i4, int i5) {
        float f5 = f4 / ((i5 - i4) + 2);
        while (i4 <= i5) {
            keyframeArr[i4].setFraction(keyframeArr[i4 - 1].getFraction() + f5);
            i4++;
        }
    }

    private static void e(Object[] objArr, String str) {
        Object valueOf;
        if (objArr != null && objArr.length != 0) {
            Log.d(f20295a, str);
            int length = objArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                Keyframe keyframe = (Keyframe) objArr[i4];
                StringBuilder sb = new StringBuilder();
                sb.append("Keyframe ");
                sb.append(i4);
                sb.append(": fraction ");
                Object obj = "null";
                if (keyframe.getFraction() < 0.0f) {
                    valueOf = "null";
                } else {
                    valueOf = Float.valueOf(keyframe.getFraction());
                }
                sb.append(valueOf);
                sb.append(", , value : ");
                if (keyframe.hasValue()) {
                    obj = keyframe.getValue();
                }
                sb.append(obj);
                Log.d(f20295a, sb.toString());
            }
        }
    }

    private static PropertyValuesHolder f(TypedArray typedArray, int i4, int i5, int i6, String str) {
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        f fVar;
        int i9;
        int i10;
        int i11;
        float f4;
        PropertyValuesHolder ofFloat;
        float f5;
        float f6;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i5);
        if (peekValue != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i7 = peekValue.type;
        } else {
            i7 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i6);
        if (peekValue2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i8 = peekValue2.type;
        } else {
            i8 = 0;
        }
        if (i4 == 4) {
            if ((z3 && i(i7)) || (z4 && i(i8))) {
                i4 = 3;
            } else {
                i4 = 0;
            }
        }
        if (i4 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i4 == 2) {
            String string = typedArray.getString(i5);
            String string2 = typedArray.getString(i6);
            J.b[] d4 = J.d(string);
            J.b[] d5 = J.d(string2);
            if (d4 == null && d5 == null) {
                return null;
            }
            if (d4 != null) {
                a aVar = new a();
                if (d5 != null) {
                    if (J.b(d4, d5)) {
                        ofObject = PropertyValuesHolder.ofObject(str, aVar, d4, d5);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, d4);
                }
                return ofObject;
            }
            if (d5 == null) {
                return null;
            }
            return PropertyValuesHolder.ofObject(str, new a(), d5);
        }
        if (i4 == 3) {
            fVar = f.a();
        } else {
            fVar = null;
        }
        if (z5) {
            if (z3) {
                if (i7 == 5) {
                    f5 = typedArray.getDimension(i5, 0.0f);
                } else {
                    f5 = typedArray.getFloat(i5, 0.0f);
                }
                if (z4) {
                    if (i8 == 5) {
                        f6 = typedArray.getDimension(i6, 0.0f);
                    } else {
                        f6 = typedArray.getFloat(i6, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f5, f6);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f5);
                }
            } else {
                if (i8 == 5) {
                    f4 = typedArray.getDimension(i6, 0.0f);
                } else {
                    f4 = typedArray.getFloat(i6, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f4);
            }
            propertyValuesHolder = ofFloat;
        } else if (z3) {
            if (i7 == 5) {
                i10 = (int) typedArray.getDimension(i5, 0.0f);
            } else if (i(i7)) {
                i10 = typedArray.getColor(i5, 0);
            } else {
                i10 = typedArray.getInt(i5, 0);
            }
            if (z4) {
                if (i8 == 5) {
                    i11 = (int) typedArray.getDimension(i6, 0.0f);
                } else if (i(i8)) {
                    i11 = typedArray.getColor(i6, 0);
                } else {
                    i11 = typedArray.getInt(i6, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i10, i11);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i10);
            }
        } else if (z4) {
            if (i8 == 5) {
                i9 = (int) typedArray.getDimension(i6, 0.0f);
            } else if (i(i8)) {
                i9 = typedArray.getColor(i6, 0);
            } else {
                i9 = typedArray.getInt(i6, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i9);
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    private static int g(TypedArray typedArray, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        TypedValue peekValue = typedArray.peekValue(i4);
        boolean z4 = true;
        if (peekValue != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i6 = peekValue.type;
        } else {
            i6 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i5);
        if (peekValue2 == null) {
            z4 = false;
        }
        if (z4) {
            i7 = peekValue2.type;
        } else {
            i7 = 0;
        }
        if ((!z3 || !i(i6)) && (!z4 || !i(i7))) {
            return 0;
        }
        return 3;
    }

    private static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20237h0);
        int i4 = 0;
        TypedValue t3 = n.t(s4, xmlPullParser, "value", 0);
        if (t3 != null && i(t3.type)) {
            i4 = 3;
        }
        s4.recycle();
        return i4;
    }

    private static boolean i(int i4) {
        return i4 >= 28 && i4 <= 31;
    }

    public static Animator j(Context context, @InterfaceC0559b int i4) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i4);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @InterfaceC0559b int i4) throws Resources.NotFoundException {
        return l(context, resources, theme, i4, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @InterfaceC0559b int i4, float f4) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i4);
                    return a(context, resources, theme, xmlResourceParser, f4);
                } catch (IOException e4) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                    notFoundException.initCause(e4);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e5) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                notFoundException2.initCause(e5);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f4, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20213R);
        TypedArray s5 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20247m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, s4, s5, f4, xmlPullParser);
        int l4 = n.l(s4, xmlPullParser, "interpolator", 0, 0);
        if (l4 > 0) {
            valueAnimator.setInterpolator(d.b(context, l4));
        }
        s4.recycle();
        if (s5 != null) {
            s5.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i4, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z3;
        Keyframe ofInt;
        TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20237h0);
        float j4 = n.j(s4, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue t3 = n.t(s4, xmlPullParser, "value", 0);
        if (t3 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 == 4) {
            if (z3 && i(t3.type)) {
                i4 = 3;
            } else {
                i4 = 0;
            }
        }
        if (z3) {
            if (i4 != 0) {
                if (i4 != 1 && i4 != 3) {
                    ofInt = null;
                } else {
                    ofInt = Keyframe.ofInt(j4, n.k(s4, xmlPullParser, "value", 0, 0));
                }
            } else {
                ofInt = Keyframe.ofFloat(j4, n.j(s4, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i4 == 0) {
            ofInt = Keyframe.ofFloat(j4);
        } else {
            ofInt = Keyframe.ofInt(j4);
        }
        int l4 = n.l(s4, xmlPullParser, "interpolator", 1, 0);
        if (l4 > 0) {
            ofInt.setInterpolator(d.b(context, l4));
        }
        s4.recycle();
        return ofInt;
    }

    private static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f4, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f4, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i4) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i4 == 4) {
                    i4 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe n4 = n(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i4, xmlPullParser);
                if (n4 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(n4);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i5 = 0; i5 < size; i5++) {
                Keyframe keyframe3 = keyframeArr[i5];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i5 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i6 = size - 1;
                        if (i5 == i6) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i7 = i5;
                            for (int i8 = i5 + 1; i8 < i6 && keyframeArr[i8].getFraction() < 0.0f; i8++) {
                                i7 = i8;
                            }
                            d(keyframeArr, keyframeArr[i7 + 1].getFraction() - keyframeArr[i5 - 1].getFraction(), i5, i7);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i4 == 3) {
                propertyValuesHolder.setEvaluator(f.a());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i4;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20227c0);
                    String m4 = n.m(s4, xmlPullParser, "propertyName", 3);
                    int k4 = n.k(s4, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder p4 = p(context, resources, theme, xmlPullParser, m4, k4);
                    if (p4 == null) {
                        p4 = f(s4, k4, 0, 1, m4);
                    }
                    if (p4 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(p4);
                    }
                    s4.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i4 = 0; i4 < size; i4++) {
                propertyValuesHolderArr[i4] = (PropertyValuesHolder) arrayList.get(i4);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f4, XmlPullParser xmlPullParser) {
        long k4 = n.k(typedArray, xmlPullParser, v.h.f7538b, 1, 300);
        long k5 = n.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k6 = n.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (n.r(xmlPullParser, "valueFrom") && n.r(xmlPullParser, "valueTo")) {
            if (k6 == 4) {
                k6 = g(typedArray, 5, 6);
            }
            PropertyValuesHolder f5 = f(typedArray, k6, 5, 6, "");
            if (f5 != null) {
                valueAnimator.setValues(f5);
            }
        }
        valueAnimator.setDuration(k4);
        valueAnimator.setStartDelay(k5);
        valueAnimator.setRepeatCount(n.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(n.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, k6, f4, xmlPullParser);
        }
    }

    private static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i4, float f4, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m4 = n.m(typedArray, xmlPullParser, "pathData", 1);
        if (m4 != null) {
            String m5 = n.m(typedArray, xmlPullParser, "propertyXName", 2);
            String m6 = n.m(typedArray, xmlPullParser, "propertyYName", 3);
            if (i4 != 2) {
            }
            if (m5 == null && m6 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            t(J.e(m4), objectAnimator, f4 * 0.5f, m5, m6);
            return;
        }
        objectAnimator.setPropertyName(n.m(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void t(Path path, ObjectAnimator objectAnimator, float f4, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        char c4 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f5 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f6 = 0.0f;
        do {
            f6 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f6));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f6 / f4)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f7 = f6 / (min - 1);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i4 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
            fArr[i4] = fArr3[c4];
            fArr2[i4] = fArr3[1];
            f5 += f7;
            int i6 = i5 + 1;
            if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                pathMeasure2.nextContour();
                i5 = i6;
            }
            i4++;
            c4 = 0;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }
}
