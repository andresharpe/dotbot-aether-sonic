package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.graphics.drawable.e;
import androidx.collection.h;
import androidx.collection.m;
import androidx.core.content.res.n;
import androidx.core.graphics.drawable.k;
import androidx.core.util.p;
import f.C2050a;
import f.b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a extends androidx.appcompat.graphics.drawable.e implements k {

    /* renamed from: c0, reason: collision with root package name */
    private static final String f5013c0 = "a";

    /* renamed from: d0, reason: collision with root package name */
    private static final String f5014d0 = "transition";

    /* renamed from: e0, reason: collision with root package name */
    private static final String f5015e0 = "item";

    /* renamed from: f0, reason: collision with root package name */
    private static final String f5016f0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: g0, reason: collision with root package name */
    private static final String f5017g0 = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* renamed from: h0, reason: collision with root package name */
    private static final String f5018h0 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: X, reason: collision with root package name */
    private c f5019X;

    /* renamed from: Y, reason: collision with root package name */
    private g f5020Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f5021Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f5022a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f5023b0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f5024a;

        b(Animatable animatable) {
            super();
            this.f5024a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f5024a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f5024a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends e.a {

        /* renamed from: M, reason: collision with root package name */
        private static final long f5025M = 4294967296L;

        /* renamed from: N, reason: collision with root package name */
        private static final long f5026N = 8589934592L;

        /* renamed from: K, reason: collision with root package name */
        h<Long> f5027K;

        /* renamed from: L, reason: collision with root package name */
        m<Integer> f5028L;

        c(@P c cVar, @N a aVar, @P Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f5027K = cVar.f5027K;
                this.f5028L = cVar.f5028L;
            } else {
                this.f5027K = new h<>();
                this.f5028L = new m<>();
            }
        }

        private static long H(int i4, int i5) {
            return i5 | (i4 << 32);
        }

        int F(@N int[] iArr, @N Drawable drawable, int i4) {
            int D3 = super.D(iArr, drawable);
            this.f5028L.p(D3, Integer.valueOf(i4));
            return D3;
        }

        int G(int i4, int i5, @N Drawable drawable, boolean z3) {
            long j4;
            int a4 = super.a(drawable);
            long H3 = H(i4, i5);
            if (z3) {
                j4 = f5026N;
            } else {
                j4 = 0;
            }
            long j5 = a4;
            this.f5027K.a(H3, Long.valueOf(j5 | j4));
            if (z3) {
                this.f5027K.a(H(i5, i4), Long.valueOf(f5025M | j5 | j4));
            }
            return a4;
        }

        int I(int i4) {
            if (i4 < 0) {
                return 0;
            }
            return this.f5028L.j(i4, 0).intValue();
        }

        int J(@N int[] iArr) {
            int E3 = super.E(iArr);
            if (E3 >= 0) {
                return E3;
            }
            return super.E(StateSet.WILD_CARD);
        }

        int K(int i4, int i5) {
            return (int) this.f5027K.j(H(i4, i5), -1L).longValue();
        }

        boolean L(int i4, int i5) {
            if ((this.f5027K.j(H(i4, i5), -1L).longValue() & f5025M) != 0) {
                return true;
            }
            return false;
        }

        boolean M(int i4, int i5) {
            if ((this.f5027K.j(H(i4, i5), -1L).longValue() & f5026N) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, androidx.appcompat.graphics.drawable.b.d
        void v() {
            this.f5027K = this.f5027K.clone();
            this.f5028L = this.f5028L.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f5029a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f5029a = cVar;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f5029a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f5029a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f5030a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5031b;

        e(AnimationDrawable animationDrawable, boolean z3, boolean z4) {
            super();
            int i4;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z3) {
                i4 = numberOfFrames - 1;
            } else {
                i4 = 0;
            }
            int i5 = z3 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i4, i5);
            C2050a.b.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f5031b = z4;
            this.f5030a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public boolean a() {
            return this.f5031b;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void b() {
            this.f5030a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f5030a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f5030a.cancel();
        }
    }

    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f5032a;

        /* renamed from: b, reason: collision with root package name */
        private int f5033b;

        /* renamed from: c, reason: collision with root package name */
        private int f5034c;

        f(AnimationDrawable animationDrawable, boolean z3) {
            b(animationDrawable, z3);
        }

        int a() {
            return this.f5034c;
        }

        int b(AnimationDrawable animationDrawable, boolean z3) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f5033b = numberOfFrames;
            int[] iArr = this.f5032a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f5032a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f5032a;
            int i4 = 0;
            for (int i5 = 0; i5 < numberOfFrames; i5++) {
                int duration = animationDrawable.getDuration(z3 ? (numberOfFrames - i5) - 1 : i5);
                iArr2[i5] = duration;
                i4 += duration;
            }
            this.f5034c = i4;
            return i4;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5;
            int i4 = (int) ((f4 * this.f5034c) + 0.5f);
            int i5 = this.f5033b;
            int[] iArr = this.f5032a;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = iArr[i6];
                if (i4 < i7) {
                    break;
                }
                i4 -= i7;
                i6++;
            }
            if (i6 < i5) {
                f5 = i4 / this.f5034c;
            } else {
                f5 = 0.0f;
            }
            return (i6 / i5) + f5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    @P
    public static a B(@N Context context, @InterfaceC0578v int i4, @P Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i4);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C(context, resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e4) {
            Log.e(f5013c0, "parser error", e4);
            return null;
        } catch (XmlPullParserException e5) {
            Log.e(f5013c0, "parser error", e5);
            return null;
        }
    }

    @N
    public static a C(@N Context context, @N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void D() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r7.getName().equals("vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r5 = androidx.vectordrawable.graphics.drawable.i.f(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r5 = f.C2050a.c.a(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + androidx.appcompat.graphics.drawable.a.f5018h0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r4.f5019X.F(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + androidx.appcompat.graphics.drawable.a.f5018h0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5 != 4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int E(@androidx.annotation.N android.content.Context r5, @androidx.annotation.N android.content.res.Resources r6, @androidx.annotation.N org.xmlpull.v1.XmlPullParser r7, @androidx.annotation.N android.util.AttributeSet r8, @androidx.annotation.P android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int[] r0 = f.b.C0442b.f50217h
            android.content.res.TypedArray r0 = androidx.core.content.res.n.s(r6, r9, r8, r0)
            int r1 = f.b.C0442b.f50218i
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = f.b.C0442b.f50219j
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.V r3 = androidx.appcompat.widget.V.h()
            android.graphics.drawable.Drawable r5 = r3.j(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.p(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L65
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L4c
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.i r5 = androidx.vectordrawable.graphics.drawable.i.f(r6, r7, r8, r9)
            goto L65
        L47:
            android.graphics.drawable.Drawable r5 = f.C2050a.c.a(r6, r7, r8, r9)
            goto L65
        L4c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            if (r5 == 0) goto L6e
            androidx.appcompat.graphics.drawable.a$c r6 = r4.f5019X
            int r5 = r6.F(r0, r5, r1)
            return r5
        L6e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.a.E(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r10.getName().equals("animated-vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r4 = androidx.vectordrawable.graphics.drawable.c.f(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r4 = f.C2050a.c.a(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.a.f5016f0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r1 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r3 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        return r7.f5019X.G(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.a.f5017g0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.a.f5016f0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r4 != 4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int F(@androidx.annotation.N android.content.Context r8, @androidx.annotation.N android.content.res.Resources r9, @androidx.annotation.N org.xmlpull.v1.XmlPullParser r10, @androidx.annotation.N android.util.AttributeSet r11, @androidx.annotation.P android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            int[] r0 = f.b.C0442b.f50220k
            android.content.res.TypedArray r0 = androidx.core.content.res.n.s(r9, r12, r11, r0)
            int r1 = f.b.C0442b.f50223n
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = f.b.C0442b.f50222m
            int r3 = r0.getResourceId(r3, r2)
            int r4 = f.b.C0442b.f50221l
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.V r5 = androidx.appcompat.widget.V.h()
            android.graphics.drawable.Drawable r4 = r5.j(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = f.b.C0442b.f50224o
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L6d
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L54
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            androidx.vectordrawable.graphics.drawable.c r4 = androidx.vectordrawable.graphics.drawable.c.f(r8, r9, r10, r11, r12)
            goto L6d
        L4f:
            android.graphics.drawable.Drawable r4 = f.C2050a.c.a(r9, r10, r11, r12)
            goto L6d
        L54:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6d:
            if (r4 == 0) goto L95
            if (r1 == r2) goto L7a
            if (r3 == r2) goto L7a
            androidx.appcompat.graphics.drawable.a$c r8 = r7.f5019X
            int r8 = r8.G(r1, r3, r4, r5)
            return r8
        L7a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L95:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.a.F(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    private boolean G(int i4) {
        int d4;
        int K3;
        g bVar;
        g gVar = this.f5020Y;
        if (gVar != null) {
            if (i4 == this.f5021Z) {
                return true;
            }
            if (i4 == this.f5022a0 && gVar.a()) {
                gVar.b();
                this.f5021Z = this.f5022a0;
                this.f5022a0 = i4;
                return true;
            }
            d4 = this.f5021Z;
            gVar.d();
        } else {
            d4 = d();
        }
        this.f5020Y = null;
        this.f5022a0 = -1;
        this.f5021Z = -1;
        c cVar = this.f5019X;
        int I3 = cVar.I(d4);
        int I4 = cVar.I(i4);
        if (I4 == 0 || I3 == 0 || (K3 = cVar.K(I3, I4)) < 0) {
            return false;
        }
        boolean M3 = cVar.M(I3, I4);
        h(K3);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I3, I4), M3);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.c) {
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.f5020Y = bVar;
        this.f5022a0 = d4;
        this.f5021Z = i4;
        return true;
    }

    private void w(@N Context context, @N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals(f5015e0)) {
                            E(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals(f5014d0)) {
                            F(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.f5019X;
        cVar.f5064d |= C2050a.c.b(typedArray);
        cVar.B(typedArray.getBoolean(b.C0442b.f50213d, cVar.f5069i));
        cVar.x(typedArray.getBoolean(b.C0442b.f50214e, cVar.f5072l));
        cVar.y(typedArray.getInt(b.C0442b.f50215f, cVar.f5052A));
        cVar.z(typedArray.getInt(b.C0442b.f50216g, cVar.f5053B));
        setDither(typedArray.getBoolean(b.C0442b.f50211b, cVar.f5084x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.e
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o() {
        return new c(this.f5019X, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    void b() {
        super.b();
        this.f5023b0 = false;
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    void i(@N b.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.f5019X = (c) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f5020Y;
        if (gVar != null) {
            gVar.d();
            this.f5020Y = null;
            h(this.f5021Z);
            this.f5021Z = -1;
            this.f5022a0 = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @N
    public Drawable mutate() {
        if (!this.f5023b0 && super.mutate() == this) {
            this.f5019X.v();
            this.f5023b0 = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(@N int[] iArr) {
        boolean z3;
        int J3 = this.f5019X.J(iArr);
        if (J3 != d() && (G(J3) || h(J3))) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z3 | current.setState(iArr);
        }
        return z3;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        g gVar = this.f5020Y;
        if (gVar != null && (visible || z4)) {
            if (z3) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.e
    public void v(@N Context context, @N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s4 = n.s(resources, theme, attributeSet, b.C0442b.f50210a);
        setVisible(s4.getBoolean(b.C0442b.f50212c, true), true);
        x(s4);
        m(resources);
        s4.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@N int[] iArr, @N Drawable drawable, int i4) {
        p.d(drawable);
        this.f5019X.F(iArr, drawable, i4);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i4, int i5, @N T t3, boolean z3) {
        p.d(t3);
        this.f5019X.G(i4, i5, t3, z3);
    }

    a(@P c cVar, @P Resources resources) {
        super(null);
        this.f5021Z = -1;
        this.f5022a0 = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
