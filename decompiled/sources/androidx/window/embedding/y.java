package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.jvm.internal.F;
import kotlin.text.A;
import l0.C2353a;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class y {
    private final ComponentName a(String str, CharSequence charSequence) {
        int o32;
        int o33;
        if (charSequence != null && charSequence.length() != 0) {
            String obj = charSequence.toString();
            if (obj.charAt(0) != '.') {
                o32 = A.o3(obj, '/', 0, false, 6, null);
                if (o32 > 0) {
                    str = obj.substring(0, o32);
                    F.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    obj = obj.substring(o32 + 1);
                    F.o(obj, "this as java.lang.String).substring(startIndex)");
                }
                if (!F.g(obj, "*")) {
                    o33 = A.o3(obj, '.', 0, false, 6, null);
                    if (o33 < 0) {
                        return new ComponentName(str, str + '.' + obj);
                    }
                }
                return new ComponentName(str, obj);
            }
            return new ComponentName(str, F.C(str, obj));
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final a b(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C2353a.c.f54813a, 0, 0);
        String string = obtainStyledAttributes.getString(C2353a.c.f54815c);
        String string2 = obtainStyledAttributes.getString(C2353a.c.f54814b);
        String packageName = context.getApplicationContext().getPackageName();
        F.o(packageName, "packageName");
        return new a(a(packageName, string), string2);
    }

    private final b c(Context context, XmlResourceParser xmlResourceParser) {
        Set k4;
        boolean z3 = context.getTheme().obtainStyledAttributes(xmlResourceParser, C2353a.c.f54816d, 0, 0).getBoolean(C2353a.c.f54817e, false);
        k4 = j0.k();
        return new b(k4, z3);
    }

    private final u d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C2353a.c.f54818f, 0, 0);
        String string = obtainStyledAttributes.getString(C2353a.c.f54819g);
        String string2 = obtainStyledAttributes.getString(C2353a.c.f54821i);
        String string3 = obtainStyledAttributes.getString(C2353a.c.f54820h);
        String packageName = context.getApplicationContext().getPackageName();
        F.o(packageName, "packageName");
        return new u(a(packageName, string), a(packageName, string2), string3);
    }

    private final v e(Context context, XmlResourceParser xmlResourceParser) {
        Set k4;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C2353a.c.f54822j, 0, 0);
        float f4 = obtainStyledAttributes.getFloat(C2353a.c.f54829q, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C2353a.c.f54828p, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C2353a.c.f54827o, 0.0f);
        int i4 = obtainStyledAttributes.getInt(C2353a.c.f54826n, 3);
        boolean z3 = obtainStyledAttributes.getBoolean(C2353a.c.f54824l, false);
        boolean z4 = obtainStyledAttributes.getBoolean(C2353a.c.f54825m, true);
        boolean z5 = obtainStyledAttributes.getBoolean(C2353a.c.f54823k, false);
        k4 = j0.k();
        return new v(k4, z3, z4, z5, dimension, dimension2, f4, i4);
    }

    private final w f(Context context, XmlResourceParser xmlResourceParser) {
        Set k4;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C2353a.c.f54830r, 0, 0);
        String string = obtainStyledAttributes.getString(C2353a.c.f54831s);
        float f4 = obtainStyledAttributes.getFloat(C2353a.c.f54835w, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C2353a.c.f54834v, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C2353a.c.f54833u, 0.0f);
        int i4 = obtainStyledAttributes.getInt(C2353a.c.f54832t, 3);
        String packageName = context.getApplicationContext().getPackageName();
        F.o(packageName, "packageName");
        ComponentName a4 = a(packageName, string);
        k4 = j0.k();
        Intent component = new Intent().setComponent(a4);
        F.o(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new w(k4, component, dimension, dimension2, f4, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0049. Please report as an issue. */
    private final Set<m> h(Context context, int i4) {
        w h4;
        b c4;
        v e4;
        try {
            XmlResourceParser xml = context.getResources().getXml(i4);
            F.o(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            b bVar = null;
            v vVar = null;
            w wVar = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() == 2 && !F.g("split-config", xml.getName())) {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (bVar == null && wVar == null) {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                    a b4 = b(context, xml);
                                    if (bVar != null) {
                                        hashSet.remove(bVar);
                                        c4 = bVar.c(b4);
                                        hashSet.add(c4);
                                        bVar = c4;
                                        break;
                                    } else if (wVar != null) {
                                        hashSet.remove(wVar);
                                        h4 = wVar.h(b4);
                                        hashSet.add(h4);
                                        wVar = h4;
                                        break;
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    e4 = e(context, xml);
                                    hashSet.add(e4);
                                    bVar = null;
                                    wVar = null;
                                    vVar = e4;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (vVar != null) {
                                        u d4 = d(context, xml);
                                        hashSet.remove(vVar);
                                        e4 = vVar.j(d4);
                                        hashSet.add(e4);
                                        vVar = e4;
                                        break;
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    c4 = c(context, xml);
                                    hashSet.add(c4);
                                    vVar = null;
                                    wVar = null;
                                    bVar = c4;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    h4 = f(context, xml);
                                    hashSet.add(h4);
                                    bVar = null;
                                    vVar = null;
                                    wVar = h4;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                } else {
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @l3.e
    public final Set<m> g(@l3.d Context context, int i4) {
        F.p(context, "context");
        return h(context, i4);
    }
}
