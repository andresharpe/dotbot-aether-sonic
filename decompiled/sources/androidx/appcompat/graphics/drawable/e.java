package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.appcompat.graphics.drawable.b;
import androidx.core.content.res.n;
import f.C2050a;
import f.b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: V, reason: collision with root package name */
    private static final String f5105V = "StateListDrawableCompat";

    /* renamed from: W, reason: collision with root package name */
    private static final boolean f5106W = false;

    /* renamed from: T, reason: collision with root package name */
    private a f5107T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f5108U;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends b.d {

        /* renamed from: J, reason: collision with root package name */
        int[][] f5109J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f5109J = aVar.f5109J;
            } else {
                this.f5109J = new int[g()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int D(int[] iArr, Drawable drawable) {
            int a4 = a(drawable);
            this.f5109J[a4] = iArr;
            return a4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int E(int[] iArr) {
            int[][] iArr2 = this.f5109J;
            int i4 = i();
            for (int i5 = 0; i5 < i4; i5++) {
                if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                    return i5;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        public void r(int i4, int i5) {
            super.r(i4, i5);
            int[][] iArr = new int[i5];
            System.arraycopy(this.f5109J, 0, iArr, 0, i4);
            this.f5109J = iArr;
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        void v() {
            int[] iArr;
            int[][] iArr2 = this.f5109J;
            int[][] iArr3 = new int[iArr2.length];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.f5109J[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.f5109J = iArr3;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    public e() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r4 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r4 != 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        r4 = f.C2050a.c.a(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        r0.D(r3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            androidx.appcompat.graphics.drawable.e$a r0 = r7.f5107T
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L8:
            int r3 = r10.next()
            if (r3 == r2) goto L7a
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L17
            r5 = 3
            if (r3 == r5) goto L7a
        L17:
            r5 = 2
            if (r3 == r5) goto L1b
            goto L8
        L1b:
            if (r4 > r1) goto L8
            java.lang.String r3 = r10.getName()
            java.lang.String r4 = "item"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2a
            goto L8
        L2a:
            int[] r3 = f.b.C0442b.f50232w
            android.content.res.TypedArray r3 = androidx.core.content.res.n.s(r9, r12, r11, r3)
            int r4 = f.b.C0442b.f50233x
            r6 = -1
            int r4 = r3.getResourceId(r4, r6)
            if (r4 <= 0) goto L42
            androidx.appcompat.widget.V r6 = androidx.appcompat.widget.V.h()
            android.graphics.drawable.Drawable r4 = r6.j(r8, r4)
            goto L43
        L42:
            r4 = 0
        L43:
            r3.recycle()
            int[] r3 = r7.p(r11)
            if (r4 != 0) goto L76
        L4c:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L54
            goto L4c
        L54:
            if (r4 != r5) goto L5b
            android.graphics.drawable.Drawable r4 = f.C2050a.c.a(r9, r10, r11, r12)
            goto L76
        L5b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L76:
            r0.D(r3, r4)
            goto L8
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.e.w(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    private void x(TypedArray typedArray) {
        a aVar = this.f5107T;
        aVar.f5064d |= C2050a.c.b(typedArray);
        aVar.f5069i = typedArray.getBoolean(b.C0442b.f50228s, aVar.f5069i);
        aVar.f5072l = typedArray.getBoolean(b.C0442b.f50229t, aVar.f5072l);
        aVar.f5052A = typedArray.getInt(b.C0442b.f50230u, aVar.f5052A);
        aVar.f5053B = typedArray.getInt(b.C0442b.f50231v, aVar.f5053B);
        aVar.f5084x = typedArray.getBoolean(b.C0442b.f50226q, aVar.f5084x);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @W(21)
    public void applyTheme(@N Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    public void b() {
        super.b();
        this.f5108U = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    public void i(@N b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.f5107T = (a) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @N
    public Drawable mutate() {
        if (!this.f5108U && super.mutate() == this) {
            this.f5107T.v();
            this.f5108U = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f5107T.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    public a o() {
        return new a(this.f5107T, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean onStateChange(@N int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E3 = this.f5107T.E(iArr);
        if (E3 < 0) {
            E3 = this.f5107T.E(StateSet.WILD_CARD);
        }
        if (!h(E3) && !onStateChange) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i4 = 0;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i5);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i6 = i4 + 1;
                if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i4] = attributeNameResource;
                i4 = i6;
            }
        }
        return StateSet.trimStateSet(iArr, i4);
    }

    int q() {
        return this.f5107T.i();
    }

    Drawable r(int i4) {
        return this.f5107T.h(i4);
    }

    int s(int[] iArr) {
        return this.f5107T.E(iArr);
    }

    a t() {
        return this.f5107T;
    }

    int[] u(int i4) {
        return this.f5107T.f5109J[i4];
    }

    public void v(@N Context context, @N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s4 = n.s(resources, theme, attributeSet, b.C0442b.f50225p);
        setVisible(s4.getBoolean(b.C0442b.f50227r, true), true);
        x(s4);
        m(resources);
        s4.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    e(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(@P a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }
}
