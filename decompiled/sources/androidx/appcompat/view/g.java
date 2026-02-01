package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.I;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.g0;
import androidx.core.view.AbstractC0795b;
import androidx.core.view.N;
import d.C2042a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.InterfaceMenuC2377a;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final String f5132e = "SupportMenuInflater";

    /* renamed from: f, reason: collision with root package name */
    private static final String f5133f = "menu";

    /* renamed from: g, reason: collision with root package name */
    private static final String f5134g = "group";

    /* renamed from: h, reason: collision with root package name */
    private static final String f5135h = "item";

    /* renamed from: i, reason: collision with root package name */
    static final int f5136i = 0;

    /* renamed from: j, reason: collision with root package name */
    static final Class<?>[] f5137j;

    /* renamed from: k, reason: collision with root package name */
    static final Class<?>[] f5138k;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f5139a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f5140b;

    /* renamed from: c, reason: collision with root package name */
    Context f5141c;

    /* renamed from: d, reason: collision with root package name */
    private Object f5142d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: G, reason: collision with root package name */
        private static final Class<?>[] f5143G = {MenuItem.class};

        /* renamed from: E, reason: collision with root package name */
        private Object f5144E;

        /* renamed from: F, reason: collision with root package name */
        private Method f5145F;

        public a(Object obj, String str) {
            this.f5144E = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f5145F = cls.getMethod(str, f5143G);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f5145F.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f5145F.invoke(this.f5144E, menuItem)).booleanValue();
                }
                this.f5145F.invoke(this.f5144E, menuItem);
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: G, reason: collision with root package name */
        private static final int f5146G = 0;

        /* renamed from: H, reason: collision with root package name */
        private static final int f5147H = 0;

        /* renamed from: I, reason: collision with root package name */
        private static final int f5148I = 0;

        /* renamed from: J, reason: collision with root package name */
        private static final int f5149J = 0;

        /* renamed from: K, reason: collision with root package name */
        private static final int f5150K = 0;

        /* renamed from: L, reason: collision with root package name */
        private static final boolean f5151L = false;

        /* renamed from: M, reason: collision with root package name */
        private static final boolean f5152M = true;

        /* renamed from: N, reason: collision with root package name */
        private static final boolean f5153N = true;

        /* renamed from: A, reason: collision with root package name */
        AbstractC0795b f5154A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f5155B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f5156C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f5157D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f5158E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f5160a;

        /* renamed from: b, reason: collision with root package name */
        private int f5161b;

        /* renamed from: c, reason: collision with root package name */
        private int f5162c;

        /* renamed from: d, reason: collision with root package name */
        private int f5163d;

        /* renamed from: e, reason: collision with root package name */
        private int f5164e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5165f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5166g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f5167h;

        /* renamed from: i, reason: collision with root package name */
        private int f5168i;

        /* renamed from: j, reason: collision with root package name */
        private int f5169j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f5170k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f5171l;

        /* renamed from: m, reason: collision with root package name */
        private int f5172m;

        /* renamed from: n, reason: collision with root package name */
        private char f5173n;

        /* renamed from: o, reason: collision with root package name */
        private int f5174o;

        /* renamed from: p, reason: collision with root package name */
        private char f5175p;

        /* renamed from: q, reason: collision with root package name */
        private int f5176q;

        /* renamed from: r, reason: collision with root package name */
        private int f5177r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f5178s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f5179t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f5180u;

        /* renamed from: v, reason: collision with root package name */
        private int f5181v;

        /* renamed from: w, reason: collision with root package name */
        private int f5182w;

        /* renamed from: x, reason: collision with root package name */
        private String f5183x;

        /* renamed from: y, reason: collision with root package name */
        private String f5184y;

        /* renamed from: z, reason: collision with root package name */
        private String f5185z;

        public b(Menu menu) {
            this.f5160a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f5141c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w(g.f5132e, "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z3;
            MenuItem enabled = menuItem.setChecked(this.f5178s).setVisible(this.f5179t).setEnabled(this.f5180u);
            boolean z4 = false;
            if (this.f5177r >= 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            enabled.setCheckable(z3).setTitleCondensed(this.f5171l).setIcon(this.f5172m);
            int i4 = this.f5181v;
            if (i4 >= 0) {
                menuItem.setShowAsAction(i4);
            }
            if (this.f5185z != null) {
                if (!g.this.f5141c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f5185z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f5177r >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).w(true);
                } else if (menuItem instanceof k) {
                    ((k) menuItem).j(true);
                }
            }
            String str = this.f5183x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f5137j, g.this.f5139a));
                z4 = true;
            }
            int i5 = this.f5182w;
            if (i5 > 0) {
                if (!z4) {
                    menuItem.setActionView(i5);
                } else {
                    Log.w(g.f5132e, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0795b abstractC0795b = this.f5154A;
            if (abstractC0795b != null) {
                N.l(menuItem, abstractC0795b);
            }
            N.p(menuItem, this.f5155B);
            N.w(menuItem, this.f5156C);
            N.o(menuItem, this.f5173n, this.f5174o);
            N.s(menuItem, this.f5175p, this.f5176q);
            PorterDuff.Mode mode = this.f5158E;
            if (mode != null) {
                N.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.f5157D;
            if (colorStateList != null) {
                N.q(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f5167h = true;
            i(this.f5160a.add(this.f5161b, this.f5168i, this.f5169j, this.f5170k));
        }

        public SubMenu b() {
            this.f5167h = true;
            SubMenu addSubMenu = this.f5160a.addSubMenu(this.f5161b, this.f5168i, this.f5169j, this.f5170k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f5167h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f5141c.obtainStyledAttributes(attributeSet, C2042a.m.d4);
            this.f5161b = obtainStyledAttributes.getResourceId(C2042a.m.f4, 0);
            this.f5162c = obtainStyledAttributes.getInt(C2042a.m.h4, 0);
            this.f5163d = obtainStyledAttributes.getInt(C2042a.m.i4, 0);
            this.f5164e = obtainStyledAttributes.getInt(C2042a.m.j4, 0);
            this.f5165f = obtainStyledAttributes.getBoolean(C2042a.m.g4, true);
            this.f5166g = obtainStyledAttributes.getBoolean(C2042a.m.e4, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            boolean z3;
            g0 F3 = g0.F(g.this.f5141c, attributeSet, C2042a.m.k4);
            this.f5168i = F3.u(C2042a.m.n4, 0);
            this.f5169j = (F3.o(C2042a.m.q4, this.f5162c) & InterfaceMenuC2377a.f55290c) | (F3.o(C2042a.m.r4, this.f5163d) & 65535);
            this.f5170k = F3.x(C2042a.m.s4);
            this.f5171l = F3.x(C2042a.m.t4);
            this.f5172m = F3.u(C2042a.m.l4, 0);
            this.f5173n = c(F3.w(C2042a.m.u4));
            this.f5174o = F3.o(C2042a.m.B4, 4096);
            this.f5175p = c(F3.w(C2042a.m.v4));
            this.f5176q = F3.o(C2042a.m.F4, 4096);
            if (F3.C(C2042a.m.w4)) {
                this.f5177r = F3.a(C2042a.m.w4, false) ? 1 : 0;
            } else {
                this.f5177r = this.f5164e;
            }
            this.f5178s = F3.a(C2042a.m.o4, false);
            this.f5179t = F3.a(C2042a.m.p4, this.f5165f);
            this.f5180u = F3.a(C2042a.m.m4, this.f5166g);
            this.f5181v = F3.o(C2042a.m.G4, -1);
            this.f5185z = F3.w(C2042a.m.x4);
            this.f5182w = F3.u(C2042a.m.y4, 0);
            this.f5183x = F3.w(C2042a.m.A4);
            String w3 = F3.w(C2042a.m.z4);
            this.f5184y = w3;
            if (w3 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.f5182w == 0 && this.f5183x == null) {
                this.f5154A = (AbstractC0795b) e(w3, g.f5138k, g.this.f5140b);
            } else {
                if (z3) {
                    Log.w(g.f5132e, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f5154A = null;
            }
            this.f5155B = F3.x(C2042a.m.C4);
            this.f5156C = F3.x(C2042a.m.H4);
            if (F3.C(C2042a.m.E4)) {
                this.f5158E = L.e(F3.o(C2042a.m.E4, -1), this.f5158E);
            } else {
                this.f5158E = null;
            }
            if (F3.C(C2042a.m.D4)) {
                this.f5157D = F3.d(C2042a.m.D4);
            } else {
                this.f5157D = null;
            }
            F3.I();
            this.f5167h = false;
        }

        public void h() {
            this.f5161b = 0;
            this.f5162c = 0;
            this.f5163d = 0;
            this.f5164e = 0;
            this.f5165f = true;
            this.f5166g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f5137j = clsArr;
        f5138k = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f5141c = context;
        Object[] objArr = {context};
        this.f5139a = objArr;
        this.f5140b = objArr;
    }

    private Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals(androidx.appcompat.view.g.f5135h) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f5154A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.b() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals(androidx.appcompat.view.g.f5133f) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals(androidx.appcompat.view.g.f5135h) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals(androidx.appcompat.view.g.f5133f) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            androidx.appcompat.view.g$b r0 = new androidx.appcompat.view.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.f5154A
            if (r15 == 0) goto L82
            boolean r15 = r15.b()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f5142d == null) {
            this.f5142d = a(this.f5141c);
        }
        return this.f5142d;
    }

    @Override // android.view.MenuInflater
    public void inflate(@I int i4, Menu menu) {
        if (!(menu instanceof InterfaceMenuC2377a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f5141c.getResources().getLayout(i4);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
