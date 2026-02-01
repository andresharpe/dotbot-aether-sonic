package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    static final HashMap<Pair<Integer, Integer>, String> f8521g;

    /* renamed from: h, reason: collision with root package name */
    static final HashMap<String, String> f8522h;

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f8523i = false;

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f8524j = false;

    /* renamed from: k, reason: collision with root package name */
    private static final String f8525k = "DesignTool";

    /* renamed from: a, reason: collision with root package name */
    private final s f8526a;

    /* renamed from: b, reason: collision with root package name */
    private u f8527b;

    /* renamed from: c, reason: collision with root package name */
    private String f8528c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f8529d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f8530e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f8531f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f8521g = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f8522h = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public d(s sVar) {
        this.f8526a = sVar;
    }

    private static void a(int i4, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i5, int i6) {
        int i7;
        String str = f8521g.get(Pair.create(Integer.valueOf(i5), Integer.valueOf(i6)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            String str3 = f8522h.get(str);
            if (str3 != null) {
                i7 = q(i4, hashMap.get(str3));
            } else {
                i7 = 0;
            }
            int i8 = i7;
            dVar.L(view.getId(), i5, Integer.parseInt(str2), i6, i8);
        }
    }

    private static int q(int i4, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, indexOf)).intValue() * i4) / 160.0f);
    }

    private static void v(int i4, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            dVar.Z0(view.getId(), q(i4, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            dVar.a1(view.getId(), q(i4, str2));
        }
    }

    private static void x(androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i4) {
        String str;
        if (i4 == 1) {
            str = "layout_constraintVertical_bias";
        } else {
            str = "layout_constraintHorizontal_bias";
        }
        String str2 = hashMap.get(str);
        if (str2 != null) {
            if (i4 == 0) {
                dVar.i1(view.getId(), Float.parseFloat(str2));
            } else if (i4 == 1) {
                dVar.F1(view.getId(), Float.parseFloat(str2));
            }
        }
    }

    private static void y(int i4, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i5) {
        String str;
        int i6;
        if (i5 == 1) {
            str = "layout_height";
        } else {
            str = "layout_width";
        }
        String str2 = hashMap.get(str);
        if (str2 != null) {
            if (!str2.equalsIgnoreCase("wrap_content")) {
                i6 = q(i4, str2);
            } else {
                i6 = -2;
            }
            if (i5 == 0) {
                dVar.W(view.getId(), i6);
            } else {
                dVar.P(view.getId(), i6);
            }
        }
    }

    public boolean A(Object obj, int i4, int i5, float f4, float f5) {
        if (!(obj instanceof View)) {
            return false;
        }
        s sVar = this.f8526a;
        if (sVar.f8986p0 != null) {
            o oVar = sVar.f9006z0.get(obj);
            s sVar2 = this.f8526a;
            int i6 = (int) (sVar2.f8933C0 * 100.0f);
            if (oVar != null) {
                View view = (View) obj;
                if (sVar2.f8986p0.T(view, i6)) {
                    float y3 = oVar.y(2, f4, f5);
                    float y4 = oVar.y(5, f4, f5);
                    this.f8526a.f8986p0.m0(view, i6, "motion:percentX", Float.valueOf(y3));
                    this.f8526a.f8986p0.m0(view, i6, "motion:percentY", Float.valueOf(y4));
                    this.f8526a.W0();
                    this.f8526a.x0(true);
                    this.f8526a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void B(Object obj, String str, Object obj2) {
        if (obj instanceof f) {
            ((f) obj).j(str, obj2);
            this.f8526a.W0();
            this.f8526a.f8943H0 = true;
        }
    }

    public void C(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f8528c == str) {
            return;
        }
        this.f8528c = str;
        this.f8529d = null;
        s sVar = this.f8526a;
        if (sVar.f8986p0 == null) {
            sVar.f8986p0 = this.f8527b;
        }
        int R02 = sVar.R0(str);
        this.f8530e = R02;
        if (R02 != 0) {
            if (R02 == this.f8526a.getStartState()) {
                this.f8526a.setProgress(0.0f);
            } else if (R02 == this.f8526a.getEndState()) {
                this.f8526a.setProgress(1.0f);
            } else {
                this.f8526a.j1(R02);
                this.f8526a.setProgress(1.0f);
            }
        }
        this.f8526a.requestLayout();
    }

    public void D(float f4) {
        s sVar = this.f8526a;
        if (sVar.f8986p0 == null) {
            sVar.f8986p0 = this.f8527b;
        }
        sVar.setProgress(f4);
        this.f8526a.x0(true);
        this.f8526a.requestLayout();
        this.f8526a.invalidate();
    }

    public void E(String str, String str2) {
        s sVar = this.f8526a;
        if (sVar.f8986p0 == null) {
            sVar.f8986p0 = this.f8527b;
        }
        int R02 = sVar.R0(str);
        int R03 = this.f8526a.R0(str2);
        this.f8526a.b1(R02, R03);
        this.f8530e = R02;
        this.f8531f = R03;
        this.f8528c = str;
        this.f8529d = str2;
    }

    public void F(Object obj, int i4) {
        o oVar;
        if ((obj instanceof View) && (oVar = this.f8526a.f9006z0.get(obj)) != null) {
            oVar.S(i4);
            this.f8526a.invalidate();
        }
    }

    public int b(int i4, String str, Object obj, float[] fArr, int i5, float[] fArr2, int i6) {
        o oVar;
        View view = (View) obj;
        if (i4 != 0) {
            s sVar = this.f8526a;
            if (sVar.f8986p0 == null || view == null || (oVar = sVar.f9006z0.get(view)) == null) {
                return -1;
            }
        } else {
            oVar = null;
        }
        if (i4 == 0) {
            return 1;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return -1;
                }
                this.f8526a.f8986p0.t();
                return oVar.l(str, fArr2, i6);
            }
            int t3 = this.f8526a.f8986p0.t() / 16;
            oVar.e(fArr2, null);
            return t3;
        }
        int t4 = this.f8526a.f8986p0.t() / 16;
        oVar.f(fArr2, t4);
        return t4;
    }

    public void c(boolean z3) {
        this.f8526a.t0(z3);
    }

    public void d(String str) {
        s sVar = this.f8526a;
        if (sVar.f8986p0 == null) {
            sVar.f8986p0 = this.f8527b;
        }
        int R02 = sVar.R0(str);
        System.out.println(" dumping  " + str + " (" + R02 + ")");
        try {
            this.f8526a.f8986p0.o(R02).g0(this.f8526a.f8986p0, new int[0]);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public int e(Object obj, float[] fArr) {
        u uVar = this.f8526a.f8986p0;
        if (uVar == null) {
            return -1;
        }
        int t3 = uVar.t() / 16;
        o oVar = this.f8526a.f9006z0.get(obj);
        if (oVar == null) {
            return 0;
        }
        oVar.e(fArr, null);
        return t3;
    }

    public int f(Object obj, float[] fArr, int i4) {
        s sVar = this.f8526a;
        if (sVar.f8986p0 == null) {
            return -1;
        }
        o oVar = sVar.f9006z0.get(obj);
        if (oVar == null) {
            return 0;
        }
        oVar.f(fArr, i4);
        return i4;
    }

    public void g(Object obj, float[] fArr) {
        u uVar = this.f8526a.f8986p0;
        if (uVar == null) {
            return;
        }
        int t3 = uVar.t() / 16;
        o oVar = this.f8526a.f9006z0.get(obj);
        if (oVar == null) {
            return;
        }
        oVar.h(fArr, t3);
    }

    public String h() {
        int endState = this.f8526a.getEndState();
        if (this.f8531f == endState) {
            return this.f8529d;
        }
        String F02 = this.f8526a.F0(endState);
        if (F02 != null) {
            this.f8529d = F02;
            this.f8531f = endState;
        }
        return F02;
    }

    public int i(Object obj, int i4, int[] iArr) {
        o oVar = this.f8526a.f9006z0.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.x(i4, iArr);
    }

    public float j(Object obj, int i4, float f4, float f5) {
        o oVar;
        if (!(obj instanceof View) || (oVar = this.f8526a.f9006z0.get((View) obj)) == null) {
            return 0.0f;
        }
        return oVar.y(i4, f4, f5);
    }

    public int k(Object obj, int[] iArr, float[] fArr) {
        o oVar = this.f8526a.f9006z0.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.z(iArr, fArr);
    }

    public Object l(int i4, int i5, int i6) {
        s sVar = this.f8526a;
        u uVar = sVar.f8986p0;
        if (uVar == null) {
            return null;
        }
        return uVar.y(sVar.getContext(), i4, i5, i6);
    }

    public Object m(Object obj, int i4, int i5) {
        if (this.f8526a.f8986p0 == null) {
            return null;
        }
        int id = ((View) obj).getId();
        s sVar = this.f8526a;
        return sVar.f8986p0.y(sVar.getContext(), i4, id, i5);
    }

    public Object n(Object obj, float f4, float f5) {
        o oVar;
        View view = (View) obj;
        s sVar = this.f8526a;
        if (sVar.f8986p0 == null) {
            return -1;
        }
        if (view == null || (oVar = sVar.f9006z0.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return oVar.B(viewGroup.getWidth(), viewGroup.getHeight(), f4, f5);
    }

    public Boolean o(Object obj, Object obj2, float f4, float f5, String[] strArr, float[] fArr) {
        if (obj instanceof k) {
            View view = (View) obj2;
            this.f8526a.f9006z0.get(view).N(view, (k) obj, f4, f5, strArr, fArr);
            this.f8526a.W0();
            this.f8526a.f8943H0 = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public float p() {
        return this.f8526a.getProgress();
    }

    public String r() {
        int startState = this.f8526a.getStartState();
        if (this.f8530e == startState) {
            return this.f8528c;
        }
        String F02 = this.f8526a.F0(startState);
        if (F02 != null) {
            this.f8528c = F02;
            this.f8530e = startState;
        }
        return this.f8526a.F0(startState);
    }

    public String s() {
        if (this.f8528c != null && this.f8529d != null) {
            float p4 = p();
            if (p4 <= 0.01f) {
                return this.f8528c;
            }
            if (p4 >= 0.99f) {
                return this.f8529d;
            }
        }
        return this.f8528c;
    }

    public long t() {
        return this.f8526a.getTransitionTimeMs();
    }

    public boolean u() {
        if (this.f8528c != null && this.f8529d != null) {
            return true;
        }
        return false;
    }

    public void w(int i4, String str, Object obj, Object obj2) {
        HashMap hashMap;
        View view = (View) obj;
        if (obj2 instanceof HashMap) {
            hashMap = (HashMap) obj2;
        } else {
            hashMap = new HashMap();
        }
        int R02 = this.f8526a.R0(str);
        androidx.constraintlayout.widget.d o4 = this.f8526a.f8986p0.o(R02);
        if (o4 == null) {
            return;
        }
        o4.E(view.getId());
        y(i4, o4, view, hashMap, 0);
        y(i4, o4, view, hashMap, 1);
        HashMap hashMap2 = hashMap;
        a(i4, o4, view, hashMap2, 6, 6);
        a(i4, o4, view, hashMap2, 6, 7);
        a(i4, o4, view, hashMap2, 7, 7);
        a(i4, o4, view, hashMap2, 7, 6);
        a(i4, o4, view, hashMap2, 1, 1);
        a(i4, o4, view, hashMap2, 1, 2);
        a(i4, o4, view, hashMap2, 2, 2);
        a(i4, o4, view, hashMap2, 2, 1);
        a(i4, o4, view, hashMap2, 3, 3);
        a(i4, o4, view, hashMap2, 3, 4);
        a(i4, o4, view, hashMap2, 4, 3);
        a(i4, o4, view, hashMap2, 4, 4);
        a(i4, o4, view, hashMap2, 5, 5);
        x(o4, view, hashMap, 0);
        x(o4, view, hashMap, 1);
        v(i4, o4, view, hashMap);
        this.f8526a.o1(R02, o4);
        this.f8526a.requestLayout();
    }

    public void z(Object obj, int i4, String str, Object obj2) {
        u uVar = this.f8526a.f8986p0;
        if (uVar != null) {
            uVar.m0((View) obj, i4, str, obj2);
            s sVar = this.f8526a;
            sVar.f8939F0 = i4 / 100.0f;
            sVar.f8935D0 = 0.0f;
            sVar.W0();
            this.f8526a.x0(true);
        }
    }
}
