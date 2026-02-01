package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.widget.h;
import com.spotify.sdk.android.auth.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class u {

    /* renamed from: A, reason: collision with root package name */
    private static final int f9089A = -2;

    /* renamed from: B, reason: collision with root package name */
    public static final int f9090B = -1;

    /* renamed from: C, reason: collision with root package name */
    private static final boolean f9091C = false;

    /* renamed from: D, reason: collision with root package name */
    public static final int f9092D = 0;

    /* renamed from: E, reason: collision with root package name */
    public static final int f9093E = 1;

    /* renamed from: F, reason: collision with root package name */
    public static final int f9094F = 2;

    /* renamed from: G, reason: collision with root package name */
    private static final String f9095G = "MotionScene";

    /* renamed from: H, reason: collision with root package name */
    private static final String f9096H = "Transition";

    /* renamed from: I, reason: collision with root package name */
    private static final String f9097I = "OnSwipe";

    /* renamed from: J, reason: collision with root package name */
    private static final String f9098J = "OnClick";

    /* renamed from: K, reason: collision with root package name */
    private static final String f9099K = "StateSet";

    /* renamed from: L, reason: collision with root package name */
    private static final String f9100L = "Include";

    /* renamed from: M, reason: collision with root package name */
    private static final String f9101M = "include";

    /* renamed from: N, reason: collision with root package name */
    private static final String f9102N = "KeyFrameSet";

    /* renamed from: O, reason: collision with root package name */
    private static final String f9103O = "ConstraintSet";

    /* renamed from: P, reason: collision with root package name */
    private static final String f9104P = "ViewTransition";

    /* renamed from: Q, reason: collision with root package name */
    static final int f9105Q = 0;

    /* renamed from: R, reason: collision with root package name */
    static final int f9106R = 1;

    /* renamed from: S, reason: collision with root package name */
    static final int f9107S = 2;

    /* renamed from: T, reason: collision with root package name */
    static final int f9108T = 3;

    /* renamed from: U, reason: collision with root package name */
    static final int f9109U = 4;

    /* renamed from: V, reason: collision with root package name */
    static final int f9110V = 5;

    /* renamed from: W, reason: collision with root package name */
    static final int f9111W = 6;

    /* renamed from: u, reason: collision with root package name */
    private static final String f9112u = "MotionScene";

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f9113v = false;

    /* renamed from: w, reason: collision with root package name */
    private static final int f9114w = 8;

    /* renamed from: x, reason: collision with root package name */
    static final int f9115x = 0;

    /* renamed from: y, reason: collision with root package name */
    static final int f9116y = 1;

    /* renamed from: z, reason: collision with root package name */
    private static final int f9117z = -1;

    /* renamed from: a, reason: collision with root package name */
    private final s f9118a;

    /* renamed from: m, reason: collision with root package name */
    private MotionEvent f9130m;

    /* renamed from: p, reason: collision with root package name */
    private s.i f9133p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f9134q;

    /* renamed from: r, reason: collision with root package name */
    final B f9135r;

    /* renamed from: s, reason: collision with root package name */
    float f9136s;

    /* renamed from: t, reason: collision with root package name */
    float f9137t;

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.k f9119b = null;

    /* renamed from: c, reason: collision with root package name */
    b f9120c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9121d = false;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<b> f9122e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private b f9123f = null;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<b> f9124g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.widget.d> f9125h = new SparseArray<>();

    /* renamed from: i, reason: collision with root package name */
    private HashMap<String, Integer> f9126i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private SparseIntArray f9127j = new SparseIntArray();

    /* renamed from: k, reason: collision with root package name */
    private int f9128k = 400;

    /* renamed from: l, reason: collision with root package name */
    private int f9129l = 0;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9131n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9132o = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f9138a;

        a(u uVar, androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f9138a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (float) this.f9138a.a(f4);
        }
    }

    public u(s sVar) {
        this.f9118a = sVar;
        this.f9135r = new B(sVar);
    }

    static String A(Context context, int i4, XmlPullParser xmlPullParser) {
        return ".(" + c.i(context, i4) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    private int H(int i4) {
        int e4;
        androidx.constraintlayout.widget.k kVar = this.f9119b;
        if (kVar != null && (e4 = kVar.e(i4, -1, -1)) != -1) {
            return e4;
        }
        return i4;
    }

    private boolean S(int i4) {
        int i5 = this.f9127j.get(i4);
        int size = this.f9127j.size();
        while (i5 > 0) {
            if (i5 == i4) {
                return true;
            }
            int i6 = size - 1;
            if (size < 0) {
                return true;
            }
            i5 = this.f9127j.get(i5);
            size = i6;
        }
        return false;
    }

    private boolean U() {
        if (this.f9133p != null) {
            return true;
        }
        return false;
    }

    private void W(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                char c4 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals(f9103O)) {
                                        c4 = 5;
                                        break;
                                    }
                                    break;
                                case -1239391468:
                                    if (name.equals("KeyFrameSet")) {
                                        c4 = '\b';
                                        break;
                                    }
                                    break;
                                case -687739768:
                                    if (name.equals(f9100L)) {
                                        c4 = 7;
                                        break;
                                    }
                                    break;
                                case 61998586:
                                    if (name.equals("ViewTransition")) {
                                        c4 = '\t';
                                        break;
                                    }
                                    break;
                                case 269306229:
                                    if (name.equals(f9096H)) {
                                        break;
                                    }
                                    break;
                                case 312750793:
                                    if (name.equals(f9098J)) {
                                        c4 = 3;
                                        break;
                                    }
                                    break;
                                case 327855227:
                                    if (name.equals(f9097I)) {
                                        c4 = 2;
                                        break;
                                    }
                                    break;
                                case 793277014:
                                    if (name.equals(v.d.f7461a)) {
                                        c4 = 0;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals(f9099K)) {
                                        c4 = 4;
                                        break;
                                    }
                                    break;
                                case 1942574248:
                                    if (name.equals(f9101M)) {
                                        c4 = 6;
                                        break;
                                    }
                                    break;
                            }
                            c4 = 65535;
                            switch (c4) {
                                case 0:
                                    d0(context, xml);
                                    break;
                                case 1:
                                    ArrayList<b> arrayList = this.f9122e;
                                    bVar = new b(this, context, xml);
                                    arrayList.add(bVar);
                                    if (this.f9120c == null && !bVar.f9157b) {
                                        this.f9120c = bVar;
                                        if (bVar.f9167l != null) {
                                            this.f9120c.f9167l.D(this.f9134q);
                                        }
                                    }
                                    if (!bVar.f9157b) {
                                        break;
                                    } else {
                                        if (bVar.f9158c == -1) {
                                            this.f9123f = bVar;
                                        } else {
                                            this.f9124g.add(bVar);
                                        }
                                        this.f9122e.remove(bVar);
                                        break;
                                    }
                                case 2:
                                    if (bVar == null) {
                                        Log.v(v.d.f7461a, " OnSwipe (" + context.getResources().getResourceEntryName(i4) + ".xml:" + xml.getLineNumber() + ")");
                                    }
                                    if (bVar == null) {
                                        break;
                                    } else {
                                        bVar.f9167l = new w(context, this.f9118a, xml);
                                        break;
                                    }
                                case 3:
                                    if (bVar != null && !this.f9118a.isInEditMode()) {
                                        bVar.v(context, xml);
                                        break;
                                    }
                                    break;
                                case 4:
                                    this.f9119b = new androidx.constraintlayout.widget.k(context, xml);
                                    break;
                                case 5:
                                    a0(context, xml);
                                    break;
                                case 6:
                                case 7:
                                    c0(context, xml);
                                    break;
                                case '\b':
                                    i iVar = new i(context, xml);
                                    if (bVar == null) {
                                        break;
                                    } else {
                                        bVar.f9166k.add(iVar);
                                        break;
                                    }
                                case '\t':
                                    this.f9135r.b(new A(context, xml));
                                    break;
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    private int a0(Context context, XmlPullParser xmlPullParser) {
        boolean z3;
        boolean z4;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.d1(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeName = xmlPullParser.getAttributeName(i6);
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z3 = false;
                        break;
                    }
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z3 = true;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals(b.c.f48986a)) {
                        z3 = 2;
                        break;
                    }
                    break;
                case 973381616:
                    if (attributeName.equals("stateLabels")) {
                        z3 = 3;
                        break;
                    }
                    break;
            }
            z3 = -1;
            switch (z3) {
                case false:
                    i5 = v(context, attributeValue);
                    break;
                case true:
                    try {
                        dVar.f9832e = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z4 = false;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z4 = true;
                                    break;
                                }
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z4 = 2;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z4 = 3;
                                    break;
                                }
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z4 = 4;
                                    break;
                                }
                                break;
                        }
                        z4 = -1;
                        switch (z4) {
                            case false:
                                dVar.f9832e = 4;
                                break;
                            case true:
                                dVar.f9832e = 2;
                                break;
                            case true:
                                dVar.f9832e = 0;
                                break;
                            case true:
                                dVar.f9832e = 1;
                                break;
                            case true:
                                dVar.f9832e = 3;
                                break;
                        }
                    }
                    break;
                case true:
                    i4 = v(context, attributeValue);
                    this.f9126i.put(r0(attributeValue), Integer.valueOf(i4));
                    dVar.f9829b = c.i(context, i4);
                    break;
                case true:
                    dVar.u1(attributeValue);
                    break;
            }
        }
        if (i4 != -1) {
            if (this.f9118a.f8953M0 != 0) {
                dVar.E1(true);
            }
            dVar.z0(context, xmlPullParser);
            if (i5 != -1) {
                this.f9127j.put(i4, i5);
            }
            this.f9125h.put(i4, dVar);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b0(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && f9103O.equals(name)) {
                    return a0(context, xml);
                }
            }
            return -1;
        } catch (IOException e4) {
            e4.printStackTrace();
            return -1;
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    private void c0(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.Qo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == h.m.Ro) {
                b0(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void d0(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.Ck);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == h.m.Dk) {
                int i5 = obtainStyledAttributes.getInt(index, this.f9128k);
                this.f9128k = i5;
                if (i5 < 8) {
                    this.f9128k = 8;
                }
            } else if (index == h.m.Ek) {
                this.f9129l = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void h0(int i4, s sVar) {
        androidx.constraintlayout.widget.d dVar = this.f9125h.get(i4);
        dVar.f9830c = dVar.f9829b;
        int i5 = this.f9127j.get(i4);
        if (i5 > 0) {
            h0(i5, sVar);
            androidx.constraintlayout.widget.d dVar2 = this.f9125h.get(i5);
            if (dVar2 == null) {
                Log.e(v.d.f7461a, "ERROR! invalid deriveConstraintsFrom: @id/" + c.i(this.f9118a.getContext(), i5));
                return;
            }
            dVar.f9830c += "/" + dVar2.f9830c;
            dVar.M0(dVar2);
        } else {
            dVar.f9830c += "  layout";
            dVar.L0(sVar);
        }
        dVar.q(dVar);
    }

    public static String r0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    private int v(Context context, String str) {
        int i4;
        if (str.contains("/")) {
            i4 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), b.c.f48986a, context.getPackageName());
        } else {
            i4 = -1;
        }
        if (i4 == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e(v.d.f7461a, "error in parsing id");
            return i4;
        }
        return i4;
    }

    private int w(b bVar) {
        int i4 = bVar.f9156a;
        if (i4 != -1) {
            for (int i5 = 0; i5 < this.f9122e.size(); i5++) {
                if (this.f9122e.get(i5).f9156a == i4) {
                    return i5;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public int[] B(String... strArr) {
        int size = this.f9125h.size();
        int[] iArr = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            androidx.constraintlayout.widget.d valueAt = this.f9125h.valueAt(i5);
            int keyAt = this.f9125h.keyAt(i5);
            if (valueAt.B0(strArr)) {
                valueAt.s0();
                iArr[i4] = keyAt;
                i4++;
            }
        }
        return Arrays.copyOf(iArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float C() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.i();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float D() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.j();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.k();
        }
        return false;
    }

    public float F(View view, int i4) {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float G(float f4, float f5) {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.l(f4, f5);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int I() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.m();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float J() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.n();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float K() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.o();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float L() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.p();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float M() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.q();
        }
        return 0.0f;
    }

    public float N() {
        b bVar = this.f9120c;
        if (bVar != null) {
            return bVar.f9164i;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int O() {
        b bVar = this.f9120c;
        if (bVar != null) {
            return bVar.f9159d;
        }
        return -1;
    }

    public b P(int i4) {
        Iterator<b> it = this.f9122e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f9156a == i4) {
                return next;
            }
        }
        return null;
    }

    int Q(int i4) {
        Iterator<b> it = this.f9122e.iterator();
        while (it.hasNext()) {
            if (it.next().f9159d == i4) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> R(int i4) {
        int H3 = H(i4);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f9122e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f9159d == H3 || next.f9158c == H3) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean T(View view, int i4) {
        b bVar = this.f9120c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f9166k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f8556a == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean V(int i4) {
        return this.f9135r.h(i4);
    }

    public int X(String str) {
        Integer num = this.f9126i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String Y(int i4) {
        for (Map.Entry<String, Integer> entry : this.f9126i.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i4) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected void Z(boolean z3, int i4, int i5, int i6, int i7) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(float f4, float f5) {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            this.f9120c.f9167l.w(f4, f5);
        }
    }

    public void f(s sVar, int i4) {
        Iterator<b> it = this.f9122e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f9168m.size() > 0) {
                Iterator it2 = next.f9168m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(sVar);
                }
            }
        }
        Iterator<b> it3 = this.f9124g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.f9168m.size() > 0) {
                Iterator it4 = next2.f9168m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(sVar);
                }
            }
        }
        Iterator<b> it5 = this.f9122e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.f9168m.size() > 0) {
                Iterator it6 = next3.f9168m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(sVar, i4, next3);
                }
            }
        }
        Iterator<b> it7 = this.f9124g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.f9168m.size() > 0) {
                Iterator it8 = next4.f9168m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(sVar, i4, next4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(float f4, float f5) {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            this.f9120c.f9167l.x(f4, f5);
        }
    }

    public void g(b bVar) {
        int w3 = w(bVar);
        if (w3 == -1) {
            this.f9122e.add(bVar);
        } else {
            this.f9122e.set(w3, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(MotionEvent motionEvent, int i4, s sVar) {
        s.i iVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f9133p == null) {
            this.f9133p = this.f9118a.S0();
        }
        this.f9133p.e(motionEvent);
        if (i4 != -1) {
            int action = motionEvent.getAction();
            boolean z3 = false;
            if (action != 0) {
                if (action == 2 && !this.f9131n) {
                    float rawY = motionEvent.getRawY() - this.f9137t;
                    float rawX = motionEvent.getRawX() - this.f9136s;
                    if ((rawX == com.google.firebase.remoteconfig.l.f37524n && rawY == com.google.firebase.remoteconfig.l.f37524n) || (motionEvent2 = this.f9130m) == null) {
                        return;
                    }
                    b j4 = j(i4, rawX, rawY, motionEvent2);
                    if (j4 != null) {
                        sVar.setTransition(j4);
                        RectF r4 = this.f9120c.f9167l.r(this.f9118a, rectF);
                        if (r4 != null && !r4.contains(this.f9130m.getX(), this.f9130m.getY())) {
                            z3 = true;
                        }
                        this.f9132o = z3;
                        this.f9120c.f9167l.G(this.f9136s, this.f9137t);
                    }
                }
            } else {
                this.f9136s = motionEvent.getRawX();
                this.f9137t = motionEvent.getRawY();
                this.f9130m = motionEvent;
                this.f9131n = false;
                if (this.f9120c.f9167l != null) {
                    RectF g4 = this.f9120c.f9167l.g(this.f9118a, rectF);
                    if (g4 != null && !g4.contains(this.f9130m.getX(), this.f9130m.getY())) {
                        this.f9130m = null;
                        this.f9131n = true;
                        return;
                    }
                    RectF r5 = this.f9120c.f9167l.r(this.f9118a, rectF);
                    if (r5 != null && !r5.contains(this.f9130m.getX(), this.f9130m.getY())) {
                        this.f9132o = true;
                    } else {
                        this.f9132o = false;
                    }
                    this.f9120c.f9167l.A(this.f9136s, this.f9137t);
                    return;
                }
                return;
            }
        }
        if (this.f9131n) {
            return;
        }
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null && !this.f9132o) {
            this.f9120c.f9167l.u(motionEvent, this.f9133p, i4, this);
        }
        this.f9136s = motionEvent.getRawX();
        this.f9137t = motionEvent.getRawY();
        if (motionEvent.getAction() == 1 && (iVar = this.f9133p) != null) {
            iVar.a();
            this.f9133p = null;
            int i5 = sVar.f8996u0;
            if (i5 != -1) {
                i(sVar, i5);
            }
        }
    }

    public boolean h(int i4, o oVar) {
        return this.f9135r.e(i4, oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(s sVar, int i4) {
        b bVar;
        if (U() || this.f9121d) {
            return false;
        }
        Iterator<b> it = this.f9122e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f9169n != 0 && ((bVar = this.f9120c) != next || !bVar.L(2))) {
                if (i4 == next.f9159d && (next.f9169n == 4 || next.f9169n == 2)) {
                    s.m mVar = s.m.FINISHED;
                    sVar.setState(mVar);
                    sVar.setTransition(next);
                    if (next.f9169n == 4) {
                        sVar.g1();
                        sVar.setState(s.m.SETUP);
                        sVar.setState(s.m.MOVING);
                    } else {
                        sVar.setProgress(1.0f);
                        sVar.x0(true);
                        sVar.setState(s.m.SETUP);
                        sVar.setState(s.m.MOVING);
                        sVar.setState(mVar);
                        sVar.T0();
                    }
                    return true;
                }
                if (i4 == next.f9158c && (next.f9169n == 3 || next.f9169n == 1)) {
                    s.m mVar2 = s.m.FINISHED;
                    sVar.setState(mVar2);
                    sVar.setTransition(next);
                    if (next.f9169n == 3) {
                        sVar.i1();
                        sVar.setState(s.m.SETUP);
                        sVar.setState(s.m.MOVING);
                    } else {
                        sVar.setProgress(0.0f);
                        sVar.x0(true);
                        sVar.setState(s.m.SETUP);
                        sVar.setState(s.m.MOVING);
                        sVar.setState(mVar2);
                        sVar.T0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i0(s sVar) {
        for (int i4 = 0; i4 < this.f9125h.size(); i4++) {
            int keyAt = this.f9125h.keyAt(i4);
            if (S(keyAt)) {
                Log.e(v.d.f7461a, "Cannot be derived from yourself");
                return;
            }
            h0(keyAt, sVar);
        }
    }

    public b j(int i4, float f4, float f5, MotionEvent motionEvent) {
        float f6;
        if (i4 != -1) {
            List<b> R3 = R(i4);
            RectF rectF = new RectF();
            float f7 = 0.0f;
            b bVar = null;
            for (b bVar2 : R3) {
                if (!bVar2.f9170o && bVar2.f9167l != null) {
                    bVar2.f9167l.D(this.f9134q);
                    RectF r4 = bVar2.f9167l.r(this.f9118a, rectF);
                    if (r4 == null || motionEvent == null || r4.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF g4 = bVar2.f9167l.g(this.f9118a, rectF);
                        if (g4 == null || motionEvent == null || g4.contains(motionEvent.getX(), motionEvent.getY())) {
                            float a4 = bVar2.f9167l.a(f4, f5);
                            if (bVar2.f9167l.f9273l && motionEvent != null) {
                                a4 = ((float) (Math.atan2(f5 + r10, f4 + r9) - Math.atan2(motionEvent.getX() - bVar2.f9167l.f9270i, motionEvent.getY() - bVar2.f9167l.f9271j))) * 10.0f;
                            }
                            if (bVar2.f9158c == i4) {
                                f6 = -1.0f;
                            } else {
                                f6 = 1.1f;
                            }
                            float f8 = a4 * f6;
                            if (f8 > f7) {
                                bVar = bVar2;
                                f7 = f8;
                            }
                        }
                    }
                }
            }
            return bVar;
        }
        return this.f9120c;
    }

    public void j0(b bVar) {
        int w3 = w(bVar);
        if (w3 != -1) {
            this.f9122e.remove(w3);
        }
    }

    public void k(boolean z3) {
        this.f9121d = z3;
    }

    public void k0(int i4, androidx.constraintlayout.widget.d dVar) {
        this.f9125h.put(i4, dVar);
    }

    public void l(int i4, boolean z3) {
        this.f9135r.f(i4, z3);
    }

    public void l0(int i4) {
        b bVar = this.f9120c;
        if (bVar != null) {
            bVar.O(i4);
        } else {
            this.f9128k = i4;
        }
    }

    public int m() {
        b bVar = this.f9120c;
        if (bVar != null) {
            return bVar.f9171p;
        }
        return -1;
    }

    public void m0(View view, int i4, String str, Object obj) {
        b bVar = this.f9120c;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f9166k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f8556a == i4 && obj != null) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return this.f9120c.f9167l.e();
        }
        return 0;
    }

    public void n0(boolean z3) {
        this.f9134q = z3;
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            this.f9120c.f9167l.D(this.f9134q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.constraintlayout.widget.d o(int i4) {
        return p(i4, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.k r0 = r6.f9119b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.e(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.k r2 = r6.f9119b
            int r2 = r2.e(r8, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r8
            goto L1a
        L18:
            r0 = r7
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.u$b r3 = r6.f9120c
            if (r3 == 0) goto L2d
            int r3 = androidx.constraintlayout.motion.widget.u.b.a(r3)
            if (r3 != r8) goto L2d
            androidx.constraintlayout.motion.widget.u$b r3 = r6.f9120c
            int r3 = androidx.constraintlayout.motion.widget.u.b.c(r3)
            if (r3 != r7) goto L2d
            return
        L2d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.u$b> r3 = r6.f9122e
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.u$b r4 = (androidx.constraintlayout.motion.widget.u.b) r4
            int r5 = androidx.constraintlayout.motion.widget.u.b.a(r4)
            if (r5 != r2) goto L4b
            int r5 = androidx.constraintlayout.motion.widget.u.b.c(r4)
            if (r5 == r0) goto L57
        L4b:
            int r5 = androidx.constraintlayout.motion.widget.u.b.a(r4)
            if (r5 != r8) goto L33
            int r5 = androidx.constraintlayout.motion.widget.u.b.c(r4)
            if (r5 != r7) goto L33
        L57:
            r6.f9120c = r4
            if (r4 == 0) goto L6c
            androidx.constraintlayout.motion.widget.w r7 = androidx.constraintlayout.motion.widget.u.b.l(r4)
            if (r7 == 0) goto L6c
            androidx.constraintlayout.motion.widget.u$b r7 = r6.f9120c
            androidx.constraintlayout.motion.widget.w r7 = androidx.constraintlayout.motion.widget.u.b.l(r7)
            boolean r8 = r6.f9134q
            r7.D(r8)
        L6c:
            return
        L6d:
            androidx.constraintlayout.motion.widget.u$b r7 = r6.f9123f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.u$b> r3 = r6.f9124g
            java.util.Iterator r3 = r3.iterator()
        L75:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.u$b r4 = (androidx.constraintlayout.motion.widget.u.b) r4
            int r5 = androidx.constraintlayout.motion.widget.u.b.a(r4)
            if (r5 != r8) goto L75
            r7 = r4
            goto L75
        L89:
            androidx.constraintlayout.motion.widget.u$b r8 = new androidx.constraintlayout.motion.widget.u$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.u.b.d(r8, r0)
            androidx.constraintlayout.motion.widget.u.b.b(r8, r2)
            if (r0 == r1) goto L9b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.u$b> r7 = r6.f9122e
            r7.add(r8)
        L9b:
            r6.f9120c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.u.o0(int, int):void");
    }

    androidx.constraintlayout.widget.d p(int i4, int i5, int i6) {
        int e4;
        androidx.constraintlayout.widget.k kVar = this.f9119b;
        if (kVar != null && (e4 = kVar.e(i4, i5, i6)) != -1) {
            i4 = e4;
        }
        if (this.f9125h.get(i4) == null) {
            Log.e(v.d.f7461a, "Warning could not find ConstraintSet id/" + c.i(this.f9118a.getContext(), i4) + " In MotionScene");
            SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f9125h;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.f9125h.get(i4);
    }

    public void p0(b bVar) {
        this.f9120c = bVar;
        if (bVar != null && bVar.f9167l != null) {
            this.f9120c.f9167l.D(this.f9134q);
        }
    }

    public androidx.constraintlayout.widget.d q(Context context, String str) {
        for (int i4 = 0; i4 < this.f9125h.size(); i4++) {
            int keyAt = this.f9125h.keyAt(i4);
            if (str.equals(context.getResources().getResourceName(keyAt))) {
                return this.f9125h.get(keyAt);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0() {
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            this.f9120c.f9167l.H();
        }
    }

    public int[] r() {
        int size = this.f9125h.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f9125h.keyAt(i4);
        }
        return iArr;
    }

    public ArrayList<b> s() {
        return this.f9122e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s0() {
        Iterator<b> it = this.f9122e.iterator();
        while (it.hasNext()) {
            if (it.next().f9167l != null) {
                return true;
            }
        }
        b bVar = this.f9120c;
        if (bVar != null && bVar.f9167l != null) {
            return true;
        }
        return false;
    }

    public int t() {
        b bVar = this.f9120c;
        if (bVar != null) {
            return bVar.f9163h;
        }
        return this.f9128k;
    }

    public boolean t0(s sVar) {
        if (sVar == this.f9118a && sVar.f8986p0 == this) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        b bVar = this.f9120c;
        if (bVar != null) {
            return bVar.f9158c;
        }
        return -1;
    }

    public void u0(int i4, View... viewArr) {
        this.f9135r.m(i4, viewArr);
    }

    public Interpolator x() {
        int i4 = this.f9120c.f9160e;
        if (i4 != -2) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                                if (i4 != 5) {
                                    if (i4 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(this, androidx.constraintlayout.core.motion.utils.d.c(this.f9120c.f9161f));
        }
        return AnimationUtils.loadInterpolator(this.f9118a.getContext(), this.f9120c.f9162g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f y(Context context, int i4, int i5, int i6) {
        b bVar = this.f9120c;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.f9166k.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            for (Integer num : iVar.e()) {
                if (i5 == num.intValue()) {
                    Iterator<f> it2 = iVar.d(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        f next = it2.next();
                        if (next.f8556a == i6 && next.f8559d == i4) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void z(o oVar) {
        b bVar = this.f9120c;
        if (bVar == null) {
            b bVar2 = this.f9123f;
            if (bVar2 != null) {
                Iterator it = bVar2.f9166k.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).b(oVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f9166k.iterator();
        while (it2.hasNext()) {
            ((i) it2.next()).b(oVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public static final int f9139A = -2;

        /* renamed from: B, reason: collision with root package name */
        public static final int f9140B = -1;

        /* renamed from: C, reason: collision with root package name */
        public static final int f9141C = 0;

        /* renamed from: D, reason: collision with root package name */
        public static final int f9142D = 1;

        /* renamed from: E, reason: collision with root package name */
        public static final int f9143E = 2;

        /* renamed from: F, reason: collision with root package name */
        public static final int f9144F = 3;

        /* renamed from: G, reason: collision with root package name */
        public static final int f9145G = 4;

        /* renamed from: H, reason: collision with root package name */
        public static final int f9146H = 5;

        /* renamed from: I, reason: collision with root package name */
        public static final int f9147I = 6;

        /* renamed from: s, reason: collision with root package name */
        public static final int f9148s = 0;

        /* renamed from: t, reason: collision with root package name */
        public static final int f9149t = 1;

        /* renamed from: u, reason: collision with root package name */
        public static final int f9150u = 2;

        /* renamed from: v, reason: collision with root package name */
        public static final int f9151v = 3;

        /* renamed from: w, reason: collision with root package name */
        public static final int f9152w = 4;

        /* renamed from: x, reason: collision with root package name */
        static final int f9153x = 1;

        /* renamed from: y, reason: collision with root package name */
        static final int f9154y = 2;

        /* renamed from: z, reason: collision with root package name */
        static final int f9155z = 4;

        /* renamed from: a, reason: collision with root package name */
        private int f9156a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9157b;

        /* renamed from: c, reason: collision with root package name */
        private int f9158c;

        /* renamed from: d, reason: collision with root package name */
        private int f9159d;

        /* renamed from: e, reason: collision with root package name */
        private int f9160e;

        /* renamed from: f, reason: collision with root package name */
        private String f9161f;

        /* renamed from: g, reason: collision with root package name */
        private int f9162g;

        /* renamed from: h, reason: collision with root package name */
        private int f9163h;

        /* renamed from: i, reason: collision with root package name */
        private float f9164i;

        /* renamed from: j, reason: collision with root package name */
        private final u f9165j;

        /* renamed from: k, reason: collision with root package name */
        private ArrayList<i> f9166k;

        /* renamed from: l, reason: collision with root package name */
        private w f9167l;

        /* renamed from: m, reason: collision with root package name */
        private ArrayList<a> f9168m;

        /* renamed from: n, reason: collision with root package name */
        private int f9169n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f9170o;

        /* renamed from: p, reason: collision with root package name */
        private int f9171p;

        /* renamed from: q, reason: collision with root package name */
        private int f9172q;

        /* renamed from: r, reason: collision with root package name */
        private int f9173r;

        b(u uVar, b bVar) {
            this.f9156a = -1;
            this.f9157b = false;
            this.f9158c = -1;
            this.f9159d = -1;
            this.f9160e = 0;
            this.f9161f = null;
            this.f9162g = -1;
            this.f9163h = 400;
            this.f9164i = 0.0f;
            this.f9166k = new ArrayList<>();
            this.f9167l = null;
            this.f9168m = new ArrayList<>();
            this.f9169n = 0;
            this.f9170o = false;
            this.f9171p = -1;
            this.f9172q = 0;
            this.f9173r = 0;
            this.f9165j = uVar;
            this.f9163h = uVar.f9128k;
            if (bVar != null) {
                this.f9171p = bVar.f9171p;
                this.f9160e = bVar.f9160e;
                this.f9161f = bVar.f9161f;
                this.f9162g = bVar.f9162g;
                this.f9163h = bVar.f9163h;
                this.f9166k = bVar.f9166k;
                this.f9164i = bVar.f9164i;
                this.f9172q = bVar.f9172q;
            }
        }

        private void x(u uVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                if (index == h.m.Xn) {
                    this.f9158c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f9158c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.y0(context, this.f9158c);
                        uVar.f9125h.append(this.f9158c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f9158c = uVar.b0(context, this.f9158c);
                    }
                } else if (index == h.m.Yn) {
                    this.f9159d = typedArray.getResourceId(index, this.f9159d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f9159d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.y0(context, this.f9159d);
                        uVar.f9125h.append(this.f9159d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f9159d = uVar.b0(context, this.f9159d);
                    }
                } else if (index == h.m.bo) {
                    int i5 = typedArray.peekValue(index).type;
                    if (i5 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f9162g = resourceId;
                        if (resourceId != -1) {
                            this.f9160e = -2;
                        }
                    } else if (i5 == 3) {
                        String string = typedArray.getString(index);
                        this.f9161f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f9162g = typedArray.getResourceId(index, -1);
                                this.f9160e = -2;
                            } else {
                                this.f9160e = -1;
                            }
                        }
                    } else {
                        this.f9160e = typedArray.getInteger(index, this.f9160e);
                    }
                } else if (index == h.m.Zn) {
                    int i6 = typedArray.getInt(index, this.f9163h);
                    this.f9163h = i6;
                    if (i6 < 8) {
                        this.f9163h = 8;
                    }
                } else if (index == h.m.f4do) {
                    this.f9164i = typedArray.getFloat(index, this.f9164i);
                } else if (index == h.m.Wn) {
                    this.f9169n = typedArray.getInteger(index, this.f9169n);
                } else if (index == h.m.Vn) {
                    this.f9156a = typedArray.getResourceId(index, this.f9156a);
                } else if (index == h.m.eo) {
                    this.f9170o = typedArray.getBoolean(index, this.f9170o);
                } else if (index == h.m.co) {
                    this.f9171p = typedArray.getInteger(index, -1);
                } else if (index == h.m.ao) {
                    this.f9172q = typedArray.getInteger(index, 0);
                } else if (index == h.m.fo) {
                    this.f9173r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f9159d == -1) {
                this.f9157b = true;
            }
        }

        private void y(u uVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.Un);
            x(uVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f9163h;
        }

        public int B() {
            return this.f9158c;
        }

        public int C() {
            return this.f9156a;
        }

        public List<i> D() {
            return this.f9166k;
        }

        public int E() {
            return this.f9172q;
        }

        public List<a> F() {
            return this.f9168m;
        }

        public int G() {
            return this.f9171p;
        }

        public float H() {
            return this.f9164i;
        }

        public int I() {
            return this.f9159d;
        }

        public w J() {
            return this.f9167l;
        }

        public boolean K() {
            return !this.f9170o;
        }

        public boolean L(int i4) {
            if ((i4 & this.f9173r) != 0) {
                return true;
            }
            return false;
        }

        public void M(int i4) {
            a aVar;
            Iterator<a> it = this.f9168m.iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = it.next();
                    if (aVar.f9180F == i4) {
                        break;
                    }
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                this.f9168m.remove(aVar);
            }
        }

        public void N(int i4) {
            this.f9169n = i4;
        }

        public void O(int i4) {
            this.f9163h = Math.max(i4, 8);
        }

        public void P(boolean z3) {
            this.f9170o = !z3;
        }

        public void Q(int i4, String str, int i5) {
            this.f9160e = i4;
            this.f9161f = str;
            this.f9162g = i5;
        }

        public void R(int i4) {
            this.f9172q = i4;
        }

        public void S(v vVar) {
            w wVar;
            if (vVar == null) {
                wVar = null;
            } else {
                wVar = new w(this.f9165j.f9118a, vVar);
            }
            this.f9167l = wVar;
        }

        public void T(int i4) {
            w J3 = J();
            if (J3 != null) {
                J3.F(i4);
            }
        }

        public void U(int i4) {
            this.f9171p = i4;
        }

        public void V(float f4) {
            this.f9164i = f4;
        }

        public void W(int i4) {
            this.f9173r = i4;
        }

        public void t(i iVar) {
            this.f9166k.add(iVar);
        }

        public void u(int i4, int i5) {
            Iterator<a> it = this.f9168m.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f9180F == i4) {
                    next.f9181G = i5;
                    return;
                }
            }
            this.f9168m.add(new a(this, i4, i5));
        }

        public void v(Context context, XmlPullParser xmlPullParser) {
            this.f9168m.add(new a(context, this, xmlPullParser));
        }

        public String w(Context context) {
            String resourceEntryName;
            if (this.f9159d == -1) {
                resourceEntryName = "null";
            } else {
                resourceEntryName = context.getResources().getResourceEntryName(this.f9159d);
            }
            if (this.f9158c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f9158c);
        }

        public int z() {
            return this.f9169n;
        }

        /* loaded from: classes.dex */
        public static class a implements View.OnClickListener {

            /* renamed from: H, reason: collision with root package name */
            public static final int f9174H = 1;

            /* renamed from: I, reason: collision with root package name */
            public static final int f9175I = 17;

            /* renamed from: J, reason: collision with root package name */
            public static final int f9176J = 16;

            /* renamed from: K, reason: collision with root package name */
            public static final int f9177K = 256;

            /* renamed from: L, reason: collision with root package name */
            public static final int f9178L = 4096;

            /* renamed from: E, reason: collision with root package name */
            private final b f9179E;

            /* renamed from: F, reason: collision with root package name */
            int f9180F;

            /* renamed from: G, reason: collision with root package name */
            int f9181G;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f9180F = -1;
                this.f9181G = 17;
                this.f9179E = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.Jk);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i4 = 0; i4 < indexCount; i4++) {
                    int index = obtainStyledAttributes.getIndex(i4);
                    if (index == h.m.Lk) {
                        this.f9180F = obtainStyledAttributes.getResourceId(index, this.f9180F);
                    } else if (index == h.m.Kk) {
                        this.f9181G = obtainStyledAttributes.getInt(index, this.f9181G);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void a(s sVar, int i4, b bVar) {
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                int i5 = this.f9180F;
                s sVar2 = sVar;
                if (i5 != -1) {
                    sVar2 = sVar.findViewById(i5);
                }
                if (sVar2 != null) {
                    int i6 = bVar.f9159d;
                    int i7 = bVar.f9158c;
                    if (i6 == -1) {
                        sVar2.setOnClickListener(this);
                        return;
                    }
                    int i8 = this.f9181G;
                    boolean z7 = false;
                    if ((i8 & 1) != 0 && i4 == i6) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i8 & 256) != 0 && i4 == i6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z8 = z3 | z4;
                    if ((i8 & 1) != 0 && i4 == i6) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z9 = z5 | z8;
                    if ((i8 & 16) != 0 && i4 == i7) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z10 = z9 | z6;
                    if ((i8 & 4096) != 0 && i4 == i7) {
                        z7 = true;
                    }
                    if (z10 | z7) {
                        sVar2.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                Log.e(v.d.f7461a, "OnClick could not find id " + this.f9180F);
            }

            boolean b(b bVar, s sVar) {
                b bVar2 = this.f9179E;
                if (bVar2 != bVar) {
                    int i4 = bVar2.f9158c;
                    int i5 = this.f9179E.f9159d;
                    if (i5 == -1) {
                        if (sVar.f8996u0 != i4) {
                            return true;
                        }
                        return false;
                    }
                    int i6 = sVar.f8996u0;
                    if (i6 == i5 || i6 == i4) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            public void c(s sVar) {
                int i4 = this.f9180F;
                if (i4 == -1) {
                    return;
                }
                View findViewById = sVar.findViewById(i4);
                if (findViewById == null) {
                    Log.e(v.d.f7461a, " (*)  could not find id " + this.f9180F);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r8) {
                /*
                    Method dump skipped, instructions count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.u.b.a.onClick(android.view.View):void");
            }

            public a(b bVar, int i4, int i5) {
                this.f9179E = bVar;
                this.f9180F = i4;
                this.f9181G = i5;
            }
        }

        public b(int i4, u uVar, int i5, int i6) {
            this.f9156a = -1;
            this.f9157b = false;
            this.f9158c = -1;
            this.f9159d = -1;
            this.f9160e = 0;
            this.f9161f = null;
            this.f9162g = -1;
            this.f9163h = 400;
            this.f9164i = 0.0f;
            this.f9166k = new ArrayList<>();
            this.f9167l = null;
            this.f9168m = new ArrayList<>();
            this.f9169n = 0;
            this.f9170o = false;
            this.f9171p = -1;
            this.f9172q = 0;
            this.f9173r = 0;
            this.f9156a = i4;
            this.f9165j = uVar;
            this.f9159d = i5;
            this.f9158c = i6;
            this.f9163h = uVar.f9128k;
            this.f9172q = uVar.f9129l;
        }

        b(u uVar, Context context, XmlPullParser xmlPullParser) {
            this.f9156a = -1;
            this.f9157b = false;
            this.f9158c = -1;
            this.f9159d = -1;
            this.f9160e = 0;
            this.f9161f = null;
            this.f9162g = -1;
            this.f9163h = 400;
            this.f9164i = 0.0f;
            this.f9166k = new ArrayList<>();
            this.f9167l = null;
            this.f9168m = new ArrayList<>();
            this.f9169n = 0;
            this.f9170o = false;
            this.f9171p = -1;
            this.f9172q = 0;
            this.f9173r = 0;
            this.f9163h = uVar.f9128k;
            this.f9172q = uVar.f9129l;
            this.f9165j = uVar;
            y(uVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Context context, s sVar, int i4) {
        this.f9118a = sVar;
        this.f9135r = new B(sVar);
        W(context, i4);
        this.f9125h.put(h.g.f10751W1, new androidx.constraintlayout.widget.d());
        this.f9126i.put("motion_base", Integer.valueOf(h.g.f10751W1));
    }
}
