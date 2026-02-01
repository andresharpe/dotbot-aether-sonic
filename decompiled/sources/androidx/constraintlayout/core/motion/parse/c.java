package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.f;
import androidx.constraintlayout.core.parser.g;

/* loaded from: classes.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        int get(int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        int a(String str);
    }

    public static void a(String[] strArr) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static u b(String str, b bVar, a aVar) {
        u uVar = new u();
        try {
            f d4 = g.d(str);
            int size = d4.size();
            for (int i4 = 0; i4 < size; i4++) {
                d dVar = (d) d4.z(i4);
                String c4 = dVar.c();
                androidx.constraintlayout.core.parser.c e02 = dVar.e0();
                int a4 = bVar.a(c4);
                if (a4 == -1) {
                    System.err.println("unknown type " + c4);
                } else {
                    int i5 = aVar.get(a4);
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 4) {
                                if (i5 == 8) {
                                    uVar.c(a4, e02.c());
                                    System.out.println("parse " + c4 + " STRING_MASK > " + e02.c());
                                }
                            } else {
                                uVar.a(a4, e02.j());
                                System.out.println("parse " + c4 + " FLOAT_MASK > " + e02.j());
                            }
                        } else {
                            uVar.b(a4, e02.k());
                            System.out.println("parse " + c4 + " INT_MASK > " + e02.k());
                        }
                    } else {
                        uVar.d(a4, d4.E(i4));
                    }
                }
            }
        } catch (CLParsingException e4) {
            e4.printStackTrace();
        }
        return uVar;
    }

    public static u c(String str) {
        return b(str, new b() { // from class: androidx.constraintlayout.core.motion.parse.a
            @Override // androidx.constraintlayout.core.motion.parse.c.b
            public final int a(String str2) {
                return v.a.a(str2);
            }
        }, new a() { // from class: androidx.constraintlayout.core.motion.parse.b
            @Override // androidx.constraintlayout.core.motion.parse.c.a
            public final int get(int i4) {
                return v.a.getType(i4);
            }
        });
    }
}
